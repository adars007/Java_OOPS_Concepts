public class constructorClass {
    int i ;
    String c;
//    constructorClass() {
//        System.out.println("no arg contructor");
//    }
    constructorClass(int i , String c){
        this.i = i;
        this.c = c;
    }
    public static void main(String[] args) {
        constructorClass c= new constructorClass(25,"Adarsh");
//        System.out.println(c.i+" "+c.c);
        System.out.println(c.i+" "+c.c);

    }
}

