public class Tire extends Part {
    private int size;
    private double width;

    public Tire(int idPart, String manufacturerName, String model, int serialNumber, int size, double width) {
        setIdPart(idPart);
        setManufacturerName(manufacturerName);
        setModel(model);
        setSerialNumber(serialNumber);
        this.size = size;
        this.width = width;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void printInfo() {
        System.out.println(getIdPart() + "," + getManufacturerName() +
                "," + getModel() + "," + getSerialNumber() + "," + size + "," + width);
    }
}
