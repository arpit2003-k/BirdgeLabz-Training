package com.json.dbtojson;

import java.sql.*;
import java.io.File;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class DBToJson {

    public static void main(String[] args) {

        String dbUrl = "jdbc:mysql://localhost:3306/employees";
        String user = "root";
        String password = "admin123";

        String outputFile = "/Users/rmac/Documents/Java Capgemini Training  /Java PROGRAMMING WORKSPACE/java-IOprogramming-practice/gcr-codebase/JavaIOProgramingPractice/src/com/json/dbtojson/employees.json";

        ObjectMapper mapper = new ObjectMapper();
        ArrayNode array = mapper.createArrayNode();

        try (
                Connection con = DriverManager.getConnection(dbUrl, user, password);
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM employees")
        ) {
            while (rs.next()) {

                ObjectNode obj = mapper.createObjectNode();
                obj.put("id", rs.getInt("id"));
                obj.put("name", rs.getString("name"));
                obj.put("department", rs.getString("department"));
                obj.put("salary", rs.getDouble("salary"));

                array.add(obj);
            }

            // Write JSON with formatting
            mapper.writerWithDefaultPrettyPrinter()
                  .writeValue(new File(outputFile), array);

            System.out.println("Database records converted to JSON successfully!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
