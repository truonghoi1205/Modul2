package benhan;

import benhan.BenhAn;

import java.util.Date;

public class BenhAnVip extends BenhAn {
    String loaiVIP;
    String thoiHanVIP;

    public BenhAnVip(String maBenhAn, String maBenhNhan, String tenBenhNhan, String ngayNhapVien, String ngayRaVien, String lyDo, String loaiVIP, String thoiHanVIP) {
        super(maBenhAn, maBenhNhan, tenBenhNhan, ngayNhapVien, ngayRaVien, lyDo);
        this.loaiVIP = loaiVIP;
        this.thoiHanVIP = thoiHanVIP;
    }
}
