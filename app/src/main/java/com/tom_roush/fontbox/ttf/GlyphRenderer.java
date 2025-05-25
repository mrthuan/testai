package com.tom_roush.fontbox.ttf;

import android.graphics.Path;
import com.tom_roush.pdfbox.android.PDFBoxConfig;
import java.util.ArrayList;
import java.util.Locale;

/* loaded from: classes2.dex */
class GlyphRenderer {
    private GlyphDescription glyphDescription;

    public GlyphRenderer(GlyphDescription glyphDescription) {
        this.glyphDescription = glyphDescription;
    }

    private Path calculatePath(Point[] pointArr) {
        Path path = new Path();
        int length = pointArr.length;
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            if (pointArr[i11].endOfContour) {
                Point point = pointArr[i10];
                Point point2 = pointArr[i11];
                ArrayList arrayList = new ArrayList();
                for (int i12 = i10; i12 <= i11; i12++) {
                    arrayList.add(pointArr[i12]);
                }
                if (pointArr[i10].onCurve) {
                    arrayList.add(point);
                } else if (pointArr[i11].onCurve) {
                    arrayList.add(0, point2);
                } else {
                    Point midValue = midValue(point, point2);
                    arrayList.add(0, midValue);
                    arrayList.add(midValue);
                }
                moveTo(path, (Point) arrayList.get(0));
                int size = arrayList.size();
                int i13 = 1;
                while (i13 < size) {
                    Point point3 = (Point) arrayList.get(i13);
                    if (point3.onCurve) {
                        lineTo(path, point3);
                    } else {
                        int i14 = i13 + 1;
                        if (((Point) arrayList.get(i14)).onCurve) {
                            quadTo(path, point3, (Point) arrayList.get(i14));
                            i13 = i14;
                        } else {
                            quadTo(path, point3, midValue(point3, (Point) arrayList.get(i14)));
                        }
                    }
                    i13++;
                }
                path.close();
                i10 = i11 + 1;
            }
        }
        return path;
    }

    private Point[] describe(GlyphDescription glyphDescription) {
        boolean z10;
        Point[] pointArr = new Point[glyphDescription.getPointCount()];
        int i10 = 0;
        int i11 = -1;
        for (int i12 = 0; i12 < glyphDescription.getPointCount(); i12++) {
            if (i11 == -1) {
                i11 = glyphDescription.getEndPtOfContours(i10);
            }
            boolean z11 = true;
            if (i11 == i12) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                i10++;
                i11 = -1;
            }
            short xCoordinate = glyphDescription.getXCoordinate(i12);
            short yCoordinate = glyphDescription.getYCoordinate(i12);
            if ((glyphDescription.getFlags(i12) & 1) == 0) {
                z11 = false;
            }
            pointArr[i12] = new Point(xCoordinate, yCoordinate, z11, z10);
        }
        return pointArr;
    }

    private void lineTo(Path path, Point point) {
        path.lineTo(point.f15983x, point.f15984y);
        if (PDFBoxConfig.isDebugEnabled()) {
            String.format(Locale.US, "%d,%d", Integer.valueOf(point.f15983x), Integer.valueOf(point.f15984y));
        }
    }

    private int midValue(int i10, int i11) {
        return ((i11 - i10) / 2) + i10;
    }

    private void moveTo(Path path, Point point) {
        path.moveTo(point.f15983x, point.f15984y);
        if (PDFBoxConfig.isDebugEnabled()) {
            String.format(Locale.US, "%d,%d", Integer.valueOf(point.f15983x), Integer.valueOf(point.f15984y));
        }
    }

    private void quadTo(Path path, Point point, Point point2) {
        path.quadTo(point.f15983x, point.f15984y, point2.f15983x, point2.f15984y);
        if (PDFBoxConfig.isDebugEnabled()) {
            String.format(Locale.US, "%d,%d %d,%d", Integer.valueOf(point.f15983x), Integer.valueOf(point.f15984y), Integer.valueOf(point2.f15983x), Integer.valueOf(point2.f15984y));
        }
    }

    public Path getPath() {
        return calculatePath(describe(this.glyphDescription));
    }

    private Point midValue(Point point, Point point2) {
        return new Point(midValue(point.f15983x, point2.f15983x), midValue(point.f15984y, point2.f15984y));
    }

    /* loaded from: classes2.dex */
    public static class Point {
        private boolean endOfContour;
        private boolean onCurve;

        /* renamed from: x  reason: collision with root package name */
        private int f15983x;

        /* renamed from: y  reason: collision with root package name */
        private int f15984y;

        public Point(int i10, int i11, boolean z10, boolean z11) {
            this.f15983x = i10;
            this.f15984y = i11;
            this.onCurve = z10;
            this.endOfContour = z11;
        }

        public String toString() {
            String str;
            Locale locale = Locale.US;
            Object[] objArr = new Object[4];
            objArr[0] = Integer.valueOf(this.f15983x);
            objArr[1] = Integer.valueOf(this.f15984y);
            String str2 = "";
            if (!this.onCurve) {
                str = "";
            } else {
                str = "onCurve";
            }
            objArr[2] = str;
            if (this.endOfContour) {
                str2 = "endOfContour";
            }
            objArr[3] = str2;
            return String.format(locale, "Point(%d,%d,%s,%s)", objArr);
        }

        public Point(int i10, int i11) {
            this(i10, i11, true, false);
        }
    }
}
