package ibm.ibmDemo.beans;

public class GasInventoryResponse {
	
	private String commodityInfo;
	private String emission;
	
	public GasInventoryResponse(String commodityInfo, String emission) {
		super();
		this.commodityInfo = commodityInfo;
		this.emission = emission;
	}
	
	public String getCommodityInfo() {
		return commodityInfo;
	}
	public void setCommodityInfo(String commodityInfo) {
		this.commodityInfo = commodityInfo;
	}
	public String getEmission() {
		return emission;
	}
	public void setEmission(String emission) {
		this.emission = emission;
	}
	
}
