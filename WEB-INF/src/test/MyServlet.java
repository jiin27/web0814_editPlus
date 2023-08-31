/*
이 클래스는 오직 서버에서만 해석 및 실행되어지는 클래스이다. 
이러한 클래스를 가리켜 서블릿(Servlet)이라 한다.
*/
//코드를 서버에 올려두면 서버에서 웹브라우저가 실행을 맡기 때문에 원본 소스에는 실행부가 있을 필요 없음!
package test;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import java.io.IOException;
import java.io.PrintWriter;

//서블릿 클래스를 상속받으면, 이 때부터 MyServlet은 서블릿이 된다. (상속 is a 관계에 의해)
//이 서블릿을 이용하여 나의 이름을 웹브라우저에 출력해보자

public class MyServlet extends HttpServlet{

	//클라이언트의 요청이 get방식일 경우, doGet() 메서드로 요청을 받아야 한다. (오버라이드)
	//jsp에서의 request의 자료형은 사실 HttpServletRequest 형이었다.
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{ //throws: 호출한 사람에세 예외를 전가시키기
		//나의 이름을 응답정보로 구성하여 웹브라우저에 전송하자

		//jsp에서의 page 지시영역의 인코딩
		response.setContentType("text/html;charset=utf-8"); 
		PrintWriter out=response.getWriter(); //톰캣 서버의 출력 스트림 과정. 출력은 서버의 응답 과정이므로, 응답 객체인 response()에서 가져와야 한다.

		out.print("my name is 박지인");
	}
}  

