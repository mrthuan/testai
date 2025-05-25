package com.tom_roush.pdfbox.pdmodel.common.function;

import b.a;
import com.tom_roush.pdfbox.cos.COSArray;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.cos.COSObject;
import com.tom_roush.pdfbox.cos.COSStream;
import com.tom_roush.pdfbox.pdmodel.common.COSObjectable;
import com.tom_roush.pdfbox.pdmodel.common.PDRange;
import com.tom_roush.pdfbox.pdmodel.common.PDStream;
import java.io.IOException;

/* loaded from: classes2.dex */
public abstract class PDFunction implements COSObjectable {
    private COSDictionary functionDictionary;
    private PDStream functionStream;
    private COSArray domain = null;
    private COSArray range = null;
    private int numberOfInputValues = -1;
    private int numberOfOutputValues = -1;

    public PDFunction(COSBase cOSBase) {
        this.functionStream = null;
        this.functionDictionary = null;
        if (cOSBase instanceof COSStream) {
            PDStream pDStream = new PDStream((COSStream) cOSBase);
            this.functionStream = pDStream;
            pDStream.getCOSObject().setItem(COSName.TYPE, (COSBase) COSName.FUNCTION);
        } else if (cOSBase instanceof COSDictionary) {
            this.functionDictionary = (COSDictionary) cOSBase;
        }
    }

    public static PDFunction create(COSBase cOSBase) {
        String simpleName;
        if (cOSBase == COSName.IDENTITY) {
            return new PDFunctionTypeIdentity(null);
        }
        if (cOSBase instanceof COSObject) {
            cOSBase = ((COSObject) cOSBase).getObject();
        }
        if (!(cOSBase instanceof COSDictionary)) {
            if (cOSBase == null) {
                simpleName = "(null)";
            } else {
                simpleName = cOSBase.getClass().getSimpleName();
            }
            throw new IOException("Error: Function must be a Dictionary, but is ".concat(simpleName));
        }
        COSDictionary cOSDictionary = (COSDictionary) cOSBase;
        int i10 = cOSDictionary.getInt(COSName.FUNCTION_TYPE);
        if (i10 != 0) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 == 4) {
                        return new PDFunctionType4(cOSDictionary);
                    }
                    throw new IOException(a.c("Error: Unknown function type ", i10));
                }
                return new PDFunctionType3(cOSDictionary);
            }
            return new PDFunctionType2(cOSDictionary);
        }
        return new PDFunctionType0(cOSDictionary);
    }

    private COSArray getDomainValues() {
        if (this.domain == null) {
            this.domain = (COSArray) getCOSObject().getDictionaryObject(COSName.DOMAIN);
        }
        return this.domain;
    }

    public float clipToRange(float f10, float f11, float f12) {
        return f10 < f11 ? f11 : f10 > f12 ? f12 : f10;
    }

    @Deprecated
    public COSArray eval(COSArray cOSArray) {
        float[] eval = eval(cOSArray.toFloatArray());
        COSArray cOSArray2 = new COSArray();
        cOSArray2.setFloatArray(eval);
        return cOSArray2;
    }

    public abstract float[] eval(float[] fArr);

    public PDRange getDomainForInput(int i10) {
        return new PDRange(getDomainValues(), i10);
    }

    public abstract int getFunctionType();

    public int getNumberOfInputParameters() {
        if (this.numberOfInputValues == -1) {
            this.numberOfInputValues = getDomainValues().size() / 2;
        }
        return this.numberOfInputValues;
    }

    public int getNumberOfOutputParameters() {
        if (this.numberOfOutputValues == -1) {
            this.numberOfOutputValues = getRangeValues().size() / 2;
        }
        return this.numberOfOutputValues;
    }

    public PDStream getPDStream() {
        return this.functionStream;
    }

    public PDRange getRangeForOutput(int i10) {
        return new PDRange(getRangeValues(), i10);
    }

    public COSArray getRangeValues() {
        if (this.range == null) {
            this.range = (COSArray) getCOSObject().getDictionaryObject(COSName.RANGE);
        }
        return this.range;
    }

    public float interpolate(float f10, float f11, float f12, float f13, float f14) {
        return (((f14 - f13) * (f10 - f11)) / (f12 - f11)) + f13;
    }

    public void setDomainValues(COSArray cOSArray) {
        this.domain = cOSArray;
        getCOSObject().setItem(COSName.DOMAIN, (COSBase) cOSArray);
    }

    public void setRangeValues(COSArray cOSArray) {
        this.range = cOSArray;
        getCOSObject().setItem(COSName.RANGE, (COSBase) cOSArray);
    }

    public String toString() {
        return "FunctionType" + getFunctionType();
    }

    public float[] clipToRange(float[] fArr) {
        COSArray rangeValues = getRangeValues();
        if (rangeValues == null || rangeValues.size() <= 0) {
            return fArr;
        }
        float[] floatArray = rangeValues.toFloatArray();
        int length = floatArray.length / 2;
        float[] fArr2 = new float[length];
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = i10 << 1;
            fArr2[i10] = clipToRange(fArr[i10], floatArray[i11], floatArray[i11 + 1]);
        }
        return fArr2;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.common.COSObjectable
    public COSDictionary getCOSObject() {
        PDStream pDStream = this.functionStream;
        if (pDStream != null) {
            return pDStream.getCOSObject();
        }
        return this.functionDictionary;
    }
}
