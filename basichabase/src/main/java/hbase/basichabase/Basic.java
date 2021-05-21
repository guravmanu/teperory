package hbase.basichabase;
//import org.apache.commons.configuration.Configuration;
import org.apache.hadoop.conf.Configuration;

import java.io.IOException;

import org.apache.commons.httpclient.HostConfiguration;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.HColumnDescriptor;
import org.apache.hadoop.hbase.HTableDescriptor;
import org.apache.hadoop.hbase.MasterNotRunningException;
import org.apache.hadoop.hbase.TableName;
import org.apache.hadoop.hbase.ZooKeeperConnectionException;
import org.apache.hadoop.hbase.client.HBaseAdmin;



public class Basic {

	public static void main(String[] args) throws MasterNotRunningException, ZooKeeperConnectionException, IOException {
		// TODO Auto-generated method stub
		 Configuration con = HBaseConfiguration.create();
		  HBaseAdmin admin = new HBaseAdmin(con);
		  if(!admin.tableExists("emp1"))
		  {
		  HTableDescriptor tableDescriptor = new HTableDescriptor(TableName.valueOf("emp1"));
		  tableDescriptor.addFamily(new HColumnDescriptor("personal"));
	      tableDescriptor.addFamily(new HColumnDescriptor("professional"));
	      admin.createTable(tableDescriptor);
		  }
	      System.out.println(" Table created ");
	      HTableDescriptor[] tableDescriptor1 = admin.listTables();
	      for (int i=0; i<tableDescriptor1.length;i++ ){
	          System.out.println(tableDescriptor1[i].getNameAsString());
	       }
		  	
		 

	}

}
