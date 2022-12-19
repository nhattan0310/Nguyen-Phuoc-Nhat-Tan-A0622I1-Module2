package text_exam.accout;

import java.util.Date;

public abstract class Accout {
    private String cccd;
    private String hoTen;
    private Date gioiTinh;
    private boolean trangThai=false;

    public Accout() {
    }

    public Accout(String cccd,
                  String hoTen,
                  Date gioiTinh,
                  boolean trangThai) {
        this.cccd = cccd;
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.trangThai = trangThai;
    }

    public String getCccd() {
        return cccd;
    }

    public void setCccd(String cccd) {
        this.cccd = cccd;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public Date getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(Date gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public boolean isTrangThai() {
        return trangThai;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }
}
