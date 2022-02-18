package testProjectPackage.automationpractiveframework.tasks;

import java.util.ArrayList;


public class Task_4 {
    public static void main(String[] args) {

        ArrayList<Employee> list = new ArrayList<>();
        list.add(new Engineer(1000,"C"));
        list.add(new Manager(10000,"A"));

        System.out.println(list.get(0).getSalary());
        System.out.println(list.get(1).getSalary());




//        Scanner sc = new Scanner(System.in);
//        String sub = sc.nextLine();
//        int n = Integer.parseInt(sub);
//        for(int i=0;i<n;i++){
//            String[] input = sc.nextLine().split(" ");
//            if(input[0].equals("ENGINEER")){
//                Engineer e = new Engineer();
//                e.setSalary(Integer.parseInt(input[2]));
//                e.setGrade(input[1]);
//                e.label();
//                System.out.println("GRADE : " + e.getGrade());
//                System.out.println("SALARY : " + e.getSalary());
//            }
//            if(input[0].equals("MANAGER")){
//                Manager e = new Manager();
//                e.setSalary(Integer.parseInt(input[2]));
//                e.setGrade(input[1]);
//                e.label();
//                System.out.println("GRADE : " + e.getGrade());
//                System.out.println("SALARY : " + e.getSalary());
//            }
//        }
    }
}

abstract class Employee {
    abstract void setSalary(int salary);
    abstract int getSalary();
    abstract void setGrade(String grade);
    abstract String getGrade();
    void label(){
        System.out.println("Employee's data:");
    }

}
class Engineer extends Employee {

    private int salary;
    private String grade;

    public Engineer(int salary, String grade) {
        this.salary = salary;
        this.grade = grade;
    }

    @Override
    void setSalary(int salary) {

    }

    @Override
    int getSalary() {
       return this.salary;
    }

    @Override
    void setGrade(String grade) {

    }

    @Override
    String getGrade() {
        return null;
    }


}
class Manager extends Employee{

    private int salary;
    private String grade;

    public Manager(int salary, String grade) {
        this.salary = salary;
        this.grade = grade;
    }

    @Override
    void setSalary(int salary) {

    }

    @Override
    int getSalary() {
       return this.salary;
    }

    @Override
    void setGrade(String grade) {

    }

    @Override
    String getGrade() {
        return null;
    }
}