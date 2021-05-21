package hbase.basichabase;

import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.HTableDescriptor;
import org.apache.hadoop.hbase.MasterNotRunningException;
import org.apache.hadoop.hbase.ZooKeeperConnectionException;
import org.apache.hadoop.hbase.client.HBaseAdmin;

public class Disable {

	public static void main(String[] args) throws MasterNotRunningException, ZooKeeperConnectionException, IOException {
		// TODO Auto-generated method stub
		Configuration con = HBaseConfiguration.create();
		  HBaseAdmin admin = new HBaseAdmin(con);
		  if(admin.tableExists("emp1"))
		  {
		    admin.disableTable("emp1");
		  }
		System.out.println(admin.isTableDisabled("emp1"));
		 HTableDescriptor[] tableDescriptor1 = admin.listTables();
	      for (int i=0; i<tableDescriptor1.length;i++ ){
	          System.out.println(tableDescriptor1[i].getNameAsString());
	       }
	      System.out.println(admin.tableExists("emp1"));

	}

}
