<%@page import="com.dao.ProductDao"%>
<%
  int pid=Integer.parseInt(request.getParameter("pid"));
  ProductDao.DeleteProductByPid(pid);
  response.sendRedirect("seller-view-product.jsp");
%>