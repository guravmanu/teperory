package api.sampleApi;

import org.json.JSONArray;
import org.json.JSONObject;

public class update {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 update u=new  update();
		 u.updateproduct();

	}
	public boolean updateproduct() 
	{
		JSONObject obj=new JSONObject();
		JSONObject obj1=new JSONObject();
		JSONObject obj4=new JSONObject();
		JSONObject calmailUpdate=new JSONObject();
		JSONArray dataArray=new JSONArray();
		JSONArray actionArray=new JSONArray();
		JSONArray baton=new JSONArray();
		actionArray.put("UPDATE_PRODUCT");
		calmailUpdate.put("CML_TITLE","CCR-2");
		calmailUpdate.put("SYNC_PENDING_STATUS",0);
		calmailUpdate.put("LAST_MODIFIED_ON", "2019-12-31T06:52:36.441Z");
		calmailUpdate.put( "stockMinValue",36);
		obj4.put("Location","etOrgActionCreator_sendtoJava : node");
		obj4.put("Timestamp","1577710294532");
		baton.put(obj4);
		obj1.put("actionArray", actionArray);
		obj1.put("keyVal", "rebrand.clouzer.com#PRJ_DEPT_ORG_1231231231231_1234#SEC_WIZ_PRD_DB_0011#TSK_PRD_LST_1577774826691_49");
		obj1.put("KEY_TYPE ","TSK");
		obj1.put("SUB_KEY_TYPE","TSK_PRD_LST");
		obj1.put("calmailUpdate",calmailUpdate);
		dataArray.put(obj1);
		obj.put("dataArray", dataArray);
		obj.put("userId","r.g@rebrand.clouzer.com");
		obj.put("action", "UPDATE");
		obj.put("moduleName","SCM");
		obj.put("requestId","/sync#/sync#wjYh2leVm1goGm_DAABHr.g@rebrand.clouzer.com#1577710294530r168r226");
		obj.put("socketId","/sync#wjYh2leVm1goGm_DAABH");
		obj.put("baton",baton);
		obj.put("topic","CCR_CLZ_COM");
		System.out.println(obj);
		return obj.isEmpty();
	}

}
