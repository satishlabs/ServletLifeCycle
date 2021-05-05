package com.satishlabs;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletLifeCycle
 */

public class ServletLifeCycle extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 */
	public ServletLifeCycle() {
		System.out.println("Default Constructor");
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("Init method()");
	}


	@Override
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.write("<h1>******** My service() method ********</h1>");
	}

	@Override
	public void destroy() {
		System.out.println("My destroy() method");
	}
}