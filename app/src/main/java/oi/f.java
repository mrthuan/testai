package oi;

import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.PathEffect;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Looper;
import com.google.android.play.core.assetpacks.j1;
import java.util.ArrayList;
import lib.zj.office.PathHolder;
import lib.zj.office.ss.control.Spreadsheet;
import lib.zj.office.system.beans.CalloutView.CalloutView;
import pdf.pdfreader.viewer.editor.free.utils.t0;

/* compiled from: SheetView.java */
/* loaded from: classes3.dex */
public final class f {

    /* renamed from: b  reason: collision with root package name */
    public ei.c f23076b;

    /* renamed from: e  reason: collision with root package name */
    public final Spreadsheet f23078e;

    /* renamed from: g  reason: collision with root package name */
    public Rect f23080g;

    /* renamed from: h  reason: collision with root package name */
    public float f23081h;

    /* renamed from: i  reason: collision with root package name */
    public float f23082i;

    /* renamed from: l  reason: collision with root package name */
    public final b f23085l;

    /* renamed from: p  reason: collision with root package name */
    public boolean f23089p;

    /* renamed from: q  reason: collision with root package name */
    public ki.c f23090q;

    /* renamed from: s  reason: collision with root package name */
    public i0.a f23092s;

    /* renamed from: a  reason: collision with root package name */
    public final Handler f23075a = new Handler(Looper.getMainLooper());

    /* renamed from: f  reason: collision with root package name */
    public float f23079f = 1.0f;

    /* renamed from: m  reason: collision with root package name */
    public final ki.e f23086m = new ki.e();

    /* renamed from: r  reason: collision with root package name */
    public final DashPathEffect f23091r = new DashPathEffect(new float[]{5.0f, 5.0f, 5.0f, 5.0f}, 1.0f);

    /* renamed from: t  reason: collision with root package name */
    public final ArrayList f23093t = new ArrayList();
    public final d c = new d(this);

    /* renamed from: d  reason: collision with root package name */
    public final c f23077d = new c(this);

    /* renamed from: j  reason: collision with root package name */
    public final j1 f23083j = new j1(this);

    /* renamed from: k  reason: collision with root package name */
    public final k3.e f23084k = new k3.e(this);

    /* renamed from: o  reason: collision with root package name */
    public final ci.a f23088o = new ci.a(0, 0, 0, 0);

    /* renamed from: n  reason: collision with root package name */
    public final ki.a f23087n = new ki.a();

    /* compiled from: SheetView.java */
    /* loaded from: classes3.dex */
    public class a {

        /* renamed from: a  reason: collision with root package name */
        public final ei.a f23094a;

        /* renamed from: b  reason: collision with root package name */
        public RectF f23095b;
        public final float c;

        /* renamed from: d  reason: collision with root package name */
        public final float f23096d;

        /* renamed from: e  reason: collision with root package name */
        public final Object f23097e;

        public a(ei.a aVar, RectF rectF, float f10, float f11, Object obj) {
            this.f23094a = aVar;
            this.f23095b = rectF;
            this.c = f10;
            this.f23096d = f11;
            if (obj instanceof String) {
                this.f23097e = ((String) obj).intern();
            } else {
                this.f23097e = obj;
            }
        }
    }

    public f(Spreadsheet spreadsheet, ei.c cVar) {
        this.f23085l = null;
        this.f23078e = spreadsheet;
        this.f23076b = cVar;
        this.f23085l = new b(this);
        k();
    }

    public final void a(Canvas canvas) {
        mi.a aVar = mi.a.f22038b;
        ei.c cVar = this.f23076b;
        RectF b10 = aVar.b(this, cVar.f16603d, cVar.f16604e);
        short s4 = this.f23076b.f16610k;
        oi.a aVar2 = this.f23085l.f23059b;
        aVar2.getClass();
        Rect clipBounds = canvas.getClipBounds();
        f fVar = aVar2.f23057a;
        clipBounds.left = fVar.c.f23072b;
        clipBounds.top = fVar.f23077d.f23069b;
        canvas.save();
        canvas.clipRect(clipBounds);
        Paint a10 = sg.d.f29801b.a();
        int color = a10.getColor();
        a10.setColor(-2285526);
        a10.setStyle(Paint.Style.FILL_AND_STROKE);
        a10.setStrokeWidth(2.0f);
        if (s4 == 0) {
            float f10 = b10.left;
            if (f10 != b10.right) {
                float f11 = b10.top;
                float f12 = b10.bottom;
                if (f11 != f12) {
                    float f13 = t0.f28774g;
                    canvas.drawRect(f10 - f13, f11 - f13, (f13 / 2.0f) + f10, f13 + f12, a10);
                    float f14 = b10.left;
                    float f15 = t0.f28774g;
                    float f16 = f14 - f15;
                    float f17 = b10.top;
                    canvas.drawRect(f16, f17 - f15, f15 + b10.right, (f15 / 2.0f) + f17, a10);
                    float f18 = b10.right;
                    float f19 = t0.f28774g;
                    canvas.drawRect(f18 - (f19 / 2.0f), b10.top - f19, f18 + f19, b10.bottom + f19, a10);
                    float f20 = b10.left;
                    float f21 = t0.f28774g;
                    float f22 = f20 - f21;
                    float f23 = b10.bottom;
                    canvas.drawRect(f22, f23 - (f21 / 2.0f), b10.right + f21, f23 + f21, a10);
                    a10.setColor(color);
                    canvas.restore();
                }
            }
        }
        if (s4 == 1) {
            float f24 = b10.top;
            if (f24 != b10.bottom) {
                canvas.drawRect(clipBounds.left - 2, f24 - 2.0f, clipBounds.right + 10, f24 + 1.0f, a10);
                float f25 = b10.bottom;
                canvas.drawRect(clipBounds.left - 2, f25 - 1.0f, clipBounds.right + 10, f25 + 2.0f, a10);
                a10.setColor(color);
                canvas.restore();
            }
        }
        if (s4 == 2) {
            float f26 = b10.left;
            if (f26 != b10.right) {
                canvas.drawRect(f26 - 2.0f, clipBounds.top - 2, f26 + 1.0f, clipBounds.bottom + 2, a10);
                float f27 = b10.right;
                canvas.drawRect(f27 - 1.0f, clipBounds.top - 2, f27 + 2.0f, clipBounds.bottom + 2, a10);
            }
        }
        a10.setColor(color);
        canvas.restore();
    }

    public final void b(Canvas canvas) {
        if (this.f23089p && this.f23090q != null) {
            Paint a10 = sg.d.f29801b.a();
            int color = a10.getColor();
            PathEffect pathEffect = a10.getPathEffect();
            Rect clipBounds = canvas.getClipBounds();
            a10.setColor(-16777216);
            a10.setStyle(Paint.Style.STROKE);
            PathHolder pathHolder = new PathHolder();
            ki.c cVar = this.f23090q;
            short s4 = cVar.f19771a;
            if (s4 == 1) {
                pathHolder.moveTo(0.0f, cVar.f19773d.bottom);
                pathHolder.lineTo(clipBounds.right, this.f23090q.f19773d.bottom);
            } else if (s4 == 2) {
                pathHolder.moveTo(cVar.f19773d.right, 0.0f);
                pathHolder.lineTo(this.f23090q.f19773d.right, clipBounds.bottom);
            }
            a10.setPathEffect(this.f23091r);
            canvas.drawPath(pathHolder, a10);
            a10.setPathEffect(pathEffect);
            a10.setStyle(Paint.Style.FILL);
            a10.setColor(color);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a9, code lost:
        if (r9 == false) goto L207;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x03d6  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0422  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0425  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0468  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(android.graphics.Canvas r30) {
        /*
            Method dump skipped, instructions count: 1282
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: oi.f.c(android.graphics.Canvas):void");
    }

    public final void d(Canvas canvas) {
        synchronized (this) {
            this.f23078e.c = false;
            this.f23080g = canvas.getClipBounds();
            int b10 = this.f23077d.b(canvas, this.f23079f);
            int c = this.c.c(canvas, this.f23079f);
            Rect rect = this.f23080g;
            int i10 = rect.right;
            int i11 = i10 + 10;
            if (b10 >= i10) {
                b10 = i11;
            }
            int i12 = rect.bottom;
            int i13 = i12 + 50;
            if (c >= i12) {
                c = i13;
            }
            this.c.b(canvas, b10, this.f23079f);
            this.f23077d.a(canvas, c, this.f23079f);
            canvas.save();
            canvas.clipRect(this.c.f23072b, this.f23077d.f23069b, b10, c);
            c(canvas);
            this.f23084k.d(canvas);
            a(canvas);
            this.f23083j.b(canvas);
            b(canvas);
            canvas.restore();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x003c, code lost:
        return r5 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int e(ei.b r4, int r5, float r6) {
        /*
            r3 = this;
        L0:
            int r5 = r5 + (-1)
            if (r5 < 0) goto L3a
            r0 = 0
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 <= 0) goto L3a
            r0 = 0
            ei.a r0 = r4.e(r5, r0)
            if (r0 == 0) goto L2f
            int r1 = r0.g()
            if (r1 >= 0) goto L2c
            mi.a r1 = mi.a.f22038b
            ei.c r2 = r3.f23076b
            ei.d r2 = r2.f16601a
            r1.getClass()
            java.lang.String r0 = mi.a.f(r2, r0)
            if (r0 == 0) goto L2f
            int r0 = r0.length()
            if (r0 != 0) goto L2c
            goto L2f
        L2c:
            int r5 = r5 + 1
            return r5
        L2f:
            ei.c r0 = r3.f23076b
            float r0 = r0.d(r5)
            float r1 = r3.f23079f
            float r0 = r0 * r1
            float r6 = r6 - r0
            goto L0
        L3a:
            int r5 = r5 + 1
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: oi.f.e(ei.b, int, float):int");
    }

    public final int f(ei.b bVar, int i10, float f10) {
        while (true) {
            i10++;
            if (f10 > 0.0f) {
                ei.a e10 = bVar.e(i10, false);
                if (e10 != null) {
                    if (e10.g() >= 0) {
                        break;
                    }
                    mi.a aVar = mi.a.f22038b;
                    ei.d dVar = this.f23076b.f16601a;
                    aVar.getClass();
                    String f11 = mi.a.f(dVar, e10);
                    if (f11 != null && f11.length() != 0) {
                        break;
                    }
                }
                f10 -= this.f23076b.d(i10) * this.f23079f;
            } else {
                return i10 - 1;
            }
        }
        return i10 - 1;
    }

    public final int g(int i10) {
        return (int) Math.round(this.f23076b.f16601a.k(0).f32142b * 2.0d * i10 * 1.3333333730697632d * this.f23079f);
    }

    public final int h() {
        ei.c cVar = this.f23076b;
        return cVar.f16601a.r(cVar) + 1;
    }

    public final void i(int i10, int i11) {
        mi.a aVar = mi.a.f22038b;
        ei.c cVar = this.f23076b;
        aVar.getClass();
        Rect rect = new Rect();
        rect.left = Math.round(mi.a.g(cVar, i11, 0));
        rect.top = Math.round(mi.a.i(cVar, i10, 0));
        rect.right = Math.round(mi.a.g(cVar, i11 + 1, 0));
        rect.bottom = Math.round(mi.a.i(cVar, i10 + 1, 0));
        float f10 = rect.left;
        float f11 = rect.top;
        synchronized (this) {
            this.f23081h = f10;
            this.f23081h = Math.min(this.f23076b.f16605f, Math.max(0.0f, f10));
            this.f23082i = f11;
            this.f23082i = Math.min(this.f23076b.f16606g, Math.max(0.0f, f11));
            ei.c cVar2 = this.f23076b;
            int round = Math.round(this.f23081h);
            int round2 = Math.round(this.f23082i);
            cVar2.f16607h = round;
            cVar2.f16608i = round2;
            this.f23086m.a(this.f23076b, Math.round(this.f23081h), Math.round(this.f23082i));
        }
    }

    public final void j(ei.a aVar) {
        int i10;
        int i11;
        if (aVar == null) {
            return;
        }
        int i12 = aVar.f16590d;
        int i13 = aVar.c;
        if (i12 > 0) {
            i10 = i12 - 1;
        } else {
            i10 = i12;
        }
        if (i13 > 0) {
            i11 = i13 - 1;
        } else {
            i11 = i13;
        }
        this.f23076b.n(i13, i12);
        n(aVar.c, aVar.f16590d);
        i(i11, i10);
        Spreadsheet spreadsheet = this.f23078e;
        spreadsheet.postInvalidate();
        spreadsheet.getControl().r(20, null);
        spreadsheet.getControl().r(536870922, null);
    }

    public final void k() {
        ei.c cVar = this.f23076b;
        float f10 = cVar.f16607h;
        this.f23081h = f10;
        this.f23082i = cVar.f16608i;
        this.f23086m.a(cVar, Math.round(f10), Math.round(this.f23082i));
        o(this.f23076b.f16611l, true);
        this.f23078e.getControl().r(536870919, this.f23087n);
    }

    public final void l() {
        Spreadsheet spreadsheet = this.f23078e;
        if (spreadsheet.getCalloutView() != null) {
            spreadsheet.getCalloutView().setZoom(this.f23079f);
            float f10 = this.f23081h;
            float f11 = this.f23079f;
            int i10 = (int) (f10 * f11);
            int i11 = (int) (this.f23082i * f11);
            spreadsheet.getCalloutView().layout(this.c.f23072b - i10, this.f23077d.f23069b - i11, spreadsheet.getCalloutView().getRight(), spreadsheet.getCalloutView().getBottom());
            CalloutView calloutView = spreadsheet.getCalloutView();
            calloutView.f20982g = i10;
            calloutView.f20983h = i11;
        }
    }

    public final void m(float f10, float f11) {
        synchronized (this) {
            float f12 = (f10 / this.f23079f) + this.f23081h;
            this.f23081h = f12;
            this.f23081h = Math.min(this.f23076b.f16605f, Math.max(0.0f, f12));
            float f13 = (f11 / this.f23079f) + this.f23082i;
            this.f23082i = f13;
            this.f23082i = Math.min(this.f23076b.f16606g, Math.max(0.0f, f13));
            ei.c cVar = this.f23076b;
            int round = Math.round(this.f23081h);
            int round2 = Math.round(this.f23082i);
            cVar.f16607h = round;
            cVar.f16608i = round2;
            this.f23086m.a(this.f23076b, Math.round(this.f23081h), Math.round(this.f23082i));
            l();
        }
    }

    public final void n(int i10, int i11) {
        ei.b g10 = this.f23076b.g(i10);
        ci.a aVar = this.f23088o;
        if (g10 != null && g10.e(i11, true) != null && g10.e(i11, true).g() >= 0) {
            ci.a f10 = this.f23076b.f(g10.e(i11, true).g());
            aVar.f5690a = f10.f5690a;
            aVar.c = f10.c;
            aVar.f5691b = f10.f5691b;
            aVar.f5692d = f10.f5692d;
        } else {
            aVar.f5690a = i10;
            aVar.c = i10;
            aVar.f5691b = i11;
            aVar.f5692d = i11;
        }
        this.f23076b.n(aVar.f5690a, aVar.f5691b);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x009e A[Catch: all -> 0x00b0, TryCatch #0 {, blocks: (B:3:0x0001, B:6:0x0009, B:12:0x0021, B:26:0x0083, B:28:0x009e, B:30:0x00a2, B:15:0x003c, B:18:0x0053, B:20:0x0067, B:22:0x006f), top: B:36:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void o(float r6, boolean r7) {
        /*
            r5 = this;
            monitor-enter(r5)
            float r0 = r5.f23079f     // Catch: java.lang.Throwable -> Lb0
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r0 >= 0) goto L82
            if (r7 != 0) goto L82
            android.graphics.Rect r7 = r5.f23080g     // Catch: java.lang.Throwable -> Lb0
            int r7 = r7.bottom     // Catch: java.lang.Throwable -> Lb0
            lib.zj.office.ss.control.Spreadsheet r0 = r5.f23078e     // Catch: java.lang.Throwable -> Lb0
            int r0 = r0.getBottomBarHeight()     // Catch: java.lang.Throwable -> Lb0
            int r7 = r7 - r0
            ei.c r0 = r5.f23076b     // Catch: java.lang.Throwable -> Lb0
            short r1 = r0.f16610k     // Catch: java.lang.Throwable -> Lb0
            r2 = 1
            if (r1 == 0) goto L53
            if (r1 == r2) goto L3c
            r7 = 2
            if (r1 == r7) goto L21
            goto L82
        L21:
            mi.a r7 = mi.a.f22038b     // Catch: java.lang.Throwable -> Lb0
            int r0 = r0.f16604e     // Catch: java.lang.Throwable -> Lb0
            int r0 = r0 + r2
            ki.e r1 = r5.f23086m     // Catch: java.lang.Throwable -> Lb0
            double r3 = r1.f19785h     // Catch: java.lang.Throwable -> Lb0
            float r1 = (float) r3     // Catch: java.lang.Throwable -> Lb0
            r7.getClass()     // Catch: java.lang.Throwable -> Lb0
            float r7 = mi.a.h(r5, r0, r1)     // Catch: java.lang.Throwable -> Lb0
            android.graphics.Rect r0 = r5.f23080g     // Catch: java.lang.Throwable -> Lb0
            int r0 = r0.right     // Catch: java.lang.Throwable -> Lb0
            float r0 = (float) r0     // Catch: java.lang.Throwable -> Lb0
            int r7 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r7 >= 0) goto L82
            goto L83
        L3c:
            mi.a r1 = mi.a.f22038b     // Catch: java.lang.Throwable -> Lb0
            int r0 = r0.f16603d     // Catch: java.lang.Throwable -> Lb0
            int r0 = r0 + r2
            ki.e r3 = r5.f23086m     // Catch: java.lang.Throwable -> Lb0
            double r3 = r3.f19784g     // Catch: java.lang.Throwable -> Lb0
            float r3 = (float) r3     // Catch: java.lang.Throwable -> Lb0
            r1.getClass()     // Catch: java.lang.Throwable -> Lb0
            float r0 = mi.a.j(r5, r0, r3)     // Catch: java.lang.Throwable -> Lb0
            float r7 = (float) r7     // Catch: java.lang.Throwable -> Lb0
            int r7 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r7 >= 0) goto L82
            goto L83
        L53:
            mi.a r1 = mi.a.f22038b     // Catch: java.lang.Throwable -> Lb0
            int r3 = r0.f16603d     // Catch: java.lang.Throwable -> Lb0
            int r0 = r0.f16604e     // Catch: java.lang.Throwable -> Lb0
            android.graphics.RectF r0 = r1.b(r5, r3, r0)     // Catch: java.lang.Throwable -> Lb0
            float r1 = r0.width()     // Catch: java.lang.Throwable -> Lb0
            r3 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 <= 0) goto L82
            float r1 = r0.height()     // Catch: java.lang.Throwable -> Lb0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 <= 0) goto L82
            android.graphics.Rect r1 = r5.f23080g     // Catch: java.lang.Throwable -> Lb0
            int r3 = r1.left     // Catch: java.lang.Throwable -> Lb0
            float r3 = (float) r3     // Catch: java.lang.Throwable -> Lb0
            int r4 = r1.top     // Catch: java.lang.Throwable -> Lb0
            float r4 = (float) r4     // Catch: java.lang.Throwable -> Lb0
            int r1 = r1.right     // Catch: java.lang.Throwable -> Lb0
            float r1 = (float) r1     // Catch: java.lang.Throwable -> Lb0
            float r7 = (float) r7     // Catch: java.lang.Throwable -> Lb0
            boolean r7 = r0.intersect(r3, r4, r1, r7)     // Catch: java.lang.Throwable -> Lb0
            if (r7 == 0) goto L82
            goto L83
        L82:
            r2 = 0
        L83:
            r5.f23079f = r6     // Catch: java.lang.Throwable -> Lb0
            ei.c r7 = r5.f23076b     // Catch: java.lang.Throwable -> Lb0
            r7.f16611l = r6     // Catch: java.lang.Throwable -> Lb0
            oi.d r7 = r5.c     // Catch: java.lang.Throwable -> Lb0
            r7.a(r6)     // Catch: java.lang.Throwable -> Lb0
            oi.c r7 = r5.f23077d     // Catch: java.lang.Throwable -> Lb0
            r7.getClass()     // Catch: java.lang.Throwable -> Lb0
            r0 = 1106247680(0x41f00000, float:30.0)
            float r6 = r6 * r0
            int r6 = java.lang.Math.round(r6)     // Catch: java.lang.Throwable -> Lb0
            r7.f23069b = r6     // Catch: java.lang.Throwable -> Lb0
            if (r2 == 0) goto Lae
            android.graphics.Rect r6 = r5.f23080g     // Catch: java.lang.Throwable -> Lb0
            if (r6 == 0) goto Lae
            ei.c r6 = r5.f23076b     // Catch: java.lang.Throwable -> Lb0
            float r7 = r5.f23081h     // Catch: java.lang.Throwable -> Lb0
            int r7 = (int) r7     // Catch: java.lang.Throwable -> Lb0
            float r0 = r5.f23082i     // Catch: java.lang.Throwable -> Lb0
            int r0 = (int) r0     // Catch: java.lang.Throwable -> Lb0
            r6.f16607h = r7     // Catch: java.lang.Throwable -> Lb0
            r6.f16608i = r0     // Catch: java.lang.Throwable -> Lb0
        Lae:
            monitor-exit(r5)
            return
        Lb0:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: oi.f.o(float, boolean):void");
    }
}
