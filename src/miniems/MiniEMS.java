package miniems;

import java.io.IOException;
import miniems.data.InputData;
import miniems.data.reader.JsonDataReader;
import miniems.data.reader.api.DataReader;

public class MiniEMS {
    public static void main(String[] args) {
        
        try {
            DataReader dataReader = new JsonDataReader();
            InputData inputData;

            while ((inputData = dataReader.readNext()) != null) {
                System.out.println("Record ID: " + inputData.getId());
                System.out.println("DateTime: " + inputData.getDatetime());
                System.out.println("Components: " + inputData.getComponents().keySet());
                System.out.println("----------------------");
            }

        } catch (IOException e) {
            System.out.print(e.toString());
        }
        
    }
}
