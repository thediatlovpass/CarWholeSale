public class ExhaustPart extends Part {
    private boolean exhaustEmissionEU;

    public ExhaustPart(int idPart, String manufacturerName, String model, int serialNumber, boolean exhaustEmissionEU) {
        setIdPart(idPart);
        setManufacturerName(manufacturerName);
        setModel(model);
        setSerialNumber(serialNumber);
        this.exhaustEmissionEU = exhaustEmissionEU;
    }

    public boolean isExhaustEmissionEU() {
        return exhaustEmissionEU;
    }

    public void setExhaustEmissionEU(boolean exhaustEmissionEU) {
        this.exhaustEmissionEU = exhaustEmissionEU;
    }

    public void printInfo() {
        System.out.println(getIdPart() + "," + getManufacturerName() +
                "," + getModel() + "," + getSerialNumber() + "," + exhaustEmissionEU);
    }
}
