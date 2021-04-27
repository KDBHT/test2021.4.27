package com.swfove.dao;

        import com.swfove.pojo.Meeting;
        import com.swfove.pojo.User;
        import org.apache.ibatis.annotations.Param;

        import java.util.List;
        import java.util.Map;

public interface MeetingMapper {
    Meeting getMeetingById(@Param("meetid") int id);
    List<Meeting> getallMeeting();
    int addMeeting(@Param("map") Map<String,Object> map,@Param("tablename") String tablename);
    int updateMeeting(@Param("map") Map<String,Object> map,@Param("meetingId") int id);
    int deleteMeeting(@Param("meetingid") int id);
    List<Meeting> getMeetingByProductGroup(@Param("GroupName") String GroupName);
    User getUserById(@Param("userId") int id);
}

