/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author Ilham Hendra
 */
public class Product {
    private int produkId;
    private String produkName;
    private int produkPrice;
    private int produkStock;

    public Product(String produkName, int produkPrice, int productStock) {
        this.produkName = produkName;
        this.produkPrice = produkPrice;
        this.produkStock = productStock;
    }

    public Product(int produkId, String produkName, int produkPrice, int productStock) {
        this.produkId = produkId;
        this.produkName = produkName;
        this.produkPrice = produkPrice;
        this.produkStock = productStock;
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
    
    public int getProdukStock() {
        return produkStock;
    }

    public void setProdukStock(int produkStock) {
        this.produkStock = produkStock;
    }
}
