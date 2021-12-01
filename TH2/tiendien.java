
import java.util.Scanner;

class khachhang {
    String hoten, sonha, macongto;

    khachhang() {
    }

    void nhapTT() {
        System.out.println("Nhap thong tin chu ho : ");
        Scanner scanner = new Scanner(System.in);
        hoten = scanner.nextLine();
        sonha = scanner.nextLine();
        macongto = scanner.nextLine();
        scanner.close();
    }
}

class bienlai extends khachhang {
    int chisocu;
    int chisomoi;
    int sotienphaitra;

    bienlai() {
        super();
    }

    void nhapchiso() {
        System.out.println("Nhap so dien : ");
        Scanner scanner = new Scanner(System.in);
        chisocu = scanner.nextInt();
        chisomoi = scanner.nextInt();
        scanner.close();
    }

    void tiendien() {
        sotienphaitra = (chisomoi - chisocu) * 850000;
        System.out.println("Tien dien phai tra : " + sotienphaitra);
    }
}

public class tiendien {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        bienlai[] kh = new bienlai[100];
        for (int i = 0; i < n; ++i) {
            kh[i].nhapTT();
            kh[i].nhapchiso();
        }
        scanner.close();
    }
}
