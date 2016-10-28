package com.example.kolin.testartinity.domain.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by kolin on 27.10.2016.
 */

public class RequestID implements Serializable {


    @SerializedName("Request")
    @Expose
    private Request request;
    @SerializedName("ObjectCode")
    @Expose
    private Integer objectCode;

    /**
     * @return The request
     */
    public Request getRequest() {
        return request;
    }

    /**
     * @param request The Request
     */
    public void setRequest(Request request) {
        this.request = request;
    }

    /**
     * @return The objectCode
     */
    public Integer getObjectCode() {
        return objectCode;
    }

    /**
     * @param objectCode The ObjectCode
     */
    public void setObjectCode(Integer objectCode) {
        this.objectCode = objectCode;
    }


}
