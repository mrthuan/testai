package m3;

import h3.a;

/* compiled from: BaseLayer.java */
/* loaded from: classes.dex */
public final class a implements a.InterfaceC0242a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ com.airbnb.lottie.model.layer.a f21796a;

    public a(com.airbnb.lottie.model.layer.a aVar) {
        this.f21796a = aVar;
    }

    @Override // h3.a.InterfaceC0242a
    public final void a() {
        boolean z10;
        com.airbnb.lottie.model.layer.a aVar = this.f21796a;
        if (aVar.f6138p.k() == 1.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 != aVar.f6144v) {
            aVar.f6144v = z10;
            aVar.f6135m.invalidateSelf();
        }
    }
}
