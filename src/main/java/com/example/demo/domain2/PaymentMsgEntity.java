
package com.example.demo.domain2;

import java.util.Date;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;




/**
 * PaymentMsg
 */

@Entity
@Cacheable(true)
@Table(name = "PAYMENT_MSG", schema = "NONGPP")
public class PaymentMsgEntity implements java.io.Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	private String pMid;
	private String msgType;
	private String createdBy;
	private Date createdDate;
	private String updatedBy;
	private Date updatedDate;
	private String sender;
	private String receiver;
	private Double amount;
	private String clearingCode;
	private String status;
	private String origMsg;
	private String caseRefId = " ";
	private String submit;
	private String currency;
	private String tag20;
	private String tag21;
	private String branch = " ";
	private String department;
	private String subDepartment;
	private String active = " ";
	private String ksvApprove = " ";
	private String userHandle;
	private String description;
	private String posting;
	private String tag121;
	private String telexNo;
	private String responseCode;
	private String vcbAppCdChannel;
	private String vcbBrCdChannel;
	private String tellerId;
	private String tellerSeq;
	private String postingEntry;
	private String mor;
	private String type;
	private String resend;
	private String statusRM;
	private String pmidInGPP;
	private String msgTypeOrg;
	private String pmntSrc;
	
	@Id
	@Column(name = "P_MID", unique = true, nullable = false, columnDefinition = "VARCHAR2", length = 20)
	public String getPMid() {
		return this.pMid;
	}

	public void setPMid(String pMid) {
		this.pMid = pMid;
	}


	@Column(name = "MSG_TYPE", nullable = false, columnDefinition = "VARCHAR2", length = 20)
	public String getMsgType() {
		return this.msgType;
	}

	public void setMsgType(String msgType) {
		this.msgType = msgType;
	}

	@Column(name = "CREATED_BY", nullable = false, columnDefinition = "VARCHAR2", length = 255)
	public String getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}


	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATED_DATE", nullable = false, columnDefinition = "TIMESTAMP(6) WITH TIME ZONE")
	public Date getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}


	@Column(name = "UPDATED_BY", columnDefinition = "VARCHAR2", length = 255)
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


	@Column(name = "SENDER", columnDefinition = "VARCHAR2", length = 50)
	public String getSender() {
		return this.sender;
	}

	public void setSender(String sender) {
		this.sender = sender;
	}


	@Column(name = "RECEIVER", columnDefinition = "VARCHAR2", length = 50)
	public String getReceiver() {
		return this.receiver;
	}

	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}


	@Column(name = "AMOUNT", columnDefinition = "NUMBER", precision = 19, scale = 4)
	public Double getAmount() {
		return this.amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}


	@Column(name = "CLEARING_CODE", columnDefinition = "VARCHAR2", length = 50)
	public String getClearingCode() {
		return this.clearingCode;
	}

	public void setClearingCode(String clearingCode) {
		this.clearingCode = clearingCode;
	}


	@Column(name = "STATUS", nullable = false, columnDefinition = "VARCHAR2", length = 50)
	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}


	@Column(name = "ORIG_MSG", nullable = false, columnDefinition = "VARCHAR2", length = 2000)
	public String getOrigMsg() {
		return this.origMsg;
	}

	public void setOrigMsg(String origMsg) {
		this.origMsg = origMsg;
	}


	@Column(name = "CASE_REF_ID", columnDefinition = "VARCHAR2", length = 50)
	public String getCaseRefId() {
		return this.caseRefId;
	}

	public void setCaseRefId(String caseRefId) {
		this.caseRefId = caseRefId;
	}


	@Column(name = "SUBMIT", columnDefinition = "VARCHAR2", length = 20)
	public String getSubmit() {
		return this.submit;
	}

	public void setSubmit(String submit) {
		this.submit = submit;
	}


	@Column(name = "CURRENCY", columnDefinition = "VARCHAR2", length = 20)
	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}


	@Column(name = "TAG20", columnDefinition = "VARCHAR2", length = 50)
	public String getTag20() {
		return tag20;
	}

	public void setTag20(String tag20) {
		this.tag20 = tag20;
	}


	@Column(name = "TAG21", columnDefinition = "VARCHAR2", length = 50)
	public String getTag21() {
		return tag21;
	}

	public void setTag21(String tag21) {
		this.tag21 = tag21;
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

	public void setDepartment(String department) {
		this.department = department;
	}


	@Column(name = "SUBDEPARTMENT", columnDefinition = "VARCHAR2", length = 20)
	public String getSubDepartment() {
		return subDepartment;
	}

	public void setSubDepartment(String subDepartment) {
		this.subDepartment = subDepartment;
	}

	
	@Column(name = "ACTIVE", columnDefinition = "VARCHAR2", length = 20)
	public String getActive() {
		return active;
	}

	public void setActive(String active) {
		this.active = active;
	}

	
	@Column(name = "KSV_APPROVE", columnDefinition = "VARCHAR2", length = 20)
	public String getKsvApprove() {
		return ksvApprove;
	}

	public void setKsvApprove(String ksvApprove) {
		this.ksvApprove = ksvApprove;
	}

	
	@Column(name = "USERHANDLE", columnDefinition = "VARCHAR2", length = 255)
	public String getUserHandle() {
		return userHandle;
	}

	public void setUserHandle(String userHandle) {
		this.userHandle = userHandle;
	}

	
	@Column(name = "DESCRIPTION", columnDefinition = "VARCHAR2", length = 4000)
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	
	@Column(name = "POSTING", columnDefinition = "VARCHAR2", length = 20)
	public String getPosting() {
		return this.posting;
	}

	public void setPosting(String posting) {
		this.posting = posting;
	}

	
	@Column(name = "TAG121", columnDefinition = "VARCHAR2", length = 50)
	public String getTag121() {
		return tag121;
	}

	public void setTag121(String tag121) {
		this.tag121 = tag121;
	}
	
	
	@Column(name = "TELEX_NO", columnDefinition = "VARCHAR2", length = 20)
	public String getTelexNo() {
		return telexNo;
	}

	public void setTelexNo(String telexNo) {
		this.telexNo = telexNo;
	}
	
	
	@Column(name = "RESPONSE_CODE", columnDefinition = "VARCHAR2", length = 20)
	public String getResponseCode() {
		return responseCode;
	}

	public void setResponseCode(String responseCode) {
		this.responseCode = responseCode;
	}
	
	
	@Column(name = "VCB_BR_CD_CHANNEL", columnDefinition = "VARCHAR2", length = 20)
	public String getVcbBrCdChannel() {
		return vcbBrCdChannel;
	}

	public void setVcbBrCdChannel(String vcbBrCdChannel) {
		this.vcbBrCdChannel = vcbBrCdChannel;
	}
	
	
	@Column(name = "VCB_APP_CD_CHANNEL", columnDefinition = "VARCHAR2", length = 20)
	public String getVcbAppCdChannel() {
		return vcbAppCdChannel;
	}

	public void setVcbAppCdChannel(String vcbAppCdChannel) {
		this.vcbAppCdChannel = vcbAppCdChannel;
	}
	
	
	@Column(name = "MOR", columnDefinition = "VARCHAR2", length = 50)
	public String getMor() {
		return this.mor;
	}

	public void setMor(final String mor) {
		this.mor = mor;
	}
	
	
	@Column(name = "TELLER_ID", columnDefinition = "VARCHAR2", length = 20)
	public String getTellerId()
	{
		return this.tellerId;
	}
	
	public void setTellerId(String tellerId)
	{
		this.tellerId = tellerId;
	}
	
	
	@Column(name = "TELLER_SEQ", columnDefinition = "VARCHAR2", length = 20)
	public String getTellerSeq()
	{
		return this.tellerSeq;
	}
	
	public void setTellerSeq(String tellerSeq)
	{
		this.tellerSeq = tellerSeq;
	}
	
	
	@Column(name = "POSTING_ENTRY", columnDefinition = "VARCHAR2", length = 100)
	public String getPostingEntry()
	{
		return this.postingEntry;
	}
	
	public void setPostingEntry(String postingEntry)
	{
		this.postingEntry = postingEntry;
	}

	
	@Column(name = "TYPE", columnDefinition = "VARCHAR2", length = 20)
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
	
	
	@Column(name = "STATUS_RM", columnDefinition = "VARCHAR2", length = 20)
	public String getStatusRM()
	{
		return this.statusRM;
	}

	public void setStatusRM(final String statusRM)
	{
		this.statusRM = statusRM;
	}

	
	@Column(name = "PMID_IN_GPP", columnDefinition = "VARCHAR2", length = 20)
	public String getPmidInGPP() {
		return pmidInGPP;
	}

	public void setPmidInGPP(String pmidInGPP) {
		this.pmidInGPP = pmidInGPP;
	}

	@Column(name = "MSG_TYPE_ORG", columnDefinition = "VARCHAR2", length = 100)
	public String getMsgTypeOrg() {
		return msgTypeOrg;
	}

	public void setMsgTypeOrg(String msgTypeOrg) {
		this.msgTypeOrg = msgTypeOrg;
	}

	
	@Column(name = "PMNT_SRC", columnDefinition = "VARCHAR2", length = 30)
	public String getPmntSrc() {
		return pmntSrc;
	}

	public void setPmntSrc(String pmntSrc) {
		this.pmntSrc = pmntSrc;
	}
	
	
}
