package com.tom_roush.pdfbox.pdmodel.graphics.shading;

import com.tom_roush.pdfbox.cos.COSArray;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSName;

/* loaded from: classes2.dex */
public class PDShadingType2 extends PDShading {
    private COSArray coords;
    private COSArray domain;
    private COSArray extend;

    public PDShadingType2(COSDictionary cOSDictionary) {
        super(cOSDictionary);
        this.coords = null;
        this.domain = null;
        this.extend = null;
    }

    public COSArray getCoords() {
        if (this.coords == null) {
            this.coords = (COSArray) getCOSObject().getDictionaryObject(COSName.COORDS);
        }
        return this.coords;
    }

    public COSArray getDomain() {
        if (this.domain == null) {
            this.domain = (COSArray) getCOSObject().getDictionaryObject(COSName.DOMAIN);
        }
        return this.domain;
    }

    public COSArray getExtend() {
        if (this.extend == null) {
            this.extend = (COSArray) getCOSObject().getDictionaryObject(COSName.EXTEND);
        }
        return this.extend;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.graphics.shading.PDShading
    public int getShadingType() {
        return 2;
    }

    public void setCoords(COSArray cOSArray) {
        this.coords = cOSArray;
        getCOSObject().setItem(COSName.COORDS, (COSBase) cOSArray);
    }

    public void setDomain(COSArray cOSArray) {
        this.domain = cOSArray;
        getCOSObject().setItem(COSName.DOMAIN, (COSBase) cOSArray);
    }

    public void setExtend(COSArray cOSArray) {
        this.extend = cOSArray;
        getCOSObject().setItem(COSName.EXTEND, (COSBase) cOSArray);
    }
}
