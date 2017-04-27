package com.haibei.pojo.sys;

import java.util.Date;

public class Role {
    private Long wid;

    private Long appId;

    private String roleName;

    private String roleDes;

    private String isUseable;

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

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    public String getRoleDes() {
        return roleDes;
    }

    public void setRoleDes(String roleDes) {
        this.roleDes = roleDes == null ? null : roleDes.trim();
    }

    public String getIsUseable() {
        return isUseable;
    }

    public void setIsUseable(String isUseable) {
        this.isUseable = isUseable == null ? null : isUseable.trim();
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