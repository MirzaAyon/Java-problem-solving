//6. Create a program which will take input from users for registration and save the info to a json file.
// The system will require following user info:
//        Full Name, email, password, address, mobile no.


import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.util.Scanner;

public class WriteJsonList {
    public static void main(String[] args) throws IOException, ParseException, IOException, ParseException, org.json.simple.parser.ParseException {

        String fileName = "J:\\Batch 6\\java1234\\javaProblemSolving\\src\\main\\resources\\Information.json";

        JSONParser jsonParser = new JSONParser();
        Object obj = jsonParser.parse(new FileReader(fileName));
        JSONArray jsonArray = (JSONArray) obj;
        JSONObject studentObj = new JSONObject();

        Scanner input = new Scanner(System.in);

        System.out.println("Input FullName");
        studentObj.put("name", input.nextLine());
        System.out.println("Input Email");
        studentObj.put("email", input.nextLine());
        System.out.println("Input Password");
        studentObj.put("password", input.nextLine());
        System.out.println("Input Address");
        studentObj.put("address", input.nextLine());
        System.out.println("Input Mobile No");
        studentObj.put("mobile", input.nextLine());


        jsonArray.add(studentObj);
        FileWriter file = new FileWriter(fileName);
        file.write(jsonArray.toJSONString());
        file.flush();
        file.close();
        System.out.println("saved!");
        System.out.println(jsonArray);


    }
}
