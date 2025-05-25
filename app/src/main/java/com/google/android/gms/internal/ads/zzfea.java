package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzfea implements OnAdMetadataChangedListener {
    final /* synthetic */ com.google.android.gms.ads.internal.client.zzdd zza;
    final /* synthetic */ zzfec zzb;

    public zzfea(zzfec zzfecVar, com.google.android.gms.ads.internal.client.zzdd zzddVar) {
        this.zza = zzddVar;
        this.zzb = zzfecVar;
    }

    @Override // com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener
    public final void onAdMetadataChanged() {
        zzdop zzdopVar;
        zzdopVar = this.zzb.zzi;
        if (zzdopVar != null) {
            try {
                this.zza.zze();
            } catch (RemoteException e10) {
                com.google.android.gms.ads.internal.util.client.zzm.f("#007 Could not call remote method.", e10);
            }
        }
    }
}
