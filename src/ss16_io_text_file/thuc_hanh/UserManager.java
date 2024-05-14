package ss16_io_text_file.thuc_hanh;

import ss16_io_text_file.thuc_hanh.User;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class UserManager {
    private static List<User> users;
    private static final String PATH = "src/ss16_io_text_file/thuc_hanh/users.txt";

    public UserManager() {
        users = new ArrayList<>();
        this.readDataToFile();
    }

    public void readDataToFile() {
        try {
            FileReader fileReader = new FileReader(PATH);
            BufferedReader br = new BufferedReader(fileReader);
            String line;
            while ((line = br.readLine()) != null) {
                String[] txt = line.split(",");
//                System.out.println(Arrays.toString(txt));
                User user = new User(txt[0], txt[1], txt[2]);
                users.add(user);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void writeDataToFile() {
        try {
            FileWriter fileWriter = new FileWriter(PATH);
            BufferedWriter bw = new BufferedWriter(fileWriter);
            for (User user : users) {
                String line = user.getUsername() + "," + user.getPassword() + "," + user.getEmail();
                bw.write(line);
                bw.newLine();
            }
            bw.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void showAll() {
        for (User user : users) {
            System.out.println(user);
        }
    }

    public void add(User user) {
        users.add(user);
        this.writeDataToFile();
    }


}
