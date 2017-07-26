package com.bwie.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MyemailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MyemailExample() {
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

        public Criteria andEfromIsNull() {
            addCriterion("efrom is null");
            return (Criteria) this;
        }

        public Criteria andEfromIsNotNull() {
            addCriterion("efrom is not null");
            return (Criteria) this;
        }

        public Criteria andEfromEqualTo(String value) {
            addCriterion("efrom =", value, "efrom");
            return (Criteria) this;
        }

        public Criteria andEfromNotEqualTo(String value) {
            addCriterion("efrom <>", value, "efrom");
            return (Criteria) this;
        }

        public Criteria andEfromGreaterThan(String value) {
            addCriterion("efrom >", value, "efrom");
            return (Criteria) this;
        }

        public Criteria andEfromGreaterThanOrEqualTo(String value) {
            addCriterion("efrom >=", value, "efrom");
            return (Criteria) this;
        }

        public Criteria andEfromLessThan(String value) {
            addCriterion("efrom <", value, "efrom");
            return (Criteria) this;
        }

        public Criteria andEfromLessThanOrEqualTo(String value) {
            addCriterion("efrom <=", value, "efrom");
            return (Criteria) this;
        }

        public Criteria andEfromLike(String value) {
            addCriterion("efrom like", value, "efrom");
            return (Criteria) this;
        }

        public Criteria andEfromNotLike(String value) {
            addCriterion("efrom not like", value, "efrom");
            return (Criteria) this;
        }

        public Criteria andEfromIn(List<String> values) {
            addCriterion("efrom in", values, "efrom");
            return (Criteria) this;
        }

        public Criteria andEfromNotIn(List<String> values) {
            addCriterion("efrom not in", values, "efrom");
            return (Criteria) this;
        }

        public Criteria andEfromBetween(String value1, String value2) {
            addCriterion("efrom between", value1, value2, "efrom");
            return (Criteria) this;
        }

        public Criteria andEfromNotBetween(String value1, String value2) {
            addCriterion("efrom not between", value1, value2, "efrom");
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

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andCotentIsNull() {
            addCriterion("cotent is null");
            return (Criteria) this;
        }

        public Criteria andCotentIsNotNull() {
            addCriterion("cotent is not null");
            return (Criteria) this;
        }

        public Criteria andCotentEqualTo(String value) {
            addCriterion("cotent =", value, "cotent");
            return (Criteria) this;
        }

        public Criteria andCotentNotEqualTo(String value) {
            addCriterion("cotent <>", value, "cotent");
            return (Criteria) this;
        }

        public Criteria andCotentGreaterThan(String value) {
            addCriterion("cotent >", value, "cotent");
            return (Criteria) this;
        }

        public Criteria andCotentGreaterThanOrEqualTo(String value) {
            addCriterion("cotent >=", value, "cotent");
            return (Criteria) this;
        }

        public Criteria andCotentLessThan(String value) {
            addCriterion("cotent <", value, "cotent");
            return (Criteria) this;
        }

        public Criteria andCotentLessThanOrEqualTo(String value) {
            addCriterion("cotent <=", value, "cotent");
            return (Criteria) this;
        }

        public Criteria andCotentLike(String value) {
            addCriterion("cotent like", value, "cotent");
            return (Criteria) this;
        }

        public Criteria andCotentNotLike(String value) {
            addCriterion("cotent not like", value, "cotent");
            return (Criteria) this;
        }

        public Criteria andCotentIn(List<String> values) {
            addCriterion("cotent in", values, "cotent");
            return (Criteria) this;
        }

        public Criteria andCotentNotIn(List<String> values) {
            addCriterion("cotent not in", values, "cotent");
            return (Criteria) this;
        }

        public Criteria andCotentBetween(String value1, String value2) {
            addCriterion("cotent between", value1, value2, "cotent");
            return (Criteria) this;
        }

        public Criteria andCotentNotBetween(String value1, String value2) {
            addCriterion("cotent not between", value1, value2, "cotent");
            return (Criteria) this;
        }

        public Criteria andCteattimeIsNull() {
            addCriterion("cteattime is null");
            return (Criteria) this;
        }

        public Criteria andCteattimeIsNotNull() {
            addCriterion("cteattime is not null");
            return (Criteria) this;
        }

        public Criteria andCteattimeEqualTo(Date value) {
            addCriterion("cteattime =", value, "cteattime");
            return (Criteria) this;
        }

        public Criteria andCteattimeNotEqualTo(Date value) {
            addCriterion("cteattime <>", value, "cteattime");
            return (Criteria) this;
        }

        public Criteria andCteattimeGreaterThan(Date value) {
            addCriterion("cteattime >", value, "cteattime");
            return (Criteria) this;
        }

        public Criteria andCteattimeGreaterThanOrEqualTo(Date value) {
            addCriterion("cteattime >=", value, "cteattime");
            return (Criteria) this;
        }

        public Criteria andCteattimeLessThan(Date value) {
            addCriterion("cteattime <", value, "cteattime");
            return (Criteria) this;
        }

        public Criteria andCteattimeLessThanOrEqualTo(Date value) {
            addCriterion("cteattime <=", value, "cteattime");
            return (Criteria) this;
        }

        public Criteria andCteattimeIn(List<Date> values) {
            addCriterion("cteattime in", values, "cteattime");
            return (Criteria) this;
        }

        public Criteria andCteattimeNotIn(List<Date> values) {
            addCriterion("cteattime not in", values, "cteattime");
            return (Criteria) this;
        }

        public Criteria andCteattimeBetween(Date value1, Date value2) {
            addCriterion("cteattime between", value1, value2, "cteattime");
            return (Criteria) this;
        }

        public Criteria andCteattimeNotBetween(Date value1, Date value2) {
            addCriterion("cteattime not between", value1, value2, "cteattime");
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