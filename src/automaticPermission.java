public class automaticPermission {
    static class test {
        void object(Object a){
            System.out.println("I am object class");
        }
        void object(String a){
            System.out.println("I am string class");
        }

    }

    public static void main(String[] args) {
        test t = new test();
        t.object('a');
        t.object("abc");
    }
}
