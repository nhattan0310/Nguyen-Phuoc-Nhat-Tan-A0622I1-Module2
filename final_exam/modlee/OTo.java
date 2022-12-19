package final_exam.modlee;

public class OTo extends LoaiXe{
    private int soChoNgoi;
    private String loaiDongCo;

    public OTo() {
    }

    public OTo(int soChoNgoi, String loaiDongCo) {
        this.soChoNgoi = soChoNgoi;
        this.loaiDongCo = loaiDongCo;
    }

    public OTo(String maPhuongTien,
               String tenPhuongTien,
               String hangSanXuat,
               int namSanXuat,
               Double congSuat,
               String dungTichXyLanh,
               int soChoNgoi,
               String loaiDongCo) {
        super(maPhuongTien, tenPhuongTien, hangSanXuat, namSanXuat, congSuat, dungTichXyLanh);
        this.soChoNgoi = soChoNgoi;
        this.loaiDongCo = loaiDongCo;
    }
}
