package models;

public class DigitalProduct extends Product {
    private String downloadLink;
    private double fileSize;

    public DigitalProduct(String id, String name, String description, double price, int stock, String downloadLink, double fileSize) {
        super(id, name, description, price, stock);
        this.downloadLink = downloadLink;
        this.fileSize = fileSize;
    }

    public String getDownloadLink() {return downloadLink;}
    public double getFileSize() {return fileSize;}

    public void setDownloadLink(String downloadLink) {this.downloadLink = downloadLink;}

    public void setFileSize(double fileSize) {this.fileSize = fileSize;}

    @Override
    public String getProductType(){
        return "Digital";
    }

    @Override
    public String toString(){
        return super.toString() + String.format(" | File Size: %.2f MB", fileSize);
    }
}