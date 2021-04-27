<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/12/10
  Time: 11:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false"%>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form action="/meeting/testedit">

    <input type="radio" name="meetingType" value="国际会议"
           <c:if test="${fn:contains(meeting.meetingType,'国际会议')}">checked="checked"</c:if>
    >国际会议

    <input type="radio" name="meetingType" value="国内会议"
           <c:if test="${fn:contains(meeting.meetingType,'国内会议')}">checked="checked"</c:if>
    >国内会议<br>
    会议名称：<input type="text" name="meetingName" placeholder="${meeting.meetingName}"><br>
    预计开始时间：<input type="date" name="meetingEstimatedStartTime" placeholder="${meeting.meetingEstimatedStartTime}"><br>
    预计结束时间：<input type="date" name="meetingEstimatedEndTime" placeholder="${meeting.meetingEstimatedEndTime}"><br>
    正式开始时间：<input type="date" name="meetingOfficialStartTime" placeholder="${meeting.meetingOfficialStartTime}"><br>
    正式结束时间：<input type="date" name="meetingOfficialEndTime" placeholder="${meeting.meetingOfficialEndTime}"><br>
    会议地点:<input type="text" name="meetingVenue" placeholder="${meeting.meetingVenue}"><br>
    组织单位:<input type="text" name="meetingOrganizationalUnit" placeholder="${meeting.meetingOrganizationalUnit}"><br>
    支持单位:<input type="text" name="meetingSupportUnit" placeholder="${meeting.meetingSupportUnit}"><br>
    名单收集初步截止时间:<input type="date" name="meetingListCollectionPreliminaryD" placeholder="${meeting.meetingListCollectionPreliminaryD}"><br>
    名单收集中期截止时间:<input type="date" name="meetingListCollectionMetaphaseD" placeholder=${meeting.meetingListCollectionMetaphaseD}""><br>
    名单收集最终截止时间:<input type="date" name="meetingListCollectionFinalD" placeholder="${meeting.meetingListCollectionFinalD}"><br>
    名单审核截止时间:<input type="date" name="meetingListReviewD" placeholder="${meeting.meetingListReviewD}"><br>
    参会名额:<input type="number" name="meetingParticipantsQuota" placeholder="${meeting.meetingParticipantsQuota}"><br>
    陪同名额:<input type="number" name="meetingAccompanyQuota" placeholder="${meeting.meetingAccompanyQuota}"><br>
    <%--    上传会议资料<input type="text" name="meetingConferenceMaterials"><br>--%>
    备注:<input type="text" name="meetingRemarks" placeholder="${meeting.meetingRemarks}"><br>

    <input type="radio" name="meetingProductGroup" value="CV"
           <c:if test="${fn:contains(meeting.meetingProductGroup,'CV')}">checked="checked"</c:if>>CV
    <input type="radio" name="meetingProductGroup" value="DIA"
           <c:if test="${fn:contains(meeting.meetingProductGroup,'DIA')}">checked="checked"</c:if>>DIA
    <input type="radio" name="meetingProductGroup" value="社区组"
           <c:if test="${fn:contains(meeting.meetingProductGroup,'社区组')}">checked="checked"</c:if>>社区组

    <input type="submit" name="meetingId" value="${meeting.meetingId}" >

</form>
<%--<%--%>
<%--out.println("测试传参"+request.getParameter("meeting"));%>--%>



</body>
</html>
