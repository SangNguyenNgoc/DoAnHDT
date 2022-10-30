import java.util.Scanner;

public class LINE {
    private POINT A;
    private POINT B;
    static Scanner sc = new Scanner(System.in);

    public LINE() {
        A = new POINT();
        B = new POINT();
    }

    public LINE(POINT p1, POINT p2) {
        A = new POINT(p1.getX(), p1.getY());
        B = new POINT(p2.getX(), p2.getY());
    }

    public POINT getA() {
        return A;
    }

    public void setA(POINT a) {
        A = a;
    }

    public POINT getB() {
        return B;
    }

    public void setB(POINT b) {
        B = b;
    }

    public double Distance() {
        double x1 = A.getX(),
                x2 = B.getX(),
                y1 = A.getY(),
                y2 = B.getY();
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    private double xIntercrep() {
        double tu = A.getY() - B.getY();
        double mau = A.getX() - B.getX();
        if (mau == 0) {
            return A.getX();
        } else {
            double a = tu / mau;
            double b = B.getY() - a * B.getX();
            double kq = -b / a;
            return kq;
        }
    }

    private double yIntercrep() {
        double tu = A.getY() - B.getY();
        double mau = A.getX() - B.getX();
        double a = tu / mau;
        double b = B.getY() - a * B.getX();
        double kq = b;
        return kq;
    }

    public String toString() {
        return "Diem A: " + A.toString() + "\n" +
                "Diem B: " + B.toString();
    }

    public static void main(String[] args) {
        POINT a = new POINT();
        System.out.print("Nhap x: ");
        a.setX(Integer.parseInt(sc.nextLine()));
        System.out.print("Nhap y: ");
        a.setY(Integer.parseInt(sc.nextLine()));

        POINT b = new POINT();
        System.out.print("Nhap x: ");
        b.setX(Integer.parseInt(sc.nextLine()));
        System.out.print("Nhap y: ");
        b.setY(Integer.parseInt(sc.nextLine()));

        LINE ab = new LINE(a, b);

        System.out.println(ab);

        System.out.println("Do dai: " + ab.Distance());

        System.out.println("Chan x: " + "(" + ab.xIntercrep() + ",0)");
        System.out.println("Chan y: " + "(0," + ab.yIntercrep() + ")");

    }

}
