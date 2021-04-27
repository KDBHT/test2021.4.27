package com.swfove.Impl;

import com.swfove.dao.MeetingMapper;
import com.swfove.pojo.Meeting;
import com.swfove.pojo.User;
import com.swfove.service.MeetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public class MeetingServiceImpl implements MeetingService {
    @Autowired
    private MeetingMapper meetingMapper;
    public void setMeetingMapper(MeetingMapper meetingMapper) {
        this.meetingMapper = meetingMapper;
    }
    @Override
    public Meeting getMeetingById(int id) {
        return meetingMapper.getMeetingById(id);
    }


    @Override
    public List<Meeting> getallMeeting() {
       return meetingMapper.getallMeeting();
    }

    @Override
    public int addMeeting(Map<String, Object> map, String tablename) {
        return meetingMapper.addMeeting(map,tablename);
    }

    @Override
    public int updateMeeting(Map<String, Object> map, int id) {
        return meetingMapper.updateMeeting(map,id);
    }

    @Override
    public int deleteMeeting(int id) {
        return meetingMapper.deleteMeeting(id);
    }

    @Override
    public List<Meeting> getMeetingByProductGroup(String GroupName) {
        return meetingMapper.getMeetingByProductGroup(GroupName);
    }

    @Override
    public User getUserById(int id) {
        return meetingMapper.getUserById(id);
    }


}
