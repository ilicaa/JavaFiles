public class Item {
    private String name;
    private String supplier;
    private double buyPrice;
    private double sellPrice;

    public Item(String name, String supplier, double buyPrice, double sellPrice){
        this.name = name;
        this.supplier = supplier;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public String getName(){
        return name;
    }

    public String getSupplier(){
        return supplier;
    }

    public double getBuyPrice(){
        return buyPrice;
    }

    public double getSellPrice(){
        return sellPrice;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setSupplier(String supplier){
        this.supplier = supplier;
    }

    public void setBuyPrice(double buyPrice){
        this.buyPrice = buyPrice;
    }

    public void setSellPrice(double sellPrice){
        this.sellPrice = sellPrice;
    }

    public void zam(){
        this.sellPrice*=1.2;
    }

    public double profit(){
        return this.sellPrice-this.buyPrice;
    }
}
