package com.example.kolin.testartinity.domain.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by kolin on 27.10.2016.
 */

public class ContactContactID implements Serializable {

        @SerializedName("ContactID")
        @Expose
        private String contactID;
        @SerializedName("JobTitle")
        @Expose
        private String jobTitle;
        @SerializedName("IsVIP")
        @Expose
        private String isVIP;
        @SerializedName("Phone")
        @Expose
        private String phone;
        @SerializedName("Email")
        @Expose
        private String email;
        @SerializedName("UserID")
        @Expose
        private UserID userID;

        public String getContactID() {
            return contactID;
        }

        public void setContactID(String contactID) {
            this.contactID = contactID;
        }

        public String getJobTitle() {
            return jobTitle;
        }

        public void setJobTitle(String jobTitle) {
            this.jobTitle = jobTitle;
        }

        public String getIsVIP() {
            return isVIP;
        }

        public void setIsVIP(String isVIP) {
            this.isVIP = isVIP;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public UserID getUserID() {
            return userID;
        }

        public void setUserID(UserID userID) {
            this.userID = userID;
        }


}
