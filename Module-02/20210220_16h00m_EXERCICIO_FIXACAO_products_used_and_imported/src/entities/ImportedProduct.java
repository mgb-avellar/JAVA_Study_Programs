package entities;

public class ImportedProduct extends Product{

    private Double customFee;

    public ImportedProduct() {
        super();
    }

    public ImportedProduct(String productName, Double productPrice, Double customFee) {
        super(productName, productPrice);
        this.customFee = customFee;
    }

    public Double getCustomFee() {
        return customFee;
    }

    public void setCustomFee(Double customFee) {
        this.customFee = customFee;
    }

    public double totalPrice() {

        return super.productPrice + this.customFee;
    }

    @Override
    public String priceTag() {

        return this.productName + " $ " + String.format("%.2f", totalPrice()) + " (Customs fee: $ " +
                String.format("%.2f", this.customFee) + ")";
    }
}
