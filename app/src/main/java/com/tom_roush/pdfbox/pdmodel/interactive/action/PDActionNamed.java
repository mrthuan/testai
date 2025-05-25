package com.tom_roush.pdfbox.pdmodel.interactive.action;

import com.tom_roush.pdfbox.cos.COSDictionary;

/* loaded from: classes2.dex */
public class PDActionNamed extends PDAction {
    public static final String SUB_TYPE = "Named";

    public PDActionNamed() {
        setSubType(SUB_TYPE);
    }

    public String getN() {
        return this.action.getNameAsString("N");
    }

    public void setN(String str) {
        this.action.setName("N", str);
    }

    public PDActionNamed(COSDictionary cOSDictionary) {
        super(cOSDictionary);
    }
}
