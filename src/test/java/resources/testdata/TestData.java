package resources.testdata;

import org.testng.annotations.DataProvider;

/**
 * Created by Bhavesh
 */
public class TestData {

    @DataProvider(name = "credentials")
    public Object[][] getData() {
        Object[][] data = new Object[][]{
                {"software tester", "harrow","1","30000","50000",1,1},
                {"Pharmacist", "harrow","2","30000","50000",1,2},
                {"Sales Executive", "harrow","5","30000","50000",1,2},
                {"Sales Manager", "harrow","5","30000","50000",1,3},
                {"Aeronautical Engineer", "harrow","5","30000","50000",1,2},
                {"Accounts Assistant", "harrow","7","30000","50000",1,2},
        };
        return data;
    }
}