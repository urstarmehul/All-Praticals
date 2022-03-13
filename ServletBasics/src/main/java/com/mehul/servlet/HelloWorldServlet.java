package com.mehul.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class HelloWorldServlet extends GenericServlet {

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		ServletResponse response2 = response;
		response2.setContentType("text/html");
		PrintWriter out = response2.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<h1>Hello World Servlet</h1>");
		out.println("</body>");
		out.println("</html>");
	}

}
