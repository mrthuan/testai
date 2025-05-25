package com.google.android.gms.internal.consent_sdk;

import android.app.Activity;
import x9.b;
import x9.f;

/* compiled from: com.google.android.ump:user-messaging-platform@@3.0.0 */
/* loaded from: classes2.dex */
public final /* synthetic */ class zzbl implements f {
    public final /* synthetic */ Activity zza;
    public final /* synthetic */ b.a zzb;

    public /* synthetic */ zzbl(Activity activity, b.a aVar) {
        this.zza = activity;
        this.zzb = aVar;
    }

    @Override // x9.f
    public final void onConsentFormLoadSuccess(b bVar) {
        bVar.show(this.zza, this.zzb);
    }
}
