<%@ page import="java.sql.*" language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%!
    Connection con;
    PreparedStatement ps;
    
    public void jspInit(){
    	try{
    		Class.forName("com.mysql.jdbc.Driver");
    		con = DriverManager.getConnection("jdbc:mysql://localhost/mydb","root","Root@12345");
    		ps = con.prepareStatement("insert into account values(?,?,?,?)");
    	}catch (Exception e){
    		e.printStackTrace();
    	}
    }
    
    public void jspDestroy(){
    	try{
    		ps.close();
    		con.close();
    	}catch (Exception e){
    		e.printStackTrace();
    	}
    	
    }
    %>
<%
int id = Integer.parseInt(request.getParameter("accno"));
String first_name = request.getParameter("firstname");
String last_name = request.getParameter("lastname");
int balance = Integer.parseInt(request.getParameter("bal"));

ps.setInt(1, id);
ps.setString(2, first_name);
ps.setString(3, last_name);
ps.setInt(4, balance);

ps.executeUpdate();
%> 

<%@ include file="openaccount.html" %>
   