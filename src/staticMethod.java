public class staticMethod {
    int empId;
    String name;
//    when a variable is declared as  static as a single copy of variable s
//    created and shared among all the objects at class level.This company name
//    is shae among all the objects
    static String company = "SP Global";

    staticMethod(int id, String name){
        this.empId = id;
        this.name = name;
    }
    void display(){
        System.out.println(empId+" "+name+" "+company);
    }

    public static void main(String[] args) {
//        staticMethod sm = new staticMethod(101,"Adarsh");
//        sm.display();
//        staticMethod sm1 = new staticMethod(102,"Anand");
//        sm1.display();
        counterDemo cd1 = new counterDemo();
        counterDemo cd2 = new counterDemo();
        counterDemo cd3 =  new counterDemo();
    }
}
class counterDemo{
//    Now it will initialize once and make a memory in memory management
   static int count = 0;
    counterDemo(){
        count++;
        System.out.println(count);
    }
}

