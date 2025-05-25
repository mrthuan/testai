package com.tom_roush.pdfbox.pdmodel.interactive.measurement;

import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.pdmodel.common.COSObjectable;

/* loaded from: classes2.dex */
public class PDMeasureDictionary implements COSObjectable {
    public static final String TYPE = "Measure";
    private final COSDictionary measureDictionary;

    public PDMeasureDictionary() {
        this.measureDictionary = new COSDictionary();
        getCOSObject().setName(COSName.TYPE, TYPE);
    }

    public String getSubtype() {
        return getCOSObject().getNameAsString(COSName.SUBTYPE, PDRectlinearMeasureDictionary.SUBTYPE);
    }

    public String getType() {
        return TYPE;
    }

    public void setSubtype(String str) {
        getCOSObject().setName(COSName.SUBTYPE, str);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.common.COSObjectable
    public COSDictionary getCOSObject() {
        return this.measureDictionary;
    }

    public PDMeasureDictionary(COSDictionary cOSDictionary) {
        this.measureDictionary = cOSDictionary;
    }
}
