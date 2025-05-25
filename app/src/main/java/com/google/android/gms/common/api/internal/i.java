package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
/* loaded from: classes.dex */
public final class i extends s {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ConnectionResult f11010b;
    public final /* synthetic */ k c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(k kVar, zaaw zaawVar, ConnectionResult connectionResult) {
        super(zaawVar);
        this.c = kVar;
        this.f11010b = connectionResult;
    }

    @Override // com.google.android.gms.common.api.internal.s
    public final void a() {
        this.c.c.l(this.f11010b);
    }
}
