
<%@page import="java.util.List"%>
<%@page import="org.apache.catalina.connector.Response"%>
<%@page import="com.bean.wishlist"%>
<%@page import="com.dao.WishlistDao"%>
<%@ include file="header.jsp" %>

<%
   int pid=Integer.parseInt(request.getParameter("pid"));
   int uid=u.getUid();
   wishlist w=new wishlist();
   w.setPid(pid);
   w.setUid(uid);
   WishlistDao.remove_from_wishlist(w);
   List<wishlist> list=WishlistDao.getWishlistByUser(u.getUid());
   int wishlist_count=list.size();
   session.setAttribute("wishlist_count", wishlist_count);
    response.sendRedirect("wishlist.jsp");
%>