package tester;

import java.util.Scanner;

import java.sql.*;
import static utils.DBUtils.openConnection;

public class TestExecuteUpdate {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in);

				// open cn
				Connection cn = openConnection();
				// create pst
				PreparedStatement pst = cn.prepareStatement("delete from users where id = ?");)
				
		{
			System.out.println("enter id");
			//set IN para, PST API : public void setType(int paramIndex, Type val) throw SE
			pst.setInt(1,sc.nextInt());
			
			
				//rest cursor : before the first row
				//RST API : public boolean next() thows SE
				
				int updateCount=pst.executeUpdate();
				if(updateCount!=0)
					System.out.println("user details deleted!!");
				else
					System.out.println("user id Invalid!!");
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
