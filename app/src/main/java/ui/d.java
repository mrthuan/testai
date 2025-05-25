package ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import java.util.ArrayList;
import lib.zj.office.thirdpart.achartengine.model.CategorySeries;
import lib.zj.office.thirdpart.achartengine.renderers.DefaultRenderer;
import lib.zj.office.thirdpart.achartengine.renderers.SimpleSeriesRenderer;

/* compiled from: RoundChart.java */
/* loaded from: classes3.dex */
public abstract class d extends a {

    /* renamed from: d  reason: collision with root package name */
    public final CategorySeries f30385d;

    /* renamed from: e  reason: collision with root package name */
    public final DefaultRenderer f30386e;

    public d(CategorySeries categorySeries, DefaultRenderer defaultRenderer) {
        this.f30385d = categorySeries;
        this.f30386e = defaultRenderer;
    }

    @Override // ui.a
    public void a(Canvas canvas, lib.zj.office.system.f fVar, int i10, int i11, int i12, int i13, Paint paint) {
        String[] strArr;
        int i14;
        CategorySeries categorySeries;
        int min;
        Canvas canvas2;
        DefaultRenderer defaultRenderer;
        int i15;
        CategorySeries categorySeries2;
        int i16;
        int i17;
        float f10;
        float f11;
        int i18;
        Paint paint2;
        ArrayList arrayList;
        Paint paint3;
        int i19 = i10 + i12;
        int i20 = i11 + i13;
        Rect rect = new Rect(i10, i11, i19, i20);
        canvas.save();
        canvas.clipRect(rect);
        DefaultRenderer defaultRenderer2 = this.f30386e;
        paint.setAntiAlias(defaultRenderer2.isAntialiasing());
        paint.setStyle(Paint.Style.FILL);
        paint.setTextSize(defaultRenderer2.getLabelsTextSize());
        sg.d.b(paint);
        int legendHeight = defaultRenderer2.getLegendHeight();
        if (defaultRenderer2.isShowLegend() && legendHeight == 0) {
            legendHeight = i13 / 5;
        }
        CategorySeries categorySeries3 = this.f30385d;
        int itemCount = categorySeries3.getItemCount();
        String[] strArr2 = new String[itemCount];
        double d10 = 0.0d;
        for (int i21 = 0; i21 < itemCount; i21++) {
            d10 = categorySeries3.getValue(i21) + d10;
            strArr2[i21] = categorySeries3.getCategory(i21);
        }
        if (defaultRenderer2.isFitLegend()) {
            strArr = strArr2;
            i14 = itemCount;
            categorySeries = categorySeries3;
            legendHeight = d(canvas, this.f30386e, strArr2, i10, i11, i12, paint);
        } else {
            strArr = strArr2;
            i14 = itemCount;
            categorySeries = categorySeries3;
        }
        int i22 = i20 - legendHeight;
        DefaultRenderer defaultRenderer3 = defaultRenderer2;
        int i23 = i19;
        Paint paint4 = paint;
        Canvas canvas3 = canvas;
        a.b(this.f30386e, canvas, i10, i11, i12, i13, paint, false, 0);
        int i24 = (i10 + i23) / 2;
        int i25 = (i22 + i11) / 2;
        float min2 = (int) (Math.min(Math.abs(i23 - i10), Math.abs(i22 - i11)) * 0.35d * defaultRenderer3.getScale());
        float f12 = min2 * 0.9f;
        float f13 = min2 * 1.1f;
        RectF rectF = new RectF(i24 - min, i25 - min, i24 + min, min + i25);
        ArrayList arrayList2 = new ArrayList();
        float f14 = 0.0f;
        int i26 = i14;
        int i27 = 0;
        while (i27 < i26) {
            paint4.setColor(defaultRenderer3.getSeriesRendererAt(i27).getColor());
            CategorySeries categorySeries4 = categorySeries;
            float value = (float) ((((float) categorySeries4.getValue(i27)) / d10) * 360.0d);
            int i28 = i26;
            RectF rectF2 = rectF;
            RectF rectF3 = rectF;
            int i29 = i27;
            ArrayList arrayList3 = arrayList2;
            Paint paint5 = paint4;
            canvas.drawArc(rectF2, f14, value, true, paint);
            String category = categorySeries4.getCategory(i29);
            if (defaultRenderer3.isShowLabels()) {
                paint5.setColor(defaultRenderer3.getLabelsColor());
                double radians = Math.toRadians(90.0f - ((value / 2.0f) + f14));
                double sin = Math.sin(radians);
                double cos = Math.cos(radians);
                float f15 = i24;
                i16 = i24;
                double d11 = f12;
                i18 = i29;
                int round = Math.round(((float) (d11 * sin)) + f15);
                float f16 = i25;
                int round2 = Math.round(((float) (d11 * cos)) + f16);
                i17 = i25;
                double d12 = f13;
                int round3 = Math.round(f15 + ((float) (sin * d12)));
                int round4 = Math.round(f16 + ((float) (d12 * cos)));
                float labelsTextSize = defaultRenderer3.getLabelsTextSize();
                float f17 = labelsTextSize / 2.0f;
                float max = Math.max(f17, 10.0f);
                paint.setTextAlign(Paint.Align.LEFT);
                if (round > round3) {
                    max = -max;
                    paint.setTextAlign(Paint.Align.RIGHT);
                }
                float f18 = round3;
                float f19 = max + f18;
                float f20 = round4;
                float f21 = i23 - f19;
                if (round > round3) {
                    paint3 = paint;
                    f21 = f19 - i10;
                } else {
                    paint3 = paint;
                }
                int length = category.length();
                defaultRenderer = defaultRenderer3;
                i15 = i23;
                int i30 = 0;
                String str = category;
                while (true) {
                    float f22 = f21;
                    if (paint3.measureText(str) <= f21 || i30 >= length) {
                        break;
                    }
                    i30++;
                    str = category.substring(0, length - i30) + "...";
                    f12 = f12;
                    f21 = f22;
                }
                f10 = f12;
                int i31 = 0;
                if (i30 == length) {
                    str = "...";
                }
                float measureText = paint3.measureText(str);
                int i32 = 0;
                float f23 = f20;
                while (i32 == 0) {
                    int size = arrayList3.size();
                    int i33 = i31;
                    int i34 = i33;
                    while (i34 < size && i33 == 0) {
                        ArrayList arrayList4 = arrayList3;
                        int i35 = size;
                        RectF rectF4 = (RectF) arrayList4.get(i34);
                        float f24 = f13;
                        if (rectF4.intersects(f19, f23, f19 + measureText, f23 + labelsTextSize)) {
                            f23 = Math.max(f23, rectF4.bottom);
                            i33 = 1;
                        }
                        i34++;
                        size = i35;
                        arrayList3 = arrayList4;
                        f13 = f24;
                    }
                    i32 = i33 ^ 1;
                    arrayList3 = arrayList3;
                    f13 = f13;
                    i31 = 0;
                }
                arrayList = arrayList3;
                f11 = f13;
                float f25 = round2;
                float f26 = (int) (f23 - f17);
                canvas2 = canvas;
                paint2 = paint;
                canvas2.drawLine(round, f25, f18, f26, paint);
                canvas2.drawLine(f18, f26, f19, f26, paint);
                categorySeries2 = categorySeries4;
                canvas2.drawText(str, f19, f23, paint2);
                arrayList.add(new RectF(f19, f23, measureText + f19, labelsTextSize + f23));
            } else {
                canvas2 = canvas;
                defaultRenderer = defaultRenderer3;
                i15 = i23;
                categorySeries2 = categorySeries4;
                i16 = i24;
                i17 = i25;
                f10 = f12;
                f11 = f13;
                i18 = i29;
                paint2 = paint5;
                arrayList = arrayList3;
            }
            f14 += value;
            i27 = i18 + 1;
            rectF = rectF3;
            canvas3 = canvas2;
            arrayList2 = arrayList;
            paint4 = paint2;
            f13 = f11;
            i24 = i16;
            i25 = i17;
            defaultRenderer3 = defaultRenderer;
            i23 = i15;
            f12 = f10;
            categorySeries = categorySeries2;
            i26 = i28;
        }
        arrayList2.clear();
        d(canvas, this.f30386e, strArr, i10, i11, i12, paint);
        canvas.restore();
    }

    @Override // ui.a
    public final void e(Canvas canvas, SimpleSeriesRenderer simpleSeriesRenderer, float f10, float f11, int i10, Paint paint) {
        float zoomRate = this.f30386e.getZoomRate() * i();
        float f12 = zoomRate / 2.0f;
        float f13 = f10 + f12;
        float f14 = f11 - f12;
        float f15 = zoomRate + f13;
        float f16 = f12 + f11;
        canvas.drawRect(f13, f14, f15, f16, paint);
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-16777216);
        canvas.drawRect(Math.round(f13), f14, f15, f16, paint);
        paint.setStyle(Paint.Style.FILL);
    }

    @Override // ui.a
    public final int i() {
        return (int) this.f30386e.getLegendTextSize();
    }

    @Override // ui.a
    public final void l(float f10) {
        this.f30386e.setZoomRate(f10);
    }
}
