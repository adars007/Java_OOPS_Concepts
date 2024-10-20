public class encapsulation {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.setEmpId(102);
        System.out.println(e.getEmpId());
    }
}
class Employee{
    private int empId;

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public int getEmpId() {
        return empId;
    }
}
