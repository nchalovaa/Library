package box_simple;

public class BoxAppRunner {
    public static void main(String[] args) {
        BoxSimple boxSimpleInteger = new BoxSimple(1);
        BoxSimpleString boxSimpleString = new BoxSimpleString("Hello World");

        Integer boxIntResult = boxSimpleInteger.getContent();
        String boxStringResult = boxSimpleString.getContent();
    }
}
