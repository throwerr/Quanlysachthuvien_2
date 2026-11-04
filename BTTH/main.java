import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String maSach, tenSach, tacGia;
        int namXuatBan, soLuong;
        double donGia;

        System.out.print("Nhap ma sach: ");
        maSach = sc.nextLine();

        System.out.print("Nhap ten sach: ");
        tenSach = sc.nextLine();

        System.out.print("Nhap tac gia: ");
        tacGia = sc.nextLine();

        System.out.print("Nhap nam xuat ban: ");
        namXuatBan = Integer.parseInt(sc.nextLine());

        System.out.print("Nhap don gia: ");
        donGia = Double.parseDouble(sc.nextLine());

        System.out.print("Nhap so luong: ");
        soLuong = Integer.parseInt(sc.nextLine());

        System.out.println("Ma sach: " + maSach);
        System.out.println("Ten sach: " + tenSach);
        System.out.println("Tac gia: " + tacGia);
        System.out.println("Nam xuat ban: " + namXuatBan);
        System.out.println("Don gia: " + donGia);
        System.out.println("So luong: " + soLuong);

        double thanhTien = donGia * soLuong;
        System.out.println("Thanh tien: " + thanhTien);

        double phiVanChuyen = thanhTien * 0.05;
        System.out.println("Phi van chuyen: " + phiVanChuyen);

        double tongTien = thanhTien + phiVanChuyen;
        System.out.println("Tong tien nhap: " + tongTien);

        sc.close();
    }
}