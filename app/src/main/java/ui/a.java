package ui;

import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import lib.zj.office.PathHolder;
import lib.zj.office.java.awt.Rectangle;
import lib.zj.office.thirdpart.achartengine.renderers.DefaultRenderer;
import lib.zj.office.thirdpart.achartengine.renderers.SimpleSeriesRenderer;

/* compiled from: AbstractChart.java */
/* loaded from: classes3.dex */
public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public int f30382a = -16777216;

    /* renamed from: b  reason: collision with root package name */
    public byte f30383b = 2;
    public Rectangle c = null;

    public static void b(DefaultRenderer defaultRenderer, Canvas canvas, int i10, int i11, int i12, int i13, Paint paint, boolean z10, int i14) {
        if (defaultRenderer.isApplyBackgroundColor() || z10) {
            if (z10) {
                paint.setColor(i14);
            } else {
                paint.setColor(defaultRenderer.getBackgroundColor());
            }
            paint.setStyle(Paint.Style.FILL);
            canvas.drawRect(i10, i11, i10 + i12, i11 + i13, paint);
        }
    }

    public static void c(DefaultRenderer defaultRenderer, Canvas canvas, lib.zj.office.system.f fVar, Rect rect, Paint paint) {
        int alpha = paint.getAlpha();
        PathHolder pathHolder = new PathHolder();
        pathHolder.addRect(rect.left, rect.top, rect.right, rect.bottom, Path.Direction.CCW);
        eh.b backgroundAndFill = defaultRenderer.getBackgroundAndFill();
        if (backgroundAndFill != null) {
            paint.setStyle(Paint.Style.FILL);
            sg.a.e(canvas, fVar, 1, backgroundAndFill, rect, null, 1.0f, pathHolder, paint);
            paint.setAlpha(alpha);
        }
        gh.b chartFrame = defaultRenderer.getChartFrame();
        if (chartFrame != null) {
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(2.0f);
            if (chartFrame.c) {
                paint.setPathEffect(new DashPathEffect(new float[]{5.0f, 5.0f}, 10.0f));
            }
            sg.a.e(canvas, null, 1, chartFrame.f17807b, rect, null, 1.0f, pathHolder, paint);
            paint.setStyle(Paint.Style.FILL);
            paint.setAlpha(alpha);
        }
        paint.reset();
        paint.setAntiAlias(true);
        sg.d.b(paint);
    }

    public static void f(Canvas canvas, float[] fArr, Paint paint, boolean z10) {
        PathHolder pathHolder = new PathHolder();
        pathHolder.moveTo(fArr[0], fArr[1]);
        for (int i10 = 2; i10 < fArr.length; i10 += 2) {
            pathHolder.lineTo(fArr[i10], fArr[i10 + 1]);
        }
        if (z10) {
            pathHolder.lineTo(fArr[0], fArr[1]);
        }
        canvas.drawPath(pathHolder, paint);
    }

    public static void g(Canvas canvas, String str, float f10, float f11, float f12, float f13, Paint paint, float f14) {
        String str2;
        int i10;
        float[] fArr;
        if (str == null) {
            str2 = "";
        } else {
            str2 = str;
        }
        float f15 = f10 * 1.0f;
        float f16 = f11 * 1.0f;
        float f17 = f12 * 1.0f;
        float f18 = 1.0f * f13;
        float f19 = 0.0f;
        int i11 = (f14 > 0.0f ? 1 : (f14 == 0.0f ? 0 : -1));
        if (i11 != 0) {
            canvas.rotate(f14, f15, f16);
        }
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        float ceil = (float) Math.ceil(fontMetrics.descent - fontMetrics.ascent);
        if (paint.measureText(str2) < f17) {
            canvas.drawText(str2, f15, f16, paint);
        } else {
            float[] fArr2 = new float[0];
            float f20 = f16;
            while (true) {
                if (str2.length() <= 0) {
                    break;
                }
                float f21 = f19 + ceil;
                if (f21 > f18) {
                    break;
                }
                int i12 = 1;
                int breakText = paint.breakText(str2, true, f17, fArr2);
                float f22 = f17;
                if (breakText == 0) {
                    fArr = fArr2;
                    i10 = 0;
                } else {
                    i12 = breakText;
                    i10 = 0;
                    fArr = fArr2;
                }
                String substring = str2.substring(i10, i12);
                str2 = str2.substring(i12, str2.length());
                if (str2.length() > 0 && (2.0f * ceil) + f19 > f18) {
                    canvas.drawText(substring.substring(0, substring.length() - 1) + "...", f15, f20 + fontMetrics.descent, paint);
                    break;
                }
                canvas.drawText(substring, f15, fontMetrics.descent + f20, paint);
                f20 += ceil;
                f19 = f21;
                fArr2 = fArr;
                f17 = f22;
            }
        }
        if (i11 != 0) {
            canvas.rotate(-f14, f15, f16);
        }
    }

    public static Rectangle j(String str, float f10, float f11, float f12, Paint paint) {
        if (str != null && str.length() > 0) {
            paint.setTextSize(f10);
            Paint.FontMetrics fontMetrics = paint.getFontMetrics();
            float ceil = (float) Math.ceil(fontMetrics.descent - fontMetrics.ascent);
            float measureText = paint.measureText(str);
            if (measureText < f11) {
                return new Rectangle((int) Math.ceil(measureText), (int) Math.ceil(ceil));
            }
            float[] fArr = new float[0];
            float f13 = 0.0f;
            while (true) {
                if (str.length() <= 0) {
                    break;
                }
                float f14 = f13 + ceil;
                if (f14 > f12) {
                    break;
                }
                int i10 = 1;
                int breakText = paint.breakText(str, true, f11, fArr);
                if (breakText != 0) {
                    i10 = breakText;
                }
                str.substring(0, i10);
                str = str.substring(i10, str.length());
                if (str.length() > 0 && (2.0f * ceil) + f13 > f12) {
                    f13 = f14;
                    break;
                }
                f13 = f14;
            }
            return new Rectangle((int) Math.ceil(f11), (int) Math.ceil(f13));
        }
        return null;
    }

    public static Rectangle k(DefaultRenderer defaultRenderer, int i10, int i11, Paint paint) {
        if (defaultRenderer.isShowChartTitle()) {
            return j(defaultRenderer.getChartTitle(), defaultRenderer.getZoomRate() * defaultRenderer.getChartTitleTextSize(), i10 * 0.8f, i11 * 0.5f, paint);
        }
        return null;
    }

    public abstract void a(Canvas canvas, lib.zj.office.system.f fVar, int i10, int i11, int i12, int i13, Paint paint);

    public final int d(Canvas canvas, DefaultRenderer defaultRenderer, String[] strArr, int i10, int i11, int i12, Paint paint) {
        String str;
        String str2;
        float zoomRate;
        Rectangle rectangle;
        int i13;
        int i14;
        float f10;
        float f11;
        String str3;
        String str4;
        float f12;
        Paint.FontMetrics fontMetrics;
        Rectangle rectangle2;
        int i15;
        if (defaultRenderer.isShowLegend()) {
            paint.setTextSize(defaultRenderer.getZoomRate() * defaultRenderer.getLegendTextSize());
            int min = Math.min(strArr.length, defaultRenderer.getSeriesRendererCount());
            float f13 = -1.0f;
            float f14 = -1.0f;
            int i16 = 0;
            while (true) {
                str = " ";
                str2 = "\n";
                if (i16 >= min) {
                    break;
                }
                String replace = strArr[i16].replace("\n", " ");
                Paint.FontMetrics fontMetrics2 = paint.getFontMetrics();
                f14 = Math.max((float) Math.ceil(fontMetrics2.descent - fontMetrics2.ascent), f14);
                f13 = Math.max(paint.measureText(replace), f13);
                i16++;
            }
            float f15 = i12;
            if (f13 > f15 - ((defaultRenderer.getZoomRate() * i()) * 2.0f)) {
                rectangle = new Rectangle(i12, ((int) Math.ceil(f14)) * ((int) Math.ceil(f13 / zoomRate)));
            } else {
                rectangle = new Rectangle((int) Math.ceil((defaultRenderer.getZoomRate() * i() * 2.0f) + f13), (int) Math.ceil(f14));
            }
            float f16 = i10;
            float f17 = i10 + i12;
            paint.setTextAlign(Paint.Align.LEFT);
            paint.setTextSize(defaultRenderer.getZoomRate() * defaultRenderer.getLegendTextSize());
            Paint.FontMetrics fontMetrics3 = paint.getFontMetrics();
            int min2 = Math.min(strArr.length, defaultRenderer.getSeriesRendererCount());
            float f18 = i11;
            float f19 = f16;
            int i17 = 0;
            while (i17 < min2) {
                float zoomRate2 = defaultRenderer.getZoomRate() * i();
                String replace2 = strArr[i17].replace(str2, str);
                float measureText = paint.measureText(replace2);
                float zoomRate3 = defaultRenderer.getZoomRate() * i() * 2;
                float f20 = zoomRate3 + measureText;
                byte b10 = this.f30383b;
                if (b10 != 0) {
                    if (b10 != 1) {
                        if (b10 != 2) {
                            if (b10 != 3) {
                                i13 = min2;
                                i14 = i17;
                                f10 = f17;
                                f11 = f16;
                                str3 = str;
                                str4 = str2;
                                f12 = f15;
                                fontMetrics = fontMetrics3;
                                rectangle2 = rectangle;
                                i17 = i14 + 1;
                                fontMetrics3 = fontMetrics;
                                rectangle = rectangle2;
                                min2 = i13;
                                str = str3;
                                str2 = str4;
                                f17 = f10;
                                f16 = f11;
                                f15 = f12;
                            }
                        }
                    }
                    float f21 = rectangle.width;
                    if (f20 <= f21) {
                        if (f19 + f21 > f17) {
                            f18 += rectangle.height;
                            float zoomRate4 = defaultRenderer.getZoomRate() * f16;
                            int i18 = min2;
                            if (strArr.length == defaultRenderer.getSeriesRendererCount()) {
                                paint.setColor(defaultRenderer.getSeriesRendererAt(i17).getColor());
                            } else {
                                paint.setColor(-3355444);
                            }
                            i13 = i18;
                            str3 = str;
                            int i19 = i17;
                            str4 = str2;
                            fontMetrics = fontMetrics3;
                            f10 = f17;
                            f11 = f16;
                            f12 = f15;
                            rectangle2 = rectangle;
                            e(canvas, defaultRenderer.getSeriesRendererAt(i17), zoomRate4, f18, i19, paint);
                            paint.setColor(this.f30382a);
                            canvas.drawText(replace2, (zoomRate2 * 2.0f) + zoomRate4, f18 + fontMetrics.descent, paint);
                            f19 = zoomRate4 + rectangle2.width;
                            i14 = i19;
                        } else {
                            i13 = min2;
                            f10 = f17;
                            f11 = f16;
                            str3 = str;
                            str4 = str2;
                            f12 = f15;
                            int i20 = i17;
                            fontMetrics = fontMetrics3;
                            rectangle2 = rectangle;
                            if (strArr.length == defaultRenderer.getSeriesRendererCount()) {
                                i14 = i20;
                                paint.setColor(defaultRenderer.getSeriesRendererAt(i14).getColor());
                            } else {
                                i14 = i20;
                                paint.setColor(-3355444);
                            }
                            e(canvas, defaultRenderer.getSeriesRendererAt(i14), f19, f18, i14, paint);
                            paint.setColor(this.f30382a);
                            canvas.drawText(replace2, (zoomRate2 * 2.0f) + f19, f18 + fontMetrics.descent, paint);
                            f19 += rectangle2.width;
                        }
                    } else {
                        i13 = min2;
                        i14 = i17;
                        f10 = f17;
                        f11 = f16;
                        str3 = str;
                        str4 = str2;
                        f12 = f15;
                        String str5 = replace2;
                        fontMetrics = fontMetrics3;
                        rectangle2 = rectangle;
                        float f22 = f18 + rectangle2.height;
                        if (strArr.length == defaultRenderer.getSeriesRendererCount()) {
                            paint.setColor(defaultRenderer.getSeriesRendererAt(i14).getColor());
                        } else {
                            paint.setColor(-3355444);
                        }
                        e(canvas, defaultRenderer.getSeriesRendererAt(i14), f11, f22, i14, paint);
                        paint.setColor(this.f30382a);
                        float f23 = f12 - zoomRate3;
                        int i21 = 0;
                        float[] fArr = new float[0];
                        float f24 = f22;
                        while (str5.length() > 0) {
                            int breakText = paint.breakText(str5, true, f23, fArr);
                            if (breakText == 0) {
                                i15 = 1;
                            } else {
                                i15 = breakText;
                            }
                            String substring = str5.substring(i21, i15);
                            str5 = str5.substring(i15, str5.length());
                            canvas.drawText(substring, (zoomRate2 * 2.0f) + f11, fontMetrics.descent + f24, paint);
                            f24 = (float) (Math.ceil(fontMetrics.descent - fontMetrics.ascent) + f24);
                            i21 = 0;
                        }
                        f18 = f24;
                        f19 = f11;
                    }
                    i17 = i14 + 1;
                    fontMetrics3 = fontMetrics;
                    rectangle = rectangle2;
                    min2 = i13;
                    str = str3;
                    str2 = str4;
                    f17 = f10;
                    f16 = f11;
                    f15 = f12;
                }
                i13 = min2;
                i14 = i17;
                f10 = f17;
                f11 = f16;
                str3 = str;
                str4 = str2;
                f12 = f15;
                String str6 = replace2;
                fontMetrics = fontMetrics3;
                rectangle2 = rectangle;
                if (strArr.length == defaultRenderer.getSeriesRendererCount()) {
                    paint.setColor(defaultRenderer.getSeriesRendererAt(i14).getColor());
                } else {
                    paint.setColor(-3355444);
                }
                e(canvas, defaultRenderer.getSeriesRendererAt(i14), f19, f18, i14, paint);
                paint.setColor(this.f30382a);
                if (f20 > f12) {
                    float f25 = f12 - zoomRate3;
                    int i22 = 0;
                    float[] fArr2 = new float[0];
                    float f26 = f18;
                    while (str6.length() > 0) {
                        int breakText2 = paint.breakText(str6, true, f25, fArr2);
                        if (breakText2 == 0) {
                            breakText2 = 1;
                        }
                        String substring2 = str6.substring(i22, breakText2);
                        str6 = str6.substring(breakText2, str6.length());
                        canvas.drawText(substring2, (zoomRate2 * 2.0f) + f19, fontMetrics.descent + f26, paint);
                        f26 = (float) (Math.ceil(fontMetrics.descent - fontMetrics.ascent) + f26);
                        f25 = f25;
                        i22 = 0;
                    }
                    f18 = f26;
                } else {
                    canvas.drawText(str6, (zoomRate2 * 2.0f) + f19, f18 + fontMetrics.descent, paint);
                    f18 += rectangle2.height;
                }
                i17 = i14 + 1;
                fontMetrics3 = fontMetrics;
                rectangle = rectangle2;
                min2 = i13;
                str = str3;
                str2 = str4;
                f17 = f10;
                f16 = f11;
                f15 = f12;
            }
        }
        return Math.round(defaultRenderer.getZoomRate() * defaultRenderer.getLegendTextSize());
    }

    public abstract void e(Canvas canvas, SimpleSeriesRenderer simpleSeriesRenderer, float f10, float f11, int i10, Paint paint);

    public final Rectangle h(DefaultRenderer defaultRenderer, String[] strArr, int i10, int i11, Paint paint) {
        int round;
        int round2;
        int i12;
        if (!defaultRenderer.isShowLegend()) {
            return null;
        }
        paint.setTextSize(defaultRenderer.getZoomRate() * defaultRenderer.getLegendTextSize());
        int min = Math.min(strArr.length, defaultRenderer.getSeriesRendererCount());
        float f10 = -1.0f;
        float f11 = -1.0f;
        for (int i13 = 0; i13 < min; i13++) {
            String replace = strArr[i13].replace("\n", " ");
            Paint.FontMetrics fontMetrics = paint.getFontMetrics();
            f10 = Math.max((float) Math.ceil(fontMetrics.descent - fontMetrics.ascent), f10);
            f11 = Math.max(paint.measureText(replace), f11);
        }
        float zoomRate = defaultRenderer.getZoomRate() * i() * 2.0f;
        float f12 = i11;
        byte b10 = this.f30383b;
        int i14 = 2;
        if (b10 != 0 && b10 != 2) {
            round = Math.round(f12 * 0.35f);
        } else {
            round = Math.round(f12 * 0.9f);
        }
        float f13 = i10;
        byte b11 = this.f30383b;
        if (b11 != 0 && b11 != 2) {
            round2 = Math.round(f13 * 0.9f);
        } else {
            round2 = Math.round(f13 * 0.35f);
        }
        float f14 = round2;
        float f15 = f14 - zoomRate;
        int ceil = (int) Math.ceil(zoomRate + f11);
        int ceil2 = (int) Math.ceil(f10);
        if (f11 > f15) {
            this.c = new Rectangle(round2, Math.min(ceil2 * ((int) Math.ceil(f11 / f15)) * min, round));
        } else {
            byte b12 = this.f30383b;
            if (b12 != 0) {
                if (b12 != 1) {
                    if (b12 != 2) {
                        if (b12 != 3) {
                            return null;
                        }
                    }
                }
                if (min > ((int) (f14 / ceil))) {
                    float f16 = min;
                    double ceil3 = Math.ceil(f16 / 2);
                    while (true) {
                        i12 = (int) ceil3;
                        if (i12 * ceil <= round2) {
                            break;
                        }
                        i14++;
                        ceil3 = Math.ceil(f16 / i14);
                    }
                    int i15 = min - ((min / i12) * i12);
                    while (true) {
                        int i16 = i12 - 1;
                        if (i15 >= i16 || ((int) Math.ceil(f16 / i16)) != i14) {
                            break;
                        }
                        i15 = i14 - 1;
                        i12 = i16;
                    }
                    this.c = new Rectangle(ceil * i12, Math.min(ceil2 * i14, round));
                } else {
                    this.c = new Rectangle(ceil * min, ceil2);
                }
            }
            this.c = new Rectangle(ceil, Math.min(ceil2 * min, round));
        }
        return this.c;
    }

    public abstract int i();

    public abstract void l(float f10);
}
