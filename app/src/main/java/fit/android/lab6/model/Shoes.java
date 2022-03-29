package fit.android.lab6.model;

public class Shoes {
    private int id;
    private int imgShoes;
    private String discount;
    private String actionDetail;

    public Shoes(int id, int imgShoe, String discount, String actionDetail) {
        this.id = id;
        this.imgShoes = imgShoe;
        this.discount = discount;
        this.actionDetail = actionDetail;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getImgShoes() {
        return imgShoes;
    }

    public void setImgShoes(int imgShoe) {
        this.imgShoes = imgShoe;
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    public String getActionDetail() {
        return actionDetail;
    }

    public void setActionDetail(String actionDetail) {
        this.actionDetail = actionDetail;
    }
}
