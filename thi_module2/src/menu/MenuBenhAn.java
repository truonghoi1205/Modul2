package menu;

import benhan.BenhAn;
import quanlibenhan.QuanLiBenhAn;
import validate.Validate;

import java.sql.SQLOutput;

public class MenuBenhAn {
    QuanLiBenhAn quanLiBenhAn = new QuanLiBenhAn();

    public void menu() {
        int choice;
        while (true) {
            System.out.println("--CHƯƠNG TRÌNH QUẢN LÍ BỆNH ÁN--");
            System.out.println("Chọn chức năng theo số (để tiếp tục):");
            System.out.println("1.Thêm mới");
            System.out.println("2.Xoá");
            System.out.println("3.Xem danh sách bệnh án");
            System.out.println("4.Thoát");
            System.out.println("Chọn chức năng:");
            choice = Validate.getInt();
            switch (choice) {
                case 1:
                    add();
                    break;
                case 2:
                    delete();
                    break;
                case 3:
                    showAll();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Không có lựa chọn này");
            }
        }
    }

    public void add() {
        String maBenhAn = quanLiBenhAn.inputValidMaBenhAn();
        String maBenhNhan = quanLiBenhAn.inputValidMaBenhNhan();
        String tenBenhNhan = quanLiBenhAn.inputValidTenBenhNhan();
        String ngayNhapVien = quanLiBenhAn.inputValidNgayNhapVien();
        String ngayRaVien = quanLiBenhAn.inputValidNgayXuatVien();
        String lyDoNhapVien = quanLiBenhAn.inputValidLyDoNhapVien();

        BenhAn benhAn = new BenhAn(maBenhAn, maBenhNhan, tenBenhNhan, ngayNhapVien, ngayRaVien, lyDoNhapVien);
        quanLiBenhAn.add(benhAn);
        System.out.println("Thêm thành công");
    }

    public void showAll() {
        System.out.println("Danh sách bệnh án");
        quanLiBenhAn.showBenhAn();
    }

    public void delete() {
        if (quanLiBenhAn.benhAnList.isEmpty()) {
            System.out.println("Không có bệnh án nào để xóa. Vui lòng thêm bệnh án:");
            return;
        }
        BenhAn benhAn = null;
        String maBenhAn;
        System.out.println("Nhập mã bệnh án muốn xóa:");
        while (benhAn == null) {
            maBenhAn = Validate.getText();
            benhAn = quanLiBenhAn.findBenhAnByMaBenhAn(maBenhAn);
            if (maBenhAn.isEmpty()) {
                return;
            }
            if (benhAn == null) {
                System.out.println("không tìm thaays ma bệnh án trên");
                System.out.println("Vui lòng nhập lại");
            }
        }
        System.out.println("Yes or No");
        String enterYes = Validate.getText();
        String enterNo = Validate.getText();
        if (enterYes.equalsIgnoreCase("yes")) {
            quanLiBenhAn.deleteBenhAn(benhAn);
            System.out.println("Xóa thành công");
            showAll();
        } else if (enterNo.equalsIgnoreCase("no")) {
            menu();
        }
    }
}
