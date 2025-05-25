package com.tom_roush.pdfbox.pdmodel.interactive.annotation;

import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.pdmodel.common.COSObjectable;

/* loaded from: classes2.dex */
public class PDBorderEffectDictionary implements COSObjectable {
    public static final String STYLE_CLOUDY = "C";
    public static final String STYLE_SOLID = "S";
    private final COSDictionary dictionary;

    public PDBorderEffectDictionary() {
        this.dictionary = new COSDictionary();
    }

    public float getIntensity() {
        return getCOSObject().getFloat("I", 0.0f);
    }

    public String getStyle() {
        return getCOSObject().getNameAsString("S", "S");
    }

    public void setIntensity(float f10) {
        getCOSObject().setFloat("I", f10);
    }

    public void setStyle(String str) {
        getCOSObject().setName("S", str);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.common.COSObjectable
    public COSDictionary getCOSObject() {
        return this.dictionary;
    }

    public PDBorderEffectDictionary(COSDictionary cOSDictionary) {
        this.dictionary = cOSDictionary;
    }
}
