import java.util.Scanner;
// ==========================================
// 1. LOP DOI TUONG SACH (Dinh nghia chung)
// ==========================================
class Sach {
    String maSach;
    String tenSach;
    int soLuong;
    double gia;

    // Ham nhap thong tin 1 cuon sach
    public void nhapSach(Scanner scanner) {
        System.out.print("   + Nhap ma sach: ");
        maSach = scanner.nextLine();
        System.out.print("   + Nhap ten sach: ");
        tenSach = scanner.nextLine();
        System.out.print("   + Nhap so luong: ");
        soLuong = scanner.nextInt();
        System.out.print("   + Nhap gia tien: ");
        gia = scanner.nextDouble();
        scanner.nextLine(); // Doc bo ky tu enter thua
    }

    // Ham hien thi thong tin sach
    public void hienThi() {
        System.out.printf("   Ma: %-10s | Ten: %-25s | So luong: %-5d | Gia: %,.0f VND\n", 
                          maSach, tenSach, soLuong, gia);
    }
}

public class main {

    // ==========================================
    // CACH 1: LAM CO BAN 
    // ==========================================

    // Bai 1: Nhap n sach bang vong lap
    public static Sach[] bai1_NhapDanhSachSach(Scanner scanner) {
        System.out.println("\n--- BAI 1: NHAP DANH SACH SACH ---");
        System.out.print("Nhap so luong sach (n): ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Bo dong trong

        Sach[] ds = new Sach[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap thong tin cho cuon sach thu " + (i + 1) + ":");
            ds[i] = new Sach();
            ds[i].nhapSach(scanner);
        }
        return ds;
    }

    // Bai 2: Tinh tong so luong va tong gia tri sach
    public static void bai2_TinhTong(Sach[] ds) {
        System.out.println("\n--- BAI 2: TINH TONG SO LUONG VA GIA TRI ---");
        if (ds == null || ds.length == 0) {
            System.out.println("Chua co du lieu sach! Vui long nhap sach truoc.");
            return;
        }

        int tongSoLuong = 0;
        double tongGiaTri = 0;

        for (int i = 0; i < ds.length; i++) {
            tongSoLuong += ds[i].soLuong;
            tongGiaTri += (ds[i].soLuong * ds[i].gia);
        }

        System.out.println("-> Tong so luong sach hien co: " + tongSoLuong);
        System.out.printf("-> Tong gia tri kho sach: %,.0f VND\n", tongGiaTri);
    }

    // Bai 4: Tim sach theo ma
    public static void bai4_TimKiemTheoMa(Sach[] ds, Scanner scanner) {
        System.out.println("\n--- BAI 4: TIM SACH THEO MA ---");
        if (ds == null || ds.length == 0) {
            System.out.println("Chua co du lieu sach! Vui long nhap sach truoc.");
            return;
        }

        System.out.print("Nhap ma sach can tim: ");
        String maCanTim = scanner.nextLine();

        boolean timThay = false;
        for (int i = 0; i < ds.length; i++) 
            {
            if (ds[i].maSach.equalsIgnoreCase(maCanTim)) {
                System.out.println("-> Tim thay ket qua:");
                ds[i].hienThi();
                timThay = true;
                break; 
            }
        }

        if (!timThay) {
            System.out.println("-> Khong tim thay sach nao co ma: " + maCanTim);
        }
    }
    // ==========================================
    // Menu lap hoat động lien tuc - Bai 3
    // ==========================================
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Sach[] danhSach = null; // Mang luu tru danh sach sach
        int chon;

        // Vong lap do-while giu menu chay lien tuc den khi chon 0 (Thoat)
        do {
            System.out.println("\n==========================================");
            System.out.println("   CHUONG TRINH QUAN LY THU VIEN (TUAN 5) ");
            System.out.println("==========================================");
            System.out.println("1. Nhap danh sach n sach (Bai 1)");
            System.out.println("2. Xem danh sach & Tinh tong (Bai 2)");
            System.out.println("3. Tim kiem sach theo ma (Bai 4)");
            System.out.println("0. Thoat chuong trinh");
            System.out.println("------------------------------------------");
            System.out.print("Moi ban chon chuc nang (0-3): ");
            chon = scanner.nextInt();
            scanner.nextLine(); // Bo thua ky tu enter

            switch (chon) {
                case 1:
                    danhSach = bai1_NhapDanhSachSach(scanner);
                    break;
                case 2:
                    if (danhSach != null) {
                        System.out.println("\n--- DANH SACH SACH HIEN CO ---");
                        for (Sach s : danhSach) {
                            s.hienThi();
                        }
                    }
                    bai2_TinhTong(danhSach);
                    break;
                case 3:
                    bai4_TimKiemTheoMa(danhSach, scanner);
                    break;
                case 0:
                    System.out.println("Da thoat chuong trinh. Cam on ban!");
                    break;
                default:
                    System.out.println("Lua chon khong hop le, vui long chon lai tu 0 den 3!");
            }
        } while (chon != 0);
        scanner.close();
    }
}