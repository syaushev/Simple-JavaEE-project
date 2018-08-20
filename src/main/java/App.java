
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/test")
public class App extends HttpServlet{

    @EJB
    JavaBean javaBean;


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        UserEntity user=new UserEntity();
        user.setName("Ser");

        javaBean.saveUser(user);

        resp.getWriter().println("Hello from servlet");
    }
}
