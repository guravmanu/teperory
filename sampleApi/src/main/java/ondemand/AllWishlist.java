package ondemand;

import org.json.JSONArray;
import org.json.JSONObject;

public class AllWishlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AllWishlist a=new AllWishlist();
		a.getWishList();

	}
	public boolean getWishList()
	{
		JSONObject obj=new JSONObject();
		JSONObject obj1=new JSONObject();
		JSONArray dataArray=new JSONArray();
		JSONArray actionArray=new JSONArray();
		JSONObject obj4=new JSONObject();
		JSONObject kafkaMessageMetrics=new JSONObject();
		JSONObject filterObject=new JSONObject();
		JSONArray baton=new JSONArray();
		kafkaMessageMetrics.put("applicationId", "dev-ccr-clz-com-v2.1.2");
		kafkaMessageMetrics.put("topic", "CCR_CLZ_COM-DEV_123");
		kafkaMessageMetrics.put("offset", 23465);
		kafkaMessageMetrics.put("key", "7ab1afd2-4639-4c6a-ae87-58af10dfa354");
		kafkaMessageMetrics.put("partition", 2);
		kafkaMessageMetrics.put("timestamp", "1599111999294");
		kafkaMessageMetrics.put("consumeDelay", "1ms");
		kafkaMessageMetrics.put("produceTime", "2020-09-03T05:46:39.294Z");
		kafkaMessageMetrics.put("consumeTime", "2020-09-03T05:46:39.295Z");
		filterObject.put("keyVal", "");
		filterObject.put("resultSize", 50);
		filterObject.put("lastIndex", 0);
		filterObject.put("lastModifiedOn", "");
		filterObject.put("PRODUCT_ID","KeyVal of Current product");
		obj4.put("Location","etOrgActionCreator_sendtoJava : node");
		obj4.put("Timestamp","1577710294532");
		baton.put(obj4);
		actionArray.put("GET_WISHLIST");
		obj1.put("actionArray", actionArray);
		obj1.put("KEY_TYPE ","TSK");
		obj1.put("SUB_KEY_TYPE","TSK_PRD_LST");	
		obj1.put("appendToCollection",false);
		obj1.put( "projectId","distribu)torsevenaug.clouzer.com#PRJ_ORG_WKS_1596813258467_3562");
		obj1.put("filterObject",filterObject);
		dataArray.put(obj1);
		obj.put("dataArray", dataArray);
		obj.put("userId","r.g@rebrand.clouzer.com");
		obj.put("moduleName","SCM");
		obj.put("requestId","/sync#/sync#wjYh2leVm1goGm_DAABHr.g@rebrand.clouzer.com#1577710294530r168r226");
		obj.put("socketId","/sync#wjYh2leVm1goGm_DAABH");
		obj.put("baton",baton);
		obj.put("topic","CCR_CLZ_COM");
		obj.put("namespaceId","DEV_123");
		obj.put("kafkaMessageMetrics",kafkaMessageMetrics);
		System.out.println(obj);
		return obj.isEmpty();
	}

}
