import java.util.Scanner;

class phuc {
    double thuc, ao;

    phuc() {
    }

    phuc(double a, double b) {
        thuc = a;
        ao = b;
    }

    void nhapsophuc() {
        Scanner scanner = new Scanner(System.in);
        thuc = scanner.nextDouble();
        ao = scanner.nextDouble();
        scanner.close();
    }

    void insophuc() {
        System.out.println(ao + "i + " + thuc);
    }

    phuc congsophuc(phuc p) {
        phuc q = new phuc();
        q.thuc = this.thuc + p.thuc;
        q.ao = this.ao + q.ao;
        return q;
    }

    phuc nhansophuc(phuc p) {
        phuc nhan = new phuc();
        nhan.thuc = this.ao * p.ao * (-1) + this.thuc * p.thuc;
        nhan.ao = this.ao * p.thuc + this.thuc * p.ao;
        return nhan;
    }
}

public class sophuc {
    public static void main(String[] args) {
        phuc a = new phuc();
        phuc b = new phuc();
        a.nhapsophuc();
        b.nhapsophuc();
        System.out.println("Tong : " + a.congsophuc(b));
        System.out.println("Nhan : " + a.nhansophuc(b));
    }
}
