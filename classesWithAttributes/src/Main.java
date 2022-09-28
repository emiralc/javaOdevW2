import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        //Product product=new Product(5,"Laptop","Asus Laptop",15000,4,"Siyah");
        Product product=new Product();
        //product.name="Laptop";
        //product.id=1;
        //product.description="Asus Laptop";
        //product.price=15000;
        //product.stockAmount=3;
        product.setId(5);
        product.setName("Laptop");
        product.setDescription("Asus Laptop");
        product.setPrice(15000);
        product.setStockAmount(3);

        System.out.println(product.getKod());
        ProductManager productManager=new ProductManager();
        productManager.Add(product);











    }
}