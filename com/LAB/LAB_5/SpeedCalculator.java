package LAB.LAB_5;
import java.util.Scanner;

public class SpeedCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the distance in meters: ");
        double distance = scanner.nextDouble();
        System.out.print("Enter the time taken (hours): ");
        int hours = scanner.nextInt();
        System.out.print("Enter the time taken (minutes): ");
        int minutes = scanner.nextInt();
        System.out.print("Enter the time taken (seconds): ");
        int seconds = scanner.nextInt();
        System.out.println(ConvertMetersPerSecond(hours, minutes, seconds, distance));
        System.out.println(convertMilesPerHour(hours, minutes, seconds, distance));
        System.out.println(convertKilometersPerHour(hours, minutes, seconds, distance));
        scanner.close();
    }
    public static double ConvertMetersPerSecond(int hours, int minutes, int seconds, double distance){
    int totalTimeInSeconds = hours * 3600 + minutes * 60 + seconds;
    double speedInMetersPerSecond = distance / totalTimeInSeconds;
    return speedInMetersPerSecond;
    }
    public static double convertMilesPerHour(int hours, int minutes, int seconds, double distance){
        int totalTimeInSeconds = (int) (hours * 3600 + minutes * 60 + seconds);
        double speedInMilesPerHour = (distance / 1609.0) / (totalTimeInSeconds / 3600.0);
        return speedInMilesPerHour;
    }
    public static double convertKilometersPerHour(int hours, int minutes, int seconds, double distance){
        int totalTimeInSeconds = (int) (hours * 3600 + minutes * 60 + seconds);
        double speedInKilometersPerHour = (distance / 1000) / (totalTimeInSeconds / 3600.0);
        return speedInKilometersPerHour;
    }
}

