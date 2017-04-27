package com.haibei.pojo.application;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ParamsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int rowsPerPage = -1;

    public ParamsExample() {
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

        public Criteria andFuncIdIsNull() {
            addCriterion("FUNC_ID is null");
            return (Criteria) this;
        }

        public Criteria andFuncIdIsNotNull() {
            addCriterion("FUNC_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFuncIdEqualTo(Long value) {
            addCriterion("FUNC_ID =", value, "funcId");
            return (Criteria) this;
        }

        public Criteria andFuncIdNotEqualTo(Long value) {
            addCriterion("FUNC_ID <>", value, "funcId");
            return (Criteria) this;
        }

        public Criteria andFuncIdGreaterThan(Long value) {
            addCriterion("FUNC_ID >", value, "funcId");
            return (Criteria) this;
        }

        public Criteria andFuncIdGreaterThanOrEqualTo(Long value) {
            addCriterion("FUNC_ID >=", value, "funcId");
            return (Criteria) this;
        }

        public Criteria andFuncIdLessThan(Long value) {
            addCriterion("FUNC_ID <", value, "funcId");
            return (Criteria) this;
        }

        public Criteria andFuncIdLessThanOrEqualTo(Long value) {
            addCriterion("FUNC_ID <=", value, "funcId");
            return (Criteria) this;
        }

        public Criteria andFuncIdIn(List<Long> values) {
            addCriterion("FUNC_ID in", values, "funcId");
            return (Criteria) this;
        }

        public Criteria andFuncIdNotIn(List<Long> values) {
            addCriterion("FUNC_ID not in", values, "funcId");
            return (Criteria) this;
        }

        public Criteria andFuncIdBetween(Long value1, Long value2) {
            addCriterion("FUNC_ID between", value1, value2, "funcId");
            return (Criteria) this;
        }

        public Criteria andFuncIdNotBetween(Long value1, Long value2) {
            addCriterion("FUNC_ID not between", value1, value2, "funcId");
            return (Criteria) this;
        }

        public Criteria andParamTypeIsNull() {
            addCriterion("PARAM_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andParamTypeIsNotNull() {
            addCriterion("PARAM_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andParamTypeEqualTo(String value) {
            addCriterion("PARAM_TYPE =", value, "paramType");
            return (Criteria) this;
        }

        public Criteria andParamTypeNotEqualTo(String value) {
            addCriterion("PARAM_TYPE <>", value, "paramType");
            return (Criteria) this;
        }

        public Criteria andParamTypeGreaterThan(String value) {
            addCriterion("PARAM_TYPE >", value, "paramType");
            return (Criteria) this;
        }

        public Criteria andParamTypeGreaterThanOrEqualTo(String value) {
            addCriterion("PARAM_TYPE >=", value, "paramType");
            return (Criteria) this;
        }

        public Criteria andParamTypeLessThan(String value) {
            addCriterion("PARAM_TYPE <", value, "paramType");
            return (Criteria) this;
        }

        public Criteria andParamTypeLessThanOrEqualTo(String value) {
            addCriterion("PARAM_TYPE <=", value, "paramType");
            return (Criteria) this;
        }

        public Criteria andParamTypeLike(String value) {
            addCriterion("PARAM_TYPE like", value, "paramType");
            return (Criteria) this;
        }

        public Criteria andParamTypeNotLike(String value) {
            addCriterion("PARAM_TYPE not like", value, "paramType");
            return (Criteria) this;
        }

        public Criteria andParamTypeIn(List<String> values) {
            addCriterion("PARAM_TYPE in", values, "paramType");
            return (Criteria) this;
        }

        public Criteria andParamTypeNotIn(List<String> values) {
            addCriterion("PARAM_TYPE not in", values, "paramType");
            return (Criteria) this;
        }

        public Criteria andParamTypeBetween(String value1, String value2) {
            addCriterion("PARAM_TYPE between", value1, value2, "paramType");
            return (Criteria) this;
        }

        public Criteria andParamTypeNotBetween(String value1, String value2) {
            addCriterion("PARAM_TYPE not between", value1, value2, "paramType");
            return (Criteria) this;
        }

        public Criteria andParamNameIsNull() {
            addCriterion("PARAM_NAME is null");
            return (Criteria) this;
        }

        public Criteria andParamNameIsNotNull() {
            addCriterion("PARAM_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andParamNameEqualTo(String value) {
            addCriterion("PARAM_NAME =", value, "paramName");
            return (Criteria) this;
        }

        public Criteria andParamNameNotEqualTo(String value) {
            addCriterion("PARAM_NAME <>", value, "paramName");
            return (Criteria) this;
        }

        public Criteria andParamNameGreaterThan(String value) {
            addCriterion("PARAM_NAME >", value, "paramName");
            return (Criteria) this;
        }

        public Criteria andParamNameGreaterThanOrEqualTo(String value) {
            addCriterion("PARAM_NAME >=", value, "paramName");
            return (Criteria) this;
        }

        public Criteria andParamNameLessThan(String value) {
            addCriterion("PARAM_NAME <", value, "paramName");
            return (Criteria) this;
        }

        public Criteria andParamNameLessThanOrEqualTo(String value) {
            addCriterion("PARAM_NAME <=", value, "paramName");
            return (Criteria) this;
        }

        public Criteria andParamNameLike(String value) {
            addCriterion("PARAM_NAME like", value, "paramName");
            return (Criteria) this;
        }

        public Criteria andParamNameNotLike(String value) {
            addCriterion("PARAM_NAME not like", value, "paramName");
            return (Criteria) this;
        }

        public Criteria andParamNameIn(List<String> values) {
            addCriterion("PARAM_NAME in", values, "paramName");
            return (Criteria) this;
        }

        public Criteria andParamNameNotIn(List<String> values) {
            addCriterion("PARAM_NAME not in", values, "paramName");
            return (Criteria) this;
        }

        public Criteria andParamNameBetween(String value1, String value2) {
            addCriterion("PARAM_NAME between", value1, value2, "paramName");
            return (Criteria) this;
        }

        public Criteria andParamNameNotBetween(String value1, String value2) {
            addCriterion("PARAM_NAME not between", value1, value2, "paramName");
            return (Criteria) this;
        }

        public Criteria andRequiredIsNull() {
            addCriterion("REQUIRED is null");
            return (Criteria) this;
        }

        public Criteria andRequiredIsNotNull() {
            addCriterion("REQUIRED is not null");
            return (Criteria) this;
        }

        public Criteria andRequiredEqualTo(String value) {
            addCriterion("REQUIRED =", value, "required");
            return (Criteria) this;
        }

        public Criteria andRequiredNotEqualTo(String value) {
            addCriterion("REQUIRED <>", value, "required");
            return (Criteria) this;
        }

        public Criteria andRequiredGreaterThan(String value) {
            addCriterion("REQUIRED >", value, "required");
            return (Criteria) this;
        }

        public Criteria andRequiredGreaterThanOrEqualTo(String value) {
            addCriterion("REQUIRED >=", value, "required");
            return (Criteria) this;
        }

        public Criteria andRequiredLessThan(String value) {
            addCriterion("REQUIRED <", value, "required");
            return (Criteria) this;
        }

        public Criteria andRequiredLessThanOrEqualTo(String value) {
            addCriterion("REQUIRED <=", value, "required");
            return (Criteria) this;
        }

        public Criteria andRequiredLike(String value) {
            addCriterion("REQUIRED like", value, "required");
            return (Criteria) this;
        }

        public Criteria andRequiredNotLike(String value) {
            addCriterion("REQUIRED not like", value, "required");
            return (Criteria) this;
        }

        public Criteria andRequiredIn(List<String> values) {
            addCriterion("REQUIRED in", values, "required");
            return (Criteria) this;
        }

        public Criteria andRequiredNotIn(List<String> values) {
            addCriterion("REQUIRED not in", values, "required");
            return (Criteria) this;
        }

        public Criteria andRequiredBetween(String value1, String value2) {
            addCriterion("REQUIRED between", value1, value2, "required");
            return (Criteria) this;
        }

        public Criteria andRequiredNotBetween(String value1, String value2) {
            addCriterion("REQUIRED not between", value1, value2, "required");
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