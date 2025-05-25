package com.tom_roush.pdfbox.pdmodel.graphics;

import a6.h;
import com.tom_roush.pdfbox.cos.COSArray;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSInteger;
import com.tom_roush.pdfbox.pdmodel.common.COSObjectable;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class PDLineDashPattern implements COSObjectable {
    private final float[] array;
    private final int phase;

    public PDLineDashPattern() {
        this.array = new float[0];
        this.phase = 0;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.common.COSObjectable
    public COSBase getCOSObject() {
        COSArray cOSArray = new COSArray();
        COSArray cOSArray2 = new COSArray();
        cOSArray2.setFloatArray(this.array);
        cOSArray.add((COSBase) cOSArray2);
        cOSArray.add((COSBase) COSInteger.get(this.phase));
        return cOSArray;
    }

    public float[] getDashArray() {
        return (float[]) this.array.clone();
    }

    public int getPhase() {
        return this.phase;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("PDLineDashPattern{array=");
        sb2.append(Arrays.toString(this.array));
        sb2.append(", phase=");
        return h.g(sb2, this.phase, "}");
    }

    public PDLineDashPattern(COSArray cOSArray, int i10) {
        this.array = cOSArray.toFloatArray();
        this.phase = i10;
    }
}
