package com.tom_roush.pdfbox.pdmodel.graphics.color;

import com.tom_roush.pdfbox.cos.COSArray;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSFloat;
import com.tom_roush.pdfbox.cos.COSNumber;
import com.tom_roush.pdfbox.pdmodel.common.COSObjectable;

/* loaded from: classes2.dex */
public final class PDGamma implements COSObjectable {
    private COSArray values;

    public PDGamma() {
        this.values = null;
        COSArray cOSArray = new COSArray();
        this.values = cOSArray;
        cOSArray.add((COSBase) new COSFloat(0.0f));
        this.values.add((COSBase) new COSFloat(0.0f));
        this.values.add((COSBase) new COSFloat(0.0f));
    }

    public float getB() {
        return ((COSNumber) this.values.get(2)).floatValue();
    }

    public COSArray getCOSArray() {
        return this.values;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.common.COSObjectable
    public COSBase getCOSObject() {
        return this.values;
    }

    public float getG() {
        return ((COSNumber) this.values.get(1)).floatValue();
    }

    public float getR() {
        return ((COSNumber) this.values.get(0)).floatValue();
    }

    public void setB(float f10) {
        this.values.set(2, (COSBase) new COSFloat(f10));
    }

    public void setG(float f10) {
        this.values.set(1, (COSBase) new COSFloat(f10));
    }

    public void setR(float f10) {
        this.values.set(0, (COSBase) new COSFloat(f10));
    }

    public PDGamma(COSArray cOSArray) {
        this.values = cOSArray;
    }
}
