/*
 * This file is generated by jOOQ.
*/
package com.jlu.magmalab.dao.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record9;
import org.jooq.Row9;
import org.jooq.impl.UpdatableRecordImpl;

import com.jlu.magmalab.dao.tables.ApplyInfo;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ApplyInfoRecord extends UpdatableRecordImpl<ApplyInfoRecord> implements Record9<String, String, String, String, String, Timestamp, Integer, String, byte[]> {

    private static final long serialVersionUID = 780500639;

    /**
     * Setter for <code>system.apply_info.apply_id</code>. 申请ID
     */
    public void setApplyId(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>system.apply_info.apply_id</code>. 申请ID
     */
    public String getApplyId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>system.apply_info.pro_type</code>. 产品类型
     */
    public void setProType(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>system.apply_info.pro_type</code>. 产品类型
     */
    public String getProType() {
        return (String) get(1);
    }

    /**
     * Setter for <code>system.apply_info.apply_car</code>. 申请车型
     */
    public void setApplyCar(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>system.apply_info.apply_car</code>. 申请车型
     */
    public String getApplyCar() {
        return (String) get(2);
    }

    /**
     * Setter for <code>system.apply_info.apply_user</code>. 申请人
     */
    public void setApplyUser(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>system.apply_info.apply_user</code>. 申请人
     */
    public String getApplyUser() {
        return (String) get(3);
    }

    /**
     * Setter for <code>system.apply_info.loan_val</code>. 贷款金额
     */
    public void setLoanVal(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>system.apply_info.loan_val</code>. 贷款金额
     */
    public String getLoanVal() {
        return (String) get(4);
    }

    /**
     * Setter for <code>system.apply_info.apply_time</code>. 申请时间
     */
    public void setApplyTime(Timestamp value) {
        set(5, value);
    }

    /**
     * Getter for <code>system.apply_info.apply_time</code>. 申请时间
     */
    public Timestamp getApplyTime() {
        return (Timestamp) get(5);
    }

    /**
     * Setter for <code>system.apply_info.status</code>. 状态&gt;0:完成 1:待审批 2:驳回
     */
    public void setStatus(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>system.apply_info.status</code>. 状态&gt;0:完成 1:待审批 2:驳回
     */
    public Integer getStatus() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>system.apply_info.reject_msg</code>. 驳回信息
     */
    public void setRejectMsg(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>system.apply_info.reject_msg</code>. 驳回信息
     */
    public String getRejectMsg() {
        return (String) get(7);
    }

    /**
     * Setter for <code>system.apply_info.data</code>. 数据
     */
    public void setData(byte... value) {
        set(8, value);
    }

    /**
     * Getter for <code>system.apply_info.data</code>. 数据
     */
    public byte[] getData() {
        return (byte[]) get(8);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record9 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<String, String, String, String, String, Timestamp, Integer, String, byte[]> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<String, String, String, String, String, Timestamp, Integer, String, byte[]> valuesRow() {
        return (Row9) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return ApplyInfo.APPLY_INFO.APPLY_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return ApplyInfo.APPLY_INFO.PRO_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return ApplyInfo.APPLY_INFO.APPLY_CAR;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return ApplyInfo.APPLY_INFO.APPLY_USER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return ApplyInfo.APPLY_INFO.LOAN_VAL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field6() {
        return ApplyInfo.APPLY_INFO.APPLY_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field7() {
        return ApplyInfo.APPLY_INFO.STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return ApplyInfo.APPLY_INFO.REJECT_MSG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<byte[]> field9() {
        return ApplyInfo.APPLY_INFO.DATA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getApplyId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getProType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getApplyCar();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getApplyUser();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getLoanVal();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component6() {
        return getApplyTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component7() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getRejectMsg();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public byte[] component9() {
        return getData();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getApplyId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getProType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getApplyCar();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getApplyUser();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getLoanVal();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value6() {
        return getApplyTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value7() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getRejectMsg();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public byte[] value9() {
        return getData();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ApplyInfoRecord value1(String value) {
        setApplyId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ApplyInfoRecord value2(String value) {
        setProType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ApplyInfoRecord value3(String value) {
        setApplyCar(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ApplyInfoRecord value4(String value) {
        setApplyUser(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ApplyInfoRecord value5(String value) {
        setLoanVal(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ApplyInfoRecord value6(Timestamp value) {
        setApplyTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ApplyInfoRecord value7(Integer value) {
        setStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ApplyInfoRecord value8(String value) {
        setRejectMsg(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ApplyInfoRecord value9(byte... value) {
        setData(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ApplyInfoRecord values(String value1, String value2, String value3, String value4, String value5, Timestamp value6, Integer value7, String value8, byte[] value9) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ApplyInfoRecord
     */
    public ApplyInfoRecord() {
        super(ApplyInfo.APPLY_INFO);
    }

    /**
     * Create a detached, initialised ApplyInfoRecord
     */
    public ApplyInfoRecord(String applyId, String proType, String applyCar, String applyUser, String loanVal, Timestamp applyTime, Integer status, String rejectMsg, byte[] data) {
        super(ApplyInfo.APPLY_INFO);

        set(0, applyId);
        set(1, proType);
        set(2, applyCar);
        set(3, applyUser);
        set(4, loanVal);
        set(5, applyTime);
        set(6, status);
        set(7, rejectMsg);
        set(8, data);
    }
}
