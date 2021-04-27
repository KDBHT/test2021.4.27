package com.swfove.Interceptor;

import com.mysql.cj.Session;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class MyInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
 if (request.getRequestURI().contains("Goto")){
     System.out.println(1+request.getRequestURI());
     return true;
 }
        System.out.println(request.getRequestURL());
 if (request.getRequestURI().contains("Controller")){
     System.out.println(2+request.getRequestURI());
     return true;
 }
 if(request.getRequestURI().contains("usersessionclose")){
     return true;
 }
 if (request.getRequestURI().contains("jumpoutlogin")){
     System.out.println(3+request.getRequestURI());
     HttpSession session = request.getSession();
     if (session.isNew()){
         System.out.println(4+request.getRequestURI());
         return true;
     }
     if (session.getAttribute("id")!=null&&session.getAttribute("pwd")!=null){
         System.out.println(5+request.getRequestURI());
         return true;
     }else{
         System.out.println(6+request.getRequestURI());
         request.getRequestDispatcher("/WEB-INF/view/login.jsp").forward(request,response);
         return false;

     }
//         System.out.println(6+request.getRequestURI());
//         request.getRequestDispatcher("/WEB-INF/view/login.jsp").forward(request,response);

 }

        System.out.println(12+request.getRequestURI());
//        System.out.println("uri中不包含jumpoutlogin");
        return false;
    }


}
