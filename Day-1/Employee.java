/* Write a emp  program using emp id ,emp name , designation , emp salary =74k , 
adding TA from 25%  
adding DA from 35%
salary is instance varible 
emp id is local variable , emp name is local varible
designation is static varible */

public class Employee {
    static String designation=" Java Dev ";
    int empSalary=74000;
    public static void main(String[] args){
        Employee ob=new Employee();
        int empId=1;
        String empName="Rdp";
        System.out.println("Employee Id: "+empId);
        System.out.println("Employee Name: "+empName);
        System.out.println("Employee Designation: "+designation);
        int ta= (ob.empSalary*25)/100;
        int da= (ob.empSalary*35)/100;
        int totalSalary= ob.empSalary+ta+da;
        System.out.println("Employee Salary: "+ob.empSalary);
        System.out.println("Employee TA: "+ta);
        System.out.println("Employee DA: "+da);
        System.out.println("Employee Total Salary: "+totalSalary);

    }    
}
