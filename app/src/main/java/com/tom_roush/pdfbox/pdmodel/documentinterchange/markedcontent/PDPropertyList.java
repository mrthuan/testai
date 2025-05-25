package com.tom_roush.pdfbox.pdmodel.documentinterchange.markedcontent;

import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.pdmodel.common.COSObjectable;
import com.tom_roush.pdfbox.pdmodel.graphics.optionalcontent.PDOptionalContentGroup;
import com.tom_roush.pdfbox.pdmodel.graphics.optionalcontent.PDOptionalContentMembershipDictionary;

/* loaded from: classes2.dex */
public class PDPropertyList implements COSObjectable {
    protected final COSDictionary dict;

    public PDPropertyList() {
        this.dict = new COSDictionary();
    }

    public static PDPropertyList create(COSDictionary cOSDictionary) {
        COSName cOSName = COSName.OCG;
        COSName cOSName2 = COSName.TYPE;
        if (cOSName.equals(cOSDictionary.getItem(cOSName2))) {
            return new PDOptionalContentGroup(cOSDictionary);
        }
        if (COSName.OCMD.equals(cOSDictionary.getItem(cOSName2))) {
            return new PDOptionalContentMembershipDictionary(cOSDictionary);
        }
        return new PDPropertyList(cOSDictionary);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.common.COSObjectable
    public COSDictionary getCOSObject() {
        return this.dict;
    }

    public PDPropertyList(COSDictionary cOSDictionary) {
        this.dict = cOSDictionary;
    }
}
