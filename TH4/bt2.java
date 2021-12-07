package TH4;

class Diem {
    int x, y;

    Diem() {
    }

    Diem(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void inTTDiem() {
        System.out.println("X = " + x + "; Y = " + y);
    }

    double tinhKhoangCachDiem(Diem d) {
        double a = Math.pow(x - d.x, 2);
        double b = Math.pow(y - d.y, 2);
        return Math.sqrt(a + b);
    }
}

public class bt2 {
    public static void main(String[] args) {
        Diem d1 = new Diem(3, 7);
        Diem d2 = new Diem(9, 3);
        System.out.println("Khoang cach d1 d2 : " + d1.tinhKhoangCachDiem(d2));
    }
}
