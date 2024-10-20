public class classMethodObject1 {
    public void eat(){
        System.out.println("I am eating");
    }
    public void run(){
        System.out.println("I am running");
    }
    public static void main(String[] args) {
        System.out.println("1");
        classMethodObject1 cl = new classMethodObject1();
        cl.eat();
        cl.run();
        Bird sp = new Bird();
        sp.fly();
    }
}
class Bird{
    void fly(){
        System.out.println("I am flying");
    }
}
