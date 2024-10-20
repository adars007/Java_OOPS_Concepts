public class methodOverriding {
    static class test{
        void show(){
            System.out.println("I am test class");
        }
    }
    static class tesst extends test{
        @Override
        void show() {
            System.out.println("I am a tesst class");
        }
    }
    public static void main(String[] args) {
        tesst t = new tesst();
        test tt = new test();
        tt.show();
        t.show();
    }
}
