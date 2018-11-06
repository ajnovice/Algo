package Implementation;

class Student{
    public int roll_no;
    public String name;
    Student(int roll_no,String name){
        this.roll_no=roll_no;
        this.name=name;
    }
}

public class Implementation {

    public static void printStudents(Student[] stu){
        for(Student st:stu ){
            System.out.println("Roll No :"+st.roll_no+" Name :"+st.name);
        }
        System.out.println("Hello");
    }

    public static  void main(String[] args){
        Student[] stu = new Student[5];
        stu[0] = new Student(1,"Ajay1");
        stu[1] = new Student(2,"Ajay2");
        stu[2] = new Student(3,"Ajay3");
        stu[3] = new Student(4,"Ajay4");
        stu[4] = new Student(5,"Ajay5");
        printStudents(stu);

    }
}
