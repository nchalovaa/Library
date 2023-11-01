package lesson_08;

public class test {
    public static void main(String[] args) {
        String mainText = "Что такое технология Java и каково ее применение?Java представляет собой язык программирования и " +
                "платформу вычислений, которая была впервые выпущена компанией Sun" +
                "Microsystems в 1995 г. Технология эволюционировала из скромной разработки до инструмента, который играет серьезную роль" +
                "в современном цифровом мире, предоставляя надежную платформу для множества сервисов и приложений. Инновационные продукты" +
                "и цифровые услуги, разрабатываемые для будущего, также будут создаваться на основе Java." +
                "Несмотря на то что большинство современных приложений Java объединяет в себе среду и приложение Java, все еще существует" +
                "множество приложений и даже некоторые веб-сайты, которые не будут работать, если на компьютере не установлена настольная" +
                "версия Java. Java.com — это веб-сайт, предназначенный для пользователей, которым, возможно, Java по-прежнему требуется" +
                "для настольных приложений, в частности для приложений на Java 8. Более подробную информацию для разработчиков и" +
                "пользователей, которые хотели бы научиться программированию на Java, см. на веб-сайте dev.java, для" +
                "бизнес-пользователей — на веб-странице oracle.com/java.";

        System.out.println(characters(mainText) + " cимволов в этом предложении.");
        numberletters(mainText);
    }

    public static int characters (String text) {
        int counter = text.length();
        return counter;
    }

    public static void numberletters(String text){
        int counter = 0;
        int counterLatin =0;
        int counterKiril =0;
        for (int i = 0; i < text.length(); i++) {
            if((text.charAt(i) >= '\u0041' && text.charAt(i) <= '\u005A' )||(text.charAt(i) >= '\u0061' &&
                    text.charAt(i) <= '\u007A')) {
                counterLatin++;} else if(text.charAt(i) >= '\u0410' && text.charAt(i) <= '\u0451'){
                counterKiril++;
            }
        }
        counter = counterLatin + counterKiril;
        System.out.println(counter + " букв (не символов и не цифр и не знаков!) в этом предложении.");
        System.out.println(counterLatin + " букв латиского алфавита в этом предложении.");
        System.out.println(counterKiril + " букв кирилического алфавита в этом предложении.");
    }
}
