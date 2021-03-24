package alarm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.google.gson.Gson;

public class alarmDAO {
	Connection conn;
	PreparedStatement pst;
	ResultSet rs;

	
	public void connect() {

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String id = "hr";
			String pw = "hr";

			conn = DriverManager.getConnection(url, id, pw);

			if (conn != null) {
				System.out.println("���Ἲ��!");
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	 public String alarmBill(String user_room) {
         connect();
         Gson gson = new Gson();
         ArrayList<alarmVO> alarm = new ArrayList<alarmVO>();
      
         String sql="select sum(use_wh) from ses_app where ses_roomid=? and ses_date like '__%03%__'";
         try {
            pst = conn.prepareStatement(sql);
             pst.setString(1, user_room);
             System.out.println(user_room);
            rs = pst.executeQuery();
            System.out.println("rs ");
                while(rs.next()) {
                   System.out.println("while 문 들어옴");
                   String ses_wh = rs.getString(1);
                   System.out.println("이거 값 들어옴?"+ ses_wh);
                   alarm.add(new alarmVO(ses_wh));
                }
             } catch (Exception e) {
                e.printStackTrace();
             }
             
             String json = gson.toJson(alarm);
             System.out.println("dao ? !");
             
             
             System.out.println(json);
             return json;
          }
	
	
	public void close() {
		try {
			rs.close();
			pst.close();
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		}
	
}
