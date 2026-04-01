public class Main {
    public static void main(String[] args) {
        ComputerBuilder officeBuilder = new OfficeComputerBuilder();
        ComputerBuilder gamingBuilder = new GamingComputerBuilder();
        ComputerDirector director;

        director = new ComputerDirector(officeBuilder);
        director.constructComputer();
        Computer officeComputer = officeBuilder.getComputer();

        director = new ComputerDirector(gamingBuilder);
        director.constructComputer();
        Computer gamingComputer = gamingBuilder.getComputer();

        System.out.println("Office Computer:");
        System.out.println(officeComputer);
        System.out.println("\nGaming Computer:");
        System.out.println(gamingComputer);
    }
}