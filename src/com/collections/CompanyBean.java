package com.collections;

public class CompanyBean {
private String cmpName;
private String cmpID;
private String cmpAddress;
public CompanyBean(String cmpName, int i, String cmpAddress) {
	super();
	this.cmpName = cmpName;
	this.cmpID = cmpID;
	this.cmpAddress = cmpAddress;
}
public String getCmpName() {
	return cmpName;
}
public void setCmpName(String cmpName) {
	this.cmpName = cmpName;
}
public String getCmpID() {
	return cmpID;
}
public void setCmpID(String cmpID) {
	this.cmpID = cmpID;
}
public String getCmpAddress() {
	return cmpAddress;
}
public void setCmpAddress(String cmpAddress) {
	this.cmpAddress = cmpAddress;
}
@Override
public String toString() {
	return "CompanyBean [cmpName=" + cmpName + ", cmpID=" + cmpID + ", cmpAddress=" + cmpAddress + "]";
}

}
