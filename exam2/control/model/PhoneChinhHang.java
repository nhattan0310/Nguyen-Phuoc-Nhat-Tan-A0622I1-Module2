package exam2.control.model;

public class PhoneChinhHang extends Phone{
    private  int thoiGianBaoHanh;
    private String phamViBaoHanh;

    public PhoneChinhHang(int thoiGianBaoHanh, String phamViBaoHanh) {
        this.thoiGianBaoHanh = thoiGianBaoHanh;
        this.phamViBaoHanh = phamViBaoHanh;
    }

    public PhoneChinhHang(String tenDienThoai,
                          Double giaBan,
                          int soLuong,
                          String nhaSanXuat,
                          int thoiGianBaoHanh,
                          String phamViBaoHanh, int idDienThoai) {
        super(idDienThoai, tenDienThoai, giaBan, soLuong, nhaSanXuat);
        this.thoiGianBaoHanh = thoiGianBaoHanh;
        this.phamViBaoHanh = phamViBaoHanh;
    }

    public PhoneChinhHang() {
    }

    public PhoneChinhHang(int idDienThoai, String tenDienThoai, Double giaBan, int soLuong, String nhaSanXuat, int thoiGianBaoHanh, String phamViBaoHanh) {

    }

    public int getThoiGianBaoHanh() {
        return thoiGianBaoHanh;
    }

    public void setThoiGianBaoHanh(int thoiGianBaoHanh) {
        this.thoiGianBaoHanh = thoiGianBaoHanh;
    }

    public String getPhamViBaoHanh() {
        return phamViBaoHanh;
    }

    public void setPhamViBaoHanh(String phamViBaoHanh) {
        this.phamViBaoHanh = phamViBaoHanh;
    }

    @Override
    public String toString() {
        return "PhoneChinhHang" +
                super.toString()+
                "thoiGianBaoHanh=" + thoiGianBaoHanh +
                ", phamViBaoHanh='" + phamViBaoHanh + '\'' ;
    }
}
