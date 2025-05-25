package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzevr {
    private final Context zza;
    private final Set zzb;
    private final Executor zzc;
    private final zzfkf zzd;
    private final zzdsk zze;
    private long zzf = 0;
    private int zzg = 0;

    public zzevr(Context context, Executor executor, Set set, zzfkf zzfkfVar, zzdsk zzdskVar) {
        this.zza = context;
        this.zzc = executor;
        this.zzb = set;
        this.zzd = zzfkfVar;
        this.zze = zzdskVar;
    }

    public final y9.a zza(final Object obj, final Bundle bundle) {
        zzfju zza = zzfjt.zza(this.zza, 8);
        zza.zzi();
        final ArrayList arrayList = new ArrayList(this.zzb.size());
        List arrayList2 = new ArrayList();
        zzbbn zzbbnVar = zzbbw.zzkQ;
        com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f10115d;
        boolean isEmpty = ((String) zzbaVar.c.zza(zzbbnVar)).isEmpty();
        zzbbu zzbbuVar = zzbaVar.c;
        if (!isEmpty) {
            arrayList2 = Arrays.asList(((String) zzbbuVar.zza(zzbbnVar)).split(","));
        }
        com.google.android.gms.ads.internal.zzu zzuVar = com.google.android.gms.ads.internal.zzu.B;
        zzuVar.f10560j.getClass();
        this.zzf = SystemClock.elapsedRealtime();
        final Bundle bundle2 = new Bundle();
        if (((Boolean) zzbbuVar.zza(zzbbw.zzbS)).booleanValue() && bundle != null) {
            zzuVar.f10560j.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            if (obj instanceof Bundle) {
                bundle.putLong(zzdrt.CLIENT_SIGNALS_START.zza(), currentTimeMillis);
            } else {
                bundle.putLong(zzdrt.GMS_SIGNALS_START.zza(), currentTimeMillis);
            }
        }
        for (final zzevo zzevoVar : this.zzb) {
            if (!arrayList2.contains(String.valueOf(zzevoVar.zza()))) {
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzfo)).booleanValue() || zzevoVar.zza() != 44) {
                    com.google.android.gms.ads.internal.zzu.B.f10560j.getClass();
                    final long elapsedRealtime = SystemClock.elapsedRealtime();
                    y9.a zzb = zzevoVar.zzb();
                    zzb.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzevp
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzevr.this.zzb(elapsedRealtime, zzevoVar, bundle2);
                        }
                    }, zzbzo.zzf);
                    arrayList.add(zzb);
                }
            }
        }
        y9.a zza2 = zzgcj.zzb(arrayList).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzevq
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Object obj2;
                Bundle bundle3;
                Iterator it = arrayList.iterator();
                while (true) {
                    obj2 = obj;
                    if (!it.hasNext()) {
                        break;
                    }
                    zzevn zzevnVar = (zzevn) ((y9.a) it.next()).get();
                    if (zzevnVar != null) {
                        zzevnVar.zzj(obj2);
                    }
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzbS)).booleanValue() && (bundle3 = bundle) != null) {
                    Bundle bundle4 = bundle2;
                    com.google.android.gms.ads.internal.zzu.B.f10560j.getClass();
                    long currentTimeMillis2 = System.currentTimeMillis();
                    if (obj2 instanceof Bundle) {
                        bundle3.putLong(zzdrt.CLIENT_SIGNALS_END.zza(), currentTimeMillis2);
                        bundle3.putBundle("client_sig_latency_key", bundle4);
                    } else {
                        bundle3.putLong(zzdrt.GMS_SIGNALS_END.zza(), currentTimeMillis2);
                        bundle3.putBundle("gms_sig_latency_key", bundle4);
                    }
                }
                return obj2;
            }
        }, this.zzc);
        if (zzfki.zza()) {
            zzfke.zza(zza2, this.zzd, zza);
        }
        return zza2;
    }

    public final void zzb(long j10, zzevo zzevoVar, Bundle bundle) {
        com.google.android.gms.ads.internal.zzu zzuVar = com.google.android.gms.ads.internal.zzu.B;
        zzuVar.f10560j.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime() - j10;
        if (((Boolean) zzbdu.zza.zze()).booleanValue()) {
            com.google.android.gms.ads.internal.util.zze.h("Signal runtime (ms) : " + zzfvj.zzc(zzevoVar.getClass().getCanonicalName()) + " = " + elapsedRealtime);
        }
        zzbbn zzbbnVar = zzbbw.zzbS;
        com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f10115d;
        if (((Boolean) zzbaVar.c.zza(zzbbnVar)).booleanValue()) {
            if (((Boolean) zzbaVar.c.zza(zzbbw.zzbT)).booleanValue()) {
                synchronized (this) {
                    bundle.putLong("sig" + zzevoVar.zza(), elapsedRealtime);
                }
            }
        }
        if (!((Boolean) zzbaVar.c.zza(zzbbw.zzbQ)).booleanValue()) {
            return;
        }
        zzdsj zza = this.zze.zza();
        zza.zzb("action", "lat_ms");
        zza.zzb("lat_grp", "sig_lat_grp");
        zza.zzb("lat_id", String.valueOf(zzevoVar.zza()));
        zza.zzb("clat_ms", String.valueOf(elapsedRealtime));
        if (((Boolean) zzbaVar.c.zza(zzbbw.zzbR)).booleanValue()) {
            synchronized (this) {
                this.zzg++;
            }
            zza.zzb("seq_num", zzuVar.f10557g.zzh().zzd());
            synchronized (this) {
                if (this.zzg == this.zzb.size() && this.zzf != 0) {
                    this.zzg = 0;
                    zzuVar.f10560j.getClass();
                    String valueOf = String.valueOf(SystemClock.elapsedRealtime() - this.zzf);
                    if (zzevoVar.zza() > 39 && zzevoVar.zza() < 52) {
                        zza.zzb("lat_gmssg", valueOf);
                    } else {
                        zza.zzb("lat_clsg", valueOf);
                    }
                }
            }
        }
        zza.zzg();
    }
}
