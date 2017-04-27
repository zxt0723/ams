package com.haibei.pojo.application;

import java.util.Date;

public class Resource {
    private Long wid;

    private Long appId;

    private Long classId;

    private String resName;

    private String resDes;

    private String resNo;

    private String resType;

    private String resKey;

    private String menuIcon;

    private String pMenu;

    private String accessUrl;

    private String isTopMenu;

    private String isUseable;

    private String isDisplay;

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

    public Long getAppId() {
        return appId;
    }

    public void setAppId(Long appId) {
        this.appId = appId;
    }

    public Long getClassId() {
        return classId;
    }

    public void setClassId(Long classId) {
        this.classId = classId;
    }

    public String getResName() {
        return resName;
    }

    public void setResName(String resName) {
        this.resName = resName == null ? null : resName.trim();
    }

    public String getResDes() {
        return resDes;
    }

    public void setResDes(String resDes) {
        this.resDes = resDes == null ? null : resDes.trim();
    }

    public String getResNo() {
        return resNo;
    }

    public void setResNo(String resNo) {
        this.resNo = resNo == null ? null : resNo.trim();
    }

    public String getResType() {
        return resType;
    }

    public void setResType(String resType) {
        this.resType = resType == null ? null : resType.trim();
    }

    public String getResKey() {
        return resKey;
    }

    public void setResKey(String resKey) {
        this.resKey = resKey == null ? null : resKey.trim();
    }

    public String getMenuIcon() {
        return menuIcon;
    }

    public void setMenuIcon(String menuIcon) {
        this.menuIcon = menuIcon == null ? null : menuIcon.trim();
    }

    public String getpMenu() {
        return pMenu;
    }

    public void setpMenu(String pMenu) {
        this.pMenu = pMenu == null ? null : pMenu.trim();
    }

    public String getAccessUrl() {
        return accessUrl;
    }

    public void setAccessUrl(String accessUrl) {
        this.accessUrl = accessUrl == null ? null : accessUrl.trim();
    }

    public String getIsTopMenu() {
        return isTopMenu;
    }

    public void setIsTopMenu(String isTopMenu) {
        this.isTopMenu = isTopMenu == null ? null : isTopMenu.trim();
    }

    public String getIsUseable() {
        return isUseable;
    }

    public void setIsUseable(String isUseable) {
        this.isUseable = isUseable == null ? null : isUseable.trim();
    }

    public String getIsDisplay() {
        return isDisplay;
    }

    public void setIsDisplay(String isDisplay) {
        this.isDisplay = isDisplay == null ? null : isDisplay.trim();
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