package com.swfove.controller;

        import com.swfove.dao.MeetingMapper;
        import com.swfove.pojo.Meeting;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.stereotype.Component;
        import org.springframework.stereotype.Controller;
        import org.springframework.web.bind.annotation.GetMapping;
        import org.springframework.web.bind.annotation.RequestMapping;
        import org.springframework.web.bind.annotation.RestController;

        import java.util.List;

@Controller
@RequestMapping("/test")
public class TestController {
    @Autowired
    private MeetingMapper meetingMapper;
    @GetMapping("/hello")
    public String hellotest(){
        System.out.println("///////////////");
        System.out.println(meetingMapper.getallMeeting());
        System.out.println("结束");
        return "hello";
    }
}
