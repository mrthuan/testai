package com.tom_roush.pdfbox.pdmodel.encryption;

import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.pdmodel.common.COSObjectable;

/* loaded from: classes2.dex */
public class PDCryptFilterDictionary implements COSObjectable {
    protected COSDictionary cryptFilterDictionary;

    public PDCryptFilterDictionary() {
        this.cryptFilterDictionary = null;
        this.cryptFilterDictionary = new COSDictionary();
    }

    @Deprecated
    public COSDictionary getCOSDictionary() {
        return this.cryptFilterDictionary;
    }

    public COSName getCryptFilterMethod() {
        return (COSName) this.cryptFilterDictionary.getDictionaryObject(COSName.CFM);
    }

    public int getLength() {
        return this.cryptFilterDictionary.getInt(COSName.LENGTH, 40);
    }

    public void setCryptFilterMethod(COSName cOSName) {
        this.cryptFilterDictionary.setItem(COSName.CFM, (COSBase) cOSName);
    }

    public void setLength(int i10) {
        this.cryptFilterDictionary.setInt(COSName.LENGTH, i10);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.common.COSObjectable
    public COSDictionary getCOSObject() {
        return this.cryptFilterDictionary;
    }

    public PDCryptFilterDictionary(COSDictionary cOSDictionary) {
        this.cryptFilterDictionary = cOSDictionary;
    }
}
