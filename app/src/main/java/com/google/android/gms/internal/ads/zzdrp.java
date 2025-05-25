package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import com.inmobi.media.C1646h;
import java.util.Locale;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzdrp implements zzdbl, com.google.android.gms.ads.internal.client.zza, zzcxk, zzcwu {
    private final Context zza;
    private final zzffy zzb;
    private final zzdsk zzc;
    private final zzfex zzd;
    private final zzfel zze;
    private final zzedh zzf;
    private final String zzg;
    private Boolean zzh;
    private final boolean zzi = ((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzgg)).booleanValue();

    public zzdrp(Context context, zzffy zzffyVar, zzdsk zzdskVar, zzfex zzfexVar, zzfel zzfelVar, zzedh zzedhVar, String str) {
        this.zza = context;
        this.zzb = zzffyVar;
        this.zzc = zzdskVar;
        this.zzd = zzfexVar;
        this.zze = zzfelVar;
        this.zzf = zzedhVar;
        this.zzg = str;
    }

    private final zzdsj zzd(String str) {
        String str2;
        zzdsj zza = this.zzc.zza();
        zza.zzd(this.zzd.zzb.zzb);
        zza.zzc(this.zze);
        zza.zzb("action", str);
        zza.zzb("ad_format", this.zzg.toUpperCase(Locale.ROOT));
        boolean z10 = false;
        if (!this.zze.zzt.isEmpty()) {
            zza.zzb("ancn", (String) this.zze.zzt.get(0));
        }
        if (this.zze.zzai) {
            Context context = this.zza;
            com.google.android.gms.ads.internal.zzu zzuVar = com.google.android.gms.ads.internal.zzu.B;
            if (true != zzuVar.f10557g.zzA(context)) {
                str2 = "offline";
            } else {
                str2 = u.b.ONLINE_EXTRAS_KEY;
            }
            zza.zzb("device_connectivity", str2);
            zzuVar.f10560j.getClass();
            zza.zzb("event_timestamp", String.valueOf(System.currentTimeMillis()));
            zza.zzb("offline_ad", "1");
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzgo)).booleanValue()) {
            if (com.google.android.gms.ads.nonagon.signalgeneration.zzq.e(this.zzd.zza.zza) != 1) {
                z10 = true;
            }
            zza.zzb("scar", String.valueOf(z10));
            if (z10) {
                com.google.android.gms.ads.internal.client.zzl zzlVar = this.zzd.zza.zza.zzd;
                zza.zzb("ragent", zzlVar.f10214p);
                zza.zzb("rtype", com.google.android.gms.ads.nonagon.signalgeneration.zzq.b(com.google.android.gms.ads.nonagon.signalgeneration.zzq.c(zzlVar)));
            }
        }
        return zza;
    }

    private final void zze(zzdsj zzdsjVar) {
        if (this.zze.zzai) {
            String zze = zzdsjVar.zze();
            com.google.android.gms.ads.internal.zzu.B.f10560j.getClass();
            this.zzf.zzd(new zzedj(System.currentTimeMillis(), this.zzd.zzb.zzb.zzb, zze, 2));
            return;
        }
        zzdsjVar.zzf();
    }

    private final boolean zzf() {
        String str;
        if (this.zzh == null) {
            synchronized (this) {
                try {
                } catch (RuntimeException e10) {
                    com.google.android.gms.ads.internal.zzu.B.f10557g.zzw(e10, "CsiActionsListener.isPatternMatched");
                } finally {
                }
                if (this.zzh == null) {
                    String str2 = (String) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzbj);
                    com.google.android.gms.ads.internal.util.zzt zztVar = com.google.android.gms.ads.internal.zzu.B.c;
                    try {
                        str = com.google.android.gms.ads.internal.util.zzt.C(this.zza);
                    } catch (RemoteException unused) {
                        str = null;
                    }
                    boolean z10 = false;
                    if (str2 != null && str != null) {
                        z10 = Pattern.matches(str2, str);
                    }
                    this.zzh = Boolean.valueOf(z10);
                }
            }
        }
        return this.zzh.booleanValue();
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        if (!this.zze.zzai) {
            return;
        }
        zze(zzd(C1646h.CLICK_BEACON));
    }

    @Override // com.google.android.gms.internal.ads.zzcwu
    public final void zza(com.google.android.gms.ads.internal.client.zze zzeVar) {
        com.google.android.gms.ads.internal.client.zze zzeVar2;
        if (!this.zzi) {
            return;
        }
        zzdsj zzd = zzd("ifts");
        zzd.zzb("reason", "adapter");
        int i10 = zzeVar.f10146a;
        if (zzeVar.c.equals("com.google.android.gms.ads") && (zzeVar2 = zzeVar.f10148d) != null && !zzeVar2.c.equals("com.google.android.gms.ads")) {
            zzeVar = zzeVar.f10148d;
            i10 = zzeVar.f10146a;
        }
        String str = zzeVar.f10147b;
        if (i10 >= 0) {
            zzd.zzb("arec", String.valueOf(i10));
        }
        String zza = this.zzb.zza(str);
        if (zza != null) {
            zzd.zzb("areec", zza);
        }
        zzd.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzcwu
    public final void zzb() {
        if (!this.zzi) {
            return;
        }
        zzdsj zzd = zzd("ifts");
        zzd.zzb("reason", "blocked");
        zzd.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzcwu
    public final void zzc(zzdgw zzdgwVar) {
        if (!this.zzi) {
            return;
        }
        zzdsj zzd = zzd("ifts");
        zzd.zzb("reason", "exception");
        if (!TextUtils.isEmpty(zzdgwVar.getMessage())) {
            zzd.zzb("msg", zzdgwVar.getMessage());
        }
        zzd.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzdbl
    public final void zzi() {
        if (!zzf()) {
            return;
        }
        zzd("adapter_shown").zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzdbl
    public final void zzj() {
        if (!zzf()) {
            return;
        }
        zzd("adapter_impression").zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzcxk
    public final void zzr() {
        if (!zzf() && !this.zze.zzai) {
            return;
        }
        zze(zzd("impression"));
    }
}
