
class point {
    double x, y;

    point() {
    }

    point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    double khoangcach(point p) {
        return Math.sqrt(Math.pow(this.x - p.x, 2) + Math.pow(this.y - p.y, 2));
    }
}

public class diem {
    public static void main(String[] args) {
        point diem1 = new point(3, 7);
        point diem2 = new point(9, 2);
        System.out.println("Khoang cach : " + diem1.khoangcach(diem2));
    }
}