package com.tom_roush.pdfbox.pdmodel.graphics.shading;

import android.graphics.PointF;
import java.lang.reflect.Array;
import java.util.List;

/* loaded from: classes2.dex */
class CoonsPatch extends Patch {
    public CoonsPatch(PointF[] pointFArr, float[][] fArr) {
        super(fArr);
        this.controlPoints = reshapeControlPoints(pointFArr);
        this.level = calcLevel();
        this.listOfTriangles = getTriangles();
    }

    private int[] calcLevel() {
        int[] iArr = {4, 4};
        if (isEdgeALine(this.controlPoints[0]) && isEdgeALine(this.controlPoints[1])) {
            PointF[] pointFArr = this.controlPoints[0];
            double len = getLen(pointFArr[0], pointFArr[3]);
            PointF[] pointFArr2 = this.controlPoints[1];
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
        if (isEdgeALine(this.controlPoints[2]) && isEdgeALine(this.controlPoints[3])) {
            PointF[] pointFArr3 = this.controlPoints[2];
            double len3 = getLen(pointFArr3[0], pointFArr3[3]);
            PointF[] pointFArr4 = this.controlPoints[3];
            double len4 = getLen(pointFArr4[0], pointFArr4[3]);
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

    private List<ShadedTriangle> getTriangles() {
        return getShadedTriangles(new CoordinateColorPair[0]);
    }

    private PointF[][] reshapeControlPoints(PointF[] pointFArr) {
        PointF[][] pointFArr2 = (PointF[][]) Array.newInstance(PointF.class, 4, 4);
        PointF[] pointFArr3 = new PointF[4];
        pointFArr3[0] = pointFArr[0];
        pointFArr3[1] = pointFArr[1];
        pointFArr3[2] = pointFArr[2];
        pointFArr3[3] = pointFArr[3];
        pointFArr2[2] = pointFArr3;
        PointF[] pointFArr4 = new PointF[4];
        pointFArr4[0] = pointFArr[3];
        pointFArr4[1] = pointFArr[4];
        pointFArr4[2] = pointFArr[5];
        PointF pointF = pointFArr[6];
        pointFArr4[3] = pointF;
        pointFArr2[1] = pointFArr4;
        PointF[] pointFArr5 = new PointF[4];
        PointF pointF2 = pointFArr[9];
        pointFArr5[0] = pointF2;
        pointFArr5[1] = pointFArr[8];
        pointFArr5[2] = pointFArr[7];
        pointFArr5[3] = pointF;
        pointFArr2[3] = pointFArr5;
        PointF[] pointFArr6 = new PointF[4];
        pointFArr6[0] = pointFArr[0];
        pointFArr6[1] = pointFArr[11];
        pointFArr6[2] = pointFArr[10];
        pointFArr6[3] = pointF2;
        pointFArr2[0] = pointFArr6;
        return pointFArr2;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.graphics.shading.Patch
    public PointF[] getFlag1Edge() {
        return (PointF[]) this.controlPoints[1].clone();
    }

    @Override // com.tom_roush.pdfbox.pdmodel.graphics.shading.Patch
    public PointF[] getFlag2Edge() {
        PointF[] pointFArr = this.controlPoints[3];
        return new PointF[]{pointFArr[3], pointFArr[2], pointFArr[1], pointFArr[0]};
    }

    @Override // com.tom_roush.pdfbox.pdmodel.graphics.shading.Patch
    public PointF[] getFlag3Edge() {
        PointF[][] pointFArr = this.controlPoints;
        PointF[] pointFArr2 = pointFArr[0];
        return new PointF[]{pointFArr[0][3], pointFArr2[2], pointFArr2[1], pointFArr2[0]};
    }
}
