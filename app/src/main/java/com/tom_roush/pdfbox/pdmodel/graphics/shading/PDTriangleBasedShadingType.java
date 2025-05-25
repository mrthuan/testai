package com.tom_roush.pdfbox.pdmodel.graphics.shading;

import android.graphics.PointF;
import android.graphics.RectF;
import com.tom_roush.harmony.awt.geom.AffineTransform;
import com.tom_roush.harmony.javax.imageio.stream.ImageInputStream;
import com.tom_roush.pdfbox.cos.COSArray;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.pdmodel.common.PDRange;
import com.tom_roush.pdfbox.util.Matrix;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class PDTriangleBasedShadingType extends PDShading {
    private int bitsPerColorComponent;
    private int bitsPerCoordinate;
    private COSArray decode;
    private int numberOfColorComponents;

    public PDTriangleBasedShadingType(COSDictionary cOSDictionary) {
        super(cOSDictionary);
        this.decode = null;
        this.bitsPerCoordinate = -1;
        this.bitsPerColorComponent = -1;
        this.numberOfColorComponents = -1;
    }

    private COSArray getDecodeValues() {
        if (this.decode == null) {
            this.decode = (COSArray) getCOSObject().getDictionaryObject(COSName.DECODE);
        }
        return this.decode;
    }

    public abstract List<ShadedTriangle> collectTriangles(AffineTransform affineTransform, Matrix matrix);

    public int getBitsPerComponent() {
        if (this.bitsPerColorComponent == -1) {
            this.bitsPerColorComponent = getCOSObject().getInt(COSName.BITS_PER_COMPONENT, -1);
        }
        return this.bitsPerColorComponent;
    }

    public int getBitsPerCoordinate() {
        if (this.bitsPerCoordinate == -1) {
            int i10 = getCOSObject().getInt(COSName.BITS_PER_COORDINATE, -1);
            this.bitsPerCoordinate = i10;
            Math.pow(2.0d, i10);
        }
        return this.bitsPerCoordinate;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.graphics.shading.PDShading
    public RectF getBounds(AffineTransform affineTransform, Matrix matrix) {
        RectF rectF = null;
        for (ShadedTriangle shadedTriangle : collectTriangles(affineTransform, matrix)) {
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
        if (rectF == null) {
            return new RectF();
        }
        return rectF;
    }

    public PDRange getDecodeForParameter(int i10) {
        COSArray decodeValues = getDecodeValues();
        if (decodeValues != null && decodeValues.size() >= (i10 * 2) + 1) {
            return new PDRange(decodeValues, i10);
        }
        return null;
    }

    public int getNumberOfColorComponents() {
        int numberOfComponents;
        if (this.numberOfColorComponents == -1) {
            if (getFunction() != null) {
                numberOfComponents = 1;
            } else {
                numberOfComponents = getColorSpace().getNumberOfComponents();
            }
            this.numberOfColorComponents = numberOfComponents;
        }
        return this.numberOfColorComponents;
    }

    public float interpolate(float f10, long j10, float f11, float f12) {
        return (((f12 - f11) * f10) / ((float) j10)) + f11;
    }

    public Vertex readVertex(ImageInputStream imageInputStream, long j10, long j11, PDRange pDRange, PDRange pDRange2, PDRange[] pDRangeArr, Matrix matrix, AffineTransform affineTransform) {
        float[] fArr = new float[this.numberOfColorComponents];
        long readBits = imageInputStream.readBits(this.bitsPerCoordinate);
        long readBits2 = imageInputStream.readBits(this.bitsPerCoordinate);
        float interpolate = interpolate((float) readBits, j10, pDRange.getMin(), pDRange.getMax());
        float interpolate2 = interpolate((float) readBits2, j10, pDRange2.getMin(), pDRange2.getMax());
        String.format("[%06X,%06X] -> [%f,%f]", Long.valueOf(readBits), Long.valueOf(readBits2), Float.valueOf(interpolate), Float.valueOf(interpolate2));
        PointF transformPoint = matrix.transformPoint(interpolate, interpolate2);
        affineTransform.transform(transformPoint, transformPoint);
        for (int i10 = 0; i10 < this.numberOfColorComponents; i10++) {
            int readBits3 = (int) imageInputStream.readBits(this.bitsPerColorComponent);
            fArr[i10] = interpolate(readBits3, j11, pDRangeArr[i10].getMin(), pDRangeArr[i10].getMax());
            String.format("%02x", Integer.valueOf(readBits3));
            float f10 = fArr[i10];
        }
        int bitOffset = imageInputStream.getBitOffset();
        if (bitOffset != 0) {
            imageInputStream.readBits(8 - bitOffset);
        }
        return new Vertex(transformPoint, fArr);
    }

    public void setBitsPerComponent(int i10) {
        getCOSObject().setInt(COSName.BITS_PER_COMPONENT, i10);
        this.bitsPerColorComponent = i10;
    }

    public void setBitsPerCoordinate(int i10) {
        getCOSObject().setInt(COSName.BITS_PER_COORDINATE, i10);
        this.bitsPerCoordinate = i10;
    }

    public void setDecodeValues(COSArray cOSArray) {
        this.decode = cOSArray;
        getCOSObject().setItem(COSName.DECODE, (COSBase) cOSArray);
    }
}
