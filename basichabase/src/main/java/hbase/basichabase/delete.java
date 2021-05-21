package hbase.basichabase;

import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.client.Delete;
import org.apache.hadoop.hbase.client.Get;
import org.apache.hadoop.hbase.client.HTable;
import org.apache.hadoop.hbase.client.Result;
import org.apache.hadoop.hbase.util.Bytes;

public class delete {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Configuration config = HBaseConfiguration.create();

	      
	      HTable table = new HTable(config, "emp");
	      Delete delete = new Delete(Bytes.toBytes("manali"));
	      delete.deleteColumn(Bytes.toBytes("personal"), Bytes.toBytes("phone"));
	      table.delete(delete);
	      Get g = new Get(Bytes.toBytes("manali"));
	      Result result = table.get(g);
	      System.out.println(result);
	      String s=result.toString();
	      System.out.println(s);

	}

}
