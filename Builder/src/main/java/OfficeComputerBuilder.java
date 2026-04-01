public class OfficeComputerBuilder implements ComputerBuilder {
    private Computer computer;

    public OfficeComputerBuilder() {
        this.computer = new Computer();
    }

    @Override
    public void buildProcess() {
        computer.setProcessor("Power-Efficient Office Processor");
    }

    @Override
    public void buildRAM() {
        computer.setRamSize(8);
    }

    @Override
    public void buildHardDrive() {
        computer.setHardDrive("512GB SSD");
    }

    @Override
    public void buildGraphicsCard() {
        computer.setGraphicsCard("Integrated Graphics");
    }

    @Override
    public void buildOperatingSystem() {
        computer.setOperatingSystem("Office-Optimized OS");
    }

    @Override
    public Computer getComputer() {
        return this.computer;
    }
}
