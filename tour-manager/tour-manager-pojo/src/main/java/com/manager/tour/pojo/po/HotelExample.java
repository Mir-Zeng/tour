package com.manager.tour.pojo.po;

import java.util.ArrayList;
import java.util.List;

public class HotelExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HotelExample() {
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

        public Criteria andHotelidIsNull() {
            addCriterion("hotelid is null");
            return (Criteria) this;
        }

        public Criteria andHotelidIsNotNull() {
            addCriterion("hotelid is not null");
            return (Criteria) this;
        }

        public Criteria andHotelidEqualTo(Integer value) {
            addCriterion("hotelid =", value, "hotelid");
            return (Criteria) this;
        }

        public Criteria andHotelidNotEqualTo(Integer value) {
            addCriterion("hotelid <>", value, "hotelid");
            return (Criteria) this;
        }

        public Criteria andHotelidGreaterThan(Integer value) {
            addCriterion("hotelid >", value, "hotelid");
            return (Criteria) this;
        }

        public Criteria andHotelidGreaterThanOrEqualTo(Integer value) {
            addCriterion("hotelid >=", value, "hotelid");
            return (Criteria) this;
        }

        public Criteria andHotelidLessThan(Integer value) {
            addCriterion("hotelid <", value, "hotelid");
            return (Criteria) this;
        }

        public Criteria andHotelidLessThanOrEqualTo(Integer value) {
            addCriterion("hotelid <=", value, "hotelid");
            return (Criteria) this;
        }

        public Criteria andHotelidIn(List<Integer> values) {
            addCriterion("hotelid in", values, "hotelid");
            return (Criteria) this;
        }

        public Criteria andHotelidNotIn(List<Integer> values) {
            addCriterion("hotelid not in", values, "hotelid");
            return (Criteria) this;
        }

        public Criteria andHotelidBetween(Integer value1, Integer value2) {
            addCriterion("hotelid between", value1, value2, "hotelid");
            return (Criteria) this;
        }

        public Criteria andHotelidNotBetween(Integer value1, Integer value2) {
            addCriterion("hotelid not between", value1, value2, "hotelid");
            return (Criteria) this;
        }

        public Criteria andHotelnameIsNull() {
            addCriterion("hotelname is null");
            return (Criteria) this;
        }

        public Criteria andHotelnameIsNotNull() {
            addCriterion("hotelname is not null");
            return (Criteria) this;
        }

        public Criteria andHotelnameEqualTo(String value) {
            addCriterion("hotelname =", value, "hotelname");
            return (Criteria) this;
        }

        public Criteria andHotelnameNotEqualTo(String value) {
            addCriterion("hotelname <>", value, "hotelname");
            return (Criteria) this;
        }

        public Criteria andHotelnameGreaterThan(String value) {
            addCriterion("hotelname >", value, "hotelname");
            return (Criteria) this;
        }

        public Criteria andHotelnameGreaterThanOrEqualTo(String value) {
            addCriterion("hotelname >=", value, "hotelname");
            return (Criteria) this;
        }

        public Criteria andHotelnameLessThan(String value) {
            addCriterion("hotelname <", value, "hotelname");
            return (Criteria) this;
        }

        public Criteria andHotelnameLessThanOrEqualTo(String value) {
            addCriterion("hotelname <=", value, "hotelname");
            return (Criteria) this;
        }

        public Criteria andHotelnameLike(String value) {
            addCriterion("hotelname like", value, "hotelname");
            return (Criteria) this;
        }

        public Criteria andHotelnameNotLike(String value) {
            addCriterion("hotelname not like", value, "hotelname");
            return (Criteria) this;
        }

        public Criteria andHotelnameIn(List<String> values) {
            addCriterion("hotelname in", values, "hotelname");
            return (Criteria) this;
        }

        public Criteria andHotelnameNotIn(List<String> values) {
            addCriterion("hotelname not in", values, "hotelname");
            return (Criteria) this;
        }

        public Criteria andHotelnameBetween(String value1, String value2) {
            addCriterion("hotelname between", value1, value2, "hotelname");
            return (Criteria) this;
        }

        public Criteria andHotelnameNotBetween(String value1, String value2) {
            addCriterion("hotelname not between", value1, value2, "hotelname");
            return (Criteria) this;
        }

        public Criteria andHotelimgIsNull() {
            addCriterion("hotelimg is null");
            return (Criteria) this;
        }

        public Criteria andHotelimgIsNotNull() {
            addCriterion("hotelimg is not null");
            return (Criteria) this;
        }

        public Criteria andHotelimgEqualTo(String value) {
            addCriterion("hotelimg =", value, "hotelimg");
            return (Criteria) this;
        }

        public Criteria andHotelimgNotEqualTo(String value) {
            addCriterion("hotelimg <>", value, "hotelimg");
            return (Criteria) this;
        }

        public Criteria andHotelimgGreaterThan(String value) {
            addCriterion("hotelimg >", value, "hotelimg");
            return (Criteria) this;
        }

        public Criteria andHotelimgGreaterThanOrEqualTo(String value) {
            addCriterion("hotelimg >=", value, "hotelimg");
            return (Criteria) this;
        }

        public Criteria andHotelimgLessThan(String value) {
            addCriterion("hotelimg <", value, "hotelimg");
            return (Criteria) this;
        }

        public Criteria andHotelimgLessThanOrEqualTo(String value) {
            addCriterion("hotelimg <=", value, "hotelimg");
            return (Criteria) this;
        }

        public Criteria andHotelimgLike(String value) {
            addCriterion("hotelimg like", value, "hotelimg");
            return (Criteria) this;
        }

        public Criteria andHotelimgNotLike(String value) {
            addCriterion("hotelimg not like", value, "hotelimg");
            return (Criteria) this;
        }

        public Criteria andHotelimgIn(List<String> values) {
            addCriterion("hotelimg in", values, "hotelimg");
            return (Criteria) this;
        }

        public Criteria andHotelimgNotIn(List<String> values) {
            addCriterion("hotelimg not in", values, "hotelimg");
            return (Criteria) this;
        }

        public Criteria andHotelimgBetween(String value1, String value2) {
            addCriterion("hotelimg between", value1, value2, "hotelimg");
            return (Criteria) this;
        }

        public Criteria andHotelimgNotBetween(String value1, String value2) {
            addCriterion("hotelimg not between", value1, value2, "hotelimg");
            return (Criteria) this;
        }

        public Criteria andHotelphoneIsNull() {
            addCriterion("hotelphone is null");
            return (Criteria) this;
        }

        public Criteria andHotelphoneIsNotNull() {
            addCriterion("hotelphone is not null");
            return (Criteria) this;
        }

        public Criteria andHotelphoneEqualTo(String value) {
            addCriterion("hotelphone =", value, "hotelphone");
            return (Criteria) this;
        }

        public Criteria andHotelphoneNotEqualTo(String value) {
            addCriterion("hotelphone <>", value, "hotelphone");
            return (Criteria) this;
        }

        public Criteria andHotelphoneGreaterThan(String value) {
            addCriterion("hotelphone >", value, "hotelphone");
            return (Criteria) this;
        }

        public Criteria andHotelphoneGreaterThanOrEqualTo(String value) {
            addCriterion("hotelphone >=", value, "hotelphone");
            return (Criteria) this;
        }

        public Criteria andHotelphoneLessThan(String value) {
            addCriterion("hotelphone <", value, "hotelphone");
            return (Criteria) this;
        }

        public Criteria andHotelphoneLessThanOrEqualTo(String value) {
            addCriterion("hotelphone <=", value, "hotelphone");
            return (Criteria) this;
        }

        public Criteria andHotelphoneLike(String value) {
            addCriterion("hotelphone like", value, "hotelphone");
            return (Criteria) this;
        }

        public Criteria andHotelphoneNotLike(String value) {
            addCriterion("hotelphone not like", value, "hotelphone");
            return (Criteria) this;
        }

        public Criteria andHotelphoneIn(List<String> values) {
            addCriterion("hotelphone in", values, "hotelphone");
            return (Criteria) this;
        }

        public Criteria andHotelphoneNotIn(List<String> values) {
            addCriterion("hotelphone not in", values, "hotelphone");
            return (Criteria) this;
        }

        public Criteria andHotelphoneBetween(String value1, String value2) {
            addCriterion("hotelphone between", value1, value2, "hotelphone");
            return (Criteria) this;
        }

        public Criteria andHotelphoneNotBetween(String value1, String value2) {
            addCriterion("hotelphone not between", value1, value2, "hotelphone");
            return (Criteria) this;
        }

        public Criteria andHoteladdressIsNull() {
            addCriterion("hoteladdress is null");
            return (Criteria) this;
        }

        public Criteria andHoteladdressIsNotNull() {
            addCriterion("hoteladdress is not null");
            return (Criteria) this;
        }

        public Criteria andHoteladdressEqualTo(String value) {
            addCriterion("hoteladdress =", value, "hoteladdress");
            return (Criteria) this;
        }

        public Criteria andHoteladdressNotEqualTo(String value) {
            addCriterion("hoteladdress <>", value, "hoteladdress");
            return (Criteria) this;
        }

        public Criteria andHoteladdressGreaterThan(String value) {
            addCriterion("hoteladdress >", value, "hoteladdress");
            return (Criteria) this;
        }

        public Criteria andHoteladdressGreaterThanOrEqualTo(String value) {
            addCriterion("hoteladdress >=", value, "hoteladdress");
            return (Criteria) this;
        }

        public Criteria andHoteladdressLessThan(String value) {
            addCriterion("hoteladdress <", value, "hoteladdress");
            return (Criteria) this;
        }

        public Criteria andHoteladdressLessThanOrEqualTo(String value) {
            addCriterion("hoteladdress <=", value, "hoteladdress");
            return (Criteria) this;
        }

        public Criteria andHoteladdressLike(String value) {
            addCriterion("hoteladdress like", value, "hoteladdress");
            return (Criteria) this;
        }

        public Criteria andHoteladdressNotLike(String value) {
            addCriterion("hoteladdress not like", value, "hoteladdress");
            return (Criteria) this;
        }

        public Criteria andHoteladdressIn(List<String> values) {
            addCriterion("hoteladdress in", values, "hoteladdress");
            return (Criteria) this;
        }

        public Criteria andHoteladdressNotIn(List<String> values) {
            addCriterion("hoteladdress not in", values, "hoteladdress");
            return (Criteria) this;
        }

        public Criteria andHoteladdressBetween(String value1, String value2) {
            addCriterion("hoteladdress between", value1, value2, "hoteladdress");
            return (Criteria) this;
        }

        public Criteria andHoteladdressNotBetween(String value1, String value2) {
            addCriterion("hoteladdress not between", value1, value2, "hoteladdress");
            return (Criteria) this;
        }

        public Criteria andHoteldetailIsNull() {
            addCriterion("hoteldetail is null");
            return (Criteria) this;
        }

        public Criteria andHoteldetailIsNotNull() {
            addCriterion("hoteldetail is not null");
            return (Criteria) this;
        }

        public Criteria andHoteldetailEqualTo(String value) {
            addCriterion("hoteldetail =", value, "hoteldetail");
            return (Criteria) this;
        }

        public Criteria andHoteldetailNotEqualTo(String value) {
            addCriterion("hoteldetail <>", value, "hoteldetail");
            return (Criteria) this;
        }

        public Criteria andHoteldetailGreaterThan(String value) {
            addCriterion("hoteldetail >", value, "hoteldetail");
            return (Criteria) this;
        }

        public Criteria andHoteldetailGreaterThanOrEqualTo(String value) {
            addCriterion("hoteldetail >=", value, "hoteldetail");
            return (Criteria) this;
        }

        public Criteria andHoteldetailLessThan(String value) {
            addCriterion("hoteldetail <", value, "hoteldetail");
            return (Criteria) this;
        }

        public Criteria andHoteldetailLessThanOrEqualTo(String value) {
            addCriterion("hoteldetail <=", value, "hoteldetail");
            return (Criteria) this;
        }

        public Criteria andHoteldetailLike(String value) {
            addCriterion("hoteldetail like", value, "hoteldetail");
            return (Criteria) this;
        }

        public Criteria andHoteldetailNotLike(String value) {
            addCriterion("hoteldetail not like", value, "hoteldetail");
            return (Criteria) this;
        }

        public Criteria andHoteldetailIn(List<String> values) {
            addCriterion("hoteldetail in", values, "hoteldetail");
            return (Criteria) this;
        }

        public Criteria andHoteldetailNotIn(List<String> values) {
            addCriterion("hoteldetail not in", values, "hoteldetail");
            return (Criteria) this;
        }

        public Criteria andHoteldetailBetween(String value1, String value2) {
            addCriterion("hoteldetail between", value1, value2, "hoteldetail");
            return (Criteria) this;
        }

        public Criteria andHoteldetailNotBetween(String value1, String value2) {
            addCriterion("hoteldetail not between", value1, value2, "hoteldetail");
            return (Criteria) this;
        }

        public Criteria andHotelpriceIsNull() {
            addCriterion("hotelprice is null");
            return (Criteria) this;
        }

        public Criteria andHotelpriceIsNotNull() {
            addCriterion("hotelprice is not null");
            return (Criteria) this;
        }

        public Criteria andHotelpriceEqualTo(String value) {
            addCriterion("hotelprice =", value, "hotelprice");
            return (Criteria) this;
        }

        public Criteria andHotelpriceNotEqualTo(String value) {
            addCriterion("hotelprice <>", value, "hotelprice");
            return (Criteria) this;
        }

        public Criteria andHotelpriceGreaterThan(String value) {
            addCriterion("hotelprice >", value, "hotelprice");
            return (Criteria) this;
        }

        public Criteria andHotelpriceGreaterThanOrEqualTo(String value) {
            addCriterion("hotelprice >=", value, "hotelprice");
            return (Criteria) this;
        }

        public Criteria andHotelpriceLessThan(String value) {
            addCriterion("hotelprice <", value, "hotelprice");
            return (Criteria) this;
        }

        public Criteria andHotelpriceLessThanOrEqualTo(String value) {
            addCriterion("hotelprice <=", value, "hotelprice");
            return (Criteria) this;
        }

        public Criteria andHotelpriceLike(String value) {
            addCriterion("hotelprice like", value, "hotelprice");
            return (Criteria) this;
        }

        public Criteria andHotelpriceNotLike(String value) {
            addCriterion("hotelprice not like", value, "hotelprice");
            return (Criteria) this;
        }

        public Criteria andHotelpriceIn(List<String> values) {
            addCriterion("hotelprice in", values, "hotelprice");
            return (Criteria) this;
        }

        public Criteria andHotelpriceNotIn(List<String> values) {
            addCriterion("hotelprice not in", values, "hotelprice");
            return (Criteria) this;
        }

        public Criteria andHotelpriceBetween(String value1, String value2) {
            addCriterion("hotelprice between", value1, value2, "hotelprice");
            return (Criteria) this;
        }

        public Criteria andHotelpriceNotBetween(String value1, String value2) {
            addCriterion("hotelprice not between", value1, value2, "hotelprice");
            return (Criteria) this;
        }

        public Criteria andHotelstarIsNull() {
            addCriterion("hotelstar is null");
            return (Criteria) this;
        }

        public Criteria andHotelstarIsNotNull() {
            addCriterion("hotelstar is not null");
            return (Criteria) this;
        }

        public Criteria andHotelstarEqualTo(Integer value) {
            addCriterion("hotelstar =", value, "hotelstar");
            return (Criteria) this;
        }

        public Criteria andHotelstarNotEqualTo(Integer value) {
            addCriterion("hotelstar <>", value, "hotelstar");
            return (Criteria) this;
        }

        public Criteria andHotelstarGreaterThan(Integer value) {
            addCriterion("hotelstar >", value, "hotelstar");
            return (Criteria) this;
        }

        public Criteria andHotelstarGreaterThanOrEqualTo(Integer value) {
            addCriterion("hotelstar >=", value, "hotelstar");
            return (Criteria) this;
        }

        public Criteria andHotelstarLessThan(Integer value) {
            addCriterion("hotelstar <", value, "hotelstar");
            return (Criteria) this;
        }

        public Criteria andHotelstarLessThanOrEqualTo(Integer value) {
            addCriterion("hotelstar <=", value, "hotelstar");
            return (Criteria) this;
        }

        public Criteria andHotelstarIn(List<Integer> values) {
            addCriterion("hotelstar in", values, "hotelstar");
            return (Criteria) this;
        }

        public Criteria andHotelstarNotIn(List<Integer> values) {
            addCriterion("hotelstar not in", values, "hotelstar");
            return (Criteria) this;
        }

        public Criteria andHotelstarBetween(Integer value1, Integer value2) {
            addCriterion("hotelstar between", value1, value2, "hotelstar");
            return (Criteria) this;
        }

        public Criteria andHotelstarNotBetween(Integer value1, Integer value2) {
            addCriterion("hotelstar not between", value1, value2, "hotelstar");
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

        public Criteria andVidIsNull() {
            addCriterion("vid is null");
            return (Criteria) this;
        }

        public Criteria andVidIsNotNull() {
            addCriterion("vid is not null");
            return (Criteria) this;
        }

        public Criteria andVidEqualTo(Integer value) {
            addCriterion("vid =", value, "vid");
            return (Criteria) this;
        }

        public Criteria andVidNotEqualTo(Integer value) {
            addCriterion("vid <>", value, "vid");
            return (Criteria) this;
        }

        public Criteria andVidGreaterThan(Integer value) {
            addCriterion("vid >", value, "vid");
            return (Criteria) this;
        }

        public Criteria andVidGreaterThanOrEqualTo(Integer value) {
            addCriterion("vid >=", value, "vid");
            return (Criteria) this;
        }

        public Criteria andVidLessThan(Integer value) {
            addCriterion("vid <", value, "vid");
            return (Criteria) this;
        }

        public Criteria andVidLessThanOrEqualTo(Integer value) {
            addCriterion("vid <=", value, "vid");
            return (Criteria) this;
        }

        public Criteria andVidIn(List<Integer> values) {
            addCriterion("vid in", values, "vid");
            return (Criteria) this;
        }

        public Criteria andVidNotIn(List<Integer> values) {
            addCriterion("vid not in", values, "vid");
            return (Criteria) this;
        }

        public Criteria andVidBetween(Integer value1, Integer value2) {
            addCriterion("vid between", value1, value2, "vid");
            return (Criteria) this;
        }

        public Criteria andVidNotBetween(Integer value1, Integer value2) {
            addCriterion("vid not between", value1, value2, "vid");
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