package lib.zj.office.thirdpart.achartengine.chart;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.GradientDrawable;
import lib.zj.office.thirdpart.achartengine.model.XYMultipleSeriesDataset;
import lib.zj.office.thirdpart.achartengine.model.XYSeries;
import lib.zj.office.thirdpart.achartengine.renderers.SimpleSeriesRenderer;
import lib.zj.office.thirdpart.achartengine.renderers.XYMultipleSeriesRenderer;
import ui.f;

/* loaded from: classes3.dex */
public final class ColumnBarChart extends f {

    /* renamed from: k  reason: collision with root package name */
    public final Type f21079k;

    /* loaded from: classes3.dex */
    public enum Type {
        DEFAULT,
        STACKED
    }

    public ColumnBarChart(XYMultipleSeriesDataset xYMultipleSeriesDataset, XYMultipleSeriesRenderer xYMultipleSeriesRenderer, Type type) {
        super(xYMultipleSeriesDataset, xYMultipleSeriesRenderer);
        this.f21079k = Type.DEFAULT;
        this.f21079k = type;
    }

    public static int A(float f10, int i10, int i11) {
        float f11 = 1.0f - f10;
        return Color.argb(Math.round((Color.alpha(i11) * f11) + (Color.alpha(i10) * f10)), Math.round((Color.red(i11) * f11) + (Color.red(i10) * f10)), Math.round((Color.green(i11) * f11) + (Color.green(i10) * f10)), Math.round((f11 * Color.blue(i11)) + (f10 * Color.blue(i10))));
    }

    public final float B(float[] fArr, int i10, int i11) {
        int i12;
        if (i10 > 2) {
            i12 = i10 - 2;
        } else {
            i12 = i10;
        }
        float f10 = (fArr[i10 - 2] - fArr[0]) / i12;
        if (f10 == 0.0f) {
            f10 = this.f30394i.width() / 2;
        }
        if (this.f21079k != Type.STACKED) {
            f10 /= i11 + 1;
        }
        return (float) (f10 / ((this.f30390e.getBarSpacing() + 1.0d) * 1.0f));
    }

    @Override // ui.a
    public final void e(Canvas canvas, SimpleSeriesRenderer simpleSeriesRenderer, float f10, float f11, int i10, Paint paint) {
        XYMultipleSeriesRenderer xYMultipleSeriesRenderer = this.f30390e;
        float zoomRate = xYMultipleSeriesRenderer.getZoomRate() * xYMultipleSeriesRenderer.getLegendTextSize();
        float f12 = zoomRate / 2.0f;
        float f13 = f10 + f12;
        float f14 = f11 - f12;
        float f15 = zoomRate + f13;
        float f16 = f11 + f12;
        canvas.drawRect(f13, f14, f15, f16, paint);
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-16777216);
        canvas.drawRect(f13, f14, f15, f16, paint);
        paint.setStyle(Paint.Style.FILL);
    }

    @Override // ui.a
    public final int i() {
        return (int) this.f30390e.getLegendTextSize();
    }

    @Override // ui.f
    public final void m(Canvas canvas, XYSeries xYSeries, Paint paint, float[] fArr, int i10) {
        float f10;
        int seriesCount = this.f30389d.getSeriesCount();
        float B = B(fArr, fArr.length, seriesCount);
        for (int i11 = 0; i11 < fArr.length; i11 += 2) {
            float f11 = fArr[i11];
            if (this.f21079k == Type.DEFAULT) {
                f10 = (((i10 * 2) * B) - ((seriesCount - 1.5f) * B)) + f11;
            } else {
                f10 = f11;
            }
            q(canvas, f.t(xYSeries.getY(i11 / 2)), f10, fArr[i11 + 1] - 3.5f, paint, 0.0f);
        }
    }

    @Override // ui.f
    public final void n(Canvas canvas, Paint paint, float[] fArr, SimpleSeriesRenderer simpleSeriesRenderer, float f10, int i10) {
        int i11;
        XYMultipleSeriesDataset xYMultipleSeriesDataset = this.f30389d;
        int seriesCount = xYMultipleSeriesDataset.getSeriesCount();
        int length = fArr.length;
        paint.setColor(simpleSeriesRenderer.getColor());
        paint.setStyle(Paint.Style.FILL);
        float B = B(fArr, length, seriesCount);
        int i12 = 0;
        while (i12 < length) {
            float f11 = fArr[i12];
            float f12 = fArr[i12 + 1];
            int scaleNumber = xYMultipleSeriesDataset.getSeriesAt(i10).getScaleNumber();
            if (this.f21079k == Type.STACKED) {
                i11 = i12;
                z(canvas, f11 - B, f12, f11 + B, f10, scaleNumber, i10, paint);
            } else {
                i11 = i12;
                float f13 = (i10 * 2 * B) + (f11 - (seriesCount * B));
                z(canvas, f13, f12, (2.0f * B) + f13, f10, scaleNumber, i10, paint);
            }
            i12 = i11 + 2;
        }
        paint.setColor(simpleSeriesRenderer.getColor());
    }

    @Override // ui.f
    public final String s() {
        return "Column Bar";
    }

    public final void z(Canvas canvas, float f10, float f11, float f12, float f13, int i10, int i11, Paint paint) {
        int A;
        SimpleSeriesRenderer seriesRendererAt = this.f30390e.getSeriesRendererAt(i11);
        if (seriesRendererAt.isGradientEnabled()) {
            float f14 = (float) x(new double[]{0.0d, seriesRendererAt.getGradientStopValue()}, i10)[1];
            float f15 = (float) x(new double[]{0.0d, seriesRendererAt.getGradientStartValue()}, i10)[1];
            float max = Math.max(f14, f11);
            float min = Math.min(f15, f13);
            int gradientStopColor = seriesRendererAt.getGradientStopColor();
            int gradientStartColor = seriesRendererAt.getGradientStartColor();
            if (f11 < f14) {
                paint.setColor(gradientStartColor);
                canvas.drawRect(Math.round(f10), Math.round(f11), Math.round(f12), Math.round(max), paint);
                A = gradientStartColor;
            } else {
                A = A((f15 - max) / (f15 - f14), gradientStartColor, gradientStopColor);
            }
            if (f13 > f15) {
                paint.setColor(gradientStopColor);
                canvas.drawRect(Math.round(f10), Math.round(min), Math.round(f12), Math.round(f13), paint);
            } else {
                gradientStopColor = A((min - f14) / (f15 - f14), gradientStopColor, gradientStartColor);
            }
            GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{gradientStopColor, A});
            gradientDrawable.setBounds(Math.round(f10), Math.round(max), Math.round(f12), Math.round(min));
            gradientDrawable.draw(canvas);
        } else if (Math.abs(f13 - f11) < 1.0E-7f) {
        } else {
            canvas.drawRect(Math.round(f10), Math.round(f11), Math.round(f12), Math.round(f13), paint);
            int color = paint.getColor();
            paint.setColor(-16777216);
            paint.setStyle(Paint.Style.STROKE);
            canvas.drawRect(Math.round(f10), Math.round(f11), Math.round(f12), Math.round(f13), paint);
            paint.setStyle(Paint.Style.FILL);
            paint.setColor(color);
        }
    }
}
