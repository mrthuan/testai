package com.tom_roush.pdfbox.pdmodel.common.function;

import com.tom_roush.pdfbox.cos.COSArray;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.pdmodel.common.PDRange;
import java.io.IOException;

/* loaded from: classes2.dex */
public class PDFunctionType3 extends PDFunction {
    private COSArray bounds;
    private float[] boundsValues;
    private COSArray encode;
    private COSArray functions;
    private PDFunction[] functionsArray;

    public PDFunctionType3(COSBase cOSBase) {
        super(cOSBase);
        this.functions = null;
        this.encode = null;
        this.bounds = null;
        this.functionsArray = null;
        this.boundsValues = null;
    }

    private PDRange getEncodeForParameter(int i10) {
        return new PDRange(getEncode(), i10);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.common.function.PDFunction
    public float[] eval(float[] fArr) {
        PDFunction pDFunction;
        float f10;
        float f11 = fArr[0];
        PDRange domainForInput = getDomainForInput(0);
        float clipToRange = clipToRange(f11, domainForInput.getMin(), domainForInput.getMax());
        if (this.functionsArray == null) {
            COSArray functions = getFunctions();
            this.functionsArray = new PDFunction[functions.size()];
            for (int i10 = 0; i10 < functions.size(); i10++) {
                this.functionsArray[i10] = PDFunction.create(functions.getObject(i10));
            }
        }
        PDFunction[] pDFunctionArr = this.functionsArray;
        if (pDFunctionArr.length == 1) {
            pDFunction = pDFunctionArr[0];
            PDRange encodeForParameter = getEncodeForParameter(0);
            f10 = interpolate(clipToRange, domainForInput.getMin(), domainForInput.getMax(), encodeForParameter.getMin(), encodeForParameter.getMax());
        } else {
            if (this.boundsValues == null) {
                this.boundsValues = getBounds().toFloatArray();
            }
            int length = this.boundsValues.length;
            int i11 = length + 2;
            float[] fArr2 = new float[i11];
            fArr2[0] = domainForInput.getMin();
            int i12 = i11 - 1;
            fArr2[i12] = domainForInput.getMax();
            System.arraycopy(this.boundsValues, 0, fArr2, 1, length);
            for (int i13 = 0; i13 < i12; i13++) {
                if (clipToRange >= fArr2[i13]) {
                    int i14 = i13 + 1;
                    float f12 = fArr2[i14];
                    if (clipToRange < f12 || (i13 == i11 - 2 && clipToRange == f12)) {
                        PDFunction pDFunction2 = this.functionsArray[i13];
                        PDRange encodeForParameter2 = getEncodeForParameter(i13);
                        clipToRange = interpolate(clipToRange, fArr2[i13], fArr2[i14], encodeForParameter2.getMin(), encodeForParameter2.getMax());
                        pDFunction = pDFunction2;
                        break;
                    }
                }
            }
            pDFunction = null;
            if (pDFunction != null) {
                f10 = clipToRange;
            } else {
                throw new IOException("partition not found in type 3 function");
            }
        }
        return clipToRange(pDFunction.eval(new float[]{f10}));
    }

    public COSArray getBounds() {
        if (this.bounds == null) {
            this.bounds = (COSArray) getCOSObject().getDictionaryObject(COSName.BOUNDS);
        }
        return this.bounds;
    }

    public COSArray getEncode() {
        if (this.encode == null) {
            this.encode = (COSArray) getCOSObject().getDictionaryObject(COSName.ENCODE);
        }
        return this.encode;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.common.function.PDFunction
    public int getFunctionType() {
        return 3;
    }

    public COSArray getFunctions() {
        if (this.functions == null) {
            this.functions = (COSArray) getCOSObject().getDictionaryObject(COSName.FUNCTIONS);
        }
        return this.functions;
    }
}
