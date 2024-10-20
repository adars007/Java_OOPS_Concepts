public class staticMethodCall {
    static void display(){
        System.out.println("I am a static method");
    }

    public static void main(String[] args) {
        display();
        staticmethod2.show();
    }
}
class  staticmethod2{
    static void show(){
        System.out.println("I am in static method2");
    }
}

//"static" methods belongs to the class, not to the object.
//A "static" method can be accessed directly by class name
//and doesn't need any object.
//A "static" method can access only static data. It cannot
//access non-static data (instance data).
//A "static" method can call only other static methods and
//cannot call a non-static method.
//A "static" method cannot refer to "this" or "super"
// keyword in anyway.