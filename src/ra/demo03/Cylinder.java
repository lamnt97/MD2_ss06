package ra.demo03;

public class Cylinder extends Circle{
    private double height;

    public Cylinder() {
    }

    public Cylinder(double r, double height) {
        super(r);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolume() {
        return getS() * this.height; // Diện tích mặt đáy * chiều cao
    }
    public void displayInfo(){
        System.out.println("Cylinder chiều cao: " + getHeight());
        System.out.println("Cylinder thể tích: " + getVolume());
    }
}
