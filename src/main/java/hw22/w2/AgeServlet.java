package hw22.w2;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/check-age")
public class AgeServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String ageParam = request.getParameter("age");

        if (ageParam != null && !ageParam.isEmpty()) {
            try {
                int age = Integer.parseInt(ageParam);

                if (age >= 18) {
                    response.getWriter().println("Совершеннолетний");
                } else {
                    response.getWriter().println("Несовершеннолетний");
                }
            } catch (NumberFormatException e) {
                response.getWriter().println("Некорректный формат возраста");
            }
        } else {
            response.getWriter().println("Пожалуйста, укажите возраст.");
        }
    }
}