package com.adjust.sdk;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamField;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes.dex */
public class ActivityPackage implements Serializable {
    private static final ObjectStreamField[] serialPersistentFields;
    private static final long serialVersionUID = -35935556512024097L;
    private ActivityKind activityKind;
    private Map<String, String> callbackParameters;
    private long clickTimeInMilliseconds;
    private long clickTimeInSeconds;
    private long clickTimeServerInSeconds;
    private String clientSdk;
    private int firstErrorCode;
    private Boolean googlePlayInstant;
    private transient int hashCode;
    private long installBeginTimeInSeconds;
    private long installBeginTimeServerInSeconds;
    private String installVersion;
    private Boolean isClick;
    private int lastErrorCode;
    private Map<String, String> parameters;
    private Map<String, String> partnerParameters;
    private String path;
    private OnPurchaseVerificationFinishedListener purchaseVerificationCallback;
    private int retries;
    private int retryCount;
    private String suffix;
    private double waitBeforeSendTimeSeconds;

    static {
        Class cls = Integer.TYPE;
        serialPersistentFields = new ObjectStreamField[]{new ObjectStreamField("path", String.class), new ObjectStreamField("clientSdk", String.class), new ObjectStreamField("parameters", Map.class), new ObjectStreamField("activityKind", ActivityKind.class), new ObjectStreamField("suffix", String.class), new ObjectStreamField("callbackParameters", Map.class), new ObjectStreamField("partnerParameters", Map.class), new ObjectStreamField("retryCount", cls), new ObjectStreamField("firstErrorCode", cls), new ObjectStreamField("lastErrorCode", cls), new ObjectStreamField("waitBeforeSendTimeSeconds", Double.TYPE)};
    }

    public ActivityPackage(ActivityKind activityKind) {
        ActivityKind activityKind2 = ActivityKind.UNKNOWN;
        this.activityKind = activityKind;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        ObjectInputStream.GetField readFields = objectInputStream.readFields();
        this.path = Util.readStringField(readFields, "path", null);
        this.clientSdk = Util.readStringField(readFields, "clientSdk", null);
        this.parameters = (Map) Util.readObjectField(readFields, "parameters", null);
        this.activityKind = (ActivityKind) Util.readObjectField(readFields, "activityKind", ActivityKind.UNKNOWN);
        this.suffix = Util.readStringField(readFields, "suffix", null);
        this.callbackParameters = (Map) Util.readObjectField(readFields, "callbackParameters", null);
        this.partnerParameters = (Map) Util.readObjectField(readFields, "partnerParameters", null);
        this.retryCount = Util.readIntField(readFields, "errorCount", 0);
        this.firstErrorCode = Util.readIntField(readFields, "firstErrorCode", 0);
        this.lastErrorCode = Util.readIntField(readFields, "lastErrorCode", 0);
        this.waitBeforeSendTimeSeconds = Util.readDoubleField(readFields, "waitBeforeSendTimeSeconds", 0.0d);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
    }

    public void addError(int i10) {
        this.retryCount++;
        if (this.firstErrorCode == 0) {
            this.firstErrorCode = i10;
        } else {
            this.lastErrorCode = i10;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ActivityPackage activityPackage = (ActivityPackage) obj;
        if (Util.equalString(this.path, activityPackage.path) && Util.equalString(this.clientSdk, activityPackage.clientSdk) && Util.equalObject(this.parameters, activityPackage.parameters) && Util.equalEnum(this.activityKind, activityPackage.activityKind) && Util.equalString(this.suffix, activityPackage.suffix) && Util.equalObject(this.callbackParameters, activityPackage.callbackParameters) && Util.equalObject(this.partnerParameters, activityPackage.partnerParameters) && Util.equalInt(Integer.valueOf(this.retryCount), Integer.valueOf(activityPackage.retryCount)) && Util.equalInt(Integer.valueOf(this.firstErrorCode), Integer.valueOf(activityPackage.firstErrorCode)) && Util.equalInt(Integer.valueOf(this.lastErrorCode), Integer.valueOf(activityPackage.lastErrorCode)) && Util.equalsDouble(Double.valueOf(this.waitBeforeSendTimeSeconds), Double.valueOf(activityPackage.waitBeforeSendTimeSeconds))) {
            return true;
        }
        return false;
    }

    public ActivityKind getActivityKind() {
        return this.activityKind;
    }

    public Map<String, String> getCallbackParameters() {
        return this.callbackParameters;
    }

    public long getClickTimeInMilliseconds() {
        return this.clickTimeInMilliseconds;
    }

    public long getClickTimeInSeconds() {
        return this.clickTimeInSeconds;
    }

    public long getClickTimeServerInSeconds() {
        return this.clickTimeServerInSeconds;
    }

    public String getClientSdk() {
        return this.clientSdk;
    }

    public String getExtendedString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(Util.formatString("Path:      %s\n", this.path));
        sb2.append(Util.formatString("ClientSdk: %s\n", this.clientSdk));
        if (this.parameters != null) {
            sb2.append("Parameters:");
            TreeMap treeMap = new TreeMap(this.parameters);
            List asList = Arrays.asList("app_secret", "secret_id", "adj_signing_id");
            for (Map.Entry entry : treeMap.entrySet()) {
                String str = (String) entry.getKey();
                if (!asList.contains(str)) {
                    sb2.append(Util.formatString("\n\t%-16s %s", str, entry.getValue()));
                }
            }
        }
        return sb2.toString();
    }

    public String getFailureMessage() {
        return Util.formatString("Failed to track %s%s", this.activityKind.toString(), this.suffix);
    }

    public int getFirstErrorCode() {
        return this.firstErrorCode;
    }

    public Boolean getGooglePlayInstant() {
        return this.googlePlayInstant;
    }

    public long getInstallBeginTimeInSeconds() {
        return this.installBeginTimeInSeconds;
    }

    public long getInstallBeginTimeServerInSeconds() {
        return this.installBeginTimeServerInSeconds;
    }

    public String getInstallVersion() {
        return this.installVersion;
    }

    public Boolean getIsClick() {
        return this.isClick;
    }

    public int getLastErrorCode() {
        return this.lastErrorCode;
    }

    public Map<String, String> getParameters() {
        return this.parameters;
    }

    public Map<String, String> getPartnerParameters() {
        return this.partnerParameters;
    }

    public String getPath() {
        return this.path;
    }

    public OnPurchaseVerificationFinishedListener getPurchaseVerificationCallback() {
        return this.purchaseVerificationCallback;
    }

    public int getRetries() {
        return this.retries;
    }

    public int getRetryCount() {
        return this.retryCount;
    }

    public String getSuffix() {
        return this.suffix;
    }

    public double getWaitBeforeSendTimeSeconds() {
        return this.waitBeforeSendTimeSeconds;
    }

    public int hashCode() {
        if (this.hashCode == 0) {
            this.hashCode = 17;
            int hashString = Util.hashString(this.path, 17);
            this.hashCode = hashString;
            int hashString2 = Util.hashString(this.clientSdk, hashString);
            this.hashCode = hashString2;
            int hashObject = Util.hashObject(this.parameters, hashString2);
            this.hashCode = hashObject;
            int hashEnum = Util.hashEnum(this.activityKind, hashObject);
            this.hashCode = hashEnum;
            int hashString3 = Util.hashString(this.suffix, hashEnum);
            this.hashCode = hashString3;
            int hashObject2 = Util.hashObject(this.callbackParameters, hashString3);
            this.hashCode = hashObject2;
            this.hashCode = (((((Util.hashObject(this.partnerParameters, hashObject2) * 37) + this.retryCount) * 37) + this.firstErrorCode) * 37) + this.lastErrorCode;
            this.hashCode = Util.hashDouble(Double.valueOf(this.waitBeforeSendTimeSeconds), this.hashCode);
        }
        return this.hashCode;
    }

    public int increaseRetries() {
        int i10 = this.retries + 1;
        this.retries = i10;
        return i10;
    }

    public void setCallbackParameters(Map<String, String> map) {
        this.callbackParameters = map;
    }

    public void setClickTimeInMilliseconds(long j10) {
        this.clickTimeInMilliseconds = j10;
    }

    public void setClickTimeInSeconds(long j10) {
        this.clickTimeInSeconds = j10;
    }

    public void setClickTimeServerInSeconds(long j10) {
        this.clickTimeServerInSeconds = j10;
    }

    public void setClientSdk(String str) {
        this.clientSdk = str;
    }

    public void setGooglePlayInstant(Boolean bool) {
        this.googlePlayInstant = bool;
    }

    public void setInstallBeginTimeInSeconds(long j10) {
        this.installBeginTimeInSeconds = j10;
    }

    public void setInstallBeginTimeServerInSeconds(long j10) {
        this.installBeginTimeServerInSeconds = j10;
    }

    public void setInstallVersion(String str) {
        this.installVersion = str;
    }

    public void setIsClick(Boolean bool) {
        this.isClick = bool;
    }

    public void setParameters(Map<String, String> map) {
        this.parameters = map;
    }

    public void setPartnerParameters(Map<String, String> map) {
        this.partnerParameters = map;
    }

    public void setPath(String str) {
        this.path = str;
    }

    public void setPurchaseVerificationCallback(OnPurchaseVerificationFinishedListener onPurchaseVerificationFinishedListener) {
        this.purchaseVerificationCallback = onPurchaseVerificationFinishedListener;
    }

    public void setSuffix(String str) {
        this.suffix = str;
    }

    public void setWaitBeforeSendTimeSeconds(double d10) {
        this.waitBeforeSendTimeSeconds = d10;
    }

    public String toString() {
        return Util.formatString("%s%s", this.activityKind.toString(), this.suffix);
    }
}
