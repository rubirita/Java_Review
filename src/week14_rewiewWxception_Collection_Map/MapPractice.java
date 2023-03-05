package week14_rewiewWxception_Collection_Map;

import java.util.HashMap;
import java.util.Map;

public class MapPractice {
    public static void main(String[] args) {

        Map<String, String> properties=new HashMap<>();

        properties.put("browser", "chrome");
        properties.put("cydeo.url", "https://www.cydeo.com");
        properties.put("dice.url", "https://www.dice.com");
        //properties.put("calculator.url", "https://www.calculator.net");
       // properties.put("percentage.url", "https://percentagecalculator.net/");
        //properties.put("web.table.username", "https://web-table-2.cydeo.com/login");
        //properties.put("web.table.username","Test");
        //properties.put("web.table.pw","Tester");

        properties.put("username","helpdesk1@cydeo.com");
        properties.put("password", "UserUser");


        System.out.println(properties);

        System.out.println(properties.get("browser")); // koji browser je u pitanju

        String browser=properties.get("browser");

        if (browser.equals("chrome")){
            System.out.println("Chrome Driver is selected");
        } else if (browser.equals("fireforx")) {
            System.out.println("Firefox Drive is set");
        }else {
            throw new RuntimeException("Invalid browser"); // nije chrome i nije ocekivani browser, namerno stavimo exception da obustavi
        }


        System.out.println(properties.get("cydeo.url"));



    }
}
/*
# Environment:
browser=chrome
cydeo.url= https://www.cydeo.com
dice.url= https://www.dice.com
calculator.url= https://www.calculator.net
percentage.url= https://percentagecalculator.net/
web.table.url= https://web-table-2.cydeo.com/login
web.table.username=Test
web.table.pw=Tester

username=helpdesk1@cydeo.com
password=UserUser
 */