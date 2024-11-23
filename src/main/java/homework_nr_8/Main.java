package homework_nr_8;

public class Main {
    public static void main(String[] args) {

        WashingMachine w1 = new WashingMachine("LG", 2000,10);
        Microwave m1 = new Microwave("Samsung",1200, true);
        AirConditioner a1 = new AirConditioner("Daikin", 1500, 12000, true);

        Appliance[] appliances = new Appliance[]{
                w1, m1, a1
        };

        for (int i = 0; i != appliances.length; i++){
            appliances[i].displayInfo();
            if (appliances[i] instanceof WashingMachine){
                WashingMachine tempWashingMachine = (WashingMachine) appliances[i];
                System.out.println("This is a washing maсhine with a load capacity of " + tempWashingMachine.loadCapacity + " kg.");
        } else if (appliances[i] instanceof Microwave){
                Microwave tempMicrowave = (Microwave) appliances[i];
                System.out.println("This is a microwave with grill: " + tempMicrowave.hasGrill);
            } else if (appliances[i] instanceof AirConditioner){
            AirConditioner tempAir = (AirConditioner) appliances[i];
            System.out.println("This is an air conditioner with cooling power of " + tempAir.coolingPower + " BTU and inverter: " + tempAir.hasInverter);
        }
            System.out.println("--------------------");
        }

    }
}
