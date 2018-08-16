package com.java4.com.java4.com.java4.services;
import com.java4.com.java4.dto.user;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;

/**
 * Created by Pravat Kiran Timsina on 6/18/2017.
 */
public class Userdao {

    public static void registerUser(user user1){
        Connection connection = DbConnection.getConnection();
        if(connection!=null){
            String sql="INSERT INTO user(name,email,password,address)"+"VALUES(?,?,?,?)";

            try{
                PreparedStatement ps=connection.prepareStatement(sql);
                ps.setString(1,user1.getName());
                ps.setString(2,user1.getEmail());
                ps.setString(3,user1.getPassword());
                ps.setString(4,user1.getAddress());

                int res= ps.executeUpdate();
                if(res>0){
                    System.out.println("Data sucessfullt inserted");
                }
            }catch (SQLException e){
                e.printStackTrace();

            }
        }

    }
}
