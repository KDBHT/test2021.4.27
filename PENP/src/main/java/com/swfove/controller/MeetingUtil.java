package com.swfove.controller;

import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

public class MeetingUtil {
    public Map getMap(HttpServletRequest request) {
        //        获取表单中所有name的值
        Enumeration<String> valuenames = request.getParameterNames();
//        定义map用来存放name的值和value
        Map<String, Object> nameandevalue = new HashMap<String, Object>();
//        在列表里循环
        while (valuenames.hasMoreElements()) {
//            取出循环的值
            String valuename = valuenames.nextElement();
//            根据name值取相应的value并放进map中
            nameandevalue.put(valuename, request.getParameter(valuename));
        }
        return nameandevalue;
    }

}
