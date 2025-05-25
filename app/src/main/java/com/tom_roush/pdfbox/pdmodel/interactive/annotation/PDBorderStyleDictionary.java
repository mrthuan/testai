package com.tom_roush.pdfbox.pdmodel.interactive.annotation;

import com.tom_roush.pdfbox.cos.COSArray;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSInteger;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.pdmodel.common.COSObjectable;
import com.tom_roush.pdfbox.pdmodel.graphics.PDLineDashPattern;

/* loaded from: classes2.dex */
public class PDBorderStyleDictionary implements COSObjectable {
    public static final String STYLE_BEVELED = "B";
    public static final String STYLE_DASHED = "D";
    public static final String STYLE_INSET = "I";
    public static final String STYLE_SOLID = "S";
    public static final String STYLE_UNDERLINE = "U";
    private final COSDictionary dictionary;

    public PDBorderStyleDictionary() {
        this.dictionary = new COSDictionary();
    }

    public PDLineDashPattern getDashStyle() {
        COSDictionary cOSObject = getCOSObject();
        COSName cOSName = COSName.D;
        COSArray cOSArray = (COSArray) cOSObject.getDictionaryObject(cOSName);
        if (cOSArray == null) {
            cOSArray = new COSArray();
            cOSArray.add((COSBase) COSInteger.THREE);
            getCOSObject().setItem(cOSName, (COSBase) cOSArray);
        }
        return new PDLineDashPattern(cOSArray, 0);
    }

    public String getStyle() {
        return getCOSObject().getNameAsString(COSName.S, "S");
    }

    public float getWidth() {
        COSDictionary cOSObject = getCOSObject();
        COSName cOSName = COSName.W;
        if (cOSObject.getDictionaryObject(cOSName) instanceof COSName) {
            return 0.0f;
        }
        return getCOSObject().getFloat(cOSName, 1.0f);
    }

    public void setDashStyle(COSArray cOSArray) {
        getCOSObject().setItem(COSName.D, (COSBase) cOSArray);
    }

    public void setStyle(String str) {
        getCOSObject().setName(COSName.S, str);
    }

    public void setWidth(float f10) {
        int i10 = (int) f10;
        if (f10 == i10) {
            getCOSObject().setInt(COSName.W, i10);
        } else {
            getCOSObject().setFloat(COSName.W, f10);
        }
    }

    @Override // com.tom_roush.pdfbox.pdmodel.common.COSObjectable
    public COSDictionary getCOSObject() {
        return this.dictionary;
    }

    public PDBorderStyleDictionary(COSDictionary cOSDictionary) {
        this.dictionary = cOSDictionary;
    }
}
