public interface ComputerBuilder {
    void buildProcess();
    void buildRAM();
    void buildHardDrive();
    void buildGraphicsCard();
    void buildOperatingSystem();
    Computer getComputer();
}
