package TH4;

class Toanhoc {
    int n;

    Toanhoc() {
    }

    public static boolean kiemtraNguyento(int n) {
        if (n < 2)
            return false;
        int x = (int) Math.sqrt(n);
        for (int i = 2; i <= x; ++i) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    static int daonguoc(int n) {
        int m = n;
        int s = 0;
        while (m > 0) {
            s = s * 10 + m % 10;
            m /= 10;
        }
        return s;
    }

    public static boolean kiemtraHoanhao(int n) {
        if (n == daonguoc(n))
            return true;
        return false;
    }

    public static boolean kiemtraChinhPhuong(int n) {
        int x = (int) Math.sqrt(n);
        if (x * x == n) {
            return true;
        }
        return false;
    }

    public static int tinhFibo(int n) {
        int[] a = new int[100];
        a[0] = 0;
        a[1] = 1;
        for (int i = 2; i <= n - 1; ++i) {
            a[i] = a[i - 1] + a[i - 2];
        }
        return a[n - 1];
    }

    public static double tinhTong(int n) {
        double s = 0;
        for (int i = 1; i <= n - 1; ++i) {
            s += (double) i / (i + 1);
        }
        return s;
    }

    public static double tinhTong(int n, int x, int k) {
        double s = 0;
        int gt = 1;
        for (int i = 1; i <= n; ++i) {
            gt *= i;
            s += (double) gt / (Math.pow(x, i) + ((i % 2 == 1) ? -1 : 1) * Math.pow(k, i));
        }
        return s;

    }

}

public class bt1 {
    public static void main(String[] args) {
        System.out.println("Tong : " + Toanhoc.tinhTong(10));
    }

}
