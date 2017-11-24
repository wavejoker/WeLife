package com.welife.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WeOrganizationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WeOrganizationExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andOrgnameIsNull() {
            addCriterion("orgname is null");
            return (Criteria) this;
        }

        public Criteria andOrgnameIsNotNull() {
            addCriterion("orgname is not null");
            return (Criteria) this;
        }

        public Criteria andOrgnameEqualTo(String value) {
            addCriterion("orgname =", value, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameNotEqualTo(String value) {
            addCriterion("orgname <>", value, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameGreaterThan(String value) {
            addCriterion("orgname >", value, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameGreaterThanOrEqualTo(String value) {
            addCriterion("orgname >=", value, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameLessThan(String value) {
            addCriterion("orgname <", value, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameLessThanOrEqualTo(String value) {
            addCriterion("orgname <=", value, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameLike(String value) {
            addCriterion("orgname like", value, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameNotLike(String value) {
            addCriterion("orgname not like", value, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameIn(List<String> values) {
            addCriterion("orgname in", values, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameNotIn(List<String> values) {
            addCriterion("orgname not in", values, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameBetween(String value1, String value2) {
            addCriterion("orgname between", value1, value2, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameNotBetween(String value1, String value2) {
            addCriterion("orgname not between", value1, value2, "orgname");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createtime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createtime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("createtime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("createtime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("createtime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createtime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("createtime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("createtime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("createtime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("createtime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("createtime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("createtime not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andPresidentIdIsNull() {
            addCriterion("president_id is null");
            return (Criteria) this;
        }

        public Criteria andPresidentIdIsNotNull() {
            addCriterion("president_id is not null");
            return (Criteria) this;
        }

        public Criteria andPresidentIdEqualTo(Long value) {
            addCriterion("president_id =", value, "presidentId");
            return (Criteria) this;
        }

        public Criteria andPresidentIdNotEqualTo(Long value) {
            addCriterion("president_id <>", value, "presidentId");
            return (Criteria) this;
        }

        public Criteria andPresidentIdGreaterThan(Long value) {
            addCriterion("president_id >", value, "presidentId");
            return (Criteria) this;
        }

        public Criteria andPresidentIdGreaterThanOrEqualTo(Long value) {
            addCriterion("president_id >=", value, "presidentId");
            return (Criteria) this;
        }

        public Criteria andPresidentIdLessThan(Long value) {
            addCriterion("president_id <", value, "presidentId");
            return (Criteria) this;
        }

        public Criteria andPresidentIdLessThanOrEqualTo(Long value) {
            addCriterion("president_id <=", value, "presidentId");
            return (Criteria) this;
        }

        public Criteria andPresidentIdIn(List<Long> values) {
            addCriterion("president_id in", values, "presidentId");
            return (Criteria) this;
        }

        public Criteria andPresidentIdNotIn(List<Long> values) {
            addCriterion("president_id not in", values, "presidentId");
            return (Criteria) this;
        }

        public Criteria andPresidentIdBetween(Long value1, Long value2) {
            addCriterion("president_id between", value1, value2, "presidentId");
            return (Criteria) this;
        }

        public Criteria andPresidentIdNotBetween(Long value1, Long value2) {
            addCriterion("president_id not between", value1, value2, "presidentId");
            return (Criteria) this;
        }

        public Criteria andOrgdescIsNull() {
            addCriterion("orgdesc is null");
            return (Criteria) this;
        }

        public Criteria andOrgdescIsNotNull() {
            addCriterion("orgdesc is not null");
            return (Criteria) this;
        }

        public Criteria andOrgdescEqualTo(String value) {
            addCriterion("orgdesc =", value, "orgdesc");
            return (Criteria) this;
        }

        public Criteria andOrgdescNotEqualTo(String value) {
            addCriterion("orgdesc <>", value, "orgdesc");
            return (Criteria) this;
        }

        public Criteria andOrgdescGreaterThan(String value) {
            addCriterion("orgdesc >", value, "orgdesc");
            return (Criteria) this;
        }

        public Criteria andOrgdescGreaterThanOrEqualTo(String value) {
            addCriterion("orgdesc >=", value, "orgdesc");
            return (Criteria) this;
        }

        public Criteria andOrgdescLessThan(String value) {
            addCriterion("orgdesc <", value, "orgdesc");
            return (Criteria) this;
        }

        public Criteria andOrgdescLessThanOrEqualTo(String value) {
            addCriterion("orgdesc <=", value, "orgdesc");
            return (Criteria) this;
        }

        public Criteria andOrgdescLike(String value) {
            addCriterion("orgdesc like", value, "orgdesc");
            return (Criteria) this;
        }

        public Criteria andOrgdescNotLike(String value) {
            addCriterion("orgdesc not like", value, "orgdesc");
            return (Criteria) this;
        }

        public Criteria andOrgdescIn(List<String> values) {
            addCriterion("orgdesc in", values, "orgdesc");
            return (Criteria) this;
        }

        public Criteria andOrgdescNotIn(List<String> values) {
            addCriterion("orgdesc not in", values, "orgdesc");
            return (Criteria) this;
        }

        public Criteria andOrgdescBetween(String value1, String value2) {
            addCriterion("orgdesc between", value1, value2, "orgdesc");
            return (Criteria) this;
        }

        public Criteria andOrgdescNotBetween(String value1, String value2) {
            addCriterion("orgdesc not between", value1, value2, "orgdesc");
            return (Criteria) this;
        }

        public Criteria andOrglevelIsNull() {
            addCriterion("orglevel is null");
            return (Criteria) this;
        }

        public Criteria andOrglevelIsNotNull() {
            addCriterion("orglevel is not null");
            return (Criteria) this;
        }

        public Criteria andOrglevelEqualTo(Integer value) {
            addCriterion("orglevel =", value, "orglevel");
            return (Criteria) this;
        }

        public Criteria andOrglevelNotEqualTo(Integer value) {
            addCriterion("orglevel <>", value, "orglevel");
            return (Criteria) this;
        }

        public Criteria andOrglevelGreaterThan(Integer value) {
            addCriterion("orglevel >", value, "orglevel");
            return (Criteria) this;
        }

        public Criteria andOrglevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("orglevel >=", value, "orglevel");
            return (Criteria) this;
        }

        public Criteria andOrglevelLessThan(Integer value) {
            addCriterion("orglevel <", value, "orglevel");
            return (Criteria) this;
        }

        public Criteria andOrglevelLessThanOrEqualTo(Integer value) {
            addCriterion("orglevel <=", value, "orglevel");
            return (Criteria) this;
        }

        public Criteria andOrglevelIn(List<Integer> values) {
            addCriterion("orglevel in", values, "orglevel");
            return (Criteria) this;
        }

        public Criteria andOrglevelNotIn(List<Integer> values) {
            addCriterion("orglevel not in", values, "orglevel");
            return (Criteria) this;
        }

        public Criteria andOrglevelBetween(Integer value1, Integer value2) {
            addCriterion("orglevel between", value1, value2, "orglevel");
            return (Criteria) this;
        }

        public Criteria andOrglevelNotBetween(Integer value1, Integer value2) {
            addCriterion("orglevel not between", value1, value2, "orglevel");
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