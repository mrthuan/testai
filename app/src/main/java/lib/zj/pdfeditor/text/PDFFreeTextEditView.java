package lib.zj.pdfeditor.text;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PaintFlagsDrawFilter;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.common.api.Api;
import java.util.Locale;
import lib.zj.office.fc.hssf.formula.eval.FunctionEval;
import lib.zj.pdfeditor.PDFPageView;
import lj.c;
import ng.e;
import pdf.pdfreader.viewer.editor.free.R;
import v0.f;

/* loaded from: classes3.dex */
public class PDFFreeTextEditView extends ViewGroup {
    public static long G0;
    public final Rect A;
    public final RectF A0;
    public final RectF B;
    public boolean B0;
    public final RectF C;
    public boolean C0;
    public final RectF D;
    public boolean D0;
    public final RectF E;
    public boolean E0;
    public final RectF F;
    public int F0;
    public final RectF G;
    public final RectF H;
    public final RectF I;
    public final RectF J;
    public final RectF K;
    public final RectF L;
    public final RectF M;
    public final RectF N;
    public final float O;
    public final float P;
    public final float Q;
    public float R;
    public final float S;
    public final float T;
    public final float U;
    public final float V;
    public final float W;

    /* renamed from: a  reason: collision with root package name */
    public String f21605a;

    /* renamed from: a0  reason: collision with root package name */
    public final float f21606a0;

    /* renamed from: b  reason: collision with root package name */
    public String f21607b;

    /* renamed from: b0  reason: collision with root package name */
    public boolean f21608b0;
    public String c;

    /* renamed from: c0  reason: collision with root package name */
    public long f21609c0;

    /* renamed from: d  reason: collision with root package name */
    public String f21610d;

    /* renamed from: d0  reason: collision with root package name */
    public boolean f21611d0;

    /* renamed from: e  reason: collision with root package name */
    public float f21612e;

    /* renamed from: e0  reason: collision with root package name */
    public int f21613e0;

    /* renamed from: f  reason: collision with root package name */
    public int f21614f;

    /* renamed from: f0  reason: collision with root package name */
    public b f21615f0;

    /* renamed from: g  reason: collision with root package name */
    public int f21616g;

    /* renamed from: g0  reason: collision with root package name */
    public Rect f21617g0;

    /* renamed from: h  reason: collision with root package name */
    public int f21618h;

    /* renamed from: h0  reason: collision with root package name */
    public c f21619h0;

    /* renamed from: i  reason: collision with root package name */
    public Paint f21620i;

    /* renamed from: i0  reason: collision with root package name */
    public long f21621i0;

    /* renamed from: j  reason: collision with root package name */
    public Paint f21622j;

    /* renamed from: j0  reason: collision with root package name */
    public long f21623j0;

    /* renamed from: k  reason: collision with root package name */
    public Paint f21624k;

    /* renamed from: k0  reason: collision with root package name */
    public boolean f21625k0;

    /* renamed from: l  reason: collision with root package name */
    public Paint f21626l;

    /* renamed from: l0  reason: collision with root package name */
    public boolean f21627l0;

    /* renamed from: m  reason: collision with root package name */
    public TextPaint f21628m;

    /* renamed from: m0  reason: collision with root package name */
    public StaticLayout f21629m0;

    /* renamed from: n  reason: collision with root package name */
    public TextPaint f21630n;

    /* renamed from: n0  reason: collision with root package name */
    public final PointF f21631n0;

    /* renamed from: o  reason: collision with root package name */
    public Paint f21632o;

    /* renamed from: o0  reason: collision with root package name */
    public final PointF f21633o0;

    /* renamed from: p  reason: collision with root package name */
    public float f21634p;

    /* renamed from: p0  reason: collision with root package name */
    public float f21635p0;

    /* renamed from: q  reason: collision with root package name */
    public float f21636q;

    /* renamed from: q0  reason: collision with root package name */
    public int f21637q0;

    /* renamed from: r  reason: collision with root package name */
    public int f21638r;

    /* renamed from: r0  reason: collision with root package name */
    public int f21639r0;

    /* renamed from: s  reason: collision with root package name */
    public int f21640s;

    /* renamed from: s0  reason: collision with root package name */
    public final Handler f21641s0;

    /* renamed from: t  reason: collision with root package name */
    public int f21642t;

    /* renamed from: t0  reason: collision with root package name */
    public final a f21643t0;

    /* renamed from: u  reason: collision with root package name */
    public int f21644u;

    /* renamed from: u0  reason: collision with root package name */
    public final int f21645u0;

    /* renamed from: v  reason: collision with root package name */
    public int f21646v;

    /* renamed from: v0  reason: collision with root package name */
    public float f21647v0;

    /* renamed from: w  reason: collision with root package name */
    public float f21648w;

    /* renamed from: w0  reason: collision with root package name */
    public float f21649w0;

    /* renamed from: x  reason: collision with root package name */
    public float f21650x;

    /* renamed from: x0  reason: collision with root package name */
    public float f21651x0;

    /* renamed from: y  reason: collision with root package name */
    public final Bitmap f21652y;

    /* renamed from: y0  reason: collision with root package name */
    public float f21653y0;

    /* renamed from: z  reason: collision with root package name */
    public final int f21654z;

    /* renamed from: z0  reason: collision with root package name */
    public float f21655z0;

    /* loaded from: classes3.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            PDFFreeTextEditView pDFFreeTextEditView = PDFFreeTextEditView.this;
            pDFFreeTextEditView.d(pDFFreeTextEditView.f21614f, false);
            int i10 = pDFFreeTextEditView.f21640s;
            int i11 = pDFFreeTextEditView.f21638r;
            pDFFreeTextEditView.k(i10, i11, i10, i11);
            pDFFreeTextEditView.c();
            pDFFreeTextEditView.invalidate();
        }
    }

    /* loaded from: classes3.dex */
    public interface b {
    }

    public PDFFreeTextEditView(Context context) {
        this(context, null);
    }

    public static int e(Context context, float f10) {
        return (int) (((context.getResources().getDisplayMetrics().densityDpi / 160.0f) * f10) + 0.5f);
    }

    public static void f(RectF rectF, float f10, float f11) {
        rectF.left += f10;
        rectF.right += f10;
        rectF.top += f11;
        rectF.bottom += f11;
    }

    private int getEditClickSize() {
        int i10 = this.F0;
        if (i10 != 0) {
            return i10;
        }
        int e10 = e(getContext(), 45.0f);
        this.F0 = e10;
        return e10;
    }

    public static float h(StaticLayout staticLayout) {
        int lineCount = staticLayout.getLineCount();
        float f10 = 0.0f;
        for (int i10 = 0; i10 < lineCount; i10++) {
            if (f10 < staticLayout.getLineMax(i10)) {
                f10 = staticLayout.getLineMax(i10);
            }
        }
        return f10;
    }

    public static RectF n(float f10, RectF rectF) {
        RectF rectF2 = new RectF();
        rectF2.left = rectF.left / f10;
        rectF2.top = rectF.top / f10;
        rectF2.right = rectF.right / f10;
        rectF2.bottom = rectF.bottom / f10;
        return rectF2;
    }

    public final void a(int i10, boolean z10) {
        StaticLayout staticLayout = new StaticLayout(this.c, this.f21628m, i10, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
        float h10 = h(staticLayout);
        if (z10) {
            staticLayout = new StaticLayout(this.c, this.f21628m, (int) (h10 + this.f21645u0), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
            h10 = h(staticLayout);
        }
        float f10 = this.W;
        if (h10 > this.f21640s - f10) {
            staticLayout = new StaticLayout(this.c, this.f21628m, Math.max((int) (this.f21640s - f10), 0), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
            h10 = h(staticLayout);
        }
        float f11 = this.S;
        int i11 = (staticLayout.getHeight() > f11 ? 1 : (staticLayout.getHeight() == f11 ? 0 : -1));
        PointF pointF = this.f21631n0;
        if (i11 < 0) {
            pointF.set(h10, f11);
        } else {
            if (this.R > 0.0f) {
                float f12 = this.R;
                if (staticLayout.getHeight() > f12) {
                    pointF.set(h10, f12);
                }
            }
            pointF.set(h10, staticLayout.getHeight());
        }
        this.f21629m0 = staticLayout;
    }

    public final void b() {
        boolean z10;
        int i10 = this.f21640s;
        if (i10 > 0 && this.f21638r > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return;
        }
        float f10 = this.f21614f * 0.003f * i10;
        this.f21612e = f10;
        this.f21628m.setTextSize(f10);
        this.f21630n.setTextSize(this.f21612e);
    }

    public final void c() {
        RectF rectF = this.D;
        RectF rectF2 = this.C;
        float f10 = rectF2.left;
        float f11 = this.f21606a0;
        rectF.set((f11 / 2.0f) + f10, (f11 / 2.0f) + rectF2.top, rectF2.right - (f11 / 2.0f), rectF2.bottom - (f11 / 2.0f));
        RectF rectF3 = this.E;
        float f12 = rectF2.left;
        float f13 = this.P;
        float m10 = a0.a.m(f11, f13, 2.0f, f12);
        float centerY = rectF2.centerY();
        float f14 = this.Q;
        rectF3.set(m10, centerY - (f14 / 2.0f), ((f11 + f13) / 2.0f) + rectF2.left, (f14 / 2.0f) + rectF2.centerY());
        RectF rectF4 = this.F;
        rectF4.set(rectF2.right - ((f11 + f13) / 2.0f), rectF2.centerY() - (f14 / 2.0f), rectF2.right - ((f11 - f13) / 2.0f), (f14 / 2.0f) + rectF2.centerY());
        this.G.set(rectF2.left, rectF3.top, rectF3.right + f13, rectF3.bottom);
        this.H.set(rectF4.left - f13, rectF4.top, rectF2.right, rectF4.bottom);
        RectF rectF5 = this.L;
        float f15 = rectF2.left;
        float m11 = a0.a.m(f11, f13, 2.0f, f15);
        float f16 = rectF2.top;
        rectF5.set(m11, a0.a.m(f11, f14, 2.0f, f16), ((f11 + f13) / 2.0f) + f15, ((f11 + f14) / 2.0f) + f16);
        this.I.set(rectF2.left, rectF2.top, rectF5.right + f13, rectF5.bottom);
        RectF rectF6 = this.M;
        float f17 = rectF2.right;
        float f18 = rectF2.top;
        rectF6.set(f17 - ((f11 + f13) / 2.0f), a0.a.m(f11, f14, 2.0f, f18), f17 - ((f11 - f13) / 2.0f), ((f11 + f14) / 2.0f) + f18);
        this.J.set(rectF6.left - f13, rectF2.top, rectF2.right, rectF6.bottom);
        RectF rectF7 = this.N;
        float f19 = rectF2.right;
        float f20 = rectF2.bottom;
        rectF7.set(f19 - ((f11 + f13) / 2.0f), f20 - ((f11 + f14) / 2.0f), f19 - ((f11 - f13) / 2.0f), f20 - ((f11 - f14) / 2.0f));
        this.K.set(rectF7.left - f13, rectF7.top, rectF2.right, rectF2.bottom);
        int i10 = this.f21654z;
        RectF rectF8 = this.B;
        if (i10 == 2) {
            float f21 = rectF2.right;
            float f22 = rectF2.bottom;
            rectF8.set(f21 - f11, f22 - f11, f21, f22);
            return;
        }
        float f23 = rectF2.left;
        float f24 = rectF2.bottom;
        rectF8.set(f23, f24 - f11, f11 + f23, f24);
    }

    public final void d(int i10, boolean z10) {
        boolean z11;
        int i11;
        int i12;
        e.a();
        this.f21614f = i10;
        if (this.f21640s > 0 && this.f21638r > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            b();
            if (z10 && (i11 = this.f21640s) > 0 && (i12 = this.f21638r) > 0) {
                k(i11, i12, i11, i12);
                c();
            }
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        boolean z10 = this.f21608b0;
        RectF rectF = this.D;
        if (z10) {
            this.f21620i.setStyle(Paint.Style.STROKE);
            float f10 = rectF.left;
            float f11 = rectF.top;
            float f12 = rectF.right;
            float f13 = rectF.bottom;
            float f14 = this.O;
            canvas.drawRoundRect(f10, f11, f12, f13, f14, f14, this.f21626l);
            float f15 = rectF.left;
            float f16 = rectF.top;
            float f17 = rectF.right;
            float f18 = rectF.bottom;
            float f19 = this.O;
            canvas.drawRoundRect(f15, f16, f17, f18, f19, f19, this.f21620i);
            this.f21620i.setStyle(Paint.Style.STROKE);
            RectF rectF2 = this.E;
            float f20 = rectF2.left;
            float f21 = (rectF2.right - f20) / 2.0f;
            float f22 = rectF2.top;
            canvas.drawCircle(f20 + f21, a0.a.m(rectF2.bottom, f22, 2.0f, f22), f21, this.f21622j);
            float f23 = rectF2.left;
            float f24 = (rectF2.right - f23) / 2.0f;
            float f25 = rectF2.top;
            canvas.drawCircle(f23 + f24, a0.a.m(rectF2.bottom, f25, 2.0f, f25), f24, this.f21620i);
            RectF rectF3 = this.F;
            float f26 = rectF3.left;
            float f27 = (rectF3.right - f26) / 2.0f;
            float f28 = rectF3.top;
            canvas.drawCircle(f26 + f27, a0.a.m(rectF3.bottom, f28, 2.0f, f28), f27, this.f21622j);
            float f29 = rectF3.left;
            float f30 = (rectF3.right - f29) / 2.0f;
            float f31 = rectF3.top;
            canvas.drawCircle(f29 + f30, a0.a.m(rectF3.bottom, f31, 2.0f, f31), f30, this.f21620i);
            RectF rectF4 = this.L;
            float f32 = rectF4.left;
            float f33 = (rectF4.right - f32) / 2.0f;
            float f34 = rectF4.top;
            canvas.drawCircle(f32 + f33, a0.a.m(rectF4.bottom, f34, 2.0f, f34), f33, this.f21622j);
            float f35 = rectF4.left;
            float f36 = (rectF4.right - f35) / 2.0f;
            float f37 = rectF4.top;
            canvas.drawCircle(f35 + f36, a0.a.m(rectF4.bottom, f37, 2.0f, f37), f36, this.f21620i);
            RectF rectF5 = this.M;
            float f38 = rectF5.left;
            float f39 = (rectF5.right - f38) / 2.0f;
            float f40 = rectF5.top;
            canvas.drawCircle(f38 + f39, a0.a.m(rectF5.bottom, f40, 2.0f, f40), f39, this.f21622j);
            float f41 = rectF5.left;
            float f42 = (rectF5.right - f41) / 2.0f;
            float f43 = rectF5.top;
            canvas.drawCircle(f41 + f42, a0.a.m(rectF5.bottom, f43, 2.0f, f43), f42, this.f21620i);
            RectF rectF6 = this.N;
            float f44 = rectF6.left;
            float f45 = (rectF6.right - f44) / 2.0f;
            float f46 = rectF6.top;
            canvas.drawCircle(f44 + f45, a0.a.m(rectF6.bottom, f46, 2.0f, f46), f45, this.f21622j);
            float f47 = rectF6.left;
            float f48 = (rectF6.right - f47) / 2.0f;
            float f49 = rectF6.top;
            canvas.drawCircle(f47 + f48, a0.a.m(rectF6.bottom, f49, 2.0f, f49), f48, this.f21620i);
            if (this.f21627l0) {
                canvas.drawBitmap(this.f21652y, this.A, this.B, this.f21632o);
            }
            int i10 = this.f21642t;
            if (i10 == 5) {
                float f50 = rectF2.left;
                float m10 = a0.a.m(rectF2.right, f50, 2.0f, f50);
                float f51 = rectF2.top;
                canvas.drawCircle(m10, a0.a.m(rectF2.bottom, f51, 2.0f, f51), getEditClickSize(), this.f21624k);
            } else if (i10 == 12) {
                float f52 = rectF4.left;
                float m11 = a0.a.m(rectF4.right, f52, 2.0f, f52);
                float f53 = rectF4.top;
                canvas.drawCircle(m11, a0.a.m(rectF4.bottom, f53, 2.0f, f53), getEditClickSize(), this.f21624k);
            } else if (i10 == 13) {
                float f54 = rectF5.left;
                float m12 = a0.a.m(rectF5.right, f54, 2.0f, f54);
                float f55 = rectF5.top;
                canvas.drawCircle(m12, a0.a.m(rectF5.bottom, f55, 2.0f, f55), getEditClickSize(), this.f21624k);
            } else if (i10 == 6) {
                float f56 = rectF3.left;
                float m13 = a0.a.m(rectF3.right, f56, 2.0f, f56);
                float f57 = rectF3.top;
                canvas.drawCircle(m13, a0.a.m(rectF3.bottom, f57, 2.0f, f57), getEditClickSize(), this.f21624k);
            } else if (i10 == 8) {
                float f58 = rectF6.left;
                float m14 = a0.a.m(rectF6.right, f58, 2.0f, f58);
                float f59 = rectF6.top;
                canvas.drawCircle(m14, a0.a.m(rectF6.bottom, f59, 2.0f, f59), getEditClickSize(), this.f21624k);
            }
        }
        canvas.save();
        canvas.translate(rectF.left + this.V, rectF.top + this.T);
        StaticLayout staticLayout = this.f21629m0;
        if (staticLayout != null) {
            PointF pointF = this.f21631n0;
            float f60 = pointF.y;
            if (staticLayout.getHeight() < f60) {
                canvas.translate(0.0f, (f60 - this.f21629m0.getHeight()) / 2.0f);
            }
            canvas.clipRect(0.0f, 0.0f, pointF.x, pointF.y, Region.Op.INTERSECT);
            this.f21629m0.draw(canvas);
        }
        canvas.restore();
    }

    public final w4.a g(float f10, float f11) {
        RectF n10;
        int width;
        int height;
        RectF rectF = this.C;
        try {
            float width2 = rectF.width();
            PointF pointF = this.f21631n0;
            float f12 = pointF.x;
            float f13 = this.W;
            if (width2 > f12 + f13) {
                float f14 = rectF.left;
                n10 = n(f11, new RectF(f14, rectF.top, pointF.x + f14 + f13, rectF.bottom));
            } else {
                n10 = n(f11, rectF);
            }
            TextPaint textPaint = new TextPaint(this.f21628m);
            textPaint.setTextSize(this.f21612e / f11);
            StaticLayout staticLayout = new StaticLayout(this.c, textPaint, Api.BaseClientBuilder.API_PRIORITY_OTHER, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
            float h10 = h(staticLayout);
            float f15 = this.R / f11;
            if (f15 <= 0.0f || staticLayout.getHeight() <= f15) {
                f15 = staticLayout.getHeight();
            }
            StaticLayout staticLayout2 = new StaticLayout(this.c, textPaint, (int) (this.f21645u0 + h10), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
            Bitmap createBitmap = Bitmap.createBitmap((int) h10, (int) f15, Bitmap.Config.ARGB_4444);
            Canvas canvas = new Canvas(createBitmap);
            canvas.setDrawFilter(new PaintFlagsDrawFilter(0, 3));
            staticLayout2.draw(canvas);
            int i10 = this.f21637q0 - this.f21639r0;
            if (i10 != 0) {
                int i11 = i10 % 360;
                if (i11 < 0) {
                    i11 += 360;
                }
                Matrix matrix = new Matrix();
                matrix.setRotate(i11);
                RectF rectF2 = new RectF(0.0f, 0.0f, createBitmap.getWidth(), createBitmap.getHeight());
                matrix.mapRect(rectF2);
                width = (int) rectF2.width();
                height = (int) rectF2.height();
            } else {
                width = createBitmap.getWidth();
                height = createBitmap.getHeight();
            }
            float f16 = width / 2.0f;
            float f17 = height / 2.0f;
            return new w4.a(createBitmap, n(f10, new RectF(n10.centerX() - f16, n10.centerY() - f17, n10.centerX() + f16, n10.centerY() + f17)));
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public int getAlphaValue() {
        return this.f21644u;
    }

    public RectF getBoxFrame() {
        return new RectF(this.D);
    }

    public String getContentWithNewLine() {
        return this.c;
    }

    public long getCopyRootParentId() {
        return this.f21623j0;
    }

    public float getFontSize() {
        return this.f21612e;
    }

    public RectF getFrame() {
        return new RectF(this.C);
    }

    public int getOriginFontSize() {
        return this.f21614f;
    }

    public String getRecordContentWithNewLine() {
        return this.f21610d;
    }

    public int getRecordFontSize() {
        return this.f21616g;
    }

    public RectF getRecordFrame() {
        return this.A0;
    }

    public int getSavedTextIndexInFreeTextAnnotationDatas() {
        return this.f21613e0;
    }

    public String getText() {
        return this.f21605a;
    }

    public int getTextColor() {
        return this.f21646v;
    }

    public long get_id() {
        return this.f21609c0;
    }

    public final boolean i() {
        int i10 = this.f21642t;
        if (i10 != 8 && i10 != 12 && i10 != 13) {
            return false;
        }
        return true;
    }

    public final void j(int i10) {
        int i11 = this.f21645u0;
        int i12 = 0;
        if (i10 < 0) {
            if (!TextUtils.isEmpty(this.c)) {
                StringBuilder sb2 = new StringBuilder();
                char[] charArray = this.c.toCharArray();
                int length = charArray.length;
                char c = ' ';
                while (i12 < length) {
                    char c10 = charArray[i12];
                    if (c != '\n' && c != ' ' && c10 != '\n' && c10 != ' ') {
                        sb2.append('\n');
                    }
                    sb2.append(c10);
                    i12++;
                    c = c10;
                }
                this.c = sb2.toString();
            }
            l((int) (this.f21631n0.x + i11));
            return;
        }
        StaticLayout staticLayout = new StaticLayout(this.f21605a, this.f21628m, i10, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
        int lineCount = staticLayout.getLineCount();
        StringBuilder sb3 = new StringBuilder();
        while (i12 < lineCount) {
            String substring = this.f21605a.substring(staticLayout.getLineStart(i12), staticLayout.getLineEnd(i12));
            sb3.append(substring);
            if (!substring.endsWith("\n") && i12 != lineCount - 1) {
                sb3.append("\n");
            }
            i12++;
        }
        this.c = sb3.toString();
        l((int) (h(staticLayout) + i11));
    }

    public final void k(int i10, int i11, int i12, int i13) {
        a(Api.BaseClientBuilder.API_PRIORITY_OTHER, true);
        PointF pointF = this.f21631n0;
        float f10 = pointF.x + this.W;
        float f11 = pointF.y + this.U;
        RectF rectF = this.C;
        if (this.f21654z == 2) {
            float f12 = i10;
            float f13 = (rectF.right / i12) * f12;
            float f14 = (rectF.top / i13) * i11;
            rectF.set(f13 - f10, f14, f13, f11 + f14);
            if (rectF.left > f12 - (rectF.width() / 2.0f)) {
                f(rectF, (f12 - (rectF.width() / 2.0f)) - rectF.left, 0.0f);
            }
        } else {
            float f15 = (rectF.left / i12) * i10;
            float f16 = (rectF.top / i13) * i11;
            rectF.set(f15, f16, f10 + f15, f11 + f16);
            if (rectF.right < rectF.width() / 2.0f) {
                f(rectF, (rectF.width() / 2.0f) - rectF.right, 0.0f);
            }
        }
        if (rectF.bottom < rectF.height() / 2.0f) {
            f(rectF, 0.0f, (rectF.height() / 2.0f) - rectF.bottom);
        }
    }

    public final void l(int i10) {
        if (i10 < 0) {
            i10 = (int) (this.f21612e + this.f21645u0);
        }
        a(i10, false);
    }

    public final void m(String str, String str2, int i10, int i11, RectF rectF) {
        e.a();
        this.f21605a = str;
        this.c = str2;
        setFontSize(i10);
        setTextColor(i11);
        a(Api.BaseClientBuilder.API_PRIORITY_OTHER, true);
        RectF rectF2 = this.C;
        float f10 = rectF.left;
        float f11 = rectF.top;
        PointF pointF = this.f21631n0;
        rectF2.set(f10, f11, pointF.x + f10 + this.W, pointF.y + f11 + this.U);
        c();
        b bVar = this.f21615f0;
        if (bVar != null) {
            PDFPageView.i iVar = (PDFPageView.i) bVar;
            PDFPageView.f2(PDFPageView.this, iVar.f21215a);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f21641s0.removeCallbacksAndMessages(null);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        boolean z10;
        float centerX;
        float f10;
        float centerY;
        super.onMeasure(i10, i11);
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        if (size > 0 && size2 > 0) {
            int i12 = this.f21640s;
            if (size != i12 || size2 != this.f21638r) {
                int i13 = this.f21638r;
                this.f21640s = size;
                this.f21638r = size2;
                float f11 = size2;
                float f12 = this.U;
                this.R = f11 - f12;
                b();
                RectF rectF = this.C;
                float f13 = 0.0f;
                if (rectF.width() == 0.0f && rectF.height() == 0.0f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    c cVar = this.f21619h0;
                    PointF pointF = this.f21631n0;
                    float f14 = this.W;
                    if (cVar != null) {
                        RectF rectF2 = cVar.f21757b;
                        if (rectF2 != null) {
                            float f15 = rectF2.right;
                            float f16 = size;
                            if (f15 > f16) {
                                float f17 = f15 - f16;
                                rectF2.left -= f17;
                                rectF2.right = f15 - f17;
                            }
                            float f18 = rectF2.bottom;
                            if (f18 > f11) {
                                float f19 = f18 - f11;
                                rectF2.top -= f19;
                                rectF2.bottom = f18 - f19;
                            }
                        }
                        if (rectF2.width() - f14 > 0.0f) {
                            this.c = this.f21619h0.f21758d;
                            a(Api.BaseClientBuilder.API_PRIORITY_OTHER, true);
                            float f20 = rectF2.left;
                            float f21 = rectF2.top;
                            rectF.set(f20, f21, pointF.x + f20 + f14, pointF.y + f21 + f12);
                            this.f21621i0 = this.f21619h0.f21756a;
                            this.f21619h0 = null;
                            this.f21625k0 = true;
                        }
                    }
                    float f22 = size;
                    float f23 = 0.7f * f22;
                    j((int) f23);
                    float f24 = pointF.x + f14;
                    float f25 = pointF.y + f12;
                    if (this.f21617g0.width() >= f23) {
                        centerX = this.f21617g0.centerX() - (f24 / 2.0f);
                    } else {
                        float f26 = f24 / 2.0f;
                        if (this.f21617g0.centerX() + f26 > f22) {
                            centerX = f22 - f24;
                        } else if (this.f21617g0.centerX() - f26 < 0.0f) {
                            centerX = 0.0f;
                        } else {
                            centerX = this.f21617g0.centerX() - f26;
                        }
                    }
                    if (this.f21617g0.height() >= f25) {
                        centerY = this.f21617g0.centerY();
                        f10 = f25 / 2.0f;
                    } else {
                        f10 = f25 / 2.0f;
                        if (this.f21617g0.centerY() + f10 > f11) {
                            f13 = f11 - f25;
                        } else if (this.f21617g0.centerY() - f10 >= 0.0f) {
                            centerY = this.f21617g0.centerY();
                        }
                        rectF.set(centerX, f13, f24 + centerX, f25 + f13);
                    }
                    f13 = centerY - f10;
                    rectF.set(centerX, f13, f24 + centerX, f25 + f13);
                } else if (i12 > 0 && i13 > 0) {
                    k(size, size2, i12, i13);
                } else {
                    k(size, size2, size, size2);
                }
                c();
                if (this.f21625k0) {
                    this.f21625k0 = false;
                    b bVar = this.f21615f0;
                    if (bVar != null) {
                        long j10 = this.f21621i0;
                        PDFPageView.i iVar = (PDFPageView.i) bVar;
                        PDFPageView pDFPageView = PDFPageView.this;
                        pDFPageView.G0.updateCurEditPDFPageView(pDFPageView);
                        PDFPageView.Z1(pDFPageView, iVar.f21215a, j10);
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01dc, code lost:
        if (r2 >= (-90.0f)) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01e8, code lost:
        if (r2 <= 90.0f) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01ea, code lost:
        r2 = java.lang.Math.min(r28.f21648w, r28.f21650x);
        r28.f21648w = r2;
        r28.f21650x = r2;
        r28.f21653y0 += r2;
        r28.f21655z0 += r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00d6, code lost:
        if (r2 <= 90.0f) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00e2, code lost:
        if (r2 >= (-90.0f)) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00e4, code lost:
        r2 = java.lang.Math.min(r28.f21648w, r28.f21650x);
        r28.f21648w = r2;
        r28.f21650x = r2;
        r28.f21653y0 += r2;
        r28.f21655z0 += r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0106, code lost:
        if (r2 >= (-180.0f)) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0112, code lost:
        if (r2 <= 180.0f) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0114, code lost:
        r2 = java.lang.Math.max(r28.f21648w, r28.f21650x);
        r28.f21648w = r2;
        r28.f21650x = r2;
        r28.f21653y0 += r2;
        r28.f21655z0 += r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0144, code lost:
        if (r2 >= (-180.0f)) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0150, code lost:
        if (r2 <= 180.0f) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0152, code lost:
        r2 = java.lang.Math.min(r28.f21648w, r28.f21650x);
        r28.f21648w = r2;
        r28.f21650x = r2;
        r28.f21653y0 += r2;
        r28.f21655z0 += r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0174, code lost:
        if (r2 <= 90.0f) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0180, code lost:
        if (r2 >= (-90.0f)) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0182, code lost:
        r2 = java.lang.Math.max(r28.f21648w, r28.f21650x);
        r28.f21648w = r2;
        r28.f21650x = r2;
        r28.f21653y0 += r2;
        r28.f21655z0 += r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01ad, code lost:
        if (r2 <= 180.0f) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01b9, code lost:
        if (r2 >= (-180.0f)) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01bb, code lost:
        r2 = java.lang.Math.max(r28.f21648w, r28.f21650x);
        r28.f21648w = r2;
        r28.f21650x = r2;
        r28.f21653y0 += r2;
        r28.f21655z0 += r2;
     */
    /* JADX WARN: Removed duplicated region for block: B:310:0x0565  */
    /* JADX WARN: Removed duplicated region for block: B:431:0x07da  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r29) {
        /*
            Method dump skipped, instructions count: 2084
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: lib.zj.pdfeditor.text.PDFFreeTextEditView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setAnnotRotate(int i10) {
        this.f21639r0 = i10;
    }

    public void setCopyParam(c cVar) {
        this.f21619h0 = cVar;
    }

    public void setCopyRootParentId(long j10) {
        this.f21623j0 = j10;
    }

    public void setFontSize(int i10) {
        boolean z10;
        e.a();
        this.f21614f = i10;
        if (this.f21640s > 0 && this.f21638r > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            b();
        }
    }

    public void setFrameColor(int i10) {
        this.f21618h = i10;
    }

    public void setOnAdjustListener(b bVar) {
        this.f21615f0 = bVar;
    }

    public void setPageRotate(int i10) {
        this.f21637q0 = i10;
    }

    public void setSavedForUpdate(boolean z10) {
        this.f21611d0 = z10;
    }

    public void setSavedTextIndexInFreeTextAnnotationDatas(int i10) {
        this.f21613e0 = i10;
    }

    public void setShowBox(boolean z10) {
        this.f21608b0 = z10;
        invalidate();
        b bVar = this.f21615f0;
        if (bVar != null) {
            if (this.f21608b0) {
                PDFPageView.i iVar = (PDFPageView.i) bVar;
                PDFPageView.f2(PDFPageView.this, iVar.f21215a);
                return;
            }
            ((PDFPageView.i) bVar).b();
        }
    }

    public void setShowCopyButton(boolean z10) {
        this.f21627l0 = z10;
    }

    public void setText(String str) {
        boolean z10;
        float f10;
        e.a();
        this.f21605a = str;
        this.f21607b = str;
        RectF rectF = this.C;
        if (rectF.width() == 0.0f && rectF.height() == 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return;
        }
        float f11 = rectF.left;
        int i10 = (f11 > 0.0f ? 1 : (f11 == 0.0f ? 0 : -1));
        float f12 = this.W;
        if (i10 > 0) {
            f10 = (this.f21640s - f11) - f12;
        } else {
            f10 = this.f21640s - f12;
        }
        j((int) f10);
        float f13 = rectF.left;
        PointF pointF = this.f21631n0;
        rectF.right = f13 + pointF.x + f12;
        rectF.bottom = rectF.top + pointF.y + this.U;
        c();
    }

    public void setTextAlpha(int i10) {
        this.f21644u = i10;
        int i11 = ((i10 << 24) + 16777215) & this.f21646v;
        this.f21646v = i11;
        this.f21628m.setColor(i11);
    }

    public void setTextColor(int i10) {
        e.a();
        this.f21646v = i10;
        this.f21628m.setColor(i10);
    }

    public void setViewScale(float f10) {
        if (f10 == this.f21635p0) {
            return;
        }
        this.f21635p0 = f10;
        Handler handler = this.f21641s0;
        a aVar = this.f21643t0;
        handler.removeCallbacks(aVar);
        handler.post(aVar);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        if (i10 == 0) {
            PDFPageView.i iVar = (PDFPageView.i) this.f21615f0;
            PDFPageView.f2(PDFPageView.this, iVar.f21215a);
            return;
        }
        ((PDFPageView.i) this.f21615f0).b();
    }

    public void setVisibleRect(Rect rect) {
        this.f21617g0 = rect;
    }

    public void set_id(long j10) {
        this.f21609c0 = j10;
    }

    public PDFFreeTextEditView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PDFFreeTextEditView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Bitmap bitmap;
        this.f21605a = "";
        this.f21607b = "";
        this.c = "";
        this.f21610d = "";
        this.f21614f = 16;
        this.f21616g = 16;
        this.f21608b0 = true;
        this.f21611d0 = false;
        this.f21613e0 = -1;
        this.f21625k0 = false;
        this.f21627l0 = true;
        this.f21631n0 = new PointF();
        this.f21633o0 = new PointF();
        this.f21635p0 = 1.0f;
        this.f21641s0 = new Handler(Looper.getMainLooper());
        this.f21643t0 = new a();
        this.f21645u0 = 1;
        this.A0 = new RectF();
        this.B0 = false;
        this.C0 = false;
        this.D0 = false;
        this.E0 = false;
        Locale locale = context.getResources().getConfiguration().locale;
        int i11 = f.f30479a;
        if (f.a.a(locale) == 1) {
            this.f21654z = 2;
        }
        Drawable drawable = androidx.core.content.a.getDrawable(context, R.drawable.ic_preview_add_text_copy);
        if (drawable == null) {
            bitmap = null;
        } else if (drawable instanceof BitmapDrawable) {
            bitmap = ((BitmapDrawable) drawable).getBitmap();
        } else {
            Bitmap createBitmap = Bitmap.createBitmap(e(context, 24.0f), e(context, 24.0f), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            drawable.draw(canvas);
            bitmap = createBitmap;
        }
        this.f21652y = bitmap;
        this.A = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
        this.f21612e = (int) ((this.f21614f * context.getResources().getDisplayMetrics().scaledDensity) + 0.5f);
        this.f21646v = -65536;
        this.f21644u = FunctionEval.FunctionID.EXTERNAL_FUNC;
        this.f21618h = -2285526;
        float width = bitmap.getWidth();
        this.f21606a0 = width;
        this.O = e(context, 2.0f);
        e(context, 3.5f);
        this.P = e(context, 10.0f);
        float e10 = e(context, 28.0f);
        this.Q = e10;
        float e11 = e(context, 10.0f);
        this.T = e11;
        float e12 = e(context, 20.0f);
        this.V = e12;
        float f10 = e11 * 2.0f;
        this.U = f10 + width;
        this.W = (e12 * 2.0f) + width;
        this.S = (e10 + width) - f10;
        this.f21648w = 0.0f;
        this.f21650x = 0.0f;
        this.f21642t = 0;
        this.f21645u0 = getResources().getDimensionPixelSize(R.dimen.dp_1);
        getResources().getDimensionPixelSize(R.dimen.dp_2);
        this.C = new RectF();
        this.D = new RectF();
        this.B = new RectF();
        this.E = new RectF();
        this.F = new RectF();
        this.G = new RectF();
        this.H = new RectF();
        this.L = new RectF();
        this.M = new RectF();
        this.I = new RectF();
        this.J = new RectF();
        this.N = new RectF();
        this.K = new RectF();
        setWillNotDraw(false);
        Paint paint = new Paint();
        this.f21620i = paint;
        paint.setAntiAlias(true);
        this.f21620i.setStyle(Paint.Style.STROKE);
        this.f21620i.setColor(this.f21618h);
        this.f21620i.setStrokeWidth(e(context, 1.0f));
        Paint paint2 = new Paint();
        this.f21622j = paint2;
        paint2.setAntiAlias(true);
        this.f21622j.setStyle(Paint.Style.FILL);
        this.f21622j.setColor(-1);
        Paint paint3 = new Paint();
        this.f21624k = paint3;
        paint3.setAntiAlias(true);
        this.f21624k.setStyle(Paint.Style.FILL);
        this.f21624k.setColor(-2141034898);
        Paint paint4 = new Paint();
        this.f21626l = paint4;
        paint4.setAntiAlias(true);
        this.f21626l.setStyle(Paint.Style.FILL);
        this.f21626l.setColor(0);
        Paint paint5 = new Paint();
        this.f21632o = paint5;
        paint5.setAntiAlias(true);
        this.f21632o.setStyle(Paint.Style.FILL);
        this.f21632o.setColor(-1);
        TextPaint textPaint = new TextPaint();
        this.f21628m = textPaint;
        textPaint.setAntiAlias(true);
        this.f21628m.setColor(this.f21646v);
        this.f21628m.setStyle(Paint.Style.FILL);
        this.f21628m.setTextSize(this.f21612e);
        this.f21630n = new TextPaint(this.f21628m);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
    }
}
