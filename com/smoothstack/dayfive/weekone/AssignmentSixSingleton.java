package com.smoothstack.dayfive.weekone;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class AssignmentSixSingleton {
    private static Connection conn = null;

    private static AssignmentSixSingleton instance = null;

    public AssignmentSixSingleton() {
    }

    public static AssignmentSixSingleton getInstance() {
        if (instance == null) {
            instance = new AssignmentSixSingleton();
        }
        return instance;
    }
}
