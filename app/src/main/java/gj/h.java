package gj;

import java.lang.Thread;
import lib.zj.office.java.awt.Rectangle;
import lib.zj.office.wp.control.Word;
import rh.k;

/* compiled from: NormalRoot.java */
/* loaded from: classes3.dex */
public final class h extends ai.a implements ai.d {
    public int A;
    public final o C;
    public b D;

    /* renamed from: r  reason: collision with root package name */
    public final zh.g f17837r;

    /* renamed from: s  reason: collision with root package name */
    public final Word f17838s;

    /* renamed from: u  reason: collision with root package name */
    public final ai.c f17840u;

    /* renamed from: v  reason: collision with root package name */
    public final ai.f f17841v;

    /* renamed from: w  reason: collision with root package name */
    public final ai.g f17842w;

    /* renamed from: x  reason: collision with root package name */
    public l f17843x;

    /* renamed from: y  reason: collision with root package name */
    public final ai.k f17844y;

    /* renamed from: z  reason: collision with root package name */
    public long f17845z;

    /* renamed from: p  reason: collision with root package name */
    public ai.e f17835p = null;

    /* renamed from: q  reason: collision with root package name */
    public boolean f17836q = true;

    /* renamed from: t  reason: collision with root package name */
    public final e f17839t = new e(this);
    public boolean B = true;

    /* compiled from: NormalRoot.java */
    /* loaded from: classes3.dex */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f17846a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ int f17847b;

        public a(int i10, int i11) {
            this.f17846a = i10;
            this.f17847b = i11;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (k.a.f29581a.f29580b) {
                h.this.f17838s.scrollTo(Math.max(0, this.f17846a), Math.max(0, this.f17847b));
            }
        }
    }

    /* compiled from: NormalRoot.java */
    /* loaded from: classes3.dex */
    public interface b {
    }

    public h(Word word) {
        this.f17838s = word;
        this.f17837r = word.getDocument();
        ai.c cVar = new ai.c();
        this.f17840u = cVar;
        cVar.f508a = (byte) 1;
        this.f17841v = new ai.f();
        this.f17842w = new ai.g();
        this.f17844y = new ai.k();
        this.C = new o(null);
    }

    @Override // ai.a, ai.e
    public final Rectangle A(long j10, Rectangle rectangle, boolean z10) {
        ai.e d10 = this.f17844y.d(j10);
        if (d10 != null) {
            d10.A(j10, rectangle, z10);
            for (ai.e j11 = d10.j(); j11 != null && j11.getType() != 1; j11 = j11.j()) {
                rectangle.f20688x = j11.getX() + rectangle.f20688x;
                rectangle.f20689y = j11.getY() + rectangle.f20689y;
            }
        }
        rectangle.f20688x += this.f480b;
        rectangle.f20689y += this.c;
        return rectangle;
    }

    @Override // ai.a, ai.e
    public final long C(int i10, int i11, boolean z10) {
        int i12 = i10 - this.f480b;
        int i13 = i11 - this.c;
        ai.e eVar = this.f490m;
        if (eVar == null) {
            return -1L;
        }
        if (i13 > eVar.getY()) {
            while (eVar != null) {
                if (i13 >= eVar.getY()) {
                    if (i13 < eVar.e((byte) 1) + eVar.getY()) {
                        break;
                    }
                }
                eVar = eVar.o();
            }
        }
        if (eVar == null) {
            eVar = this.f490m;
        }
        if (eVar == null) {
            return -1L;
        }
        return eVar.C(i12, i13, z10);
    }

    public final void G() {
        zh.g document = getDocument();
        this.f17844y.b();
        I();
        if (this.f17845z < document.d()) {
            e eVar = this.f17839t;
            if (eVar.getState() == Thread.State.NEW) {
                eVar.start();
            }
            this.f17838s.getControl().r(26, Boolean.TRUE);
        }
        J();
    }

    public final synchronized void H(boolean z10) {
        if (z10) {
            super.dispose();
        } else {
            this.f17835p = this.f490m;
        }
        this.C.a();
        this.f17838s.getControl().o().e().l();
        this.f17844y.b();
        this.A = 0;
        this.f17843x = null;
        this.f17845z = 0L;
        I();
        if (this.f17845z < this.f17837r.d()) {
            this.B = true;
            if (this.f17839t.getState() == Thread.State.NEW) {
                this.f17839t.start();
            }
            this.f17838s.getControl().r(26, Boolean.TRUE);
        } else if (k.a.f29581a.f29580b) {
            this.f17838s.getControl().r(26, Boolean.FALSE);
        }
        J();
        Word word = this.f17838s;
        if (word.c && (this.f482e * word.getZoom() >= this.f17838s.getScrollY() + this.f17838s.getHeight() || this.f17845z >= this.f17837r.d())) {
            this.f17838s.setExportImageAfterZoom(false);
            this.f17838s.getControl().r(536870922, null);
        }
    }

    public final void I() {
        int i10;
        int measuredWidth;
        l lVar;
        l lVar2;
        int i11;
        int i12;
        zh.g gVar;
        Word word;
        short s4;
        this.f17836q = true;
        short s10 = androidx.activity.s.f1868w;
        l lVar3 = this.f17843x;
        if (lVar3 == null) {
            i10 = s10;
        } else {
            i10 = lVar3.c + lVar3.f482e;
        }
        Word word2 = this.f17838s;
        word2.getControl().s().d1();
        if (word2.getMeasuredWidth() <= 0) {
            measuredWidth = word2.getResources().getDisplayMetrics().widthPixels;
        } else {
            measuredWidth = word2.getMeasuredWidth();
        }
        int zoom = ((int) (measuredWidth / word2.getZoom())) - (androidx.activity.s.f1868w * 2);
        long d10 = this.f17837r.d();
        zh.g document = word2.getDocument();
        int i13 = Integer.MAX_VALUE;
        int i14 = i10;
        int i15 = 0;
        while (i15 < 20) {
            long j10 = this.f17845z;
            if (j10 < d10 && this.f17836q) {
                zh.h g10 = document.g(j10);
                zh.b bVar = zh.b.f32374b;
                zh.f d11 = g10.d();
                bVar.getClass();
                boolean u7 = zh.b.u(d11, (short) 4107);
                o oVar = this.C;
                if (u7) {
                    g10 = ((fj.e) document).n(this.f17845z);
                    lVar = (l) com.google.android.play.core.assetpacks.c.t(word2.getControl(), g10, null, 9);
                    l lVar4 = this.f17843x;
                    if (lVar4 != null && g10 != lVar4.f479a) {
                        oVar.a();
                    }
                } else {
                    lVar = (l) com.google.android.play.core.assetpacks.c.t(word2.getControl(), g10, null, 5);
                }
                l lVar5 = lVar;
                lVar5.f489l = this;
                lVar5.f487j = g10.b();
                lVar5.f488k = g10.a();
                l lVar6 = this.f17843x;
                if (lVar6 == null) {
                    this.f490m = lVar5;
                } else {
                    lVar6.f492o = lVar5;
                    lVar5.f491n = lVar6;
                }
                lVar5.f480b = s10;
                lVar5.c = i14;
                if (lVar5.getType() == 9) {
                    lVar2 = lVar5;
                    i11 = i14;
                    i12 = i15;
                    gVar = document;
                    word = word2;
                    s4 = s10;
                    this.C.f(word2.getControl(), document, this, this.f17840u, this.f17841v, this.f17842w, (p) lVar5, this.f17845z, zoom, i13, 1, false);
                } else {
                    lVar2 = lVar5;
                    i11 = i14;
                    i12 = i15;
                    gVar = document;
                    word = word2;
                    s4 = s10;
                    oVar.a();
                    lib.zj.office.system.f control = word.getControl();
                    zh.f d12 = g10.d();
                    ai.g gVar2 = this.f17842w;
                    zh.b.d(control, gVar2, d12);
                    int i16 = gVar2.f521b;
                    if (i16 < 0) {
                        i16 = 0;
                    }
                    gVar2.f521b = i16;
                    int i17 = gVar2.f520a;
                    if (i17 < 0) {
                        i17 = 0;
                    }
                    gVar2.f520a = i17;
                    b.b.L(word.getControl(), gVar, this.f17840u, this.f17841v, this.f17842w, lVar2, this.f17845z, zoom, i13, 1);
                }
                l lVar7 = lVar2;
                int e10 = lVar7.e((byte) 1);
                this.A = Math.max(lVar7.e((byte) 0) + androidx.activity.s.f1868w, this.A);
                i14 = i11 + e10;
                i13 -= e10;
                this.f17845z = lVar7.f488k;
                i15 = i12 + 1;
                this.f17843x = lVar7;
                this.f17844y.a(lVar7);
                document = gVar;
                word2 = word;
                s10 = s4;
            } else {
                return;
            }
        }
    }

    public final void J() {
        l lVar = this.f17843x;
        if (lVar != null) {
            b bVar = this.D;
            if (bVar != null) {
                int i10 = lVar.c;
                int i11 = lVar.f482e;
                bVar.getClass();
            }
            int max = Math.max(this.f17838s.getWidth(), this.A);
            l lVar2 = this.f17843x;
            this.f481d = max;
            this.f482e = lVar2.c + lVar2.f482e;
        }
    }

    @Override // ai.a, ai.e
    public final synchronized void dispose() {
        super.dispose();
        this.B = false;
        this.f17839t.f17824a = true;
        this.f17840u.getClass();
        this.f17841v.getClass();
        this.f17842w.getClass();
    }

    @Override // ai.a, ai.e
    public final lib.zj.office.system.f getControl() {
        return this.f17838s.getControl();
    }

    @Override // ai.a, ai.e
    public final zh.g getDocument() {
        return this.f17838s.getDocument();
    }

    @Override // ai.e
    public final short getType() {
        return (short) 1;
    }

    @Override // ai.d
    public final synchronized void k() {
        I();
        J();
        if (this.f17845z >= this.f17837r.d()) {
            this.f17838s.getControl().r(22, Boolean.TRUE);
            this.f17838s.getControl().r(26, Boolean.FALSE);
            Rectangle visibleRect = this.f17838s.getVisibleRect();
            int i10 = visibleRect.f20688x;
            int i11 = visibleRect.f20689y;
            int zoom = (int) (this.f481d * this.f17838s.getZoom());
            int zoom2 = (int) (this.f482e * this.f17838s.getZoom());
            int i12 = visibleRect.f20688x;
            int i13 = visibleRect.width;
            if (i12 + i13 > zoom) {
                i10 = zoom - i13;
            }
            int i14 = visibleRect.f20689y;
            int i15 = visibleRect.height;
            if (i14 + i15 > zoom2) {
                i11 = zoom2 - i15;
            }
            if (i10 != i12 || i11 != i14) {
                this.f17838s.post(new a(i10, i11));
            }
        }
        this.f17838s.postInvalidate();
        Word word = this.f17838s;
        if (word.c && (this.f482e * word.getZoom() >= this.f17838s.getScrollY() + this.f17838s.getHeight() || this.f17845z >= this.f17837r.d())) {
            this.f17838s.setExportImageAfterZoom(false);
            this.f17838s.getControl().r(536870922, null);
        }
    }

    @Override // ai.d
    public final ai.k m() {
        return this.f17844y;
    }

    @Override // ai.a, ai.e
    public final xh.e n() {
        return this.f17838s;
    }

    @Override // ai.d
    public final boolean q() {
        if (this.B && this.f17845z < this.f17837r.d()) {
            return true;
        }
        return false;
    }
}
