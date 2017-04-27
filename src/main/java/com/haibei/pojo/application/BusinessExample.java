package com.haibei.pojo.application;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BusinessExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int rowsPerPage = -1;

    public BusinessExample() {
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

        public Criteria andAppWidIsNull() {
            addCriterion("APP_WID is null");
            return (Criteria) this;
        }

        public Criteria andAppWidIsNotNull() {
            addCriterion("APP_WID is not null");
            return (Criteria) this;
        }

        public Criteria andAppWidEqualTo(Long value) {
            addCriterion("APP_WID =", value, "appWid");
            return (Criteria) this;
        }

        public Criteria andAppWidNotEqualTo(Long value) {
            addCriterion("APP_WID <>", value, "appWid");
            return (Criteria) this;
        }

        public Criteria andAppWidGreaterThan(Long value) {
            addCriterion("APP_WID >", value, "appWid");
            return (Criteria) this;
        }

        public Criteria andAppWidGreaterThanOrEqualTo(Long value) {
            addCriterion("APP_WID >=", value, "appWid");
            return (Criteria) this;
        }

        public Criteria andAppWidLessThan(Long value) {
            addCriterion("APP_WID <", value, "appWid");
            return (Criteria) this;
        }

        public Criteria andAppWidLessThanOrEqualTo(Long value) {
            addCriterion("APP_WID <=", value, "appWid");
            return (Criteria) this;
        }

        public Criteria andAppWidIn(List<Long> values) {
            addCriterion("APP_WID in", values, "appWid");
            return (Criteria) this;
        }

        public Criteria andAppWidNotIn(List<Long> values) {
            addCriterion("APP_WID not in", values, "appWid");
            return (Criteria) this;
        }

        public Criteria andAppWidBetween(Long value1, Long value2) {
            addCriterion("APP_WID between", value1, value2, "appWid");
            return (Criteria) this;
        }

        public Criteria andAppWidNotBetween(Long value1, Long value2) {
            addCriterion("APP_WID not between", value1, value2, "appWid");
            return (Criteria) this;
        }

        public Criteria andBusiPackageIsNull() {
            addCriterion("BUSI_PACKAGE is null");
            return (Criteria) this;
        }

        public Criteria andBusiPackageIsNotNull() {
            addCriterion("BUSI_PACKAGE is not null");
            return (Criteria) this;
        }

        public Criteria andBusiPackageEqualTo(String value) {
            addCriterion("BUSI_PACKAGE =", value, "busiPackage");
            return (Criteria) this;
        }

        public Criteria andBusiPackageNotEqualTo(String value) {
            addCriterion("BUSI_PACKAGE <>", value, "busiPackage");
            return (Criteria) this;
        }

        public Criteria andBusiPackageGreaterThan(String value) {
            addCriterion("BUSI_PACKAGE >", value, "busiPackage");
            return (Criteria) this;
        }

        public Criteria andBusiPackageGreaterThanOrEqualTo(String value) {
            addCriterion("BUSI_PACKAGE >=", value, "busiPackage");
            return (Criteria) this;
        }

        public Criteria andBusiPackageLessThan(String value) {
            addCriterion("BUSI_PACKAGE <", value, "busiPackage");
            return (Criteria) this;
        }

        public Criteria andBusiPackageLessThanOrEqualTo(String value) {
            addCriterion("BUSI_PACKAGE <=", value, "busiPackage");
            return (Criteria) this;
        }

        public Criteria andBusiPackageLike(String value) {
            addCriterion("BUSI_PACKAGE like", value, "busiPackage");
            return (Criteria) this;
        }

        public Criteria andBusiPackageNotLike(String value) {
            addCriterion("BUSI_PACKAGE not like", value, "busiPackage");
            return (Criteria) this;
        }

        public Criteria andBusiPackageIn(List<String> values) {
            addCriterion("BUSI_PACKAGE in", values, "busiPackage");
            return (Criteria) this;
        }

        public Criteria andBusiPackageNotIn(List<String> values) {
            addCriterion("BUSI_PACKAGE not in", values, "busiPackage");
            return (Criteria) this;
        }

        public Criteria andBusiPackageBetween(String value1, String value2) {
            addCriterion("BUSI_PACKAGE between", value1, value2, "busiPackage");
            return (Criteria) this;
        }

        public Criteria andBusiPackageNotBetween(String value1, String value2) {
            addCriterion("BUSI_PACKAGE not between", value1, value2, "busiPackage");
            return (Criteria) this;
        }

        public Criteria andBusiClassIsNull() {
            addCriterion("BUSI_CLASS is null");
            return (Criteria) this;
        }

        public Criteria andBusiClassIsNotNull() {
            addCriterion("BUSI_CLASS is not null");
            return (Criteria) this;
        }

        public Criteria andBusiClassEqualTo(String value) {
            addCriterion("BUSI_CLASS =", value, "busiClass");
            return (Criteria) this;
        }

        public Criteria andBusiClassNotEqualTo(String value) {
            addCriterion("BUSI_CLASS <>", value, "busiClass");
            return (Criteria) this;
        }

        public Criteria andBusiClassGreaterThan(String value) {
            addCriterion("BUSI_CLASS >", value, "busiClass");
            return (Criteria) this;
        }

        public Criteria andBusiClassGreaterThanOrEqualTo(String value) {
            addCriterion("BUSI_CLASS >=", value, "busiClass");
            return (Criteria) this;
        }

        public Criteria andBusiClassLessThan(String value) {
            addCriterion("BUSI_CLASS <", value, "busiClass");
            return (Criteria) this;
        }

        public Criteria andBusiClassLessThanOrEqualTo(String value) {
            addCriterion("BUSI_CLASS <=", value, "busiClass");
            return (Criteria) this;
        }

        public Criteria andBusiClassLike(String value) {
            addCriterion("BUSI_CLASS like", value, "busiClass");
            return (Criteria) this;
        }

        public Criteria andBusiClassNotLike(String value) {
            addCriterion("BUSI_CLASS not like", value, "busiClass");
            return (Criteria) this;
        }

        public Criteria andBusiClassIn(List<String> values) {
            addCriterion("BUSI_CLASS in", values, "busiClass");
            return (Criteria) this;
        }

        public Criteria andBusiClassNotIn(List<String> values) {
            addCriterion("BUSI_CLASS not in", values, "busiClass");
            return (Criteria) this;
        }

        public Criteria andBusiClassBetween(String value1, String value2) {
            addCriterion("BUSI_CLASS between", value1, value2, "busiClass");
            return (Criteria) this;
        }

        public Criteria andBusiClassNotBetween(String value1, String value2) {
            addCriterion("BUSI_CLASS not between", value1, value2, "busiClass");
            return (Criteria) this;
        }

        public Criteria andClassTypeIsNull() {
            addCriterion("CLASS_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andClassTypeIsNotNull() {
            addCriterion("CLASS_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andClassTypeEqualTo(String value) {
            addCriterion("CLASS_TYPE =", value, "classType");
            return (Criteria) this;
        }

        public Criteria andClassTypeNotEqualTo(String value) {
            addCriterion("CLASS_TYPE <>", value, "classType");
            return (Criteria) this;
        }

        public Criteria andClassTypeGreaterThan(String value) {
            addCriterion("CLASS_TYPE >", value, "classType");
            return (Criteria) this;
        }

        public Criteria andClassTypeGreaterThanOrEqualTo(String value) {
            addCriterion("CLASS_TYPE >=", value, "classType");
            return (Criteria) this;
        }

        public Criteria andClassTypeLessThan(String value) {
            addCriterion("CLASS_TYPE <", value, "classType");
            return (Criteria) this;
        }

        public Criteria andClassTypeLessThanOrEqualTo(String value) {
            addCriterion("CLASS_TYPE <=", value, "classType");
            return (Criteria) this;
        }

        public Criteria andClassTypeLike(String value) {
            addCriterion("CLASS_TYPE like", value, "classType");
            return (Criteria) this;
        }

        public Criteria andClassTypeNotLike(String value) {
            addCriterion("CLASS_TYPE not like", value, "classType");
            return (Criteria) this;
        }

        public Criteria andClassTypeIn(List<String> values) {
            addCriterion("CLASS_TYPE in", values, "classType");
            return (Criteria) this;
        }

        public Criteria andClassTypeNotIn(List<String> values) {
            addCriterion("CLASS_TYPE not in", values, "classType");
            return (Criteria) this;
        }

        public Criteria andClassTypeBetween(String value1, String value2) {
            addCriterion("CLASS_TYPE between", value1, value2, "classType");
            return (Criteria) this;
        }

        public Criteria andClassTypeNotBetween(String value1, String value2) {
            addCriterion("CLASS_TYPE not between", value1, value2, "classType");
            return (Criteria) this;
        }

        public Criteria andBusiDesIsNull() {
            addCriterion("BUSI_DES is null");
            return (Criteria) this;
        }

        public Criteria andBusiDesIsNotNull() {
            addCriterion("BUSI_DES is not null");
            return (Criteria) this;
        }

        public Criteria andBusiDesEqualTo(String value) {
            addCriterion("BUSI_DES =", value, "busiDes");
            return (Criteria) this;
        }

        public Criteria andBusiDesNotEqualTo(String value) {
            addCriterion("BUSI_DES <>", value, "busiDes");
            return (Criteria) this;
        }

        public Criteria andBusiDesGreaterThan(String value) {
            addCriterion("BUSI_DES >", value, "busiDes");
            return (Criteria) this;
        }

        public Criteria andBusiDesGreaterThanOrEqualTo(String value) {
            addCriterion("BUSI_DES >=", value, "busiDes");
            return (Criteria) this;
        }

        public Criteria andBusiDesLessThan(String value) {
            addCriterion("BUSI_DES <", value, "busiDes");
            return (Criteria) this;
        }

        public Criteria andBusiDesLessThanOrEqualTo(String value) {
            addCriterion("BUSI_DES <=", value, "busiDes");
            return (Criteria) this;
        }

        public Criteria andBusiDesLike(String value) {
            addCriterion("BUSI_DES like", value, "busiDes");
            return (Criteria) this;
        }

        public Criteria andBusiDesNotLike(String value) {
            addCriterion("BUSI_DES not like", value, "busiDes");
            return (Criteria) this;
        }

        public Criteria andBusiDesIn(List<String> values) {
            addCriterion("BUSI_DES in", values, "busiDes");
            return (Criteria) this;
        }

        public Criteria andBusiDesNotIn(List<String> values) {
            addCriterion("BUSI_DES not in", values, "busiDes");
            return (Criteria) this;
        }

        public Criteria andBusiDesBetween(String value1, String value2) {
            addCriterion("BUSI_DES between", value1, value2, "busiDes");
            return (Criteria) this;
        }

        public Criteria andBusiDesNotBetween(String value1, String value2) {
            addCriterion("BUSI_DES not between", value1, value2, "busiDes");
            return (Criteria) this;
        }

        public Criteria andBusiUrlIsNull() {
            addCriterion("BUSI_URL is null");
            return (Criteria) this;
        }

        public Criteria andBusiUrlIsNotNull() {
            addCriterion("BUSI_URL is not null");
            return (Criteria) this;
        }

        public Criteria andBusiUrlEqualTo(String value) {
            addCriterion("BUSI_URL =", value, "busiUrl");
            return (Criteria) this;
        }

        public Criteria andBusiUrlNotEqualTo(String value) {
            addCriterion("BUSI_URL <>", value, "busiUrl");
            return (Criteria) this;
        }

        public Criteria andBusiUrlGreaterThan(String value) {
            addCriterion("BUSI_URL >", value, "busiUrl");
            return (Criteria) this;
        }

        public Criteria andBusiUrlGreaterThanOrEqualTo(String value) {
            addCriterion("BUSI_URL >=", value, "busiUrl");
            return (Criteria) this;
        }

        public Criteria andBusiUrlLessThan(String value) {
            addCriterion("BUSI_URL <", value, "busiUrl");
            return (Criteria) this;
        }

        public Criteria andBusiUrlLessThanOrEqualTo(String value) {
            addCriterion("BUSI_URL <=", value, "busiUrl");
            return (Criteria) this;
        }

        public Criteria andBusiUrlLike(String value) {
            addCriterion("BUSI_URL like", value, "busiUrl");
            return (Criteria) this;
        }

        public Criteria andBusiUrlNotLike(String value) {
            addCriterion("BUSI_URL not like", value, "busiUrl");
            return (Criteria) this;
        }

        public Criteria andBusiUrlIn(List<String> values) {
            addCriterion("BUSI_URL in", values, "busiUrl");
            return (Criteria) this;
        }

        public Criteria andBusiUrlNotIn(List<String> values) {
            addCriterion("BUSI_URL not in", values, "busiUrl");
            return (Criteria) this;
        }

        public Criteria andBusiUrlBetween(String value1, String value2) {
            addCriterion("BUSI_URL between", value1, value2, "busiUrl");
            return (Criteria) this;
        }

        public Criteria andBusiUrlNotBetween(String value1, String value2) {
            addCriterion("BUSI_URL not between", value1, value2, "busiUrl");
            return (Criteria) this;
        }

        public Criteria andIsAuthIsNull() {
            addCriterion("IS_AUTH is null");
            return (Criteria) this;
        }

        public Criteria andIsAuthIsNotNull() {
            addCriterion("IS_AUTH is not null");
            return (Criteria) this;
        }

        public Criteria andIsAuthEqualTo(String value) {
            addCriterion("IS_AUTH =", value, "isAuth");
            return (Criteria) this;
        }

        public Criteria andIsAuthNotEqualTo(String value) {
            addCriterion("IS_AUTH <>", value, "isAuth");
            return (Criteria) this;
        }

        public Criteria andIsAuthGreaterThan(String value) {
            addCriterion("IS_AUTH >", value, "isAuth");
            return (Criteria) this;
        }

        public Criteria andIsAuthGreaterThanOrEqualTo(String value) {
            addCriterion("IS_AUTH >=", value, "isAuth");
            return (Criteria) this;
        }

        public Criteria andIsAuthLessThan(String value) {
            addCriterion("IS_AUTH <", value, "isAuth");
            return (Criteria) this;
        }

        public Criteria andIsAuthLessThanOrEqualTo(String value) {
            addCriterion("IS_AUTH <=", value, "isAuth");
            return (Criteria) this;
        }

        public Criteria andIsAuthLike(String value) {
            addCriterion("IS_AUTH like", value, "isAuth");
            return (Criteria) this;
        }

        public Criteria andIsAuthNotLike(String value) {
            addCriterion("IS_AUTH not like", value, "isAuth");
            return (Criteria) this;
        }

        public Criteria andIsAuthIn(List<String> values) {
            addCriterion("IS_AUTH in", values, "isAuth");
            return (Criteria) this;
        }

        public Criteria andIsAuthNotIn(List<String> values) {
            addCriterion("IS_AUTH not in", values, "isAuth");
            return (Criteria) this;
        }

        public Criteria andIsAuthBetween(String value1, String value2) {
            addCriterion("IS_AUTH between", value1, value2, "isAuth");
            return (Criteria) this;
        }

        public Criteria andIsAuthNotBetween(String value1, String value2) {
            addCriterion("IS_AUTH not between", value1, value2, "isAuth");
            return (Criteria) this;
        }

        public Criteria andIsAvailableIsNull() {
            addCriterion("IS_AVAILABLE is null");
            return (Criteria) this;
        }

        public Criteria andIsAvailableIsNotNull() {
            addCriterion("IS_AVAILABLE is not null");
            return (Criteria) this;
        }

        public Criteria andIsAvailableEqualTo(String value) {
            addCriterion("IS_AVAILABLE =", value, "isAvailable");
            return (Criteria) this;
        }

        public Criteria andIsAvailableNotEqualTo(String value) {
            addCriterion("IS_AVAILABLE <>", value, "isAvailable");
            return (Criteria) this;
        }

        public Criteria andIsAvailableGreaterThan(String value) {
            addCriterion("IS_AVAILABLE >", value, "isAvailable");
            return (Criteria) this;
        }

        public Criteria andIsAvailableGreaterThanOrEqualTo(String value) {
            addCriterion("IS_AVAILABLE >=", value, "isAvailable");
            return (Criteria) this;
        }

        public Criteria andIsAvailableLessThan(String value) {
            addCriterion("IS_AVAILABLE <", value, "isAvailable");
            return (Criteria) this;
        }

        public Criteria andIsAvailableLessThanOrEqualTo(String value) {
            addCriterion("IS_AVAILABLE <=", value, "isAvailable");
            return (Criteria) this;
        }

        public Criteria andIsAvailableLike(String value) {
            addCriterion("IS_AVAILABLE like", value, "isAvailable");
            return (Criteria) this;
        }

        public Criteria andIsAvailableNotLike(String value) {
            addCriterion("IS_AVAILABLE not like", value, "isAvailable");
            return (Criteria) this;
        }

        public Criteria andIsAvailableIn(List<String> values) {
            addCriterion("IS_AVAILABLE in", values, "isAvailable");
            return (Criteria) this;
        }

        public Criteria andIsAvailableNotIn(List<String> values) {
            addCriterion("IS_AVAILABLE not in", values, "isAvailable");
            return (Criteria) this;
        }

        public Criteria andIsAvailableBetween(String value1, String value2) {
            addCriterion("IS_AVAILABLE between", value1, value2, "isAvailable");
            return (Criteria) this;
        }

        public Criteria andIsAvailableNotBetween(String value1, String value2) {
            addCriterion("IS_AVAILABLE not between", value1, value2, "isAvailable");
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