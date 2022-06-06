package com.example.demo.domain;

import java.util.Date;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Case
 */

@Entity
@Cacheable(true)
@Table(name = "CASES", schema = "NONGPP")
public class CaseEntity implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String id;
	private long version;
	private String PMid;
	private String status;
	private String description;
	private String createdBy;
	private Date createdDate;
	private String updatedBy;
	private Date updatedDate;
	private String branch;
	private String department;
	private String subDepartment;
	private String userHandle;
	private String concern; // dung de check case thuoc dien NonPayment hay Payment
	private String active;
	private String createdByBranch;
	private String createdByDepartment;
	private String createdBySubDepartment;
	private String clearingCode;
	private String msg_key;
	private String type;
	private String userSender;
	private String branchSent;
	private String deptSent;
	private String subDeptSent;
	private String resend;
	private String foreign_exchange = " ";

	public CaseEntity() {
	}

	@Id

	@Column(name = "ID", unique = true, nullable = false, columnDefinition = "VARCHAR2", length = 20)
	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}


	@Column(name = "VERSION", columnDefinition = "NUMBER", precision = 14, scale = 0)
	public long getVersion() {
		return this.version;
	}

	public void setVersion(long version) {
		this.version = version;
	}


	@Column(name = "P_MID", columnDefinition = "VARCHAR2", length = 50)
	public String getPMid() {
		return this.PMid;
	}

	public void setPMid(String PMid) {
		this.PMid = PMid;
	}


	@Column(name = "STATUS", nullable = false, columnDefinition = "VARCHAR2", length = 10)
	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}


	@Column(name = "DESCRIPTION", columnDefinition = "VARCHAR2", length = 4000)
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}


	@Column(name = "CREATED_BY", nullable = false, columnDefinition = "VARCHAR2", length = 255)
	public String getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}


	@Column(name = "CREATED_BY_BRANCH", columnDefinition = "VARCHAR2", length = 20)
	public String getCreatedByBranch() {
		return createdByBranch;
	}

	public void setCreatedByBranch(String createdByBranch) {
		this.createdByBranch = createdByBranch;
	}


	@Column(name = "CREATED_BY_DEPARTMENT", columnDefinition = "VARCHAR2", length = 20)
	public String getCreatedByDepartment() {
		return createdByDepartment;
	}

	public void setCreatedByDepartment(String createdByDepartment) {
		this.createdByDepartment = createdByDepartment;
	}


	@Column(name = "CREATED_BY_SUBDEPARTMENT", columnDefinition = "VARCHAR2", length = 20)
	public String getCreatedBySubDepartment() {
		return createdBySubDepartment;
	}

	public void setCreatedBySubDepartment(String createdBySubDepartment) {
		this.createdBySubDepartment = createdBySubDepartment;
	}


	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATED_DATE", nullable = false, columnDefinition = "TIMESTAMP(6) WITH TIME ZONE")
	public Date getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}


	@Column(name = "UPDATED_BY", columnDefinition = "VARCHAR2", length = 50)
	public String getUpdatedBy() {
		return this.updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "UPDATED_DATE", columnDefinition = "TIMESTAMP(6) WITH TIME ZONE")
	public Date getUpdatedDate() {
		return this.updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

	
	@Column(name = "BRANCH", columnDefinition = "VARCHAR2", length = 20)
	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	
	@Column(name = "DEPARTMENT", columnDefinition = "VARCHAR2", length = 20)
	public String getDepartment() {
		return department;
	}


	@Column(name = "SUBDEPARTMENT", columnDefinition = "VARCHAR2", length = 20)
	public String getSubDepartment() {
		return subDepartment;
	}

	public void setSubDepartment(String subDepartment) {
		this.subDepartment = subDepartment;
	}

	public void setDepartment(String department) {
		this.department = department;
	}


	@Column(name = "USER_HANDLE", columnDefinition = "VARCHAR2", length = 255)
	public String getUserHandle() {
		return userHandle;
	}

	public void setUserHandle(String userHandle) {
		this.userHandle = userHandle;
	}

	
	@Column(name = "CONCERN", columnDefinition = "VARCHAR2", length = 20)
	public String getConcern() {
		return concern;
	}

	public void setConcern(String concern) {
		this.concern = concern;
	}

	
	@Column(name = "USER_SENDER", columnDefinition = "VARCHAR2", length = 50)
	public String getUserSender() {
		return userSender;
	}

	public void setUserSender(String userReceiver) {
		this.userSender = userReceiver;
	}

	
	@Column(name = "ACTIVE", columnDefinition = "VARCHAR2", length = 20)
	public String getActive() {
		return active;
	}

	public void setActive(String active) {
		this.active = active;
	}

	
	@Column(name = "CLEARING_CODE", columnDefinition = "VARCHAR2", length = 50)
	public String getClearingCode() {
		return this.clearingCode;
	}

	public void setClearingCode(String clearingCode) {
		this.clearingCode = clearingCode;
	}

	
	@Column(name = "MSG_KEY", columnDefinition = "VARCHAR2", length = 40)
	public String getMsg_key() {
		return msg_key;
	}

	public void setMsg_key(String msg_key) {
		this.msg_key = msg_key;
	}

	
	@Column(name = "TYPE", columnDefinition = "VARCHAR2", length = 10)
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	
	@Column(name = "RESEND", columnDefinition = "VARCHAR2", length = 10)
	public String getResend() {
		return resend;
	}

	public void setResend(String resend) {
		this.resend = resend;
	}

	@Column(name = "BRANCH_SENT", columnDefinition = "VARCHAR2", length = 20)
	public String getBranchSent() {
		return branchSent;
	}

	public void setBranchSent(String branchSent) {
		this.branchSent = branchSent;
	}

	@Column(name = "DEPARTMENT_SENT", columnDefinition = "VARCHAR2", length = 20)
	public String getDeptSent() {
		return deptSent;
	}

	public void setDeptSent(String deptSent) {
		this.deptSent = deptSent;
	}

	@Column(name = "SUBDEPARTMENT_SENT", columnDefinition = "VARCHAR2", length = 20)
	public String getSubDeptSent() {
		return subDeptSent;
	}

	public void setSubDeptSent(String subDeptSent) {
		this.subDeptSent = subDeptSent;
	}

	@Column(name = "FOREIGN_EXCHANGE", columnDefinition = "VARCHAR2", length = 20)
	public String getForeign_exchange() {
		return foreign_exchange;
	}

	public void setForeign_exchange(String foreign_exchange) {
		this.foreign_exchange = foreign_exchange;
	}

}