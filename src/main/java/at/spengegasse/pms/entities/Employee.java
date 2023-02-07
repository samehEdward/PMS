package at.spengegasse.pms.entities;


import jakarta.persistence.*;


@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long empID;

    private String firstName;
    private String LastName;
    private String email;

    @ManyToOne
    @JoinColumn(name = "project_id")
    private Project theProject;

    public Project getTheProject() {
        return theProject;
    }

    public void setTheProject(Project theProject) {
        this.theProject = theProject;
    }

    public Employee() {
    }

    public Employee(String firstName, String lastName, String email) {
        this.firstName = firstName;
        LastName = lastName;
        this.email = email;
    }

    public long getEmpID() {
        return empID;
    }

    public void setEmpID(long empID) {
        this.empID = empID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
