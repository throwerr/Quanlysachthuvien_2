import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<SachGiaoKhoa> dsGiaoKhoa =
                new ArrayList<SachGiaoKhoa>();

        ArrayList<SachThamKhao> dsThamKhao =
                new ArrayList<SachThamKhao>();

        System.out.print("Nhap so dau sach giao khoa: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("\nNhap sach giao khoa thu " + (i + 1));

            SachGiaoKhoa sach = new SachGiaoKhoa();
            sach.Nhap(sc);
            dsGiaoKhoa.add(sach);
        }

        System.out.print("\nNhap so dau sach tham khao: ");
        int m = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < m; i++) {
            System.out.println("\nNhap sach tham khao thu " + (i + 1));

            SachThamKhao sach = new SachThamKhao();
            sach.Nhap(sc);
            dsThamKhao.add(sach);
        }

        System.out.println("\n===== DANH SACH SACH GIAO KHOA =====");

        for (int i = 0; i < dsGiaoKhoa.size(); i++) {
            dsGiaoKhoa.get(i).Xuat();
        }

        System.out.println("\n===== DANH SACH SACH THAM KHAO =====");

        for (int i = 0; i < dsThamKhao.size(); i++) {
            dsThamKhao.get(i).Xuat();
        }

        double tongGiaoKhoa = 0;

        for (int i = 0; i < dsGiaoKhoa.size(); i++) {
            tongGiaoKhoa = tongGiaoKhoa
                    + dsGiaoKhoa.get(i).ThanhTien();
        }
        double tongThamKhao = 0;
        for (int i = 0; i < dsThamKhao.size(); i++) {
            tongThamKhao = tongThamKhao
                    + dsThamKhao.get(i).ThanhTien();
        }
        System.out.println("\nTong thanh tien sach giao khoa: "+ tongGiaoKhoa);
        System.out.println("Tong thanh tien sach tham khao: "+ tongThamKhao);
        double tongDonGia = 0;
        for (int i = 0; i < dsThamKhao.size(); i++) {
            tongDonGia = tongDonGia
                    + dsThamKhao.get(i).getDonGia();
        }
        if (dsThamKhao.size() > 0) {
            double trungBinh = tongDonGia / dsThamKhao.size();

            System.out.println("Trung binh don gia sach tham khao: "
                    + trungBinh);
        } else {
            System.out.println("Khong co sach tham khao de tinh trung binh.");
        }

        System.out.print("\nNhap nha xuat ban X can tim: ");
        String x = sc.nextLine();

        System.out.println("\n===== SACH GIAO KHOA CUA NXB " + x + " =====");

        boolean timThay = false;

        for (int i = 0; i < dsGiaoKhoa.size(); i++) {
            if (dsGiaoKhoa.get(i).getNhaXuatBan().equalsIgnoreCase(x)) {
                dsGiaoKhoa.get(i).Xuat();
                timThay = true;
            }
        }
        if (timThay == false) {
            System.out.println("Khong tim thay sach giao khoa cua nha xuat ban nay.");
        }
        sc.close();
    }
}