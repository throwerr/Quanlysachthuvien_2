import java.util.Scanner;

public class SachThamKhao extends Sach {
    private double thue;

    public SachThamKhao() {
    }

    public SachThamKhao(String maSach, String ngayNhap, double donGia,
                       int soLuong, String nhaXuatBan, double thue) {
        super(maSach, ngayNhap, donGia, soLuong, nhaXuatBan);
        this.thue = thue;
    }

    public void Nhap(Scanner sc) {
        super.Nhap(sc);

        System.out.print("Nhap tien thue: ");
        thue = sc.nextDouble();
        sc.nextLine();
    }

    public double ThanhTien() {
        return soLuong * donGia + thue;
    }

    public void Xuat() {
        super.Xuat();
        System.out.println("Thue: " + thue);
        System.out.println("Thanh tien: " + ThanhTien());
        System.out.println("--------------------");
    }
}