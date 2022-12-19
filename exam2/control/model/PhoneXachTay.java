package exam2.control.model;

public class PhoneXachTay extends Phone {
    private String quocGiaXachTay;
    private boolean trangThai = true;

    public PhoneXachTay() {
    }

    public PhoneXachTay(String quocGiaXachTay, boolean trangThai) {
        this.quocGiaXachTay = quocGiaXachTay;
        this.trangThai = trangThai;
    }

    public PhoneXachTay(String tenDienThoai, Double giaBan, int soLuong, String nhaSanXuat, String quocGiaXachTay, boolean trangThai) {
        super(tenDienThoai, giaBan, soLuong, nhaSanXuat);
        this.quocGiaXachTay = quocGiaXachTay;
        this.trangThai = trangThai;
    }

    public String getQuocGiaXachTay() {
        return quocGiaXachTay;
    }

    public void setQuocGiaXachTay(String quocGiaXachTay) {
        this.quocGiaXachTay = quocGiaXachTay;
    }

    public boolean isTrangThai() {
        return trangThai;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }

    @Override
    public String toString() {
        return "PhoneXachTay" +
                super.toString() +
                "quocGiaXachTay='" + quocGiaXachTay + '\'' +
                ", trangThai=" + trangThai;
    }
}
