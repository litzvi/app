package com.weberp.app.dataobjects;


public class LegelInfo {

	private String englishName;
	private String vietnamName;
	private String companyLicence;
	private String taxCode;
	public LegelInfo(String englishName, String vietnamName, String companyLicence, String taxCode) {
		super();
		this.englishName = englishName;
		this.vietnamName = vietnamName;
		this.companyLicence = companyLicence;
		this.taxCode = taxCode;
	}
	@Override
	public String toString() {
		return "LegelInfo [englishName=" + englishName + ", vietnamName=" + vietnamName + ", companyLicence="
				+ companyLicence + ", taxCode=" + taxCode + "]";
	}
	/**
	 * @return the englishName
	 */
	public String getEnglishName() {
		return englishName;
	}
	/**
	 * @param englishName the englishName to set
	 */
	public void setEnglishName(String englishName) {
		this.englishName = englishName;
	}
	/**
	 * @return the vietnamName
	 */
	public String getVietnamName() {
		return vietnamName;
	}
	/**
	 * @param vietnamName the vietnamName to set
	 */
	public void setVietnamName(String vietnamName) {
		this.vietnamName = vietnamName;
	}
	/**
	 * @return the companyLicence
	 */
	public String getCompanyLicence() {
		return companyLicence;
	}
	/**
	 * @param companyLicence the companyLicence to set
	 */
	public void setCompanyLicence(String companyLicence) {
		this.companyLicence = companyLicence;
	}
	/**
	 * @return the taxCode
	 */
	public String getTaxCode() {
		return taxCode;
	}
	/**
	 * @param taxCode the taxCode to set
	 */
	public void setTaxCode(String taxCode) {
		this.taxCode = taxCode;
	}
	
	
}
