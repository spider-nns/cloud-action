package com.spider.grpc.server;

import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;

public class MySqlConnectTest {
    String url = "jdbc:mysql://2c:5555/super-jacoco";
    String name = "spider";
    String pwd = "dB&x(oNt1lR)";

    @Test
    public void testConnectMySQL() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection(url, name, pwd);
        System.out.println(conn);
    }
}
