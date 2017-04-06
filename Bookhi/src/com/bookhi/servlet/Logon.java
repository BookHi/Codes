package com.bookhi.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.json.JSONException;
import org.json.JSONStringer;

import com.bookhi.dao.UserDao;
import com.bookhi.entity.User;

public class Logon extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private UserDao userdao=new UserDao();
	private static Logger logger = LogManager.getLogger(Logon.class.getName());
	/**
	 * Constructor of the object.
	 */
	public Logon() {
		super();
	}

	/**
	 * Destruction of the servlet. <br>
	 */
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	/**
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request,response);
		
	}

	/**
	 * The doPost method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		 request.setCharacterEncoding("UTF-8");
		 String username=request.getParameter("username");
		 String pwd=request.getParameter("pwd");
		 User user=new User(username,pwd);
		 JSONStringer jsonText = new JSONStringer();
		 try {
			 if(userdao.save(user)){;	
				jsonText.object();
			 	jsonText.key("result");  
			 	jsonText.value(1);
			 	jsonText.key("msg");  
			 	jsonText.value("ע��ɹ�");  
			 	jsonText.endObject();
			 	logger.info("�û�"+username+"ע��ɹ�");
			 }else{
				jsonText.object();
				jsonText.key("result");  
				jsonText.value(0);
				jsonText.key("msg");  
				jsonText.value("ע��ʧ��");  
				jsonText.endObject();
				logger.info("�û�"+username+"ע��ʧ��");
			 }
		 } catch (JSONException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		 }
		 response.getOutputStream().write(jsonText.toString().getBytes("UTF-8"));  
		 response.setContentType("text/json; charset=UTF-8");
	}

	/**
	 * Initialization of the servlet. <br>
	 *
	 * @throws ServletException if an error occurs
	 */
	public void init() throws ServletException {
		// Put your code here
	}

}
