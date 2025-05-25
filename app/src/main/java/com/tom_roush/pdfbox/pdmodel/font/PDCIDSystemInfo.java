package com.tom_roush.pdfbox.pdmodel.font;

import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.pdmodel.common.COSObjectable;

/* loaded from: classes2.dex */
public final class PDCIDSystemInfo implements COSObjectable {
    private final COSDictionary dictionary;

    public PDCIDSystemInfo(String str, String str2, int i10) {
        COSDictionary cOSDictionary = new COSDictionary();
        this.dictionary = cOSDictionary;
        cOSDictionary.setString(COSName.REGISTRY, str);
        cOSDictionary.setString(COSName.ORDERING, str2);
        cOSDictionary.setInt(COSName.SUPPLEMENT, i10);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.common.COSObjectable
    public COSBase getCOSObject() {
        return this.dictionary;
    }

    public String getOrdering() {
        return this.dictionary.getNameAsString(COSName.ORDERING);
    }

    public String getRegistry() {
        return this.dictionary.getNameAsString(COSName.REGISTRY);
    }

    public int getSupplement() {
        return this.dictionary.getInt(COSName.SUPPLEMENT);
    }

    public String toString() {
        return getRegistry() + "-" + getOrdering() + "-" + getSupplement();
    }

    public PDCIDSystemInfo(COSDictionary cOSDictionary) {
        this.dictionary = cOSDictionary;
    }
}
