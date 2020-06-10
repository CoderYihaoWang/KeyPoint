<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: kalvinwei
  Date: 9/06/20
  Time: 16:43
  To change this template use File | Settings | File Templates.

    --from indexPage
  user(nickname,avatar)                                     [for navbar]
  # => userProfileSummary
  # => isUserLoggedIn (boolean)
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>navbar</title>
</head>
<body>
<!-- left: LOGO-->
<h1 id="home"><a href="index.jsp">KeyPoint</a></h1>

<!-- right: nav -->
<div id="navElements">
    <!--basic: show avatar and nickname -->
    <div id="avatarAndName">
        <c:if test="${sessionScope.isUserLoggedIn}">
            <span><a>Sign In</a> / <a>Sign Up</a></span>
            <img src="./images/guest.png">
        </c:if>
        <c:if test="${sessionScope.isUserLoggedIn}">
            <span><a href="/articlesPage?user=${userProfileSummary.userName}">${userProfileSummary.nickname}</a></span>
            <img src="./images/${userProfileSummary.avatar}.png" onclick="//toggleNavList()">
        </c:if>
    </div>

    <!--if signed-in, click avatar, show navlist -->
    <div id="navList">
        <ul>
            <li><a href="/allArticles">My Space</a></li>
            <li><a href="/editArticle">New Article</a></li>
            <li><a href="/editProfile">Edit Profile</a></li>
            <li><a href="/signOut">Sign Out</a></li>
        </ul>
    </div>
</div>

</body>
</html>
