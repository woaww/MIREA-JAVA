package pr2.task4;

import java.util.Scanner;

public class Computer {
    String name, cpu, gpu, motherboard;
    int ram = 0, ssd = 0;

    public Computer(){};
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setCPU(String cpu){
        this.cpu = cpu;
    }
    public String getCPU(){
        return cpu;
    }
    public void setGPU(String gpu){
        this.gpu = gpu;
    }
    public String getGPU(){
        return gpu;
    }
    public void setMB(String motherboard){
        this.motherboard = motherboard;
    }
    public String getMB(){
        return motherboard;
    }
    public void setSSD(int ssd){
        this.ssd = ssd;
    }
    public int getSSD(){
        return ssd;
    }
    public void setRAM(int ram){
        this.ram = ram;
    }
    public int getRAM(){
        return ram;
    }
    public String showComputer(){
        return "Название: " + name + "\nCPU: " + cpu + "\nGPU: " + gpu + "\nmotherboard: " + motherboard + "\nSSD: " + ssd + " Гб\nRAM: " + ram + " Гб\n";
    }
    public void fillComputer(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Name: ");
        this.name = scanner.nextLine();
        System.out.print("CPU: ");
        this.cpu = scanner.nextLine();
        System.out.print("GPU: ");
        this.gpu = scanner.nextLine();
        System.out.print("Motherboard: ");
        this.motherboard = scanner.nextLine();
        System.out.print("SSD: ");
        this.ssd = scanner.nextInt();
        System.out.print("RAM: ");
        this.ram = scanner.nextInt();
    }
}
