package com.nucleus.domain;
public class CustomerInfo {	
private	long customerId;
private String	customerCode;
private String customerName;
private String customerAddress1;
private String customerAddress2;
private int pin;
private String mailId;
private long contactNumber;
private String contactPerson;
private String recordStatus;
private String flag;
private String date;
private String createdBy;
private String  modifiedDate;
private String modifiedBy;
private String authorizedDate;
private String authorizedBy;
//getters and setters for the declared variables 
public int getPin() {
	return pin;
}
public void setPin(int pin) {
	this.pin = pin;
}
public String getRecordStatus() {
	return recordStatus;
}
public void setRecordStatus(String recordStatus) {
	this.recordStatus = recordStatus;
}
public String getModifiedDate() {
	return modifiedDate;
}
public void setModifiedDate(String modifiedDate) {
	this.modifiedDate = modifiedDate;
}

public long getCustomerId() {
	return customerId;
}
public void setCustomerId(long customerId) {
	this.customerId = customerId;
}
public String getCustomerCode() {
	return customerCode;
}
public void setCustomerCode(String customerCode) {
	this.customerCode = customerCode;
}
public String getCustomerName() {
	return customerName;
}
public void setCustomerName(String customerName) {
	this.customerName = customerName;
}
public String getCustomerAddress1() {
	return customerAddress1;
}
public void setCustomerAddress1(String customerAddress1) {
	this.customerAddress1 = customerAddress1;
}
public String getCustomerAddress2() {
	return customerAddress2;
}
public void setCustomerAddress2(String customerAddress2) {
	this.customerAddress2 = customerAddress2;
}
public String getMailId() {
	return mailId;
}
public void setMailId(String mailId) {
	this.mailId = mailId;
}
public long getContactNumber() {
	return contactNumber;
}
public void setContactNumber(long contactNumber) {
	this.contactNumber = contactNumber;
}
public String getContactPerson() {
	return contactPerson;
}
public void setContactPerson(String contactPerson) {
	this.contactPerson = contactPerson;
}
public String getFlag() {
	return flag;
}
public void setFlag(String flag) {
	this.flag = flag;
}
public String getDate() {
	return date;
}
public void setDate(String date) {
	this.date = date;
}
public String getCreatedBy() {
	return createdBy;
}
public void setCreatedBy(String createdBy) {
	this.createdBy = createdBy;
}
public String getModifiedBy() {
	return modifiedBy;
}
public void setModifiedBy(String modifiedBy) {
	this.modifiedBy = modifiedBy;
}
public String getAuthorizedDate() {
	return authorizedDate;
}
public void setAuthorizedDate(String authorizedDate) {
	this.authorizedDate = authorizedDate;
}
public String getAuthorizedBy() {
	return authorizedBy;
}
public void setAuthorizedBy(String authorizedBy) {
	this.authorizedBy = authorizedBy;
}
//method to return string representation of the object 
public  String toString()
{
	return "customerCode:"+customerCode+" "+ "Name:" +customerName+" "+ "customerAddress1"+customerAddress1+ " "+ "customerAddress2:"+customerAddress2+"  " +"pin"+pin

       + " "    + "mailId"+ mailId+" "+ "contactNumber"+contactNumber+" " +"contactPerson"+contactPerson+" "+"recordStatus"+recordStatus+" "+"flag"+flag+" "+ "date"+ date+" "+"createdBy"+createdBy

+" "+"modifiedDate"+modifiedDate+" "+"modifiedBy"+modifiedBy+" "+"authorizedDate"+authorizedDate+" "+"authorizedBy"+authorizedBy+"\n";
}
	}