package hbase.basichabase;

import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.client.HTable;
import org.apache.hadoop.hbase.client.Put;
import org.apache.hadoop.hbase.util.Bytes;

public class insert {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Configuration config = HBaseConfiguration.create();
		HTable hTable = new HTable(config, "emp");
		Put p = new Put(Bytes.toBytes("sanket"));
		 p.add(Bytes.toBytes("personal"),
			      Bytes.toBytes("city"),Bytes.toBytes("hyderabad"));
		 p.add(Bytes.toBytes("professional"),Bytes.toBytes("salary"),
			      Bytes.toBytes("50000"));
		 System.out.println("data enter");
		 hTable.put(p);
		 hTable.close();

	}

}
