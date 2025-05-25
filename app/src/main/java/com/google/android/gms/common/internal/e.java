package com.google.android.gms.common.internal;

import android.app.PendingIntent;
import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
/* loaded from: classes.dex */
public abstract class e extends zzc {

    /* renamed from: d  reason: collision with root package name */
    public final int f11244d;

    /* renamed from: e  reason: collision with root package name */
    public final Bundle f11245e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ BaseGmsClient f11246f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(BaseGmsClient baseGmsClient, int i10, Bundle bundle) {
        super(baseGmsClient, Boolean.TRUE);
        this.f11246f = baseGmsClient;
        this.f11244d = i10;
        this.f11245e = bundle;
    }

    @Override // com.google.android.gms.common.internal.zzc
    public final /* bridge */ /* synthetic */ void a() {
        BaseGmsClient baseGmsClient = this.f11246f;
        PendingIntent pendingIntent = null;
        int i10 = this.f11244d;
        if (i10 != 0) {
            baseGmsClient.zzp(1, null);
            Bundle bundle = this.f11245e;
            if (bundle != null) {
                pendingIntent = (PendingIntent) bundle.getParcelable(BaseGmsClient.KEY_PENDING_INTENT);
            }
            e(new ConnectionResult(i10, pendingIntent));
        } else if (!f()) {
            baseGmsClient.zzp(1, null);
            e(new ConnectionResult(8, null));
        }
    }

    public abstract void e(ConnectionResult connectionResult);

    public abstract boolean f();

    @Override // com.google.android.gms.common.internal.zzc
    public final void b() {
    }
}
