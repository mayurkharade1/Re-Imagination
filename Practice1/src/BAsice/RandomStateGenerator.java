package BAsice;

import java.util.concurrent.ThreadLocalRandom;

public class RandomStateGenerator {

    private static final String[] STATES = {
        "ANDHRA PRADESH", "ARUNACHAL PRADESH", "ASSAM", "BIHAR",
        "CHHATTISGARH", "GOA", "GUJARAT", "HARYANA", "HIMACHAL PRADESH",
        "JHARKHAND", "KARNATAKA", "KERALA", "MADHYA PRADESH",
        "MAHARASHTRA", "MANIPUR", "MEGHALAYA", "MIZORAM", "NAGALAND",
        "ODISHA", "PUNJAB", "RAJASTHAN", "SIKKIM", "TAMIL NADU",
        "TELANGANA", "TRIPURA", "UTTAR PRADESH", "UTTARAKHAND",
        "WEST BENGAL"
    };

    public static String getRandomState() {
        int index = ThreadLocalRandom.current().nextInt(STATES.length);
        return STATES[index];
    }

    public static void main(String[] args) {
        System.out.println(getRandomState());  // Example: "MAHARASHTRA"
    }
}

