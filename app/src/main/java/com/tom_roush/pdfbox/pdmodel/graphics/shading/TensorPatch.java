package com.tom_roush.pdfbox.pdmodel.graphics.shading;

import android.graphics.PointF;
import java.lang.reflect.Array;
import java.util.List;

/* loaded from: classes2.dex */
class TensorPatch extends Patch {
    public TensorPatch(PointF[] pointFArr, float[][] fArr) {
        super(fArr);
        this.controlPoints = reshapeControlPoints(pointFArr);
        this.level = calcLevel();
        this.listOfTriangles = getTriangles();
    }

    private int[] calcLevel() {
        int[] iArr = {4, 4};
        PointF[] pointFArr = new PointF[4];
        PointF[] pointFArr2 = new PointF[4];
        for (int i10 = 0; i10 < 4; i10++) {
            PointF[][] pointFArr3 = this.controlPoints;
            pointFArr[i10] = pointFArr3[i10][0];
            pointFArr2[i10] = pointFArr3[i10][3];
        }
        if (isEdgeALine(pointFArr) && isEdgeALine(pointFArr2) && !isOnSameSideCC(this.controlPoints[1][1]) && !isOnSameSideCC(this.controlPoints[1][2]) && !isOnSameSideCC(this.controlPoints[2][1]) && !isOnSameSideCC(this.controlPoints[2][2])) {
            double len = getLen(pointFArr[0], pointFArr[3]);
            double len2 = getLen(pointFArr2[0], pointFArr2[3]);
            if (len <= 800.0d && len2 <= 800.0d) {
                if (len <= 400.0d && len2 <= 400.0d) {
                    if (len <= 200.0d && len2 <= 200.0d) {
                        iArr[0] = 1;
                    } else {
                        iArr[0] = 2;
                    }
                } else {
                    iArr[0] = 3;
                }
            }
        }
        if (isEdgeALine(this.controlPoints[0]) && isEdgeALine(this.controlPoints[3]) && !isOnSameSideDD(this.controlPoints[1][1]) && !isOnSameSideDD(this.controlPoints[1][2]) && !isOnSameSideDD(this.controlPoints[2][1]) && !isOnSameSideDD(this.controlPoints[2][2])) {
            PointF[] pointFArr4 = this.controlPoints[0];
            double len3 = getLen(pointFArr4[0], pointFArr4[3]);
            PointF[] pointFArr5 = this.controlPoints[3];
            double len4 = getLen(pointFArr5[0], pointFArr5[3]);
            if (len3 <= 800.0d && len4 <= 800.0d) {
                if (len3 <= 400.0d && len4 <= 400.0d) {
                    if (len3 <= 200.0d && len4 <= 200.0d) {
                        iArr[1] = 1;
                    } else {
                        iArr[1] = 2;
                    }
                } else {
                    iArr[1] = 3;
                }
            }
        }
        return iArr;
    }

    private double[][] getBernsteinPolynomials(int i10) {
        int i11 = (1 << i10) + 1;
        double[][] dArr = (double[][]) Array.newInstance(Double.TYPE, 4, i11);
        double d10 = 1.0d / (i11 - 1);
        double d11 = -d10;
        for (int i12 = 0; i12 < i11; i12++) {
            d11 += d10;
            double d12 = 1.0d - d11;
            dArr[0][i12] = d12 * d12 * d12;
            double d13 = 3.0d * d11;
            dArr[1][i12] = d13 * d12 * d12;
            dArr[2][i12] = d13 * d11 * d12;
            dArr[3][i12] = d11 * d11 * d11;
        }
        return dArr;
    }

    private CoordinateColorPair[][] getPatchCoordinatesColor() {
        PointF pointF;
        TensorPatch tensorPatch = this;
        int i10 = 0;
        int length = tensorPatch.cornerColor[0].length;
        double[][] bernsteinPolynomials = tensorPatch.getBernsteinPolynomials(tensorPatch.level[0]);
        int length2 = bernsteinPolynomials[0].length;
        double[][] bernsteinPolynomials2 = tensorPatch.getBernsteinPolynomials(tensorPatch.level[1]);
        int length3 = bernsteinPolynomials2[0].length;
        CoordinateColorPair[][] coordinateColorPairArr = (CoordinateColorPair[][]) Array.newInstance(CoordinateColorPair.class, length3, length2);
        double d10 = 1.0d / (length2 - 1);
        double d11 = 1.0d / (length3 - 1);
        double d12 = -d11;
        int i11 = 0;
        while (i11 < length3) {
            double d13 = d12 + d11;
            int i12 = length3;
            double d14 = -d10;
            while (i10 < length2) {
                int i13 = length2;
                CoordinateColorPair[][] coordinateColorPairArr2 = coordinateColorPairArr;
                double d15 = d11;
                double d16 = 0.0d;
                int i14 = 0;
                double d17 = d13;
                double d18 = 0.0d;
                while (true) {
                    int i15 = 4;
                    if (i14 >= 4) {
                        break;
                    }
                    int i16 = length;
                    int i17 = 0;
                    while (i17 < i15) {
                        double d19 = d14;
                        double d20 = tensorPatch.controlPoints[i14][i17].x;
                        double d21 = bernsteinPolynomials[i14][i10];
                        double d22 = bernsteinPolynomials2[i17][i11];
                        d16 += d20 * d21 * d22;
                        d18 += pointF.y * d21 * d22;
                        i17++;
                        i15 = 4;
                        tensorPatch = this;
                        d14 = d19;
                    }
                    i14++;
                    tensorPatch = this;
                    length = i16;
                }
                PointF pointF2 = new PointF((float) d16, (float) d18);
                d14 += d10;
                int i18 = length;
                float[] fArr = new float[i18];
                int i19 = 0;
                while (i19 < i18) {
                    double d23 = 1.0d - d14;
                    float[][] fArr2 = this.cornerColor;
                    fArr[i19] = (float) ((((fArr2[2][i19] * d14) + (d23 * fArr2[1][i19])) * d17) + (((fArr2[3][i19] * d14) + (fArr2[0][i19] * d23)) * (1.0d - d17)));
                    i19++;
                    i10 = i10;
                    i18 = i18;
                    d10 = d10;
                }
                int i20 = i10;
                coordinateColorPairArr2[i11][i20] = new CoordinateColorPair(pointF2, fArr);
                i10 = i20 + 1;
                tensorPatch = this;
                d13 = d17;
                d11 = d15;
                length2 = i13;
                coordinateColorPairArr = coordinateColorPairArr2;
                length = i18;
                d10 = d10;
            }
            i11++;
            length3 = i12;
            i10 = 0;
            d12 = d13;
            d10 = d10;
        }
        return coordinateColorPairArr;
    }

    private List<ShadedTriangle> getTriangles() {
        return getShadedTriangles(getPatchCoordinatesColor());
    }

    private boolean isOnSameSideCC(PointF pointF) {
        PointF[][] pointFArr = this.controlPoints;
        double edgeEquationValue = edgeEquationValue(pointF, pointFArr[0][0], pointFArr[3][0]);
        PointF[][] pointFArr2 = this.controlPoints;
        if (edgeEquationValue * edgeEquationValue(pointF, pointFArr2[0][3], pointFArr2[3][3]) <= 0.0d) {
            return false;
        }
        return true;
    }

    private boolean isOnSameSideDD(PointF pointF) {
        PointF[] pointFArr = this.controlPoints[0];
        double edgeEquationValue = edgeEquationValue(pointF, pointFArr[0], pointFArr[3]);
        PointF[] pointFArr2 = this.controlPoints[3];
        if (edgeEquationValue * edgeEquationValue(pointF, pointFArr2[0], pointFArr2[3]) <= 0.0d) {
            return false;
        }
        return true;
    }

    private PointF[][] reshapeControlPoints(PointF[] pointFArr) {
        PointF[][] pointFArr2 = (PointF[][]) Array.newInstance(PointF.class, 4, 4);
        for (int i10 = 0; i10 <= 3; i10++) {
            pointFArr2[0][i10] = pointFArr[i10];
            pointFArr2[3][i10] = pointFArr[9 - i10];
        }
        for (int i11 = 1; i11 <= 2; i11++) {
            pointFArr2[i11][0] = pointFArr[12 - i11];
            pointFArr2[i11][2] = pointFArr[i11 + 12];
            pointFArr2[i11][3] = pointFArr[i11 + 3];
        }
        pointFArr2[1][1] = pointFArr[12];
        pointFArr2[2][1] = pointFArr[15];
        return pointFArr2;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.graphics.shading.Patch
    public PointF[] getFlag1Edge() {
        PointF[] pointFArr = new PointF[4];
        for (int i10 = 0; i10 < 4; i10++) {
            pointFArr[i10] = this.controlPoints[i10][3];
        }
        return pointFArr;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.graphics.shading.Patch
    public PointF[] getFlag2Edge() {
        PointF[] pointFArr = new PointF[4];
        for (int i10 = 0; i10 < 4; i10++) {
            pointFArr[i10] = this.controlPoints[3][3 - i10];
        }
        return pointFArr;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.graphics.shading.Patch
    public PointF[] getFlag3Edge() {
        PointF[] pointFArr = new PointF[4];
        for (int i10 = 0; i10 < 4; i10++) {
            pointFArr[i10] = this.controlPoints[3 - i10][0];
        }
        return pointFArr;
    }
}
