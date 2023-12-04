package hw22.w1;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.ZoneId;
import java.time.ZonedDateTime;
    @WebServlet(value = {"/minsk", "/washington", "/beijing"})
    public class Timezone extends HttpServlet {
        @Override
        protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
            resp.setContentType("text/html");
            try(PrintWriter printWriter=resp.getWriter()) {
                String city=req.getServletPath();
                switch (city) {
                    case "/minsk" -> printWriter.write("Time in Minsk: "  + getTime("Europe/Minsk"));
                    case "/washington" -> printWriter.write("Time in Washington: " + getTime("America/New_York"));
                    case "/beijing" -> printWriter.write("Time in Beijing: "  + getTime("Asia/Singapore"));
                    default -> printWriter.write("Unexpected value: " + city);
                }
            }
        }
        String getTime (String zone1) {
            ZoneId zone = ZoneId.of(zone1);
            ZonedDateTime time = ZonedDateTime.now(zone);
            return time.toString();
        }
    }
