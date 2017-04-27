package com.haibei.pojo.application;

import java.util.Date;

public class Interface {
	private Long wid;

	private Long busiWid;

	private String functionName;

	private String functionAlias;

	private String functionDes;

	private String accessUrl;

	private String isValidate;

	private String returnType;

	private String isInterface;

	private String accessMethod;

	private String isAvailable;

	private String createdBy;

	private Date creationTime;

	private String modifiedBy;

	private Date modificationTime;

	private String deleteStatus;

	private Integer tableVer;
	private Business business;

	public Business getBusiness() {
		return business;
	}

	public void setBusiness(Business business) {
		this.business = business;
	}

	public Long getWid() {
		return wid;
	}

	public void setWid(Long wid) {
		this.wid = wid;
	}

	public Long getBusiWid() {
		return busiWid;
	}

	public void setBusiWid(Long busiWid) {
		this.busiWid = busiWid;
	}

	public String getFunctionName() {
		return functionName;
	}

	public void setFunctionName(String functionName) {
		this.functionName = functionName == null ? null : functionName.trim();
	}

	public String getFunctionAlias() {
		return functionAlias;
	}

	public void setFunctionAlias(String functionAlias) {
		this.functionAlias = functionAlias == null ? null : functionAlias.trim();
	}

	public String getFunctionDes() {
		return functionDes;
	}

	public void setFunctionDes(String functionDes) {
		this.functionDes = functionDes == null ? null : functionDes.trim();
	}

	public String getAccessUrl() {
		return accessUrl;
	}

	public void setAccessUrl(String accessUrl) {
		this.accessUrl = accessUrl == null ? null : accessUrl.trim();
	}

	public String getIsValidate() {
		return isValidate;
	}

	public void setIsValidate(String isValidate) {
		this.isValidate = isValidate == null ? null : isValidate.trim();
	}

	public String getReturnType() {
		return returnType;
	}

	public void setReturnType(String returnType) {
		this.returnType = returnType == null ? null : returnType.trim();
	}

	public String getIsInterface() {
		return isInterface;
	}

	public void setIsInterface(String isInterface) {
		this.isInterface = isInterface == null ? null : isInterface.trim();
	}

	public String getAccessMethod() {
		return accessMethod;
	}

	public void setAccessMethod(String accessMethod) {
		this.accessMethod = accessMethod == null ? null : accessMethod.trim();
	}

	public String getIsAvailable() {
		return isAvailable;
	}

	public void setIsAvailable(String isAvailable) {
		this.isAvailable = isAvailable == null ? null : isAvailable.trim();
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy == null ? null : createdBy.trim();
	}

	public Date getCreationTime() {
		return creationTime;
	}

	public void setCreationTime(Date creationTime) {
		this.creationTime = creationTime;
	}

	public String getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy == null ? null : modifiedBy.trim();
	}

	public Date getModificationTime() {
		return modificationTime;
	}

	public void setModificationTime(Date modificationTime) {
		this.modificationTime = modificationTime;
	}

	public String getDeleteStatus() {
		return deleteStatus;
	}

	public void setDeleteStatus(String deleteStatus) {
		this.deleteStatus = deleteStatus == null ? null : deleteStatus.trim();
	}

	public Integer getTableVer() {
		return tableVer;
	}

	public void setTableVer(Integer tableVer) {
		this.tableVer = tableVer;
	}
}