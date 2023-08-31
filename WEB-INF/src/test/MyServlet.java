/*
�� Ŭ������ ���� ���������� �ؼ� �� ����Ǿ����� Ŭ�����̴�. 
�̷��� Ŭ������ ������ ����(Servlet)�̶� �Ѵ�.
*/
//�ڵ带 ������ �÷��θ� �������� ���������� ������ �ñ� ������ ���� �ҽ����� ����ΰ� ���� �ʿ� ����!
package test;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import java.io.IOException;
import java.io.PrintWriter;

//���� Ŭ������ ��ӹ�����, �� ������ MyServlet�� ������ �ȴ�. (��� is a ���迡 ����)
//�� ������ �̿��Ͽ� ���� �̸��� ���������� ����غ���

public class MyServlet extends HttpServlet{

	//Ŭ���̾�Ʈ�� ��û�� get����� ���, doGet() �޼���� ��û�� �޾ƾ� �Ѵ�. (�������̵�)
	//jsp������ request�� �ڷ����� ��� HttpServletRequest ���̾���.
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{ //throws: ȣ���� ������� ���ܸ� ������Ű��
		//���� �̸��� ���������� �����Ͽ� ���������� ��������

		//jsp������ page ���ÿ����� ���ڵ�
		response.setContentType("text/html;charset=utf-8"); 
		PrintWriter out=response.getWriter(); //��Ĺ ������ ��� ��Ʈ�� ����. ����� ������ ���� �����̹Ƿ�, ���� ��ü�� response()���� �����;� �Ѵ�.

		out.print("my name is ������");
	}
}  

