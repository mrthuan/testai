package com.google.android.gms.common.internal;

import com.google.android.gms.common.ConnectionResult;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
/* loaded from: classes.dex */
public final class zzg extends e {

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ BaseGmsClient f11301g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzg(BaseGmsClient baseGmsClient, int i10) {
        super(baseGmsClient, i10, null);
        this.f11301g = baseGmsClient;
    }

    @Override // com.google.android.gms.common.internal.e
    public final void e(ConnectionResult connectionResult) {
        BaseGmsClient baseGmsClient = this.f11301g;
        if (baseGmsClient.enableLocalFallback() && BaseGmsClient.zzo(baseGmsClient)) {
            BaseGmsClient.zzk(baseGmsClient, 16);
            return;
        }
        baseGmsClient.zzc.a(connectionResult);
        baseGmsClient.onConnectionFailed(connectionResult);
    }

    @Override // com.google.android.gms.common.internal.e
    public final boolean f() {
        this.f11301g.zzc.a(ConnectionResult.f10874e);
        return true;
    }
}
