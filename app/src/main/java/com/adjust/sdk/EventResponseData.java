package com.adjust.sdk;

import com.google.ads.ADRequestList;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class EventResponseData extends ResponseData {
    private String callbackId;
    private String eventToken;
    private String sdkPlatform;

    public EventResponseData(ActivityPackage activityPackage) {
        this.eventToken = activityPackage.getParameters().get("event_token");
        this.callbackId = activityPackage.getParameters().get("event_callback_id");
        this.sdkPlatform = Util.getSdkPrefixPlatform(activityPackage.getClientSdk());
    }

    public AdjustEventFailure getFailureResponseData() {
        JSONObject jSONObject;
        if (this.success) {
            return null;
        }
        AdjustEventFailure adjustEventFailure = new AdjustEventFailure();
        if (ADRequestList.UNITY.equals(this.sdkPlatform)) {
            String str = this.eventToken;
            String str2 = "";
            if (str == null) {
                str = "";
            }
            adjustEventFailure.eventToken = str;
            String str3 = this.message;
            if (str3 == null) {
                str3 = "";
            }
            adjustEventFailure.message = str3;
            String str4 = this.timestamp;
            if (str4 == null) {
                str4 = "";
            }
            adjustEventFailure.timestamp = str4;
            String str5 = this.adid;
            if (str5 == null) {
                str5 = "";
            }
            adjustEventFailure.adid = str5;
            String str6 = this.callbackId;
            if (str6 != null) {
                str2 = str6;
            }
            adjustEventFailure.callbackId = str2;
            adjustEventFailure.willRetry = this.willRetry;
            jSONObject = this.jsonResponse;
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
        } else {
            adjustEventFailure.eventToken = this.eventToken;
            adjustEventFailure.message = this.message;
            adjustEventFailure.timestamp = this.timestamp;
            adjustEventFailure.adid = this.adid;
            adjustEventFailure.callbackId = this.callbackId;
            adjustEventFailure.willRetry = this.willRetry;
            jSONObject = this.jsonResponse;
        }
        adjustEventFailure.jsonResponse = jSONObject;
        return adjustEventFailure;
    }

    public AdjustEventSuccess getSuccessResponseData() {
        JSONObject jSONObject;
        if (!this.success) {
            return null;
        }
        AdjustEventSuccess adjustEventSuccess = new AdjustEventSuccess();
        if (ADRequestList.UNITY.equals(this.sdkPlatform)) {
            String str = this.eventToken;
            String str2 = "";
            if (str == null) {
                str = "";
            }
            adjustEventSuccess.eventToken = str;
            String str3 = this.message;
            if (str3 == null) {
                str3 = "";
            }
            adjustEventSuccess.message = str3;
            String str4 = this.timestamp;
            if (str4 == null) {
                str4 = "";
            }
            adjustEventSuccess.timestamp = str4;
            String str5 = this.adid;
            if (str5 == null) {
                str5 = "";
            }
            adjustEventSuccess.adid = str5;
            String str6 = this.callbackId;
            if (str6 != null) {
                str2 = str6;
            }
            adjustEventSuccess.callbackId = str2;
            jSONObject = this.jsonResponse;
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
        } else {
            adjustEventSuccess.eventToken = this.eventToken;
            adjustEventSuccess.message = this.message;
            adjustEventSuccess.timestamp = this.timestamp;
            adjustEventSuccess.adid = this.adid;
            adjustEventSuccess.callbackId = this.callbackId;
            jSONObject = this.jsonResponse;
        }
        adjustEventSuccess.jsonResponse = jSONObject;
        return adjustEventSuccess;
    }
}
