package LAB.LAB_5;
//5.	Write a Java program that prints the current time in GMT. 
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.TimeZone;

public class ISTtoGMT{
    public static void main(String[] args) {
        // Create a Date object for the current time
        Date currentTime = new Date();

        // Create a SimpleDateFormat object to format the date
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        
        // Set the time zone to GMT
        sdf.setTimeZone(TimeZone.getTimeZone("GMT"));
        
        // Format the current time in GMT
        String currentTimeGMT = sdf.format(currentTime);
        
        // Print the current time in GMT
        System.out.println("Current time in GMT: " + currentTimeGMT);
    }
}
