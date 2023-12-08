package com.eurotech.dbPractice;

import com.eurotech.utilities.DBUtils;
import org.junit.Test;

public class DbTests {


    @Test
    public void dbTest() throws Exception{
        DBUtils.createConnection();
        DBUtils.getRowList("select * from user");
        System.out.println("DBUtils.getRowCount() = " + DBUtils.getRowCount());
        DBUtils.destroy();

    }
}
