import java.util.Scanner;

public class CIRCLE {
    private POINT center;
    private int r;
    static Scanner sc = new Scanner(System.in);

    public CIRCLE() {
        center = new POINT();
        r = 0;
    }

    public CIRCLE(POINT p, int r) {
        center = new POINT(p.getX(), p.getY());
        this.r = r;
    }

    public POINT getCenter() {
        return center;
    }

    public void setCenter(POINT center) {
        this.center = center;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public double getArea() {
        double kq = r * r * 3.14;
        return kq;
    }

    public String toString() {
        return "Tam: " + center.toString() + "\n" +
                "Ban kinh: " + r;
    }

    public static void main(String[] args) {
        System.out.println("Tam duong tron: ");
        POINT p = new POINT();
        System.out.print("Nhap x: ");
        p.setX(Integer.parseInt(sc.nextLine()));
        System.out.print("Nhap y: ");
        p.setY(Integer.parseInt(sc.nextLine()));

        System.out.print("Nhap ban kinh: ");
        CIRCLE a = new CIRCLE(p, Integer.parseInt(sc.nextLine()));

        System.out.println(a);

        System.out.println("Dien tich: " + a.getArea());
    }

}
