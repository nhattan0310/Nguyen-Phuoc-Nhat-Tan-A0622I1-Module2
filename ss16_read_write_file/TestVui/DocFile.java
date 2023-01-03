//package ss16_read_write_file.bai_tap;
//
//import java.io.*;
//public class DocFile {
//    public static void main(String[] args) {
//        String csvFile = "ss16_read_write_file\\bai_tap\\country.csv";
//        File file =new File(csvFile);
//        String line = "";
//
//        try(BufferedReader bufferedReader =new BufferedReader(new FileReader(csvFile)))
//        {
//            line = bufferedReader.readLine();
//            while ((line=bufferedReader.readLine())!=null && !line.isEmpty())
//            {
//                String fields[] =line.split(",");
//                System.out.println(fields[0]+fields[1]);
//            }
//        }catch (FileNotFoundException e){
//            e.printStackTrace();
//        }catch (IOException e){
//            e.printStackTrace();
//        }
//    }
//}