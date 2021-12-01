import java.util.Scanner;

public class nguoi {
    String hoTen, diaChi;
    int namSinh;

    nguoi() {
    }

    void nhapTT() {
        Scanner scanner = new Scanner(System.in);
        hoTen = scanner.nextLine();
        diaChi = scanner.nextLine();
        namSinh = scanner.nextInt();
        scanner.close();
    }

    void inTT() {
        System.out.println("hoten : " + hoTen + "\ndiachi : " + diaChi + "\nnam sinh : " + namSinh);
    }

    public static void main(String[] args) {
        nguoi person = new nguoi();
        person.nhapTT();
        person.inTT();
    }
}