package ai;

import android.graphics.Canvas;
import android.graphics.Rect;
import lib.zj.office.java.awt.Rectangle;

/* compiled from: AbstractView.java */
/* loaded from: classes3.dex */
public abstract class a implements e {

    /* renamed from: a  reason: collision with root package name */
    public zh.h f479a;

    /* renamed from: b  reason: collision with root package name */
    public int f480b;
    public int c;

    /* renamed from: d  reason: collision with root package name */
    public int f481d;

    /* renamed from: e  reason: collision with root package name */
    public int f482e;

    /* renamed from: f  reason: collision with root package name */
    public int f483f;

    /* renamed from: g  reason: collision with root package name */
    public int f484g;

    /* renamed from: h  reason: collision with root package name */
    public int f485h;

    /* renamed from: i  reason: collision with root package name */
    public int f486i;

    /* renamed from: j  reason: collision with root package name */
    public long f487j;

    /* renamed from: k  reason: collision with root package name */
    public long f488k;

    /* renamed from: l  reason: collision with root package name */
    public e f489l;

    /* renamed from: m  reason: collision with root package name */
    public e f490m;

    /* renamed from: n  reason: collision with root package name */
    public e f491n;

    /* renamed from: o  reason: collision with root package name */
    public e f492o;

    @Override // ai.e
    public Rectangle A(long j10, Rectangle rectangle, boolean z10) {
        return null;
    }

    @Override // ai.e
    public final boolean B(long j10, boolean z10) {
        int i10;
        getDocument();
        long j11 = this.f487j;
        long j12 = this.f488k;
        if (j10 >= j11 && (j10 < j12 || (i10 == 0 && z10))) {
            return true;
        }
        return false;
    }

    @Override // ai.e
    public long C(int i10, int i11, boolean z10) {
        return 0L;
    }

    public final void D(a aVar) {
        try {
            aVar.f489l = this;
            if (this.f490m == null) {
                this.f490m = aVar;
                return;
            }
            e F = F();
            aVar.f491n = F;
            F.y(aVar);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public final void E(e eVar) {
        eVar.d(null);
        if (eVar == this.f490m) {
            this.f490m = null;
        } else {
            e z10 = eVar.z();
            e o10 = eVar.o();
            z10.y(o10);
            if (o10 != null) {
                o10.l(z10);
            }
        }
        eVar.dispose();
    }

    public final e F() {
        e eVar = this.f490m;
        if (eVar == null) {
            return null;
        }
        while (eVar.o() != null) {
            eVar = eVar.o();
        }
        return eVar;
    }

    @Override // ai.e
    public final long a() {
        return this.f488k;
    }

    @Override // ai.e
    public final long b() {
        return this.f487j;
    }

    @Override // ai.e
    public final Rect c(float f10, int i10, int i11) {
        int i12 = ((int) (this.f480b * f10)) + i10;
        int i13 = ((int) (this.c * f10)) + i11;
        return new Rect(i12, i13, ((int) (e((byte) 0) * f10)) + i12, ((int) (e((byte) 1) * f10)) + i13);
    }

    @Override // ai.e
    public final boolean contains(int i10, int i11) {
        int i12;
        int i13 = this.f480b;
        if (i10 >= i13 && i10 < i13 + this.f481d && i11 >= (i12 = this.c) && i11 < i12 + this.f482e) {
            return true;
        }
        return false;
    }

    @Override // ai.e
    public final void d(a aVar) {
        this.f489l = aVar;
    }

    @Override // ai.e
    public void dispose() {
        e eVar = this.f490m;
        while (eVar != null) {
            e o10 = eVar.o();
            eVar.dispose();
            eVar = o10;
        }
    }

    @Override // ai.e
    public final int e(byte b10) {
        int i10;
        int i11;
        if (b10 == 0) {
            i10 = this.f486i + this.f481d;
            i11 = this.f485h;
        } else {
            i10 = this.f483f + this.f482e;
            i11 = this.f484g;
        }
        return i10 + i11;
    }

    @Override // ai.e
    public final e f(int i10, int i11, boolean z10) {
        e eVar = this.f490m;
        while (eVar != null && !eVar.contains(i10, i11)) {
            eVar = eVar.o();
        }
        if (eVar != null && eVar.getType() != 7) {
            return eVar.f(i10 - this.f480b, i11 - this.c, z10);
        }
        return eVar;
    }

    @Override // ai.e
    public void g(Canvas canvas, int i10, int i11, float f10) {
        int i12 = ((int) (this.f480b * f10)) + i10;
        int i13 = ((int) (this.c * f10)) + i11;
        Rect clipBounds = canvas.getClipBounds();
        for (e eVar = this.f490m; eVar != null; eVar = eVar.o()) {
            if (eVar.h(clipBounds, i12, i13, f10)) {
                eVar.g(canvas, i12, i13, f10);
            }
        }
    }

    @Override // ai.e
    public lib.zj.office.system.f getControl() {
        e eVar = this.f489l;
        if (eVar != null) {
            return eVar.getControl();
        }
        return null;
    }

    @Override // ai.e
    public zh.g getDocument() {
        e eVar = this.f489l;
        if (eVar != null) {
            return eVar.getDocument();
        }
        return null;
    }

    @Override // ai.e
    public final int getHeight() {
        return this.f482e;
    }

    @Override // ai.e
    public final int getWidth() {
        return this.f481d;
    }

    @Override // ai.e
    public final int getX() {
        return this.f480b;
    }

    @Override // ai.e
    public final int getY() {
        return this.c;
    }

    @Override // ai.e
    public boolean h(Rect rect, int i10, int i11, float f10) {
        int e10 = (int) (e((byte) 0) * f10);
        int e11 = (int) (e((byte) 1) * f10);
        int i12 = rect.right;
        int i13 = rect.left;
        int i14 = i12 - i13;
        int i15 = rect.bottom;
        int i16 = rect.top;
        int i17 = i15 - i16;
        if (i14 <= 0 || i17 <= 0 || e10 <= 0 || e11 <= 0) {
            return false;
        }
        int i18 = ((int) (this.f480b * f10)) + i10;
        int i19 = ((int) (this.c * f10)) + i11;
        int i20 = i14 + i13;
        int i21 = i17 + i16;
        int i22 = e10 + i18;
        int i23 = e11 + i19;
        if (i20 >= i13 && i20 <= i18) {
            return false;
        }
        if (i21 >= i16 && i21 <= i19) {
            return false;
        }
        if (i22 >= i18 && i22 <= i13) {
            return false;
        }
        if (i23 >= i19 && i23 <= i16) {
            return false;
        }
        return true;
    }

    @Override // ai.e
    public final void i(long j10) {
        this.f488k = j10;
    }

    @Override // ai.e
    public final e j() {
        return this.f489l;
    }

    @Override // ai.e
    public final void l(e eVar) {
        this.f491n = eVar;
    }

    @Override // ai.e
    public xh.e n() {
        e eVar = this.f489l;
        if (eVar != null) {
            return eVar.n();
        }
        return null;
    }

    @Override // ai.e
    public final e o() {
        return this.f492o;
    }

    @Override // ai.e
    public final void p(int i10, int i11) {
        this.f480b = i10;
        this.c = i11;
    }

    @Override // ai.e
    public final zh.h r() {
        return this.f479a;
    }

    @Override // ai.e
    public final int s() {
        return this.f483f;
    }

    @Override // ai.e
    public final void setWidth(int i10) {
        this.f481d = i10;
    }

    @Override // ai.e
    public final int t() {
        return this.f484g;
    }

    @Override // ai.e
    public e u(long j10, int i10, boolean z10) {
        e eVar = this.f490m;
        while (eVar != null && !eVar.B(j10, z10)) {
            eVar = eVar.o();
        }
        if (eVar != null && eVar.getType() != i10) {
            return eVar.u(j10, i10, z10);
        }
        return eVar;
    }

    @Override // ai.e
    public final void v(int i10) {
        this.c = i10;
    }

    @Override // ai.e
    public final e w() {
        return this.f490m;
    }

    @Override // ai.e
    public final void x(int i10) {
        this.f480b = i10;
    }

    @Override // ai.e
    public final void y(e eVar) {
        this.f492o = eVar;
    }

    @Override // ai.e
    public final e z() {
        return this.f491n;
    }
}
