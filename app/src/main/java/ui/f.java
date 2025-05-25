package ui;

import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.PointF;
import android.graphics.Rect;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import lib.zj.office.PathHolder;
import lib.zj.office.thirdpart.achartengine.model.XYMultipleSeriesDataset;
import lib.zj.office.thirdpart.achartengine.model.XYSeries;
import lib.zj.office.thirdpart.achartengine.renderers.BasicStroke;
import lib.zj.office.thirdpart.achartengine.renderers.SimpleSeriesRenderer;
import lib.zj.office.thirdpart.achartengine.renderers.XYMultipleSeriesRenderer;

/* compiled from: XYChart.java */
/* loaded from: classes3.dex */
public abstract class f extends a {

    /* renamed from: d  reason: collision with root package name */
    public final XYMultipleSeriesDataset f30389d;

    /* renamed from: e  reason: collision with root package name */
    public final XYMultipleSeriesRenderer f30390e;

    /* renamed from: f  reason: collision with root package name */
    public float f30391f;

    /* renamed from: g  reason: collision with root package name */
    public float f30392g;

    /* renamed from: h  reason: collision with root package name */
    public PointF f30393h;

    /* renamed from: i  reason: collision with root package name */
    public Rect f30394i;

    /* renamed from: j  reason: collision with root package name */
    public final HashMap f30395j = new HashMap();

    public f() {
    }

    public static void p(XYMultipleSeriesRenderer xYMultipleSeriesRenderer, Canvas canvas, Rect rect, Paint paint) {
        int alpha = paint.getAlpha();
        PathHolder pathHolder = new PathHolder();
        pathHolder.addRect(rect.left, rect.top, rect.right, rect.bottom, Path.Direction.CCW);
        eh.b seriesBackgroundColor = xYMultipleSeriesRenderer.getSeriesBackgroundColor();
        if (seriesBackgroundColor != null) {
            paint.setStyle(Paint.Style.FILL);
            sg.a.e(canvas, null, 1, seriesBackgroundColor, rect, null, 1.0f, pathHolder, paint);
            paint.setAlpha(alpha);
        }
        gh.b seriesFrame = xYMultipleSeriesRenderer.getSeriesFrame();
        if (seriesFrame != null) {
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(2.0f);
            if (seriesFrame.c) {
                paint.setPathEffect(new DashPathEffect(new float[]{5.0f, 5.0f}, 10.0f));
            }
            sg.a.e(canvas, null, 1, seriesFrame.f17807b, rect, null, 1.0f, pathHolder, paint);
            paint.setStyle(Paint.Style.FILL);
            paint.setAlpha(alpha);
        }
        paint.reset();
        paint.setAntiAlias(true);
        sg.d.b(paint);
    }

    public static String t(double d10) {
        if (d10 == Math.round(d10)) {
            return Math.round(d10) + "";
        }
        return d10 + "";
    }

    public static ArrayList v(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(arrayList);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Double d10 = (Double) it.next();
            if (d10.isNaN()) {
                arrayList2.remove(d10);
            }
        }
        return arrayList2;
    }

    /* JADX WARN: Removed duplicated region for block: B:168:0x0600  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x060d  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x061c  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0664  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x06a4  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0782  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x081b  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0947  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0ad1  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x0d24  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x0da9  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x0dad  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x07e7 A[SYNTHETIC] */
    @Override // ui.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(android.graphics.Canvas r71, lib.zj.office.system.f r72, int r73, int r74, int r75, int r76, android.graphics.Paint r77) {
        /*
            Method dump skipped, instructions count: 3520
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ui.f.a(android.graphics.Canvas, lib.zj.office.system.f, int, int, int, int, android.graphics.Paint):void");
    }

    @Override // ui.a
    public final void l(float f10) {
        this.f30390e.setZoomRate(f10);
    }

    public void m(Canvas canvas, XYSeries xYSeries, Paint paint, float[] fArr, int i10) {
        for (int i11 = 0; i11 < fArr.length; i11 += 2) {
            q(canvas, t(xYSeries.getY(i11 / 2)), fArr[i11], fArr[i11 + 1] - 3.5f, paint, 0.0f);
        }
    }

    public abstract void n(Canvas canvas, Paint paint, float[] fArr, SimpleSeriesRenderer simpleSeriesRenderer, float f10, int i10);

    public final void o(XYSeries xYSeries, Canvas canvas, Paint paint, ArrayList arrayList, SimpleSeriesRenderer simpleSeriesRenderer, float f10, int i10, XYMultipleSeriesRenderer.Orientation orientation) {
        e u7;
        DashPathEffect dashPathEffect;
        BasicStroke stroke = simpleSeriesRenderer.getStroke();
        Paint.Cap strokeCap = paint.getStrokeCap();
        Paint.Join strokeJoin = paint.getStrokeJoin();
        float strokeMiter = paint.getStrokeMiter();
        PathEffect pathEffect = paint.getPathEffect();
        Paint.Style style = paint.getStyle();
        if (stroke != null) {
            if (stroke.getIntervals() != null) {
                dashPathEffect = new DashPathEffect(stroke.getIntervals(), stroke.getPhase());
            } else {
                dashPathEffect = null;
            }
            Paint.Cap cap = stroke.getCap();
            Paint.Join join = stroke.getJoin();
            float miter = stroke.getMiter();
            Paint.Style style2 = Paint.Style.FILL_AND_STROKE;
            paint.setStrokeCap(cap);
            paint.setStrokeJoin(join);
            paint.setStrokeMiter(miter);
            paint.setPathEffect(dashPathEffect);
            paint.setStyle(style2);
        }
        NumberFormat numberFormat = vi.a.f30820a;
        int size = arrayList.size();
        float[] fArr = new float[size];
        for (int i11 = 0; i11 < size; i11++) {
            fArr[i11] = ((Float) arrayList.get(i11)).floatValue();
        }
        n(canvas, paint, fArr, simpleSeriesRenderer, f10, i10);
        if (w(simpleSeriesRenderer) && (u7 = u()) != null) {
            u7.n(canvas, paint, fArr, simpleSeriesRenderer, f10, i10);
        }
        paint.setTextSize(simpleSeriesRenderer.getChartValuesTextSize());
        if (orientation == XYMultipleSeriesRenderer.Orientation.HORIZONTAL) {
            paint.setTextAlign(Paint.Align.CENTER);
        } else {
            paint.setTextAlign(Paint.Align.LEFT);
        }
        if (simpleSeriesRenderer.isDisplayChartValues()) {
            m(canvas, xYSeries, paint, fArr, i10);
        }
        if (stroke != null) {
            paint.setStrokeCap(strokeCap);
            paint.setStrokeJoin(strokeJoin);
            paint.setStrokeMiter(strokeMiter);
            paint.setPathEffect(pathEffect);
            paint.setStyle(style);
        }
    }

    public final void q(Canvas canvas, String str, float f10, float f11, Paint paint, float f12) {
        float f13 = (-this.f30390e.getOrientation().getAngle()) + f12;
        int i10 = (f13 > 0.0f ? 1 : (f13 == 0.0f ? 0 : -1));
        if (i10 != 0) {
            canvas.rotate(f13, f10, f11);
        }
        canvas.drawText(str, f10, f11, paint);
        if (i10 != 0) {
            canvas.rotate(-f13, f10, f11);
        }
    }

    public final void r(ArrayList arrayList, Double[] dArr, Canvas canvas, Paint paint, int i10, int i11, float f10, double d10, double d11) {
        float f11;
        Double d12;
        Double[] dArr2 = dArr;
        int size = arrayList.size();
        XYMultipleSeriesRenderer xYMultipleSeriesRenderer = this.f30390e;
        boolean isShowLabels = xYMultipleSeriesRenderer.isShowLabels();
        boolean isShowGridV = xYMultipleSeriesRenderer.isShowGridV();
        boolean isShowCustomTextGrid = xYMultipleSeriesRenderer.isShowCustomTextGrid();
        float max = Math.max(xYMultipleSeriesRenderer.getZoomRate() / 2.0f, 0.5f);
        if (dArr2 != null && dArr2.length != 0) {
            if (isShowLabels) {
                paint.setColor(xYMultipleSeriesRenderer.getLabelsColor());
                int length = dArr2.length;
                int i12 = 0;
                while (i12 < length) {
                    Double d13 = dArr2[i12];
                    float doubleValue = (float) (((d13.doubleValue() - d11) * d10) + i10);
                    paint.setColor(xYMultipleSeriesRenderer.getLabelsColor());
                    if (isShowGridV) {
                        float f12 = (((float) d10) / 2.0f) + doubleValue;
                        f11 = doubleValue;
                        d12 = d13;
                        canvas.drawRect(f12 - max, i11, f12 + max, (xYMultipleSeriesRenderer.getZoomRate() * 4.0f) + f10, paint);
                    } else {
                        f11 = doubleValue;
                        d12 = d13;
                        float f13 = (((float) d10) / 2.0f) + f11;
                        canvas.drawRect(f13 - max, f10, f13 + max, (xYMultipleSeriesRenderer.getZoomRate() * 4.0f) + f10, paint);
                    }
                    int i13 = i12;
                    q(canvas, xYMultipleSeriesRenderer.getXTextLabel(d12), f11, (xYMultipleSeriesRenderer.getZoomRate() * xYMultipleSeriesRenderer.getLabelsTextSize()) + f10, paint, xYMultipleSeriesRenderer.getXLabelsAngle());
                    if (isShowCustomTextGrid) {
                        paint.setColor(xYMultipleSeriesRenderer.getGridColor());
                        float f14 = (((float) d10) / 2.0f) + f11;
                        canvas.drawRect(f14 - max, f10, f14 + max, i11, paint);
                    }
                    i12 = i13 + 1;
                    dArr2 = dArr;
                }
                return;
            }
            return;
        }
        int i14 = 0;
        while (i14 < size) {
            double doubleValue2 = ((Double) arrayList.get(i14)).doubleValue();
            int i15 = i14;
            float e10 = (float) androidx.activity.f.e(doubleValue2, d11, d10, i10);
            if (isShowGridV) {
                canvas.drawRect(e10 - max, i11, e10 + max, (xYMultipleSeriesRenderer.getZoomRate() * 4.0f) + f10, paint);
            } else {
                canvas.drawRect(e10 - max, f10, e10 + max, (xYMultipleSeriesRenderer.getZoomRate() * 4.0f) + f10, paint);
            }
            q(canvas, t(doubleValue2), e10, (xYMultipleSeriesRenderer.getZoomRate() * ((xYMultipleSeriesRenderer.getLabelsTextSize() * 4.0f) / 3.0f)) + f10, paint, xYMultipleSeriesRenderer.getXLabelsAngle());
            if (isShowCustomTextGrid) {
                paint.setColor(xYMultipleSeriesRenderer.getGridColor());
                float f15 = (((float) d10) / 2.0f) + e10;
                canvas.drawRect(f15 - max, f10, f15 + max, i11, paint);
            }
            i14 = i15 + 1;
        }
    }

    public abstract String s();

    public e u() {
        return null;
    }

    public boolean w(SimpleSeriesRenderer simpleSeriesRenderer) {
        return false;
    }

    public final double[] x(double[] dArr, int i10) {
        XYMultipleSeriesRenderer xYMultipleSeriesRenderer = this.f30390e;
        double xAxisMin = xYMultipleSeriesRenderer.getXAxisMin(i10);
        double xAxisMax = xYMultipleSeriesRenderer.getXAxisMax(i10);
        double yAxisMin = xYMultipleSeriesRenderer.getYAxisMin(i10);
        double yAxisMax = xYMultipleSeriesRenderer.getYAxisMax(i10);
        if (!xYMultipleSeriesRenderer.isMinXSet(i10) || !xYMultipleSeriesRenderer.isMaxXSet(i10) || !xYMultipleSeriesRenderer.isMinXSet(i10) || !xYMultipleSeriesRenderer.isMaxYSet(i10)) {
            double[] dArr2 = (double[]) this.f30395j.get(Integer.valueOf(i10));
            xAxisMin = dArr2[0];
            xAxisMax = dArr2[1];
            yAxisMin = dArr2[2];
            yAxisMax = dArr2[3];
        }
        Rect rect = this.f30394i;
        return new double[]{(((dArr[0] - xAxisMin) * this.f30394i.width()) / (xAxisMax - xAxisMin)) + rect.left, (((yAxisMax - dArr[1]) * rect.height()) / (yAxisMax - yAxisMin)) + this.f30394i.top};
    }

    public final void y(Canvas canvas, float f10, boolean z10) {
        if (z10) {
            float f11 = this.f30391f;
            canvas.scale(1.0f / f11, f11);
            float f12 = this.f30392g;
            canvas.translate(f12, -f12);
            PointF pointF = this.f30393h;
            canvas.rotate(-f10, pointF.x, pointF.y);
            return;
        }
        PointF pointF2 = this.f30393h;
        canvas.rotate(f10, pointF2.x, pointF2.y);
        float f13 = this.f30392g;
        canvas.translate(-f13, f13);
        float f14 = this.f30391f;
        canvas.scale(f14, 1.0f / f14);
    }

    public f(XYMultipleSeriesDataset xYMultipleSeriesDataset, XYMultipleSeriesRenderer xYMultipleSeriesRenderer) {
        this.f30389d = xYMultipleSeriesDataset;
        this.f30390e = xYMultipleSeriesRenderer;
    }
}
