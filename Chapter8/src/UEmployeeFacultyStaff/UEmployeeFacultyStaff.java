package UEmployeeFacultyStaff;

public class UEmployeeFacultyStaff {
    public static void main(String[] args) {
        // Create instances of Faculty and Staff
        Faculty faculty1 = new Faculty("Dr. Smith", 70000, "Computer Science");
        Staff staff1 = new Staff("John Doe", 45000, "Administrative Assistant");

        // Print out their information
        System.out.println("Faculty: " + faculty1.getName() + ", Department: " + faculty1.getDepartment() + ", Salary: $" + faculty1.getSalary());
        System.out.println("Staff: " + staff1.getName() + ", Job Title: " + staff1.getJobTitle() + ", Salary: $" + staff1.getSalary());
    }
}
