package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.appopen.AppOpenAd;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzazx {
    private com.google.android.gms.ads.internal.client.zzbu zza;
    private final Context zzb;
    private final String zzc;
    private final com.google.android.gms.ads.internal.client.zzdx zzd;
    @AppOpenAd.AppOpenAdOrientation
    private final int zze;
    private final AppOpenAd.AppOpenAdLoadCallback zzf;
    private final zzboi zzg = new zzboi();
    private final com.google.android.gms.ads.internal.client.zzp zzh = com.google.android.gms.ads.internal.client.zzp.f10237a;

    public zzazx(Context context, String str, com.google.android.gms.ads.internal.client.zzdx zzdxVar, @AppOpenAd.AppOpenAdOrientation int i10, AppOpenAd.AppOpenAdLoadCallback appOpenAdLoadCallback) {
        this.zzb = context;
        this.zzc = str;
        this.zzd = zzdxVar;
        this.zze = i10;
        this.zzf = appOpenAdLoadCallback;
    }

    public final void zza() {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            com.google.android.gms.ads.internal.client.zzq d10 = com.google.android.gms.ads.internal.client.zzq.d();
            com.google.android.gms.ads.internal.client.zzaw zzawVar = com.google.android.gms.ads.internal.client.zzay.f10107f.f10109b;
            Context context = this.zzb;
            String str = this.zzc;
            zzboi zzboiVar = this.zzg;
            zzawVar.getClass();
            com.google.android.gms.ads.internal.client.zzbu zzbuVar = (com.google.android.gms.ads.internal.client.zzbu) new k7.g(zzawVar, context, d10, str, zzboiVar).d(context, false);
            this.zza = zzbuVar;
            if (zzbuVar != null) {
                if (this.zze != 3) {
                    this.zza.zzI(new com.google.android.gms.ads.internal.client.zzw(this.zze));
                }
                this.zzd.f10143k = currentTimeMillis;
                this.zza.zzH(new zzazk(this.zzf, this.zzc));
                com.google.android.gms.ads.internal.client.zzbu zzbuVar2 = this.zza;
                com.google.android.gms.ads.internal.client.zzp zzpVar = this.zzh;
                Context context2 = this.zzb;
                com.google.android.gms.ads.internal.client.zzdx zzdxVar = this.zzd;
                zzpVar.getClass();
                zzbuVar2.zzab(com.google.android.gms.ads.internal.client.zzp.a(context2, zzdxVar));
            }
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzm.f("#007 Could not call remote method.", e10);
        }
    }
}
