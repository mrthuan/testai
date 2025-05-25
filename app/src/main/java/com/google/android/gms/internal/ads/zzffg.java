package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzffg {
    public final com.google.android.gms.ads.internal.client.zzfk zza;
    public final zzblh zzb;
    public final zzemk zzc;
    public final com.google.android.gms.ads.internal.client.zzl zzd;
    public final com.google.android.gms.ads.internal.client.zzq zze;
    public final String zzf;
    public final ArrayList zzg;
    public final ArrayList zzh;
    public final zzbes zzi;
    public final com.google.android.gms.ads.internal.client.zzw zzj;
    public final int zzk;
    public final AdManagerAdViewOptions zzl;
    public final PublisherAdViewOptions zzm;
    public final com.google.android.gms.ads.internal.client.zzcb zzn;
    public final zzfet zzo;
    public final boolean zzp;
    public final boolean zzq;
    public final boolean zzr;
    public final Bundle zzs;
    public final com.google.android.gms.ads.internal.client.zzcf zzt;

    public zzffg(zzffe zzffeVar, zzfff zzfffVar) {
        boolean z10;
        com.google.android.gms.ads.internal.client.zzfk zzfkVar;
        zzbes zzl;
        this.zze = zzffe.zzg(zzffeVar);
        this.zzf = zzffe.zzK(zzffeVar);
        this.zzt = zzffe.zzU(zzffeVar);
        int i10 = zzffe.zze(zzffeVar).f10200a;
        long j10 = zzffe.zze(zzffeVar).f10201b;
        Bundle bundle = zzffe.zze(zzffeVar).c;
        int i11 = zzffe.zze(zzffeVar).f10202d;
        List list = zzffe.zze(zzffeVar).f10203e;
        boolean z11 = zzffe.zze(zzffeVar).f10204f;
        int i12 = zzffe.zze(zzffeVar).f10205g;
        if (!zzffe.zze(zzffeVar).f10206h && !zzffe.zzR(zzffeVar)) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.zzd = new com.google.android.gms.ads.internal.client.zzl(i10, j10, bundle, i11, list, z11, i12, z10, zzffe.zze(zzffeVar).f10207i, zzffe.zze(zzffeVar).f10208j, zzffe.zze(zzffeVar).f10209k, zzffe.zze(zzffeVar).f10210l, zzffe.zze(zzffeVar).f10211m, zzffe.zze(zzffeVar).f10212n, zzffe.zze(zzffeVar).f10213o, zzffe.zze(zzffeVar).f10214p, zzffe.zze(zzffeVar).f10215q, zzffe.zze(zzffeVar).f10216r, zzffe.zze(zzffeVar).f10217s, zzffe.zze(zzffeVar).f10218t, zzffe.zze(zzffeVar).f10219u, zzffe.zze(zzffeVar).f10220v, com.google.android.gms.ads.internal.util.zzt.s(zzffe.zze(zzffeVar).f10221w), zzffe.zze(zzffeVar).f10222x, zzffe.zze(zzffeVar).f10223y, zzffe.zze(zzffeVar).f10224z);
        if (zzffe.zzk(zzffeVar) != null) {
            zzfkVar = zzffe.zzk(zzffeVar);
        } else if (zzffe.zzl(zzffeVar) != null) {
            zzfkVar = zzffe.zzl(zzffeVar).zzf;
        } else {
            zzfkVar = null;
        }
        this.zza = zzfkVar;
        this.zzg = zzffe.zzM(zzffeVar);
        this.zzh = zzffe.zzN(zzffeVar);
        if (zzffe.zzM(zzffeVar) == null) {
            zzl = null;
        } else if (zzffe.zzl(zzffeVar) == null) {
            zzl = new zzbes(new NativeAdOptions(new NativeAdOptions.Builder()));
        } else {
            zzl = zzffe.zzl(zzffeVar);
        }
        this.zzi = zzl;
        this.zzj = zzffe.zzi(zzffeVar);
        this.zzk = zzffe.zza(zzffeVar);
        this.zzl = zzffe.zzc(zzffeVar);
        this.zzm = zzffe.zzd(zzffeVar);
        this.zzn = zzffe.zzj(zzffeVar);
        this.zzb = zzffe.zzm(zzffeVar);
        this.zzo = new zzfet(zzffe.zzo(zzffeVar), null);
        this.zzp = zzffe.zzO(zzffeVar);
        this.zzq = zzffe.zzP(zzffeVar);
        this.zzc = zzffe.zzn(zzffeVar);
        this.zzr = zzffe.zzQ(zzffeVar);
        this.zzs = zzffe.zzb(zzffeVar);
    }

    public final zzbgu zza() {
        PublisherAdViewOptions publisherAdViewOptions = this.zzm;
        if (publisherAdViewOptions == null && this.zzl == null) {
            return null;
        }
        if (publisherAdViewOptions != null) {
            IBinder iBinder = publisherAdViewOptions.c;
            if (iBinder == null) {
                return null;
            }
            return zzbgt.zzb(iBinder);
        }
        IBinder iBinder2 = this.zzl.f10075b;
        if (iBinder2 == null) {
            return null;
        }
        return zzbgt.zzb(iBinder2);
    }

    public final boolean zzb() {
        zzbbn zzbbnVar = zzbbw.zzcP;
        return this.zzf.matches((String) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbnVar));
    }
}
