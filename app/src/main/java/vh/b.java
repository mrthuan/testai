package vh;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import lh.f;
import lh.g;
import lib.zj.office.java.awt.Dimension;
import lib.zj.office.java.awt.Rectangle;
import lib.zj.office.pg.control.Presentation;
import lib.zj.office.system.beans.CalloutView.CalloutView;
import qh.c;
import qh.e;
import th.d;

/* compiled from: SlideShowView.java */
/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final Rect f30812a;

    /* renamed from: b  reason: collision with root package name */
    public final Presentation f30813b;
    public d c;

    /* renamed from: e  reason: collision with root package name */
    public lib.zj.office.java.awt.geom.d f30815e;

    /* renamed from: f  reason: collision with root package name */
    public HashMap f30816f;

    /* renamed from: g  reason: collision with root package name */
    public Rect f30817g;

    /* renamed from: h  reason: collision with root package name */
    public c f30818h;

    /* renamed from: d  reason: collision with root package name */
    public int f30814d = 0;

    /* renamed from: i  reason: collision with root package name */
    public int f30819i = 1200;

    public b(Presentation presentation, d dVar) {
        this.f30813b = presentation;
        this.c = dVar;
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setTypeface(Typeface.SANS_SERIF);
        paint.setTextSize(24.0f);
        this.f30812a = new Rect();
    }

    public static void f(g gVar) {
        if (gVar instanceof f) {
            for (g gVar2 : ((f) gVar).r()) {
                f(gVar2);
            }
            return;
        }
        qh.d o10 = gVar.o();
        if (o10 != null) {
            gVar.m(null);
            o10.dispose();
        }
    }

    public static void g(g gVar, qh.a aVar) {
        if (gVar instanceof f) {
            for (g gVar2 : ((f) gVar).r()) {
                g(gVar2, aVar);
            }
            return;
        }
        gVar.m(aVar);
    }

    public final void a(Canvas canvas, float f10, CalloutView calloutView) {
        float f11;
        c cVar = this.f30818h;
        if (cVar != null && cVar.f29339e != 2) {
            float f12 = cVar.f29342h.c * f10;
            if (f12 <= 0.001f) {
                return;
            }
            f11 = f12;
        } else {
            f11 = f10;
        }
        Presentation presentation = this.f30813b;
        Dimension pageSize = presentation.getPageSize();
        int i10 = (int) (pageSize.width * f11);
        int i11 = (int) (pageSize.height * f11);
        int i12 = (presentation.getmWidth() - i10) / 2;
        int i13 = (presentation.getmHeight() - i11) / 2;
        canvas.save();
        canvas.translate(i12, i13);
        canvas.clipRect(0, 0, i10, i11);
        this.f30812a.set(0, 0, i10, i11);
        a.g().d(canvas, presentation.getPGModel(), presentation.getEditor(), this.c, f11, this.f30816f);
        canvas.restore();
        if (calloutView != null) {
            c cVar2 = this.f30818h;
            if (cVar2 != null && cVar2.f29339e != 2) {
                calloutView.setVisibility(4);
                return;
            }
            calloutView.setZoom(f11);
            calloutView.layout(i12, i13, i10 + i12, i11 + i13);
            calloutView.setVisibility(0);
        }
    }

    public final void b(Canvas canvas, int i10, int i11, float f10) {
        Rect clipBounds = canvas.getClipBounds();
        if (clipBounds.width() != i10 || clipBounds.height() != i11) {
            f10 *= Math.min(clipBounds.width() / i10, clipBounds.height() / i11);
        }
        a g10 = a.g();
        Presentation presentation = this.f30813b;
        g10.d(canvas, presentation.getPGModel(), presentation.getEditor(), this.c, f10, this.f30816f);
    }

    public final boolean c() {
        ArrayList arrayList = this.c.f30045l;
        if (arrayList != null && this.f30814d < arrayList.size()) {
            return false;
        }
        return true;
    }

    public final void d(d dVar, boolean z10) {
        e();
        this.c = dVar;
        if (dVar == null) {
            return;
        }
        ArrayList arrayList = dVar.f30045l;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                e eVar = (e) arrayList.get(i10);
                Map map = (Map) this.f30816f.get(Integer.valueOf(eVar.f29345a));
                int i11 = eVar.f29345a;
                if (map == null) {
                    map = new HashMap();
                    this.f30816f.put(Integer.valueOf(i11), map);
                }
                int i12 = eVar.c;
                int i13 = i12;
                while (true) {
                    int i14 = eVar.f29347d;
                    if (i13 > i14) {
                        break;
                    } else if (((qh.d) map.get(Integer.valueOf(i13))) == null) {
                        c cVar = new c(eVar, this.f30819i);
                        while (i12 <= i14) {
                            map.put(Integer.valueOf(i12), cVar);
                            i12++;
                        }
                        int f10 = this.c.f();
                        for (int i15 = 0; i15 < f10; i15++) {
                            g e10 = this.c.e(i15);
                            if ((e10.e() == i11 || e10.f() == i11) && e10.o() == null) {
                                g(e10, cVar);
                            }
                        }
                    } else {
                        i13++;
                    }
                }
            }
        }
        if (this.f30815e == null) {
            this.f30815e = this.f30813b.getControl().o().a();
        }
        if (dVar.f30043j) {
            c cVar2 = this.f30818h;
            if (cVar2 == null) {
                this.f30818h = new c(new e(-3, (byte) 0), this.f30819i);
            } else {
                cVar2.f29337b = this.f30819i;
            }
            this.f30815e.e(this.f30818h);
            if (z10) {
                this.f30815e.b(1000 / this.f30818h.c);
            } else {
                this.f30815e.f();
            }
        }
    }

    public final void e() {
        Map<Integer, qh.d> map;
        HashMap hashMap = this.f30816f;
        if (hashMap == null) {
            this.f30816f = new HashMap();
        } else {
            hashMap.clear();
            this.f30814d = 0;
        }
        lib.zj.office.java.awt.geom.d dVar = this.f30815e;
        if (dVar != null) {
            dVar.f();
        }
        Presentation presentation = this.f30813b;
        if (presentation.getEditor() != null && (map = presentation.getEditor().f29563d) != null) {
            map.clear();
        }
        d dVar2 = this.c;
        if (dVar2 != null) {
            int f10 = dVar2.f();
            for (int i10 = 0; i10 < f10; i10++) {
                f(this.c.e(i10));
            }
        }
    }

    public final void h(int i10, boolean z10) {
        qh.a bVar;
        Rectangle bounds;
        ArrayList arrayList = this.c.f30045l;
        if (arrayList != null) {
            e eVar = (e) arrayList.get(i10 - 1);
            int i11 = eVar.f29345a;
            float zoom = this.f30813b.getZoom();
            int f10 = this.c.f();
            int i12 = 0;
            while (true) {
                if (i12 < f10) {
                    g e10 = this.c.e(i12);
                    if (e10.e() == i11 && (bounds = e10.getBounds()) != null) {
                        int round = Math.round(bounds.f20688x * zoom);
                        int round2 = Math.round(bounds.f20689y * zoom);
                        int round3 = Math.round(bounds.width * zoom);
                        int round4 = Math.round(bounds.height * zoom);
                        Rect rect = this.f30817g;
                        if (rect == null) {
                            this.f30817g = new Rect(round, round2, round3 + round, round4 + round2);
                        } else {
                            rect.set(round, round2, round3 + round, round4 + round2);
                        }
                    } else {
                        i12++;
                    }
                } else {
                    this.f30817g = null;
                    break;
                }
            }
            if (eVar.f29346b != 1) {
                bVar = new c(eVar, this.f30819i);
            } else {
                bVar = new qh.b(eVar, this.f30819i);
            }
            HashMap hashMap = this.f30816f;
            int i13 = eVar.f29345a;
            ((Map) hashMap.get(Integer.valueOf(i13))).put(Integer.valueOf(eVar.c), bVar);
            this.f30815e.e(bVar);
            int f11 = this.c.f();
            for (int i14 = 0; i14 < f11; i14++) {
                g e11 = this.c.e(i14);
                if (e11.e() == i13 || e11.f() == i13) {
                    g(e11, bVar);
                }
            }
            if (z10) {
                this.f30815e.b(1000 / bVar.c);
            } else {
                this.f30815e.f();
            }
        }
    }
}
