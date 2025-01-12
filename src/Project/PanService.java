package Project;

import java.util.HashMap;
import java.util.Map;

// Application Functionality provide by app
public class PanService {
        private static Map<String, Pan> panMap = new HashMap<>();
        //Static block to Execute the Code
        static {
            panMap.put("123ABC1", new Pan("123ABC1", "12345678", "SBI", "STOCK,FUNDS"));
            panMap.put("123ABC2", new Pan("123ABC2", "12345679", "HDFC", "CRYPTO"));
            panMap.put("123ABC3", new Pan("123ABC3", "12345670", "ICICI", "GOLD "));
            panMap.put("123ABC4", new Pan("123ABC4", "12345671", "UNION", "STOCK,MUTUAL"));
        }

        public Pan getPanByNumber (String aadharNumber)
        {     // Method that Accept The AadharNumber and Return aadhar details That link to pan
            for(Pan pan: panMap.values()){
                if(pan.getAadharNumber().equals(aadharNumber)){
                    return pan;
                }
            }
            return null;//Jar nahi pan detail milale tar null Return Kara.
        }
    }

