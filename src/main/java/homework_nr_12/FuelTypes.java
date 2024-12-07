package homework_nr_12;

public enum FuelTypes {
    GASOLINE(true), DIESEL(true), LPG(false), CNG(false);

    private boolean isLiquid;

    FuelTypes(boolean isLiquid) {
        this.isLiquid = isLiquid;
    }

    public boolean isLiquidFuel() {
        return isLiquid;
    }

    public static void printFuelExamples() {
        System.out.println("GASOLINE is liquid: " + GASOLINE.isLiquidFuel());
        System.out.println("LPG is liquid: " + LPG.isLiquidFuel());
    }
}
