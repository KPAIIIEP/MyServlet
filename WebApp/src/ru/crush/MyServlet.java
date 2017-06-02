package ru.crush;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// System.out.println("Обработка запроса");

		// PrintWriter out = response.getWriter();
		// out.println(date.toString());
		Random rand = new Random();
		int size = rand.nextInt(10);
		Date date = new Date();
		
		String color = Integer.toString(rand.nextInt(255)) + ", " + Integer.toString(rand.nextInt(255)) + ", " + Integer.toString(rand.nextInt(255));
		
		request.setAttribute("color", color);
		request.setAttribute("size", size);
		request.setAttribute("date", date.toString());
		request.getRequestDispatcher("NewFile.jsp").forward(request, response);
	}

}
