public class Employee {
    private String firstName;
    private String lastName;
    private int stavka;
    private int countDay;

    public Employee(String firstName, String lastName, int stavka, int countDay) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.stavka = stavka;
        this.countDay = countDay;
    }

    public int calculateSalary() {
        int salary;
        salary = stavka * countDay;
        return salary;
    }

    public int compare(Employee a) {
        int b = 0;
        if (this.stavka * this.countDay > a.countDay* a.stavka) {
            b = 1;
        } else if (this.stavka * this.countDay < a.countDay* a.stavka) {
            b = -1;
        } else b = 0;
        return b;
    }
}
