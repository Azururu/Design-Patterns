public class Employee extends Organization {
    private double salary;

    public Employee(String name, double salary) {
        super(name);
        this.salary = salary;
    }

    @Override
    public double getTotalSalary() {
        return salary;
    }

    @Override
    public void printXML(String indent) {
        System.out.println(indent + "<employee>");
        System.out.println(indent + "  <name>" + name + "</name>");
        System.out.println(indent + "  <salary>" + salary + "</salary>");
        System.out.println(indent + "</employee>");
    }
}
