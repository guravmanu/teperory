package ondemand;

import org.json.JSONArray;
import org.json.JSONObject;

public class getWishlistProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getWishlistProduct g=new getWishlistProduct();
		g.getWishList();

	}
	public boolean getWishList()
	{
		JSONObject obj=new JSONObject();
		JSONObject obj4=new JSONObject();
		JSONObject obj1=new JSONObject();
		JSONObject filterObject=new JSONObject();
		JSONArray baton=new JSONArray();
		JSONArray dataArray=new JSONArray();
		JSONArray actionArray=new JSONArray();
		obj4.put("Location","etOrgActionCreator_sendtoJava : node");
		obj4.put("Timestamp","1577710294532");
		baton.put(obj4);
		filterObject.put("keyVal", "");
		filterObject.put("resultSize", 50);
		filterObject.put("lastModifiedOn", "");
		actionArray.put("GET_OTHER_WISHLIST");
		obj1.put("actionArray", actionArray);
		obj1.put("filterObjec",filterObject);
		obj1.put("KEY_TYPE ","TSK");
		obj1.put("SUB_KEY_TYPE","TSK_PRD_LST");	
		obj.put("dataArray", dataArray);
		obj.put("userId","r.g@rebrand.clouzer.com");
		obj.put("moduleName","SCM");
		obj.put("requestId","");
		obj.put("socketId","");
		obj.put("baton",baton);
		obj.put("topic","CCR_CLZ_COM");
		System.out.println(obj);
		return obj.isEmpty();
		
	}

}
