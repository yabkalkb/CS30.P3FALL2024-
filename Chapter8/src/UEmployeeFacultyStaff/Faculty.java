
package UEmployeeFacultyStaff;

public class Faculty {
    private String department;
    private String name;
    private double salary;

    // Constructor for Faculty
    public Faculty(String name, double salary, String department) {
        super();  // Call to parent class constructor
        this.department = department;
        this.name = name;
        this.salary = salary;
    }

    // Getter for department
    public String getDepartment() {
        return department;
    }

	public String getName() {
		return name;
	}

	public double getSalary() {

		return salary;
	}
}
