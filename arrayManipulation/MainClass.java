package arrayManipulation;

public class MainClass {
    public static void main(String[] args) {
        System.out.println("===== main =======");
        Array numbers = new Array(5);
        numbers.insert(10);
        numbers.insert(20);
        numbers.insert(30);
        numbers.insert(40);
        numbers.insert(50);
        System.out.println("index at: " + numbers.indexOf(10));
        numbers.print();
    }
    
}
