// Bài thực hành tuần 7
import java.util.ArrayList;
import java.util.Scanner;

// YEU CAU 3: Xay dung lop Test de tao doi tuong tu lop Sach
public class Test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ===== YEU CAU 3: TAO DOI TUONG TU LOP SACH =====

        // Tao sach1 bang constructor khong doi va gan gia tri bang set
        Sach sach1 = new Sach();
        sach1.setMaSach("S01");
        sach1.setTieuDe("Lap trinh Java");
        sach1.setTacGia("Nguyen Van A");
        sach1.setNamXuatBan(2024);
        sach1.setSoLuong(10);

        // Tao sach2 bang constructor co doi
        Sach sach2 = new Sach(
            "S02", "Co so du lieu", "Tran Thi B", 2023, 5
        );

        // Tao sach3 bang constructor sao chep
        Sach sach3 = new Sach(sach1);
        sach3.setMaSach("S03");

        // Goi phuong thuc cua YEU CAU 2 de hien thi thong tin
        System.out.println("===== THONG TIN CAC SACH DA TAO =====");
        sach1.hienThiThongTin();
        sach2.hienThiThongTin();
        sach3.hienThiThongTin();

        // ===== YEU CAU 4: TAO VA QUAN LY DANH SACH BANG ARRAYLIST =====

        // YEU CAU 4: Tao danh sach chua cac doi tuong Sach
        ArrayList<Sach> danhSach = new ArrayList<Sach>();

        // YEU CAU 4: Them cac sach da tao vao danh sach
        danhSach.add(sach1);
        danhSach.add(sach2);
        danhSach.add(sach3);

        int chon;

        // YEU CAU 4: Menu quan ly danh sach sach
        do {
            System.out.println("\n===== QUAN LY SACH =====");
            System.out.println("1. Them sach");
            System.out.println("2. Hien thi danh sach sach");
            System.out.println("3. Tim sach theo ma");
            System.out.println("4. Xoa sach theo ma");
            System.out.println("0. Thoat");
            System.out.print("Nhap lua chon: ");

            chon = sc.nextInt();
            sc.nextLine();

            switch (chon) {
                case 1: {
                    // YEU CAU 4: Nhap va them sach vao ArrayList
                    Sach sachMoi = new Sach();
                    sachMoi.Nhap(sc);

                    boolean trungMa = false;

                    for (Sach sach : danhSach) {
                        if (sach.getMaSach().equalsIgnoreCase(
                                sachMoi.getMaSach())) {
                            trungMa = true;
                            break;
                        }
                    }

                    if (trungMa) {
                        System.out.println("Ma sach da ton tai!");
                    } else {
                        danhSach.add(sachMoi);
                        System.out.println("Them sach thanh cong!");
                    }
                    break;
                }

                case 2: {
                    // YEU CAU 4: Duyet va hien thi danh sach sach
                    if (danhSach.isEmpty()) {
                        System.out.println("Danh sach rong!");
                    } else {
                        System.out.println("\n===== DANH SACH SACH =====");

                        for (Sach sach : danhSach) {
                            sach.hienThiThongTin();
                        }

                        System.out.println(
                            "Tong so dau sach: " + danhSach.size()
                        );
                    }
                    break;
                }

                case 3: {
                    // YEU CAU 4: Tim sach trong danh sach theo ma
                    System.out.print("Nhap ma sach can tim: ");
                    String maCanTim = sc.nextLine();

                    boolean timThay = false;

                    for (Sach sach : danhSach) {
                        if (sach.getMaSach().equalsIgnoreCase(maCanTim)) {
                            sach.hienThiThongTin();
                            timThay = true;
                            break;
                        }
                    }

                    if (!timThay) {
                        System.out.println("Khong tim thay sach!");
                    }
                    break;
                }

                case 4: {
                    // YEU CAU 4: Xoa sach khoi danh sach theo ma
                    System.out.print("Nhap ma sach can xoa: ");
                    String maCanXoa = sc.nextLine();

                    boolean daXoa = false;

                    for (int i = 0; i < danhSach.size(); i++) {
                        if (danhSach.get(i).getMaSach()
                                .equalsIgnoreCase(maCanXoa)) {
                            danhSach.remove(i);
                            daXoa = true;
                            break;
                        }
                    }
                    if (daXoa) {
                        System.out.println("Xoa sach thanh cong!");
                    } else {
                        System.out.println("Khong tim thay sach!");
                    }
                    break;
                }
                case 0:
                    System.out.println("Da thoat chuong trinh.");
                    break;

                default:
                    System.out.println("Lua chon khong hop le!");
            }
        } while (chon != 0);
        sc.close();
    }
}
