package UEmployeeFacultyStaff;

public class Staff extends UEmployee {
    private String jobTitle;

    // Constructor for Staff
    public Staff(String name, double salary, String jobTitle) {
        super(name, salary);  // Call to parent class constructor
        this.jobTitle = jobTitle;
    }

    // Getter for job title
    public String getJobTitle() {
        return jobTitle;
    }
}
