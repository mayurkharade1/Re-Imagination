package BAsice;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.ThreadLocalRandom;

public class RandomSummerDateGenerator {

    public static String getRandomSummerDate() {
        int startYear = 1950;
        int endYear = 2005;

        // Choose random year between start and end
        int randomYear = ThreadLocalRandom.current().nextInt(startYear, endYear + 1);

        // Pick a random month from May (5) to August (8)
        int randomMonth = ThreadLocalRandom.current().nextInt(5, 9); // 5 to 8 inclusive

        // Find the maximum valid day for the month and year
        int maxDay = LocalDate.of(randomYear, randomMonth, 1).lengthOfMonth();

        // Pick a random day in the month
        int randomDay = ThreadLocalRandom.current().nextInt(1, maxDay + 1);

        // Create the LocalDate
        LocalDate randomDate = LocalDate.of(randomYear, randomMonth, randomDay);

        // Format it as "dd/MMM/yyyy"
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MMMM/yyyy");

        return randomDate.format(formatter);
    }

    public static void main(String[] args) {
        System.out.println(getRandomSummerDate());
    }
}
