package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
/* loaded from: classes.dex */
public final class j extends s {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ BaseGmsClient.ConnectionProgressReportCallbacks f11012b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(zaaw zaawVar, BaseGmsClient.ConnectionProgressReportCallbacks connectionProgressReportCallbacks) {
        super(zaawVar);
        this.f11012b = connectionProgressReportCallbacks;
    }

    @Override // com.google.android.gms.common.api.internal.s
    public final void a() {
        this.f11012b.a(new ConnectionResult(16, null));
    }
}
