package api.sampleApi;

import org.json.JSONArray;
import org.json.JSONObject;

public class delete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 delete d=new  delete ();
		 d.deleteproduct();
	}
	public boolean deleteproduct()
	{
		JSONObject obj=new JSONObject();
		JSONObject obj1=new JSONObject();
		JSONArray dataArray=new JSONArray();
		JSONArray actionArray=new JSONArray();
		
		actionArray.put("DELETE_PRODUCT");
		obj1.put("actionArray", actionArray);
		dataArray.put(obj1);
		obj.put("dataArray", dataArray);
		obj.put("userId","r.g@rebrand.clouzer.com");
		obj.put("action", "DELETE");
		obj.put("moduleName","SCM");
		obj.put("requestId","/sync#/sync#wjYh2leVm1goGm_DAABHr.g@rebrand.clouzer.com#1577710294530r168r226");
		obj.put("socketId","/sync#wjYh2leVm1goGm_DAABH");
		obj.put("KEY_TYPE ","TSK");
		obj.put("SUB_KEY_TYPE","TSK_PRD_LST");
		obj.put("ACTIVE_STATUS",1);
		obj.put("keyVal", "rebrand.clouzer.com#PRJ_DEPT_ORG_1231231231231_1234#SEC_WIZ_PRD_DB_0011#TSK_PRD_LST_1577774826691_49");
		System.out.println(obj);
		return obj.isEmpty();
	}
	
	/*{
  
 
 
 
  "dataArray": [
    {
      "actionArray": [
        "DELETE_PRODUCT"
      ],
     
      
      ,
      
    }
 
  ]
}*/

}
