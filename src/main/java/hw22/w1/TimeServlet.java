package hw22.w1;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.ZoneId;
import java.time.ZonedDateTime;

@WebServlet(name = "TimeServlet", urlPatterns = {"/minsk", "/washington", "/beijing"})
public class TimeServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        String pathInfo = request.getPathInfo();

        if ("/minsk".equals(pathInfo)) {
            printTime("Europe/Minsk", out);
        } else if ("/washington".equals(pathInfo)) {
            printTime("America/New_York", out);
        } else if ("/beijing".equals(pathInfo)) {
            printTime("Asia/Shanghai", out);
        } else {
            out.println("<html><body><h2>Invalid URL</h2></body></html>");
        }
    }

    private void printTime(String timeZone, PrintWriter out) {
        ZonedDateTime currentTime = ZonedDateTime.now(ZoneId.of(timeZone));
        out.println("<html><body><h2>Time in " + timeZone + ": " + currentTime + "</h2></body></html>");
    }
}
