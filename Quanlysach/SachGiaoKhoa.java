import java.util.Scanner;

public class SachGiaoKhoa extends Sach {
    private String tinhTrang;

    public SachGiaoKhoa() {
    }

    public SachGiaoKhoa(String maSach, String ngayNhap, double donGia,
                       int soLuong, String nhaXuatBan, String tinhTrang) {
        super(maSach, ngayNhap, donGia, soLuong, nhaXuatBan);
        this.tinhTrang = tinhTrang;
    }

    public void Nhap(Scanner sc) {
        super.Nhap(sc);

        do {
            System.out.print("Nhap tinh trang (moi/cu): ");
            tinhTrang = sc.nextLine();
        } while (!tinhTrang.equalsIgnoreCase("moi")
                && !tinhTrang.equalsIgnoreCase("cu"));
    }

    public double ThanhTien() {
        if (tinhTrang.equalsIgnoreCase("moi")) {
            return soLuong * donGia;
        } else {
            return soLuong * donGia * 0.5;
        }
    }

    public void Xuat() {
        super.Xuat();
        System.out.println("Tinh trang: " + tinhTrang);
        System.out.println("Thanh tien: " + ThanhTien());
        System.out.println("--------------------");
    }
}