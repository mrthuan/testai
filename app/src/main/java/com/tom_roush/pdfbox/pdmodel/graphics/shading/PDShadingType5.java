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
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public class PDShadingType5 extends PDTriangleBasedShadingType {
    public PDShadingType5(COSDictionary cOSDictionary) {
        super(cOSDictionary);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.graphics.shading.PDTriangleBasedShadingType
    public List<ShadedTriangle> collectTriangles(AffineTransform affineTransform, Matrix matrix) {
        COSDictionary cOSObject = getCOSObject();
        if (!(cOSObject instanceof COSStream)) {
            return Collections.emptyList();
        }
        PDRange decodeForParameter = getDecodeForParameter(0);
        PDRange decodeForParameter2 = getDecodeForParameter(1);
        if (Float.compare(decodeForParameter.getMin(), decodeForParameter.getMax()) != 0 && Float.compare(decodeForParameter2.getMin(), decodeForParameter2.getMax()) != 0) {
            int verticesPerRow = getVerticesPerRow();
            int numberOfColorComponents = getNumberOfColorComponents();
            PDRange[] pDRangeArr = new PDRange[numberOfColorComponents];
            for (int i10 = 0; i10 < numberOfColorComponents; i10++) {
                pDRangeArr[i10] = getDecodeForParameter(i10 + 2);
            }
            ArrayList arrayList = new ArrayList();
            long pow = ((long) Math.pow(2.0d, getBitsPerCoordinate())) - 1;
            long pow2 = ((long) Math.pow(2.0d, getBitsPerComponent())) - 1;
            MemoryCacheImageInputStream memoryCacheImageInputStream = new MemoryCacheImageInputStream(((COSStream) cOSObject).createInputStream());
            boolean z10 = false;
            while (!z10) {
                MemoryCacheImageInputStream memoryCacheImageInputStream2 = memoryCacheImageInputStream;
                ArrayList arrayList2 = arrayList;
                PDRange[] pDRangeArr2 = pDRangeArr;
                int i11 = verticesPerRow;
                try {
                    arrayList2.add(readVertex(memoryCacheImageInputStream, pow, pow2, decodeForParameter, decodeForParameter2, pDRangeArr, matrix, affineTransform));
                    arrayList = arrayList2;
                    verticesPerRow = i11;
                    memoryCacheImageInputStream = memoryCacheImageInputStream2;
                    pDRangeArr = pDRangeArr2;
                } catch (EOFException unused) {
                    arrayList = arrayList2;
                    verticesPerRow = i11;
                    memoryCacheImageInputStream = memoryCacheImageInputStream2;
                    pDRangeArr = pDRangeArr2;
                    z10 = true;
                } catch (Throwable th2) {
                    memoryCacheImageInputStream2.close();
                    throw th2;
                }
            }
            ArrayList arrayList3 = arrayList;
            int i12 = verticesPerRow;
            memoryCacheImageInputStream.close();
            int size = arrayList3.size() / i12;
            Vertex[][] vertexArr = (Vertex[][]) Array.newInstance(Vertex.class, size, i12);
            ArrayList arrayList4 = new ArrayList();
            if (size < 2) {
                return arrayList4;
            }
            for (int i13 = 0; i13 < size; i13++) {
                for (int i14 = 0; i14 < i12; i14++) {
                    vertexArr[i13][i14] = (Vertex) arrayList3.get((i13 * i12) + i14);
                }
            }
            PointF[] pointFArr = new PointF[3];
            float[][] fArr = new float[3];
            char c = 1;
            for (int i15 = 0; i15 < size - 1; i15++) {
                int i16 = 0;
                while (i16 < i12 - 1) {
                    pointFArr[0] = vertexArr[i15][i16].point;
                    int i17 = i16 + 1;
                    pointFArr[c] = vertexArr[i15][i17].point;
                    int i18 = i15 + 1;
                    pointFArr[2] = vertexArr[i18][i16].point;
                    fArr[0] = vertexArr[i15][i16].color;
                    fArr[1] = vertexArr[i15][i17].color;
                    fArr[2] = vertexArr[i18][i16].color;
                    arrayList4.add(new ShadedTriangle(pointFArr, fArr));
                    pointFArr[0] = vertexArr[i15][i17].point;
                    pointFArr[1] = vertexArr[i18][i16].point;
                    pointFArr[2] = vertexArr[i18][i17].point;
                    fArr[0] = vertexArr[i15][i17].color;
                    fArr[1] = vertexArr[i18][i16].color;
                    fArr[2] = vertexArr[i18][i17].color;
                    arrayList4.add(new ShadedTriangle(pointFArr, fArr));
                    c = 1;
                    i16 = i17;
                }
            }
            return arrayList4;
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
        return 5;
    }

    public int getVerticesPerRow() {
        return getCOSObject().getInt(COSName.VERTICES_PER_ROW, -1);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.graphics.shading.PDTriangleBasedShadingType
    public /* bridge */ /* synthetic */ void setBitsPerComponent(int i10) {
        super.setBitsPerComponent(i10);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.graphics.shading.PDTriangleBasedShadingType
    public /* bridge */ /* synthetic */ void setBitsPerCoordinate(int i10) {
        super.setBitsPerCoordinate(i10);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.graphics.shading.PDTriangleBasedShadingType
    public /* bridge */ /* synthetic */ void setDecodeValues(COSArray cOSArray) {
        super.setDecodeValues(cOSArray);
    }

    public void setVerticesPerRow(int i10) {
        getCOSObject().setInt(COSName.VERTICES_PER_ROW, i10);
    }
}
