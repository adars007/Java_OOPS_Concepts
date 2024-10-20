public class hierarichalInheritance {
    static class  Animal{
        void eat(){
            System.out.println("I am eating");
        }
    }
    static class dog extends Animal{
        void sound(){
            System.out.println("I am barking");
        }
    }
    static class cat extends Animal{
        void sound(){
            System.out.println("I am meowing");
        }
    }
    public static void main(String[] args) {
        dog d = new dog();
        d.sound();
        d.eat();
        cat c =  new cat();
        c.sound();
        c.eat();
    }
}
