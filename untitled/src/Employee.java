public class Employee {
    private String firstName;
    private String lastName;
    private int salaryPerHours;
    private int countDay;

    public Employee(String firstName, String lastName, int stavka, int countDay) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salaryPerHours = stavka;
        this.countDay = countDay;
    }

    public int calculateSalary() {
        int salary;
        return salary = salaryPerHours * countDay;
    }

    public int compare(Employee a) {
        if (this.calculateSalary() > a.calculateSalary()) {
            return 1;
        } else if (this.calculateSalary() < a.calculateSalary()) {
            return  -1;
        } else return 0;
    }

    public int workingDay() {
        return this.countDay;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setCountDay(int countDay) {
        this.countDay = countDay;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

}
