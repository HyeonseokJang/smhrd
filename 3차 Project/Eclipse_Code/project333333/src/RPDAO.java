

import java.sql.*;
import java.util.ArrayList;

public class RPDAO {
	private Connection conn; // ��������? Connection
	private PreparedStatement ps;
	private ResultSet rs;

	private void getConnect() {
		String URL = "jdbc:oracle:thin:@localhost:1521/xe"; // �������ݰ� ������������
		String user = "hr";
		String password = "hr";
		try { // DriverManager�� ����
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(URL, user, password);
		} catch (Exception e) { // ���� �ٿ뼺 (�������� ���� �� ����)
			e.printStackTrace();
		}
	}

	
	 public ArrayList<ProductVO> ProductONOFF() {
	      getConnect();
	      String SQL = "select * from ses_product";
	      ArrayList<ProductVO> list = new ArrayList<ProductVO>();
	      try {
	         ps = conn.prepareStatement(SQL);
	         rs = ps.executeQuery();
	         while (rs.next()) {
	            String ses_roomid = rs.getString("ses_roomid");
	            String ses_product = rs.getString("ses_pname");
	            String ses_status = rs.getString("ses_status");
	            ProductVO vo = new ProductVO(ses_roomid,ses_product,ses_status);
	            list.add(vo);
	         }
	      } catch (Exception e) {
	         e.printStackTrace();
	      } finally {
	         dbClose();
	      }
	      return list;
	   }
	
	 public int ElectricInsert(SESVO vo) {
			getConnect();
			String SQL = "INSERT INTO SES_ELECTRICITYUSE (SES_ROOMID, SES_ROOMNUM, SES_PRODUCT, SES_DATE, SES_USINGTIME, SES_ELECTRICITY, SES_WH) VALUES('a', '101', ?, sysdate, ?, ?, ?)";
			int cnt = 0;// �ǹ������� ����, �ʱ�ȭ
			try {
				ps = conn.prepareStatement(SQL);
				ps.setString(1, vo.getProduct());
				ps.setFloat(2, vo.getHour());
				ps.setFloat(3,vo.getW());
				ps.setFloat(4, vo.getWh());

				cnt = ps.executeUpdate();// ����

			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				dbClose();
			}
			return cnt;
		}
		private void dbClose() {
			try {
				if (rs != null)
					rs.close();
				if (ps != null)
					ps.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
}
