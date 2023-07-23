public class Generics1 {

   static <T> void printArray(T  t){
        System.out.println(t);
    }
    public static void main(String[] args) {
        Generics1 obj=new Generics1();
        obj.printArray(1);
        obj.printArray(2);
        obj.printArray(3);
        obj.printArray("Hello");
        obj.printArray("World");
    }
}
