public class GamingComputerBuilder implements ComputerBuilder {
    private Computer computer;

    public GamingComputerBuilder() {
        this.computer = new Computer();
    }

    @Override
    public void buildProcess() {
        computer.setProcessor("High-Performance Gaming Processor");
    }

    @Override
    public void buildRAM() {
        computer.setRamSize(16);
    }

    @Override
    public void buildHardDrive() {
        computer.setHardDrive("1TB SSD");
    }

    @Override
    public void buildGraphicsCard() {
        computer.setGraphicsCard("Top-tier Graphics Card");
    }

    @Override
    public void buildOperatingSystem() {
        computer.setOperatingSystem("Gaming-Optimized OS");
    }

    @Override
    public Computer getComputer() {
        return this.computer;
    }
}
