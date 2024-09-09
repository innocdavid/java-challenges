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
        System.out.println("max: " + numbers.max());
        numbers.print();

        System.out.println("xxxxxxxxxxxxxxxxxxxx");

        Array array1 = new Array(5);
        array1.insert(1);
        array1.insert(50);
        array1.insert(3);
        array1.insert(4);
        array1.insert(5);
        System.out.println("index at: " + array1.indexOf(10));
        System.out.println("max: " + array1.max());
        array1.print();
        Array result = numbers.intersect(array1);
        System.out.println("intersection: " + result);
        
    }
    
}
