package com.google.android.gms.internal.consent_sdk;

import x9.b;
import x9.d;
import x9.e;
import x9.f;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.ump:user-messaging-platform@@3.0.0 */
/* loaded from: classes2.dex */
public final class zzba implements f, e {
    private final f zza;
    private final e zzb;

    public /* synthetic */ zzba(f fVar, e eVar, zzaz zzazVar) {
        this.zza = fVar;
        this.zzb = eVar;
    }

    @Override // x9.e
    public final void onConsentFormLoadFailure(d dVar) {
        this.zzb.onConsentFormLoadFailure(dVar);
    }

    @Override // x9.f
    public final void onConsentFormLoadSuccess(b bVar) {
        this.zza.onConsentFormLoadSuccess(bVar);
    }
}
