<%@page import="com.bean.Student"%>
<%@page import="com.dao.StudenDao"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
</head>
<body>
<table border="1" width="100%" cellpadding="10px" cellspacing="10px" >
<tr>
<td>Id</td>
<td>FIRST NAME</td>
<td>LAST NAME</td>
<td>EMAIL</td>
<td>MOBILE</td>
<td>EDIT</td>
<td>DELETE</td>
</tr>
<%
   List<Student> list=StudenDao.getAllStudent();
   for(Student s:list)
   {
%>
   <tr>
   <td><%=s.getId() %></td>
   <td><%=s.getFname() %></td>
   <td><%=s.getLname()%></td>
   <td><%=s.getEmail()%></td>
   <td><%=s.getMobile()%></td>
   <td>
   <form name="edit" method="post" action="StudentController">
   <input type="hidden" name="id" value="<%=s.getId()%>">
   <input type="submit" name="action" value="EDIT" class="btn btn-primary">
   </form>
   </td>
   <td>
   <form name="DELETE" method="post" action="StudentController">
   <input type="hidden" name="id" value="<%=s.getId()%>">
   <input type="submit" name="action" value="DELETE" class="btn btn-danger">
   </form>
   </td>
   </tr>
<%
   }
%>
</table>
<a href="insert.jsp">Add New Student</a>
</body>
</html>