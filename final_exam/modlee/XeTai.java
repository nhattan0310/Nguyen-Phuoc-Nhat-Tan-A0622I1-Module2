package final_exam.modlee;

public class XeTai extends LoaiXe {
    private Double trongTai;

    public XeTai() {
    }

    public XeTai(Double trongTai) {
        this.trongTai = trongTai;
    }

    public XeTai(String maPhuongTien, String tenPhuongTien, String hangSanXuat, int namSanXuat, Double congSuat, String dungTichXyLanh, Double trongTai) {
        super(maPhuongTien, tenPhuongTien, hangSanXuat, namSanXuat, congSuat, dungTichXyLanh);
        this.trongTai = trongTai;
    }
}
