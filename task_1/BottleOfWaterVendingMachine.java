package task_1;

import java.util.List;

public class BottleOfWaterVendingMachine implements VendingMachine {
    private List<Product> productList;

    @Override
    public void initProduct(List<Product> productList) {
        this.productList = productList;
    }

    @Override
    public Product getProduct(String name) {
        for (Product item : productList) {
            if (item.getName().equals(name)) {
                return item;
            }
        }
        return null;
    }
}