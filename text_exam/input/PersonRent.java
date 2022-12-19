package text_exam.input;



import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class PersonRent implements Data {
    List<PersonRent> personRentList = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    @Override
    public void display() {
        for (PersonRent personRent:personRentList) {
            System.out.println(personRent.toString());
        }
    }

    @Override
    public void add() {
//        String cccd,
//        String hoTen,
//        Date gioiTinh,
//        boolean trangThai,
//        float minDienTich,
//        float maxDienTich,
//        Double minGiaTien,
//        Double maxGiaTien

    }
}
