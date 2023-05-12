package tester;

import java.util.Scanner;

import java.sql.*;
import static utils.DBUtils.openConnection;

public class TestPrepareStatement {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in);

				// open cn
				Connection cn = openConnection();
				// create pst
				PreparedStatement pst = cn.prepareStatement("select * from users where role = ? and reg_amt >?");)
			
		{
			System.out.println("enter role and res amount");
			//set IN para, PST API : public void setType(int paramIndex, Type val) throw SE
			pst.setString(1,sc.next());
			pst.setDouble(2,sc.nextDouble());
			
			try(ResultSet rst = pst.executeQuery())
			{
				//rest cursor : before the first row
				//RST API : public boolean next() thows SE
				
				while(rst.next())
					//read row data: RST API public Type getType(int colPos? String colName)
					System.out.println("id " + rst.getInt(1)+ " full name " + rst.getString(2) + " " +rst.getString(3) + " reg date " + rst.getDate(7));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
