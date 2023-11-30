package hw22.w1;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.HashMap;
import java.util.Map;

@RestController
public class TimezoneController {

    private final Map<String, ZoneId> timezoneMap = new HashMap<>();

    public TimezoneController() {
        timezoneMap.put("minsk", ZoneId.of("Europe/Minsk"));
        timezoneMap.put("washington", ZoneId.of("America/New_York"));
        timezoneMap.put("beijing", ZoneId.of("Asia/Shanghai"));
    }

    @GetMapping("/{city}")
    public String getTimeInCity(@PathVariable String city) {
        ZoneId zoneId = timezoneMap.getOrDefault(city, ZoneId.systemDefault());
        LocalDateTime time = LocalDateTime.now(zoneId);
        return "Current time in " + city + ": " + time;
    }
}
