package lib.zj.office.ss.control;

import android.app.Activity;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Message;
import android.widget.LinearLayout;
import androidx.core.content.e;
import androidx.fragment.app.a1;
import com.facebook.appevents.g;
import ei.b;
import ei.d;
import f0.s;
import java.util.concurrent.atomic.AtomicBoolean;
import lib.zj.office.system.beans.CalloutView.CalloutView;
import lib.zj.office.system.f;
import lib.zj.office.system.h;
import lib.zj.office.system.q;
import qi.c;

/* loaded from: classes3.dex */
public class Spreadsheet extends LinearLayout implements h, gi.a, c {

    /* renamed from: a  reason: collision with root package name */
    public final ExcelView f20949a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f20950b;
    public boolean c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f20951d;

    /* renamed from: e  reason: collision with root package name */
    public int f20952e;

    /* renamed from: f  reason: collision with root package name */
    public int f20953f;

    /* renamed from: g  reason: collision with root package name */
    public String f20954g;

    /* renamed from: h  reason: collision with root package name */
    public String f20955h;

    /* renamed from: i  reason: collision with root package name */
    public final f f20956i;

    /* renamed from: j  reason: collision with root package name */
    public final d f20957j;

    /* renamed from: k  reason: collision with root package name */
    public oi.f f20958k;

    /* renamed from: l  reason: collision with root package name */
    public final bi.c f20959l;

    /* renamed from: m  reason: collision with root package name */
    public final e f20960m;

    /* renamed from: n  reason: collision with root package name */
    public CalloutView f20961n;

    /* loaded from: classes3.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            Spreadsheet.this.f20956i.r(536870922, null);
        }
    }

    public Spreadsheet(Activity activity, String str, d dVar, f fVar, ExcelView excelView) {
        super(activity);
        this.f20952e = -1;
        this.f20949a = excelView;
        this.f20955h = str;
        if (rg.c.c) {
            setBackgroundColor(-16777216);
        } else {
            setBackgroundColor(-1);
        }
        setBackgroundColor(-1);
        this.f20957j = dVar;
        this.f20956i = fVar;
        bi.c cVar = new bi.c(this, fVar);
        this.f20959l = cVar;
        this.f20960m = new e(this);
        setOnTouchListener(cVar);
        setLongClickable(true);
    }

    @Override // qi.c
    public final void a() {
        this.f20956i.r(536870922, null);
    }

    @Override // lib.zj.office.system.h
    public final void b() {
        i0.a aVar;
        oi.f fVar = this.f20958k;
        if (fVar != null && (aVar = fVar.f23092s) != null) {
            aVar.c = null;
        }
    }

    @Override // lib.zj.office.system.h
    public final void c() {
        i0.a aVar;
        oi.f fVar = this.f20958k;
        if (fVar != null && (aVar = fVar.f23092s) != null) {
            ((AtomicBoolean) aVar.f18402a).set(true);
        }
    }

    @Override // android.view.View
    public final void computeScroll() {
        this.f20959l.b();
    }

    @Override // lib.zj.office.system.h
    public final boolean d(String str) {
        ei.a aVar;
        int i10;
        oi.f fVar = this.f20958k;
        if (fVar.f23092s == null) {
            fVar.f23092s = new i0.a(2);
        }
        i0.a aVar2 = fVar.f23092s;
        ei.c cVar = fVar.f23076b;
        aVar2.getClass();
        if (str != null && cVar != null) {
            aVar2.f18403b = cVar;
            aVar2.c = str;
            if (str.length() > 0) {
                AtomicBoolean atomicBoolean = (AtomicBoolean) aVar2.f18402a;
                atomicBoolean.set(false);
                int i11 = cVar.f16603d;
                loop0: while (true) {
                    if (i11 <= cVar.c) {
                        if (atomicBoolean.get()) {
                            break;
                        }
                        b g10 = cVar.g(i11);
                        if (g10 != null) {
                            if (i11 == cVar.f16603d) {
                                i10 = cVar.f16604e;
                            } else {
                                i10 = g10.f16595b;
                            }
                            while (i10 <= g10.c) {
                                if (atomicBoolean.get()) {
                                    break loop0;
                                }
                                ei.a e10 = g10.e(i10, true);
                                aVar2.f18404d = e10;
                                if (e10 != null) {
                                    mi.a aVar3 = mi.a.f22038b;
                                    d dVar = cVar.f16601a;
                                    aVar3.getClass();
                                    String f10 = mi.a.f(dVar, e10);
                                    if (f10 != null && f10.contains(str)) {
                                        aVar = (ei.a) aVar2.f18404d;
                                        break loop0;
                                    }
                                }
                                i10++;
                            }
                            continue;
                        }
                        i11++;
                    } else {
                        loop2: for (int i12 = cVar.f16602b; i12 <= cVar.f16603d && !atomicBoolean.get(); i12++) {
                            b g11 = cVar.g(i12);
                            if (g11 != null) {
                                for (int i13 = g11.f16595b; i13 <= g11.c; i13++) {
                                    if (atomicBoolean.get()) {
                                        break loop2;
                                    }
                                    ei.a e11 = g11.e(i13, true);
                                    aVar2.f18404d = e11;
                                    if (e11 != null) {
                                        mi.a aVar4 = mi.a.f22038b;
                                        d dVar2 = cVar.f16601a;
                                        aVar4.getClass();
                                        String f11 = mi.a.f(dVar2, e11);
                                        if (f11 != null && f11.contains(str)) {
                                            aVar = (ei.a) aVar2.f18404d;
                                            break loop2;
                                        }
                                    }
                                }
                                continue;
                            }
                        }
                    }
                }
            }
        }
        aVar = null;
        if (aVar == null) {
            return false;
        }
        fVar.f23075a.post(new a1(9, fVar, aVar));
        return true;
    }

    @Override // lib.zj.office.system.h
    public final boolean e() {
        ei.a aVar;
        int i10;
        oi.f fVar = this.f20958k;
        i0.a aVar2 = fVar.f23092s;
        if (aVar2 == null) {
            return false;
        }
        if (((ei.a) aVar2.f18404d) != null && ((String) aVar2.c) != null && ((ei.c) aVar2.f18403b) != null) {
            AtomicBoolean atomicBoolean = (AtomicBoolean) aVar2.f18402a;
            atomicBoolean.set(false);
            loop0: for (int i11 = ((ei.a) aVar2.f18404d).c; i11 >= ((ei.c) aVar2.f18403b).f16602b && !atomicBoolean.get(); i11--) {
                b g10 = ((ei.c) aVar2.f18403b).g(i11);
                if (g10 != null) {
                    ei.a aVar3 = (ei.a) aVar2.f18404d;
                    if (i11 == aVar3.c) {
                        i10 = aVar3.f16590d - 1;
                    } else {
                        i10 = g10.c;
                    }
                    while (i10 >= 0) {
                        if (atomicBoolean.get()) {
                            break loop0;
                        }
                        aVar = g10.e(i10, true);
                        if (aVar != null) {
                            mi.a aVar4 = mi.a.f22038b;
                            d dVar = ((ei.c) aVar2.f18403b).f16601a;
                            aVar4.getClass();
                            String f10 = mi.a.f(dVar, aVar);
                            if (f10 != null && f10.contains((String) aVar2.c)) {
                                aVar2.f18404d = aVar;
                                break loop0;
                            }
                        }
                        i10--;
                    }
                    continue;
                }
            }
        }
        aVar = null;
        if (aVar == null) {
            return false;
        }
        fVar.f23075a.post(new s(16, fVar, aVar));
        return true;
    }

    @Override // lib.zj.office.system.h
    public final boolean f() {
        ei.a aVar;
        int i10;
        oi.f fVar = this.f20958k;
        i0.a aVar2 = fVar.f23092s;
        if (aVar2 == null) {
            return false;
        }
        if (((ei.a) aVar2.f18404d) != null && ((String) aVar2.c) != null && ((ei.c) aVar2.f18403b) != null) {
            AtomicBoolean atomicBoolean = (AtomicBoolean) aVar2.f18402a;
            atomicBoolean.set(false);
            loop0: for (int i11 = ((ei.a) aVar2.f18404d).c; i11 <= ((ei.c) aVar2.f18403b).c && !atomicBoolean.get(); i11++) {
                b g10 = ((ei.c) aVar2.f18403b).g(i11);
                if (g10 != null) {
                    ei.a aVar3 = (ei.a) aVar2.f18404d;
                    if (i11 == aVar3.c) {
                        i10 = aVar3.f16590d + 1;
                    } else {
                        i10 = g10.f16595b;
                    }
                    while (i10 <= g10.c) {
                        if (atomicBoolean.get()) {
                            break loop0;
                        }
                        aVar = g10.e(i10, true);
                        if (aVar != null) {
                            mi.a aVar4 = mi.a.f22038b;
                            d dVar = ((ei.c) aVar2.f18403b).f16601a;
                            aVar4.getClass();
                            String f10 = mi.a.f(dVar, aVar);
                            if (f10 != null && f10.contains((String) aVar2.c)) {
                                aVar2.f18404d = aVar;
                                break loop0;
                            }
                        }
                        i10++;
                    }
                    continue;
                }
            }
        }
        aVar = null;
        if (aVar == null) {
            return false;
        }
        fVar.f23075a.post(new g(9, fVar, aVar));
        return true;
    }

    public final void g() {
        if (this.f20961n == null) {
            CalloutView calloutView = new CalloutView(getContext(), this.f20956i, this);
            this.f20961n = calloutView;
            calloutView.setIndex(this.f20953f);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
            layoutParams.leftMargin = 50;
            layoutParams.topMargin = 30;
            addView(this.f20961n, layoutParams);
        }
    }

    public String getActiveCellContent() {
        ei.a aVar = this.f20958k.f23076b.f16613n;
        if (aVar != null) {
            mi.a.f22038b.getClass();
            return mi.a.f(this.f20957j, aVar);
        }
        return "";
    }

    public ih.a getActiveCellHyperlink() {
        ei.a aVar = this.f20958k.f23076b.f16613n;
        if (aVar != null && aVar.e() != null) {
            return aVar.e();
        }
        return null;
    }

    public int getBottomBarHeight() {
        return this.f20949a.getBottomBarHeight();
    }

    public CalloutView getCalloutView() {
        g();
        return this.f20961n;
    }

    public f getControl() {
        return this.f20956i;
    }

    public int getCurrentSheetNumber() {
        return this.f20953f + 1;
    }

    public xh.e getEditor() {
        return this.f20960m;
    }

    public pi.b getEventManage() {
        return this.f20959l;
    }

    public String getFileName() {
        return this.f20955h;
    }

    public float getFitZoom() {
        return 1.0f;
    }

    public int getPageIndex() {
        return -1;
    }

    public int getSheetCount() {
        return this.f20957j.q();
    }

    public oi.f getSheetView() {
        return this.f20958k;
    }

    public d getWorkbook() {
        return this.f20957j;
    }

    public float getZoom() {
        if (this.f20958k == null) {
            this.f20958k = new oi.f(this, this.f20957j.o(0));
        }
        return this.f20958k.f23079f;
    }

    public final void h(int i10) {
        if (this.f20953f != i10 && i10 < getSheetCount()) {
            ei.c o10 = this.f20957j.o(i10);
            this.f20953f = i10;
            this.f20954g = o10.f16612m;
            this.f20956i.r(20, null);
            CalloutView calloutView = this.f20961n;
            if (calloutView != null) {
                calloutView.setIndex(this.f20953f);
            }
            i(o10);
        }
    }

    public final void i(ei.c cVar) {
        try {
            this.f20959l.e();
            this.f20956i.s().M0(false);
            f fVar = this.f20956i;
            fVar.r(1073741824, this.f20955h + " : " + cVar.f16612m);
            oi.f fVar2 = this.f20958k;
            synchronized (fVar2) {
                fVar2.f23076b.m();
                fVar2.f23076b = cVar;
                fVar2.k();
                fVar2.l();
                fVar2.f23078e.post(new oi.e(fVar2));
            }
            postInvalidate();
            if (cVar.j() != 2) {
                cVar.f16621v = this;
                this.f20956i.r(26, Boolean.TRUE);
                this.f20956i.r(536870921, null);
            } else {
                this.f20956i.r(26, Boolean.FALSE);
            }
            q qVar = this.f20957j.f16624a;
            if (qVar != null) {
                Message message = new Message();
                message.what = 0;
                message.obj = Integer.valueOf(this.f20953f);
                qVar.handleMessage(message);
            }
        } catch (Exception e10) {
            this.f20956i.o().c().a(false, e10);
        }
    }

    public final void j(sg.c cVar) {
        jh.c cVar2 = jh.c.f19238d;
        boolean h10 = cVar2.h();
        cVar2.c = true;
        Bitmap a10 = cVar.a(getWidth(), getHeight());
        if (a10 == null) {
            return;
        }
        Canvas canvas = new Canvas(a10);
        float f10 = this.f20958k.f23079f;
        if (a10.getWidth() != getWidth() || a10.getHeight() != getHeight()) {
            this.f20958k.o(Math.min(a10.getWidth() / getWidth(), a10.getHeight() / getHeight()) * f10, true);
        }
        canvas.drawColor(-1);
        this.f20958k.d(canvas);
        this.f20956i.o().b().a(canvas, this.f20953f, f10);
        cVar.d();
        this.f20958k.o(f10, true);
        cVar2.c = h10;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f20950b = true;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onDraw(Canvas canvas) {
        f fVar = this.f20956i;
        if (!this.f20951d) {
            return;
        }
        try {
            this.f20958k.d(canvas);
            if (fVar.p()) {
                if (this.f20953f < this.f20957j.q() - 1) {
                    while (this.f20958k.f23076b.j() != 2) {
                        try {
                            Thread.sleep(50L);
                        } catch (Exception unused) {
                        }
                    }
                    h(this.f20953f + 1);
                } else {
                    fVar.r(22, Boolean.TRUE);
                }
            } else {
                sg.c n10 = fVar.n();
                if (n10 != null) {
                    n10.c();
                }
            }
            if (this.f20958k.f23076b.j() != 2) {
                invalidate();
            }
            if (this.f20952e != this.f20953f) {
                fVar.s().S();
                this.f20952e = this.f20953f;
            }
        } catch (Exception e10) {
            fVar.o().c().a(false, e10);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (this.f20950b) {
            this.f20950b = false;
            post(new a());
        }
    }

    public void setZoom(float f10) {
        if (this.f20958k == null) {
            this.f20958k = new oi.f(this, this.f20957j.o(0));
        }
        oi.f fVar = this.f20958k;
        synchronized (fVar) {
            fVar.o(f10, false);
            fVar.l();
        }
    }
}
