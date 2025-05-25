package com.inmobi.media;

/* loaded from: classes2.dex */
public final class T implements InterfaceC1790r9 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ W f14701a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean f14702b;

    public T(W w7, boolean z10) {
        this.f14701a = w7;
        this.f14702b = z10;
    }

    @Override // com.inmobi.media.InterfaceC1790r9
    public final void a(Object obj) {
        ((Boolean) obj).getClass();
        this.f14701a.a("result pushed to queue");
        if (this.f14702b) {
            W w7 = this.f14701a;
            w7.a("session end - cleanup");
            w7.f14765g = null;
            w7.f14764f.clear();
            w7.c.set(false);
            w7.f14762d.set(false);
        }
    }

    @Override // com.inmobi.media.InterfaceC1790r9
    public final void onError(Exception exc) {
        this.f14701a.a(exc, "error in pushing to queue");
    }
}
