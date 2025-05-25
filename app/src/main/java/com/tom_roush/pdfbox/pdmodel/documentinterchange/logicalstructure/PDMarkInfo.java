package com.tom_roush.pdfbox.pdmodel.documentinterchange.logicalstructure;

import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.pdmodel.common.COSObjectable;

/* loaded from: classes2.dex */
public class PDMarkInfo implements COSObjectable {
    private final COSDictionary dictionary;

    public PDMarkInfo() {
        this.dictionary = new COSDictionary();
    }

    public boolean isMarked() {
        return this.dictionary.getBoolean("Marked", false);
    }

    public boolean isSuspect() {
        return this.dictionary.getBoolean("Suspects", false);
    }

    public void setMarked(boolean z10) {
        this.dictionary.setBoolean("Marked", z10);
    }

    public void setSuspect(boolean z10) {
        this.dictionary.setBoolean("Suspects", false);
    }

    public void setUserProperties(boolean z10) {
        this.dictionary.setBoolean(PDUserAttributeObject.OWNER_USER_PROPERTIES, z10);
    }

    public boolean usesUserProperties() {
        return this.dictionary.getBoolean(PDUserAttributeObject.OWNER_USER_PROPERTIES, false);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.common.COSObjectable
    public COSDictionary getCOSObject() {
        return this.dictionary;
    }

    public PDMarkInfo(COSDictionary cOSDictionary) {
        this.dictionary = cOSDictionary;
    }
}
