package com.google.android.gms.common.api.internal;

import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
/* loaded from: classes.dex */
public final class n extends com.google.android.gms.signin.internal.zac {

    /* renamed from: a  reason: collision with root package name */
    public final WeakReference f11021a;

    public n(zaaw zaawVar) {
        this.f11021a = new WeakReference(zaawVar);
    }

    @Override // com.google.android.gms.signin.internal.zac, com.google.android.gms.signin.internal.zae
    public final void s(com.google.android.gms.signin.internal.zak zakVar) {
        zaaw zaawVar = (zaaw) this.f11021a.get();
        if (zaawVar == null) {
            return;
        }
        zaawVar.f11052a.i(new m(zaawVar, zaawVar, zakVar));
    }
}
