package newgraph2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

import com.google.gson.Gson;

public class graph2DAO {
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

	public String graph2_month(String id) {
		connect();
		Gson gson = new Gson();

		ArrayList<newGraph2VO> list = new ArrayList<>();

		int result = 0;
		// String sql="select sum(ses_wh) from ses_electricityuse where ses_roomid='a'
		// and ses_date=sysdate"; 이게 정석
		String sql = "select sum(use_wh) from ses_app where ses_roomnum like '1%_' and ses_date like '__%03%__' and ses_roomid=? ";
		try {
			pst = conn.prepareStatement(sql);
			pst.setString(1, id);
			rs = pst.executeQuery();
			if (rs.next()) {

				double value = rs.getInt(1)/3;
				value=Math.round((value*10)/10.0);
			

				list.add(new newGraph2VO(value));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

		String json = gson.toJson(list);

		return json;
	}

	public String My_room_house(String id) {
		connect();
		Gson gson = new Gson();

		ArrayList<newGraph2VO> list = new ArrayList<>();
		String sql = "select sum(use_wh) from ses_app where to_char(ses_date,'yy/mm/dd')=to_char(sysdate,'yy/mm/dd') and ses_roomid = ? and ses_roomnum like '1%_'";
//select sum(use_wh) sum from ses_app where to_char(ses_date,'yy/mm/dd')=to_char(sysdate,'yy/mm/dd') and ses_roomid = 'a'
		try {
			pst = conn.prepareStatement(sql);
			pst.setString(1, id);
			rs = pst.executeQuery();
			if (rs.next()) {

				int value =  Math.round(rs.getInt(1)/3);
				int value2 = Math.round(total_house()/3);
				int value3 = Math.round( yesterday_myroom(id)/3);
				int value4 =  Math.round(yesterday_house()/3);
				list.add(new newGraph2VO(value, value2, value3, value4));
				
				
				//double use = rs.getInt(1);
				//Math.round(use); 이거 추가. 
				
			
			}
		} catch (Exception e) {
			
			e.printStackTrace();
		} 
		String json = gson.toJson(list);

		return json;

	}
	
	
	public String premonth_total() {
		connect();
		Gson gson = new Gson();
		ArrayList<Integer> list = new ArrayList<>();
		String sql="select sum(use_wh) from ses_app where ses_roomnum like '1%_' and ses_roomid ='a' and to_char(ses_date,'yy/mm/dd') like '__%02%__' group by to_char(ses_date,'yy/mm/dd') order by to_char(ses_date,'yy/mm/dd') desc ";
		
		try {
			pst = conn.prepareStatement(sql);

			rs = pst.executeQuery();
			if (rs.next()) {

				int value = rs.getInt(1)/3;
                list.add(value);
				
			}
		} catch (Exception e) {
			
			e.printStackTrace();
		} 
		
		String result = gson.toJson(list);
		
		return result;
	}


	
	
	
	
	
	
	public int total_house() {
		
		connect();
		int result=0;
		String sql = "select sum(use_wh) from ses_app where to_char(ses_date,'yy/mm/dd')=to_char(sysdate,'yy/mm/dd') and ses_roomnum like '1%_'";
				
		try {
			pst = conn.prepareStatement(sql);

			rs = pst.executeQuery();
			if (rs.next()) {

				int value = rs.getInt(1);

				return value;
			}
		} catch (Exception e) {
			
			e.printStackTrace();
		} 
	

		return 0;

	}

	

	public int this_month(String id) { // 이게 정석

		connect();
		int result = 0;

		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("MM", Locale.KOREA);
		String today = sdf.format(date);
		int today_ = Integer.parseInt(today);
		System.out.println(today+"this month");
		// String sql="select sum(ses_wh) from ses_electricityuse where ses_roomid='a'
		// and ses_date=sysdate"; 이게 정석
		String sql = "select sum(ses_wh) from ses_electricityuse where ses_roomid=? and ses_date like '__%"+today_+"%__' and ses_roomid='a'";
		try {
			pst = conn.prepareStatement(sql);
			pst.setString(1, id);
			rs = pst.executeQuery();

			while (rs.next()) {

				int use = rs.getInt(1);

				return use;

			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

		// String json = gson.toJson(list);

		return result;
	}
	
public int yesterday_myroom(String id) {
		
		connect();
		int result=0;
		String sql = "select sum(use_wh) from ses_app where to_char(ses_date,'yy/mm/dd')=to_char(sysdate-1,'yy/mm/dd') and ses_roomid=? and ses_roomnum like '1%_'";
				
		try {
			pst = conn.prepareStatement(sql);
			pst.setString(1, id);
			rs = pst.executeQuery();
			while (rs.next()) {

				int value = rs.getInt(1);

				return value;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	

		return 0;

		
		
		
	}
public int yesterday_house() {
	
	connect();
	int result=0;
	String sql = "select sum(use_wh) from ses_app where to_char(ses_date,'yy/mm/dd')=to_char(sysdate-1,'yy/mm/dd') and ses_roomnum like '1%_'";
			
	try {
		pst = conn.prepareStatement(sql);

		rs = pst.executeQuery();
		if (rs.next()) {

			int value = rs.getInt(1);

			return value;
		}
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} 


	return 0;

	
	
	
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
