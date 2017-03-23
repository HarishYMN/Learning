package scrap;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

/**
 * Servlet implementation class HtmlParsing
 */
@WebServlet("/scrapping")
public class scrapping extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @throws IOException 
     * @see HttpServlet#HttpServlet()
     */
 

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		
//		String search=request.getParameter("input");
	     String htmlFile1 =  "http://www.google.co.in";
	     Document htmlFile = Jsoup.connect(htmlFile1).timeout(0).get();
	     
		 //System.out.println(htmlFile);
		 PrintWriter out = response.getWriter();

		 File input = new File("filePath/fileName.html");
		 PrintWriter writer = new PrintWriter(input,"UTF-8");
		 //htmlFile.body().append("hello") ;
		 writer.write(htmlFile.html() ) ;
		 writer.flush();
		 writer.close();
	     out.println(htmlFile);

		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}