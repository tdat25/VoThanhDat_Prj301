/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import utils.DbUtils;
/**
 *
 * @author VO THANH DAT
 */
public class UserDAO {
        public ArrayList<UserDTO> list = new ArrayList<>();
public UserDAO(){
}
public UserDTO searchByID(String username)
    {
        Connection conn = DbUtils.getConnection();
        String sql = "SELECT * FROM tbUsers"+
                " WHERE userID=?";
        return null;
    }
}