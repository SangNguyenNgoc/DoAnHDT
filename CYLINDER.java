public class CYLINDER extends CIRCLE {
    private int height;

    public CYLINDER() {
        super();
        height = 0;
    }

    public CYLINDER(POINT p, int R, int height) {
        super(p, R);
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double getArea() {
        return super.getArea();
    }

    public double getVolume() {
        return super.getArea() * height;
    }

    public String toString() {
        return super.toString() + "\n" +
                "Chieu cao: " + height;
    }

    public static void main(String[] args) {
        POINT a = new POINT();
        System.out.print("Nhap x: ");
        a.setX(Integer.parseInt(sc.nextLine()));
        System.out.print("Nhap y: ");
        a.setY(Integer.parseInt(sc.nextLine()));

        System.out.print("Nhap ban kinh: ");
        int r = Integer.parseInt(sc.nextLine());

        System.out.print("Nhap chieu cao: ");
        int h = Integer.parseInt(sc.nextLine());

        CYLINDER k = new CYLINDER(a, r, h);

        System.out.println(k);

        System.out.println("Dien tich day: " + k.getArea());
        System.out.println("The tich: " + k.getVolume());
    }
}
