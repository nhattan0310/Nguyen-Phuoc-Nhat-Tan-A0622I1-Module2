package final_exam.modlee;

public class LoaiXe {
    private String maPhuongTien;
    private String tenPhuongTien;
    private String hangSanXuat;
    private int namSanXuat;
    private Double congSuat;
    private String dungTichXyLanh;

    public LoaiXe() {
    }

    public LoaiXe(String maPhuongTien,
                  String tenPhuongTien, String hangSanXuat, int namSanXuat, Double congSuat, String dungTichXyLanh) {
        this.maPhuongTien = maPhuongTien;
        this.tenPhuongTien = tenPhuongTien;
        this.hangSanXuat = hangSanXuat;
        this.namSanXuat = namSanXuat;
        this.congSuat = congSuat;
        this.dungTichXyLanh = dungTichXyLanh;
    }

    public String getMaPhuongTien() {
        return maPhuongTien;
    }

    public void setMaPhuongTien(String maPhuongTien) {
        this.maPhuongTien = maPhuongTien;
    }

    public String getTenPhuongTien() {
        return tenPhuongTien;
    }

    public void setTenPhuongTien(String tenPhuongTien) {
        this.tenPhuongTien = tenPhuongTien;
    }

    public String getHangSanXuat() {
        return hangSanXuat;
    }

    public void setHangSanXuat(String hangSanXuat) {
        this.hangSanXuat = hangSanXuat;
    }

    public int getNamSanXuat() {
        return namSanXuat;
    }

    public void setNamSanXuat(int namSanXuat) {
        this.namSanXuat = namSanXuat;
    }

    public Double getCongSuat() {
        return congSuat;
    }

    public void setCongSuat(Double congSuat) {
        this.congSuat = congSuat;
    }

    public String getDungTichXyLanh() {
        return dungTichXyLanh;
    }

    public void setDungTichXyLanh(String dungTichXyLanh) {
        this.dungTichXyLanh = dungTichXyLanh;
    }

    public void add() {
    }
}
