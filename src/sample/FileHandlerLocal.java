package sample;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class FileHandlerLocal
{
    File file;
    database db;
    FileWriter fileWriter;
    BufferedWriter out;
    Scanner in;

    public void clear() throws Exception
    {
        PrintWriter writer=  new PrintWriter(new File("current.txt"));
        writer.write("");
        writer.close();
    }

    public void output(String id) throws Exception
    {
        User user = db.getUser(id);

        out.append(user.employeeNumber + ",");
        out.append(user.senorityValue + ",");
        out.append(user.lastName + ",");
        out.append(user.firstName + ",");
        out.append(user.position + ",");
        out.append(user.phoneNumber  + ",");
        out.append(user.SIN + ",");
        out.append(user.DOB + ",");
        out.append(user.gender + ",");
        out.append(user.address + ",");
        out.append(user.city  + ",");
        out.append(user.province + ",");
        out.append(user.postalCode + ",");
        out.append(user.monday + ",");
        out.append(user.tuesday + ",");
        out.append(user.wednesday + ",");
        out.append(user.thursday + ",");
        out.append(user.friday + ",");
        out.append(user.saturday + ",");
        out.append(user.sunday + ",");
        out.append(user.fullTimePartTime + ",");
        out.append(user.employmentType + ",");
        out.append(user.pay + ",");
        out.append(user.bankNumber + ",");
        out.append(user.transitNum + ",");
        out.append(user.accountNumber + ",");

        out.close();

    }

    public String getField(int column) throws Exception
    {
        in = new Scanner(file);
        String line = in.nextLine();

        String[] fields1 = line.split(",");
        ArrayList<String> fields2 = new ArrayList<>();
        for(String element : fields1){
            fields2.add(element);
        }

        in.close();
        return fields2.get(column);
    }

    public FileHandlerLocal() throws Exception
    {
        db = new database();
        file = new File("current.txt");
        fileWriter = new FileWriter(file, true);
        out = new BufferedWriter(fileWriter);
    }
}