
class student {
    String name;
    String usn;
    String branch;
    

    student(String name, String usn, String branch) {
        this.name = name;
        this.usn =usn;
        this.branch = branch;
    
    }

    void displaystudentDetails() {
        System.out.println("student Name: " + name);
        System.out.println("usn: " + usn);
        System.out.println("branch: " + branch);
        
    }
}

public class student_class {
    public static void main(String[] args) {
       
        student s1 = new student("Avinash", "1da23cb009", "csbs");

        s1.displaystudentDetails();
    }
}