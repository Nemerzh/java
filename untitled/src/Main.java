public class Main {
    public static void main(String[] args) {
        Employee worker1 = new Employee("Sasha", "Nev", 25, 20);
        Employee worker2 = new Employee("Pasha", "Low", 23, 19);
        System.out.println(worker1.getFirstName() + " " + worker1.getLastName() + " working days is " + worker1.workingDay());
        System.out.println(worker2.getFirstName() + " " + worker2.getLastName() + " working days is " + worker2.workingDay());
        if (worker1.compare(worker2) == 1) {
            System.out.println(worker1.getFirstName() + " earn more than " + worker2.getFirstName());
        } else if (worker1.compare(worker2) == -1) {
            System.out.println(worker2.getFirstName() + " earn more than " + worker1.getFirstName());
        } else System.out.println(worker1.getFirstName() + " earns as much as " + worker2.getFirstName());
    }
}