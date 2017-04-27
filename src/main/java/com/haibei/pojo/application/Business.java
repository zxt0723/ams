package com.haibei.pojo.application;

import java.util.Date;
import java.util.List;

import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.annotation.JSONType;

public class Business {
    private Long wid;

    private Long appWid;

    private String busiPackage;

    private String busiClass;

    private String classType;

    private String busiDes;

    private String busiUrl;

    private String isAuth;

    private String isAvailable;

    private String createdBy;

    private Date creationTime;

    private String modifiedBy;

    private Date modificationTime;

    private String deleteStatus;

    private Integer tableVer;

    private List<Interface> interfaceList;

    public Long getWid() {
        return wid;
    }

    public void setWid(Long wid) {
        this.wid = wid;
    }

    public Long getAppWid() {
        return appWid;
    }

    public void setAppWid(Long appWid) {
        this.appWid = appWid;
    }

    public String getBusiPackage() {
        return busiPackage;
    }

    public void setBusiPackage(String busiPackage) {
        this.busiPackage = busiPackage == null ? null : busiPackage.trim();
    }

    public String getBusiClass() {
        return busiClass;
    }

    public void setBusiClass(String busiClass) {
        this.busiClass = busiClass == null ? null : busiClass.trim();
    }

    public String getClassType() {
        return classType;
    }

    public void setClassType(String classType) {
        this.classType = classType == null ? null : classType.trim();
    }

    public String getBusiDes() {
        return busiDes;
    }

    public void setBusiDes(String busiDes) {
        this.busiDes = busiDes == null ? null : busiDes.trim();
    }

    public String getBusiUrl() {
        return busiUrl;
    }

    public void setBusiUrl(String busiUrl) {
        this.busiUrl = busiUrl == null ? null : busiUrl.trim();
    }

    public String getIsAuth() {
        return isAuth;
    }

    public void setIsAuth(String isAuth) {
        this.isAuth = isAuth == null ? null : isAuth.trim();
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
   
	public List<Interface> getInterfaceList() {
	
		return interfaceList;
	}

	public void setInterfaceList(List<Interface> interfaceList) {
		this.interfaceList = interfaceList;
	}
}