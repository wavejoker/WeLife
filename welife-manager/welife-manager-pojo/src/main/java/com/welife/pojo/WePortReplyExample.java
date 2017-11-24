package com.welife.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WePortReplyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WePortReplyExample() {
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

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andPortIdIsNull() {
            addCriterion("port_id is null");
            return (Criteria) this;
        }

        public Criteria andPortIdIsNotNull() {
            addCriterion("port_id is not null");
            return (Criteria) this;
        }

        public Criteria andPortIdEqualTo(Long value) {
            addCriterion("port_id =", value, "portId");
            return (Criteria) this;
        }

        public Criteria andPortIdNotEqualTo(Long value) {
            addCriterion("port_id <>", value, "portId");
            return (Criteria) this;
        }

        public Criteria andPortIdGreaterThan(Long value) {
            addCriterion("port_id >", value, "portId");
            return (Criteria) this;
        }

        public Criteria andPortIdGreaterThanOrEqualTo(Long value) {
            addCriterion("port_id >=", value, "portId");
            return (Criteria) this;
        }

        public Criteria andPortIdLessThan(Long value) {
            addCriterion("port_id <", value, "portId");
            return (Criteria) this;
        }

        public Criteria andPortIdLessThanOrEqualTo(Long value) {
            addCriterion("port_id <=", value, "portId");
            return (Criteria) this;
        }

        public Criteria andPortIdIn(List<Long> values) {
            addCriterion("port_id in", values, "portId");
            return (Criteria) this;
        }

        public Criteria andPortIdNotIn(List<Long> values) {
            addCriterion("port_id not in", values, "portId");
            return (Criteria) this;
        }

        public Criteria andPortIdBetween(Long value1, Long value2) {
            addCriterion("port_id between", value1, value2, "portId");
            return (Criteria) this;
        }

        public Criteria andPortIdNotBetween(Long value1, Long value2) {
            addCriterion("port_id not between", value1, value2, "portId");
            return (Criteria) this;
        }

        public Criteria andReviewerIdIsNull() {
            addCriterion("reviewer_id is null");
            return (Criteria) this;
        }

        public Criteria andReviewerIdIsNotNull() {
            addCriterion("reviewer_id is not null");
            return (Criteria) this;
        }

        public Criteria andReviewerIdEqualTo(Long value) {
            addCriterion("reviewer_id =", value, "reviewerId");
            return (Criteria) this;
        }

        public Criteria andReviewerIdNotEqualTo(Long value) {
            addCriterion("reviewer_id <>", value, "reviewerId");
            return (Criteria) this;
        }

        public Criteria andReviewerIdGreaterThan(Long value) {
            addCriterion("reviewer_id >", value, "reviewerId");
            return (Criteria) this;
        }

        public Criteria andReviewerIdGreaterThanOrEqualTo(Long value) {
            addCriterion("reviewer_id >=", value, "reviewerId");
            return (Criteria) this;
        }

        public Criteria andReviewerIdLessThan(Long value) {
            addCriterion("reviewer_id <", value, "reviewerId");
            return (Criteria) this;
        }

        public Criteria andReviewerIdLessThanOrEqualTo(Long value) {
            addCriterion("reviewer_id <=", value, "reviewerId");
            return (Criteria) this;
        }

        public Criteria andReviewerIdIn(List<Long> values) {
            addCriterion("reviewer_id in", values, "reviewerId");
            return (Criteria) this;
        }

        public Criteria andReviewerIdNotIn(List<Long> values) {
            addCriterion("reviewer_id not in", values, "reviewerId");
            return (Criteria) this;
        }

        public Criteria andReviewerIdBetween(Long value1, Long value2) {
            addCriterion("reviewer_id between", value1, value2, "reviewerId");
            return (Criteria) this;
        }

        public Criteria andReviewerIdNotBetween(Long value1, Long value2) {
            addCriterion("reviewer_id not between", value1, value2, "reviewerId");
            return (Criteria) this;
        }

        public Criteria andReplyCommentIdIsNull() {
            addCriterion("reply_comment_id is null");
            return (Criteria) this;
        }

        public Criteria andReplyCommentIdIsNotNull() {
            addCriterion("reply_comment_id is not null");
            return (Criteria) this;
        }

        public Criteria andReplyCommentIdEqualTo(Long value) {
            addCriterion("reply_comment_id =", value, "replyCommentId");
            return (Criteria) this;
        }

        public Criteria andReplyCommentIdNotEqualTo(Long value) {
            addCriterion("reply_comment_id <>", value, "replyCommentId");
            return (Criteria) this;
        }

        public Criteria andReplyCommentIdGreaterThan(Long value) {
            addCriterion("reply_comment_id >", value, "replyCommentId");
            return (Criteria) this;
        }

        public Criteria andReplyCommentIdGreaterThanOrEqualTo(Long value) {
            addCriterion("reply_comment_id >=", value, "replyCommentId");
            return (Criteria) this;
        }

        public Criteria andReplyCommentIdLessThan(Long value) {
            addCriterion("reply_comment_id <", value, "replyCommentId");
            return (Criteria) this;
        }

        public Criteria andReplyCommentIdLessThanOrEqualTo(Long value) {
            addCriterion("reply_comment_id <=", value, "replyCommentId");
            return (Criteria) this;
        }

        public Criteria andReplyCommentIdIn(List<Long> values) {
            addCriterion("reply_comment_id in", values, "replyCommentId");
            return (Criteria) this;
        }

        public Criteria andReplyCommentIdNotIn(List<Long> values) {
            addCriterion("reply_comment_id not in", values, "replyCommentId");
            return (Criteria) this;
        }

        public Criteria andReplyCommentIdBetween(Long value1, Long value2) {
            addCriterion("reply_comment_id between", value1, value2, "replyCommentId");
            return (Criteria) this;
        }

        public Criteria andReplyCommentIdNotBetween(Long value1, Long value2) {
            addCriterion("reply_comment_id not between", value1, value2, "replyCommentId");
            return (Criteria) this;
        }

        public Criteria andCreatedIsNull() {
            addCriterion("created is null");
            return (Criteria) this;
        }

        public Criteria andCreatedIsNotNull() {
            addCriterion("created is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedEqualTo(Date value) {
            addCriterion("created =", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedNotEqualTo(Date value) {
            addCriterion("created <>", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedGreaterThan(Date value) {
            addCriterion("created >", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedGreaterThanOrEqualTo(Date value) {
            addCriterion("created >=", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedLessThan(Date value) {
            addCriterion("created <", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedLessThanOrEqualTo(Date value) {
            addCriterion("created <=", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedIn(List<Date> values) {
            addCriterion("created in", values, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedNotIn(List<Date> values) {
            addCriterion("created not in", values, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedBetween(Date value1, Date value2) {
            addCriterion("created between", value1, value2, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedNotBetween(Date value1, Date value2) {
            addCriterion("created not between", value1, value2, "created");
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