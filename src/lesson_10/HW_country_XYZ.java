package lesson_10;

public class HW_country_XYZ {
    public static void main(String[] args) {

        int population = 14_000_000;
        int birth = 14;
        int death = 8;

        xyz(10, population,death, birth);

    }
/* В стране XYZ население 14 миллионов человек.
Рождаемость составляет 14 человек на 1000 человек, смертность - 8 человек.
Рассчитайте, какая численность населения будет через 10 лет, принимая во внимание, что показатели рождаемости и смертности постоянны.*/


    public static void xyz (int years, int population, int death, int birth) {
        for(int i = 1; i <= years; i++ ) { // i - это счетчик, который изменяется
            int births = (population / 1000) * birth;
            int deaths = (population / 1000) * death;
            population +=   (births - deaths);
            System.out.println("Через " + i + " год " + " численность населения " + population);
        }

    }

}
