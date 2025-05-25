package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.AdFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzfkf implements Runnable {
    private final zzfki zzb;
    private String zzc;
    private String zze;
    private zzfew zzf;
    private com.google.android.gms.ads.internal.client.zze zzg;
    private Future zzh;
    private final List zza = new ArrayList();
    private int zzi = 2;
    private zzfkl zzd = zzfkl.SCAR_REQUEST_TYPE_UNSPECIFIED;

    public zzfkf(zzfki zzfkiVar) {
        this.zzb = zzfkiVar;
    }

    @Override // java.lang.Runnable
    public final synchronized void run() {
        zzh();
    }

    public final synchronized zzfkf zza(zzfju zzfjuVar) {
        if (((Boolean) zzbdl.zzc.zze()).booleanValue()) {
            List list = this.zza;
            zzfjuVar.zzj();
            list.add(zzfjuVar);
            Future future = this.zzh;
            if (future != null) {
                future.cancel(false);
            }
            this.zzh = zzbzo.zzd.schedule(this, ((Integer) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzhT)).intValue(), TimeUnit.MILLISECONDS);
        }
        return this;
    }

    public final synchronized zzfkf zzb(String str) {
        if (((Boolean) zzbdl.zzc.zze()).booleanValue() && zzfke.zze(str)) {
            this.zzc = str;
        }
        return this;
    }

    public final synchronized zzfkf zzc(com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (((Boolean) zzbdl.zzc.zze()).booleanValue()) {
            this.zzg = zzeVar;
        }
        return this;
    }

    public final synchronized zzfkf zzd(ArrayList arrayList) {
        if (((Boolean) zzbdl.zzc.zze()).booleanValue()) {
            if (!arrayList.contains("banner") && !arrayList.contains(AdFormat.BANNER.name())) {
                if (!arrayList.contains("interstitial") && !arrayList.contains(AdFormat.INTERSTITIAL.name())) {
                    if (!arrayList.contains("native") && !arrayList.contains(AdFormat.NATIVE.name())) {
                        if (!arrayList.contains("rewarded") && !arrayList.contains(AdFormat.REWARDED.name())) {
                            if (arrayList.contains("app_open_ad")) {
                                this.zzi = 7;
                            } else if (arrayList.contains("rewarded_interstitial") || arrayList.contains(AdFormat.REWARDED_INTERSTITIAL.name())) {
                                this.zzi = 6;
                            }
                        }
                        this.zzi = 5;
                    }
                    this.zzi = 8;
                }
                this.zzi = 4;
            }
            this.zzi = 3;
        }
        return this;
    }

    public final synchronized zzfkf zze(String str) {
        if (((Boolean) zzbdl.zzc.zze()).booleanValue()) {
            this.zze = str;
        }
        return this;
    }

    public final synchronized zzfkf zzf(Bundle bundle) {
        if (((Boolean) zzbdl.zzc.zze()).booleanValue()) {
            this.zzd = com.google.android.gms.ads.nonagon.signalgeneration.zzq.a(bundle);
        }
        return this;
    }

    public final synchronized zzfkf zzg(zzfew zzfewVar) {
        if (((Boolean) zzbdl.zzc.zze()).booleanValue()) {
            this.zzf = zzfewVar;
        }
        return this;
    }

    public final synchronized void zzh() {
        if (!((Boolean) zzbdl.zzc.zze()).booleanValue()) {
            return;
        }
        Future future = this.zzh;
        if (future != null) {
            future.cancel(false);
        }
        for (zzfju zzfjuVar : this.zza) {
            int i10 = this.zzi;
            if (i10 != 2) {
                zzfjuVar.zzn(i10);
            }
            if (!TextUtils.isEmpty(this.zzc)) {
                zzfjuVar.zze(this.zzc);
            }
            if (!TextUtils.isEmpty(this.zze) && !zzfjuVar.zzl()) {
                zzfjuVar.zzd(this.zze);
            }
            zzfew zzfewVar = this.zzf;
            if (zzfewVar != null) {
                zzfjuVar.zzb(zzfewVar);
            } else {
                com.google.android.gms.ads.internal.client.zze zzeVar = this.zzg;
                if (zzeVar != null) {
                    zzfjuVar.zza(zzeVar);
                }
            }
            zzfjuVar.zzf(this.zzd);
            this.zzb.zzb(zzfjuVar.zzm());
        }
        this.zza.clear();
    }

    public final synchronized zzfkf zzi(int i10) {
        if (((Boolean) zzbdl.zzc.zze()).booleanValue()) {
            this.zzi = i10;
        }
        return this;
    }
}
