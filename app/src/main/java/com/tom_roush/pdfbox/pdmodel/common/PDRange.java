package com.tom_roush.pdfbox.pdmodel.common;

import com.tom_roush.pdfbox.cos.COSArray;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSFloat;
import com.tom_roush.pdfbox.cos.COSNumber;

/* loaded from: classes2.dex */
public class PDRange implements COSObjectable {
    private COSArray rangeArray;
    private int startingIndex;

    public PDRange() {
        COSArray cOSArray = new COSArray();
        this.rangeArray = cOSArray;
        cOSArray.add((COSBase) new COSFloat(0.0f));
        this.rangeArray.add((COSBase) new COSFloat(1.0f));
        this.startingIndex = 0;
    }

    public COSArray getCOSArray() {
        return this.rangeArray;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.common.COSObjectable
    public COSBase getCOSObject() {
        return this.rangeArray;
    }

    public float getMax() {
        return ((COSNumber) this.rangeArray.getObject((this.startingIndex * 2) + 1)).floatValue();
    }

    public float getMin() {
        return ((COSNumber) this.rangeArray.getObject(this.startingIndex * 2)).floatValue();
    }

    public void setMax(float f10) {
        this.rangeArray.set((this.startingIndex * 2) + 1, (COSBase) new COSFloat(f10));
    }

    public void setMin(float f10) {
        this.rangeArray.set(this.startingIndex * 2, (COSBase) new COSFloat(f10));
    }

    public String toString() {
        return "PDRange{" + getMin() + ", " + getMax() + '}';
    }

    public PDRange(COSArray cOSArray) {
        this.rangeArray = cOSArray;
    }

    public PDRange(COSArray cOSArray, int i10) {
        this.rangeArray = cOSArray;
        this.startingIndex = i10;
    }
}
