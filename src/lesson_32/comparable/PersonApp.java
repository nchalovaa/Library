package comparable;

import java.util.Arrays;

public class PersonApp {
    public static void main(String[] args) {
        Person[] peoples = {
                new Person("Andrej", 20),
                new Person("Vasja", 18),
                new Person("Petja", 34),
                new Person("Nastja", 18)
        };


        Arrays.sort(peoples);

        for (int i = 0; i < peoples.length; i++) {
            System.out.println(peoples[i]);

        }

    }
}
