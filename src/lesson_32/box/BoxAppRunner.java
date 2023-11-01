package box;

public class BoxAppRunner {
    public static void main(String[] args) {


        //Box boxI = new Box(5);
        //Box boxS = new Box("Hello");
        //Box boxC = new Box('C');


        Box<Car> boxCar = new Box<>(new Car("Diablo"));
        Box<Integer> boxI = new Box<>(5);
        Box<String> boxS = new Box<>("Hello");
        Box<Character> boxC = new Box<>('C');



        System.out.println(boxCar.getContent() instanceof Car);
        System.out.println(boxI.getContent() instanceof Integer);
        System.out.println(boxS.getContent() instanceof String);
        System.out.println(boxC.getContent() instanceof Character);



        Car unboxedCar = boxCar.getContent();


    }
}