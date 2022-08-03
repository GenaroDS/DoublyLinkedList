public class Product {
    int code;
    String description;
    int price;

    public Product(int code, String description, int price) {
        this.code = code;
        this.description = description;
        this.price = price;
    }

    public int getCode() {
        return code;
    }

    public int getPrecio() {
        return price;
    }

    public String getDescripcion() {
        return description;
    }

    public String toString(){
        return "CODE: " + this.code + " -- product: " + this.description + " -- price: $" + this.price;
    }
}