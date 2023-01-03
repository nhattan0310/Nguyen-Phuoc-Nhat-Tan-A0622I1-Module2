package ss16_read_write_file.thuc_hanh;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class CopyFile {
//    public static void coppyALl(File f0, File f0_coppy) {
//        try {
//            Files.copy(f0.toPath(), f0_coppy.toPath(), StandardCopyOption.REPLACE_EXISTING);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        if (f0.isDirectory()) {
//            File[] mangcon = f0.listFiles();
//            for (File file : mangcon) {
//                File file_new = new File(f0_coppy.getAbsoluteFile() + "/" + file.getName());
//                coppyALl(file, file_new);
//            }
//        }
//    }

    public static void main(String[] args) {
        File f0 = new File("D:\\CodeDao\\module2\\ss16_read_write_file\\thuc_hanh\\f0\\123.txt");
        File f0_coppy = new File("D:\\CodeDao\\module2\\ss16_read_write_file\\thuc_hanh\\f1\\123coppy.txt");
        try{
            Files.copy(f0.toPath(), f0_coppy.toPath(), StandardCopyOption.REPLACE_EXISTING);
            System.out.println("Coppy Success");
        } catch(IOException e){
            e.printStackTrace();
        }
//        CopyFile.coppyALl(f0,f0_coppy);

    }
}
