package ibm.ibmDemo.beans;

import java.util.List;

public class GasInventory {
	
	//https://dev.socrata.com/foundry/data.sfgov.org/pxac-sadh
	private String department;
	private String sourceType;
	private String fiscalYear;
	private String quarter;
	private List<String> emissionsMtco2e;
	private String consumption;
	private String consumptionUnits;
	
    /*
    For this exercise purpose, a GasInventory is created from a commodityInfo and a emissionsMtCO2e
     */
	
	public GasInventory(String sourceType, List<String> emissionsMtco2e) {
		this.sourceType = sourceType;
		this.emissionsMtco2e = emissionsMtco2e;
	}

	public GasInventory(String department, String sourceType, String fiscalYear, String quarter,
			List<String> emissionsMtco2e, String consumption, String consumptionUnits) {
		this.department = department;
		this.sourceType = sourceType;
		this.fiscalYear = fiscalYear;
		this.quarter = quarter;
		this.emissionsMtco2e = emissionsMtco2e;
		this.consumption = consumption;
		this.consumptionUnits = consumptionUnits;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getSourceType() {
		return sourceType;
	}

	public void setSourceType(String sourceType) {
		this.sourceType = sourceType;
	}

	public String getFiscalYear() {
		return fiscalYear;
	}

	public void setFiscalYear(String fiscalYear) {
		this.fiscalYear = fiscalYear;
	}

	public String getQuarter() {
		return quarter;
	}

	public void setQuarter(String quarter) {
		this.quarter = quarter;
	}

	public List<String> getEmissionsMtco2e() {
		return emissionsMtco2e;
	}

	public void setEmissionsMtco2e(List<String> emissionsMtco2e) {
		this.emissionsMtco2e = emissionsMtco2e;
	}

	public String getConsumption() {
		return consumption;
	}

	public void setConsumption(String consumption) {
		this.consumption = consumption;
	}

	public String getConsumptionUnits() {
		return consumptionUnits;
	}

	public void setConsumptionUnits(String consumptionUnits) {
		this.consumptionUnits = consumptionUnits;
	}

}
