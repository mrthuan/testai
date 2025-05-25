package gj;

import android.graphics.Canvas;
import java.util.ArrayList;
import lib.zj.office.java.awt.Rectangle;
import lib.zj.office.wp.control.Word;

/* compiled from: PageRoot.java */
/* loaded from: classes3.dex */
public final class j extends ai.a implements ai.d {

    /* renamed from: r  reason: collision with root package name */
    public final Word f17853r;

    /* renamed from: q  reason: collision with root package name */
    public final e f17852q = new e(this);

    /* renamed from: s  reason: collision with root package name */
    public final r f17854s = new r(this);

    /* renamed from: t  reason: collision with root package name */
    public final ai.k f17855t = new ai.k();

    /* renamed from: u  reason: collision with root package name */
    public final ArrayList f17856u = new ArrayList();

    /* renamed from: p  reason: collision with root package name */
    public boolean f17851p = true;

    public j(Word word) {
        this.f17853r = word;
    }

    @Override // ai.a, ai.e
    public final Rectangle A(long j10, Rectangle rectangle, boolean z10) {
        ai.e d10 = this.f17855t.d(j10);
        if (d10 == null || d10.j() == null) {
            ai.e u7 = u(j10, 5, z10);
            if (u7 instanceof p) {
                d10 = u7.u(j10, 5, z10);
            }
        }
        if (d10 != null) {
            d10.A(j10, rectangle, z10);
            for (ai.e j11 = d10.j(); j11 != null && j11.getType() != 0; j11 = j11.j()) {
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
        if (eVar != null && i13 > eVar.getY()) {
            while (eVar != null) {
                if (i13 >= eVar.getY()) {
                    if (i13 <= eVar.getHeight() + eVar.getY() + 2) {
                        break;
                    }
                }
                eVar = eVar.o();
            }
        }
        if (eVar == null) {
            eVar = this.f490m;
        }
        if (eVar != null) {
            return eVar.C(i12, i13, z10);
        }
        return -1L;
    }

    public final void G() {
        r rVar = this.f17854s;
        Word word = this.f17853r;
        try {
            getDocument().e(0L);
            rVar.d();
            if (!rVar.e() && !word.getControl().s().P0()) {
                if (rVar.e()) {
                    lib.zj.office.system.f control = word.getControl();
                    Boolean bool = Boolean.TRUE;
                    control.r(22, bool);
                    word.getControl().r(805306376, bool);
                } else {
                    this.f17852q.start();
                }
                word.getControl().r(26, Boolean.TRUE);
                return;
            }
            lib.zj.office.system.f control2 = word.getControl();
            Boolean bool2 = Boolean.TRUE;
            control2.r(805306376, bool2);
            word.getControl().r(22, bool2);
        } catch (Exception e10) {
            word.getControl().o().c().a(false, e10);
        }
    }

    public final int H() {
        ArrayList arrayList = this.f17856u;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 1;
    }

    public final k I(int i10) {
        if (i10 >= 0) {
            ArrayList arrayList = this.f17856u;
            if (i10 < arrayList.size()) {
                return (k) arrayList.get(i10);
            }
            return null;
        }
        return null;
    }

    @Override // ai.a, ai.e
    public final synchronized void dispose() {
        super.dispose();
        this.f17851p = false;
        e eVar = this.f17852q;
        if (eVar != null) {
            eVar.f17824a = true;
        }
        r rVar = this.f17854s;
        if (rVar != null) {
            rVar.f17873a.getClass();
            rVar.f17874b.getClass();
            rVar.c.getClass();
            rVar.f17885n.clear();
        }
        ai.k kVar = this.f17855t;
        if (kVar != null) {
            kVar.c();
        }
        ArrayList arrayList = this.f17856u;
        if (arrayList != null) {
            arrayList.clear();
        }
    }

    @Override // ai.a, ai.e
    public final synchronized void g(Canvas canvas, int i10, int i11, float f10) {
        super.g(canvas, i10, i11, f10);
    }

    @Override // ai.a, ai.e
    public final lib.zj.office.system.f getControl() {
        return this.f17853r.getControl();
    }

    @Override // ai.a, ai.e
    public final zh.g getDocument() {
        return this.f17853r.getDocument();
    }

    @Override // ai.e
    public final short getType() {
        return (short) 0;
    }

    @Override // ai.d
    public final synchronized void k() {
        this.f17854s.a();
        this.f17853r.postInvalidate();
        this.f17853r.getControl().r(536870927, null);
        if (this.f17854s.e()) {
            lib.zj.office.system.f control = this.f17853r.getControl();
            Boolean bool = Boolean.TRUE;
            control.r(22, bool);
            this.f17853r.getControl().r(805306376, bool);
        }
        this.f17853r.getControl().r(20, null);
        b.b.K(this, this.f17853r.getZoom());
        Word word = this.f17853r;
        word.getClass();
        word.post(new dj.g(word));
    }

    @Override // ai.d
    public final ai.k m() {
        return this.f17855t;
    }

    @Override // ai.a, ai.e
    public final xh.e n() {
        return this.f17853r;
    }

    @Override // ai.d
    public final boolean q() {
        if (this.f17851p && !this.f17854s.e()) {
            return true;
        }
        return false;
    }
}
