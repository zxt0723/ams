package com.haibei.pojo.application;

import java.util.Date;

public class Params {
	private Long wid;

	private Long funcId;

	private String paramType;

	private String paramName;

	private String required;

	private String isValidate;

	private String createdBy;

	private Date creationTime;

	private String modifiedBy;

	private Date modificationTime;

	private String deleteStatus;

	private Integer tableVer;


	public Long getWid() {
		return wid;
	}

	public void setWid(Long wid) {
		this.wid = wid;
	}

	public Long getFuncId() {
		return funcId;
	}

	public void setFuncId(Long funcId) {
		this.funcId = funcId;
	}

	public String getParamType() {
		return paramType;
	}

	public void setParamType(String paramType) {
		this.paramType = paramType == null ? null : paramType.trim();
	}

	public String getParamName() {
		return paramName;
	}

	public void setParamName(String paramName) {
		this.paramName = paramName == null ? null : paramName.trim();
	}

	public String getRequired() {
		return required;
	}

	public void setRequired(String required) {
		this.required = required == null ? null : required.trim();
	}

	public String getIsValidate() {
		return isValidate;
	}

	public void setIsValidate(String isValidate) {
		this.isValidate = isValidate == null ? null : isValidate.trim();
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