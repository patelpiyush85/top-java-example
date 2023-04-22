
<%@page import="com.dao.CartDao"%>
<%@page import="com.bean.Cart"%>
<%@page import="java.util.List"%>
<%@page import="com.bean.wishlist"%>
<%@page import="com.dao.WishlistDao"%>
<%@ include file="header.jsp" %>

<%
   int pid=Integer.parseInt(request.getParameter("pid"));
   int uid=u.getUid();
   CartDao.removeFromCart(uid, pid);
   List<Cart>list=CartDao.getCartByUser(u.getUid()); 
   int cart_count=list.size();
  session.setAttribute("cart_count", cart_count);
   response.sendRedirect("cart.jsp");
%>