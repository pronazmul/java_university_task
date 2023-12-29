// Currency Converter Package
package currency;
public class CurrencyConverter {
    public static double convertDollarToBDT(double dollarAmount) {
        // Conversion rate: 1 USD = 85 BDT
        return dollarAmount * 85;
    }
    public static double convertEuroToBDT(double euroAmount) {
        // Conversion rate: 1 EURO = 100 BDT
        return euroAmount * 100;
    }
    public static double convertYenToBDT(double yenAmount) {
        // Conversion rate: 1 Yen = 0.75 BDT
        return yenAmount * 0.75;
    }
    public static double convertBDTToDollar(double bdtAmount) {
        // Conversion rate: 1 BDT = 0.0118 USD
        return bdtAmount * 0.0118;
    }
    public static double convertBDTToEuro(double bdtAmount) {
        // Conversion rate: 1 BDT = 0.01 EURO
        return bdtAmount * 0.01;
    }
    public static double convertBDTToYen(double bdtAmount) {
        // Conversion rate: 1 BDT = 1.33 Yen
        return bdtAmount * 1.33;
    }
}
// Distance Converter Package
package distance;
public class DistanceConverter {
    public static double convertMeterToKilometer(double meter) {
        return meter / 1000;
    }
    public static double convertKilometerToMeter(double kilometer) {
        return kilometer * 1000;
    }
    public static double convertMilesToKilometer(double miles) {
        // Conversion rate: 1 mile = 1.60934 km
        return miles * 1.60934;
    }
    public static double convertKilometerToMiles(double kilometer) {
        // Conversion rate: 1 km = 0.621371 miles
        return kilometer * 0.621371;
    }
}
// Time Converter Package
package time;
public class TimeConverter {
    public static double convertHoursToMinutes(double hours) {
        return hours * 60;
    }
    public static double convertHoursToSeconds(double hours) {
        return hours * 3600;
    }
    public static double convertMinutesToHours(double minutes) {
        return minutes / 60;
    }
    public static double convertSecondsToHours(double seconds) {
        return seconds / 3600;
    }
}
// Main Application
import currency.CurrencyConverter;
import distance.DistanceConverter;
import time.TimeConverter;
public class ConverterApp {
    public static void main(String[] args) {
        // Currency Conversion
        System.out.println("Currency Conversion:");
        System.out.println("50 USD to BDT: " + CurrencyConverter.convertDollarToBDT(50));
        System.out.println("30 EURO to BDT: " + CurrencyConverter.convertEuroToBDT(30));
        System.out.println("100 Yen to BDT: " + CurrencyConverter.convertYenToBDT(100));
        System.out.println("150 BDT to USD: " + CurrencyConverter.convertBDTToDollar(150));
        System.out.println("200 BDT to EURO: " + CurrencyConverter.convertBDTToEuro(200));
        System.out.println("300 BDT to Yen: " + CurrencyConverter.convertBDTToYen(300));
        System.out.println();
        // Distance Conversion
        System.out.println("Distance Conversion:");
        System.out.println("2000 meters to kilometers: " + DistanceConverter.convertMeterToKilometer(2000));
        System.out.println("5 kilometers to meters: " + DistanceConverter.convertKilometerToMeter(5));
        System.out.println("10 miles to kilometers: " + DistanceConverter.convertMilesToKilometer(10));
        System.out.println("15 kilometers to miles: " + DistanceConverter.convertKilometerToMiles(15));
        System.out.println();
        // Time Conversion
        System.out.println("Time Conversion:");
        System.out.println("2 hours to minutes: " + TimeConverter.convertHoursToMinutes(2));
        System.out.println("3 hours to seconds: " + TimeConverter.convertHoursToSeconds(3));
        System.out.println("120 minutes to hours: " + TimeConverter.convertMinutesToHours(120));
        System.out.println("7200 seconds to hours: " + TimeConverter.convertSecondsToHours(7200));
    }
}
