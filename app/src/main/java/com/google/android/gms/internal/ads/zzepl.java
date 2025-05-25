package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.PDLayoutAttributeObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzepl implements zzevo {
    private static final Object zzb = new Object();
    final Context zza;
    private final String zzc;
    private final String zzd;
    private final long zze;
    private final zzcto zzf;
    private final zzfgo zzg;
    private final zzffg zzh;
    private final com.google.android.gms.ads.internal.util.zzg zzi = com.google.android.gms.ads.internal.zzu.B.f10557g.zzi();
    private final zzdsf zzj;
    private final zzcub zzk;

    public zzepl(Context context, String str, String str2, zzcto zzctoVar, zzfgo zzfgoVar, zzffg zzffgVar, zzdsf zzdsfVar, zzcub zzcubVar, long j10) {
        this.zza = context;
        this.zzc = str;
        this.zzd = str2;
        this.zzf = zzctoVar;
        this.zzg = zzfgoVar;
        this.zzh = zzffgVar;
        this.zzj = zzdsfVar;
        this.zzk = zzcubVar;
        this.zze = j10;
    }

    @Override // com.google.android.gms.internal.ads.zzevo
    public final int zza() {
        return 12;
    }

    @Override // com.google.android.gms.internal.ads.zzevo
    public final y9.a zzb() {
        String str;
        final Bundle bundle = new Bundle();
        this.zzj.zzb().put("seq_num", this.zzc);
        zzbbn zzbbnVar = zzbbw.zzbS;
        com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f10115d;
        if (((Boolean) zzbaVar.c.zza(zzbbnVar)).booleanValue()) {
            zzdsf zzdsfVar = this.zzj;
            com.google.android.gms.ads.internal.zzu.B.f10560j.getClass();
            zzdsfVar.zzc("tsacc", String.valueOf(System.currentTimeMillis() - this.zze));
            zzdsf zzdsfVar2 = this.zzj;
            if (true != com.google.android.gms.ads.internal.util.zzt.e(this.zza)) {
                str = "1";
            } else {
                str = PDLayoutAttributeObject.GLYPH_ORIENTATION_VERTICAL_ZERO_DEGREES;
            }
            zzdsfVar2.zzc("foreground", str);
        }
        if (((Boolean) zzbaVar.c.zza(zzbbw.zzeX)).booleanValue()) {
            this.zzf.zzk(this.zzh.zzd);
            bundle.putAll(this.zzg.zzb());
        }
        return zzgcj.zzh(new zzevn() { // from class: com.google.android.gms.internal.ads.zzepk
            @Override // com.google.android.gms.internal.ads.zzevn
            public final void zzj(Object obj) {
                zzepl.this.zzc(bundle, (Bundle) obj);
            }
        });
    }

    public final void zzc(Bundle bundle, Bundle bundle2) {
        zzbbn zzbbnVar = zzbbw.zzeX;
        com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f10115d;
        if (((Boolean) zzbaVar.c.zza(zzbbnVar)).booleanValue()) {
            bundle2.putBundle("quality_signals", bundle);
        } else {
            if (((Boolean) zzbaVar.c.zza(zzbbw.zzeW)).booleanValue()) {
                synchronized (zzb) {
                    this.zzf.zzk(this.zzh.zzd);
                    bundle2.putBundle("quality_signals", this.zzg.zzb());
                }
            } else {
                this.zzf.zzk(this.zzh.zzd);
                bundle2.putBundle("quality_signals", this.zzg.zzb());
            }
        }
        bundle2.putString("seq_num", this.zzc);
        if (!this.zzi.zzS()) {
            bundle2.putString("session_id", this.zzd);
        }
        bundle2.putBoolean("client_purpose_one", !this.zzi.zzS());
        if (((Boolean) zzbaVar.c.zza(zzbbw.zzeY)).booleanValue()) {
            try {
                com.google.android.gms.ads.internal.util.zzt zztVar = com.google.android.gms.ads.internal.zzu.B.c;
                bundle2.putString("_app_id", com.google.android.gms.ads.internal.util.zzt.C(this.zza));
            } catch (RemoteException | RuntimeException e10) {
                com.google.android.gms.ads.internal.zzu.B.f10557g.zzw(e10, "AppStatsSignal_AppId");
            }
        }
        zzbbn zzbbnVar2 = zzbbw.zzeZ;
        com.google.android.gms.ads.internal.client.zzba zzbaVar2 = com.google.android.gms.ads.internal.client.zzba.f10115d;
        if (((Boolean) zzbaVar2.c.zza(zzbbnVar2)).booleanValue() && this.zzh.zzf != null) {
            Bundle bundle3 = new Bundle();
            bundle3.putLong("dload", this.zzk.zzb(this.zzh.zzf));
            bundle3.putInt("pcc", this.zzk.zza(this.zzh.zzf));
            bundle2.putBundle("ad_unit_quality_signals", bundle3);
        }
        if (((Boolean) zzbaVar2.c.zza(zzbbw.zziQ)).booleanValue()) {
            com.google.android.gms.ads.internal.zzu zzuVar = com.google.android.gms.ads.internal.zzu.B;
            if (zzuVar.f10557g.zza() > 0) {
                bundle2.putInt("nrwv", zzuVar.f10557g.zza());
            }
        }
    }
}
