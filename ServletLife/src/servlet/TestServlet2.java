package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestServlet1
 */
@WebServlet("/TestServlet2")
public class TestServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TestServlet2() {
        System.out.println("TestServlet2构造方法被执行。。。");
    }
    
    
    public void destroy(){
    	System.out.println("TestServlet2销毁方法被执行。。。");
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("TestServlet2的doGet()方法被执行、");
		
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">");
		out.println("<HTML>");
		out.println("<HEAD><TITLE>a servlet</TITLE></HEAD>");
		out.println("<BODY>");
		out.println("<h1>你好，我是TestServlet2</h1>");
		out.println("/BODY");
		out.println("   </HTML>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("TestServlet2的doPost()方法被执行、");
		doGet(request, response);
	}
	
	public void init() throws ServletException{
		System.out.println("TestServlet2的初始化方法被执行、");
	}

}
