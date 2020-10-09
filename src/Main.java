public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world");

        Fraction fraction = new Fraction(10, 12);

        assert fraction.toString().equals("10 / 12");
    }
}
