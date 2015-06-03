package net.vegard.java8.optional;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ThirdPartyAPI {

    public static List<Integer> getIntegers() {
        List<Integer> integers = null;

        if(System.currentTimeMillis() % 2 == 0) {
            integers = Arrays.asList(1, 2, 3, 4);
        }

        return integers;
    }

}
