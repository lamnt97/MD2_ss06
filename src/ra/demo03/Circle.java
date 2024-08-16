package ra.demo03;

public class Circle {
    private double r;
    public Circle() {
    }
    public Circle(double r) {
        this.r = r;
    }
    public double getS(){
        return 2*3.14*this.r;
    }

    //tính chu vi
    public double getC(){
        return 2*3.14*(this.r*2);
    }
    public void display(){
        System.out.println("Diện tích hình tròn: "+getS());
        System.out.println("Chu vi hình tròn: "+getC());
    }
}




























