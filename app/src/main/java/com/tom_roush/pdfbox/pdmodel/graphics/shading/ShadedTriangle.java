package com.tom_roush.pdfbox.pdmodel.graphics.shading;

import android.graphics.Point;
import android.graphics.PointF;
import java.util.HashSet;

/* loaded from: classes2.dex */
class ShadedTriangle {
    private final double area;
    protected final float[][] color;
    protected final PointF[] corner;
    private final int degree;
    private final Line line;

    /* renamed from: v0  reason: collision with root package name */
    private final double f15992v0;

    /* renamed from: v1  reason: collision with root package name */
    private final double f15993v1;

    /* renamed from: v2  reason: collision with root package name */
    private final double f15994v2;

    public ShadedTriangle(PointF[] pointFArr, float[][] fArr) {
        PointF[] pointFArr2 = (PointF[]) pointFArr.clone();
        this.corner = pointFArr2;
        float[][] fArr2 = (float[][]) fArr.clone();
        this.color = fArr2;
        this.area = getArea(pointFArr[0], pointFArr[1], pointFArr[2]);
        int calcDeg = calcDeg(pointFArr);
        this.degree = calcDeg;
        if (calcDeg == 2) {
            if (overlaps(pointFArr2[1], pointFArr2[2]) && !overlaps(pointFArr2[0], pointFArr2[2])) {
                this.line = new Line(new Point(Math.round(pointFArr2[0].x), Math.round(pointFArr2[0].y)), new Point(Math.round(pointFArr2[2].x), Math.round(pointFArr2[2].y)), fArr2[0], fArr2[2]);
            } else {
                this.line = new Line(new Point(Math.round(pointFArr2[1].x), Math.round(pointFArr2[1].y)), new Point(Math.round(pointFArr2[2].x), Math.round(pointFArr2[2].y)), fArr2[1], fArr2[2]);
            }
        } else {
            this.line = null;
        }
        this.f15992v0 = edgeEquationValue(pointFArr[0], pointFArr[1], pointFArr[2]);
        this.f15993v1 = edgeEquationValue(pointFArr[1], pointFArr[2], pointFArr[0]);
        this.f15994v2 = edgeEquationValue(pointFArr[2], pointFArr[0], pointFArr[1]);
    }

    private int calcDeg(PointF[] pointFArr) {
        HashSet hashSet = new HashSet();
        for (PointF pointF : pointFArr) {
            hashSet.add(new Point(Math.round(pointF.x * 1000.0f), Math.round(pointF.y * 1000.0f)));
        }
        return hashSet.size();
    }

    private double edgeEquationValue(PointF pointF, PointF pointF2, PointF pointF3) {
        float f10 = pointF3.y;
        float f11 = pointF2.y;
        float f12 = pointF.x;
        float f13 = pointF2.x;
        return ((f12 - f13) * (f10 - f11)) - ((pointF.y - f11) * (pointF3.x - f13));
    }

    private double getArea(PointF pointF, PointF pointF2, PointF pointF3) {
        float f10 = pointF3.x;
        float f11 = pointF3.y;
        return Math.abs(((f11 - pointF.y) * (f10 - pointF2.x)) - ((f11 - pointF2.y) * (f10 - pointF.x))) / 2.0d;
    }

    private boolean overlaps(PointF pointF, PointF pointF2) {
        if (Math.abs(pointF.x - pointF2.x) < 0.001d && Math.abs(pointF.y - pointF2.y) < 0.001d) {
            return true;
        }
        return false;
    }

    public float[] calcColor(PointF pointF) {
        int length = this.color[0].length;
        float[] fArr = new float[length];
        int i10 = this.degree;
        if (i10 != 1) {
            if (i10 != 2) {
                PointF[] pointFArr = this.corner;
                float area = (float) (getArea(pointF, pointFArr[1], pointFArr[2]) / this.area);
                PointF[] pointFArr2 = this.corner;
                float area2 = (float) (getArea(pointF, pointFArr2[2], pointFArr2[0]) / this.area);
                PointF[] pointFArr3 = this.corner;
                float area3 = (float) (getArea(pointF, pointFArr3[0], pointFArr3[1]) / this.area);
                for (int i11 = 0; i11 < length; i11++) {
                    float[][] fArr2 = this.color;
                    fArr[i11] = (fArr2[2][i11] * area3) + (fArr2[1][i11] * area2) + (fArr2[0][i11] * area);
                }
            } else {
                return this.line.calcColor(new Point(Math.round(pointF.x), Math.round(pointF.y)));
            }
        } else {
            for (int i12 = 0; i12 < length; i12++) {
                float[][] fArr3 = this.color;
                fArr[i12] = ((fArr3[0][i12] + fArr3[1][i12]) + fArr3[2][i12]) / 3.0f;
            }
        }
        return fArr;
    }

    public boolean contains(PointF pointF) {
        int i10 = this.degree;
        if (i10 == 1) {
            if (!overlaps(this.corner[0], pointF) && !overlaps(this.corner[1], pointF) && !overlaps(this.corner[2], pointF)) {
                return false;
            }
            return true;
        } else if (i10 == 2) {
            return this.line.linePoints.contains(new Point(Math.round(pointF.x), Math.round(pointF.y)));
        } else {
            PointF[] pointFArr = this.corner;
            if (edgeEquationValue(pointF, pointFArr[1], pointFArr[2]) * this.f15992v0 < 0.0d) {
                return false;
            }
            PointF[] pointFArr2 = this.corner;
            if (edgeEquationValue(pointF, pointFArr2[2], pointFArr2[0]) * this.f15993v1 < 0.0d) {
                return false;
            }
            PointF[] pointFArr3 = this.corner;
            if (edgeEquationValue(pointF, pointFArr3[0], pointFArr3[1]) * this.f15994v2 < 0.0d) {
                return false;
            }
            return true;
        }
    }

    public int[] getBoundary() {
        int round = Math.round(this.corner[0].x);
        int round2 = Math.round(this.corner[1].x);
        int round3 = Math.round(this.corner[2].x);
        int round4 = Math.round(this.corner[0].y);
        int round5 = Math.round(this.corner[1].y);
        int round6 = Math.round(this.corner[2].y);
        return new int[]{Math.min(Math.min(round, round2), round3), Math.max(Math.max(round, round2), round3), Math.min(Math.min(round4, round5), round6), Math.max(Math.max(round4, round5), round6)};
    }

    public int getDeg() {
        return this.degree;
    }

    public Line getLine() {
        return this.line;
    }

    public String toString() {
        return this.corner[0] + " " + this.corner[1] + " " + this.corner[2];
    }
}
