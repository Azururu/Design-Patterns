import java.util.ArrayList;
import java.util.List;

public class Department extends Organization {
    private List<Organization> children = new ArrayList<>();

    public Department(String name) {
        super(name);
    }

    @Override
    public void add(Organization component) {
        children.add(component);
    }

    @Override
    public void remove(Organization component) {
        children.remove(component);
    }

    @Override
    public double getTotalSalary() {
        double total = 0;
        for (Organization child : children) {
            total += child.getTotalSalary();
        }
        return total;
    }

    @Override
    public void printXML(String indent) {
        System.out.println(indent + "<department name=\"" + name + "\">");
        for (Organization child : children) {
            child.printXML(indent + "  ");
        }
        System.out.println(indent + "</department>");
    }
}
