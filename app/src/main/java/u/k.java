package u;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import e.c;

/* compiled from: CustomTabsSession.java */
/* loaded from: classes.dex */
public final class k extends c.a {

    /* renamed from: a  reason: collision with root package name */
    public final Handler f30105a = new Handler(Looper.getMainLooper());

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ n f30106b;

    public k(n nVar) {
        this.f30106b = nVar;
    }

    public final void K(int i10, Bundle bundle) {
        this.f30105a.post(new j(this.f30106b, i10, bundle, 0));
    }

    public final void L0(boolean z10, Bundle bundle) {
        this.f30105a.post(new i(this.f30106b, 0, bundle, z10));
    }

    public final void M0(boolean z10, Bundle bundle) {
        this.f30105a.post(new h(this.f30106b, 0, bundle, z10));
    }
}
