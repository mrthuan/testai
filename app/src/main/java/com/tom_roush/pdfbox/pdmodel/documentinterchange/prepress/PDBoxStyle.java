package com.tom_roush.pdfbox.pdmodel.documentinterchange.prepress;

import com.tom_roush.pdfbox.cos.COSArray;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSInteger;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.pdmodel.common.COSObjectable;
import com.tom_roush.pdfbox.pdmodel.graphics.PDLineDashPattern;
import com.tom_roush.pdfbox.pdmodel.graphics.color.PDColor;
import com.tom_roush.pdfbox.pdmodel.graphics.color.PDDeviceRGB;

/* loaded from: classes2.dex */
public class PDBoxStyle implements COSObjectable {
    public static final String GUIDELINE_STYLE_DASHED = "D";
    public static final String GUIDELINE_STYLE_SOLID = "S";
    private final COSDictionary dictionary;

    public PDBoxStyle() {
        this.dictionary = new COSDictionary();
    }

    public PDColor getGuidelineColor() {
        COSDictionary cOSDictionary = this.dictionary;
        COSName cOSName = COSName.C;
        COSArray cOSArray = (COSArray) cOSDictionary.getDictionaryObject(cOSName);
        if (cOSArray == null) {
            cOSArray = new COSArray();
            COSInteger cOSInteger = COSInteger.ZERO;
            cOSArray.add((COSBase) cOSInteger);
            cOSArray.add((COSBase) cOSInteger);
            cOSArray.add((COSBase) cOSInteger);
            this.dictionary.setItem(cOSName, (COSBase) cOSArray);
        }
        return new PDColor(cOSArray.toFloatArray(), PDDeviceRGB.INSTANCE);
    }

    public String getGuidelineStyle() {
        return this.dictionary.getNameAsString(COSName.S, "S");
    }

    public float getGuidelineWidth() {
        return this.dictionary.getFloat(COSName.W, 1.0f);
    }

    public PDLineDashPattern getLineDashPattern() {
        COSDictionary cOSDictionary = this.dictionary;
        COSName cOSName = COSName.D;
        COSArray cOSArray = (COSArray) cOSDictionary.getDictionaryObject(cOSName);
        if (cOSArray == null) {
            cOSArray = new COSArray();
            cOSArray.add((COSBase) COSInteger.THREE);
            this.dictionary.setItem(cOSName, (COSBase) cOSArray);
        }
        COSArray cOSArray2 = new COSArray();
        cOSArray2.add((COSBase) cOSArray);
        return new PDLineDashPattern(cOSArray2, 0);
    }

    public void setGuideLineColor(PDColor pDColor) {
        COSArray cOSArray;
        if (pDColor != null) {
            cOSArray = pDColor.toCOSArray();
        } else {
            cOSArray = null;
        }
        this.dictionary.setItem(COSName.C, (COSBase) cOSArray);
    }

    public void setGuidelineStyle(String str) {
        this.dictionary.setName(COSName.S, str);
    }

    public void setGuidelineWidth(float f10) {
        this.dictionary.setFloat(COSName.W, f10);
    }

    public void setLineDashPattern(COSArray cOSArray) {
        if (cOSArray == null) {
            cOSArray = null;
        }
        this.dictionary.setItem(COSName.D, (COSBase) cOSArray);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.common.COSObjectable
    public COSDictionary getCOSObject() {
        return this.dictionary;
    }

    public PDBoxStyle(COSDictionary cOSDictionary) {
        this.dictionary = cOSDictionary;
    }
}
