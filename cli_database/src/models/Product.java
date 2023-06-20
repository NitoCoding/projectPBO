package models;

public class Product {

    private int produkId;
    private String produkName;
    private int produkPrice;

    public Product(String produkName, int produkPrice) {
        this.produkName = produkName;
        this.produkPrice = produkPrice;
    }

    public Product(int produkId, String produkName, int produkPrice) {
        this.produkId = produkId;
        this.produkName = produkName;
        this.produkPrice = produkPrice;
    }

    public int getProdukId() {
        return produkId;
    }

    public void setProdukId(int produkId) {
        this.produkId = produkId;
    }

    public String getProdukName() {
        return produkName;
    }

    public void setProdukName(String produkName) {
        this.produkName = produkName;
    }

    public int getProdukPrice() {
        return produkPrice;
    }

    public void setProdukPrice(int produkPrice) {
        this.produkPrice = produkPrice;
    }

}


