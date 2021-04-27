<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/12/9
  Time: 9:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/meeting/testadd">
    <input type="radio" name="meetingType" value="国际会议">国际会议
    <input type="radio" name="meetingType" value="国内会议">国内会议<br>
    会议名称：<input type="text" name="meetingName"><br>
    预计开始时间：<input type="date" name="meetingEstimatedStartTime"><br>
    预计结束时间：<input type="date" name="meetingEstimatedEndTime"><br>
    正式开始时间：<input type="date" name="meetingOfficialStartTime"><br>
    正式结束时间：<input type="date" name="meetingOfficialEndTime"><br>
    会议地点:<input type="text" name="meetingVenue"><br>
    组织单位:<input type="text" name="meetingOrganizationalUnit"><br>
    支持单位:<input type="text" name="meetingSupportUnit"><br>
    名单收集初步截止时间:<input type="date" name="meetingListCollectionPreliminaryD"><br>
    名单收集中期截止时间:<input type="date" name="meetingListCollectionMetaphaseD"><br>
    名单收集最终截止时间:<input type="date" name="meetingListCollectionFinalD"><br>
    名单审核截止时间:<input type="date" name="meetingListReviewD"><br>
    参会名额:<input type="number" name="meetingParticipantsQuota"><br>
    陪同名额:<input type="number" name="meetingAccompanyQuota"><br>
<%--    上传会议资料<input type="text" name="meetingConferenceMaterials"><br>--%>
    备注:<input type="text" name="meetingRemarks"><br>

    <input type="radio" name="meetingProductGroup" value="CV">CV
    <input type="radio" name="meetingProductGroup" value="DIA">DIA
    <input type="radio" name="meetingProductGroup" value="社区组">社区组
    <input type="submit">
</form>

<form action="/meeting/upload" enctype="multipart/form-data" method="post">
文件上传：<input type="file" name="file"/>
<input type="submit" value="提交"/>
</form>

<form action="/meeting/downfile" enctype="multipart/form-data" method="post">
    <input type="text" name="downFileName">
    <input type="submit" value="下载">
</form>
</body>
</html>
