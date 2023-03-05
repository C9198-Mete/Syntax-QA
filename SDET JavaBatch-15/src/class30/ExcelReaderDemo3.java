package class30;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ExcelReaderDemo3 {
    public static void main(String[] args) {

        LinkedHashMap<String,String> row1=new LinkedHashMap<>();
        row1.put("Name","Matt");
        row1.put("Age","33");
        row1.put("City","Atlanta");
        row1.put("Salary","125000");

        LinkedHashMap<String,String> row2=new LinkedHashMap<>();
        row2.put("Name","Hamid");
        row2.put("Age","27");
        row2.put("City","London");
        row2.put("Salary","110000");

        LinkedHashMap<String,String> row3=new LinkedHashMap<>();
        row3.put("Name","Sam");
        row3.put("Age","35");
        row3.put("City","Houston");
        row3.put("Salary","80000");

        List<Map<String,String>> allRows=new ArrayList<>();
        allRows.add(row1);
        allRows.add(row2);
        allRows.add(row3);

        System.out.println(allRows);


    }
}
