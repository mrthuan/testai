package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.internal.BaseGmsClient;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
/* loaded from: classes.dex */
public final class x implements BaseGmsClient.SignOutCallbacks {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ zabq f11040a;

    public x(zabq zabqVar) {
        this.f11040a = zabqVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.SignOutCallbacks
    public final void a() {
        this.f11040a.f11121m.f10952n.post(new w(this));
    }
}
