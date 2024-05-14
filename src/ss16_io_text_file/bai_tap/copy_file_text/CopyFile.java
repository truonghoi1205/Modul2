package ss16_io_text_file.bai_tap.copy_file_text;

import java.io.*;

public class CopyFile {
    public static void main(String[] args) {
        try {
            File sourceFile = new File("src/ss16_io_text_file/bai_tap/copy_file_text/sourceFile.txt");
            File targetFile = new File("src/ss16_io_text_file/bai_tap/copy_file_text/targetFile.txt");
           //source đọc file
            FileReader source = new FileReader(sourceFile);
            //ghi lại file cuả thằng source
            FileWriter target = new FileWriter(targetFile);
            //buff để đọc
            BufferedReader bufferedReader = new BufferedReader(source);
            //tạo 1 cái mảng lưu dữ liệu của thằng source
            String line;
            //buff để ghi
            BufferedWriter bufferedWriter = new BufferedWriter(target);

            while ((line = bufferedReader.readLine()) != null) {
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
