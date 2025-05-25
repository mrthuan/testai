package com.tom_roush.pdfbox.pdmodel.encryption;

/* loaded from: classes2.dex */
public class AccessPermission {
    private static final int ASSEMBLE_DOCUMENT_BIT = 11;
    private static final int DEFAULT_PERMISSIONS = -4;
    private static final int DEGRADED_PRINT_BIT = 12;
    private static final int EXTRACT_BIT = 5;
    private static final int EXTRACT_FOR_ACCESSIBILITY_BIT = 10;
    private static final int FILL_IN_FORM_BIT = 9;
    private static final int MODIFICATION_BIT = 4;
    private static final int MODIFY_ANNOTATIONS_BIT = 6;
    private static final int PRINT_BIT = 3;
    private int bytes;
    private boolean readOnly;

    public AccessPermission() {
        this.readOnly = false;
        this.bytes = -4;
    }

    public static AccessPermission getOwnerAccessPermission() {
        AccessPermission accessPermission = new AccessPermission();
        accessPermission.setCanAssembleDocument(true);
        accessPermission.setCanExtractContent(true);
        accessPermission.setCanExtractForAccessibility(true);
        accessPermission.setCanFillInForm(true);
        accessPermission.setCanModify(true);
        accessPermission.setCanModifyAnnotations(true);
        accessPermission.setCanPrint(true);
        accessPermission.setCanPrintDegraded(true);
        return accessPermission;
    }

    private boolean isPermissionBitOn(int i10) {
        if (((1 << (i10 - 1)) & this.bytes) != 0) {
            return true;
        }
        return false;
    }

    private boolean setPermissionBit(int i10, boolean z10) {
        int i11;
        int i12 = this.bytes;
        if (z10) {
            i11 = (1 << (i10 - 1)) | i12;
        } else {
            i11 = (~(1 << (i10 - 1))) & i12;
        }
        this.bytes = i11;
        if (((1 << (i10 - 1)) & i11) != 0) {
            return true;
        }
        return false;
    }

    public boolean canAssembleDocument() {
        return isPermissionBitOn(11);
    }

    public boolean canExtractContent() {
        return isPermissionBitOn(5);
    }

    public boolean canExtractForAccessibility() {
        return isPermissionBitOn(10);
    }

    public boolean canFillInForm() {
        return isPermissionBitOn(9);
    }

    public boolean canModify() {
        return isPermissionBitOn(4);
    }

    public boolean canModifyAnnotations() {
        return isPermissionBitOn(6);
    }

    public boolean canPrint() {
        return isPermissionBitOn(3);
    }

    public boolean canPrintDegraded() {
        return isPermissionBitOn(12);
    }

    public int getPermissionBytes() {
        return this.bytes;
    }

    public int getPermissionBytesForPublicKey() {
        setPermissionBit(1, true);
        setPermissionBit(7, false);
        setPermissionBit(8, false);
        for (int i10 = 13; i10 <= 32; i10++) {
            setPermissionBit(i10, false);
        }
        return this.bytes;
    }

    public boolean hasAnyRevision3PermissionSet() {
        if (canFillInForm() || canExtractForAccessibility() || canAssembleDocument()) {
            return true;
        }
        return canPrintDegraded();
    }

    public boolean isOwnerPermission() {
        if (canAssembleDocument() && canExtractContent() && canExtractForAccessibility() && canFillInForm() && canModify() && canModifyAnnotations() && canPrint() && canPrintDegraded()) {
            return true;
        }
        return false;
    }

    public boolean isReadOnly() {
        return this.readOnly;
    }

    public void setCanAssembleDocument(boolean z10) {
        if (!this.readOnly) {
            setPermissionBit(11, z10);
        }
    }

    public void setCanExtractContent(boolean z10) {
        if (!this.readOnly) {
            setPermissionBit(5, z10);
        }
    }

    public void setCanExtractForAccessibility(boolean z10) {
        if (!this.readOnly) {
            setPermissionBit(10, z10);
        }
    }

    public void setCanFillInForm(boolean z10) {
        if (!this.readOnly) {
            setPermissionBit(9, z10);
        }
    }

    public void setCanModify(boolean z10) {
        if (!this.readOnly) {
            setPermissionBit(4, z10);
        }
    }

    public void setCanModifyAnnotations(boolean z10) {
        if (!this.readOnly) {
            setPermissionBit(6, z10);
        }
    }

    public void setCanPrint(boolean z10) {
        if (!this.readOnly) {
            setPermissionBit(3, z10);
        }
    }

    public void setCanPrintDegraded(boolean z10) {
        if (!this.readOnly) {
            setPermissionBit(12, z10);
        }
    }

    public void setReadOnly() {
        this.readOnly = true;
    }

    public AccessPermission(byte[] bArr) {
        this.readOnly = false;
        this.bytes = (bArr[3] & 255) | ((((((0 | (bArr[0] & 255)) << 8) | (bArr[1] & 255)) << 8) | (bArr[2] & 255)) << 8);
    }

    public AccessPermission(int i10) {
        this.readOnly = false;
        this.bytes = i10;
    }
}
