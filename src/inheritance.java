public class inheritance {
    static class Animal{
        void eat(){
            System.out.println("I am eating");
        }
    }
//    Single inheritance
   static class dog extends Animal{
        void sound(){
            System.out.println("I am barking");
        }
    }
//    Multilevel inheritance
    static class dogg extends dog{
        void sleep(){
            System.out.println("I am sleeping");
        }
    }
    public static void main(String[] args) {
        dogg d = new dogg();
        d.eat();
        d.sound();
        d.sleep();



    }
}
