public class interfacee {
    interface i1{
        void show();
    }
    interface i2{
        void display();
    }
   static class test implements i1,i2{
        @Override
        public void show() {
            System.out.println("i am test class");
        }

       @Override
       public void display() {
           System.out.println("I am a display method");
       }
   }

    public static void main(String[] args) {
        test t= new test();
        t.show();
        t.display();
    }
}
