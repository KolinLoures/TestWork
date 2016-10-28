package com.example.kolin.testartinity.domain.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by kolin on 27.10.2016.
 */

public class UserID  implements Serializable {
    @SerializedName("UserID")
    @Expose
    private String userID;
    @SerializedName("FullName")
    @Expose
    private String fullName;

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
}
