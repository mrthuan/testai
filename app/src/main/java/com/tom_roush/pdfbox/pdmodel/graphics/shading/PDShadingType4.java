package com.tom_roush.pdfbox.pdmodel.graphics.shading;

import android.graphics.PointF;
import android.graphics.RectF;
import com.tom_roush.harmony.awt.geom.AffineTransform;
import com.tom_roush.harmony.javax.imageio.stream.MemoryCacheImageInputStream;
import com.tom_roush.pdfbox.cos.COSArray;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.cos.COSStream;
import com.tom_roush.pdfbox.pdmodel.common.PDRange;
import com.tom_roush.pdfbox.util.Matrix;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public class PDShadingType4 extends PDTriangleBasedShadingType {
    public PDShadingType4(COSDictionary cOSDictionary) {
        super(cOSDictionary);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.graphics.shading.PDTriangleBasedShadingType
    public List<ShadedTriangle> collectTriangles(AffineTransform affineTransform, Matrix matrix) {
        byte b10;
        MemoryCacheImageInputStream memoryCacheImageInputStream;
        ArrayList arrayList;
        PDRange[] pDRangeArr;
        byte b11;
        Vertex readVertex;
        ArrayList arrayList2;
        char c;
        PointF[] pointFArr;
        float[][] fArr;
        MemoryCacheImageInputStream memoryCacheImageInputStream2;
        PointF pointF;
        char c10;
        float[] fArr2;
        int bitsPerFlag = getBitsPerFlag();
        COSDictionary cOSObject = getCOSObject();
        if (!(cOSObject instanceof COSStream)) {
            return Collections.emptyList();
        }
        char c11 = 0;
        PDRange decodeForParameter = getDecodeForParameter(0);
        byte b12 = 1;
        PDRange decodeForParameter2 = getDecodeForParameter(1);
        if (Float.compare(decodeForParameter.getMin(), decodeForParameter.getMax()) != 0 && Float.compare(decodeForParameter2.getMin(), decodeForParameter2.getMax()) != 0) {
            int numberOfColorComponents = getNumberOfColorComponents();
            PDRange[] pDRangeArr2 = new PDRange[numberOfColorComponents];
            for (int i10 = 0; i10 < numberOfColorComponents; i10++) {
                pDRangeArr2[i10] = getDecodeForParameter(i10 + 2);
            }
            ArrayList arrayList3 = new ArrayList();
            long pow = ((long) Math.pow(2.0d, getBitsPerCoordinate())) - 1;
            long pow2 = ((long) Math.pow(2.0d, getBitsPerComponent())) - 1;
            MemoryCacheImageInputStream memoryCacheImageInputStream3 = new MemoryCacheImageInputStream(((COSStream) cOSObject).createInputStream());
            try {
                try {
                    b10 = (byte) (memoryCacheImageInputStream3.readBits(bitsPerFlag) & 3);
                } catch (EOFException e10) {
                    e10.getMessage();
                    b10 = 0;
                }
                byte b13 = 0;
                while (b13 == 0) {
                    if (b10 != 0) {
                        if (b10 == b12 || b10 == 2) {
                            try {
                                int size = arrayList3.size() - b12;
                                if (size < 0) {
                                    try {
                                        arrayList3.size();
                                    } catch (EOFException unused) {
                                        memoryCacheImageInputStream = memoryCacheImageInputStream3;
                                        arrayList2 = arrayList3;
                                        pDRangeArr = pDRangeArr2;
                                        b11 = b12;
                                        c = c11;
                                        arrayList3 = arrayList2;
                                        c11 = c;
                                        memoryCacheImageInputStream3 = memoryCacheImageInputStream;
                                        b12 = b11;
                                        b13 = b12;
                                        pDRangeArr2 = pDRangeArr;
                                    }
                                } else {
                                    ShadedTriangle shadedTriangle = (ShadedTriangle) arrayList3.get(size);
                                    MemoryCacheImageInputStream memoryCacheImageInputStream4 = memoryCacheImageInputStream3;
                                    ArrayList arrayList4 = arrayList3;
                                    pDRangeArr = pDRangeArr2;
                                    try {
                                        try {
                                            Vertex readVertex2 = readVertex(memoryCacheImageInputStream3, pow, pow2, decodeForParameter, decodeForParameter2, pDRangeArr2, matrix, affineTransform);
                                            PointF[] pointFArr2 = new PointF[3];
                                            if (b10 == 1) {
                                                try {
                                                    try {
                                                        pointF = shadedTriangle.corner[1];
                                                        c10 = 0;
                                                    } catch (EOFException unused2) {
                                                        memoryCacheImageInputStream = memoryCacheImageInputStream4;
                                                        arrayList2 = arrayList4;
                                                        c = 0;
                                                        b11 = 1;
                                                        arrayList3 = arrayList2;
                                                        c11 = c;
                                                        memoryCacheImageInputStream3 = memoryCacheImageInputStream;
                                                        b12 = b11;
                                                        b13 = b12;
                                                        pDRangeArr2 = pDRangeArr;
                                                    }
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                    memoryCacheImageInputStream = memoryCacheImageInputStream4;
                                                    memoryCacheImageInputStream.close();
                                                    throw th;
                                                }
                                            } else {
                                                c10 = 0;
                                                try {
                                                    pointF = shadedTriangle.corner[0];
                                                } catch (EOFException unused3) {
                                                    c = c10;
                                                    memoryCacheImageInputStream = memoryCacheImageInputStream4;
                                                    arrayList2 = arrayList4;
                                                    b11 = 1;
                                                    arrayList3 = arrayList2;
                                                    c11 = c;
                                                    memoryCacheImageInputStream3 = memoryCacheImageInputStream;
                                                    b12 = b11;
                                                    b13 = b12;
                                                    pDRangeArr2 = pDRangeArr;
                                                }
                                            }
                                            pointFArr2[c10] = pointF;
                                            pointFArr2[1] = shadedTriangle.corner[2];
                                            pointFArr2[2] = readVertex2.point;
                                            float[][] fArr3 = new float[3];
                                            if (b10 == 1) {
                                                fArr2 = shadedTriangle.color[1];
                                                c = 0;
                                            } else {
                                                c = 0;
                                                try {
                                                    fArr2 = shadedTriangle.color[0];
                                                } catch (EOFException unused4) {
                                                    memoryCacheImageInputStream = memoryCacheImageInputStream4;
                                                    arrayList2 = arrayList4;
                                                    b11 = 1;
                                                    arrayList3 = arrayList2;
                                                    c11 = c;
                                                    memoryCacheImageInputStream3 = memoryCacheImageInputStream;
                                                    b12 = b11;
                                                    b13 = b12;
                                                    pDRangeArr2 = pDRangeArr;
                                                }
                                            }
                                            fArr3[c] = fArr2;
                                            fArr3[1] = shadedTriangle.color[2];
                                            fArr3[2] = readVertex2.color;
                                            arrayList = arrayList4;
                                            try {
                                                arrayList.add(new ShadedTriangle(pointFArr2, fArr3));
                                                memoryCacheImageInputStream2 = memoryCacheImageInputStream4;
                                                try {
                                                    b10 = (byte) (memoryCacheImageInputStream2.readBits(bitsPerFlag) & 3);
                                                    memoryCacheImageInputStream = memoryCacheImageInputStream2;
                                                    b11 = 1;
                                                    arrayList2 = arrayList;
                                                    c = 0;
                                                } catch (EOFException unused5) {
                                                    memoryCacheImageInputStream = memoryCacheImageInputStream2;
                                                    b11 = 1;
                                                    arrayList2 = arrayList;
                                                    c = 0;
                                                    arrayList3 = arrayList2;
                                                    c11 = c;
                                                    memoryCacheImageInputStream3 = memoryCacheImageInputStream;
                                                    b12 = b11;
                                                    b13 = b12;
                                                    pDRangeArr2 = pDRangeArr;
                                                } catch (Throwable th3) {
                                                    th = th3;
                                                    memoryCacheImageInputStream = memoryCacheImageInputStream2;
                                                    memoryCacheImageInputStream.close();
                                                    throw th;
                                                }
                                            } catch (EOFException unused6) {
                                                b11 = 1;
                                                arrayList2 = arrayList;
                                                memoryCacheImageInputStream = memoryCacheImageInputStream4;
                                                c = 0;
                                                arrayList3 = arrayList2;
                                                c11 = c;
                                                memoryCacheImageInputStream3 = memoryCacheImageInputStream;
                                                b12 = b11;
                                                b13 = b12;
                                                pDRangeArr2 = pDRangeArr;
                                            }
                                        } catch (EOFException unused7) {
                                            memoryCacheImageInputStream = memoryCacheImageInputStream4;
                                            arrayList2 = arrayList4;
                                            c = 0;
                                            b11 = 1;
                                        }
                                    } catch (Throwable th4) {
                                        th = th4;
                                        memoryCacheImageInputStream2 = memoryCacheImageInputStream4;
                                    }
                                }
                            } catch (EOFException unused8) {
                                pDRangeArr = pDRangeArr2;
                                memoryCacheImageInputStream = memoryCacheImageInputStream3;
                                arrayList2 = arrayList3;
                            } catch (Throwable th5) {
                                th = th5;
                                memoryCacheImageInputStream2 = memoryCacheImageInputStream3;
                            }
                        }
                        memoryCacheImageInputStream = memoryCacheImageInputStream3;
                        arrayList2 = arrayList3;
                        pDRangeArr = pDRangeArr2;
                        b11 = b12;
                        c = c11;
                    } else {
                        arrayList = arrayList3;
                        pDRangeArr = pDRangeArr2;
                        MemoryCacheImageInputStream memoryCacheImageInputStream5 = memoryCacheImageInputStream3;
                        memoryCacheImageInputStream = memoryCacheImageInputStream5;
                        b11 = b12;
                        try {
                            try {
                                readVertex = readVertex(memoryCacheImageInputStream5, pow, pow2, decodeForParameter, decodeForParameter2, pDRangeArr, matrix, affineTransform);
                                b10 = (byte) (memoryCacheImageInputStream.readBits(bitsPerFlag) & 3);
                            } catch (EOFException unused9) {
                                arrayList2 = arrayList;
                                c = 0;
                                arrayList3 = arrayList2;
                                c11 = c;
                                memoryCacheImageInputStream3 = memoryCacheImageInputStream;
                                b12 = b11;
                                b13 = b12;
                                pDRangeArr2 = pDRangeArr;
                            }
                            try {
                                Vertex readVertex3 = readVertex(memoryCacheImageInputStream, pow, pow2, decodeForParameter, decodeForParameter2, pDRangeArr, matrix, affineTransform);
                                memoryCacheImageInputStream.readBits(bitsPerFlag);
                                try {
                                    Vertex readVertex4 = readVertex(memoryCacheImageInputStream, pow, pow2, decodeForParameter, decodeForParameter2, pDRangeArr, matrix, affineTransform);
                                    pointFArr = new PointF[3];
                                    try {
                                        pointFArr[0] = readVertex.point;
                                        pointFArr[b11] = readVertex3.point;
                                        pointFArr[2] = readVertex4.point;
                                        fArr = new float[3];
                                        c = 0;
                                    } catch (EOFException unused10) {
                                        c = 0;
                                    }
                                    try {
                                        fArr[0] = readVertex.color;
                                        fArr[b11] = readVertex3.color;
                                        fArr[2] = readVertex4.color;
                                        arrayList2 = arrayList;
                                    } catch (EOFException unused11) {
                                        arrayList2 = arrayList;
                                        b10 = b10;
                                        arrayList3 = arrayList2;
                                        c11 = c;
                                        memoryCacheImageInputStream3 = memoryCacheImageInputStream;
                                        b12 = b11;
                                        b13 = b12;
                                        pDRangeArr2 = pDRangeArr;
                                    }
                                } catch (EOFException unused12) {
                                    arrayList2 = arrayList;
                                    c = 0;
                                }
                                try {
                                    arrayList2.add(new ShadedTriangle(pointFArr, fArr));
                                    b10 = (byte) (memoryCacheImageInputStream.readBits(bitsPerFlag) & 3);
                                } catch (EOFException unused13) {
                                    b10 = b10;
                                    arrayList3 = arrayList2;
                                    c11 = c;
                                    memoryCacheImageInputStream3 = memoryCacheImageInputStream;
                                    b12 = b11;
                                    b13 = b12;
                                    pDRangeArr2 = pDRangeArr;
                                }
                            } catch (EOFException unused14) {
                                arrayList2 = arrayList;
                                c = 0;
                                arrayList3 = arrayList2;
                                c11 = c;
                                memoryCacheImageInputStream3 = memoryCacheImageInputStream;
                                b12 = b11;
                                b13 = b12;
                                pDRangeArr2 = pDRangeArr;
                            }
                        } catch (Throwable th6) {
                            th = th6;
                            memoryCacheImageInputStream.close();
                            throw th;
                        }
                    }
                    arrayList3 = arrayList2;
                    c11 = c;
                    memoryCacheImageInputStream3 = memoryCacheImageInputStream;
                    b12 = b11;
                    pDRangeArr2 = pDRangeArr;
                }
                ArrayList arrayList5 = arrayList3;
                memoryCacheImageInputStream3.close();
                return arrayList5;
            } catch (Throwable th7) {
                th = th7;
                memoryCacheImageInputStream = memoryCacheImageInputStream3;
                memoryCacheImageInputStream.close();
                throw th;
            }
        }
        return Collections.emptyList();
    }

    @Override // com.tom_roush.pdfbox.pdmodel.graphics.shading.PDTriangleBasedShadingType
    public /* bridge */ /* synthetic */ int getBitsPerComponent() {
        return super.getBitsPerComponent();
    }

    @Override // com.tom_roush.pdfbox.pdmodel.graphics.shading.PDTriangleBasedShadingType
    public /* bridge */ /* synthetic */ int getBitsPerCoordinate() {
        return super.getBitsPerCoordinate();
    }

    public int getBitsPerFlag() {
        return getCOSObject().getInt(COSName.BITS_PER_FLAG, -1);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.graphics.shading.PDTriangleBasedShadingType, com.tom_roush.pdfbox.pdmodel.graphics.shading.PDShading
    public /* bridge */ /* synthetic */ RectF getBounds(AffineTransform affineTransform, Matrix matrix) {
        return super.getBounds(affineTransform, matrix);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.graphics.shading.PDTriangleBasedShadingType
    public /* bridge */ /* synthetic */ PDRange getDecodeForParameter(int i10) {
        return super.getDecodeForParameter(i10);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.graphics.shading.PDTriangleBasedShadingType
    public /* bridge */ /* synthetic */ int getNumberOfColorComponents() {
        return super.getNumberOfColorComponents();
    }

    @Override // com.tom_roush.pdfbox.pdmodel.graphics.shading.PDShading
    public int getShadingType() {
        return 4;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.graphics.shading.PDTriangleBasedShadingType
    public /* bridge */ /* synthetic */ void setBitsPerComponent(int i10) {
        super.setBitsPerComponent(i10);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.graphics.shading.PDTriangleBasedShadingType
    public /* bridge */ /* synthetic */ void setBitsPerCoordinate(int i10) {
        super.setBitsPerCoordinate(i10);
    }

    public void setBitsPerFlag(int i10) {
        getCOSObject().setInt(COSName.BITS_PER_FLAG, i10);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.graphics.shading.PDTriangleBasedShadingType
    public /* bridge */ /* synthetic */ void setDecodeValues(COSArray cOSArray) {
        super.setDecodeValues(cOSArray);
    }
}
