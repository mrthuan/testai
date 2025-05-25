package wn;

import pdf.pdfreader.viewer.editor.free.utils.n0;

/* compiled from: ReadTimeMetaHelper.kt */
/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public long f31395a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f31396b;
    public boolean c;

    /* renamed from: d  reason: collision with root package name */
    public long f31397d;

    public c(long j10) {
        this.f31395a = j10;
    }

    public final int a() {
        int i10 = (int) (this.f31395a / 1000);
        if (i10 < 30) {
            return 0;
        }
        return (i10 / 60) + 1;
    }

    public final void b() {
        if (this.f31396b) {
            this.f31395a = (System.currentTimeMillis() - this.f31397d) + this.f31395a;
            String str = n0.f28727a;
        }
    }

    public final void c() {
        this.c = true;
        if (this.f31396b) {
            String str = n0.f28727a;
            this.f31397d = System.currentTimeMillis();
        }
    }
}
