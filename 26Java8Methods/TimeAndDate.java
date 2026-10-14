import java.time.LocalDateTime;
import java.time.ZoneId;

public class TimeAndDate {
    public static void main(String[] args) {
        LocalDateTime current = LocalDateTime.now();
        LocalDateTime zone = LocalDateTime.now(ZoneId.of("Asia/Kolkata"));
        System.out.println("Current Date and Time in Kolkata: " + zone);
        System.out.println("Current Date and Time: " + current);
        // for (String zoneId : ZoneId.getAvailableZoneIds()) {
        //     System.out.println("Current Date and Time in " + zoneId + ": " + LocalDateTime.now(ZoneId.of(zoneId)));
        // }
    }

    
}
