class Student{
       
        static String name = "Rdp";
        static String rollno = "0584";
        static String branch = "CSE";
        int sub1= 90;
        int sub2= 80;
        int sub3= 70;
        int sub4=90;
        int sub5= 80;
        int sub6=54;
        int total= sub1+sub2+sub3+sub4+sub5+sub6;
        float avg= total/6.0f ;     
        public static void main(String[] args) {
            Student s = new Student();    
        System.out.println("Name: "+name);
        System.out.println("Roll No: "+rollno);
        System.out.println("Branch: "+branch);
        System.out.println("Total Marks: "+s.total);
        System.out.println("Average Marks: "+s.avg);
    }
}     