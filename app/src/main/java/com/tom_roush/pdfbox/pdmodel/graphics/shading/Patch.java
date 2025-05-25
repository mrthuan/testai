package com.tom_roush.pdfbox.pdmodel.graphics.shading;

import android.graphics.PointF;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
abstract class Patch {
    protected PointF[][] controlPoints;
    protected float[][] cornerColor;
    protected int[] level;
    protected List<ShadedTriangle> listOfTriangles;

    public Patch(float[][] fArr) {
        this.cornerColor = (float[][]) fArr.clone();
    }

    private boolean overlaps(PointF pointF, PointF pointF2) {
        if (Math.abs(pointF.x - pointF2.x) < 0.001d && Math.abs(pointF.y - pointF2.y) < 0.001d) {
            return true;
        }
        return false;
    }

    public double edgeEquationValue(PointF pointF, PointF pointF2, PointF pointF3) {
        float f10 = pointF3.y;
        float f11 = pointF2.y;
        float f12 = pointF.x;
        float f13 = pointF2.x;
        return ((f12 - f13) * (f10 - f11)) - ((pointF.y - f11) * (pointF3.x - f13));
    }

    public float[][] getFlag1Color() {
        int length = this.cornerColor[0].length;
        float[][] fArr = (float[][]) Array.newInstance(Float.TYPE, 2, length);
        for (int i10 = 0; i10 < length; i10++) {
            float[] fArr2 = fArr[0];
            float[][] fArr3 = this.cornerColor;
            fArr2[i10] = fArr3[1][i10];
            fArr[1][i10] = fArr3[2][i10];
        }
        return fArr;
    }

    public abstract PointF[] getFlag1Edge();

    public float[][] getFlag2Color() {
        int length = this.cornerColor[0].length;
        float[][] fArr = (float[][]) Array.newInstance(Float.TYPE, 2, length);
        for (int i10 = 0; i10 < length; i10++) {
            float[] fArr2 = fArr[0];
            float[][] fArr3 = this.cornerColor;
            fArr2[i10] = fArr3[2][i10];
            fArr[1][i10] = fArr3[3][i10];
        }
        return fArr;
    }

    public abstract PointF[] getFlag2Edge();

    public float[][] getFlag3Color() {
        int length = this.cornerColor[0].length;
        float[][] fArr = (float[][]) Array.newInstance(Float.TYPE, 2, length);
        for (int i10 = 0; i10 < length; i10++) {
            float[] fArr2 = fArr[0];
            float[][] fArr3 = this.cornerColor;
            fArr2[i10] = fArr3[3][i10];
            fArr[1][i10] = fArr3[0][i10];
        }
        return fArr;
    }

    public abstract PointF[] getFlag3Edge();

    public double getLen(PointF pointF, PointF pointF2) {
        double d10 = pointF2.x - pointF.x;
        double d11 = pointF2.y - pointF.y;
        return Math.sqrt((d11 * d11) + (d10 * d10));
    }

    public List<ShadedTriangle> getShadedTriangles(CoordinateColorPair[][] coordinateColorPairArr) {
        boolean z10;
        ArrayList arrayList = new ArrayList();
        int length = coordinateColorPairArr.length;
        int length2 = coordinateColorPairArr[0].length;
        for (int i10 = 1; i10 < length; i10++) {
            for (int i11 = 1; i11 < length2; i11++) {
                int i12 = i10 - 1;
                CoordinateColorPair[] coordinateColorPairArr2 = coordinateColorPairArr[i12];
                int i13 = i11 - 1;
                PointF pointF = coordinateColorPairArr2[i13].coordinate;
                PointF pointF2 = coordinateColorPairArr2[i11].coordinate;
                CoordinateColorPair[] coordinateColorPairArr3 = coordinateColorPairArr[i10];
                PointF pointF3 = coordinateColorPairArr3[i11].coordinate;
                PointF pointF4 = coordinateColorPairArr3[i13].coordinate;
                if (!overlaps(pointF, pointF2) && !overlaps(pointF, pointF4)) {
                    arrayList.add(new ShadedTriangle(new PointF[]{pointF, pointF2, pointF4}, new float[][]{coordinateColorPairArr[i12][i13].color, coordinateColorPairArr[i12][i11].color, coordinateColorPairArr[i10][i13].color}));
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10 || (!overlaps(pointF3, pointF2) && !overlaps(pointF3, pointF4))) {
                    arrayList.add(new ShadedTriangle(new PointF[]{pointF4, pointF2, pointF3}, new float[][]{coordinateColorPairArr[i10][i13].color, coordinateColorPairArr[i12][i11].color, coordinateColorPairArr[i10][i11].color}));
                }
            }
        }
        return arrayList;
    }

    public boolean isEdgeALine(PointF[] pointFArr) {
        double abs = Math.abs(edgeEquationValue(pointFArr[1], pointFArr[0], pointFArr[3]));
        double abs2 = Math.abs(edgeEquationValue(pointFArr[2], pointFArr[0], pointFArr[3]));
        double abs3 = Math.abs(pointFArr[0].x - pointFArr[3].x);
        double abs4 = Math.abs(pointFArr[0].y - pointFArr[3].y);
        if (abs <= abs3 && abs2 <= abs3) {
            return true;
        }
        if (abs <= abs4 && abs2 <= abs4) {
            return true;
        }
        return false;
    }
}
