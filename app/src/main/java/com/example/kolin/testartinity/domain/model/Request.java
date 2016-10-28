package com.example.kolin.testartinity.domain.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by kolin on 27.10.2016.
 */

public class Request implements Serializable {

    @SerializedName("RequestID")
    @Expose
    private String requestID;
    @SerializedName("CreatedAt")
    @Expose
    private String createdAt;
    @SerializedName("CreatedBy")
    @Expose
    private String createdBy;
    @SerializedName("ChangedAt")
    @Expose
    private String changedAt;
    @SerializedName("ChangedBy")
    @Expose
    private String changedBy;
    @SerializedName("RequestNumber")
    @Expose
    private String requestNumber;
    @SerializedName("ExternalRequestNumber")
    @Expose
    private Object externalRequestNumber;
    @SerializedName("ContactContactID")
    @Expose
    private ContactContactID contactContactID;
    @SerializedName("CompanyID")
    @Expose
    private String companyID;
    @SerializedName("RequestedBy")
    @Expose
    private String requestedBy;
    @SerializedName("PreferredFeedbackBy")
    @Expose
    private String preferredFeedbackBy;
    @SerializedName("RequestType")
    @Expose
    private String requestType;
    @SerializedName("Name")
    @Expose
    private String name;
    @SerializedName("Description")
    @Expose
    private String description;
    @SerializedName("SLAReactionTime")
    @Expose
    private String sLAReactionTime;
    @SerializedName("SLARecoveryTime")
    @Expose
    private String sLARecoveryTime;
    @SerializedName("SolutionCode")
    @Expose
    private String solutionCode;
    @SerializedName("SolutionDescription")
    @Expose
    private String solutionDescription;
    @SerializedName("CloseCode")
    @Expose
    private String closeCode;
    @SerializedName("CloseReason")
    @Expose
    private Object closeReason;
    @SerializedName("MarkCode")
    @Expose
    private String markCode;
    @SerializedName("AttachmentsNumber")
    @Expose
    private String attachmentsNumber;
    @SerializedName("Status")
    @Expose
    private String status;
    @SerializedName("ActualReactionTime")
    @Expose
    private String actualReactionTime;
    @SerializedName("ActualRecoveryTime")
    @Expose
    private String actualRecoveryTime;
    @SerializedName("ClosedTime")
    @Expose
    private String closedTime;
    @SerializedName("AssignedSpecificationID")
    @Expose
    private String assignedSpecificationID;
    @SerializedName("OwnerTeamID")
    @Expose
    private String ownerTeamID;
    @SerializedName("MarkComment")
    @Expose
    private String markComment;
    @SerializedName("CauseCode")
    @Expose
    private Object causeCode;
    @SerializedName("Phone")
    @Expose
    private Object phone;
    @SerializedName("Floor")
    @Expose
    private Object floor;
    @SerializedName("Room")
    @Expose
    private Object room;
    @SerializedName("OperatorFailure")
    @Expose
    private String operatorFailure;
    @SerializedName("OperatorFailureReason")
    @Expose
    private Object operatorFailureReason;
    @SerializedName("OperatorFailureComment")
    @Expose
    private Object operatorFailureComment;
    @SerializedName("MarkQuicknessCode")
    @Expose
    private Object markQuicknessCode;
    @SerializedName("SubStatus")
    @Expose
    private Object subStatus;
    @SerializedName("AssignedContactIDText")
    @Expose
    private String assignedContactIDText;
    @SerializedName("AssignedTeamIDText")
    @Expose
    private String assignedTeamIDText;
    @SerializedName("AssignedTeamIDValue")
    @Expose
    private String assignedTeamIDValue;
    @SerializedName("ContactTeamMemberMail")
    @Expose
    private String contactTeamMemberMail;
    @SerializedName("OwnerTeamMemberMail")
    @Expose
    private String ownerTeamMemberMail;
    @SerializedName("OwnerTeamManager")
    @Expose
    private String ownerTeamManager;
    @SerializedName("CreatedByFullName")
    @Expose
    private String createdByFullName;
    @SerializedName("CreatedByEmail")
    @Expose
    private Object createdByEmail;
    @SerializedName("StatusText")
    @Expose
    private String statusText;
    @SerializedName("LocationTZShortName")
    @Expose
    private String locationTZShortName;
    @SerializedName("CovenantorManagerID")
    @Expose
    private String covenantorManagerID;
    @SerializedName("CauseCodeRaw")
    @Expose
    private Object causeCodeRaw;

    public String getRequestID() {
        return requestID;
    }

    public void setRequestID(String requestID) {
        this.requestID = requestID;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getChangedAt() {
        return changedAt;
    }

    public void setChangedAt(String changedAt) {
        this.changedAt = changedAt;
    }

    public String getChangedBy() {
        return changedBy;
    }

    public void setChangedBy(String changedBy) {
        this.changedBy = changedBy;
    }

    public String getRequestNumber() {
        return requestNumber;
    }

    public void setRequestNumber(String requestNumber) {
        this.requestNumber = requestNumber;
    }

    public Object getExternalRequestNumber() {
        return externalRequestNumber;
    }

    public void setExternalRequestNumber(Object externalRequestNumber) {
        this.externalRequestNumber = externalRequestNumber;
    }

    public ContactContactID getContactContactID() {
        return contactContactID;
    }

    public void setContactContactID(ContactContactID contactContactID) {
        this.contactContactID = contactContactID;
    }

    public String getCompanyID() {
        return companyID;
    }

    public void setCompanyID(String companyID) {
        this.companyID = companyID;
    }

    public String getRequestedBy() {
        return requestedBy;
    }

    public void setRequestedBy(String requestedBy) {
        this.requestedBy = requestedBy;
    }

    public String getPreferredFeedbackBy() {
        return preferredFeedbackBy;
    }

    public void setPreferredFeedbackBy(String preferredFeedbackBy) {
        this.preferredFeedbackBy = preferredFeedbackBy;
    }

    public String getRequestType() {
        return requestType;
    }

    public void setRequestType(String requestType) {
        this.requestType = requestType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSLAReactionTime() {
        return sLAReactionTime;
    }

    public void setSLAReactionTime(String sLAReactionTime) {
        this.sLAReactionTime = sLAReactionTime;
    }

    public String getSLARecoveryTime() {
        return sLARecoveryTime;
    }

    public void setSLARecoveryTime(String sLARecoveryTime) {
        this.sLARecoveryTime = sLARecoveryTime;
    }

    public String getSolutionCode() {
        return solutionCode;
    }

    public void setSolutionCode(String solutionCode) {
        this.solutionCode = solutionCode;
    }

    public String getSolutionDescription() {
        return solutionDescription;
    }

    public void setSolutionDescription(String solutionDescription) {
        this.solutionDescription = solutionDescription;
    }

    public String getCloseCode() {
        return closeCode;
    }

    public void setCloseCode(String closeCode) {
        this.closeCode = closeCode;
    }

    public Object getCloseReason() {
        return closeReason;
    }

    public void setCloseReason(Object closeReason) {
        this.closeReason = closeReason;
    }

    public String getMarkCode() {
        return markCode;
    }

    public void setMarkCode(String markCode) {
        this.markCode = markCode;
    }

    public String getAttachmentsNumber() {
        return attachmentsNumber;
    }

    public void setAttachmentsNumber(String attachmentsNumber) {
        this.attachmentsNumber = attachmentsNumber;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getActualReactionTime() {
        return actualReactionTime;
    }

    public void setActualReactionTime(String actualReactionTime) {
        this.actualReactionTime = actualReactionTime;
    }

    public String getActualRecoveryTime() {
        return actualRecoveryTime;
    }

    public void setActualRecoveryTime(String actualRecoveryTime) {
        this.actualRecoveryTime = actualRecoveryTime;
    }

    public String getClosedTime() {
        return closedTime;
    }

    public void setClosedTime(String closedTime) {
        this.closedTime = closedTime;
    }

    public String getAssignedSpecificationID() {
        return assignedSpecificationID;
    }

    public void setAssignedSpecificationID(String assignedSpecificationID) {
        this.assignedSpecificationID = assignedSpecificationID;
    }

    public String getOwnerTeamID() {
        return ownerTeamID;
    }

    public void setOwnerTeamID(String ownerTeamID) {
        this.ownerTeamID = ownerTeamID;
    }

    public String getMarkComment() {
        return markComment;
    }

    public void setMarkComment(String markComment) {
        this.markComment = markComment;
    }

    public Object getCauseCode() {
        return causeCode;
    }

    public void setCauseCode(Object causeCode) {
        this.causeCode = causeCode;
    }

    public Object getPhone() {
        return phone;
    }

    public void setPhone(Object phone) {
        this.phone = phone;
    }

    public Object getFloor() {
        return floor;
    }

    public void setFloor(Object floor) {
        this.floor = floor;
    }

    public Object getRoom() {
        return room;
    }

    public void setRoom(Object room) {
        this.room = room;
    }

    public String getOperatorFailure() {
        return operatorFailure;
    }

    public void setOperatorFailure(String operatorFailure) {
        this.operatorFailure = operatorFailure;
    }

    public Object getOperatorFailureReason() {
        return operatorFailureReason;
    }

    public void setOperatorFailureReason(Object operatorFailureReason) {
        this.operatorFailureReason = operatorFailureReason;
    }

    public Object getOperatorFailureComment() {
        return operatorFailureComment;
    }

    public void setOperatorFailureComment(Object operatorFailureComment) {
        this.operatorFailureComment = operatorFailureComment;
    }

    public Object getMarkQuicknessCode() {
        return markQuicknessCode;
    }


    public void setMarkQuicknessCode(Object markQuicknessCode) {
        this.markQuicknessCode = markQuicknessCode;
    }

    public Object getSubStatus() {
        return subStatus;
    }


    public void setSubStatus(Object subStatus) {
        this.subStatus = subStatus;
    }

    public String getAssignedContactIDText() {
        return assignedContactIDText;
    }

    public void setAssignedContactIDText(String assignedContactIDText) {
        this.assignedContactIDText = assignedContactIDText;
    }

    public String getAssignedTeamIDText() {
        return assignedTeamIDText;
    }

    public void setAssignedTeamIDText(String assignedTeamIDText) {
        this.assignedTeamIDText = assignedTeamIDText;
    }

    public String getAssignedTeamIDValue() {
        return assignedTeamIDValue;
    }

    public void setAssignedTeamIDValue(String assignedTeamIDValue) {
        this.assignedTeamIDValue = assignedTeamIDValue;
    }

    public String getContactTeamMemberMail() {
        return contactTeamMemberMail;
    }

    public void setContactTeamMemberMail(String contactTeamMemberMail) {
        this.contactTeamMemberMail = contactTeamMemberMail;
    }

    public String getOwnerTeamMemberMail() {
        return ownerTeamMemberMail;
    }

    public void setOwnerTeamMemberMail(String ownerTeamMemberMail) {
        this.ownerTeamMemberMail = ownerTeamMemberMail;
    }

    public String getOwnerTeamManager() {
        return ownerTeamManager;
    }

    public void setOwnerTeamManager(String ownerTeamManager) {
        this.ownerTeamManager = ownerTeamManager;
    }

    public String getCreatedByFullName() {
        return createdByFullName;
    }

    public void setCreatedByFullName(String createdByFullName) {
        this.createdByFullName = createdByFullName;
    }

    public Object getCreatedByEmail() {
        return createdByEmail;
    }

    public void setCreatedByEmail(Object createdByEmail) {
        this.createdByEmail = createdByEmail;
    }

    public String getStatusText() {
        return statusText;
    }

    public void setStatusText(String statusText) {
        this.statusText = statusText;
    }

    public String getLocationTZShortName() {
        return locationTZShortName;
    }

    public void setLocationTZShortName(String locationTZShortName) {
        this.locationTZShortName = locationTZShortName;
    }

    public String getCovenantorManagerID() {
        return covenantorManagerID;
    }

    public void setCovenantorManagerID(String covenantorManagerID) {
        this.covenantorManagerID = covenantorManagerID;
    }

    public Object getCauseCodeRaw() {
        return causeCodeRaw;
    }

    public void setCauseCodeRaw(Object causeCodeRaw) {
        this.causeCodeRaw = causeCodeRaw;
    }

    @Override
    public String toString() {
        return "Request{" +
                "requestID='" + requestID + '\n' +
                ", createdAt='" + createdAt + '\n' +
                ", createdBy='" + createdBy + '\n' +
                ", changedAt='" + changedAt + '\n' +
                ", changedBy='" + changedBy + '\n' +
                ", requestNumber='" + requestNumber + '\n' +
                ", externalRequestNumber=" + externalRequestNumber +
                ", contactContactID=" + contactContactID +
                ", companyID='" + companyID + '\n' +
                ", requestedBy='" + requestedBy + '\n' +
                ", preferredFeedbackBy='" + preferredFeedbackBy + '\n' +
                ", requestType='" + requestType + '\n' +
                ", name='" + name + '\n' +
                ", description='" + description + '\n' +
                ", sLAReactionTime='" + sLAReactionTime + '\n' +
                ", sLARecoveryTime='" + sLARecoveryTime + '\n' +
                ", solutionCode='" + solutionCode + '\n' +
                ", solutionDescription='" + solutionDescription + '\n' +
                ", closeCode='" + closeCode + '\n' +
                ", closeReason=" + closeReason +
                ", markCode='" + markCode + '\n' +
                ", attachmentsNumber='" + attachmentsNumber + '\n' +
                ", status='" + status + '\n' +
                ", actualReactionTime='" + actualReactionTime + '\n' +
                ", actualRecoveryTime='" + actualRecoveryTime + '\n' +
                ", closedTime='" + closedTime + '\n' +
                ", assignedSpecificationID='" + assignedSpecificationID + '\n' +
                ", ownerTeamID='" + ownerTeamID + '\n' +
                ", markComment='" + markComment + '\n' +
                ", causeCode=" + causeCode +
                ", phone=" + phone +
                ", floor=" + floor +
                ", room=" + room +
                ", operatorFailure='" + operatorFailure + '\n' +
                ", operatorFailureReason=" + operatorFailureReason +
                ", operatorFailureComment=" + operatorFailureComment +
                ", markQuicknessCode=" + markQuicknessCode +
                ", subStatus=" + subStatus +
                ", assignedContactIDText='" + assignedContactIDText + '\n' +
                ", assignedTeamIDText='" + assignedTeamIDText + '\n' +
                ", assignedTeamIDValue='" + assignedTeamIDValue + '\n' +
                ", contactTeamMemberMail='" + contactTeamMemberMail + '\n' +
                ", ownerTeamMemberMail='" + ownerTeamMemberMail + '\n' +
                ", ownerTeamManager='" + ownerTeamManager + '\n' +
                ", createdByFullName='" + createdByFullName + '\n' +
                ", createdByEmail=" + createdByEmail +
                ", statusText='" + statusText + '\n' +
                ", locationTZShortName='" + locationTZShortName + '\n' +
                ", covenantorManagerID='" + covenantorManagerID + '\n' +
                ", causeCodeRaw=" + causeCodeRaw +
                '}';
    }
}
