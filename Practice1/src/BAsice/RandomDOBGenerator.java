package BAsice;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

import java.time.LocalDate;
import java.util.Locale;
import java.util.concurrent.ThreadLocalRandom;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.concurrent.ThreadLocalRandom;

public class RandomDOBGenerator {

    public static String getRandomDOB() {
        LocalDate start = LocalDate.of(1990, 1, 1);
        LocalDate end = LocalDate.of(2002, 12, 31);

        long startEpoch = start.toEpochDay();
        long endEpoch = end.toEpochDay();

        long randomDay = ThreadLocalRandom.current().nextLong(startEpoch, endEpoch + 1);

        LocalDate randomDate = LocalDate.ofEpochDay(randomDay);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MMMM/yyyy", Locale.ENGLISH);
        return randomDate.format(formatter);
    }

    public static void main(String[] args) {
        System.out.println(getRandomDOB());  // Example: 07/September/1995
    }
}



