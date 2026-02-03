public class Main {
    public static void main(String[] args) {
        Department organization = new Department("Organization");

        Department it = new Department("IT");
        Department hr = new Department("HR");

        Employee e1 = new Employee("Bob", 4000);
        Employee e2 = new Employee("Rick", 3500);
        Employee e3 = new Employee("Carl", 3000);

        it.add(e1);
        it.add(e2);
        hr.add(e3);

        organization.add(it);
        organization.add(hr);
        System.out.println("Total salary: " + organization.getTotalSalary());

        organization.printXML("");

        it.remove(e2);
        System.out.println("Total salary: " + organization.getTotalSalary());
        organization.printXML("");
    }
}
