package com.swfove.service;

import com.swfove.pojo.Meeting;
import com.swfove.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface MeetingService {
    Meeting getMeetingById(int id);
    List<Meeting> getallMeeting();
    int addMeeting(Map<String,Object> map,String tablename);
    int updateMeeting(Map<String,Object> map,int id);
    int deleteMeeting(int id);
    List<Meeting> getMeetingByProductGroup(String GroupName);
    User getUserById(int id);
}
