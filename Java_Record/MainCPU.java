class CPU {
    double price;
    Processor processor;
    RAM ram;

    public CPU(double price) {
        this.price = price;
        this.processor = new Processor();
        this.ram = new RAM();
    }

    void displayInformation() {
        System.out.println("CPU Price: $" + price);
        System.out.println("Processor Information:");
        System.out.println("Number of Cores: " + processor.cores);
        System.out.println("Manufacturer: " + processor.manufacturer);
        System.out.println("RAM Information:");
        System.out.println("Memory: " + ram.memory + "GB");
        System.out.println("Manufacturer: " + ram.manufacturer);
    }

    class Processor {
        int cores;
        String manufacturer;

        public Processor() {
            cores = 4;
            manufacturer = "Intel";
        }
    }

    static class RAM {
        int memory;
        String manufacturer;

        public RAM() {
            memory = 8;
            manufacturer = "Kingston";
        }
    }
}

public class MainCPU {
    public static void main(String[] args) {
        CPU cpu = new CPU(500.0);
        cpu.displayInformation();
    }
}
