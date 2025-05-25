package ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import java.util.ArrayList;
import lib.zj.office.java.awt.Rectangle;
import lib.zj.office.thirdpart.achartengine.model.CategorySeries;
import lib.zj.office.thirdpart.achartengine.renderers.DefaultRenderer;

/* compiled from: PieChart.java */
/* loaded from: classes3.dex */
public final class c extends d {
    @Override // ui.d, ui.a
    public final void a(Canvas canvas, lib.zj.office.system.f fVar, int i10, int i11, int i12, int i13, Paint paint) {
        int i14;
        Rectangle rectangle;
        int i15;
        double d10;
        Rectangle rectangle2;
        int i16;
        DefaultRenderer defaultRenderer;
        Rectangle rectangle3;
        int i17;
        int i18;
        int i19;
        int zoomRate;
        int i20;
        int i21;
        int i22;
        int i23;
        CategorySeries categorySeries;
        byte b10;
        canvas.save();
        int i24 = i10 + i12;
        int i25 = i11 + i13;
        canvas.clipRect(i10, i11, i24, i25);
        DefaultRenderer defaultRenderer2 = this.f30386e;
        paint.setAntiAlias(defaultRenderer2.isAntialiasing());
        paint.setStyle(Paint.Style.FILL);
        paint.setTextSize(defaultRenderer2.getLabelsTextSize());
        sg.d.b(paint);
        a.c(defaultRenderer2, canvas, fVar, new Rect(i10, i11, i24, i25), paint);
        int legendHeight = defaultRenderer2.getLegendHeight();
        if (defaultRenderer2.isShowLegend() && legendHeight == 0) {
            legendHeight = i13 / 5;
        }
        int i26 = legendHeight;
        CategorySeries categorySeries2 = this.f30385d;
        int itemCount = categorySeries2.getItemCount();
        String[] strArr = new String[itemCount];
        double d11 = 0.0d;
        for (int i27 = 0; i27 < itemCount; i27++) {
            d11 = categorySeries2.getValue(i27) + d11;
            strArr[i27] = categorySeries2.getCategory(i27);
        }
        Rectangle k10 = a.k(defaultRenderer2, i12, i13, paint);
        if (k10 != null) {
            i14 = i13 - k10.height;
        } else {
            i14 = i13;
        }
        CategorySeries categorySeries3 = categorySeries2;
        Rectangle h10 = h(this.f30386e, strArr, i12, i14, paint);
        double[] margins = defaultRenderer2.getMargins();
        double d12 = i12;
        int i28 = i10 + ((int) (margins[1] * d12));
        double d13 = i13;
        int i29 = ((int) (margins[0] * d13)) + i11;
        if (k10 != null) {
            i29 += k10.height;
        }
        int i30 = i29;
        int i31 = i24 - ((int) (margins[3] * d12));
        if (h10 != null && ((b10 = this.f30383b) == 0 || b10 == 2)) {
            rectangle = h10;
            i31 -= rectangle.width;
        } else {
            rectangle = h10;
        }
        int i32 = i31;
        double d14 = margins[2];
        paint.setTextSize(defaultRenderer2.getLegendTextSize() * defaultRenderer2.getZoomRate());
        paint.setTextAlign(Paint.Align.CENTER);
        paint.setFakeBoldText(true);
        if (defaultRenderer2.isShowChartTitle()) {
            paint.setTextSize(defaultRenderer2.getZoomRate() * defaultRenderer2.getChartTitleTextSize());
            d10 = d12;
            Rectangle rectangle4 = new Rectangle((int) (i12 * 0.8f), i13 / 2);
            i15 = i28;
            i16 = i32;
            rectangle2 = rectangle;
            i17 = i30;
            defaultRenderer = defaultRenderer2;
            rectangle3 = k10;
            a.g(canvas, defaultRenderer2.getChartTitle(), (i12 / 2) + i10, (defaultRenderer2.getZoomRate() * defaultRenderer2.getChartTitleTextSize() * 2.0f) + i11, rectangle4.width, rectangle4.height, paint, 0.0f);
        } else {
            i15 = i28;
            d10 = d12;
            rectangle2 = rectangle;
            i16 = i32;
            defaultRenderer = defaultRenderer2;
            rectangle3 = k10;
            i17 = i30;
        }
        paint.setFakeBoldText(false);
        int i33 = i16;
        int i34 = i17;
        Rectangle rectangle5 = rectangle3;
        int min = (int) (Math.min(Math.abs(i33 - i19), Math.abs(i18 - i34)) * 0.35d * defaultRenderer.getScale());
        byte b11 = 2;
        int i35 = ((int) ((((margins[1] * d10) + i15) + i33) - (margins[3] * d10))) / 2;
        int i36 = ((int) ((margins[0] * d13) + (((i25 - i26) - (margins[2] * d13)) + i34))) / 2;
        RectF rectF = new RectF(i35 - min, i36 - min, i35 + min, i36 + min);
        ArrayList arrayList = new ArrayList();
        float f10 = 0.0f;
        int i37 = 0;
        while (i37 < itemCount) {
            DefaultRenderer defaultRenderer3 = defaultRenderer;
            paint.setColor(defaultRenderer3.getSeriesRendererAt(i37).getColor());
            float value = (float) ((((float) categorySeries.getValue(i37)) / d11) * 360.0d);
            canvas.drawArc(rectF, f10 - 90.0f, value, true, paint);
            f10 += value;
            i37++;
            b11 = b11;
            defaultRenderer = defaultRenderer3;
            rectF = rectF;
            categorySeries3 = categorySeries3;
        }
        byte b12 = b11;
        DefaultRenderer defaultRenderer4 = defaultRenderer;
        arrayList.clear();
        if (defaultRenderer4.isShowLegend()) {
            Rectangle rectangle6 = rectangle2;
            int i38 = rectangle6.width;
            int min2 = Math.min(i13, rectangle6.height);
            byte b13 = this.f30383b;
            if (b13 != 0) {
                if (b13 != 1) {
                    if (b13 != b12) {
                        if (b13 != 3) {
                            i23 = i10;
                            i22 = i11;
                            d(canvas, this.f30386e, strArr, i23, i22, i38, paint);
                        }
                    }
                }
                zoomRate = ((i12 - i38) / b12) + i10;
                i21 = i25 - min2;
                i22 = i21;
                i23 = zoomRate;
                d(canvas, this.f30386e, strArr, i23, i22, i38, paint);
            }
            zoomRate = (i24 - i38) - ((int) (defaultRenderer4.getZoomRate() * defaultRenderer4.getLegendTextSize()));
            if (rectangle5 != null) {
                i20 = (rectangle5.height + i13) / b12;
            } else {
                i20 = (i13 - min2) / b12;
            }
            i21 = i20 + i11;
            i22 = i21;
            i23 = zoomRate;
            d(canvas, this.f30386e, strArr, i23, i22, i38, paint);
        }
        canvas.restore();
    }
}
