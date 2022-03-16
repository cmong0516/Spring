package sample10;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;



public class MemberDAO {
	private DataSource dataSource;

	public MemberDAO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MemberDAO(DataSource dataSource) {
		super();
		this.dataSource = dataSource;
	}

	public DataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	
	public void Connection_Res()throws ClassNotFoundException,SQLException{
		Connection conn = dataSource.getConnection();
		System.out.println("연결 성공");
		conn.close();
	}
	
	public int getInsert(MemberDTO dto)throws ClassNotFoundException,SQLException{
		Connection conn = dataSource.getConnection();
		String sql = "insert into springtest values(?,?,?)";
		PreparedStatement pstm = conn.prepareStatement(sql);
		pstm.setString(1, dto.getName());
		pstm.setString(2, dto.getId());
		pstm.setString(3, dto.getJoindate());
		
		int res = pstm.executeUpdate();
		pstm.close();
		conn.close();
		return res;
	}
}
