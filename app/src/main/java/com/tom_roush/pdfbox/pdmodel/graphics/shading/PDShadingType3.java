package com.tom_roush.pdfbox.pdmodel.graphics.shading;

import com.tom_roush.pdfbox.cos.COSDictionary;

/* loaded from: classes2.dex */
public class PDShadingType3 extends PDShadingType2 {
    public PDShadingType3(COSDictionary cOSDictionary) {
        super(cOSDictionary);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.graphics.shading.PDShadingType2, com.tom_roush.pdfbox.pdmodel.graphics.shading.PDShading
    public int getShadingType() {
        return 3;
    }
}
