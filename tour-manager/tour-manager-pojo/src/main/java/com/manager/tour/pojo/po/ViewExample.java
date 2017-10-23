package com.manager.tour.pojo.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ViewExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ViewExample() {
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

        public Criteria andViewidIsNull() {
            addCriterion("viewid is null");
            return (Criteria) this;
        }

        public Criteria andViewidIsNotNull() {
            addCriterion("viewid is not null");
            return (Criteria) this;
        }

        public Criteria andViewidEqualTo(Integer value) {
            addCriterion("viewid =", value, "viewid");
            return (Criteria) this;
        }

        public Criteria andViewidNotEqualTo(Integer value) {
            addCriterion("viewid <>", value, "viewid");
            return (Criteria) this;
        }

        public Criteria andViewidGreaterThan(Integer value) {
            addCriterion("viewid >", value, "viewid");
            return (Criteria) this;
        }

        public Criteria andViewidGreaterThanOrEqualTo(Integer value) {
            addCriterion("viewid >=", value, "viewid");
            return (Criteria) this;
        }

        public Criteria andViewidLessThan(Integer value) {
            addCriterion("viewid <", value, "viewid");
            return (Criteria) this;
        }

        public Criteria andViewidLessThanOrEqualTo(Integer value) {
            addCriterion("viewid <=", value, "viewid");
            return (Criteria) this;
        }

        public Criteria andViewidIn(List<Integer> values) {
            addCriterion("viewid in", values, "viewid");
            return (Criteria) this;
        }

        public Criteria andViewidNotIn(List<Integer> values) {
            addCriterion("viewid not in", values, "viewid");
            return (Criteria) this;
        }

        public Criteria andViewidBetween(Integer value1, Integer value2) {
            addCriterion("viewid between", value1, value2, "viewid");
            return (Criteria) this;
        }

        public Criteria andViewidNotBetween(Integer value1, Integer value2) {
            addCriterion("viewid not between", value1, value2, "viewid");
            return (Criteria) this;
        }

        public Criteria andViewbriefIsNull() {
            addCriterion("viewbrief is null");
            return (Criteria) this;
        }

        public Criteria andViewbriefIsNotNull() {
            addCriterion("viewbrief is not null");
            return (Criteria) this;
        }

        public Criteria andViewbriefEqualTo(String value) {
            addCriterion("viewbrief =", value, "viewbrief");
            return (Criteria) this;
        }

        public Criteria andViewbriefNotEqualTo(String value) {
            addCriterion("viewbrief <>", value, "viewbrief");
            return (Criteria) this;
        }

        public Criteria andViewbriefGreaterThan(String value) {
            addCriterion("viewbrief >", value, "viewbrief");
            return (Criteria) this;
        }

        public Criteria andViewbriefGreaterThanOrEqualTo(String value) {
            addCriterion("viewbrief >=", value, "viewbrief");
            return (Criteria) this;
        }

        public Criteria andViewbriefLessThan(String value) {
            addCriterion("viewbrief <", value, "viewbrief");
            return (Criteria) this;
        }

        public Criteria andViewbriefLessThanOrEqualTo(String value) {
            addCriterion("viewbrief <=", value, "viewbrief");
            return (Criteria) this;
        }

        public Criteria andViewbriefLike(String value) {
            addCriterion("viewbrief like", value, "viewbrief");
            return (Criteria) this;
        }

        public Criteria andViewbriefNotLike(String value) {
            addCriterion("viewbrief not like", value, "viewbrief");
            return (Criteria) this;
        }

        public Criteria andViewbriefIn(List<String> values) {
            addCriterion("viewbrief in", values, "viewbrief");
            return (Criteria) this;
        }

        public Criteria andViewbriefNotIn(List<String> values) {
            addCriterion("viewbrief not in", values, "viewbrief");
            return (Criteria) this;
        }

        public Criteria andViewbriefBetween(String value1, String value2) {
            addCriterion("viewbrief between", value1, value2, "viewbrief");
            return (Criteria) this;
        }

        public Criteria andViewbriefNotBetween(String value1, String value2) {
            addCriterion("viewbrief not between", value1, value2, "viewbrief");
            return (Criteria) this;
        }

        public Criteria andViewimgIsNull() {
            addCriterion("viewimg is null");
            return (Criteria) this;
        }

        public Criteria andViewimgIsNotNull() {
            addCriterion("viewimg is not null");
            return (Criteria) this;
        }

        public Criteria andViewimgEqualTo(String value) {
            addCriterion("viewimg =", value, "viewimg");
            return (Criteria) this;
        }

        public Criteria andViewimgNotEqualTo(String value) {
            addCriterion("viewimg <>", value, "viewimg");
            return (Criteria) this;
        }

        public Criteria andViewimgGreaterThan(String value) {
            addCriterion("viewimg >", value, "viewimg");
            return (Criteria) this;
        }

        public Criteria andViewimgGreaterThanOrEqualTo(String value) {
            addCriterion("viewimg >=", value, "viewimg");
            return (Criteria) this;
        }

        public Criteria andViewimgLessThan(String value) {
            addCriterion("viewimg <", value, "viewimg");
            return (Criteria) this;
        }

        public Criteria andViewimgLessThanOrEqualTo(String value) {
            addCriterion("viewimg <=", value, "viewimg");
            return (Criteria) this;
        }

        public Criteria andViewimgLike(String value) {
            addCriterion("viewimg like", value, "viewimg");
            return (Criteria) this;
        }

        public Criteria andViewimgNotLike(String value) {
            addCriterion("viewimg not like", value, "viewimg");
            return (Criteria) this;
        }

        public Criteria andViewimgIn(List<String> values) {
            addCriterion("viewimg in", values, "viewimg");
            return (Criteria) this;
        }

        public Criteria andViewimgNotIn(List<String> values) {
            addCriterion("viewimg not in", values, "viewimg");
            return (Criteria) this;
        }

        public Criteria andViewimgBetween(String value1, String value2) {
            addCriterion("viewimg between", value1, value2, "viewimg");
            return (Criteria) this;
        }

        public Criteria andViewimgNotBetween(String value1, String value2) {
            addCriterion("viewimg not between", value1, value2, "viewimg");
            return (Criteria) this;
        }

        public Criteria andStarttimeIsNull() {
            addCriterion("starttime is null");
            return (Criteria) this;
        }

        public Criteria andStarttimeIsNotNull() {
            addCriterion("starttime is not null");
            return (Criteria) this;
        }

        public Criteria andStarttimeEqualTo(Date value) {
            addCriterion("starttime =", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotEqualTo(Date value) {
            addCriterion("starttime <>", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThan(Date value) {
            addCriterion("starttime >", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("starttime >=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThan(Date value) {
            addCriterion("starttime <", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThanOrEqualTo(Date value) {
            addCriterion("starttime <=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeIn(List<Date> values) {
            addCriterion("starttime in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotIn(List<Date> values) {
            addCriterion("starttime not in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeBetween(Date value1, Date value2) {
            addCriterion("starttime between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotBetween(Date value1, Date value2) {
            addCriterion("starttime not between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNull() {
            addCriterion("endtime is null");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNotNull() {
            addCriterion("endtime is not null");
            return (Criteria) this;
        }

        public Criteria andEndtimeEqualTo(Date value) {
            addCriterion("endtime =", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotEqualTo(Date value) {
            addCriterion("endtime <>", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThan(Date value) {
            addCriterion("endtime >", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("endtime >=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThan(Date value) {
            addCriterion("endtime <", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThanOrEqualTo(Date value) {
            addCriterion("endtime <=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIn(List<Date> values) {
            addCriterion("endtime in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotIn(List<Date> values) {
            addCriterion("endtime not in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeBetween(Date value1, Date value2) {
            addCriterion("endtime between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotBetween(Date value1, Date value2) {
            addCriterion("endtime not between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(String value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(String value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(String value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(String value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(String value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(String value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLike(String value) {
            addCriterion("price like", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotLike(String value) {
            addCriterion("price not like", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<String> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<String> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(String value1, String value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(String value1, String value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andStationIsNull() {
            addCriterion("station is null");
            return (Criteria) this;
        }

        public Criteria andStationIsNotNull() {
            addCriterion("station is not null");
            return (Criteria) this;
        }

        public Criteria andStationEqualTo(String value) {
            addCriterion("station =", value, "station");
            return (Criteria) this;
        }

        public Criteria andStationNotEqualTo(String value) {
            addCriterion("station <>", value, "station");
            return (Criteria) this;
        }

        public Criteria andStationGreaterThan(String value) {
            addCriterion("station >", value, "station");
            return (Criteria) this;
        }

        public Criteria andStationGreaterThanOrEqualTo(String value) {
            addCriterion("station >=", value, "station");
            return (Criteria) this;
        }

        public Criteria andStationLessThan(String value) {
            addCriterion("station <", value, "station");
            return (Criteria) this;
        }

        public Criteria andStationLessThanOrEqualTo(String value) {
            addCriterion("station <=", value, "station");
            return (Criteria) this;
        }

        public Criteria andStationLike(String value) {
            addCriterion("station like", value, "station");
            return (Criteria) this;
        }

        public Criteria andStationNotLike(String value) {
            addCriterion("station not like", value, "station");
            return (Criteria) this;
        }

        public Criteria andStationIn(List<String> values) {
            addCriterion("station in", values, "station");
            return (Criteria) this;
        }

        public Criteria andStationNotIn(List<String> values) {
            addCriterion("station not in", values, "station");
            return (Criteria) this;
        }

        public Criteria andStationBetween(String value1, String value2) {
            addCriterion("station between", value1, value2, "station");
            return (Criteria) this;
        }

        public Criteria andStationNotBetween(String value1, String value2) {
            addCriterion("station not between", value1, value2, "station");
            return (Criteria) this;
        }

        public Criteria andAttentionIsNull() {
            addCriterion("attention is null");
            return (Criteria) this;
        }

        public Criteria andAttentionIsNotNull() {
            addCriterion("attention is not null");
            return (Criteria) this;
        }

        public Criteria andAttentionEqualTo(String value) {
            addCriterion("attention =", value, "attention");
            return (Criteria) this;
        }

        public Criteria andAttentionNotEqualTo(String value) {
            addCriterion("attention <>", value, "attention");
            return (Criteria) this;
        }

        public Criteria andAttentionGreaterThan(String value) {
            addCriterion("attention >", value, "attention");
            return (Criteria) this;
        }

        public Criteria andAttentionGreaterThanOrEqualTo(String value) {
            addCriterion("attention >=", value, "attention");
            return (Criteria) this;
        }

        public Criteria andAttentionLessThan(String value) {
            addCriterion("attention <", value, "attention");
            return (Criteria) this;
        }

        public Criteria andAttentionLessThanOrEqualTo(String value) {
            addCriterion("attention <=", value, "attention");
            return (Criteria) this;
        }

        public Criteria andAttentionLike(String value) {
            addCriterion("attention like", value, "attention");
            return (Criteria) this;
        }

        public Criteria andAttentionNotLike(String value) {
            addCriterion("attention not like", value, "attention");
            return (Criteria) this;
        }

        public Criteria andAttentionIn(List<String> values) {
            addCriterion("attention in", values, "attention");
            return (Criteria) this;
        }

        public Criteria andAttentionNotIn(List<String> values) {
            addCriterion("attention not in", values, "attention");
            return (Criteria) this;
        }

        public Criteria andAttentionBetween(String value1, String value2) {
            addCriterion("attention between", value1, value2, "attention");
            return (Criteria) this;
        }

        public Criteria andAttentionNotBetween(String value1, String value2) {
            addCriterion("attention not between", value1, value2, "attention");
            return (Criteria) this;
        }

        public Criteria andIntroductaionIsNull() {
            addCriterion("introductaion is null");
            return (Criteria) this;
        }

        public Criteria andIntroductaionIsNotNull() {
            addCriterion("introductaion is not null");
            return (Criteria) this;
        }

        public Criteria andIntroductaionEqualTo(String value) {
            addCriterion("introductaion =", value, "introductaion");
            return (Criteria) this;
        }

        public Criteria andIntroductaionNotEqualTo(String value) {
            addCriterion("introductaion <>", value, "introductaion");
            return (Criteria) this;
        }

        public Criteria andIntroductaionGreaterThan(String value) {
            addCriterion("introductaion >", value, "introductaion");
            return (Criteria) this;
        }

        public Criteria andIntroductaionGreaterThanOrEqualTo(String value) {
            addCriterion("introductaion >=", value, "introductaion");
            return (Criteria) this;
        }

        public Criteria andIntroductaionLessThan(String value) {
            addCriterion("introductaion <", value, "introductaion");
            return (Criteria) this;
        }

        public Criteria andIntroductaionLessThanOrEqualTo(String value) {
            addCriterion("introductaion <=", value, "introductaion");
            return (Criteria) this;
        }

        public Criteria andIntroductaionLike(String value) {
            addCriterion("introductaion like", value, "introductaion");
            return (Criteria) this;
        }

        public Criteria andIntroductaionNotLike(String value) {
            addCriterion("introductaion not like", value, "introductaion");
            return (Criteria) this;
        }

        public Criteria andIntroductaionIn(List<String> values) {
            addCriterion("introductaion in", values, "introductaion");
            return (Criteria) this;
        }

        public Criteria andIntroductaionNotIn(List<String> values) {
            addCriterion("introductaion not in", values, "introductaion");
            return (Criteria) this;
        }

        public Criteria andIntroductaionBetween(String value1, String value2) {
            addCriterion("introductaion between", value1, value2, "introductaion");
            return (Criteria) this;
        }

        public Criteria andIntroductaionNotBetween(String value1, String value2) {
            addCriterion("introductaion not between", value1, value2, "introductaion");
            return (Criteria) this;
        }

        public Criteria andCidIsNull() {
            addCriterion("cid is null");
            return (Criteria) this;
        }

        public Criteria andCidIsNotNull() {
            addCriterion("cid is not null");
            return (Criteria) this;
        }

        public Criteria andCidEqualTo(Integer value) {
            addCriterion("cid =", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotEqualTo(Integer value) {
            addCriterion("cid <>", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThan(Integer value) {
            addCriterion("cid >", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThanOrEqualTo(Integer value) {
            addCriterion("cid >=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThan(Integer value) {
            addCriterion("cid <", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThanOrEqualTo(Integer value) {
            addCriterion("cid <=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidIn(List<Integer> values) {
            addCriterion("cid in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotIn(List<Integer> values) {
            addCriterion("cid not in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidBetween(Integer value1, Integer value2) {
            addCriterion("cid between", value1, value2, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotBetween(Integer value1, Integer value2) {
            addCriterion("cid not between", value1, value2, "cid");
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