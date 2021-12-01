import java.util.Scanner;

class sinhvien {
    String hoten, lop;
    int namsinh, tuoi;

    sinhvien() {
    }

}

class themuon extends sinhvien {
    int sophieumuon, ngaymuon, hantra, sohieusach;

    themuon() {
        super();
    }

    void inTT() {
        System.out.println(
                "ten: " + hoten + "\nnam sinh: " + namsinh + "\ntuoi: " + tuoi
                        + "\nlop: " + lop);
        System.out.println(
                "so phieu muon: " + sohieusach + "\nngaymuon: " + ngaymuon
                        + "\nhan tra: " + hantra
                        + "\nso hieu sach: " + sohieusach);
    }
}

public class thuvien {
    public static void main(String[] args) {
        themuon tm = new themuon();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap thong tin the muon : ");
        tm.hoten = scanner.nextLine();
        tm.namsinh = scanner.nextInt();
        tm.tuoi = scanner.nextInt();
        tm.lop = scanner.nextLine();
        tm.sophieumuon = scanner.nextInt();
        tm.ngaymuon = scanner.nextInt();
        tm.hantra = scanner.nextInt();
        tm.sohieusach = scanner.nextInt();
        tm.inTT();
        scanner.close();
    }
}
