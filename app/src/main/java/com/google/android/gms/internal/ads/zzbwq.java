package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.rewarded.RewardItem;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzbwq implements RewardItem {
    private final zzbwd zza;

    public zzbwq(zzbwd zzbwdVar) {
        this.zza = zzbwdVar;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardItem
    public final int getAmount() {
        zzbwd zzbwdVar = this.zza;
        if (zzbwdVar != null) {
            try {
                return zzbwdVar.zze();
            } catch (RemoteException unused) {
                com.google.android.gms.ads.internal.util.client.zzm.g(5);
            }
        }
        return 0;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardItem
    public final String getType() {
        zzbwd zzbwdVar = this.zza;
        if (zzbwdVar != null) {
            try {
                return zzbwdVar.zzf();
            } catch (RemoteException unused) {
                com.google.android.gms.ads.internal.util.client.zzm.g(5);
            }
        }
        return null;
    }
}
