import java.util.ArrayList;
import java.util.Scanner;

class Sach {
    String maSach;
    String tenSach;
    int soLuong;
    double donGia;

    void nhap(Scanner sc) {
        System.out.print("Nhap ma sach: ");
        maSach = sc.nextLine();

        System.out.print("Nhap ten sach: ");
        tenSach = sc.nextLine();

        System.out.print("Nhap so luong: ");
        soLuong = Integer.parseInt(sc.nextLine());

        System.out.print("Nhap don gia: ");
        donGia = Double.parseDouble(sc.nextLine());
    }

    void hienThi() {
        System.out.println("Ma sach: " + maSach);
        System.out.println("Ten sach: " + tenSach);
        System.out.println("So luong: " + soLuong);
        System.out.println("Don gia: " + donGia);
    }
}

public class main {

    static Scanner sc = new Scanner(System.in);

    static ArrayList<Sach> danhSachSach = new ArrayList<>();

    public static void mangSoLuong() {
        int[] soLuong = new int[5];
        int tong = 0;
        int lonNhat;

        System.out.println("\n===== MANG SO LUONG SACH =====");

        for (int i = 0; i < 5; i++) {
            System.out.print("Nhap so luong sach thu " + (i + 1) + ": ");
            soLuong[i] = Integer.parseInt(sc.nextLine());
            tong += soLuong[i];
        }

        lonNhat = soLuong[0];

        System.out.print("Danh sach so luong: ");

        for (int i = 0; i < 5; i++) {
            System.out.print(soLuong[i] + " ");

            if (soLuong[i] > lonNhat) {
                lonNhat = soLuong[i];
            }
        }

        System.out.println("\nTong so luong: " + tong);
        System.out.println("So luong lon nhat: " + lonNhat);
    }

    public static void quanLyMaSach() {
        ArrayList<String> maSach = new ArrayList<>();
        int chon;

        do {
            System.out.println("\n===== QUAN LY MA SACH =====");
            System.out.println("1. Them ma sach");
            System.out.println("2. Hien thi ma sach");
            System.out.println("3. Tim ma sach");
            System.out.println("4. Xoa ma sach");
            System.out.println("5. Quay lai");
            System.out.print("Nhap lua chon: ");

            chon = Integer.parseInt(sc.nextLine());

            switch (chon) {
                case 1:
                    System.out.print("Nhap ma sach: ");
                    maSach.add(sc.nextLine());
                    System.out.println("Them thanh cong!");
                    break;

                case 2:
                    if (maSach.size() == 0) {
                        System.out.println("Danh sach rong!");
                    } else {
                        for (int i = 0; i < maSach.size(); i++) {
                            System.out.println(maSach.get(i));
                        }
                    }
                    break;

                case 3:
                    System.out.print("Nhap ma sach can tim: ");
                    String maTim = sc.nextLine();
                    if (maSach.contains(maTim)) {
                        System.out.println("Tim thay ma sach!");
                    } else {
                        System.out.println("Khong tim thay!");
                    }
                    break;

                case 4:
                    System.out.print("Nhap ma sach can xoa: ");
                    String maXoa = sc.nextLine();

                    if (maSach.remove(maXoa)) {
                        System.out.println("Xoa thanh cong!");
                    } else {
                        System.out.println("Khong tim thay ma sach!");
                    }
                    break;

                case 5:
                    System.out.println("Quay lai menu chinh!");
                    break;

                default:
                    System.out.println("Lua chon khong hop le!");
            }

        } while (chon != 5);
    }

    public static void themSach() {
        Sach s = new Sach();
        s.nhap(sc);
        danhSachSach.add(s);

        System.out.println("Them sach thanh cong!");
    }

    public static void hienThiSach() {
        if (danhSachSach.size() == 0) {
            System.out.println("Danh sach sach rong!");
            return;
        }

        for (int i = 0; i < danhSachSach.size(); i++) {
            System.out.println("\nSach thu " + (i + 1));
            danhSachSach.get(i).hienThi();
        }
    }

    public static int timSach(String ma) {
        for (int i = 0; i < danhSachSach.size(); i++) {
            if (danhSachSach.get(i).maSach.equalsIgnoreCase(ma)) {
                return i;
            }
        }

        return -1;
    }

    public static void timKiemSach() {
        System.out.print("Nhap ma sach can tim: ");
        String ma = sc.nextLine();

        int viTri = timSach(ma);

        if (viTri != -1) {
            System.out.println("Tim thay sach:");
            danhSachSach.get(viTri).hienThi();
        } else {
            System.out.println("Khong tim thay sach!");
        }
    }

    public static void xoaSach() {
        System.out.print("Nhap ma sach can xoa: ");
        String ma = sc.nextLine();

        int viTri = timSach(ma);

        if (viTri != -1) {
            danhSachSach.remove(viTri);
            System.out.println("Xoa sach thanh cong!");
        } else {
            System.out.println("Khong tim thay sach!");
        }
    }

    public static void suaSach() {
        System.out.print("Nhap ma sach can sua: ");
        String ma = sc.nextLine();

        int viTri = timSach(ma);

        if (viTri != -1) {
            System.out.println("Nhap thong tin moi:");
            danhSachSach.get(viTri).nhap(sc);
            System.out.println("Sua sach thanh cong!");
        } else {
            System.out.println("Khong tim thay sach!");
        }
    }

    public static void tinhTongSoLuong() {
        int tong = 0;

        for (int i = 0; i < danhSachSach.size(); i++) {
            tong += danhSachSach.get(i).soLuong;
            }

        System.out.println("Tong so luong sach: " + tong);
    }

    public static void tinhTongGiaTri() {
        double tong = 0;

        for (int i = 0; i < danhSachSach.size(); i++) {
            tong += danhSachSach.get(i).soLuong
                    * danhSachSach.get(i).donGia;
        }

        System.out.println("Tong gia tri sach: " + tong);
    }

    public static void main(String[] args) {

        mangSoLuong();
        quanLyMaSach();

        int chon;

        do {
            System.out.println("\n===== QUAN LY SACH THU VIEN =====");
            System.out.println("1. Them sach");
            System.out.println("2. Hien thi sach");
            System.out.println("3. Tim sach");
            System.out.println("4. Xoa sach");
            System.out.println("5. Sua sach");
            System.out.println("6. Tinh tong so luong");
            System.out.println("7. Tinh tong gia tri");
            System.out.println("8. Thoat");
            System.out.print("Nhap lua chon: ");

            chon = Integer.parseInt(sc.nextLine());

            switch (chon) {
                case 1:
                    themSach();
                    break;

                case 2:
                    hienThiSach();
                    break;

                case 3:
                    timKiemSach();
                    break;

                case 4:
                    xoaSach();
                    break;

                case 5:
                    suaSach();
                    break;

                case 6:
                    tinhTongSoLuong();
                    break;

                case 7:
                    tinhTongGiaTri();
                    break;

                case 8:
                    System.out.println("Da thoat chuong trinh!");
                    break;

                default:
                    System.out.println("Lua chon khong hop le!");
            }

        } while (chon != 8);

        sc.close();
    }
}