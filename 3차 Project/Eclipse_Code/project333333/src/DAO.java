import java.security.Timestamp;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

public class DAO {
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

	public int join(String id, String pw) {
		connect();
		String sql = "insert into member2 values(?,?)";
		int cnt = 0;
		try {
			pst = conn.prepareStatement(sql);
			pst.setString(1, id);
			pst.setString(2, pw);
			
			cnt = pst.executeUpdate();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cnt;
		
	}

	public String allSelect(String id) {
		connect();
		Gson gson = new Gson();
		ArrayList<Member> all = new ArrayList<Member>();
	
		String sql = "select * from ses_member where ses_id=? and ses_roomnum='101'";
		try {
			pst = conn.prepareStatement(sql);
			 pst.setString(1, id);
			rs = pst.executeQuery();
			while(rs.next()) {
				id = rs.getString(1);
	            String name = rs.getString(4);
	            String room = rs.getString(9);
	            String tel = rs.getString(6);
				
				all.add(new Member(id, name,room,tel));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String json = gson.toJson(all);
		System.out.println(json);
		return json;
	}

	public boolean login(String id, String pw) {
		connect();
		String sql = "select * from ses_member where ses_id = ? and ses_pw = ? and ses_roomnum ='101'";
		try {
			pst = conn.prepareStatement(sql);
			pst.setString(1, id);
			pst.setString(2, pw);
			rs = pst.executeQuery();
			if (rs.next()) {
				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
		//String sql="select * from(select * from powerCount order by rownum desc) where rownum=1";
	}

	public String sensorIndividual(String id,String sr, String onOff) {
		connect();
		String update_="";
	int update=0;
		String sql="update ses_product set ses_status=? where ses_roomid='"+id+"' and ses_pname='"+sr+"'";
		try {

			pst = conn.prepareStatement(sql);
			
			pst.setString(1, onOff);
			
			
			update= pst.executeUpdate();
			if(update>0) {
				update_=sensorOut(sr);
			}

		} 
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return 	update_;
		
		
	}
	public String howMany2(String id) {
		ArrayList<String> sr = new ArrayList<String>();
		connect();
		String result="";
		String sql="select ses_pname from ses_product where ses_roomid=? and ses_status='on'"; //
		try {
			pst = conn.prepareStatement(sql);
			pst.setString(1, id);
			rs = pst.executeQuery();
			while(rs.next()) {
				
				
				sr.add(rs.getNString(1));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(int i=0;i<sr.size();i++) {
			result+=sr.get(i)+"/";
		}
		
		return result;
		
		
	}
	public int choChogi(String id) {
		connect();
		int resultCount=0;
		String sql="select count(*) from ses_product where ses_roomid=?";
		try {
			PreparedStatement psmt = conn.prepareStatement(sql);
		
			psmt.setString(1, id);
			rs = psmt.executeQuery();
			if (rs.next())
				resultCount = rs.getInt(1);

		} catch (Exception e) {
			e.printStackTrace();
		}

		return resultCount;

	}
		
	
	public int howMany(String id) { // id�ϳ��� ����� ���� ����. �޷¾��� ����

		connect();
		String sql = "select count(*) from ses_product where ses_roomid=? and ses_status='on'"; //
		// String sql="select count(*) from starttable where userid='?'";
		int resultCount = 0;
		try {

			PreparedStatement psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			rs = psmt.executeQuery();

			if (rs.next())
				resultCount = rs.getInt(1);

		} catch (Exception e) {
			e.printStackTrace();
		}

		return resultCount;

	}
	public String sensorOut(String sr) {
		connect();
		String sql="select ses_status from ses_product where ses_pname=?";
		String result="";
		try {
			pst = conn.prepareStatement(sql);
			
			pst.setString(1, sr);
			
	
			rs = pst.executeQuery();
			while(rs.next()) {
				result=rs.getString("ses_status");
				
				
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		return result;
	}
	/**public String powerCount() {
		connect();
		Gson gson = new Gson();
		ArrayList<Sensor> sensor = new ArrayList<Sensor>();
	
		String sql="select * from(select * from powerCount order by rownum desc) where rownum=1";
		try {
			pst = conn.prepareStatement(sql);
			
			rs = pst.executeQuery();
			while(rs.next()) {
				int sensor1 = rs.getInt("COUNT1");
				int sensor2 = rs.getInt("COUNT2");
				
				sensor.add(new Sensor(sensor1, sensor2));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String json = gson.toJson(sensor);
		
		return json;
	} **/
	
	public int allOff(String id) {
		
		connect();
		int cnt=0;
		String sql="update ses_product set ses_status='off' where ses_roomid=? ";
		try {
			pst = conn.prepareStatement(sql);
			pst.setNString(1, id);
			cnt = pst.executeUpdate();
			
			if(cnt>0) {
				return cnt;
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return 0;
		
	}
	public String percentage() {
		
		connect();
	String sql="select ses_roomid, sum(use_wh) from ses_app where ses_date like '__%03%__' and ses_roomnum like '1%_' group by ses_roomid";
		//	String sql="select id, round(ratio_to_report(sum(use)) over (partition by grouping(id))*100,1) biz_pct from totaluse group by rollup(id)";
		Gson gson = new Gson();
		ArrayList<sensorVO> all = new ArrayList<sensorVO>();
	
		try {
			pst = conn.prepareStatement(sql);
			
			rs = pst.executeQuery();
			while(rs.next()) {
				String id = rs.getString(1);
				float result=Math.round((rs.getFloat(2)/3)*10/10);
				
				
				
				all.add(new sensorVO(id, result));
			}
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String json = gson.toJson(all);
		System.out.println(json);
		return json;
		
	}
	public String graph1(String id) {
		connect();
		Gson gson=new Gson();
		String sql="select month, mon_percent from monthly where room=? ";
		ArrayList<graph1VO> list = new ArrayList<>();
		
		try {
			pst = conn.prepareStatement(sql);
			pst.setString(1, id);
			
			rs = pst.executeQuery();
			while(rs.next()) {
				int month = rs.getInt(1);
				int mon_per = rs.getInt(2);
				
				list.add(new graph1VO(month, mon_per));
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String result=gson.toJson(list);
		return result;
	}
	public ArrayList<weekVO> week_use(String id) {
		ArrayList<weekVO> result = new ArrayList<weekVO>();
		
		Gson gson = new Gson();
		connect();
		String sql="select sum(use_wh) from ses_app where ses_roomid=? and ses_date between to_char(sysdate-14,'yy/mm/dd') and to_char(sysdate,'yy/mm/dd') and ses_roomnum like '1%_' group by to_char(ses_date,'yy/mm/dd') order by to_char(ses_date,'yy/mm/dd') desc";
				
		//String sql="select sum(use_wh) from ses_app where ses_roomid=? group by to_char(ses_date,'yy/mm/dd') order by ses_date desc";
	
		try {
			
			pst = conn.prepareStatement(sql);
			pst.setString(1, id);
			
			
			
			rs = pst.executeQuery();
			
			while(rs.next()) {
			
				
				float use = rs.getFloat(1)/3;
				result.add(new weekVO(Math.round(use)));
			}

		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//String result_=gson.toJson(result);
		return result;
	}
public ArrayList<weekVO> week_total() {
	Gson gson = new Gson();
	String result_="";

	ArrayList<weekVO> list = new ArrayList<weekVO>();
		connect();
		
		String sql="select sum(use_wh) from ses_app where ses_date between to_char(sysdate-14,'yy/mm/dd') and to_char(sysdate,'yy/mm/dd') and ses_roomnum like '1%_' group by to_char(ses_date,'yy/mm/dd') order by to_char(ses_date,'yy/mm/dd') desc";
				
		try {
			pst = conn.prepareStatement(sql);

			rs = pst.executeQuery();
			while (rs.next()) {

				double result = rs.getDouble(1);
				list.add(new weekVO(Math.round(result/3)));
				
			}
		} catch (Exception e) {
			
			e.printStackTrace();
		} 
	
		// result_=gson.toJson(list);
		return list;

		
	}
	public int currentDay (String id) {
		int result=0;
		Gson gson = new Gson();
		connect();
		String sql="select daybefore from(select * from week_use where id =? order by rownum asc) where rownum=1";

		try {
			pst = conn.prepareStatement(sql);
			
			pst.setString(1, id);
			rs = pst.executeQuery();
			if(rs.next()) {
				
				result=rs.getInt("daybefore");
				
				
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
	}

	public ArrayList<weekVO> today_value(String id) {
		connect();
		Gson gson = new Gson();
		int to_date=0;
		String today="";
		ArrayList<weekVO> list = new ArrayList<weekVO>();
		String sql="select sum(ses_wh) from ses_electricityuse where ses_roomid=? ";
		try {
			pst = conn.prepareStatement(sql);
			pst.setString(1, id);
			rs = pst.executeQuery();
			Date date = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("dd", Locale.KOREA);
			today = sdf. format(date);
            

             to_date = Integer.parseInt(today);
			while(rs.next()) {
				int result = rs.getInt(1);
				
				list.add(new weekVO(result));
			}
		} catch (Exception e) {
		
			e.printStackTrace();
		}finally {getClose();}
		String result_=gson.toJson(list);
		return list;
	
	
	}
	
public String graph2(String id) {
	
	connect();
	ArrayList<graph2VO> list = new ArrayList<>();
	String sql="select sum(value_num),value_time from realtime_today where id=? group by value_time order by value_time asc";
	Gson gson = new Gson();
	try {
		pst = conn.prepareStatement(sql);
		pst.setString(1, id);
		rs = pst.executeQuery();
		while(rs.next()) {
			int value_num = rs.getInt(1);
			int value_time=rs.getInt(2);
			list.add(new graph2VO(value_num,value_time));
		
		}
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	String result_=gson.toJson(list);
	return result_; 
	
}

	
//	public void close() {
//		try {
//			rs.close();
//			pst.close();
//			conn.close();
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//	}
	private void getClose() {
		try {
			if (rs != null)
				rs.close();
			if (pst != null)
				pst.close();
			if (conn != null)
				conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
}









