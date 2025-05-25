package h3;

import java.util.Collections;

/* compiled from: ValueCallbackKeyframeAnimation.java */
/* loaded from: classes.dex */
public final class p<K, A> extends a<K, A> {

    /* renamed from: i  reason: collision with root package name */
    public final A f18001i;

    public p(n3.a aVar, A a10) {
        super(Collections.emptyList());
        j(aVar);
        this.f18001i = a10;
    }

    @Override // h3.a
    public final float c() {
        return 1.0f;
    }

    @Override // h3.a
    public final A f() {
        n3.a aVar = this.f17963e;
        A a10 = this.f18001i;
        return (A) aVar.e(a10, a10);
    }

    @Override // h3.a
    public final A g(q3.a<K> aVar, float f10) {
        return f();
    }

    @Override // h3.a
    public final void h() {
        if (this.f17963e != null) {
            super.h();
        }
    }

    @Override // h3.a
    public final void i(float f10) {
        this.f17962d = f10;
    }
}
