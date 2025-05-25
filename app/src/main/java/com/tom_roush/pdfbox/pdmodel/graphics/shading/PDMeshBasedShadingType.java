package com.tom_roush.pdfbox.pdmodel.graphics.shading;

import android.graphics.PointF;
import android.graphics.RectF;
import com.tom_roush.harmony.awt.geom.AffineTransform;
import com.tom_roush.harmony.javax.imageio.stream.ImageInputStream;
import com.tom_roush.harmony.javax.imageio.stream.MemoryCacheImageInputStream;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSStream;
import com.tom_roush.pdfbox.pdmodel.common.PDRange;
import com.tom_roush.pdfbox.util.Matrix;
import java.io.EOFException;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
abstract class PDMeshBasedShadingType extends PDShadingType4 {
    public PDMeshBasedShadingType(COSDictionary cOSDictionary) {
        super(cOSDictionary);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v17, types: [com.tom_roush.pdfbox.pdmodel.common.PDRange] */
    /* JADX WARN: Type inference failed for: r3v2, types: [com.tom_roush.harmony.javax.imageio.stream.ImageInputStream] */
    /* JADX WARN: Type inference failed for: r3v8 */
    public final List<Patch> collectPatches(AffineTransform affineTransform, Matrix matrix, int i10) {
        ?? r32;
        MemoryCacheImageInputStream memoryCacheImageInputStream;
        ArrayList arrayList;
        boolean z10;
        MemoryCacheImageInputStream memoryCacheImageInputStream2;
        ArrayList arrayList2;
        boolean z11;
        char c;
        Patch readPatch;
        byte readBits;
        PointF[] pointFArr;
        float[][] flag1Color;
        COSDictionary cOSObject = getCOSObject();
        if (!(cOSObject instanceof COSStream)) {
            return Collections.emptyList();
        }
        boolean z12 = false;
        PDRange decodeForParameter = getDecodeForParameter(0);
        boolean z13 = true;
        PDRange decodeForParameter2 = getDecodeForParameter(1);
        if (Float.compare(decodeForParameter.getMin(), decodeForParameter.getMax()) != 0 && Float.compare(decodeForParameter2.getMin(), decodeForParameter2.getMax()) != 0) {
            int bitsPerFlag = getBitsPerFlag();
            int numberOfColorComponents = getNumberOfColorComponents();
            PDRange[] pDRangeArr = new PDRange[numberOfColorComponents];
            for (int i11 = 0; i11 < numberOfColorComponents; i11++) {
                r32 = getDecodeForParameter(i11 + 2);
                pDRangeArr[i11] = r32;
                if (r32 == 0) {
                    throw new IOException("Range missing in shading /Decode entry");
                }
            }
            ArrayList arrayList3 = new ArrayList();
            long pow = ((long) Math.pow(2.0d, getBitsPerCoordinate())) - 1;
            long pow2 = ((long) Math.pow(2.0d, getBitsPerComponent())) - 1;
            MemoryCacheImageInputStream memoryCacheImageInputStream3 = new MemoryCacheImageInputStream(((COSStream) cOSObject).createInputStream());
            try {
                PointF[] pointFArr2 = new PointF[4];
                char c10 = 2;
                try {
                    try {
                        float[][] fArr = (float[][]) Array.newInstance(Float.TYPE, 2, numberOfColorComponents);
                        byte readBits2 = (byte) (memoryCacheImageInputStream3.readBits(bitsPerFlag) & 3);
                        boolean z14 = false;
                        while (true) {
                            if (!z14) {
                                if (readBits2 == 0) {
                                    z10 = z13;
                                } else {
                                    z10 = z12;
                                }
                                PointF[] pointFArr3 = pointFArr2;
                                PointF[] pointFArr4 = pointFArr2;
                                MemoryCacheImageInputStream memoryCacheImageInputStream4 = memoryCacheImageInputStream3;
                                ArrayList arrayList4 = arrayList3;
                                PDRange[] pDRangeArr2 = pDRangeArr;
                                int i12 = bitsPerFlag;
                                boolean z15 = z12;
                                try {
                                    try {
                                        readPatch = readPatch(memoryCacheImageInputStream3, z10, pointFArr3, fArr, pow, pow2, decodeForParameter, decodeForParameter2, pDRangeArr2, matrix, affineTransform, i10);
                                    } catch (Throwable th2) {
                                        th = th2;
                                        r32 = memoryCacheImageInputStream4;
                                        r32.close();
                                        throw th;
                                    }
                                } catch (EOFException unused) {
                                    memoryCacheImageInputStream2 = memoryCacheImageInputStream4;
                                    arrayList2 = arrayList4;
                                }
                                if (readPatch == null) {
                                    memoryCacheImageInputStream = memoryCacheImageInputStream4;
                                    arrayList = arrayList4;
                                    break;
                                }
                                arrayList2 = arrayList4;
                                try {
                                    arrayList2.add(readPatch);
                                    memoryCacheImageInputStream2 = memoryCacheImageInputStream4;
                                    try {
                                        readBits = (byte) (memoryCacheImageInputStream2.readBits(i12) & 3);
                                    } catch (EOFException unused2) {
                                        z11 = true;
                                        c = 2;
                                        bitsPerFlag = i12;
                                        arrayList3 = arrayList2;
                                        memoryCacheImageInputStream3 = memoryCacheImageInputStream2;
                                        z13 = z11;
                                        z14 = z13;
                                        c10 = c;
                                        pointFArr2 = pointFArr4;
                                        pDRangeArr = pDRangeArr2;
                                        z12 = z15;
                                    }
                                } catch (EOFException unused3) {
                                    memoryCacheImageInputStream2 = memoryCacheImageInputStream4;
                                }
                                if (readBits != 0) {
                                    z11 = true;
                                    if (readBits != 1) {
                                        c = 2;
                                        if (readBits != 2) {
                                            if (readBits == 3) {
                                                try {
                                                    pointFArr = readPatch.getFlag3Edge();
                                                } catch (EOFException unused4) {
                                                    readBits2 = readBits;
                                                }
                                                try {
                                                    flag1Color = readPatch.getFlag3Color();
                                                } catch (EOFException unused5) {
                                                    readBits2 = readBits;
                                                    pointFArr4 = pointFArr;
                                                    bitsPerFlag = i12;
                                                    arrayList3 = arrayList2;
                                                    memoryCacheImageInputStream3 = memoryCacheImageInputStream2;
                                                    z13 = z11;
                                                    z14 = z13;
                                                    c10 = c;
                                                    pointFArr2 = pointFArr4;
                                                    pDRangeArr = pDRangeArr2;
                                                    z12 = z15;
                                                }
                                            }
                                        } else {
                                            pointFArr = readPatch.getFlag2Edge();
                                            flag1Color = readPatch.getFlag2Color();
                                        }
                                    } else {
                                        c = 2;
                                        pointFArr = readPatch.getFlag1Edge();
                                        flag1Color = readPatch.getFlag1Color();
                                    }
                                    fArr = flag1Color;
                                    bitsPerFlag = i12;
                                    arrayList3 = arrayList2;
                                    memoryCacheImageInputStream3 = memoryCacheImageInputStream2;
                                    readBits2 = readBits;
                                    z13 = z11;
                                    c10 = c;
                                    pointFArr2 = pointFArr;
                                    pDRangeArr = pDRangeArr2;
                                    z12 = z15;
                                } else {
                                    z11 = true;
                                    c = 2;
                                }
                                pointFArr = pointFArr4;
                                bitsPerFlag = i12;
                                arrayList3 = arrayList2;
                                memoryCacheImageInputStream3 = memoryCacheImageInputStream2;
                                readBits2 = readBits;
                                z13 = z11;
                                c10 = c;
                                pointFArr2 = pointFArr;
                                pDRangeArr = pDRangeArr2;
                                z12 = z15;
                            } else {
                                memoryCacheImageInputStream = memoryCacheImageInputStream3;
                                arrayList = arrayList3;
                                break;
                            }
                        }
                        memoryCacheImageInputStream.close();
                        return arrayList;
                    } catch (EOFException e10) {
                        e10.getMessage();
                        memoryCacheImageInputStream3.close();
                        return arrayList3;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (Throwable th4) {
                th = th4;
                r32 = memoryCacheImageInputStream3;
            }
        } else {
            return Collections.emptyList();
        }
    }

    public abstract Patch generatePatch(PointF[] pointFArr, float[][] fArr);

    @Override // com.tom_roush.pdfbox.pdmodel.graphics.shading.PDShadingType4, com.tom_roush.pdfbox.pdmodel.graphics.shading.PDTriangleBasedShadingType, com.tom_roush.pdfbox.pdmodel.graphics.shading.PDShading
    public abstract RectF getBounds(AffineTransform affineTransform, Matrix matrix);

    public RectF getBounds(AffineTransform affineTransform, Matrix matrix, int i10) {
        RectF rectF = null;
        for (Patch patch : collectPatches(affineTransform, matrix, i10)) {
            for (ShadedTriangle shadedTriangle : patch.listOfTriangles) {
                if (rectF == null) {
                    PointF pointF = shadedTriangle.corner[0];
                    rectF = new RectF(pointF.x, pointF.y, 0.0f, 0.0f);
                }
                PointF pointF2 = shadedTriangle.corner[0];
                rectF.union(pointF2.x, pointF2.y);
                PointF pointF3 = shadedTriangle.corner[1];
                rectF.union(pointF3.x, pointF3.y);
                PointF pointF4 = shadedTriangle.corner[2];
                rectF.union(pointF4.x, pointF4.y);
            }
        }
        return rectF;
    }

    public Patch readPatch(ImageInputStream imageInputStream, boolean z10, PointF[] pointFArr, float[][] fArr, long j10, long j11, PDRange pDRange, PDRange pDRange2, PDRange[] pDRangeArr, Matrix matrix, AffineTransform affineTransform, int i10) {
        int i11;
        int i12;
        int numberOfColorComponents = getNumberOfColorComponents();
        float[][] fArr2 = (float[][]) Array.newInstance(Float.TYPE, 4, numberOfColorComponents);
        PointF[] pointFArr2 = new PointF[i10];
        if (z10) {
            i12 = 0;
            i11 = 0;
        } else {
            pointFArr2[0] = pointFArr[0];
            pointFArr2[1] = pointFArr[1];
            i11 = 2;
            pointFArr2[2] = pointFArr[2];
            pointFArr2[3] = pointFArr[3];
            for (int i13 = 0; i13 < numberOfColorComponents; i13++) {
                fArr2[0][i13] = fArr[0][i13];
                fArr2[1][i13] = fArr[1][i13];
            }
            i12 = 4;
        }
        while (i12 < i10) {
            try {
                PointF transformPoint = matrix.transformPoint(interpolate((float) imageInputStream.readBits(getBitsPerCoordinate()), j10, pDRange.getMin(), pDRange.getMax()), interpolate((float) imageInputStream.readBits(getBitsPerCoordinate()), j10, pDRange2.getMin(), pDRange2.getMax()));
                affineTransform.transform(transformPoint, transformPoint);
                pointFArr2[i12] = transformPoint;
                i12++;
            } catch (EOFException unused) {
                return null;
            }
        }
        while (i11 < 4) {
            for (int i14 = 0; i14 < numberOfColorComponents; i14++) {
                fArr2[i11][i14] = interpolate((float) imageInputStream.readBits(getBitsPerComponent()), j11, pDRangeArr[i14].getMin(), pDRangeArr[i14].getMax());
            }
            i11++;
        }
        return generatePatch(pointFArr2, fArr2);
    }
}
