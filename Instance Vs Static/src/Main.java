//Static Method Example
// public class Main {
//     public static void main(String[] args) {
//         Dog rex = new Dog("rex"); //create instance (rex)
//         Dog fluffy = new Dog("fluffy"); //create instance (fluffy)
//         rex.printName();    //print fluffy
//         fluffy.printName(); //print fluffy
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         Calculator.printSum(5, 10);
//         printHello(); //shorter form of Main.printHello
//         //Use the methodName(); -> printHello(); b/c it's in the same class
//     }

//     public static void printHello() {
//         System.out.println("Hello");
//     }
// }

//Instance Method Example
public class Main {
    public static void main(String[] args) {
        Dog rex = new Dog();
        rex.bark();
    }
}