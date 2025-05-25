package com.tom_roush.pdfbox.pdmodel.graphics.color;

import com.tom_roush.pdfbox.cos.COSArray;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSFloat;
import com.tom_roush.pdfbox.cos.COSNumber;
import com.tom_roush.pdfbox.pdmodel.common.COSObjectable;

/* loaded from: classes2.dex */
public final class PDTristimulus implements COSObjectable {
    private COSArray values;

    public PDTristimulus() {
        this.values = null;
        COSArray cOSArray = new COSArray();
        this.values = cOSArray;
        cOSArray.add((COSBase) new COSFloat(0.0f));
        this.values.add((COSBase) new COSFloat(0.0f));
        this.values.add((COSBase) new COSFloat(0.0f));
    }

    @Override // com.tom_roush.pdfbox.pdmodel.common.COSObjectable
    public COSBase getCOSObject() {
        return this.values;
    }

    public float getX() {
        return ((COSNumber) this.values.get(0)).floatValue();
    }

    public float getY() {
        return ((COSNumber) this.values.get(1)).floatValue();
    }

    public float getZ() {
        return ((COSNumber) this.values.get(2)).floatValue();
    }

    public void setX(float f10) {
        this.values.set(0, (COSBase) new COSFloat(f10));
    }

    public void setY(float f10) {
        this.values.set(1, (COSBase) new COSFloat(f10));
    }

    public void setZ(float f10) {
        this.values.set(2, (COSBase) new COSFloat(f10));
    }

    public PDTristimulus(COSArray cOSArray) {
        this.values = cOSArray;
    }

    public PDTristimulus(float[] fArr) {
        this.values = null;
        this.values = new COSArray();
        for (int i10 = 0; i10 < fArr.length && i10 < 3; i10++) {
            this.values.add((COSBase) new COSFloat(fArr[i10]));
        }
    }
}
