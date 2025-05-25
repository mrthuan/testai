package ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import lib.zj.office.thirdpart.achartengine.chart.PointStyle;
import lib.zj.office.thirdpart.achartengine.model.XYMultipleSeriesDataset;
import lib.zj.office.thirdpart.achartengine.renderers.SimpleSeriesRenderer;
import lib.zj.office.thirdpart.achartengine.renderers.XYMultipleSeriesRenderer;
import lib.zj.office.thirdpart.achartengine.renderers.XYSeriesRenderer;

/* compiled from: LineChart.java */
/* loaded from: classes3.dex */
public final class b extends f {

    /* renamed from: k  reason: collision with root package name */
    public final e f30384k;

    public b(XYMultipleSeriesDataset xYMultipleSeriesDataset, XYMultipleSeriesRenderer xYMultipleSeriesRenderer) {
        super(xYMultipleSeriesDataset, xYMultipleSeriesRenderer);
        this.f30384k = new e(xYMultipleSeriesDataset, xYMultipleSeriesRenderer);
    }

    @Override // ui.a
    public final void e(Canvas canvas, SimpleSeriesRenderer simpleSeriesRenderer, float f10, float f11, int i10, Paint paint) {
        if (w(simpleSeriesRenderer)) {
            this.f30384k.getClass();
            this.f30384k.e(canvas, simpleSeriesRenderer, f10, f11, i10, paint);
        }
    }

    @Override // ui.a
    public final int i() {
        return (int) this.f30390e.getLegendTextSize();
    }

    @Override // ui.f
    public final void n(Canvas canvas, Paint paint, float[] fArr, SimpleSeriesRenderer simpleSeriesRenderer, float f10, int i10) {
        int length = fArr.length;
        XYSeriesRenderer xYSeriesRenderer = (XYSeriesRenderer) simpleSeriesRenderer;
        float strokeWidth = paint.getStrokeWidth();
        paint.setStrokeWidth(Math.max(this.f30390e.getZoomRate() * xYSeriesRenderer.getLineWidth(), 1.0f));
        if (xYSeriesRenderer.isFillBelowLine()) {
            paint.setColor(xYSeriesRenderer.getFillBelowLineColor());
            float[] fArr2 = new float[fArr.length + 4];
            System.arraycopy(fArr, 0, fArr2, 0, length);
            fArr2[0] = fArr[0] + 1.0f;
            fArr2[length] = fArr2[length - 2];
            int i11 = length + 1;
            fArr2[i11] = f10;
            fArr2[length + 2] = fArr2[0];
            fArr2[length + 3] = fArr2[i11];
            paint.setStyle(Paint.Style.FILL);
            a.f(canvas, fArr2, paint, true);
        }
        paint.setColor(simpleSeriesRenderer.getColor());
        paint.setStyle(Paint.Style.STROKE);
        a.f(canvas, fArr, paint, false);
        paint.setStyle(Paint.Style.FILL);
        paint.setStrokeWidth(strokeWidth);
    }

    @Override // ui.f
    public final String s() {
        return "Line";
    }

    @Override // ui.f
    public final e u() {
        return this.f30384k;
    }

    @Override // ui.f
    public final boolean w(SimpleSeriesRenderer simpleSeriesRenderer) {
        if (((XYSeriesRenderer) simpleSeriesRenderer).getPointStyle() != PointStyle.POINT) {
            return true;
        }
        return false;
    }
}
