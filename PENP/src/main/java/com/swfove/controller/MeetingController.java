package com.swfove.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.swfove.pojo.Meeting;
import com.swfove.pojo.User;
import com.swfove.service.MeetingService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.*;
import java.util.*;

@Controller
@RequestMapping("/meeting")
public class MeetingController {
    @Autowired
    private MeetingService meetingService;
    @RequestMapping("/name")
    public String test(Model model){
        /**Meeting  meeting = meetingService.getMeetingById(1);
        int id = meeting.getMeetingId();
        String name = meeting.getMeetingName();
        String type = meeting.getMeetingType();
        model.addAttribute("id",id);
        model.addAttribute("name",name);
        model.addAttribute("type",type);
        List<Meeting>  list = meetingService.getallMeeting();
        return "hello";
        **/
        List<Meeting>  list = meetingService.getallMeeting();
        model.addAttribute("list",list);

        /**Map<String,Object> map = new HashMap<String,Object>();
        map.put("meetingId",6);
        map.put("meetingType","xxx");
        map.put("meetingName","插入会议");
meetingService.addMeeting(map,"pemp_meeting");
       **/


        /**Map<String,Object> map = new HashMap<String,Object>();
        map.put("meetingId",5);
        map.put("meetingType","pupdate");
        map.put("meetingName","测试更新4会议");
        meetingService.updateMeeting(map,5);
        **/
//        meetingService.deleteMeeting(6);

//        List<Meeting> list1 = meetingService.getMeetingByProductGroup("CV");
//        model.addAttribute("list1",list1);

        return "/hello.jsp";
    }
    @RequestMapping("/meetingGroup")
    public String meetingGroup(@RequestParam("meetingGroup") String name, Model model){
//        System.out.println("收到的数据是："+name);
        List<Meeting> list1 = meetingService.getMeetingByProductGroup(name);
        model.addAttribute("list",list1);
        return "/hello.jsp";
    }
    //此注解的意思是将结果放在response的body里
//@ResponseBody
    @RequestMapping("/meetingGrouptestajax")
    public String meetingGrouptestajax(@RequestParam("meetingGroup") String name, Model model) throws JsonProcessingException {
//        System.out.println("收到的数据是："+name);
        ObjectMapper mapper = new ObjectMapper();
        List<Meeting> list1 = meetingService.getMeetingByProductGroup(name);

//        JSONArray.fromObject(list1)


        model.addAttribute("list",list1);
        return "x";
    }


    @RequestMapping("/AddMeeting")
    public String AddMeeting(Model model){
        return "/AddMeeting.jsp";
    }
@RequestMapping("/testadd")
    public String testadd(HttpServletRequest request) {
        /**
//        获取表单中所有name的值
        Enumeration<String> valuenames = request.getParameterNames();
//        定义map用来存放name的值和value
        Map<String,Object> nameandevalue = new HashMap<String,Object>();
//        在列表里循环
        while(valuenames.hasMoreElements()){
//            取出循环的值
            String valuename = valuenames.nextElement();
//            根据name值取相应的value并放进map中
            nameandevalue.put(valuename,request.getParameter(valuename));
        }**/
        MeetingUtil meetingUtil = new MeetingUtil();
        Map<String,Object> nameandevalue =  meetingUtil.getMap(request);
    meetingService.addMeeting(nameandevalue,"pemp_meeting");
    return "redirect:/meeting/name";
}


@RequestMapping("/EditMeeting")
    public String EditMeeting(@RequestParam("meeting") int meetingId, Model model,HttpServletRequest request){
    /**System.out.println("/////////");
        System.out.println(meetingId);
    System.out.println("//////////");**/
   Meeting meeting =  meetingService.getMeetingById(meetingId);
model.addAttribute("meeting",meeting);
        return "/EditMeeting.jsp";
}
@RequestMapping("/testedit")
    public String testedit(@RequestParam("meetingId")int meetingId,HttpServletRequest request){
    System.out.println(meetingId);
    System.out.println("进入更新方法");
    MeetingUtil meetingUtil = new MeetingUtil();
        Map<String,Object> meetingmap = meetingUtil.getMap(request);
        meetingService.updateMeeting(meetingmap,meetingId);

        return "redirect:/meeting/name";
    }
@RequestMapping("/upload")
    public String upload(@RequestParam("file") CommonsMultipartFile file, HttpServletRequest request, Model model) throws IOException {
        String filename = file.getOriginalFilename();
        if("".equals(filename)){
            return "null";
        }
        //获取上传路径
        String path = request.getServletContext().getRealPath("/upload");
        File realpath = new File(path);
        if (!realpath.exists()){
            realpath.mkdir();
        }
    InputStream is = file.getInputStream();
    OutputStream os = new FileOutputStream(new File(realpath,filename));
    int len = 0;
    byte[] buffer = new byte[1024];
    while ((len=is.read(buffer))!=-1){
        os.write(buffer,0,len);
        os.flush();
    }
    os.close();
    is.close();
    model.addAttribute("filename",filename);
    System.out.println(path);

        return "/testupload.jsp";

}

@RequestMapping("/downfile")
    public String downfile(@RequestParam("downFileName") String downFileName,HttpServletResponse response,HttpServletRequest request,Model model) throws IOException {
        String path = request.getServletContext().getRealPath("/upload");
        //设置响应头
        //页面不缓存，清空buffer
        response.reset();
        //设置传输字符串
        response.setCharacterEncoding("UTF-8");
        //设置二进制传输
        response.setContentType("multipart/form-data");
        response.setHeader("Content-Disposition","attachment:fileName="+ downFileName+"txt");
        File file = new File(path,downFileName);
        InputStream is = new FileInputStream(file);
        OutputStream os = response.getOutputStream();
        int i = 0;
        byte[] buffer = new byte[1024];
        while ((i=is.read(buffer))!=-1){
            os.write(buffer,0,i);
            os.flush();
        }
        os.close();
        is.close();
        model.addAttribute("filename",downFileName);
    System.out.println(downFileName);

        return "/testupload.jsp";
}
@RequestMapping("/login/Gotologin")
    public String jumplogin(HttpSession session){

        if (session.getAttribute("id")!=null){
            return "redirect:/meeting/login/jumpoutlogin";
        }
        return "/login.jsp";
}

@RequestMapping("/login/loginController")
    public String loginController(
        @RequestParam("userId")int userId,
        @RequestParam("userPassword") String userPassword, Model model,
        HttpSession session, HttpServletRequest request){
        User user =  meetingService.getUserById(userId);
        if (user!=null){
            if (user.getUerPassword().equals(userPassword)){
                    session = request.getSession();
                    session.setAttribute("name",user.getUserName());
                    session.setAttribute("pwd",user.getUerPassword());
                    session.setAttribute("id",user.getUserId());
                return "redirect:/meeting/login/jumpoutlogin";
            }
        }else {
            return "/login.jsp";
        }
    return "redirect:/meeting/login/jumpoutlogin";

    }
    @RequestMapping("/login/jumpoutlogin")
    public String testsession(){

        return "/logout.jsp";
    }
//    @ResponseBody
    @RequestMapping("/login/usersessionclose")
    public HttpSession usersessionclose(HttpSession session){
        session.invalidate();
        System.out.println("执行清除session");
        return session;
    }

}



