public class thisOperator {
    public static void main(String[] args) {
//        Test t = new Test();
//        t.setI(102);
//        t.show();
//        thisDemo td = new thisDemo();
//        td.display();
//        thisConstructor tc= new thisConstructor(20);
        thisMethod tm = new thisMethod();
        tm.m2();

    }
}
class Test{
//    This keyword is used to invoke the current class variable
    int i;
    public void setI(int i) {
       this.i = i;
    }
    void show (){
        System.out.println(i);
    }
}
class thisDemo{
//    This keyword used to invoke the current class method
    void message(){
        System.out.println("Hello Message");
    }
    void display(){
        this.message();
    }
}
class thisConstructor{
    thisConstructor(){
//        this() keyword also use to invoke the current class constructor used to call the child  constructor
//        this();
        System.out.println("no arg constructor");
    }
    thisConstructor(int a){
//        this() keyword also use to invoke the current class constructor used to call the parent constructor
        this();
        System.out.println("Parametrised constructor");
    }
}
class thisMethod{
    static void m1(thisMethod tm){
        System.out.println("I am in method m1");
    }
   void m2(){
//        here this method use to pass as an arguement in method call
        m1(this);
    }
}
class test{
    test(xyz a){
        System.out.println("test class constructor");
    }
}
class xyz{
    test ttt = new test(this);
}