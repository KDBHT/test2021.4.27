<html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<body>
<h2>Hello World!</h2>
<%--直接跳转--%>
<%--<a href=<jsp:forward page="/WEB-INF/view/AddMeeting.jsp"/>>000</a>--%>
<form action="/meeting/name" method="post">
    <button>
进入/Meeting/hello方法
    </button>
    <a href="/meeting/login/Gotologin">进入登录页面</a>
    <a href="/meeting/login/jumpoutlogin">测试登录session</a>

</form>
</body>
</html>
