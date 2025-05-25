package androidx.recyclerview.widget;

/* compiled from: BatchingListUpdateCallback.java */
/* loaded from: classes.dex */
public final class f implements w {

    /* renamed from: a  reason: collision with root package name */
    public final w f4416a;

    /* renamed from: b  reason: collision with root package name */
    public int f4417b = 0;
    public int c = -1;

    /* renamed from: d  reason: collision with root package name */
    public int f4418d = -1;

    /* renamed from: e  reason: collision with root package name */
    public Object f4419e = null;

    public f(w wVar) {
        this.f4416a = wVar;
    }

    @Override // androidx.recyclerview.widget.w
    public final void a(int i10, int i11) {
        e();
        this.f4416a.a(i10, i11);
    }

    @Override // androidx.recyclerview.widget.w
    public final void b(int i10, int i11) {
        int i12;
        if (this.f4417b == 1 && i10 >= (i12 = this.c)) {
            int i13 = this.f4418d;
            if (i10 <= i12 + i13) {
                this.f4418d = i13 + i11;
                this.c = Math.min(i10, i12);
                return;
            }
        }
        e();
        this.c = i10;
        this.f4418d = i11;
        this.f4417b = 1;
    }

    @Override // androidx.recyclerview.widget.w
    public final void c(int i10, int i11) {
        int i12;
        if (this.f4417b == 2 && (i12 = this.c) >= i10 && i12 <= i10 + i11) {
            this.f4418d += i11;
            this.c = i10;
            return;
        }
        e();
        this.c = i10;
        this.f4418d = i11;
        this.f4417b = 2;
    }

    @Override // androidx.recyclerview.widget.w
    public final void d(int i10, int i11, Object obj) {
        int i12;
        if (this.f4417b == 3) {
            int i13 = this.c;
            int i14 = this.f4418d;
            if (i10 <= i13 + i14 && (i12 = i10 + i11) >= i13 && this.f4419e == obj) {
                this.c = Math.min(i10, i13);
                this.f4418d = Math.max(i14 + i13, i12) - this.c;
                return;
            }
        }
        e();
        this.c = i10;
        this.f4418d = i11;
        this.f4419e = obj;
        this.f4417b = 3;
    }

    public final void e() {
        int i10 = this.f4417b;
        if (i10 == 0) {
            return;
        }
        w wVar = this.f4416a;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    wVar.d(this.c, this.f4418d, this.f4419e);
                }
            } else {
                wVar.c(this.c, this.f4418d);
            }
        } else {
            wVar.b(this.c, this.f4418d);
        }
        this.f4419e = null;
        this.f4417b = 0;
    }
}
