package com.tom_roush.pdfbox.pdmodel.common.function;

import com.tom_roush.pdfbox.cos.COSArray;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSFloat;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.cos.COSNumber;

/* loaded from: classes2.dex */
public class PDFunctionType2 extends PDFunction {

    /* renamed from: c0  reason: collision with root package name */
    private final COSArray f15989c0;

    /* renamed from: c1  reason: collision with root package name */
    private final COSArray f15990c1;
    private final float exponent;

    public PDFunctionType2(COSBase cOSBase) {
        super(cOSBase);
        COSDictionary cOSObject = getCOSObject();
        COSName cOSName = COSName.C0;
        if (cOSObject.getDictionaryObject(cOSName) instanceof COSArray) {
            this.f15989c0 = (COSArray) getCOSObject().getDictionaryObject(cOSName);
        } else {
            this.f15989c0 = new COSArray();
        }
        if (this.f15989c0.size() == 0) {
            this.f15989c0.add((COSBase) new COSFloat(0.0f));
        }
        COSDictionary cOSObject2 = getCOSObject();
        COSName cOSName2 = COSName.C1;
        if (cOSObject2.getDictionaryObject(cOSName2) instanceof COSArray) {
            this.f15990c1 = (COSArray) getCOSObject().getDictionaryObject(cOSName2);
        } else {
            this.f15990c1 = new COSArray();
        }
        if (this.f15990c1.size() == 0) {
            this.f15990c1.add((COSBase) new COSFloat(1.0f));
        }
        this.exponent = getCOSObject().getFloat(COSName.N);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.common.function.PDFunction
    public float[] eval(float[] fArr) {
        float pow = (float) Math.pow(fArr[0], this.exponent);
        int min = Math.min(this.f15989c0.size(), this.f15990c1.size());
        float[] fArr2 = new float[min];
        for (int i10 = 0; i10 < min; i10++) {
            float floatValue = ((COSNumber) this.f15989c0.get(i10)).floatValue();
            fArr2[i10] = ((((COSNumber) this.f15990c1.get(i10)).floatValue() - floatValue) * pow) + floatValue;
        }
        return clipToRange(fArr2);
    }

    public COSArray getC0() {
        return this.f15989c0;
    }

    public COSArray getC1() {
        return this.f15990c1;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.common.function.PDFunction
    public int getFunctionType() {
        return 2;
    }

    public float getN() {
        return this.exponent;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.common.function.PDFunction
    public String toString() {
        return "FunctionType2{C0: " + getC0() + " C1: " + getC1() + " N: " + getN() + "}";
    }
}
