import java.util.Scanner;

class dagiac {
    int socanh;
    double[] a = new double[100];

    dagiac() {
    }

    void nhapcanh() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so canh : ");
        socanh = scanner.nextInt();
        for (int i = 0; i < socanh; ++i) {
            a[i] = scanner.nextDouble();
        }
        scanner.close();
    }

    void hienthi() {
        for (int i = 0; i < socanh; ++i) {
            System.out.println("Canh " + (i + 1) + " : " + a[i]);
        }
    }

    void chuvi() {
        double s = 0;
        for (int i = 0; i < socanh; ++i) {
            s += a[i];
        }
        System.out.println("Chu vi : " + s);
    }
}

class tamgiac extends dagiac {
    double chuvi;

    tamgiac() {
        chuvi = 0;
        socanh = 3;
    }

    @Override
    void nhapcanh() {
        super.nhapcanh();
    }

    @Override
    void hienthi() {
        for (int i = 0; i < socanh; ++i) {
            System.out.println("Canh tam giac " + (i + 1) + " : " + a[i]);
        }
    }

    @Override
    void chuvi() {
        for (int i = 0; i < socanh; ++i) {
            chuvi += a[i];
        }
        System.out.println("Chu vi tam giac: " + chuvi);
    }

    void dientich() {
        double p = chuvi / 2;
        double dientich = Math.sqrt(p * (p - a[0]) * (p - a[1]) * (p - a[2]));
        System.out.println("Dien tich tam giac : " + dientich);
    }
}

public class nangcao {
    public static void main(String[] args) {
        tamgiac tg = new tamgiac();
        tg.nhapcanh();
        tg.chuvi();
        tg.dientich();
    }
}
