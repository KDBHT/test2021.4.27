<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page import="com.swfove.pojo.Meeting" %>
<%--
  Created by IntelliJ IDEA.
  User: Degree
  Date: 2020/12/4
  Time: 15:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false"%>
<html>
<head>
    <title>hello</title>
    <link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css"
     rel="stylesheet">
    <script src="/statics/js/jquery-3.5.1.js"></script>
    <script src="https://cdn.staticfile.org/jquery/3.1.1/jquery.min.js"></script>
    <script>
        // function Grouping() {
            var is;
            $(document).ready(function(){
                $("button").click(function(){
                     is = $(this).html();
                     // alert(is);
                    $.post({
                        url:"${pageContext.request.contextPath}/meeting/meetingGrouptestajax",
                        data:{"meetingGroup":is},
                        success:function (data){
                            console.log(data);
                            // this.html(data);
                        }
                    });
                });
            });
    <%--$.post({--%>
    <%--    url:"${pageContext.request.contextPath}/meeting/meetingGroup",--%>
    <%--    data:{"meetingGroup":is},--%>
    <%--    success:function (data){--%>
    <%--        console.log(data);--%>
    <%--        }--%>
    <%--});--%>
    //     }


        // function testmeeting() {
        //     $(document).ready(function(){
        //         $("button").click(function(){
        //             console.log($(this).html());
        //         });
        //     });
        // }

    </script>
</head>
<body>
<div class="container">

    <div class="row clearfix">
        <div class="col-md-12 colum">
            <div class="page-header">
                <h1>
                    <small>??????????????????</small>
                </h1>
            </div>
        </div>
    </div>

    <div class="row clearfix">
        <div class="col-md-12 colum">
            <table class="table table-hover table-striped">
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>????????????</th>
                        <th>????????????</th>
                        <th>?????????</th>
                    </tr>
                </thead>

<%--                <button type="button" onclick="testmeeting()">testmeeting</button>--%>
<%--                <input type="button" onclick="testmeeting()" name="testmeeting" value="test2">--%>

                <form action="/meeting/name" method="get">
                    <input type="submit" value="??????">
                </form>
                <form action="/meeting/meetingGroup" method="post">
                    <input type="submit" value="CV" name="meetingGroup">
                    <input type="submit" value="DIA" name="meetingGroup">
                    <input type="submit" value="?????????" name="meetingGroup">
                </form>
<%--                <button type="button" >CV</button>--%>
<%--                <button type="button" >DIA</button>--%>
<%--                <button type="button" >?????????</button>--%>

               <form action="/meeting/AddMeeting" method="post">
                   <input type="submit" value="+??????">
               </form>


                <tbody>
<%--?????????????????????????????????????????????????????????????????????????????????????????????????????????????????????--%>

<%--<h3>${list}</h3>--%>
                    <c:forEach var= "meeting" items="${list}">
        <form action="/meeting/EditMeeting" method="post">
                        <tr>
                            <td>${meeting.meetingId}</td>
                            <td>${meeting.meetingType}</td>
                            <td>${meeting.meetingName}</td>
                            <td>${meeting.meetingProductGroup}</td>
                            <td>
                                <input type="hidden" name="meeting" value=${meeting.meetingId}>
<%--                                <%--%>
<%--                                request.setAttribute("meeting","??????meeting");%>--%>
<%--    <jsp:forward page="/meeting/EditMeeting"></jsp:forward>--%>
                                <input type="submit" value="??????">
                            </td>
                        </tr>
        </form>
                    </c:forEach>

                </tbody>
            </table>
        </div>
    </div>

</div>




<%--<h3><%=request.getAttribute("list")%></h3>--%>



</body>
</html>
