package TH4;

import java.util.Scanner;

class sophuc {
    double phanThuc, phanAo;

    sophuc() {
    }

    sophuc(double thuc, double ao) {
        phanAo = ao;
        phanThuc = thuc;
    }

    void nhapSoPhuc() {
        Scanner scanner = new Scanner(System.in);
        phanAo = scanner.nextDouble();
        phanThuc = scanner.nextDouble();
        scanner.close();
    }

    void inSoPhuc() {
        System.out.printf("%di + %d", phanAo, phanThuc);
    }

    sophuc congSoPhuc(sophuc s) {
        sophuc a = new sophuc();
        a.phanAo = phanAo + s.phanAo;
        a.phanThuc = phanThuc + s.phanThuc;
        return a;
    }

    sophuc nhanSoPhuc(sophuc s) {

        sophuc a = new sophuc();
        a.phanAo = phanAo * s.phanThuc + phanThuc * s.phanAo;
        a.phanThuc = -1 * phanAo * s.phanAo + phanThuc * s.phanThuc;
        return a;

    }
}

public class btnc {
    public static void main(String[] args) {
        sophuc a = new sophuc();
        sophuc b = new sophuc();
        a.nhapSoPhuc();
        b.nhapSoPhuc();
        sophuc c1 = new sophuc();
        c1 = a.congSoPhuc(b);
        sophuc c2 = new sophuc();
        c2 = a.nhanSoPhuc(b);
        c1.inSoPhuc();
        c2.inSoPhuc();
    }
}
