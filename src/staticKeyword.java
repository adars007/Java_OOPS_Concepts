public class staticKeyword {
    public static void main(String[] args) {
        PQR a = new PQR();
//        So we can directly access the static variable using class we do not need to create any object.s
        System.out.println(PQR.a);
//        a.show();
    }
}
class PQR{
//    static can only be used with class level variable
    static int a = 10;
//    void show(){
////        static variable cannot be used with local inner clas variable
//        static int b  = 20;
//    }
}
