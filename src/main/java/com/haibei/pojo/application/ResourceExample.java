package com.haibei.pojo.application;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ResourceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int rowsPerPage = 50;

    public ResourceExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public void setLimitStart(int limitStart) {
        this.limitStart=limitStart;
    }

    public int getLimitStart() {
        return limitStart;
    }

    public void setRowsPerPage(int rowsPerPage) {
        this.rowsPerPage=rowsPerPage;
    }

    public int getRowsPerPage() {
        return rowsPerPage;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andWidIsNull() {
            addCriterion("WID is null");
            return (Criteria) this;
        }

        public Criteria andWidIsNotNull() {
            addCriterion("WID is not null");
            return (Criteria) this;
        }

        public Criteria andWidEqualTo(Long value) {
            addCriterion("WID =", value, "wid");
            return (Criteria) this;
        }

        public Criteria andWidNotEqualTo(Long value) {
            addCriterion("WID <>", value, "wid");
            return (Criteria) this;
        }

        public Criteria andWidGreaterThan(Long value) {
            addCriterion("WID >", value, "wid");
            return (Criteria) this;
        }

        public Criteria andWidGreaterThanOrEqualTo(Long value) {
            addCriterion("WID >=", value, "wid");
            return (Criteria) this;
        }

        public Criteria andWidLessThan(Long value) {
            addCriterion("WID <", value, "wid");
            return (Criteria) this;
        }

        public Criteria andWidLessThanOrEqualTo(Long value) {
            addCriterion("WID <=", value, "wid");
            return (Criteria) this;
        }

        public Criteria andWidIn(List<Long> values) {
            addCriterion("WID in", values, "wid");
            return (Criteria) this;
        }

        public Criteria andWidNotIn(List<Long> values) {
            addCriterion("WID not in", values, "wid");
            return (Criteria) this;
        }

        public Criteria andWidBetween(Long value1, Long value2) {
            addCriterion("WID between", value1, value2, "wid");
            return (Criteria) this;
        }

        public Criteria andWidNotBetween(Long value1, Long value2) {
            addCriterion("WID not between", value1, value2, "wid");
            return (Criteria) this;
        }

        public Criteria andAppIdIsNull() {
            addCriterion("APP_ID is null");
            return (Criteria) this;
        }

        public Criteria andAppIdIsNotNull() {
            addCriterion("APP_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAppIdEqualTo(Long value) {
            addCriterion("APP_ID =", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdNotEqualTo(Long value) {
            addCriterion("APP_ID <>", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdGreaterThan(Long value) {
            addCriterion("APP_ID >", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdGreaterThanOrEqualTo(Long value) {
            addCriterion("APP_ID >=", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdLessThan(Long value) {
            addCriterion("APP_ID <", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdLessThanOrEqualTo(Long value) {
            addCriterion("APP_ID <=", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdIn(List<Long> values) {
            addCriterion("APP_ID in", values, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdNotIn(List<Long> values) {
            addCriterion("APP_ID not in", values, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdBetween(Long value1, Long value2) {
            addCriterion("APP_ID between", value1, value2, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdNotBetween(Long value1, Long value2) {
            addCriterion("APP_ID not between", value1, value2, "appId");
            return (Criteria) this;
        }

        public Criteria andClassIdIsNull() {
            addCriterion("CLASS_ID is null");
            return (Criteria) this;
        }

        public Criteria andClassIdIsNotNull() {
            addCriterion("CLASS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andClassIdEqualTo(Long value) {
            addCriterion("CLASS_ID =", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdNotEqualTo(Long value) {
            addCriterion("CLASS_ID <>", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdGreaterThan(Long value) {
            addCriterion("CLASS_ID >", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdGreaterThanOrEqualTo(Long value) {
            addCriterion("CLASS_ID >=", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdLessThan(Long value) {
            addCriterion("CLASS_ID <", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdLessThanOrEqualTo(Long value) {
            addCriterion("CLASS_ID <=", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdIn(List<Long> values) {
            addCriterion("CLASS_ID in", values, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdNotIn(List<Long> values) {
            addCriterion("CLASS_ID not in", values, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdBetween(Long value1, Long value2) {
            addCriterion("CLASS_ID between", value1, value2, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdNotBetween(Long value1, Long value2) {
            addCriterion("CLASS_ID not between", value1, value2, "classId");
            return (Criteria) this;
        }

        public Criteria andResNameIsNull() {
            addCriterion("RES_NAME is null");
            return (Criteria) this;
        }

        public Criteria andResNameIsNotNull() {
            addCriterion("RES_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andResNameEqualTo(String value) {
            addCriterion("RES_NAME =", value, "resName");
            return (Criteria) this;
        }

        public Criteria andResNameNotEqualTo(String value) {
            addCriterion("RES_NAME <>", value, "resName");
            return (Criteria) this;
        }

        public Criteria andResNameGreaterThan(String value) {
            addCriterion("RES_NAME >", value, "resName");
            return (Criteria) this;
        }

        public Criteria andResNameGreaterThanOrEqualTo(String value) {
            addCriterion("RES_NAME >=", value, "resName");
            return (Criteria) this;
        }

        public Criteria andResNameLessThan(String value) {
            addCriterion("RES_NAME <", value, "resName");
            return (Criteria) this;
        }

        public Criteria andResNameLessThanOrEqualTo(String value) {
            addCriterion("RES_NAME <=", value, "resName");
            return (Criteria) this;
        }

        public Criteria andResNameLike(String value) {
            addCriterion("RES_NAME like", value, "resName");
            return (Criteria) this;
        }

        public Criteria andResNameNotLike(String value) {
            addCriterion("RES_NAME not like", value, "resName");
            return (Criteria) this;
        }

        public Criteria andResNameIn(List<String> values) {
            addCriterion("RES_NAME in", values, "resName");
            return (Criteria) this;
        }

        public Criteria andResNameNotIn(List<String> values) {
            addCriterion("RES_NAME not in", values, "resName");
            return (Criteria) this;
        }

        public Criteria andResNameBetween(String value1, String value2) {
            addCriterion("RES_NAME between", value1, value2, "resName");
            return (Criteria) this;
        }

        public Criteria andResNameNotBetween(String value1, String value2) {
            addCriterion("RES_NAME not between", value1, value2, "resName");
            return (Criteria) this;
        }

        public Criteria andResDesIsNull() {
            addCriterion("RES_DES is null");
            return (Criteria) this;
        }

        public Criteria andResDesIsNotNull() {
            addCriterion("RES_DES is not null");
            return (Criteria) this;
        }

        public Criteria andResDesEqualTo(String value) {
            addCriterion("RES_DES =", value, "resDes");
            return (Criteria) this;
        }

        public Criteria andResDesNotEqualTo(String value) {
            addCriterion("RES_DES <>", value, "resDes");
            return (Criteria) this;
        }

        public Criteria andResDesGreaterThan(String value) {
            addCriterion("RES_DES >", value, "resDes");
            return (Criteria) this;
        }

        public Criteria andResDesGreaterThanOrEqualTo(String value) {
            addCriterion("RES_DES >=", value, "resDes");
            return (Criteria) this;
        }

        public Criteria andResDesLessThan(String value) {
            addCriterion("RES_DES <", value, "resDes");
            return (Criteria) this;
        }

        public Criteria andResDesLessThanOrEqualTo(String value) {
            addCriterion("RES_DES <=", value, "resDes");
            return (Criteria) this;
        }

        public Criteria andResDesLike(String value) {
            addCriterion("RES_DES like", value, "resDes");
            return (Criteria) this;
        }

        public Criteria andResDesNotLike(String value) {
            addCriterion("RES_DES not like", value, "resDes");
            return (Criteria) this;
        }

        public Criteria andResDesIn(List<String> values) {
            addCriterion("RES_DES in", values, "resDes");
            return (Criteria) this;
        }

        public Criteria andResDesNotIn(List<String> values) {
            addCriterion("RES_DES not in", values, "resDes");
            return (Criteria) this;
        }

        public Criteria andResDesBetween(String value1, String value2) {
            addCriterion("RES_DES between", value1, value2, "resDes");
            return (Criteria) this;
        }

        public Criteria andResDesNotBetween(String value1, String value2) {
            addCriterion("RES_DES not between", value1, value2, "resDes");
            return (Criteria) this;
        }

        public Criteria andResNoIsNull() {
            addCriterion("RES_NO is null");
            return (Criteria) this;
        }

        public Criteria andResNoIsNotNull() {
            addCriterion("RES_NO is not null");
            return (Criteria) this;
        }

        public Criteria andResNoEqualTo(String value) {
            addCriterion("RES_NO =", value, "resNo");
            return (Criteria) this;
        }

        public Criteria andResNoNotEqualTo(String value) {
            addCriterion("RES_NO <>", value, "resNo");
            return (Criteria) this;
        }

        public Criteria andResNoGreaterThan(String value) {
            addCriterion("RES_NO >", value, "resNo");
            return (Criteria) this;
        }

        public Criteria andResNoGreaterThanOrEqualTo(String value) {
            addCriterion("RES_NO >=", value, "resNo");
            return (Criteria) this;
        }

        public Criteria andResNoLessThan(String value) {
            addCriterion("RES_NO <", value, "resNo");
            return (Criteria) this;
        }

        public Criteria andResNoLessThanOrEqualTo(String value) {
            addCriterion("RES_NO <=", value, "resNo");
            return (Criteria) this;
        }

        public Criteria andResNoLike(String value) {
            addCriterion("RES_NO like", value, "resNo");
            return (Criteria) this;
        }

        public Criteria andResNoNotLike(String value) {
            addCriterion("RES_NO not like", value, "resNo");
            return (Criteria) this;
        }

        public Criteria andResNoIn(List<String> values) {
            addCriterion("RES_NO in", values, "resNo");
            return (Criteria) this;
        }

        public Criteria andResNoNotIn(List<String> values) {
            addCriterion("RES_NO not in", values, "resNo");
            return (Criteria) this;
        }

        public Criteria andResNoBetween(String value1, String value2) {
            addCriterion("RES_NO between", value1, value2, "resNo");
            return (Criteria) this;
        }

        public Criteria andResNoNotBetween(String value1, String value2) {
            addCriterion("RES_NO not between", value1, value2, "resNo");
            return (Criteria) this;
        }

        public Criteria andResTypeIsNull() {
            addCriterion("RES_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andResTypeIsNotNull() {
            addCriterion("RES_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andResTypeEqualTo(String value) {
            addCriterion("RES_TYPE =", value, "resType");
            return (Criteria) this;
        }

        public Criteria andResTypeNotEqualTo(String value) {
            addCriterion("RES_TYPE <>", value, "resType");
            return (Criteria) this;
        }

        public Criteria andResTypeGreaterThan(String value) {
            addCriterion("RES_TYPE >", value, "resType");
            return (Criteria) this;
        }

        public Criteria andResTypeGreaterThanOrEqualTo(String value) {
            addCriterion("RES_TYPE >=", value, "resType");
            return (Criteria) this;
        }

        public Criteria andResTypeLessThan(String value) {
            addCriterion("RES_TYPE <", value, "resType");
            return (Criteria) this;
        }

        public Criteria andResTypeLessThanOrEqualTo(String value) {
            addCriterion("RES_TYPE <=", value, "resType");
            return (Criteria) this;
        }

        public Criteria andResTypeLike(String value) {
            addCriterion("RES_TYPE like", value, "resType");
            return (Criteria) this;
        }

        public Criteria andResTypeNotLike(String value) {
            addCriterion("RES_TYPE not like", value, "resType");
            return (Criteria) this;
        }

        public Criteria andResTypeIn(List<String> values) {
            addCriterion("RES_TYPE in", values, "resType");
            return (Criteria) this;
        }

        public Criteria andResTypeNotIn(List<String> values) {
            addCriterion("RES_TYPE not in", values, "resType");
            return (Criteria) this;
        }

        public Criteria andResTypeBetween(String value1, String value2) {
            addCriterion("RES_TYPE between", value1, value2, "resType");
            return (Criteria) this;
        }

        public Criteria andResTypeNotBetween(String value1, String value2) {
            addCriterion("RES_TYPE not between", value1, value2, "resType");
            return (Criteria) this;
        }

        public Criteria andResKeyIsNull() {
            addCriterion("RES_KEY is null");
            return (Criteria) this;
        }

        public Criteria andResKeyIsNotNull() {
            addCriterion("RES_KEY is not null");
            return (Criteria) this;
        }

        public Criteria andResKeyEqualTo(String value) {
            addCriterion("RES_KEY =", value, "resKey");
            return (Criteria) this;
        }

        public Criteria andResKeyNotEqualTo(String value) {
            addCriterion("RES_KEY <>", value, "resKey");
            return (Criteria) this;
        }

        public Criteria andResKeyGreaterThan(String value) {
            addCriterion("RES_KEY >", value, "resKey");
            return (Criteria) this;
        }

        public Criteria andResKeyGreaterThanOrEqualTo(String value) {
            addCriterion("RES_KEY >=", value, "resKey");
            return (Criteria) this;
        }

        public Criteria andResKeyLessThan(String value) {
            addCriterion("RES_KEY <", value, "resKey");
            return (Criteria) this;
        }

        public Criteria andResKeyLessThanOrEqualTo(String value) {
            addCriterion("RES_KEY <=", value, "resKey");
            return (Criteria) this;
        }

        public Criteria andResKeyLike(String value) {
            addCriterion("RES_KEY like", value, "resKey");
            return (Criteria) this;
        }

        public Criteria andResKeyNotLike(String value) {
            addCriterion("RES_KEY not like", value, "resKey");
            return (Criteria) this;
        }

        public Criteria andResKeyIn(List<String> values) {
            addCriterion("RES_KEY in", values, "resKey");
            return (Criteria) this;
        }

        public Criteria andResKeyNotIn(List<String> values) {
            addCriterion("RES_KEY not in", values, "resKey");
            return (Criteria) this;
        }

        public Criteria andResKeyBetween(String value1, String value2) {
            addCriterion("RES_KEY between", value1, value2, "resKey");
            return (Criteria) this;
        }

        public Criteria andResKeyNotBetween(String value1, String value2) {
            addCriterion("RES_KEY not between", value1, value2, "resKey");
            return (Criteria) this;
        }

        public Criteria andMenuIconIsNull() {
            addCriterion("MENU_ICON is null");
            return (Criteria) this;
        }

        public Criteria andMenuIconIsNotNull() {
            addCriterion("MENU_ICON is not null");
            return (Criteria) this;
        }

        public Criteria andMenuIconEqualTo(String value) {
            addCriterion("MENU_ICON =", value, "menuIcon");
            return (Criteria) this;
        }

        public Criteria andMenuIconNotEqualTo(String value) {
            addCriterion("MENU_ICON <>", value, "menuIcon");
            return (Criteria) this;
        }

        public Criteria andMenuIconGreaterThan(String value) {
            addCriterion("MENU_ICON >", value, "menuIcon");
            return (Criteria) this;
        }

        public Criteria andMenuIconGreaterThanOrEqualTo(String value) {
            addCriterion("MENU_ICON >=", value, "menuIcon");
            return (Criteria) this;
        }

        public Criteria andMenuIconLessThan(String value) {
            addCriterion("MENU_ICON <", value, "menuIcon");
            return (Criteria) this;
        }

        public Criteria andMenuIconLessThanOrEqualTo(String value) {
            addCriterion("MENU_ICON <=", value, "menuIcon");
            return (Criteria) this;
        }

        public Criteria andMenuIconLike(String value) {
            addCriterion("MENU_ICON like", value, "menuIcon");
            return (Criteria) this;
        }

        public Criteria andMenuIconNotLike(String value) {
            addCriterion("MENU_ICON not like", value, "menuIcon");
            return (Criteria) this;
        }

        public Criteria andMenuIconIn(List<String> values) {
            addCriterion("MENU_ICON in", values, "menuIcon");
            return (Criteria) this;
        }

        public Criteria andMenuIconNotIn(List<String> values) {
            addCriterion("MENU_ICON not in", values, "menuIcon");
            return (Criteria) this;
        }

        public Criteria andMenuIconBetween(String value1, String value2) {
            addCriterion("MENU_ICON between", value1, value2, "menuIcon");
            return (Criteria) this;
        }

        public Criteria andMenuIconNotBetween(String value1, String value2) {
            addCriterion("MENU_ICON not between", value1, value2, "menuIcon");
            return (Criteria) this;
        }

        public Criteria andPMenuIsNull() {
            addCriterion("P_MENU is null");
            return (Criteria) this;
        }

        public Criteria andPMenuIsNotNull() {
            addCriterion("P_MENU is not null");
            return (Criteria) this;
        }

        public Criteria andPMenuEqualTo(String value) {
            addCriterion("P_MENU =", value, "pMenu");
            return (Criteria) this;
        }

        public Criteria andPMenuNotEqualTo(String value) {
            addCriterion("P_MENU <>", value, "pMenu");
            return (Criteria) this;
        }

        public Criteria andPMenuGreaterThan(String value) {
            addCriterion("P_MENU >", value, "pMenu");
            return (Criteria) this;
        }

        public Criteria andPMenuGreaterThanOrEqualTo(String value) {
            addCriterion("P_MENU >=", value, "pMenu");
            return (Criteria) this;
        }

        public Criteria andPMenuLessThan(String value) {
            addCriterion("P_MENU <", value, "pMenu");
            return (Criteria) this;
        }

        public Criteria andPMenuLessThanOrEqualTo(String value) {
            addCriterion("P_MENU <=", value, "pMenu");
            return (Criteria) this;
        }

        public Criteria andPMenuLike(String value) {
            addCriterion("P_MENU like", value, "pMenu");
            return (Criteria) this;
        }

        public Criteria andPMenuNotLike(String value) {
            addCriterion("P_MENU not like", value, "pMenu");
            return (Criteria) this;
        }

        public Criteria andPMenuIn(List<String> values) {
            addCriterion("P_MENU in", values, "pMenu");
            return (Criteria) this;
        }

        public Criteria andPMenuNotIn(List<String> values) {
            addCriterion("P_MENU not in", values, "pMenu");
            return (Criteria) this;
        }

        public Criteria andPMenuBetween(String value1, String value2) {
            addCriterion("P_MENU between", value1, value2, "pMenu");
            return (Criteria) this;
        }

        public Criteria andPMenuNotBetween(String value1, String value2) {
            addCriterion("P_MENU not between", value1, value2, "pMenu");
            return (Criteria) this;
        }

        public Criteria andAccessUrlIsNull() {
            addCriterion("ACCESS_URL is null");
            return (Criteria) this;
        }

        public Criteria andAccessUrlIsNotNull() {
            addCriterion("ACCESS_URL is not null");
            return (Criteria) this;
        }

        public Criteria andAccessUrlEqualTo(String value) {
            addCriterion("ACCESS_URL =", value, "accessUrl");
            return (Criteria) this;
        }

        public Criteria andAccessUrlNotEqualTo(String value) {
            addCriterion("ACCESS_URL <>", value, "accessUrl");
            return (Criteria) this;
        }

        public Criteria andAccessUrlGreaterThan(String value) {
            addCriterion("ACCESS_URL >", value, "accessUrl");
            return (Criteria) this;
        }

        public Criteria andAccessUrlGreaterThanOrEqualTo(String value) {
            addCriterion("ACCESS_URL >=", value, "accessUrl");
            return (Criteria) this;
        }

        public Criteria andAccessUrlLessThan(String value) {
            addCriterion("ACCESS_URL <", value, "accessUrl");
            return (Criteria) this;
        }

        public Criteria andAccessUrlLessThanOrEqualTo(String value) {
            addCriterion("ACCESS_URL <=", value, "accessUrl");
            return (Criteria) this;
        }

        public Criteria andAccessUrlLike(String value) {
            addCriterion("ACCESS_URL like", value, "accessUrl");
            return (Criteria) this;
        }

        public Criteria andAccessUrlNotLike(String value) {
            addCriterion("ACCESS_URL not like", value, "accessUrl");
            return (Criteria) this;
        }

        public Criteria andAccessUrlIn(List<String> values) {
            addCriterion("ACCESS_URL in", values, "accessUrl");
            return (Criteria) this;
        }

        public Criteria andAccessUrlNotIn(List<String> values) {
            addCriterion("ACCESS_URL not in", values, "accessUrl");
            return (Criteria) this;
        }

        public Criteria andAccessUrlBetween(String value1, String value2) {
            addCriterion("ACCESS_URL between", value1, value2, "accessUrl");
            return (Criteria) this;
        }

        public Criteria andAccessUrlNotBetween(String value1, String value2) {
            addCriterion("ACCESS_URL not between", value1, value2, "accessUrl");
            return (Criteria) this;
        }

        public Criteria andIsTopMenuIsNull() {
            addCriterion("IS_TOP_MENU is null");
            return (Criteria) this;
        }

        public Criteria andIsTopMenuIsNotNull() {
            addCriterion("IS_TOP_MENU is not null");
            return (Criteria) this;
        }

        public Criteria andIsTopMenuEqualTo(String value) {
            addCriterion("IS_TOP_MENU =", value, "isTopMenu");
            return (Criteria) this;
        }

        public Criteria andIsTopMenuNotEqualTo(String value) {
            addCriterion("IS_TOP_MENU <>", value, "isTopMenu");
            return (Criteria) this;
        }

        public Criteria andIsTopMenuGreaterThan(String value) {
            addCriterion("IS_TOP_MENU >", value, "isTopMenu");
            return (Criteria) this;
        }

        public Criteria andIsTopMenuGreaterThanOrEqualTo(String value) {
            addCriterion("IS_TOP_MENU >=", value, "isTopMenu");
            return (Criteria) this;
        }

        public Criteria andIsTopMenuLessThan(String value) {
            addCriterion("IS_TOP_MENU <", value, "isTopMenu");
            return (Criteria) this;
        }

        public Criteria andIsTopMenuLessThanOrEqualTo(String value) {
            addCriterion("IS_TOP_MENU <=", value, "isTopMenu");
            return (Criteria) this;
        }

        public Criteria andIsTopMenuLike(String value) {
            addCriterion("IS_TOP_MENU like", value, "isTopMenu");
            return (Criteria) this;
        }

        public Criteria andIsTopMenuNotLike(String value) {
            addCriterion("IS_TOP_MENU not like", value, "isTopMenu");
            return (Criteria) this;
        }

        public Criteria andIsTopMenuIn(List<String> values) {
            addCriterion("IS_TOP_MENU in", values, "isTopMenu");
            return (Criteria) this;
        }

        public Criteria andIsTopMenuNotIn(List<String> values) {
            addCriterion("IS_TOP_MENU not in", values, "isTopMenu");
            return (Criteria) this;
        }

        public Criteria andIsTopMenuBetween(String value1, String value2) {
            addCriterion("IS_TOP_MENU between", value1, value2, "isTopMenu");
            return (Criteria) this;
        }

        public Criteria andIsTopMenuNotBetween(String value1, String value2) {
            addCriterion("IS_TOP_MENU not between", value1, value2, "isTopMenu");
            return (Criteria) this;
        }

        public Criteria andIsUseableIsNull() {
            addCriterion("IS_USEABLE is null");
            return (Criteria) this;
        }

        public Criteria andIsUseableIsNotNull() {
            addCriterion("IS_USEABLE is not null");
            return (Criteria) this;
        }

        public Criteria andIsUseableEqualTo(String value) {
            addCriterion("IS_USEABLE =", value, "isUseable");
            return (Criteria) this;
        }

        public Criteria andIsUseableNotEqualTo(String value) {
            addCriterion("IS_USEABLE <>", value, "isUseable");
            return (Criteria) this;
        }

        public Criteria andIsUseableGreaterThan(String value) {
            addCriterion("IS_USEABLE >", value, "isUseable");
            return (Criteria) this;
        }

        public Criteria andIsUseableGreaterThanOrEqualTo(String value) {
            addCriterion("IS_USEABLE >=", value, "isUseable");
            return (Criteria) this;
        }

        public Criteria andIsUseableLessThan(String value) {
            addCriterion("IS_USEABLE <", value, "isUseable");
            return (Criteria) this;
        }

        public Criteria andIsUseableLessThanOrEqualTo(String value) {
            addCriterion("IS_USEABLE <=", value, "isUseable");
            return (Criteria) this;
        }

        public Criteria andIsUseableLike(String value) {
            addCriterion("IS_USEABLE like", value, "isUseable");
            return (Criteria) this;
        }

        public Criteria andIsUseableNotLike(String value) {
            addCriterion("IS_USEABLE not like", value, "isUseable");
            return (Criteria) this;
        }

        public Criteria andIsUseableIn(List<String> values) {
            addCriterion("IS_USEABLE in", values, "isUseable");
            return (Criteria) this;
        }

        public Criteria andIsUseableNotIn(List<String> values) {
            addCriterion("IS_USEABLE not in", values, "isUseable");
            return (Criteria) this;
        }

        public Criteria andIsUseableBetween(String value1, String value2) {
            addCriterion("IS_USEABLE between", value1, value2, "isUseable");
            return (Criteria) this;
        }

        public Criteria andIsUseableNotBetween(String value1, String value2) {
            addCriterion("IS_USEABLE not between", value1, value2, "isUseable");
            return (Criteria) this;
        }

        public Criteria andIsDisplayIsNull() {
            addCriterion("IS_DISPLAY is null");
            return (Criteria) this;
        }

        public Criteria andIsDisplayIsNotNull() {
            addCriterion("IS_DISPLAY is not null");
            return (Criteria) this;
        }

        public Criteria andIsDisplayEqualTo(String value) {
            addCriterion("IS_DISPLAY =", value, "isDisplay");
            return (Criteria) this;
        }

        public Criteria andIsDisplayNotEqualTo(String value) {
            addCriterion("IS_DISPLAY <>", value, "isDisplay");
            return (Criteria) this;
        }

        public Criteria andIsDisplayGreaterThan(String value) {
            addCriterion("IS_DISPLAY >", value, "isDisplay");
            return (Criteria) this;
        }

        public Criteria andIsDisplayGreaterThanOrEqualTo(String value) {
            addCriterion("IS_DISPLAY >=", value, "isDisplay");
            return (Criteria) this;
        }

        public Criteria andIsDisplayLessThan(String value) {
            addCriterion("IS_DISPLAY <", value, "isDisplay");
            return (Criteria) this;
        }

        public Criteria andIsDisplayLessThanOrEqualTo(String value) {
            addCriterion("IS_DISPLAY <=", value, "isDisplay");
            return (Criteria) this;
        }

        public Criteria andIsDisplayLike(String value) {
            addCriterion("IS_DISPLAY like", value, "isDisplay");
            return (Criteria) this;
        }

        public Criteria andIsDisplayNotLike(String value) {
            addCriterion("IS_DISPLAY not like", value, "isDisplay");
            return (Criteria) this;
        }

        public Criteria andIsDisplayIn(List<String> values) {
            addCriterion("IS_DISPLAY in", values, "isDisplay");
            return (Criteria) this;
        }

        public Criteria andIsDisplayNotIn(List<String> values) {
            addCriterion("IS_DISPLAY not in", values, "isDisplay");
            return (Criteria) this;
        }

        public Criteria andIsDisplayBetween(String value1, String value2) {
            addCriterion("IS_DISPLAY between", value1, value2, "isDisplay");
            return (Criteria) this;
        }

        public Criteria andIsDisplayNotBetween(String value1, String value2) {
            addCriterion("IS_DISPLAY not between", value1, value2, "isDisplay");
            return (Criteria) this;
        }

        public Criteria andCreatedByIsNull() {
            addCriterion("CREATED_BY is null");
            return (Criteria) this;
        }

        public Criteria andCreatedByIsNotNull() {
            addCriterion("CREATED_BY is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedByEqualTo(String value) {
            addCriterion("CREATED_BY =", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotEqualTo(String value) {
            addCriterion("CREATED_BY <>", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByGreaterThan(String value) {
            addCriterion("CREATED_BY >", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByGreaterThanOrEqualTo(String value) {
            addCriterion("CREATED_BY >=", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByLessThan(String value) {
            addCriterion("CREATED_BY <", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByLessThanOrEqualTo(String value) {
            addCriterion("CREATED_BY <=", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByLike(String value) {
            addCriterion("CREATED_BY like", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotLike(String value) {
            addCriterion("CREATED_BY not like", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByIn(List<String> values) {
            addCriterion("CREATED_BY in", values, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotIn(List<String> values) {
            addCriterion("CREATED_BY not in", values, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByBetween(String value1, String value2) {
            addCriterion("CREATED_BY between", value1, value2, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotBetween(String value1, String value2) {
            addCriterion("CREATED_BY not between", value1, value2, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreationTimeIsNull() {
            addCriterion("CREATION_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreationTimeIsNotNull() {
            addCriterion("CREATION_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreationTimeEqualTo(Date value) {
            addCriterion("CREATION_TIME =", value, "creationTime");
            return (Criteria) this;
        }

        public Criteria andCreationTimeNotEqualTo(Date value) {
            addCriterion("CREATION_TIME <>", value, "creationTime");
            return (Criteria) this;
        }

        public Criteria andCreationTimeGreaterThan(Date value) {
            addCriterion("CREATION_TIME >", value, "creationTime");
            return (Criteria) this;
        }

        public Criteria andCreationTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATION_TIME >=", value, "creationTime");
            return (Criteria) this;
        }

        public Criteria andCreationTimeLessThan(Date value) {
            addCriterion("CREATION_TIME <", value, "creationTime");
            return (Criteria) this;
        }

        public Criteria andCreationTimeLessThanOrEqualTo(Date value) {
            addCriterion("CREATION_TIME <=", value, "creationTime");
            return (Criteria) this;
        }

        public Criteria andCreationTimeIn(List<Date> values) {
            addCriterion("CREATION_TIME in", values, "creationTime");
            return (Criteria) this;
        }

        public Criteria andCreationTimeNotIn(List<Date> values) {
            addCriterion("CREATION_TIME not in", values, "creationTime");
            return (Criteria) this;
        }

        public Criteria andCreationTimeBetween(Date value1, Date value2) {
            addCriterion("CREATION_TIME between", value1, value2, "creationTime");
            return (Criteria) this;
        }

        public Criteria andCreationTimeNotBetween(Date value1, Date value2) {
            addCriterion("CREATION_TIME not between", value1, value2, "creationTime");
            return (Criteria) this;
        }

        public Criteria andModifiedByIsNull() {
            addCriterion("MODIFIED_BY is null");
            return (Criteria) this;
        }

        public Criteria andModifiedByIsNotNull() {
            addCriterion("MODIFIED_BY is not null");
            return (Criteria) this;
        }

        public Criteria andModifiedByEqualTo(String value) {
            addCriterion("MODIFIED_BY =", value, "modifiedBy");
            return (Criteria) this;
        }

        public Criteria andModifiedByNotEqualTo(String value) {
            addCriterion("MODIFIED_BY <>", value, "modifiedBy");
            return (Criteria) this;
        }

        public Criteria andModifiedByGreaterThan(String value) {
            addCriterion("MODIFIED_BY >", value, "modifiedBy");
            return (Criteria) this;
        }

        public Criteria andModifiedByGreaterThanOrEqualTo(String value) {
            addCriterion("MODIFIED_BY >=", value, "modifiedBy");
            return (Criteria) this;
        }

        public Criteria andModifiedByLessThan(String value) {
            addCriterion("MODIFIED_BY <", value, "modifiedBy");
            return (Criteria) this;
        }

        public Criteria andModifiedByLessThanOrEqualTo(String value) {
            addCriterion("MODIFIED_BY <=", value, "modifiedBy");
            return (Criteria) this;
        }

        public Criteria andModifiedByLike(String value) {
            addCriterion("MODIFIED_BY like", value, "modifiedBy");
            return (Criteria) this;
        }

        public Criteria andModifiedByNotLike(String value) {
            addCriterion("MODIFIED_BY not like", value, "modifiedBy");
            return (Criteria) this;
        }

        public Criteria andModifiedByIn(List<String> values) {
            addCriterion("MODIFIED_BY in", values, "modifiedBy");
            return (Criteria) this;
        }

        public Criteria andModifiedByNotIn(List<String> values) {
            addCriterion("MODIFIED_BY not in", values, "modifiedBy");
            return (Criteria) this;
        }

        public Criteria andModifiedByBetween(String value1, String value2) {
            addCriterion("MODIFIED_BY between", value1, value2, "modifiedBy");
            return (Criteria) this;
        }

        public Criteria andModifiedByNotBetween(String value1, String value2) {
            addCriterion("MODIFIED_BY not between", value1, value2, "modifiedBy");
            return (Criteria) this;
        }

        public Criteria andModificationTimeIsNull() {
            addCriterion("MODIFICATION_TIME is null");
            return (Criteria) this;
        }

        public Criteria andModificationTimeIsNotNull() {
            addCriterion("MODIFICATION_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andModificationTimeEqualTo(Date value) {
            addCriterion("MODIFICATION_TIME =", value, "modificationTime");
            return (Criteria) this;
        }

        public Criteria andModificationTimeNotEqualTo(Date value) {
            addCriterion("MODIFICATION_TIME <>", value, "modificationTime");
            return (Criteria) this;
        }

        public Criteria andModificationTimeGreaterThan(Date value) {
            addCriterion("MODIFICATION_TIME >", value, "modificationTime");
            return (Criteria) this;
        }

        public Criteria andModificationTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("MODIFICATION_TIME >=", value, "modificationTime");
            return (Criteria) this;
        }

        public Criteria andModificationTimeLessThan(Date value) {
            addCriterion("MODIFICATION_TIME <", value, "modificationTime");
            return (Criteria) this;
        }

        public Criteria andModificationTimeLessThanOrEqualTo(Date value) {
            addCriterion("MODIFICATION_TIME <=", value, "modificationTime");
            return (Criteria) this;
        }

        public Criteria andModificationTimeIn(List<Date> values) {
            addCriterion("MODIFICATION_TIME in", values, "modificationTime");
            return (Criteria) this;
        }

        public Criteria andModificationTimeNotIn(List<Date> values) {
            addCriterion("MODIFICATION_TIME not in", values, "modificationTime");
            return (Criteria) this;
        }

        public Criteria andModificationTimeBetween(Date value1, Date value2) {
            addCriterion("MODIFICATION_TIME between", value1, value2, "modificationTime");
            return (Criteria) this;
        }

        public Criteria andModificationTimeNotBetween(Date value1, Date value2) {
            addCriterion("MODIFICATION_TIME not between", value1, value2, "modificationTime");
            return (Criteria) this;
        }

        public Criteria andDeleteStatusIsNull() {
            addCriterion("DELETE_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andDeleteStatusIsNotNull() {
            addCriterion("DELETE_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andDeleteStatusEqualTo(String value) {
            addCriterion("DELETE_STATUS =", value, "deleteStatus");
            return (Criteria) this;
        }

        public Criteria andDeleteStatusNotEqualTo(String value) {
            addCriterion("DELETE_STATUS <>", value, "deleteStatus");
            return (Criteria) this;
        }

        public Criteria andDeleteStatusGreaterThan(String value) {
            addCriterion("DELETE_STATUS >", value, "deleteStatus");
            return (Criteria) this;
        }

        public Criteria andDeleteStatusGreaterThanOrEqualTo(String value) {
            addCriterion("DELETE_STATUS >=", value, "deleteStatus");
            return (Criteria) this;
        }

        public Criteria andDeleteStatusLessThan(String value) {
            addCriterion("DELETE_STATUS <", value, "deleteStatus");
            return (Criteria) this;
        }

        public Criteria andDeleteStatusLessThanOrEqualTo(String value) {
            addCriterion("DELETE_STATUS <=", value, "deleteStatus");
            return (Criteria) this;
        }

        public Criteria andDeleteStatusLike(String value) {
            addCriterion("DELETE_STATUS like", value, "deleteStatus");
            return (Criteria) this;
        }

        public Criteria andDeleteStatusNotLike(String value) {
            addCriterion("DELETE_STATUS not like", value, "deleteStatus");
            return (Criteria) this;
        }

        public Criteria andDeleteStatusIn(List<String> values) {
            addCriterion("DELETE_STATUS in", values, "deleteStatus");
            return (Criteria) this;
        }

        public Criteria andDeleteStatusNotIn(List<String> values) {
            addCriterion("DELETE_STATUS not in", values, "deleteStatus");
            return (Criteria) this;
        }

        public Criteria andDeleteStatusBetween(String value1, String value2) {
            addCriterion("DELETE_STATUS between", value1, value2, "deleteStatus");
            return (Criteria) this;
        }

        public Criteria andDeleteStatusNotBetween(String value1, String value2) {
            addCriterion("DELETE_STATUS not between", value1, value2, "deleteStatus");
            return (Criteria) this;
        }

        public Criteria andTableVerIsNull() {
            addCriterion("TABLE_VER is null");
            return (Criteria) this;
        }

        public Criteria andTableVerIsNotNull() {
            addCriterion("TABLE_VER is not null");
            return (Criteria) this;
        }

        public Criteria andTableVerEqualTo(Integer value) {
            addCriterion("TABLE_VER =", value, "tableVer");
            return (Criteria) this;
        }

        public Criteria andTableVerNotEqualTo(Integer value) {
            addCriterion("TABLE_VER <>", value, "tableVer");
            return (Criteria) this;
        }

        public Criteria andTableVerGreaterThan(Integer value) {
            addCriterion("TABLE_VER >", value, "tableVer");
            return (Criteria) this;
        }

        public Criteria andTableVerGreaterThanOrEqualTo(Integer value) {
            addCriterion("TABLE_VER >=", value, "tableVer");
            return (Criteria) this;
        }

        public Criteria andTableVerLessThan(Integer value) {
            addCriterion("TABLE_VER <", value, "tableVer");
            return (Criteria) this;
        }

        public Criteria andTableVerLessThanOrEqualTo(Integer value) {
            addCriterion("TABLE_VER <=", value, "tableVer");
            return (Criteria) this;
        }

        public Criteria andTableVerIn(List<Integer> values) {
            addCriterion("TABLE_VER in", values, "tableVer");
            return (Criteria) this;
        }

        public Criteria andTableVerNotIn(List<Integer> values) {
            addCriterion("TABLE_VER not in", values, "tableVer");
            return (Criteria) this;
        }

        public Criteria andTableVerBetween(Integer value1, Integer value2) {
            addCriterion("TABLE_VER between", value1, value2, "tableVer");
            return (Criteria) this;
        }

        public Criteria andTableVerNotBetween(Integer value1, Integer value2) {
            addCriterion("TABLE_VER not between", value1, value2, "tableVer");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}