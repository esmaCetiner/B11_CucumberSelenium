package com.eurotech.dbPractice;

import com.eurotech.utilities.DBUtils;

public class UserTable {
    public static int getUserIdWithEmail(String email){
        return (int) DBUtils.getCellValue("select id from user where email = '"+email+"';");
    }
}
