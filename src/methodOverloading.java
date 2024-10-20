public class methodOverloading {
   static class methodoverloading{
       int age;
        void one (){
            System.out.println("I am from class one");
        }
        void one(int a){
            this.age = a;
            System.out.println("Age: "+a);
        }
    }
    public static void main(String[] args) {
        System.out.println("I am main class");
        methodoverloading ml = new methodoverloading();
        methodOverloading mll = new methodOverloading();
        mll.main(20);
//        ml.one();//
//        ml.one(25);//
    }
    public static void main(int b){
        System.out.println("2");
    }
}
