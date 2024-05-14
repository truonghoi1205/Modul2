package quanlibenhan;

import benhan.BenhAn;
import validate.Validate;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class QuanLiBenhAn {
    public List<BenhAn> benhAnList;
    private static final String PATH = "src/data/medical_records.csv";
    File file = new File(PATH);
    private static final String REGEX_MA_BENH_AN = "^BA-\\d{3}$";
    private static final String REGEX_MA_BENH_NHAN = "^BN-\\d{3}$";
    private static final String REGEX_NGAY = "^\\d{0,2}\\/\\d{0,2}\\/\\d{4}";

    public QuanLiBenhAn() {
        benhAnList = new ArrayList<>();
        readFile();
    }

    public void add(BenhAn benhAn) {
        benhAnList.add(benhAn);
        writeFile();
    }

    public String inputValidMaBenhAn() {
        Pattern pattern = Pattern.compile(REGEX_MA_BENH_AN);
        String maBenhAn;
        System.out.println("Nhập mã bệnh án mới");
        while (true) {
            maBenhAn = Validate.getText();
            Matcher matcher = pattern.matcher(maBenhAn);
            if (!matcher.matches()) {
                System.out.println("Mã bệnh án k đúng");
                System.out.println("Vui lòng nhập lại");
            }
            return maBenhAn;
        }

    }

    public String inputValidMaBenhNhan() {
        Pattern pattern = Pattern.compile(REGEX_MA_BENH_NHAN);
        String maBenhNhan;
        System.out.println("Nhập mã bệnh nhân mới:");
        while (true) {
            maBenhNhan = Validate.getText();
            Matcher matcher = pattern.matcher(maBenhNhan);
            if (!matcher.matches()) {
                System.out.println("Mã bệnh nhân k đúng");
                System.out.println("Vui lòng nhập lại");
            }
            return maBenhNhan;
        }
    }

    public String inputValidTenBenhNhan() {
        String tenBenhNhan = "";
        while (tenBenhNhan.isEmpty()) {
            System.out.println("Nhập tên bệnh nhân mới:");
            tenBenhNhan = Validate.getText();
        }
        return tenBenhNhan;
    }

    public String inputValidNgayNhapVien() {
        String ngayNhapVien;
        Pattern pattern = Pattern.compile(REGEX_NGAY);
        System.out.println("Nhập ngày nhập viện:");
        while (true) {
            ngayNhapVien = Validate.getText();
            Matcher matcher = pattern.matcher(ngayNhapVien);
            if (!matcher.matches()) {
                System.out.println("không đúng định dạng ngày, vui lòng nhập lại");
            }
            return ngayNhapVien;
        }

    }

    public String inputValidNgayXuatVien() {
        String ngayXuatVien = "";
        while (ngayXuatVien.isEmpty()) {
            System.out.println("Nhập ngày ra viện:");
            ngayXuatVien = Validate.getText();
        }
        return ngayXuatVien;
    }

    public String inputValidLyDoNhapVien() {
        String lyDo = "";
        while (lyDo.isEmpty()) {
            System.out.println("Lý do:");
            lyDo = Validate.getText();
        }
        return lyDo;
    }

    public void showBenhAn() {
        if (benhAnList.isEmpty()) {
            System.out.println("Khong có bệnh án nào");
        } else {
            for (BenhAn benhAn : benhAnList) {
                System.out.println(benhAn);
            }
        }
    }

    public BenhAn findBenhAnByMaBenhAn(String maBenhAn) {
        for (BenhAn benhAn : benhAnList) {
            if (benhAn.getMaBenhAn().equals(maBenhAn)) {
                return benhAn;
            }
        }
        return null;
    }

    public void deleteBenhAn(BenhAn benhAn) {
        benhAnList.remove(benhAn);
        writeFile();
    }

    public void writeFile() {
        try {
            FileWriter fileWriter = new FileWriter(PATH);
            BufferedWriter bw = new BufferedWriter(fileWriter);
            for (BenhAn benhAn : benhAnList) {
                String line = benhAn.getMaBenhAn() + "," + benhAn.getMaBenhNhan() + "," + benhAn.getTenBenhNhan() + "," + benhAn.getNgayNhapVien() + "," + benhAn.getNgayRaVien() + "," + benhAn.getLyDoNhapVien();
                bw.newLine();
                bw.write(line);
            }
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }
    }

    public void readFile() {
        try {
            FileReader fileReader = new FileReader(PATH);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] data = line.split(",");
                BenhAn benhAn = new BenhAn(data[0], data[1], data[2], data[3], data[4], data[5]);
                benhAnList.add(benhAn);
            }
        } catch (IOException ie) {
            System.out.println(ie.getMessage());
        }
    }
}
