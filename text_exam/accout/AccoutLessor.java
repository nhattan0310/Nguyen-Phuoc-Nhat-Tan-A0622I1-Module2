package text_exam.accout;

import java.util.Date;

public class AccoutLessor extends Accout {
    private float dienTich ;
    private String diaChi;
    private int soNguoi;
    private Double giaTien;

    public AccoutLessor(float dienTich,
                        String diaChi,
                        int soNguoi,
                        Double giaTien) {
        this.dienTich = dienTich;
        this.diaChi = diaChi;
        this.soNguoi = soNguoi;
        this.giaTien = giaTien;
    }

    public AccoutLessor(String cccd, String hoTen, Date gioiTinh, boolean trangThai, float dienTich, String diaChi, int soNguoi, Double giaTien) {
        super(cccd, hoTen, gioiTinh, trangThai);
        this.dienTich = dienTich;
        this.diaChi = diaChi;
        this.soNguoi = soNguoi;
        this.giaTien = giaTien;
    }
    public AccoutLessor() {
    }

    public float getDienTich() {
        return dienTich;
    }

    public void setDienTich(float dienTich) {
        this.dienTich = dienTich;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public int getSoNguoi() {
        return soNguoi;
    }

    public void setSoNguoi(int soNguoi) {
        this.soNguoi = soNguoi;
    }

    public Double getGiaTien() {
        return giaTien;
    }

    public void setGiaTien(Double giaTien) {
        this.giaTien = giaTien;
    }

    public String getInfor() {
        return "AccoutRenter{"+super.toString() +
                "dienTich=" + dienTich +
                ", diaChi='" + diaChi + '\'' +
                ", soNguoi=" + soNguoi +
                ", giaTien=" + giaTien +
                '}';
    }
}
