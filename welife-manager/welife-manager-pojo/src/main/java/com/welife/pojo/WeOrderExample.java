package com.welife.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WeOrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WeOrderExample() {
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

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Long value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Long value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Long value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Long value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Long value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Long> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Long> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Long value1, Long value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Long value1, Long value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andPaymentIsNull() {
            addCriterion("payment is null");
            return (Criteria) this;
        }

        public Criteria andPaymentIsNotNull() {
            addCriterion("payment is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentEqualTo(String value) {
            addCriterion("payment =", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentNotEqualTo(String value) {
            addCriterion("payment <>", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentGreaterThan(String value) {
            addCriterion("payment >", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentGreaterThanOrEqualTo(String value) {
            addCriterion("payment >=", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentLessThan(String value) {
            addCriterion("payment <", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentLessThanOrEqualTo(String value) {
            addCriterion("payment <=", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentLike(String value) {
            addCriterion("payment like", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentNotLike(String value) {
            addCriterion("payment not like", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentIn(List<String> values) {
            addCriterion("payment in", values, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentNotIn(List<String> values) {
            addCriterion("payment not in", values, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentBetween(String value1, String value2) {
            addCriterion("payment between", value1, value2, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentNotBetween(String value1, String value2) {
            addCriterion("payment not between", value1, value2, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeIsNull() {
            addCriterion("payment_type is null");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeIsNotNull() {
            addCriterion("payment_type is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeEqualTo(Integer value) {
            addCriterion("payment_type =", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeNotEqualTo(Integer value) {
            addCriterion("payment_type <>", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeGreaterThan(Integer value) {
            addCriterion("payment_type >", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("payment_type >=", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeLessThan(Integer value) {
            addCriterion("payment_type <", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeLessThanOrEqualTo(Integer value) {
            addCriterion("payment_type <=", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeIn(List<Integer> values) {
            addCriterion("payment_type in", values, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeNotIn(List<Integer> values) {
            addCriterion("payment_type not in", values, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeBetween(Integer value1, Integer value2) {
            addCriterion("payment_type between", value1, value2, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("payment_type not between", value1, value2, "paymentType");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andBuyerMsgIsNull() {
            addCriterion("buyer_msg is null");
            return (Criteria) this;
        }

        public Criteria andBuyerMsgIsNotNull() {
            addCriterion("buyer_msg is not null");
            return (Criteria) this;
        }

        public Criteria andBuyerMsgEqualTo(String value) {
            addCriterion("buyer_msg =", value, "buyerMsg");
            return (Criteria) this;
        }

        public Criteria andBuyerMsgNotEqualTo(String value) {
            addCriterion("buyer_msg <>", value, "buyerMsg");
            return (Criteria) this;
        }

        public Criteria andBuyerMsgGreaterThan(String value) {
            addCriterion("buyer_msg >", value, "buyerMsg");
            return (Criteria) this;
        }

        public Criteria andBuyerMsgGreaterThanOrEqualTo(String value) {
            addCriterion("buyer_msg >=", value, "buyerMsg");
            return (Criteria) this;
        }

        public Criteria andBuyerMsgLessThan(String value) {
            addCriterion("buyer_msg <", value, "buyerMsg");
            return (Criteria) this;
        }

        public Criteria andBuyerMsgLessThanOrEqualTo(String value) {
            addCriterion("buyer_msg <=", value, "buyerMsg");
            return (Criteria) this;
        }

        public Criteria andBuyerMsgLike(String value) {
            addCriterion("buyer_msg like", value, "buyerMsg");
            return (Criteria) this;
        }

        public Criteria andBuyerMsgNotLike(String value) {
            addCriterion("buyer_msg not like", value, "buyerMsg");
            return (Criteria) this;
        }

        public Criteria andBuyerMsgIn(List<String> values) {
            addCriterion("buyer_msg in", values, "buyerMsg");
            return (Criteria) this;
        }

        public Criteria andBuyerMsgNotIn(List<String> values) {
            addCriterion("buyer_msg not in", values, "buyerMsg");
            return (Criteria) this;
        }

        public Criteria andBuyerMsgBetween(String value1, String value2) {
            addCriterion("buyer_msg between", value1, value2, "buyerMsg");
            return (Criteria) this;
        }

        public Criteria andBuyerMsgNotBetween(String value1, String value2) {
            addCriterion("buyer_msg not between", value1, value2, "buyerMsg");
            return (Criteria) this;
        }

        public Criteria andBuyerNickIsNull() {
            addCriterion("buyer_nick is null");
            return (Criteria) this;
        }

        public Criteria andBuyerNickIsNotNull() {
            addCriterion("buyer_nick is not null");
            return (Criteria) this;
        }

        public Criteria andBuyerNickEqualTo(String value) {
            addCriterion("buyer_nick =", value, "buyerNick");
            return (Criteria) this;
        }

        public Criteria andBuyerNickNotEqualTo(String value) {
            addCriterion("buyer_nick <>", value, "buyerNick");
            return (Criteria) this;
        }

        public Criteria andBuyerNickGreaterThan(String value) {
            addCriterion("buyer_nick >", value, "buyerNick");
            return (Criteria) this;
        }

        public Criteria andBuyerNickGreaterThanOrEqualTo(String value) {
            addCriterion("buyer_nick >=", value, "buyerNick");
            return (Criteria) this;
        }

        public Criteria andBuyerNickLessThan(String value) {
            addCriterion("buyer_nick <", value, "buyerNick");
            return (Criteria) this;
        }

        public Criteria andBuyerNickLessThanOrEqualTo(String value) {
            addCriterion("buyer_nick <=", value, "buyerNick");
            return (Criteria) this;
        }

        public Criteria andBuyerNickLike(String value) {
            addCriterion("buyer_nick like", value, "buyerNick");
            return (Criteria) this;
        }

        public Criteria andBuyerNickNotLike(String value) {
            addCriterion("buyer_nick not like", value, "buyerNick");
            return (Criteria) this;
        }

        public Criteria andBuyerNickIn(List<String> values) {
            addCriterion("buyer_nick in", values, "buyerNick");
            return (Criteria) this;
        }

        public Criteria andBuyerNickNotIn(List<String> values) {
            addCriterion("buyer_nick not in", values, "buyerNick");
            return (Criteria) this;
        }

        public Criteria andBuyerNickBetween(String value1, String value2) {
            addCriterion("buyer_nick between", value1, value2, "buyerNick");
            return (Criteria) this;
        }

        public Criteria andBuyerNickNotBetween(String value1, String value2) {
            addCriterion("buyer_nick not between", value1, value2, "buyerNick");
            return (Criteria) this;
        }

        public Criteria andBuyerRateIsNull() {
            addCriterion("buyer_rate is null");
            return (Criteria) this;
        }

        public Criteria andBuyerRateIsNotNull() {
            addCriterion("buyer_rate is not null");
            return (Criteria) this;
        }

        public Criteria andBuyerRateEqualTo(String value) {
            addCriterion("buyer_rate =", value, "buyerRate");
            return (Criteria) this;
        }

        public Criteria andBuyerRateNotEqualTo(String value) {
            addCriterion("buyer_rate <>", value, "buyerRate");
            return (Criteria) this;
        }

        public Criteria andBuyerRateGreaterThan(String value) {
            addCriterion("buyer_rate >", value, "buyerRate");
            return (Criteria) this;
        }

        public Criteria andBuyerRateGreaterThanOrEqualTo(String value) {
            addCriterion("buyer_rate >=", value, "buyerRate");
            return (Criteria) this;
        }

        public Criteria andBuyerRateLessThan(String value) {
            addCriterion("buyer_rate <", value, "buyerRate");
            return (Criteria) this;
        }

        public Criteria andBuyerRateLessThanOrEqualTo(String value) {
            addCriterion("buyer_rate <=", value, "buyerRate");
            return (Criteria) this;
        }

        public Criteria andBuyerRateLike(String value) {
            addCriterion("buyer_rate like", value, "buyerRate");
            return (Criteria) this;
        }

        public Criteria andBuyerRateNotLike(String value) {
            addCriterion("buyer_rate not like", value, "buyerRate");
            return (Criteria) this;
        }

        public Criteria andBuyerRateIn(List<String> values) {
            addCriterion("buyer_rate in", values, "buyerRate");
            return (Criteria) this;
        }

        public Criteria andBuyerRateNotIn(List<String> values) {
            addCriterion("buyer_rate not in", values, "buyerRate");
            return (Criteria) this;
        }

        public Criteria andBuyerRateBetween(String value1, String value2) {
            addCriterion("buyer_rate between", value1, value2, "buyerRate");
            return (Criteria) this;
        }

        public Criteria andBuyerRateNotBetween(String value1, String value2) {
            addCriterion("buyer_rate not between", value1, value2, "buyerRate");
            return (Criteria) this;
        }

        public Criteria andFinishTimeIsNull() {
            addCriterion("finish_time is null");
            return (Criteria) this;
        }

        public Criteria andFinishTimeIsNotNull() {
            addCriterion("finish_time is not null");
            return (Criteria) this;
        }

        public Criteria andFinishTimeEqualTo(Date value) {
            addCriterion("finish_time =", value, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeNotEqualTo(Date value) {
            addCriterion("finish_time <>", value, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeGreaterThan(Date value) {
            addCriterion("finish_time >", value, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("finish_time >=", value, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeLessThan(Date value) {
            addCriterion("finish_time <", value, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeLessThanOrEqualTo(Date value) {
            addCriterion("finish_time <=", value, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeIn(List<Date> values) {
            addCriterion("finish_time in", values, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeNotIn(List<Date> values) {
            addCriterion("finish_time not in", values, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeBetween(Date value1, Date value2) {
            addCriterion("finish_time between", value1, value2, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeNotBetween(Date value1, Date value2) {
            addCriterion("finish_time not between", value1, value2, "finishTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeIsNull() {
            addCriterion("close_time is null");
            return (Criteria) this;
        }

        public Criteria andCloseTimeIsNotNull() {
            addCriterion("close_time is not null");
            return (Criteria) this;
        }

        public Criteria andCloseTimeEqualTo(Date value) {
            addCriterion("close_time =", value, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeNotEqualTo(Date value) {
            addCriterion("close_time <>", value, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeGreaterThan(Date value) {
            addCriterion("close_time >", value, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("close_time >=", value, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeLessThan(Date value) {
            addCriterion("close_time <", value, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeLessThanOrEqualTo(Date value) {
            addCriterion("close_time <=", value, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeIn(List<Date> values) {
            addCriterion("close_time in", values, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeNotIn(List<Date> values) {
            addCriterion("close_time not in", values, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeBetween(Date value1, Date value2) {
            addCriterion("close_time between", value1, value2, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeNotBetween(Date value1, Date value2) {
            addCriterion("close_time not between", value1, value2, "closeTime");
            return (Criteria) this;
        }

        public Criteria andConsignTimeIsNull() {
            addCriterion("consign_time is null");
            return (Criteria) this;
        }

        public Criteria andConsignTimeIsNotNull() {
            addCriterion("consign_time is not null");
            return (Criteria) this;
        }

        public Criteria andConsignTimeEqualTo(Date value) {
            addCriterion("consign_time =", value, "consignTime");
            return (Criteria) this;
        }

        public Criteria andConsignTimeNotEqualTo(Date value) {
            addCriterion("consign_time <>", value, "consignTime");
            return (Criteria) this;
        }

        public Criteria andConsignTimeGreaterThan(Date value) {
            addCriterion("consign_time >", value, "consignTime");
            return (Criteria) this;
        }

        public Criteria andConsignTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("consign_time >=", value, "consignTime");
            return (Criteria) this;
        }

        public Criteria andConsignTimeLessThan(Date value) {
            addCriterion("consign_time <", value, "consignTime");
            return (Criteria) this;
        }

        public Criteria andConsignTimeLessThanOrEqualTo(Date value) {
            addCriterion("consign_time <=", value, "consignTime");
            return (Criteria) this;
        }

        public Criteria andConsignTimeIn(List<Date> values) {
            addCriterion("consign_time in", values, "consignTime");
            return (Criteria) this;
        }

        public Criteria andConsignTimeNotIn(List<Date> values) {
            addCriterion("consign_time not in", values, "consignTime");
            return (Criteria) this;
        }

        public Criteria andConsignTimeBetween(Date value1, Date value2) {
            addCriterion("consign_time between", value1, value2, "consignTime");
            return (Criteria) this;
        }

        public Criteria andConsignTimeNotBetween(Date value1, Date value2) {
            addCriterion("consign_time not between", value1, value2, "consignTime");
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

        public Criteria andUpdatedIsNull() {
            addCriterion("updated is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedIsNotNull() {
            addCriterion("updated is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedEqualTo(Date value) {
            addCriterion("updated =", value, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedNotEqualTo(Date value) {
            addCriterion("updated <>", value, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedGreaterThan(Date value) {
            addCriterion("updated >", value, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedGreaterThanOrEqualTo(Date value) {
            addCriterion("updated >=", value, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedLessThan(Date value) {
            addCriterion("updated <", value, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedLessThanOrEqualTo(Date value) {
            addCriterion("updated <=", value, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedIn(List<Date> values) {
            addCriterion("updated in", values, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedNotIn(List<Date> values) {
            addCriterion("updated not in", values, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedBetween(Date value1, Date value2) {
            addCriterion("updated between", value1, value2, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedNotBetween(Date value1, Date value2) {
            addCriterion("updated not between", value1, value2, "updated");
            return (Criteria) this;
        }

        public Criteria andShippingNameIsNull() {
            addCriterion("shipping_name is null");
            return (Criteria) this;
        }

        public Criteria andShippingNameIsNotNull() {
            addCriterion("shipping_name is not null");
            return (Criteria) this;
        }

        public Criteria andShippingNameEqualTo(String value) {
            addCriterion("shipping_name =", value, "shippingName");
            return (Criteria) this;
        }

        public Criteria andShippingNameNotEqualTo(String value) {
            addCriterion("shipping_name <>", value, "shippingName");
            return (Criteria) this;
        }

        public Criteria andShippingNameGreaterThan(String value) {
            addCriterion("shipping_name >", value, "shippingName");
            return (Criteria) this;
        }

        public Criteria andShippingNameGreaterThanOrEqualTo(String value) {
            addCriterion("shipping_name >=", value, "shippingName");
            return (Criteria) this;
        }

        public Criteria andShippingNameLessThan(String value) {
            addCriterion("shipping_name <", value, "shippingName");
            return (Criteria) this;
        }

        public Criteria andShippingNameLessThanOrEqualTo(String value) {
            addCriterion("shipping_name <=", value, "shippingName");
            return (Criteria) this;
        }

        public Criteria andShippingNameLike(String value) {
            addCriterion("shipping_name like", value, "shippingName");
            return (Criteria) this;
        }

        public Criteria andShippingNameNotLike(String value) {
            addCriterion("shipping_name not like", value, "shippingName");
            return (Criteria) this;
        }

        public Criteria andShippingNameIn(List<String> values) {
            addCriterion("shipping_name in", values, "shippingName");
            return (Criteria) this;
        }

        public Criteria andShippingNameNotIn(List<String> values) {
            addCriterion("shipping_name not in", values, "shippingName");
            return (Criteria) this;
        }

        public Criteria andShippingNameBetween(String value1, String value2) {
            addCriterion("shipping_name between", value1, value2, "shippingName");
            return (Criteria) this;
        }

        public Criteria andShippingNameNotBetween(String value1, String value2) {
            addCriterion("shipping_name not between", value1, value2, "shippingName");
            return (Criteria) this;
        }

        public Criteria andShippingCodeIsNull() {
            addCriterion("shipping_code is null");
            return (Criteria) this;
        }

        public Criteria andShippingCodeIsNotNull() {
            addCriterion("shipping_code is not null");
            return (Criteria) this;
        }

        public Criteria andShippingCodeEqualTo(String value) {
            addCriterion("shipping_code =", value, "shippingCode");
            return (Criteria) this;
        }

        public Criteria andShippingCodeNotEqualTo(String value) {
            addCriterion("shipping_code <>", value, "shippingCode");
            return (Criteria) this;
        }

        public Criteria andShippingCodeGreaterThan(String value) {
            addCriterion("shipping_code >", value, "shippingCode");
            return (Criteria) this;
        }

        public Criteria andShippingCodeGreaterThanOrEqualTo(String value) {
            addCriterion("shipping_code >=", value, "shippingCode");
            return (Criteria) this;
        }

        public Criteria andShippingCodeLessThan(String value) {
            addCriterion("shipping_code <", value, "shippingCode");
            return (Criteria) this;
        }

        public Criteria andShippingCodeLessThanOrEqualTo(String value) {
            addCriterion("shipping_code <=", value, "shippingCode");
            return (Criteria) this;
        }

        public Criteria andShippingCodeLike(String value) {
            addCriterion("shipping_code like", value, "shippingCode");
            return (Criteria) this;
        }

        public Criteria andShippingCodeNotLike(String value) {
            addCriterion("shipping_code not like", value, "shippingCode");
            return (Criteria) this;
        }

        public Criteria andShippingCodeIn(List<String> values) {
            addCriterion("shipping_code in", values, "shippingCode");
            return (Criteria) this;
        }

        public Criteria andShippingCodeNotIn(List<String> values) {
            addCriterion("shipping_code not in", values, "shippingCode");
            return (Criteria) this;
        }

        public Criteria andShippingCodeBetween(String value1, String value2) {
            addCriterion("shipping_code between", value1, value2, "shippingCode");
            return (Criteria) this;
        }

        public Criteria andShippingCodeNotBetween(String value1, String value2) {
            addCriterion("shipping_code not between", value1, value2, "shippingCode");
            return (Criteria) this;
        }

        public Criteria andPostFeeIsNull() {
            addCriterion("post_fee is null");
            return (Criteria) this;
        }

        public Criteria andPostFeeIsNotNull() {
            addCriterion("post_fee is not null");
            return (Criteria) this;
        }

        public Criteria andPostFeeEqualTo(String value) {
            addCriterion("post_fee =", value, "postFee");
            return (Criteria) this;
        }

        public Criteria andPostFeeNotEqualTo(String value) {
            addCriterion("post_fee <>", value, "postFee");
            return (Criteria) this;
        }

        public Criteria andPostFeeGreaterThan(String value) {
            addCriterion("post_fee >", value, "postFee");
            return (Criteria) this;
        }

        public Criteria andPostFeeGreaterThanOrEqualTo(String value) {
            addCriterion("post_fee >=", value, "postFee");
            return (Criteria) this;
        }

        public Criteria andPostFeeLessThan(String value) {
            addCriterion("post_fee <", value, "postFee");
            return (Criteria) this;
        }

        public Criteria andPostFeeLessThanOrEqualTo(String value) {
            addCriterion("post_fee <=", value, "postFee");
            return (Criteria) this;
        }

        public Criteria andPostFeeLike(String value) {
            addCriterion("post_fee like", value, "postFee");
            return (Criteria) this;
        }

        public Criteria andPostFeeNotLike(String value) {
            addCriterion("post_fee not like", value, "postFee");
            return (Criteria) this;
        }

        public Criteria andPostFeeIn(List<String> values) {
            addCriterion("post_fee in", values, "postFee");
            return (Criteria) this;
        }

        public Criteria andPostFeeNotIn(List<String> values) {
            addCriterion("post_fee not in", values, "postFee");
            return (Criteria) this;
        }

        public Criteria andPostFeeBetween(String value1, String value2) {
            addCriterion("post_fee between", value1, value2, "postFee");
            return (Criteria) this;
        }

        public Criteria andPostFeeNotBetween(String value1, String value2) {
            addCriterion("post_fee not between", value1, value2, "postFee");
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