package cn.net.guu.security.model;

import java.util.ArrayList;
import java.util.List;

public class AuthorityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AuthorityExample() {
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

        public Criteria andAuthorityIdIsNull() {
            addCriterion("authority_id is null");
            return (Criteria) this;
        }

        public Criteria andAuthorityIdIsNotNull() {
            addCriterion("authority_id is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorityIdEqualTo(Integer value) {
            addCriterion("authority_id =", value, "authorityId");
            return (Criteria) this;
        }

        public Criteria andAuthorityIdNotEqualTo(Integer value) {
            addCriterion("authority_id <>", value, "authorityId");
            return (Criteria) this;
        }

        public Criteria andAuthorityIdGreaterThan(Integer value) {
            addCriterion("authority_id >", value, "authorityId");
            return (Criteria) this;
        }

        public Criteria andAuthorityIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("authority_id >=", value, "authorityId");
            return (Criteria) this;
        }

        public Criteria andAuthorityIdLessThan(Integer value) {
            addCriterion("authority_id <", value, "authorityId");
            return (Criteria) this;
        }

        public Criteria andAuthorityIdLessThanOrEqualTo(Integer value) {
            addCriterion("authority_id <=", value, "authorityId");
            return (Criteria) this;
        }

        public Criteria andAuthorityIdIn(List<Integer> values) {
            addCriterion("authority_id in", values, "authorityId");
            return (Criteria) this;
        }

        public Criteria andAuthorityIdNotIn(List<Integer> values) {
            addCriterion("authority_id not in", values, "authorityId");
            return (Criteria) this;
        }

        public Criteria andAuthorityIdBetween(Integer value1, Integer value2) {
            addCriterion("authority_id between", value1, value2, "authorityId");
            return (Criteria) this;
        }

        public Criteria andAuthorityIdNotBetween(Integer value1, Integer value2) {
            addCriterion("authority_id not between", value1, value2, "authorityId");
            return (Criteria) this;
        }

        public Criteria andAuthorityNameIsNull() {
            addCriterion("authority_name is null");
            return (Criteria) this;
        }

        public Criteria andAuthorityNameIsNotNull() {
            addCriterion("authority_name is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorityNameEqualTo(String value) {
            addCriterion("authority_name =", value, "authorityName");
            return (Criteria) this;
        }

        public Criteria andAuthorityNameNotEqualTo(String value) {
            addCriterion("authority_name <>", value, "authorityName");
            return (Criteria) this;
        }

        public Criteria andAuthorityNameGreaterThan(String value) {
            addCriterion("authority_name >", value, "authorityName");
            return (Criteria) this;
        }

        public Criteria andAuthorityNameGreaterThanOrEqualTo(String value) {
            addCriterion("authority_name >=", value, "authorityName");
            return (Criteria) this;
        }

        public Criteria andAuthorityNameLessThan(String value) {
            addCriterion("authority_name <", value, "authorityName");
            return (Criteria) this;
        }

        public Criteria andAuthorityNameLessThanOrEqualTo(String value) {
            addCriterion("authority_name <=", value, "authorityName");
            return (Criteria) this;
        }

        public Criteria andAuthorityNameLike(String value) {
            addCriterion("authority_name like", value, "authorityName");
            return (Criteria) this;
        }

        public Criteria andAuthorityNameNotLike(String value) {
            addCriterion("authority_name not like", value, "authorityName");
            return (Criteria) this;
        }

        public Criteria andAuthorityNameIn(List<String> values) {
            addCriterion("authority_name in", values, "authorityName");
            return (Criteria) this;
        }

        public Criteria andAuthorityNameNotIn(List<String> values) {
            addCriterion("authority_name not in", values, "authorityName");
            return (Criteria) this;
        }

        public Criteria andAuthorityNameBetween(String value1, String value2) {
            addCriterion("authority_name between", value1, value2, "authorityName");
            return (Criteria) this;
        }

        public Criteria andAuthorityNameNotBetween(String value1, String value2) {
            addCriterion("authority_name not between", value1, value2, "authorityName");
            return (Criteria) this;
        }

        public Criteria andAuthorityDescIsNull() {
            addCriterion("authority_desc is null");
            return (Criteria) this;
        }

        public Criteria andAuthorityDescIsNotNull() {
            addCriterion("authority_desc is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorityDescEqualTo(String value) {
            addCriterion("authority_desc =", value, "authorityDesc");
            return (Criteria) this;
        }

        public Criteria andAuthorityDescNotEqualTo(String value) {
            addCriterion("authority_desc <>", value, "authorityDesc");
            return (Criteria) this;
        }

        public Criteria andAuthorityDescGreaterThan(String value) {
            addCriterion("authority_desc >", value, "authorityDesc");
            return (Criteria) this;
        }

        public Criteria andAuthorityDescGreaterThanOrEqualTo(String value) {
            addCriterion("authority_desc >=", value, "authorityDesc");
            return (Criteria) this;
        }

        public Criteria andAuthorityDescLessThan(String value) {
            addCriterion("authority_desc <", value, "authorityDesc");
            return (Criteria) this;
        }

        public Criteria andAuthorityDescLessThanOrEqualTo(String value) {
            addCriterion("authority_desc <=", value, "authorityDesc");
            return (Criteria) this;
        }

        public Criteria andAuthorityDescLike(String value) {
            addCriterion("authority_desc like", value, "authorityDesc");
            return (Criteria) this;
        }

        public Criteria andAuthorityDescNotLike(String value) {
            addCriterion("authority_desc not like", value, "authorityDesc");
            return (Criteria) this;
        }

        public Criteria andAuthorityDescIn(List<String> values) {
            addCriterion("authority_desc in", values, "authorityDesc");
            return (Criteria) this;
        }

        public Criteria andAuthorityDescNotIn(List<String> values) {
            addCriterion("authority_desc not in", values, "authorityDesc");
            return (Criteria) this;
        }

        public Criteria andAuthorityDescBetween(String value1, String value2) {
            addCriterion("authority_desc between", value1, value2, "authorityDesc");
            return (Criteria) this;
        }

        public Criteria andAuthorityDescNotBetween(String value1, String value2) {
            addCriterion("authority_desc not between", value1, value2, "authorityDesc");
            return (Criteria) this;
        }

        public Criteria andModuleIsNull() {
            addCriterion("module is null");
            return (Criteria) this;
        }

        public Criteria andModuleIsNotNull() {
            addCriterion("module is not null");
            return (Criteria) this;
        }

        public Criteria andModuleEqualTo(String value) {
            addCriterion("module =", value, "module");
            return (Criteria) this;
        }

        public Criteria andModuleNotEqualTo(String value) {
            addCriterion("module <>", value, "module");
            return (Criteria) this;
        }

        public Criteria andModuleGreaterThan(String value) {
            addCriterion("module >", value, "module");
            return (Criteria) this;
        }

        public Criteria andModuleGreaterThanOrEqualTo(String value) {
            addCriterion("module >=", value, "module");
            return (Criteria) this;
        }

        public Criteria andModuleLessThan(String value) {
            addCriterion("module <", value, "module");
            return (Criteria) this;
        }

        public Criteria andModuleLessThanOrEqualTo(String value) {
            addCriterion("module <=", value, "module");
            return (Criteria) this;
        }

        public Criteria andModuleLike(String value) {
            addCriterion("module like", value, "module");
            return (Criteria) this;
        }

        public Criteria andModuleNotLike(String value) {
            addCriterion("module not like", value, "module");
            return (Criteria) this;
        }

        public Criteria andModuleIn(List<String> values) {
            addCriterion("module in", values, "module");
            return (Criteria) this;
        }

        public Criteria andModuleNotIn(List<String> values) {
            addCriterion("module not in", values, "module");
            return (Criteria) this;
        }

        public Criteria andModuleBetween(String value1, String value2) {
            addCriterion("module between", value1, value2, "module");
            return (Criteria) this;
        }

        public Criteria andModuleNotBetween(String value1, String value2) {
            addCriterion("module not between", value1, value2, "module");
            return (Criteria) this;
        }

        public Criteria andEnabledIsNull() {
            addCriterion("enabled is null");
            return (Criteria) this;
        }

        public Criteria andEnabledIsNotNull() {
            addCriterion("enabled is not null");
            return (Criteria) this;
        }

        public Criteria andEnabledEqualTo(Boolean value) {
            addCriterion("enabled =", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledNotEqualTo(Boolean value) {
            addCriterion("enabled <>", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledGreaterThan(Boolean value) {
            addCriterion("enabled >", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledGreaterThanOrEqualTo(Boolean value) {
            addCriterion("enabled >=", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledLessThan(Boolean value) {
            addCriterion("enabled <", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledLessThanOrEqualTo(Boolean value) {
            addCriterion("enabled <=", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledIn(List<Boolean> values) {
            addCriterion("enabled in", values, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledNotIn(List<Boolean> values) {
            addCriterion("enabled not in", values, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledBetween(Boolean value1, Boolean value2) {
            addCriterion("enabled between", value1, value2, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledNotBetween(Boolean value1, Boolean value2) {
            addCriterion("enabled not between", value1, value2, "enabled");
            return (Criteria) this;
        }

        public Criteria andIssysIsNull() {
            addCriterion("issys is null");
            return (Criteria) this;
        }

        public Criteria andIssysIsNotNull() {
            addCriterion("issys is not null");
            return (Criteria) this;
        }

        public Criteria andIssysEqualTo(Boolean value) {
            addCriterion("issys =", value, "issys");
            return (Criteria) this;
        }

        public Criteria andIssysNotEqualTo(Boolean value) {
            addCriterion("issys <>", value, "issys");
            return (Criteria) this;
        }

        public Criteria andIssysGreaterThan(Boolean value) {
            addCriterion("issys >", value, "issys");
            return (Criteria) this;
        }

        public Criteria andIssysGreaterThanOrEqualTo(Boolean value) {
            addCriterion("issys >=", value, "issys");
            return (Criteria) this;
        }

        public Criteria andIssysLessThan(Boolean value) {
            addCriterion("issys <", value, "issys");
            return (Criteria) this;
        }

        public Criteria andIssysLessThanOrEqualTo(Boolean value) {
            addCriterion("issys <=", value, "issys");
            return (Criteria) this;
        }

        public Criteria andIssysIn(List<Boolean> values) {
            addCriterion("issys in", values, "issys");
            return (Criteria) this;
        }

        public Criteria andIssysNotIn(List<Boolean> values) {
            addCriterion("issys not in", values, "issys");
            return (Criteria) this;
        }

        public Criteria andIssysBetween(Boolean value1, Boolean value2) {
            addCriterion("issys between", value1, value2, "issys");
            return (Criteria) this;
        }

        public Criteria andIssysNotBetween(Boolean value1, Boolean value2) {
            addCriterion("issys not between", value1, value2, "issys");
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