package com.example.kolin.testartinity.domain.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by kolin on 26.10.2016.
 */

public class Statement implements Serializable {

    @SerializedName("RequestID")
    private String requestID;
    @SerializedName("RequestNumber")
    private String requestNumber;
    @SerializedName("Name")
    private String name;
    @SerializedName("CreatedAt")
    private String createdAt;
    @SerializedName("Priority")
    private String priority;
    @SerializedName("Status")
    private String status;
    @SerializedName("StatusDisplayName")
    private String statusDisplayName;
    @SerializedName("ObjectCode")
    private Integer objectCode;

    public Statement() {
    }

    public String getRequestID() {
        return requestID;
    }

    public void setRequestID(String requestID) {
        this.requestID = requestID;
    }

    public String getRequestNumber() {
        return requestNumber;
    }

    public void setRequestNumber(String requestNumber) {
        this.requestNumber = requestNumber;
    }

    public CharSequence getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public CharSequence getStatusDisplayName() {
        return statusDisplayName;
    }

    public void setStatusDisplayName(String statusDisplayName) {
        this.statusDisplayName = statusDisplayName;
    }

    public Integer getObjectCode() {
        return objectCode;
    }

    public void setObjectCode(Integer objectCode) {
        this.objectCode = objectCode;
    }

}
