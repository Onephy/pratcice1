package mirea.gibo04.pr1;

public class Laptop {
    private int ram;
    private String name;
    private String cpu;
    private int GPU;

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getGPU() {
        return GPU;
    }

    public void setGPU(int GPU) {
        this.GPU = GPU;
    }

    public Laptop(int ram, String name, String cpu, int GPU) {
        this.ram = ram;
        this.name = name;
        this.cpu = cpu;
        this.GPU = GPU;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "ram=" + ram +
                ", name='" + name + '\'' +
                ", cpu='" + cpu + '\'' +
                ", GPU=" + GPU +
                '}';
    }
}
