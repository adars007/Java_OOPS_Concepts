public class initializeObject {
    static class referenceVariable{
        String color;
        int age;
    }
    public static void main(String[] args) {
        referenceVariable ref = new referenceVariable();
        ref.color = "Black";
        ref.age  = 10;
        System.out.println(ref.color+" "+ref.age);
        methodCall met = new methodCall();
        met.initObj("Black",25);
        met.display();

    }
    static class methodCall{
        String color;
        int age;
         void initObj(String c, int a){
            color = c;
            age = a;
        }
        void display()
        {
            System.out.print(color+" "+age);
        }
    }
}
