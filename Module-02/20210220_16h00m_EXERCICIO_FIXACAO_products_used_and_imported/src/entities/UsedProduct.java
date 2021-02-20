package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product {

    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    private Date manufactureDate;

    public UsedProduct() {
        super();
    }

    public UsedProduct(String productName, Double productPrice, Date manufactureDate) {
        super(productName, productPrice);
        this.manufactureDate = manufactureDate;
    }

    public Date getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(Date manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    @Override
    public String priceTag() {

        return this.productName + " (used)" + " $ "
                + String.format("%.2f", this.productPrice) + " (Manufacture date: "
                + sdf.format(manufactureDate) + ")";
    }


}
