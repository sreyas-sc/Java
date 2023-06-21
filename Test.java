import java.util.Scanner;

class CPU {
    double price;

    CPU(double price) {
        this.price = price;
    }

    static class Processor {
        int numberOfCores;
        String manufacturer;

        Processor(int n, String m) {
            numberOfCores = n;
            manufacturer = m;
        }
    }

    static class RAM {
        int memory;
        String manufacturer;

        RAM(int memory, String manufacturer) {
            this.memory = memory;
            this.manufacturer = manufacturer;
        }
    }
}

public class Programs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the CPU price: ");
        CPU cpu = new CPU(input.nextDouble());

        System.out.println("Enter the number of cores and CPU manufacturer: ");
        CPU.Processor processor = new CPU.Processor(input.nextInt(), input.next());

        System.out.println("Enter the RAM size and manufacturer: ");
        CPU.RAM ram = new CPU.RAM(input.nextInt(), input.next());

        System.out.println("CPU DETAILS: ");
        System.out.println("Price: " + cpu.price);
        System.out.println("CPU Cores: " + processor.numberOfCores);
        System.out.println("CPU Manufacturer: " + processor.manufacturer);
        System.out.println("RAM Size: " + ram.memory);
        System.out.println("RAM Manufacturer: " + ram.manufacturer);
    }
}
