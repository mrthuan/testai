package com.tom_roush.pdfbox.pdmodel.interactive.measurement;

import com.tom_roush.pdfbox.cos.COSArray;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.pdmodel.common.COSObjectable;
import com.tom_roush.pdfbox.pdmodel.common.PDRectangle;

/* loaded from: classes2.dex */
public class PDViewportDictionary implements COSObjectable {
    public static final String TYPE = "Viewport";
    private final COSDictionary viewportDictionary;

    public PDViewportDictionary() {
        this.viewportDictionary = new COSDictionary();
    }

    public PDRectangle getBBox() {
        COSBase dictionaryObject = getCOSObject().getDictionaryObject(COSName.BBOX);
        if (dictionaryObject instanceof COSArray) {
            return new PDRectangle((COSArray) dictionaryObject);
        }
        return null;
    }

    public PDMeasureDictionary getMeasure() {
        COSBase dictionaryObject = getCOSObject().getDictionaryObject(COSName.MEASURE);
        if (dictionaryObject instanceof COSDictionary) {
            return new PDMeasureDictionary((COSDictionary) dictionaryObject);
        }
        return null;
    }

    public String getName() {
        return getCOSObject().getNameAsString(COSName.NAME);
    }

    public String getType() {
        return TYPE;
    }

    public void setBBox(PDRectangle pDRectangle) {
        getCOSObject().setItem(COSName.BBOX, pDRectangle);
    }

    public void setMeasure(PDMeasureDictionary pDMeasureDictionary) {
        getCOSObject().setItem(COSName.MEASURE, pDMeasureDictionary);
    }

    public void setName(String str) {
        getCOSObject().setName(COSName.NAME, str);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.common.COSObjectable
    public COSDictionary getCOSObject() {
        return this.viewportDictionary;
    }

    public PDViewportDictionary(COSDictionary cOSDictionary) {
        this.viewportDictionary = cOSDictionary;
    }
}
