package ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import lib.zj.office.thirdpart.achartengine.chart.PointStyle;
import lib.zj.office.thirdpart.achartengine.model.XYMultipleSeriesDataset;
import lib.zj.office.thirdpart.achartengine.renderers.SimpleSeriesRenderer;
import lib.zj.office.thirdpart.achartengine.renderers.XYMultipleSeriesRenderer;
import lib.zj.office.thirdpart.achartengine.renderers.XYSeriesRenderer;

/* compiled from: ScatterChart.java */
/* loaded from: classes3.dex */
public final class e extends f {

    /* renamed from: k  reason: collision with root package name */
    public final float f30387k;

    /* compiled from: ScatterChart.java */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f30388a;

        static {
            int[] iArr = new int[PointStyle.values().length];
            f30388a = iArr;
            try {
                iArr[PointStyle.X.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f30388a[PointStyle.CIRCLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f30388a[PointStyle.TRIANGLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f30388a[PointStyle.SQUARE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f30388a[PointStyle.DIAMOND.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f30388a[PointStyle.POINT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public e(XYMultipleSeriesDataset xYMultipleSeriesDataset, XYMultipleSeriesRenderer xYMultipleSeriesRenderer) {
        super(xYMultipleSeriesDataset, xYMultipleSeriesRenderer);
        this.f30387k = 3.0f;
        this.f30387k = xYMultipleSeriesRenderer.getPointSize();
    }

    public final void A(Canvas canvas, Paint paint, float[] fArr, float f10, float f11) {
        float zoomRate = this.f30390e.getZoomRate() * this.f30387k;
        fArr[0] = f10;
        fArr[1] = (f11 - zoomRate) - (zoomRate / 2.0f);
        fArr[2] = f10 - zoomRate;
        float f12 = f11 + zoomRate;
        fArr[3] = f12;
        fArr[4] = f10 + zoomRate;
        fArr[5] = f12;
        ui.a.f(canvas, fArr, paint, true);
    }

    public final void B(Canvas canvas, Paint paint, float f10, float f11) {
        float zoomRate = this.f30390e.getZoomRate() * this.f30387k;
        float f12 = f10 - zoomRate;
        float f13 = f11 - zoomRate;
        float f14 = f10 + zoomRate;
        float f15 = f11 + zoomRate;
        canvas.drawLine(f12, f13, f14, f15, paint);
        canvas.drawLine(f14, f13, f12, f15, paint);
    }

    @Override // ui.a
    public final void e(Canvas canvas, SimpleSeriesRenderer simpleSeriesRenderer, float f10, float f11, int i10, Paint paint) {
        XYSeriesRenderer xYSeriesRenderer = (XYSeriesRenderer) simpleSeriesRenderer;
        if (xYSeriesRenderer.isFillPoints()) {
            paint.setStyle(Paint.Style.FILL);
        } else {
            paint.setStyle(Paint.Style.STROKE);
        }
        XYMultipleSeriesRenderer xYMultipleSeriesRenderer = this.f30390e;
        float zoomRate = ((xYMultipleSeriesRenderer.getZoomRate() * ((int) xYMultipleSeriesRenderer.getLegendTextSize())) / 2.0f) + f10;
        int i11 = a.f30388a[xYSeriesRenderer.getPointStyle().ordinal()];
        float f12 = this.f30387k;
        switch (i11) {
            case 1:
                B(canvas, paint, zoomRate, f11);
                return;
            case 2:
                canvas.drawCircle(zoomRate, f11, xYMultipleSeriesRenderer.getZoomRate() * f12, paint);
                return;
            case 3:
                A(canvas, paint, new float[6], zoomRate, f11);
                return;
            case 4:
                float zoomRate2 = xYMultipleSeriesRenderer.getZoomRate() * f12;
                canvas.drawRect(zoomRate - zoomRate2, f11 - zoomRate2, zoomRate + zoomRate2, f11 + zoomRate2, paint);
                return;
            case 5:
                z(canvas, paint, new float[8], zoomRate, f11);
                return;
            case 6:
                canvas.drawPoint(zoomRate, f11, paint);
                return;
            default:
                return;
        }
    }

    @Override // ui.a
    public final int i() {
        return (int) this.f30390e.getLegendTextSize();
    }

    @Override // ui.f
    public final void n(Canvas canvas, Paint paint, float[] fArr, SimpleSeriesRenderer simpleSeriesRenderer, float f10, int i10) {
        XYSeriesRenderer xYSeriesRenderer = (XYSeriesRenderer) simpleSeriesRenderer;
        paint.setColor(xYSeriesRenderer.getColor());
        if (xYSeriesRenderer.isFillPoints()) {
            paint.setStyle(Paint.Style.FILL);
        } else {
            paint.setStyle(Paint.Style.STROKE);
        }
        int length = fArr.length;
        int i11 = a.f30388a[xYSeriesRenderer.getPointStyle().ordinal()];
        float f11 = this.f30387k;
        XYMultipleSeriesRenderer xYMultipleSeriesRenderer = this.f30390e;
        int i12 = 0;
        switch (i11) {
            case 1:
                while (i12 < length) {
                    B(canvas, paint, fArr[i12], fArr[i12 + 1]);
                    i12 += 2;
                }
                return;
            case 2:
                while (i12 < length) {
                    canvas.drawCircle(fArr[i12], fArr[i12 + 1], xYMultipleSeriesRenderer.getZoomRate() * f11, paint);
                    i12 += 2;
                }
                return;
            case 3:
                float[] fArr2 = new float[6];
                for (int i13 = 0; i13 < length; i13 += 2) {
                    A(canvas, paint, fArr2, fArr[i13], fArr[i13 + 1]);
                }
                return;
            case 4:
                for (int i14 = 0; i14 < length; i14 += 2) {
                    float f12 = fArr[i14];
                    float f13 = fArr[i14 + 1];
                    float zoomRate = xYMultipleSeriesRenderer.getZoomRate() * f11;
                    canvas.drawRect(f12 - zoomRate, f13 - zoomRate, f12 + zoomRate, f13 + zoomRate, paint);
                }
                return;
            case 5:
                float[] fArr3 = new float[8];
                for (int i15 = 0; i15 < length; i15 += 2) {
                    z(canvas, paint, fArr3, fArr[i15], fArr[i15 + 1]);
                }
                return;
            case 6:
                canvas.drawPoints(fArr, paint);
                return;
            default:
                return;
        }
    }

    @Override // ui.f
    public final String s() {
        return "Scatter";
    }

    public final void z(Canvas canvas, Paint paint, float[] fArr, float f10, float f11) {
        float zoomRate = this.f30390e.getZoomRate() * this.f30387k;
        fArr[0] = f10;
        fArr[1] = f11 - zoomRate;
        fArr[2] = f10 - zoomRate;
        fArr[3] = f11;
        fArr[4] = f10;
        fArr[5] = f11 + zoomRate;
        fArr[6] = f10 + zoomRate;
        fArr[7] = f11;
        ui.a.f(canvas, fArr, paint, true);
    }
}
