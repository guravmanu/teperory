package api.sampleApi;

import org.json.JSONObject;
import org.json.JSONArray;

public class insert {

	public static void main(String[] args) {
		insert i=new insert();
		i.insertinto();
		
	}
	public boolean insertinto()
	{
	JSONObject obj=new JSONObject();
	JSONObject obj1=new JSONObject();
	JSONObject obj3=new JSONObject();
	JSONObject obj4=new JSONObject();
	JSONObject calmailObject=new JSONObject();
	obj3.put("CML_TITLE","SIZE");
	obj3.put("CML_DESCRIPTION_", "guihgffff");
	obj3.put("CML_TYPE","SSD");
   
	
	JSONArray dataArray=new JSONArray();
	JSONArray actionArray=new JSONArray();
	JSONArray essentialList=new JSONArray();
	JSONArray baton=new JSONArray();
	essentialList.put(obj3);
	obj.put("userId","r.g@rebrand.clouzer.com");
	obj.put("action", "INSERT");
	calmailObject.put("ACTIVE_STATUS",1);
	calmailObject.put("invSeries","SOUL");
	calmailObject.put("stockMinValue",13);
	calmailObject.put("CML_CURRENCY_TYPE","$");
	calmailObject.put("CML_COST ",32);
	calmailObject.put("CML_VISIBILITY",1);
	calmailObject.put("KEY_TYPE ","TSK");
	calmailObject.put("SUB_KEY_TYPE","TSK_PRD_LST");
	calmailObject.put("CML_QTY",0);
	calmailObject.put("CML_STOCK_QTY",0);
	calmailObject.put("CML_STANDARD_TITLE","Product");
	calmailObject.put("CML_MODEL_NO",21);
	calmailObject.put("STANDARD_STATUS",2);
	obj4.put("Location","etOrgActionCreator_sendtoJava : node");
	obj4.put("Timestamp","1577710294532");
	
	baton.put(obj4);

	actionArray.put("INSERT_PRODUCT");
	obj1.put("actionArray", actionArray);
	obj1.put("essentialList",essentialList);
	obj1.put("calmailObject",calmailObject);
	dataArray.put(obj1);
	
	
	obj.put("dataArray", dataArray);
	obj.put("moduleName","SCM");
	obj.put("requestId","/sync#/sync#wjYh2leVm1goGm_DAABHr.g@rebrand.clouzer.com#1577710294530r168r226");
	obj.put("FROM","senddatatoserver");
	obj.put("socketId","/sync#wjYh2leVm1goGm_DAABH");
	obj.put("baton",baton);
	obj.put("topic","CCR_CLZ_COM");
	
	
	

	
	System.out.println(obj);
	return obj.isEmpty();
	}
	


}
