package com.tom_roush.pdfbox.pdmodel.encryption;

/* loaded from: classes2.dex */
public final class StandardProtectionPolicy extends ProtectionPolicy {
    private String ownerPassword;
    private AccessPermission permissions;
    private String userPassword;

    public StandardProtectionPolicy(String str, String str2, AccessPermission accessPermission) {
        this.ownerPassword = str;
        this.userPassword = str2;
        this.permissions = accessPermission;
    }

    public String getOwnerPassword() {
        return this.ownerPassword;
    }

    public AccessPermission getPermissions() {
        return this.permissions;
    }

    public String getUserPassword() {
        return this.userPassword;
    }

    public void setOwnerPassword(String str) {
        this.ownerPassword = str;
    }

    public void setPermissions(AccessPermission accessPermission) {
        this.permissions = accessPermission;
    }

    public void setUserPassword(String str) {
        this.userPassword = str;
    }
}
