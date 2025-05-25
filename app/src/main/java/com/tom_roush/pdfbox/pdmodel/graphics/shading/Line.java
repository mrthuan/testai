package com.tom_roush.pdfbox.pdmodel.graphics.shading;

import android.graphics.Point;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes2.dex */
class Line {
    private final float[] color0;
    private final float[] color1;
    protected final Set<Point> linePoints;
    private final Point point0;
    private final Point point1;

    public Line(Point point, Point point2, float[] fArr, float[] fArr2) {
        this.point0 = point;
        this.point1 = point2;
        this.color0 = (float[]) fArr.clone();
        this.color1 = (float[]) fArr2.clone();
        this.linePoints = calcLine(point.x, point.y, point2.x, point2.y);
    }

    private Set<Point> calcLine(int i10, int i11, int i12, int i13) {
        int i14;
        HashSet hashSet = new HashSet(3);
        int abs = Math.abs(i12 - i10);
        int abs2 = Math.abs(i13 - i11);
        int i15 = 1;
        if (i10 < i12) {
            i14 = 1;
        } else {
            i14 = -1;
        }
        if (i11 >= i13) {
            i15 = -1;
        }
        int i16 = abs - abs2;
        while (true) {
            hashSet.add(new Point(i10, i11));
            if (i10 == i12 && i11 == i13) {
                return hashSet;
            }
            int i17 = i16 * 2;
            if (i17 > (-abs2)) {
                i16 -= abs2;
                i10 += i14;
            }
            if (i17 < abs) {
                i16 += abs;
                i11 += i15;
            }
        }
    }

    public float[] calcColor(Point point) {
        Point point2 = this.point0;
        int i10 = point2.x;
        Point point3 = this.point1;
        int i11 = point3.x;
        if (i10 == i11 && point2.y == point3.y) {
            return this.color0;
        }
        int length = this.color0.length;
        float[] fArr = new float[length];
        int i12 = 0;
        if (i10 == i11) {
            float f10 = point3.y - point2.y;
            while (i12 < length) {
                float f11 = this.color0[i12];
                int i13 = this.point1.y;
                int i14 = point.y;
                fArr[i12] = ((this.color1[i12] * (i14 - this.point0.y)) / f10) + ((f11 * (i13 - i14)) / f10);
                i12++;
            }
        } else {
            float f12 = i11 - i10;
            while (i12 < length) {
                float f13 = this.color0[i12];
                int i15 = this.point1.x;
                int i16 = point.x;
                fArr[i12] = ((this.color1[i12] * (i16 - this.point0.x)) / f12) + ((f13 * (i15 - i16)) / f12);
                i12++;
            }
        }
        return fArr;
    }
}
