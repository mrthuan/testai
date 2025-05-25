package com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf;

import com.tom_roush.pdfbox.cos.COSDictionary;

/* loaded from: classes2.dex */
public class PDPrintFieldAttributeObject extends PDStandardAttributeObject {
    private static final String CHECKED = "checked";
    public static final String CHECKED_STATE_NEUTRAL = "neutral";
    public static final String CHECKED_STATE_OFF = "off";
    public static final String CHECKED_STATE_ON = "on";
    private static final String DESC = "Desc";
    public static final String OWNER_PRINT_FIELD = "PrintField";
    private static final String ROLE = "Role";
    public static final String ROLE_CB = "cb";
    public static final String ROLE_PB = "pb";
    public static final String ROLE_RB = "rb";
    public static final String ROLE_TV = "tv";

    public PDPrintFieldAttributeObject() {
        setOwner(OWNER_PRINT_FIELD);
    }

    public String getAlternateName() {
        return getString(DESC);
    }

    public String getCheckedState() {
        return getName(CHECKED, CHECKED_STATE_OFF);
    }

    public String getRole() {
        return getName(ROLE);
    }

    public void setAlternateName(String str) {
        setString(DESC, str);
    }

    public void setCheckedState(String str) {
        setName(CHECKED, str);
    }

    public void setRole(String str) {
        setName(ROLE, str);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.documentinterchange.logicalstructure.PDAttributeObject
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        if (isSpecified(ROLE)) {
            sb2.append(", Role=");
            sb2.append(getRole());
        }
        if (isSpecified(CHECKED)) {
            sb2.append(", Checked=");
            sb2.append(getCheckedState());
        }
        if (isSpecified(DESC)) {
            sb2.append(", Desc=");
            sb2.append(getAlternateName());
        }
        return sb2.toString();
    }

    public PDPrintFieldAttributeObject(COSDictionary cOSDictionary) {
        super(cOSDictionary);
    }
}
