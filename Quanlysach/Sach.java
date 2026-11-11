import java.util.Scanner;

public class Sach {
    private String maSach;
    private String tieuDe;
    private String tacGia;
    private int namXuatBan;
    private int soLuong;

    // Khoi tao khong doi
    public Sach() {
    }

    // Khoi tao co doi
    public Sach(String maSach, String tieuDe, String tacGia,
                int namXuatBan, int soLuong) {
        this.maSach = maSach;
        this.tieuDe = tieuDe;
        this.tacGia = tacGia;
        this.namXuatBan = namXuatBan;
        this.soLuong = soLuong;
    }

    // Khoi tao sao chep
    public Sach(Sach sach) {
        this.maSach = sach.maSach;
        this.tieuDe = sach.tieuDe;
        this.tacGia = sach.tacGia;
        this.namXuatBan = sach.namXuatBan;
        this.soLuong = sach.soLuong;
    }

    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public String getTieuDe() {
        return tieuDe;
    }

    public void setTieuDe(String tieuDe) {
        this.tieuDe = tieuDe;
    }

    public String getTacGia() {
        return tacGia;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    public int getNamXuatBan() {
        return namXuatBan;
    }

    public void setNamXuatBan(int namXuatBan) {
        this.namXuatBan = namXuatBan;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public void Nhap(Scanner sc) {
        System.out.print("Nhap ma sach: ");
        this.maSach = sc.nextLine();

        System.out.print("Nhap tieu de: ");
        this.tieuDe = sc.nextLine();

        System.out.print("Nhap tac gia: ");
        this.tacGia = sc.nextLine();

        System.out.print("Nhap nam xuat ban: ");
        this.namXuatBan = sc.nextInt();

        System.out.print("Nhap so luong: ");
        this.soLuong = sc.nextInt();

        sc.nextLine(); // Doc bo ky tu xuong dong
    }

    public void hienThiThongTin() {
        System.out.println("Ma sach: " + this.maSach);
        System.out.println("Tieu de: " + this.tieuDe);
        System.out.println("Tac gia: " + this.tacGia);
        System.out.println("Nam xuat ban: " + this.namXuatBan);
        System.out.println("So luong: " + this.soLuong);
        System.out.println("------------------------------");
    }
}