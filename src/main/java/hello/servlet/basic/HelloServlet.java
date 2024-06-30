package hello.servlet.basic;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.apache.coyote.Request;

import java.io.IOException;

@WebServlet(name = "helloServlet", urlPatterns = "/hello")
public class HelloServlet extends HttpServlet {
    //서블릿이 호출되면 서비스 메서드가 호출된다
    @Override
    protected void service(HttpServletRequest resquest, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("HelloServlet.service");
        System.out.println("resquest = " + resquest);
        System.out.println("response = " + response);


        String userName = resquest.getParameter("username");
        System.out.println("userName = " + userName);

        //응답은 httpServletResponse에 찍어준다
        response.setContentType("text/plain");
        response.setCharacterEncoding("utf-8");
        response.getWriter().write("hello " + userName);

    }
}
