package Project;

import java.util.HashMap;
import java.util.Map;

public class AadharService {
    private static Map<String,Aadhar> aadharMap = new HashMap<>();
    static{
        aadharMap.put("12345678",new Aadhar("Rohit","12345678","mr.Santosh Dhumal","pune"));
        aadharMap.put("12345679",new Aadhar("Bob","12345679","mr.Michel","London"));
        aadharMap.put("12345670",new Aadhar("Alice","12345670","mr.John","UK"));
        aadharMap.put("12345671",new Aadhar("John","12345671","mr.Faraday","US"));
    }

    public Aadhar getAadharByNumber(String aadharNumber){     // Method that Accept The AadharNumber and Return aadhar details
        return aadharMap.get(aadharNumber);
    }
}
