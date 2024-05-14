package benhan;

import benhan.BenhAn;

public class BenhAnThuong extends BenhAn {
    int phiNamVien;

    public BenhAnThuong(String maBenhAn, String maBenhNhan, String tenBenhNhan, String ngayNhapVien, String ngayRaVien, String lyDo, int phiNamVien) {
        super(maBenhAn, maBenhNhan, tenBenhNhan, ngayNhapVien, ngayRaVien, lyDo);
        this.phiNamVien = phiNamVien;

    }
}
