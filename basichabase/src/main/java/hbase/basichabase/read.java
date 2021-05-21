package hbase.basichabase;

import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.client.Get;
import org.apache.hadoop.hbase.client.HTable;
import org.apache.hadoop.hbase.client.Result;
import org.apache.hadoop.hbase.client.ResultScanner;
import org.apache.hadoop.hbase.client.Scan;
import org.apache.hadoop.hbase.util.Bytes;

public class read {

	public static void main(String[] args) throws IOException {
		
		Configuration config = HBaseConfiguration.create();

	      
	      HTable table = new HTable(config, "emp");

	      // Instantiating Get class
	      Get g = new Get(Bytes.toBytes("manali"));
	      Scan scan = new Scan();
	      Result result = table.get(g);
	      System.out.println(result);
	      byte [] value = result.getValue(Bytes.toBytes("personal"),Bytes.toBytes("city"));
	      byte [] value1 = result.getValue(Bytes.toBytes("personal"),Bytes.toBytes("phone"));
	      String city = Bytes.toString(value);
	      String phone = Bytes.toString(value1);
	      scan.addColumn(Bytes.toBytes("personal"), Bytes.toBytes("city"));
	      ResultScanner scanner = table.getScanner(scan);
	      for (Result result1 = scanner.next(); result1 != null; result1 = scanner.next())

	          System.out.println("Found row : " + result1);
	          //closing the scanner
	          scanner.close();


	      System.out.println(city+phone);
	      


	}

}
