package ondemand;

import org.json.JSONArray;
import org.json.JSONObject;

public class OtherWishLisr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 OtherWishLisr o=new  OtherWishLisr ();
		 o.getOtherWishlist();
		

	}
	public boolean getOtherWishlist()
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
		actionArray.put("GET_OTHER_WISHLIST");
		obj1.put("actionArray", actionArray);
		obj1.put("KEY_TYPE ","TSK");
		obj1.put("SUB_KEY_TYPE","TSK_PRD_LST");	
		obj1.put( "projectId","distribu)torsevenaug.clouzer.com#PRJ_ORG_WKS_1596813258467_3562");
		obj1.put(  "taskId","aptbuilder.clouzer.com#PRJ_ORG_WKS_1587914310809_353#SEC_WSH_0028#TSK_WSH_1592974229250_76");
		filterObject.put("keyVal", "");
		filterObject.put("resultSize", 50);
		filterObject.put("lastModifiedOn", "");
		filterObject.put("PRODUCT_ID","KeyVal of Current product");
		obj1.put("filterObjec",filterObject);
		dataArray.put(obj1);
		obj.put("dataArray", dataArray);
		obj.put("userId","r.g@rebrand.clouzer.com");
		obj.put("moduleName","SCM");
		obj.put("requestId","/sync#/sync#wjYh2leVm1goGm_DAABHr.g@rebrand.clouzer.com#1577710294530r168r226");
		obj.put("socketId","/sync#wjYh2leVm1goGm_DAABH");
		obj.put("baton",baton);
		obj.put("topic","CCR_CLZ_COM");
		System.out.println(obj);
		return obj.isEmpty();
	}

}
