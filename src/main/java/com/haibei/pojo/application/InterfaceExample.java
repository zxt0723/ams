package com.haibei.pojo.application;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class InterfaceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int rowsPerPage = -1;

    public InterfaceExample() {
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

        public Criteria andBusiWidIsNull() {
            addCriterion("BUSI_WID is null");
            return (Criteria) this;
        }

        public Criteria andBusiWidIsNotNull() {
            addCriterion("BUSI_WID is not null");
            return (Criteria) this;
        }

        public Criteria andBusiWidEqualTo(Long value) {
            addCriterion("BUSI_WID =", value, "busiWid");
            return (Criteria) this;
        }

        public Criteria andBusiWidNotEqualTo(Long value) {
            addCriterion("BUSI_WID <>", value, "busiWid");
            return (Criteria) this;
        }

        public Criteria andBusiWidGreaterThan(Long value) {
            addCriterion("BUSI_WID >", value, "busiWid");
            return (Criteria) this;
        }

        public Criteria andBusiWidGreaterThanOrEqualTo(Long value) {
            addCriterion("BUSI_WID >=", value, "busiWid");
            return (Criteria) this;
        }

        public Criteria andBusiWidLessThan(Long value) {
            addCriterion("BUSI_WID <", value, "busiWid");
            return (Criteria) this;
        }

        public Criteria andBusiWidLessThanOrEqualTo(Long value) {
            addCriterion("BUSI_WID <=", value, "busiWid");
            return (Criteria) this;
        }

        public Criteria andBusiWidIn(List<Long> values) {
            addCriterion("BUSI_WID in", values, "busiWid");
            return (Criteria) this;
        }

        public Criteria andBusiWidNotIn(List<Long> values) {
            addCriterion("BUSI_WID not in", values, "busiWid");
            return (Criteria) this;
        }

        public Criteria andBusiWidBetween(Long value1, Long value2) {
            addCriterion("BUSI_WID between", value1, value2, "busiWid");
            return (Criteria) this;
        }

        public Criteria andBusiWidNotBetween(Long value1, Long value2) {
            addCriterion("BUSI_WID not between", value1, value2, "busiWid");
            return (Criteria) this;
        }

        public Criteria andFunctionNameIsNull() {
            addCriterion("FUNCTION_NAME is null");
            return (Criteria) this;
        }

        public Criteria andFunctionNameIsNotNull() {
            addCriterion("FUNCTION_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andFunctionNameEqualTo(String value) {
            addCriterion("FUNCTION_NAME =", value, "functionName");
            return (Criteria) this;
        }

        public Criteria andFunctionNameNotEqualTo(String value) {
            addCriterion("FUNCTION_NAME <>", value, "functionName");
            return (Criteria) this;
        }

        public Criteria andFunctionNameGreaterThan(String value) {
            addCriterion("FUNCTION_NAME >", value, "functionName");
            return (Criteria) this;
        }

        public Criteria andFunctionNameGreaterThanOrEqualTo(String value) {
            addCriterion("FUNCTION_NAME >=", value, "functionName");
            return (Criteria) this;
        }

        public Criteria andFunctionNameLessThan(String value) {
            addCriterion("FUNCTION_NAME <", value, "functionName");
            return (Criteria) this;
        }

        public Criteria andFunctionNameLessThanOrEqualTo(String value) {
            addCriterion("FUNCTION_NAME <=", value, "functionName");
            return (Criteria) this;
        }

        public Criteria andFunctionNameLike(String value) {
            addCriterion("FUNCTION_NAME like", value, "functionName");
            return (Criteria) this;
        }

        public Criteria andFunctionNameNotLike(String value) {
            addCriterion("FUNCTION_NAME not like", value, "functionName");
            return (Criteria) this;
        }

        public Criteria andFunctionNameIn(List<String> values) {
            addCriterion("FUNCTION_NAME in", values, "functionName");
            return (Criteria) this;
        }

        public Criteria andFunctionNameNotIn(List<String> values) {
            addCriterion("FUNCTION_NAME not in", values, "functionName");
            return (Criteria) this;
        }

        public Criteria andFunctionNameBetween(String value1, String value2) {
            addCriterion("FUNCTION_NAME between", value1, value2, "functionName");
            return (Criteria) this;
        }

        public Criteria andFunctionNameNotBetween(String value1, String value2) {
            addCriterion("FUNCTION_NAME not between", value1, value2, "functionName");
            return (Criteria) this;
        }

        public Criteria andFunctionAliasIsNull() {
            addCriterion("FUNCTION_ALIAS is null");
            return (Criteria) this;
        }

        public Criteria andFunctionAliasIsNotNull() {
            addCriterion("FUNCTION_ALIAS is not null");
            return (Criteria) this;
        }

        public Criteria andFunctionAliasEqualTo(String value) {
            addCriterion("FUNCTION_ALIAS =", value, "functionAlias");
            return (Criteria) this;
        }

        public Criteria andFunctionAliasNotEqualTo(String value) {
            addCriterion("FUNCTION_ALIAS <>", value, "functionAlias");
            return (Criteria) this;
        }

        public Criteria andFunctionAliasGreaterThan(String value) {
            addCriterion("FUNCTION_ALIAS >", value, "functionAlias");
            return (Criteria) this;
        }

        public Criteria andFunctionAliasGreaterThanOrEqualTo(String value) {
            addCriterion("FUNCTION_ALIAS >=", value, "functionAlias");
            return (Criteria) this;
        }

        public Criteria andFunctionAliasLessThan(String value) {
            addCriterion("FUNCTION_ALIAS <", value, "functionAlias");
            return (Criteria) this;
        }

        public Criteria andFunctionAliasLessThanOrEqualTo(String value) {
            addCriterion("FUNCTION_ALIAS <=", value, "functionAlias");
            return (Criteria) this;
        }

        public Criteria andFunctionAliasLike(String value) {
            addCriterion("FUNCTION_ALIAS like", value, "functionAlias");
            return (Criteria) this;
        }

        public Criteria andFunctionAliasNotLike(String value) {
            addCriterion("FUNCTION_ALIAS not like", value, "functionAlias");
            return (Criteria) this;
        }

        public Criteria andFunctionAliasIn(List<String> values) {
            addCriterion("FUNCTION_ALIAS in", values, "functionAlias");
            return (Criteria) this;
        }

        public Criteria andFunctionAliasNotIn(List<String> values) {
            addCriterion("FUNCTION_ALIAS not in", values, "functionAlias");
            return (Criteria) this;
        }

        public Criteria andFunctionAliasBetween(String value1, String value2) {
            addCriterion("FUNCTION_ALIAS between", value1, value2, "functionAlias");
            return (Criteria) this;
        }

        public Criteria andFunctionAliasNotBetween(String value1, String value2) {
            addCriterion("FUNCTION_ALIAS not between", value1, value2, "functionAlias");
            return (Criteria) this;
        }

        public Criteria andFunctionDesIsNull() {
            addCriterion("FUNCTION_DES is null");
            return (Criteria) this;
        }

        public Criteria andFunctionDesIsNotNull() {
            addCriterion("FUNCTION_DES is not null");
            return (Criteria) this;
        }

        public Criteria andFunctionDesEqualTo(String value) {
            addCriterion("FUNCTION_DES =", value, "functionDes");
            return (Criteria) this;
        }

        public Criteria andFunctionDesNotEqualTo(String value) {
            addCriterion("FUNCTION_DES <>", value, "functionDes");
            return (Criteria) this;
        }

        public Criteria andFunctionDesGreaterThan(String value) {
            addCriterion("FUNCTION_DES >", value, "functionDes");
            return (Criteria) this;
        }

        public Criteria andFunctionDesGreaterThanOrEqualTo(String value) {
            addCriterion("FUNCTION_DES >=", value, "functionDes");
            return (Criteria) this;
        }

        public Criteria andFunctionDesLessThan(String value) {
            addCriterion("FUNCTION_DES <", value, "functionDes");
            return (Criteria) this;
        }

        public Criteria andFunctionDesLessThanOrEqualTo(String value) {
            addCriterion("FUNCTION_DES <=", value, "functionDes");
            return (Criteria) this;
        }

        public Criteria andFunctionDesLike(String value) {
            addCriterion("FUNCTION_DES like", value, "functionDes");
            return (Criteria) this;
        }

        public Criteria andFunctionDesNotLike(String value) {
            addCriterion("FUNCTION_DES not like", value, "functionDes");
            return (Criteria) this;
        }

        public Criteria andFunctionDesIn(List<String> values) {
            addCriterion("FUNCTION_DES in", values, "functionDes");
            return (Criteria) this;
        }

        public Criteria andFunctionDesNotIn(List<String> values) {
            addCriterion("FUNCTION_DES not in", values, "functionDes");
            return (Criteria) this;
        }

        public Criteria andFunctionDesBetween(String value1, String value2) {
            addCriterion("FUNCTION_DES between", value1, value2, "functionDes");
            return (Criteria) this;
        }

        public Criteria andFunctionDesNotBetween(String value1, String value2) {
            addCriterion("FUNCTION_DES not between", value1, value2, "functionDes");
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

        public Criteria andIsValidateIsNull() {
            addCriterion("IS_VALIDATE is null");
            return (Criteria) this;
        }

        public Criteria andIsValidateIsNotNull() {
            addCriterion("IS_VALIDATE is not null");
            return (Criteria) this;
        }

        public Criteria andIsValidateEqualTo(String value) {
            addCriterion("IS_VALIDATE =", value, "isValidate");
            return (Criteria) this;
        }

        public Criteria andIsValidateNotEqualTo(String value) {
            addCriterion("IS_VALIDATE <>", value, "isValidate");
            return (Criteria) this;
        }

        public Criteria andIsValidateGreaterThan(String value) {
            addCriterion("IS_VALIDATE >", value, "isValidate");
            return (Criteria) this;
        }

        public Criteria andIsValidateGreaterThanOrEqualTo(String value) {
            addCriterion("IS_VALIDATE >=", value, "isValidate");
            return (Criteria) this;
        }

        public Criteria andIsValidateLessThan(String value) {
            addCriterion("IS_VALIDATE <", value, "isValidate");
            return (Criteria) this;
        }

        public Criteria andIsValidateLessThanOrEqualTo(String value) {
            addCriterion("IS_VALIDATE <=", value, "isValidate");
            return (Criteria) this;
        }

        public Criteria andIsValidateLike(String value) {
            addCriterion("IS_VALIDATE like", value, "isValidate");
            return (Criteria) this;
        }

        public Criteria andIsValidateNotLike(String value) {
            addCriterion("IS_VALIDATE not like", value, "isValidate");
            return (Criteria) this;
        }

        public Criteria andIsValidateIn(List<String> values) {
            addCriterion("IS_VALIDATE in", values, "isValidate");
            return (Criteria) this;
        }

        public Criteria andIsValidateNotIn(List<String> values) {
            addCriterion("IS_VALIDATE not in", values, "isValidate");
            return (Criteria) this;
        }

        public Criteria andIsValidateBetween(String value1, String value2) {
            addCriterion("IS_VALIDATE between", value1, value2, "isValidate");
            return (Criteria) this;
        }

        public Criteria andIsValidateNotBetween(String value1, String value2) {
            addCriterion("IS_VALIDATE not between", value1, value2, "isValidate");
            return (Criteria) this;
        }

        public Criteria andReturnTypeIsNull() {
            addCriterion("RETURN_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andReturnTypeIsNotNull() {
            addCriterion("RETURN_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andReturnTypeEqualTo(String value) {
            addCriterion("RETURN_TYPE =", value, "returnType");
            return (Criteria) this;
        }

        public Criteria andReturnTypeNotEqualTo(String value) {
            addCriterion("RETURN_TYPE <>", value, "returnType");
            return (Criteria) this;
        }

        public Criteria andReturnTypeGreaterThan(String value) {
            addCriterion("RETURN_TYPE >", value, "returnType");
            return (Criteria) this;
        }

        public Criteria andReturnTypeGreaterThanOrEqualTo(String value) {
            addCriterion("RETURN_TYPE >=", value, "returnType");
            return (Criteria) this;
        }

        public Criteria andReturnTypeLessThan(String value) {
            addCriterion("RETURN_TYPE <", value, "returnType");
            return (Criteria) this;
        }

        public Criteria andReturnTypeLessThanOrEqualTo(String value) {
            addCriterion("RETURN_TYPE <=", value, "returnType");
            return (Criteria) this;
        }

        public Criteria andReturnTypeLike(String value) {
            addCriterion("RETURN_TYPE like", value, "returnType");
            return (Criteria) this;
        }

        public Criteria andReturnTypeNotLike(String value) {
            addCriterion("RETURN_TYPE not like", value, "returnType");
            return (Criteria) this;
        }

        public Criteria andReturnTypeIn(List<String> values) {
            addCriterion("RETURN_TYPE in", values, "returnType");
            return (Criteria) this;
        }

        public Criteria andReturnTypeNotIn(List<String> values) {
            addCriterion("RETURN_TYPE not in", values, "returnType");
            return (Criteria) this;
        }

        public Criteria andReturnTypeBetween(String value1, String value2) {
            addCriterion("RETURN_TYPE between", value1, value2, "returnType");
            return (Criteria) this;
        }

        public Criteria andReturnTypeNotBetween(String value1, String value2) {
            addCriterion("RETURN_TYPE not between", value1, value2, "returnType");
            return (Criteria) this;
        }

        public Criteria andIsInterfaceIsNull() {
            addCriterion("IS_INTERFACE is null");
            return (Criteria) this;
        }

        public Criteria andIsInterfaceIsNotNull() {
            addCriterion("IS_INTERFACE is not null");
            return (Criteria) this;
        }

        public Criteria andIsInterfaceEqualTo(String value) {
            addCriterion("IS_INTERFACE =", value, "isInterface");
            return (Criteria) this;
        }

        public Criteria andIsInterfaceNotEqualTo(String value) {
            addCriterion("IS_INTERFACE <>", value, "isInterface");
            return (Criteria) this;
        }

        public Criteria andIsInterfaceGreaterThan(String value) {
            addCriterion("IS_INTERFACE >", value, "isInterface");
            return (Criteria) this;
        }

        public Criteria andIsInterfaceGreaterThanOrEqualTo(String value) {
            addCriterion("IS_INTERFACE >=", value, "isInterface");
            return (Criteria) this;
        }

        public Criteria andIsInterfaceLessThan(String value) {
            addCriterion("IS_INTERFACE <", value, "isInterface");
            return (Criteria) this;
        }

        public Criteria andIsInterfaceLessThanOrEqualTo(String value) {
            addCriterion("IS_INTERFACE <=", value, "isInterface");
            return (Criteria) this;
        }

        public Criteria andIsInterfaceLike(String value) {
            addCriterion("IS_INTERFACE like", value, "isInterface");
            return (Criteria) this;
        }

        public Criteria andIsInterfaceNotLike(String value) {
            addCriterion("IS_INTERFACE not like", value, "isInterface");
            return (Criteria) this;
        }

        public Criteria andIsInterfaceIn(List<String> values) {
            addCriterion("IS_INTERFACE in", values, "isInterface");
            return (Criteria) this;
        }

        public Criteria andIsInterfaceNotIn(List<String> values) {
            addCriterion("IS_INTERFACE not in", values, "isInterface");
            return (Criteria) this;
        }

        public Criteria andIsInterfaceBetween(String value1, String value2) {
            addCriterion("IS_INTERFACE between", value1, value2, "isInterface");
            return (Criteria) this;
        }

        public Criteria andIsInterfaceNotBetween(String value1, String value2) {
            addCriterion("IS_INTERFACE not between", value1, value2, "isInterface");
            return (Criteria) this;
        }

        public Criteria andAccessMethodIsNull() {
            addCriterion("ACCESS_METHOD is null");
            return (Criteria) this;
        }

        public Criteria andAccessMethodIsNotNull() {
            addCriterion("ACCESS_METHOD is not null");
            return (Criteria) this;
        }

        public Criteria andAccessMethodEqualTo(String value) {
            addCriterion("ACCESS_METHOD =", value, "accessMethod");
            return (Criteria) this;
        }

        public Criteria andAccessMethodNotEqualTo(String value) {
            addCriterion("ACCESS_METHOD <>", value, "accessMethod");
            return (Criteria) this;
        }

        public Criteria andAccessMethodGreaterThan(String value) {
            addCriterion("ACCESS_METHOD >", value, "accessMethod");
            return (Criteria) this;
        }

        public Criteria andAccessMethodGreaterThanOrEqualTo(String value) {
            addCriterion("ACCESS_METHOD >=", value, "accessMethod");
            return (Criteria) this;
        }

        public Criteria andAccessMethodLessThan(String value) {
            addCriterion("ACCESS_METHOD <", value, "accessMethod");
            return (Criteria) this;
        }

        public Criteria andAccessMethodLessThanOrEqualTo(String value) {
            addCriterion("ACCESS_METHOD <=", value, "accessMethod");
            return (Criteria) this;
        }

        public Criteria andAccessMethodLike(String value) {
            addCriterion("ACCESS_METHOD like", value, "accessMethod");
            return (Criteria) this;
        }

        public Criteria andAccessMethodNotLike(String value) {
            addCriterion("ACCESS_METHOD not like", value, "accessMethod");
            return (Criteria) this;
        }

        public Criteria andAccessMethodIn(List<String> values) {
            addCriterion("ACCESS_METHOD in", values, "accessMethod");
            return (Criteria) this;
        }

        public Criteria andAccessMethodNotIn(List<String> values) {
            addCriterion("ACCESS_METHOD not in", values, "accessMethod");
            return (Criteria) this;
        }

        public Criteria andAccessMethodBetween(String value1, String value2) {
            addCriterion("ACCESS_METHOD between", value1, value2, "accessMethod");
            return (Criteria) this;
        }

        public Criteria andAccessMethodNotBetween(String value1, String value2) {
            addCriterion("ACCESS_METHOD not between", value1, value2, "accessMethod");
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