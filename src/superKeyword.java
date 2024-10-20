public class superKeyword {
    public static void main(String[] args) {
//        abc c = new abc();
//        c.show(30);
//        B b = new B();
//        b.show();
        y ob= new y();

    }
}
class mno{
    int a = 10;
}
class abc extends mno{
//    super keyword used to invoke the immediate parent class instance variable
    int a = 20;
    void show(int a){
        System.out.println(a);
        System.out.println(this.a);
        System.out.println(super.a);
    }
}
class A{
    void m1(){
        System.out.println("I am in class A");
    }
}
class B extends  A{
    void m1(){
        System.out.println("I am in class B");
    }
    void show(){
//        here super method used to invoke the immediate parent class method
      m1();
      super.m1();
    }
}
class x{
    x(){
        System.out.println("I am the constructor of class x ");
    }
}
class y extends x{
    y(){
//        here super keyword used to invoke the immediate parent class constructor
        super();
        System.out.println("I am the constructor of class y");
    }
}