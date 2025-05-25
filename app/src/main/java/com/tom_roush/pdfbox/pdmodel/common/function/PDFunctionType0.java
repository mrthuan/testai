package com.tom_roush.pdfbox.pdmodel.common.function;

import com.tom_roush.harmony.javax.imageio.stream.MemoryCacheImageInputStream;
import com.tom_roush.pdfbox.cos.COSArray;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSInputStream;
import com.tom_roush.pdfbox.cos.COSInteger;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.pdmodel.common.PDRange;
import java.io.IOException;
import java.lang.reflect.Array;

/* loaded from: classes2.dex */
public class PDFunctionType0 extends PDFunction {
    private COSArray decode;
    private COSArray encode;
    private int[][] samples;
    private COSArray size;

    /* loaded from: classes2.dex */
    public class Rinterpol {

        /* renamed from: in  reason: collision with root package name */
        private final float[] f15988in;
        private final int[] inNext;
        private final int[] inPrev;
        private final int numberOfInputValues;
        private final int numberOfOutputValues;

        public Rinterpol(float[] fArr, int[] iArr, int[] iArr2) {
            this.numberOfOutputValues = PDFunctionType0.this.getNumberOfOutputParameters();
            this.f15988in = fArr;
            this.inPrev = iArr;
            this.inNext = iArr2;
            this.numberOfInputValues = fArr.length;
        }

        private int calcSampleIndex(int[] iArr) {
            float[] floatArray = PDFunctionType0.this.getSize().toFloatArray();
            int length = iArr.length;
            int i10 = 1;
            for (int i11 = length - 2; i11 >= 0; i11--) {
                i10 = (int) (i10 * floatArray[i11]);
            }
            int i12 = 0;
            for (int i13 = length - 1; i13 >= 0; i13--) {
                i12 += iArr[i13] * i10;
                int i14 = i13 - 1;
                if (i14 >= 0) {
                    i10 = (int) (i10 / floatArray[i14]);
                }
            }
            return i12;
        }

        private int[][] getSamples() {
            if (PDFunctionType0.this.samples == null) {
                int numberOfInputParameters = PDFunctionType0.this.getNumberOfInputParameters();
                int numberOfOutputParameters = PDFunctionType0.this.getNumberOfOutputParameters();
                COSArray size = PDFunctionType0.this.getSize();
                int i10 = 1;
                for (int i11 = 0; i11 < numberOfInputParameters; i11++) {
                    i10 *= size.getInt(i11);
                }
                PDFunctionType0.this.samples = (int[][]) Array.newInstance(Integer.TYPE, i10, numberOfOutputParameters);
                int bitsPerSample = PDFunctionType0.this.getBitsPerSample();
                try {
                    COSInputStream createInputStream = PDFunctionType0.this.getPDStream().createInputStream();
                    MemoryCacheImageInputStream memoryCacheImageInputStream = new MemoryCacheImageInputStream(createInputStream);
                    int i12 = 0;
                    for (int i13 = 0; i13 < i10; i13++) {
                        for (int i14 = 0; i14 < numberOfOutputParameters; i14++) {
                            PDFunctionType0.this.samples[i12][i14] = (int) memoryCacheImageInputStream.readBits(bitsPerSample);
                        }
                        i12++;
                    }
                    memoryCacheImageInputStream.close();
                    createInputStream.close();
                } catch (IOException unused) {
                }
            }
            return PDFunctionType0.this.samples;
        }

        private float[] rinterpol(int[] iArr, int i10) {
            float[] fArr = new float[this.numberOfOutputValues];
            int i11 = 0;
            if (i10 == this.f15988in.length - 1) {
                int i12 = this.inPrev[i10];
                if (i12 == this.inNext[i10]) {
                    iArr[i10] = i12;
                    int[] iArr2 = getSamples()[calcSampleIndex(iArr)];
                    while (i11 < this.numberOfOutputValues) {
                        fArr[i11] = iArr2[i11];
                        i11++;
                    }
                    return fArr;
                }
                iArr[i10] = i12;
                int[] iArr3 = getSamples()[calcSampleIndex(iArr)];
                iArr[i10] = this.inNext[i10];
                int[] iArr4 = getSamples()[calcSampleIndex(iArr)];
                while (i11 < this.numberOfOutputValues) {
                    fArr[i11] = PDFunctionType0.this.interpolate(this.f15988in[i10], this.inPrev[i10], this.inNext[i10], iArr3[i11], iArr4[i11]);
                    i11++;
                }
                return fArr;
            }
            int i13 = this.inPrev[i10];
            if (i13 == this.inNext[i10]) {
                iArr[i10] = i13;
                return rinterpol(iArr, i10 + 1);
            }
            iArr[i10] = i13;
            int i14 = i10 + 1;
            float[] rinterpol = rinterpol(iArr, i14);
            iArr[i10] = this.inNext[i10];
            float[] rinterpol2 = rinterpol(iArr, i14);
            while (i11 < this.numberOfOutputValues) {
                fArr[i11] = PDFunctionType0.this.interpolate(this.f15988in[i10], this.inPrev[i10], this.inNext[i10], rinterpol[i11], rinterpol2[i11]);
                i11++;
            }
            return fArr;
        }

        public float[] rinterpolate() {
            return rinterpol(new int[this.numberOfInputValues], 0);
        }
    }

    public PDFunctionType0(COSBase cOSBase) {
        super(cOSBase);
        this.encode = null;
        this.decode = null;
        this.size = null;
        this.samples = null;
    }

    private COSArray getDecodeValues() {
        if (this.decode == null) {
            COSArray cOSArray = (COSArray) getCOSObject().getDictionaryObject(COSName.DECODE);
            this.decode = cOSArray;
            if (cOSArray == null) {
                this.decode = getRangeValues();
            }
        }
        return this.decode;
    }

    private COSArray getEncodeValues() {
        if (this.encode == null) {
            COSArray cOSArray = (COSArray) getCOSObject().getDictionaryObject(COSName.ENCODE);
            this.encode = cOSArray;
            if (cOSArray == null) {
                this.encode = new COSArray();
                COSArray size = getSize();
                int size2 = size.size();
                for (int i10 = 0; i10 < size2; i10++) {
                    this.encode.add((COSBase) COSInteger.ZERO);
                    this.encode.add((COSBase) COSInteger.get(size.getInt(i10) - 1));
                }
            }
        }
        return this.encode;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.common.function.PDFunction
    public float[] eval(float[] fArr) {
        float[] floatArray = getSize().toFloatArray();
        float pow = (float) (Math.pow(2.0d, getBitsPerSample()) - 1.0d);
        int length = fArr.length;
        int numberOfOutputParameters = getNumberOfOutputParameters();
        int[] iArr = new int[length];
        int[] iArr2 = new int[length];
        float[] fArr2 = (float[]) fArr.clone();
        for (int i10 = 0; i10 < length; i10++) {
            PDRange domainForInput = getDomainForInput(i10);
            PDRange encodeForParameter = getEncodeForParameter(i10);
            float clipToRange = clipToRange(fArr2[i10], domainForInput.getMin(), domainForInput.getMax());
            fArr2[i10] = clipToRange;
            float interpolate = interpolate(clipToRange, domainForInput.getMin(), domainForInput.getMax(), encodeForParameter.getMin(), encodeForParameter.getMax());
            fArr2[i10] = interpolate;
            float clipToRange2 = clipToRange(interpolate, 0.0f, floatArray[i10] - 1.0f);
            fArr2[i10] = clipToRange2;
            iArr[i10] = (int) Math.floor(clipToRange2);
            iArr2[i10] = (int) Math.ceil(fArr2[i10]);
        }
        float[] rinterpolate = new Rinterpol(fArr2, iArr, iArr2).rinterpolate();
        for (int i11 = 0; i11 < numberOfOutputParameters; i11++) {
            PDRange rangeForOutput = getRangeForOutput(i11);
            PDRange decodeForParameter = getDecodeForParameter(i11);
            float interpolate2 = interpolate(rinterpolate[i11], 0.0f, pow, decodeForParameter.getMin(), decodeForParameter.getMax());
            rinterpolate[i11] = interpolate2;
            rinterpolate[i11] = clipToRange(interpolate2, rangeForOutput.getMin(), rangeForOutput.getMax());
        }
        return rinterpolate;
    }

    public int getBitsPerSample() {
        return getCOSObject().getInt(COSName.BITS_PER_SAMPLE);
    }

    public PDRange getDecodeForParameter(int i10) {
        COSArray decodeValues = getDecodeValues();
        if (decodeValues != null && decodeValues.size() >= (i10 * 2) + 1) {
            return new PDRange(decodeValues, i10);
        }
        return null;
    }

    public PDRange getEncodeForParameter(int i10) {
        COSArray encodeValues = getEncodeValues();
        if (encodeValues != null && encodeValues.size() >= (i10 * 2) + 1) {
            return new PDRange(encodeValues, i10);
        }
        return null;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.common.function.PDFunction
    public int getFunctionType() {
        return 0;
    }

    public int getOrder() {
        return getCOSObject().getInt(COSName.ORDER, 1);
    }

    public COSArray getSize() {
        if (this.size == null) {
            this.size = (COSArray) getCOSObject().getDictionaryObject(COSName.SIZE);
        }
        return this.size;
    }

    public void setBitsPerSample(int i10) {
        getCOSObject().setInt(COSName.BITS_PER_SAMPLE, i10);
    }

    public void setDecodeValues(COSArray cOSArray) {
        this.decode = cOSArray;
        getCOSObject().setItem(COSName.DECODE, (COSBase) cOSArray);
    }

    public void setEncodeValues(COSArray cOSArray) {
        this.encode = cOSArray;
        getCOSObject().setItem(COSName.ENCODE, (COSBase) cOSArray);
    }
}
