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


        System.out.println("\n--- THONG TIN SACH ---");
        System.out.println("Ma sach: " + maSach);
        System.out.println("Ten sach: " + tenSach);
        System.out.println("Tac gia: " + tacGia);
        System.out.println("Nam xuat ban: " + namXuatBan);
        System.out.println("Don gia: " + donGia);
        System.out.println("So luong: " + soLuong);



        System.out.println("\n--- KIEM TRA SACH ---");
        if (donGia <= 0) {
            System.out.println("Don gia khong hop le!");
        } else if (soLuong < 0) {
            System.out.println("So luong khong hop le!");
        } else if (namXuatBan <= 0 || namXuatBan > 2026) {
            System.out.println("Nam xuat ban khong hop le!");
        } else {
            System.out.println("Thong tin sach hop le!");


            double thanhTien = donGia * soLuong;
            System.out.println("Thanh tien: " + thanhTien);
            double phiVanChuyen = thanhTien * 0.05;
            System.out.println("Phi van chuyen: " + phiVanChuyen);
            double tongTien = thanhTien + phiVanChuyen;
            System.out.println("Tong tien nhap: " + tongTien);


            System.out.println("\n--- PHAN LOAI GIA ---");
            if (donGia < 50000) {
                System.out.println("Sach gia thap");
            } else if (donGia < 100000) {
                System.out.println("Sach gia trung binh");
            } else if (donGia <= 200000) {
                System.out.println("Sach gia cao");
            } else {
                System.out.println("Sach gia dac biet");
            }


            System.out.println("\n--- PHAN LOAI TON KHO ---");
            if (soLuong == 0) {
                System.out.println("Het sach");
            } else if (soLuong <= 5) {
                System.out.println("Sap het");
            } else if (soLuong <= 20) {
                System.out.println("Con it");
            } else {
                System.out.println("Con nhieu");
            }


            System.out.println("\n--- LOAI SACH ---");
            System.out.println("1. Sach giao khoa");
            System.out.println("2. Sach tham khao");
            System.out.println("3. Sach chuyen nganh");
            System.out.println("4. Sach khac");
            System.out.print("Chon loai sach (1-4): ");

            int loaiSach = Integer.parseInt(sc.nextLine());
            switch (loaiSach) {
                case 1:
                    System.out.println("Sach giao khoa");
                    break;
                case 2:
                    System.out.println("Sach tham khao");
                    break;
                case 3:
                    System.out.println("Sach chuyen nganh");
                    break;
                case 4:
                    System.out.println("Sach khac");
                    break;
                default:
                    System.out.println("Loai sach khong hop le!");
            }
        }

        sc.close();
    }
}