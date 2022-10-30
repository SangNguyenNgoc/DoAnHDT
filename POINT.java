import java.util.Scanner;

public class POINT {
    private int x;
    private int y;
    static Scanner sc = new Scanner(System.in);

    public POINT() {
        x = 0;
        y = 0;
    }

    public POINT(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double Distance(POINT p) {
        double x1 = p.x,
                x2 = this.x,
                y1 = p.y,
                y2 = this.y;
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public String toString() {
        return "(x,y) = " + "(" + getX() + "," + getY() + ")";
    }

    public static void main(String[] args) {
        POINT a = new POINT();
        System.out.print("Nhap x: ");
        a.setX(Integer.parseInt(sc.nextLine()));
        System.out.print("Nhap y: ");
        a.setY(Integer.parseInt(sc.nextLine()));

        System.out.println(a);

        POINT p = new POINT();
        System.out.print("Nhap x: ");
        p.setX(Integer.parseInt(sc.nextLine()));
        System.out.print("Nhap y: ");
        p.setY(Integer.parseInt(sc.nextLine()));

        System.out.println("Khoang cach giua a va p: " + a.Distance(p));

    }

}
