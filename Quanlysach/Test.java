import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        Sach sach1 = new Sach();

        sach1.setMaSach("S01");
        sach1.setTieuDe("Lap trinh Java");
        sach1.setTacGia("Nguyen Van A");
        sach1.setNamXuatBan(2024);
        sach1.setSoLuong(10);

        Sach sach2 = new Sach(
            "S02", "Co so du lieu", "Tran Thi B", 2023, 5
        );

        Sach sach3 = new Sach(sach1);
        sach3.setMaSach("S03");

        System.out.println("THONG TIN DOC BANG GETTER:");
        System.out.println("Ma sach: " + sach1.getMaSach());
        System.out.println("Tieu de: " + sach1.getTieuDe());
        System.out.println("Tac gia: " + sach1.getTacGia());
        System.out.println("Nam xuat ban: " + sach1.getNamXuatBan());
        System.out.println("So luong: " + sach1.getSoLuong());

        ArrayList<Sach> danhSach = new ArrayList<Sach>();

        danhSach.add(sach1);
        danhSach.add(sach2);
        danhSach.add(sach3);

        System.out.println("\nDANH SACH SACH:");

        for (int i = 0; i < danhSach.size(); i++) {
            danhSach.get(i).hienThiThongTin();
        }

        System.out.println("KIEM TRA DU LIEU SAI:");

        sach1.setNamXuatBan(0);
        sach1.setNamXuatBan(2027);
        sach1.setSoLuong(-5);

        System.out.println("\nTHONG TIN SAU KHI NHAP SAI:");
        sach1.hienThiThongTin();
    }
}