package realtimeFee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.google.gson.Gson;

public class feeDAO {
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
	
	public double realtime_fee(String id) {
		Gson gson = new Gson();
		double result=0;

		
			connect();
			
			String sql="select sum(ses_wh) from ses_electricityuse where ses_date like '__%03%__' and ses_roomnum like '1%_'";
					
			try {
				pst = conn.prepareStatement(sql);
				
				rs = pst.executeQuery();
				while (rs.next()) {
					
					result = rs.getInt(1);
					Math.round((result*10)/10);
					return result;
					
				}
			} catch (Exception e) {
				
				e.printStackTrace();
			} 
		
			
			return result;

			
		}
	public ArrayList<feeVO> realtime_fee_2() {
	
		double result=0;
String result2="";
Gson gson = new Gson();
		ArrayList<feeVO> list = new ArrayList<feeVO>();
			connect();
			
			String sql="select ses_roomid, round(ratio_to_report(sum(use_wh)) over (partition by grouping(ses_roomid))*100,1) biz_pct from ses_app where ses_date like '__%03%__' and ses_roomnum='101' group by rollup(ses_roomid)";
					
			try {
				pst = conn.prepareStatement(sql);

				rs = pst.executeQuery();
				while (rs.next()) {

					result = rs.getDouble(2);
					result2 = rs.getNString(1);
					
					list.add(new feeVO(result,result2));
					
					
				}
			} catch (Exception e) {
				
				e.printStackTrace();
			} 
		
			
			return list;

			
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
