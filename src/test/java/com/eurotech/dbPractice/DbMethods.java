package com.eurotech.dbPractice;

import com.eurotech.utilities.DBUtils;
import com.eurotech.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.util.List;

public class DbMethods {
    public List<Object> getTableValues(String tableName) {
        System.out.println(tableName + " verisi aliniyor: ");
        return DBUtils.getRowList("select * from " + tableName);
    }
    public void verifyUserProfileValues(String userEmail, String columnName, String expectedValue) {

        //get actual value name
        //select id from user where email = 'sdetecet@gmail.com';
        int userId = (int) DBUtils.getCellValue(" select id  from user where email = '" + userEmail + "'");
        System.out.println("userId = " + userId);

        // select company from profile where userId = 854;
        String actualValue = (String) DBUtils.getCellValue("select " + columnName + " from profile where userId = " + userId + "");
        System.out.println("actualValue = " + actualValue);
        Assert.assertEquals("Values are not equal!!", actualValue, expectedValue);
    }

    public void verifyUserProfileValueWithUI(String userEmail, String columnName) {
        //get teh actual value from UI
        String actualValue = Driver.get().findElement(By.name(columnName)).getAttribute("value");
        System.out.println("actualValue = " + actualValue);

        // get the expected value from DB
        String expectedDbValue = (String) DBUtils.getCellValue("select "+columnName+" from profile where userId = " + UserTable.getUserIdWithEmail(userEmail) + ";");
        System.out.println("expectedDbValue = " + expectedDbValue);
        // VERIFY them
        Assert.assertEquals("Values are not equal!!", expectedDbValue,actualValue);
    }
}