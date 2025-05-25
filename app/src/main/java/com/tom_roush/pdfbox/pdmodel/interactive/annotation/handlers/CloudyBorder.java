package com.tom_roush.pdfbox.pdmodel.interactive.annotation.handlers;

import android.graphics.PointF;
import com.tom_roush.harmony.awt.geom.AffineTransform;
import com.tom_roush.pdfbox.pdmodel.PDAppearanceContentStream;
import com.tom_roush.pdfbox.pdmodel.common.PDRectangle;
import java.util.ArrayList;

/* loaded from: classes2.dex */
class CloudyBorder {
    private static final double ANGLE_180_DEG = 3.141592653589793d;
    private static final double ANGLE_90_DEG = 1.5707963267948966d;
    private final PDRectangle annotRect;
    private double bboxMaxX;
    private double bboxMaxY;
    private double bboxMinX;
    private double bboxMinY;
    private final double intensity;
    private final double lineWidth;
    private final PDAppearanceContentStream output;
    private boolean outputStarted = false;
    private PDRectangle rectWithDiff;
    private static final double ANGLE_34_DEG = Math.toRadians(34.0d);
    private static final double ANGLE_30_DEG = Math.toRadians(30.0d);
    private static final double ANGLE_12_DEG = Math.toRadians(12.0d);

    public CloudyBorder(PDAppearanceContentStream pDAppearanceContentStream, double d10, double d11, PDRectangle pDRectangle) {
        this.output = pDAppearanceContentStream;
        this.intensity = d10;
        this.lineWidth = d11;
        this.annotRect = pDRectangle;
    }

    private void addCornerCurl(double d10, double d11, double d12, double d13, double d14, double d15, double d16, boolean z10) {
        double d17 = d10 + ANGLE_180_DEG + d16;
        double radians = d17 - Math.toRadians(22.0d);
        getArcSegment(d17, radians, d13, d14, d12, d12, null, z10);
        getArc(radians, d11 - d15, d12, d12, d13, d14, null, false);
    }

    private void addFirstIntermediateCurl(double d10, double d11, double d12, double d13, double d14) {
        double d15 = d10 + ANGLE_180_DEG;
        double d16 = d15 + d12;
        double d17 = ANGLE_30_DEG;
        getArcSegment(d16, d16 - d17, d13, d14, d11, d11, null, false);
        double d18 = d15 + ANGLE_90_DEG;
        getArcSegment(d16 - d17, d18, d13, d14, d11, d11, null, false);
        getArcSegment(d18, (d15 + ANGLE_180_DEG) - ANGLE_34_DEG, d13, d14, d11, d11, null, false);
    }

    private PDRectangle applyRectDiff(PDRectangle pDRectangle, double d10) {
        double d11;
        double d12;
        double d13;
        double d14 = d10;
        float lowerLeftX = this.annotRect.getLowerLeftX();
        float lowerLeftY = this.annotRect.getLowerLeftY();
        float upperRightX = this.annotRect.getUpperRightX();
        float upperRightY = this.annotRect.getUpperRightY();
        float min = Math.min(lowerLeftX, upperRightX);
        float min2 = Math.min(lowerLeftY, upperRightY);
        float max = Math.max(min, upperRightX);
        float max2 = Math.max(min2, upperRightY);
        if (pDRectangle != null) {
            double max3 = Math.max(pDRectangle.getLowerLeftX(), d14);
            d12 = Math.max(pDRectangle.getLowerLeftY(), d14);
            d13 = Math.max(pDRectangle.getUpperRightX(), d14);
            double max4 = Math.max(pDRectangle.getUpperRightY(), d14);
            d14 = max3;
            d11 = max4;
        } else {
            d11 = d14;
            d12 = d11;
            d13 = d12;
        }
        float f10 = (float) (min + d14);
        float f11 = (float) (min2 + d12);
        return new PDRectangle(f10, f11, ((float) (max - d13)) - f10, ((float) (max2 - d11)) - f11);
    }

    private void beginOutput(double d10, double d11) {
        this.bboxMinX = d10;
        this.bboxMinY = d11;
        this.bboxMaxX = d10;
        this.bboxMaxY = d11;
        this.outputStarted = true;
        this.output.setLineJoinStyle(2);
    }

    private void cloudyEllipseImpl(double d10, double d11, double d12, double d13) {
        double d14;
        double d15;
        double d16;
        double d17;
        double d18;
        int i10;
        double d19;
        double d20;
        float f10;
        float f11;
        float f12;
        float f13;
        int i11;
        double d21;
        double d22;
        PointF pointF;
        if (this.intensity <= 0.0d) {
            drawBasicEllipse(d10, d11, d12, d13);
            return;
        }
        double d23 = d12 - d10;
        double d24 = d13 - d11;
        double ellipseCloudRadius = getEllipseCloudRadius();
        double d25 = ellipseCloudRadius * 0.5d;
        if (d23 < d25 && d24 < d25) {
            drawBasicEllipse(d10, d11, d12, d13);
        } else if ((d23 < 5.0d && d24 > 20.0d) || (d23 > 20.0d && d24 < 5.0d)) {
            cloudyRectangleImpl(d10, d11, d12, d13, true);
        } else {
            double sin = (Math.sin(ANGLE_12_DEG) * ellipseCloudRadius) - 1.5d;
            double d26 = sin * 2.0d;
            if (d23 > d26) {
                d15 = d10 + sin;
                d14 = d12 - sin;
            } else {
                double d27 = (d10 + d12) / 2.0d;
                d14 = d27 + 0.1d;
                d15 = d27 - 0.1d;
            }
            if (d24 > d26) {
                d17 = d13 - sin;
                d16 = d11 + sin;
            } else {
                double d28 = (d13 + d11) / 2.0d;
                d16 = d28 - 0.1d;
                d17 = d28 + 0.1d;
            }
            PointF[] flattenEllipse = flattenEllipse(d15, d16, d14, d17);
            int length = flattenEllipse.length;
            if (length < 2) {
                return;
            }
            double d29 = 0.0d;
            for (int i12 = 1; i12 < length; i12++) {
                float f14 = flattenEllipse[i12].x;
                PointF pointF2 = flattenEllipse[i12 - 1];
                d29 += Math.hypot(f14 - pointF2.x, pointF.y - pointF2.y);
            }
            double cos = Math.cos(ANGLE_34_DEG) * 2.0d;
            int ceil = (int) Math.ceil(d29 / (ellipseCloudRadius * cos));
            if (ceil < 2) {
                drawBasicEllipse(d10, d11, d12, d13);
                return;
            }
            double d30 = d29 / ceil;
            double d31 = d30 / cos;
            if (d31 < 0.5d) {
                d30 = cos * 0.5d;
                d18 = 0.5d;
            } else if (d31 < 3.0d) {
                drawBasicEllipse(d10, d11, d12, d13);
                return;
            } else {
                d18 = d31;
            }
            double d32 = d30;
            PointF[] pointFArr = new PointF[ceil];
            double d33 = this.lineWidth * 0.1d;
            int i13 = 0;
            int i14 = 0;
            double d34 = 0.0d;
            while (true) {
                int i15 = i13 + 1;
                if (i15 >= length) {
                    break;
                }
                PointF pointF3 = flattenEllipse[i13];
                PointF pointF4 = flattenEllipse[i15];
                PointF[] pointFArr2 = flattenEllipse;
                int i16 = i14;
                double d35 = pointF4.x - pointF3.x;
                double d36 = pointF4.y - pointF3.y;
                double hypot = Math.hypot(f10 - f11, f12 - f13);
                if (Double.compare(hypot, 0.0d) == 0) {
                    i11 = length;
                    d21 = d33;
                } else {
                    double d37 = hypot + d34;
                    double d38 = d32 - d33;
                    if (d37 < d38 && i13 != length - 2) {
                        i11 = length;
                        d21 = d33;
                        d34 = d37;
                    } else {
                        double cosine = cosine(d35, hypot);
                        i11 = length;
                        double sine = sine(d36, hypot);
                        double d39 = d32 - d34;
                        int i17 = i16;
                        while (true) {
                            d21 = d33;
                            double d40 = (d39 * cosine) + pointF3.x;
                            double d41 = cosine;
                            double d42 = (d39 * sine) + pointF3.y;
                            if (i17 < ceil) {
                                d22 = sine;
                                pointFArr[i17] = new PointF((float) d40, (float) d42);
                                i17++;
                            } else {
                                d22 = sine;
                            }
                            d37 -= d32;
                            d39 += d32;
                            if (d37 < d38) {
                                break;
                            }
                            d33 = d21;
                            cosine = d41;
                            sine = d22;
                        }
                        if (d37 < 0.0d) {
                            d34 = 0.0d;
                        } else {
                            d34 = d37;
                        }
                        i14 = i17;
                        d33 = d21;
                        length = i11;
                        flattenEllipse = pointFArr2;
                        i13 = i15;
                    }
                }
                i14 = i16;
                d33 = d21;
                length = i11;
                flattenEllipse = pointFArr2;
                i13 = i15;
            }
            double d43 = 0.0d;
            double d44 = 0.0d;
            int i18 = 0;
            while (i18 < i14) {
                int i19 = i18 + 1;
                if (i19 >= i14) {
                    i10 = 0;
                } else {
                    i10 = i19;
                }
                PointF pointF5 = pointFArr[i18];
                PointF pointF6 = pointFArr[i10];
                if (i18 == 0) {
                    PointF pointF7 = pointFArr[i14 - 1];
                    d20 = Math.atan2(pointF5.y - pointF7.y, pointF5.x - pointF7.x);
                    d19 = computeParamsEllipse(pointF7, pointF5, d18, d32);
                } else {
                    d19 = d43;
                    d20 = d44;
                }
                double atan2 = Math.atan2(pointF6.y - pointF5.y, pointF6.x - pointF5.x);
                double computeParamsEllipse = computeParamsEllipse(pointF5, pointF6, d18, d32);
                addCornerCurl(d20, atan2, d18, pointF5.x, pointF5.y, computeParamsEllipse, d19, !this.outputStarted);
                i18 = i19;
                d44 = atan2;
                d43 = computeParamsEllipse;
                pointFArr = pointFArr;
                i14 = i14;
            }
        }
    }

    private void cloudyPolygonImpl(PointF[] pointFArr, boolean z10) {
        double polygonCloudRadius;
        double d10;
        PointF pointF;
        int i10;
        int i11;
        double d11;
        PointF[] pointFArr2;
        boolean z11;
        CloudyBorder cloudyBorder;
        double d12;
        int i12;
        double d13;
        CloudyBorder cloudyBorder2 = this;
        PointF[] removeZeroLengthSegments = removeZeroLengthSegments(pointFArr);
        cloudyBorder2.getPositivePolygon(removeZeroLengthSegments);
        int length = removeZeroLengthSegments.length;
        if (length < 2) {
            return;
        }
        if (cloudyBorder2.intensity <= 0.0d) {
            cloudyBorder2.moveTo(removeZeroLengthSegments[0]);
            for (int i13 = 1; i13 < length; i13++) {
                cloudyBorder2.lineTo(removeZeroLengthSegments[i13]);
            }
            return;
        }
        if (z10) {
            polygonCloudRadius = getEllipseCloudRadius();
        } else {
            polygonCloudRadius = getPolygonCloudRadius();
        }
        if (polygonCloudRadius < 0.5d) {
            d10 = 0.5d;
        } else {
            d10 = polygonCloudRadius;
        }
        double d14 = ANGLE_34_DEG;
        double cos = Math.cos(d14);
        double d15 = cos * 2.0d * d10;
        double d16 = cos * d10;
        double[] dArr = new double[2];
        float f10 = removeZeroLengthSegments[0].x;
        int i14 = length - 2;
        PointF pointF2 = removeZeroLengthSegments[i14];
        double d17 = d10;
        boolean z12 = true;
        if (computeParamsPolygon(d15, d16, cos, d10, Math.hypot(f10 - pointF2.x, pointF.y - pointF2.y), dArr) == 0) {
            d14 = dArr[0];
        }
        int i15 = 0;
        double d18 = d14;
        double d19 = 0.0d;
        while (true) {
            int i16 = i15 + 1;
            if (i16 < length) {
                PointF pointF3 = removeZeroLengthSegments[i15];
                PointF pointF4 = removeZeroLengthSegments[i16];
                double hypot = Math.hypot(pointF4.x - pointF3.x, pointF4.y - pointF3.y);
                if (Double.compare(hypot, 0.0d) == 0) {
                    d18 = ANGLE_34_DEG;
                    d12 = d17;
                    i11 = i16;
                    pointFArr2 = removeZeroLengthSegments;
                    i10 = length;
                    cloudyBorder = cloudyBorder2;
                    z11 = z12;
                } else {
                    i10 = length;
                    i11 = i16;
                    int computeParamsPolygon = computeParamsPolygon(d15, d16, cos, d17, hypot, dArr);
                    if (computeParamsPolygon < 0) {
                        if (!cloudyBorder2.outputStarted) {
                            cloudyBorder2.moveTo(pointF3);
                        }
                        d12 = d17;
                        pointFArr2 = removeZeroLengthSegments;
                        cloudyBorder = cloudyBorder2;
                        z11 = true;
                    } else {
                        double d20 = dArr[0];
                        double d21 = dArr[1];
                        double atan2 = Math.atan2(pointF4.y - pointF3.y, pointF4.x - pointF3.x);
                        if (i15 == 0) {
                            PointF pointF5 = removeZeroLengthSegments[i14];
                            d11 = Math.atan2(pointF3.y - pointF5.y, pointF3.x - pointF5.x);
                        } else {
                            d11 = d19;
                        }
                        double cosine = cosine(pointF4.x - pointF3.x, hypot);
                        double sine = sine(pointF4.y - pointF3.y, hypot);
                        float f11 = pointF3.x;
                        float f12 = pointF3.y;
                        pointFArr2 = removeZeroLengthSegments;
                        addCornerCurl(d11, atan2, d17, f11, f12, d20, d18, !cloudyBorder2.outputStarted);
                        double d22 = (d21 * 2.0d) + d15;
                        double d23 = (d22 * cosine) + f11;
                        double d24 = (d22 * sine) + f12;
                        z11 = true;
                        if (computeParamsPolygon >= 1) {
                            addFirstIntermediateCurl(atan2, d17, d20, d23, d24);
                            d23 += d15 * cosine;
                            d24 = (d15 * sine) + d24;
                            cloudyBorder = this;
                            d12 = d17;
                            i12 = computeParamsPolygon - 1;
                        } else {
                            cloudyBorder = this;
                            d12 = d17;
                            i12 = computeParamsPolygon;
                        }
                        double d25 = atan2;
                        PointF[] intermediateCurlTemplate = cloudyBorder.getIntermediateCurlTemplate(d25, d12);
                        int i17 = 0;
                        while (i17 < i12) {
                            outputCurlTemplate(intermediateCurlTemplate, d23, d24);
                            d23 += d15 * cosine;
                            d24 = (d15 * sine) + d24;
                            i17++;
                            d25 = d25;
                        }
                        double d26 = d25;
                        if (computeParamsPolygon == 0) {
                            d13 = d20;
                        } else {
                            d13 = ANGLE_34_DEG;
                        }
                        d19 = d26;
                        d18 = d13;
                    }
                }
                cloudyBorder2 = cloudyBorder;
                d17 = d12;
                z12 = z11;
                removeZeroLengthSegments = pointFArr2;
                length = i10;
                i15 = i11;
            } else {
                return;
            }
        }
    }

    private void cloudyRectangleImpl(double d10, double d11, double d12, double d13, boolean z10) {
        boolean z11;
        PointF[] pointFArr;
        double d14 = d12 - d10;
        double d15 = d13 - d11;
        if (this.intensity <= 0.0d) {
            this.output.addRect((float) d10, (float) d11, (float) d14, (float) d15);
            this.bboxMinX = d10;
            this.bboxMinY = d11;
            this.bboxMaxX = d12;
            this.bboxMaxY = d13;
            return;
        }
        if (d14 < 1.0d) {
            float f10 = (float) d10;
            float f11 = (float) d11;
            pointFArr = new PointF[]{new PointF(f10, f11), new PointF(f10, (float) d13), new PointF(f10, f11)};
            z11 = z10;
        } else if (d15 < 1.0d) {
            float f12 = (float) d10;
            float f13 = (float) d11;
            PointF[] pointFArr2 = {new PointF(f12, f13), new PointF((float) d12, f13), new PointF(f12, f13)};
            z11 = z10;
            pointFArr = pointFArr2;
        } else {
            float f14 = (float) d10;
            float f15 = (float) d11;
            float f16 = (float) d12;
            float f17 = (float) d13;
            PointF[] pointFArr3 = {new PointF(f14, f15), new PointF(f16, f15), new PointF(f16, f17), new PointF(f14, f17), new PointF(f14, f15)};
            z11 = z10;
            pointFArr = pointFArr3;
        }
        cloudyPolygonImpl(pointFArr, z11);
    }

    private double computeParamsEllipse(PointF pointF, PointF pointF2, double d10, double d11) {
        double hypot = Math.hypot(pointF2.x - pointF.x, pointF2.y - pointF.y);
        if (Double.compare(hypot, 0.0d) == 0) {
            return ANGLE_34_DEG;
        }
        double d12 = (((hypot - d11) / 2.0d) + (d11 / 2.0d)) / d10;
        if (d12 < -1.0d || d12 > 1.0d) {
            return 0.0d;
        }
        return Math.acos(d12);
    }

    private int computeParamsPolygon(double d10, double d11, double d12, double d13, double d14, double[] dArr) {
        double d15 = 0.0d;
        if (Double.compare(d14, 0.0d) == 0) {
            dArr[0] = ANGLE_34_DEG;
            dArr[1] = 0.0d;
            return -1;
        }
        double d16 = d11 * 2.0d;
        int ceil = (int) Math.ceil((d14 - d16) / d10);
        double d17 = (d14 - ((ceil * d10) + d16)) / 2.0d;
        double d18 = ((d12 * d13) + d17) / d13;
        if (d18 >= -1.0d && d18 <= 1.0d) {
            d15 = Math.acos(d18);
        }
        dArr[0] = d15;
        dArr[1] = d17;
        return ceil;
    }

    private static double cosine(double d10, double d11) {
        if (Double.compare(d11, 0.0d) == 0) {
            return 0.0d;
        }
        return d10 / d11;
    }

    private void curveTo(double d10, double d11, double d12, double d13, double d14, double d15) {
        updateBBox(d10, d11);
        updateBBox(d12, d13);
        updateBBox(d14, d15);
        this.output.curveTo((float) d10, (float) d11, (float) d12, (float) d13, (float) d14, (float) d15);
    }

    private void drawBasicEllipse(double d10, double d11, double d12, double d13) {
        getArc(0.0d, 6.283185307179586d, Math.abs(d12 - d10) / 2.0d, Math.abs(d13 - d11) / 2.0d, (d10 + d12) / 2.0d, (d11 + d13) / 2.0d, null, true);
    }

    private void finish() {
        if (this.outputStarted) {
            this.output.closePath();
        }
        double d10 = this.lineWidth;
        if (d10 > 0.0d) {
            double d11 = d10 / 2.0d;
            this.bboxMinX -= d11;
            this.bboxMinY -= d11;
            this.bboxMaxX += d11;
            this.bboxMaxY += d11;
        }
    }

    private static PointF[] flattenEllipse(double d10, double d11, double d12, double d13) {
        return new PointF[0];
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004a A[LOOP:1: B:12:0x0041->B:14:0x004a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void getArc(double r28, double r30, double r32, double r34, double r36, double r38, java.util.ArrayList<android.graphics.PointF> r40, boolean r41) {
        /*
            r27 = this;
            r15 = r40
            double r0 = java.lang.Math.cos(r28)
            double r0 = r0 * r32
            double r6 = r0 + r36
            r0 = r28
            r2 = r34
            r4 = r38
            double r0 = android.support.v4.media.session.h.a(r0, r2, r4)
            double r2 = r30 - r28
            r16 = r2
        L18:
            r18 = 0
            int r2 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r2 >= 0) goto L26
            r2 = 4618760256179416344(0x401921fb54442d18, double:6.283185307179586)
            double r16 = r16 + r2
            goto L18
        L26:
            if (r41 == 0) goto L3b
            if (r15 == 0) goto L35
            android.graphics.PointF r2 = new android.graphics.PointF
            float r3 = (float) r6
            float r0 = (float) r0
            r2.<init>(r3, r0)
            r15.add(r2)
            goto L3b
        L35:
            r14 = r27
            r14.moveTo(r6, r0)
            goto L3d
        L3b:
            r14 = r27
        L3d:
            r20 = r16
            r22 = r18
        L41:
            r24 = 4609753056924675352(0x3ff921fb54442d18, double:1.5707963267948966)
            int r0 = (r20 > r24 ? 1 : (r20 == r24 ? 0 : -1))
            if (r0 <= 0) goto L68
            double r1 = r28 + r22
            double r3 = r1 + r24
            r26 = 0
            r0 = r27
            r5 = r36
            r7 = r38
            r9 = r32
            r11 = r34
            r13 = r40
            r14 = r26
            r0.getArcSegment(r1, r3, r5, r7, r9, r11, r13, r14)
            double r22 = r22 + r24
            double r20 = r20 - r24
            r14 = r27
            goto L41
        L68:
            int r0 = (r20 > r18 ? 1 : (r20 == r18 ? 0 : -1))
            if (r0 <= 0) goto L80
            double r1 = r28 + r22
            double r3 = r28 + r16
            r14 = 0
            r0 = r27
            r5 = r36
            r7 = r38
            r9 = r32
            r11 = r34
            r13 = r40
            r0.getArcSegment(r1, r3, r5, r7, r9, r11, r13, r14)
        L80:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tom_roush.pdfbox.pdmodel.interactive.annotation.handlers.CloudyBorder.getArc(double, double, double, double, double, double, java.util.ArrayList, boolean):void");
    }

    private void getArcSegment(double d10, double d11, double d12, double d13, double d14, double d15, ArrayList<PointF> arrayList, boolean z10) {
        double d16;
        double cos = Math.cos(d10);
        double sin = Math.sin(d10);
        double cos2 = Math.cos(d11);
        double sin2 = Math.sin(d11);
        double d17 = (d11 - d10) / 2.0d;
        double sin3 = Math.sin(d17);
        if (Double.compare(sin3, 0.0d) == 0) {
            if (z10) {
                double d18 = (cos * d14) + d12;
                double d19 = (sin * d15) + d13;
                if (arrayList != null) {
                    arrayList.add(new PointF((float) d18, (float) d19));
                    return;
                } else {
                    moveTo(d18, d19);
                    return;
                }
            }
            return;
        }
        double cos3 = ((1.0d - Math.cos(d17)) * 1.333333333d) / sin3;
        double d20 = ((cos - (cos3 * sin)) * d14) + d12;
        double d21 = (((cos3 * cos) + sin) * d15) + d13;
        double d22 = (((cos3 * sin2) + cos2) * d14) + d12;
        double d23 = ((sin2 - (cos3 * cos2)) * d15) + d13;
        double d24 = (cos2 * d14) + d12;
        double d25 = (sin2 * d15) + d13;
        if (z10) {
            double d26 = (cos * d14) + d12;
            double d27 = (sin * d15) + d13;
            if (arrayList != null) {
                d16 = d25;
                arrayList.add(new PointF((float) d26, (float) d27));
            } else {
                d16 = d25;
                moveTo(d26, d27);
            }
        } else {
            d16 = d25;
        }
        if (arrayList != null) {
            arrayList.add(new PointF((float) d20, (float) d21));
            arrayList.add(new PointF((float) d22, (float) d23));
            arrayList.add(new PointF((float) d24, (float) d16));
            return;
        }
        curveTo(d20, d21, d22, d23, d24, d16);
    }

    private double getEllipseCloudRadius() {
        return (this.lineWidth * 0.5d) + (this.intensity * 4.75d);
    }

    private PointF[] getIntermediateCurlTemplate(double d10, double d11) {
        ArrayList<PointF> arrayList = new ArrayList<>();
        double d12 = d10 + ANGLE_180_DEG;
        double d13 = ANGLE_34_DEG;
        double d14 = ANGLE_12_DEG;
        getArcSegment(d12 + d13, d12 + d14, 0.0d, 0.0d, d11, d11, arrayList, false);
        double d15 = d12 + d14;
        double d16 = d12 + ANGLE_90_DEG;
        getArcSegment(d15, d16, 0.0d, 0.0d, d11, d11, arrayList, false);
        getArcSegment(d16, (d12 + ANGLE_180_DEG) - d13, 0.0d, 0.0d, d11, d11, arrayList, false);
        return (PointF[]) arrayList.toArray(new PointF[arrayList.size()]);
    }

    private double getPolygonCloudRadius() {
        return (this.lineWidth * 0.5d) + (this.intensity * 4.0d);
    }

    private double getPolygonDirection(PointF[] pointFArr) {
        int length = pointFArr.length;
        double d10 = 0.0d;
        int i10 = 0;
        while (i10 < length) {
            int i11 = i10 + 1;
            PointF pointF = pointFArr[i10];
            float f10 = pointF.x;
            PointF pointF2 = pointFArr[i11 % length];
            d10 += (f10 * pointF2.y) - (pointF.y * pointF2.x);
            i10 = i11;
        }
        return d10;
    }

    private void getPositivePolygon(PointF[] pointFArr) {
        if (getPolygonDirection(pointFArr) < 0.0d) {
            reversePolygon(pointFArr);
        }
    }

    private void lineTo(PointF pointF) {
        lineTo(pointF.x, pointF.y);
    }

    private void moveTo(PointF pointF) {
        moveTo(pointF.x, pointF.y);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0051 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:5:0x001c -> B:6:0x001e). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void outputCurlTemplate(android.graphics.PointF[] r21, double r22, double r24) {
        /*
            r20 = this;
            r0 = r21
            int r1 = r0.length
            int r2 = r1 % 3
            r3 = 0
            r4 = 1
            if (r2 != r4) goto L1c
            r2 = r0[r3]
            float r3 = r2.x
            double r5 = (double) r3
            double r5 = r5 + r22
            float r2 = r2.y
            double r2 = (double) r2
            double r2 = r2 + r24
            r14 = r20
            r14.moveTo(r5, r2)
            r3 = r4
            goto L1e
        L1c:
            r14 = r20
        L1e:
            int r2 = r3 + 2
            if (r2 >= r1) goto L51
            r4 = r0[r3]
            int r5 = r3 + 1
            r5 = r0[r5]
            r2 = r0[r2]
            float r6 = r4.x
            double r6 = (double) r6
            double r8 = r6 + r22
            float r4 = r4.y
            double r6 = (double) r4
            double r10 = r6 + r24
            float r4 = r5.x
            double r6 = (double) r4
            double r12 = r6 + r22
            float r4 = r5.y
            double r4 = (double) r4
            double r4 = r4 + r24
            float r6 = r2.x
            double r6 = (double) r6
            double r16 = r6 + r22
            float r2 = r2.y
            double r6 = (double) r2
            double r18 = r6 + r24
            r7 = r20
            r14 = r4
            r7.curveTo(r8, r10, r12, r14, r16, r18)
            int r3 = r3 + 3
            goto L1c
        L51:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tom_roush.pdfbox.pdmodel.interactive.annotation.handlers.CloudyBorder.outputCurlTemplate(android.graphics.PointF[], double, double):void");
    }

    private PointF[] removeZeroLengthSegments(PointF[] pointFArr) {
        int length = pointFArr.length;
        if (length <= 2) {
            return pointFArr;
        }
        PointF pointF = pointFArr[0];
        int i10 = 1;
        int i11 = length;
        while (i10 < length) {
            PointF pointF2 = pointFArr[i10];
            if (Math.abs(pointF2.x - pointF.x) < 0.5d && Math.abs(pointF2.y - pointF.y) < 0.5d) {
                pointFArr[i10] = null;
                i11--;
            }
            i10++;
            pointF = pointF2;
        }
        if (i11 == length) {
            return pointFArr;
        }
        PointF[] pointFArr2 = new PointF[i11];
        int i12 = 0;
        for (PointF pointF3 : pointFArr) {
            if (pointF3 != null) {
                pointFArr2[i12] = pointF3;
                i12++;
            }
        }
        return pointFArr2;
    }

    private void reversePolygon(PointF[] pointFArr) {
        int length = pointFArr.length;
        int i10 = length / 2;
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = (length - i11) - 1;
            PointF pointF = pointFArr[i11];
            pointFArr[i11] = pointFArr[i12];
            pointFArr[i12] = pointF;
        }
    }

    private static double sine(double d10, double d11) {
        if (Double.compare(d11, 0.0d) == 0) {
            return 0.0d;
        }
        return d10 / d11;
    }

    private void updateBBox(double d10, double d11) {
        this.bboxMinX = Math.min(this.bboxMinX, d10);
        this.bboxMinY = Math.min(this.bboxMinY, d11);
        this.bboxMaxX = Math.max(this.bboxMaxX, d10);
        this.bboxMaxY = Math.max(this.bboxMaxY, d11);
    }

    public void createCloudyEllipse(PDRectangle pDRectangle) {
        PDRectangle applyRectDiff = applyRectDiff(pDRectangle, 0.0d);
        this.rectWithDiff = applyRectDiff;
        cloudyEllipseImpl(applyRectDiff.getLowerLeftX(), this.rectWithDiff.getLowerLeftY(), this.rectWithDiff.getUpperRightX(), this.rectWithDiff.getUpperRightY());
        finish();
    }

    public void createCloudyPolygon(float[][] fArr) {
        int length = fArr.length;
        PointF[] pointFArr = new PointF[length];
        for (int i10 = 0; i10 < length; i10++) {
            float[] fArr2 = fArr[i10];
            if (fArr2.length == 2) {
                pointFArr[i10] = new PointF(fArr2[0], fArr2[1]);
            } else if (fArr2.length == 6) {
                pointFArr[i10] = new PointF(fArr2[4], fArr2[5]);
            }
        }
        cloudyPolygonImpl(pointFArr, false);
        finish();
    }

    public void createCloudyRectangle(PDRectangle pDRectangle) {
        PDRectangle applyRectDiff = applyRectDiff(pDRectangle, this.lineWidth / 2.0d);
        this.rectWithDiff = applyRectDiff;
        cloudyRectangleImpl(applyRectDiff.getLowerLeftX(), this.rectWithDiff.getLowerLeftY(), this.rectWithDiff.getUpperRightX(), this.rectWithDiff.getUpperRightY(), false);
        finish();
    }

    public PDRectangle getBBox() {
        return getRectangle();
    }

    public AffineTransform getMatrix() {
        return AffineTransform.getTranslateInstance(-this.bboxMinX, -this.bboxMinY);
    }

    public PDRectangle getRectDifference() {
        PDRectangle pDRectangle = this.annotRect;
        if (pDRectangle == null) {
            float f10 = ((float) this.lineWidth) / 2.0f;
            double d10 = this.lineWidth;
            return new PDRectangle(f10, f10, (float) d10, (float) d10);
        }
        PDRectangle pDRectangle2 = this.rectWithDiff;
        if (pDRectangle2 != null) {
            pDRectangle = pDRectangle2;
        }
        float lowerLeftX = pDRectangle.getLowerLeftX() - ((float) this.bboxMinX);
        float lowerLeftY = pDRectangle.getLowerLeftY() - ((float) this.bboxMinY);
        return new PDRectangle(lowerLeftX, lowerLeftY, (((float) this.bboxMaxX) - pDRectangle.getUpperRightX()) - lowerLeftX, (((float) this.bboxMaxY) - pDRectangle.getUpperRightY()) - lowerLeftY);
    }

    public PDRectangle getRectangle() {
        double d10 = this.bboxMinX;
        double d11 = this.bboxMinY;
        return new PDRectangle((float) d10, (float) d11, (float) (this.bboxMaxX - d10), (float) (this.bboxMaxY - d11));
    }

    private void lineTo(double d10, double d11) {
        if (this.outputStarted) {
            updateBBox(d10, d11);
        } else {
            beginOutput(d10, d11);
        }
        this.output.lineTo((float) d10, (float) d11);
    }

    private void moveTo(double d10, double d11) {
        if (this.outputStarted) {
            updateBBox(d10, d11);
        } else {
            beginOutput(d10, d11);
        }
        this.output.moveTo((float) d10, (float) d11);
    }
}
