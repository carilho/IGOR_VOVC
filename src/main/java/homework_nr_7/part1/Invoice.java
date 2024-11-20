package homework_nr_7.part1;

public class Invoice {
    String deviceModel;
    String productDescription;
    int productsBought;
    double productPrice;

    public Invoice(String deviceModel, String productDescription, int productsBought, double productPrice) {
        this.deviceModel = deviceModel;
        this.productDescription = productDescription;
        this.productsBought = productsBought;
        this.productPrice = productPrice;
    }

    public String getDeviceModel() {

        return deviceModel;
    }

    public void setDeviceModel(String deviceModel) {

        this.deviceModel = deviceModel;
    }

    public String getProductDescription() {

        return productDescription;
    }

    public void setProductDescription(String productDescription) {

        this.productDescription = productDescription;
    }

    public int getProductsBought() {

        return productsBought;
    }

    public void setProductsBought(int productsBought) {
        if (productsBought > 0) {
            this.productsBought = productsBought;
        } else {
            this.productsBought = 0;
        }
    }

    public double getProductPrice() {

        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        if (productPrice > 0) {
            this.productPrice = productPrice;
        } else {
            this.productPrice = 0.0;
        }
    }

    public double getAmount() {

        return productsBought * productPrice;
    }

    public static void main(String[] args) {
        Invoice invoice1 = new Invoice("Huawei P20", "Mobile phone", 123, 6200);
        System.out.println(invoice1.getAmount());
    }
}
