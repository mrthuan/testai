package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzfeh implements OnAdMetadataChangedListener {
    final /* synthetic */ com.google.android.gms.ads.internal.client.zzby zza;
    final /* synthetic */ zzfei zzb;

    public zzfeh(zzfei zzfeiVar, com.google.android.gms.ads.internal.client.zzby zzbyVar) {
        this.zza = zzbyVar;
        this.zzb = zzfeiVar;
    }

    @Override // com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener
    public final void onAdMetadataChanged() {
        zzdop zzdopVar;
        zzdopVar = this.zzb.zzd;
        if (zzdopVar != null) {
            try {
                this.zza.zze();
            } catch (RemoteException e10) {
                com.google.android.gms.ads.internal.util.client.zzm.f("#007 Could not call remote method.", e10);
            }
        }
    }
}
