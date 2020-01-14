package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/mSignUp")
public class ServletEx extends HttpServlet {
	// servlet 실행
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html charset=UTF-8");
		
//		doGet(request, response);
		String m_name = request.getParameter("m_name");
		String m_pass = request.getParameter("m_pass");
		String m_gender = request.getParameter("m_gender");
		String[] m_hobby = request.getParameterValues("m_hobby");
		String m_residence = request.getParameter("m_residence");
		
		HttpSession session = request.getSession();
		session.setAttribute("m_name", m_name);
		session.setAttribute("m_pass", m_pass);
		session.setAttribute("m_gender", m_gender);
		session.setAttribute("m_hobby", m_hobby);
		session.setAttribute("m_residence", m_residence);
		
		for(String v : m_hobby) {
			System.out.println(v);
		}
		
		
		Enumeration<String> names = request.getParameterNames();
		while(names.hasMoreElements()) {
			String name = names.nextElement();
			System.out.println(name);
		}
		
		response.sendRedirect("ShowForm.jsp");	
		
	}

//	@PostConstruct
//	public void postConstruct() {
//		System.out.println("--PostConstruct()--");
//	}
//
//	// servlet 생성
//	@Override
//	public void init() throws ServletException {
//		System.out.println("--init()--");
//	}
//
//	// servlet 종료
//	@Override
//	public void destroy() {
//		System.out.println("--destory()--");
//	}
//
//	@PreDestroy
//	public void preDestory() {
//		System.out.println("--preDestory()--");
//	}

}
