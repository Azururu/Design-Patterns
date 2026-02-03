abstract class Organization {
    protected String name;

    public Organization(String name) {
        this.name = name;
    }

    public void add(Organization organization) {
        throw new UnsupportedOperationException();
    }

    public void remove(Organization organization) {
        throw new UnsupportedOperationException();
    }

    public abstract double getTotalSalary();
    public abstract void printXML(String indent);
}
