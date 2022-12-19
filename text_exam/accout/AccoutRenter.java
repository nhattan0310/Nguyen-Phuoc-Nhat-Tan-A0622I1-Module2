package text_exam.accout;

import java.util.Date;

public class AccoutRenter extends  Accout {
    private float minDienTich;
    private float maxDienTich;
    private Double minGiaTien;
    private Double maxGiaTien;

    public AccoutRenter(float minDienTich,
                        float maxDienTich,
                        Double minGiaTien,
                        Double maxGiaTien) {
        this.minDienTich = minDienTich;
        this.maxDienTich = maxDienTich;
        this.minGiaTien = minGiaTien;
        this.maxGiaTien = maxGiaTien;
    }

    public AccoutRenter(String cccd,
                        String hoTen,
                        Date gioiTinh,
                        boolean trangThai,
                        float minDienTich,
                        float maxDienTich,
                        Double minGiaTien,
                        Double maxGiaTien) {
        super(cccd, hoTen, gioiTinh, trangThai);
        this.minDienTich = minDienTich;
        this.maxDienTich = maxDienTich;
        this.minGiaTien = minGiaTien;
        this.maxGiaTien = maxGiaTien;
    }

    public AccoutRenter() {
    }

    public float getMinDienTich() {
        return minDienTich;
    }

    public void setMinDienTich(float minDienTich) {
        this.minDienTich = minDienTich;
    }

    public float getMaxDienTich() {
        return maxDienTich;
    }

    public void setMaxDienTich(float maxDienTich) {
        this.maxDienTich = maxDienTich;
    }

    public Double getMinGiaTien() {
        return minGiaTien;
    }

    public void setMinGiaTien(Double minGiaTien) {
        this.minGiaTien = minGiaTien;
    }

    public Double getMaxGiaTien() {
        return maxGiaTien;
    }

    public void setMaxGiaTien(Double maxGiaTien) {
        this.maxGiaTien = maxGiaTien;
    }


    public String detInfor() {
        return "AccoutRenter{" +super.toString()+
                "minDienTich=" + minDienTich +
                ", maxDienTich=" + maxDienTich +
                ", minGiaTien=" + minGiaTien +
                ", maxGiaTien=" + maxGiaTien +
                '}';
    }
}
