package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzcbl {
    private static final boolean zza;
    private final Context zzb;
    private final String zzc;
    private final VersionInfoParcel zzd;
    private final zzbci zze;
    private final zzbcl zzf;
    private final com.google.android.gms.ads.internal.util.zzbh zzg;
    private final long[] zzh;
    private final String[] zzi;
    private boolean zzj;
    private boolean zzk;
    private boolean zzl;
    private boolean zzm;
    private boolean zzn;
    private zzcaq zzo;
    private boolean zzp;
    private boolean zzq;
    private long zzr;

    static {
        boolean z10;
        if (com.google.android.gms.ads.internal.client.zzay.f10107f.f10111e.nextInt(100) < ((Integer) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzlK)).intValue()) {
            z10 = true;
        } else {
            z10 = false;
        }
        zza = z10;
    }

    public zzcbl(Context context, VersionInfoParcel versionInfoParcel, String str, zzbcl zzbclVar, zzbci zzbciVar) {
        com.google.android.gms.ads.internal.util.zzbf zzbfVar = new com.google.android.gms.ads.internal.util.zzbf();
        zzbfVar.a("min_1", Double.MIN_VALUE, 1.0d);
        zzbfVar.a("1_5", 1.0d, 5.0d);
        zzbfVar.a("5_10", 5.0d, 10.0d);
        zzbfVar.a("10_20", 10.0d, 20.0d);
        zzbfVar.a("20_30", 20.0d, 30.0d);
        zzbfVar.a("30_max", 30.0d, Double.MAX_VALUE);
        this.zzg = new com.google.android.gms.ads.internal.util.zzbh(zzbfVar);
        this.zzj = false;
        this.zzk = false;
        this.zzl = false;
        this.zzm = false;
        this.zzr = -1L;
        this.zzb = context;
        this.zzd = versionInfoParcel;
        this.zzc = str;
        this.zzf = zzbclVar;
        this.zze = zzbciVar;
        String str2 = (String) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzu);
        if (str2 == null) {
            this.zzi = new String[0];
            this.zzh = new long[0];
            return;
        }
        String[] split = TextUtils.split(str2, ",");
        int length = split.length;
        this.zzi = new String[length];
        this.zzh = new long[length];
        for (int i10 = 0; i10 < split.length; i10++) {
            try {
                this.zzh[i10] = Long.parseLong(split[i10]);
            } catch (NumberFormatException unused) {
                com.google.android.gms.ads.internal.util.client.zzm.g(5);
                this.zzh[i10] = -1;
            }
        }
    }

    public final void zza(zzcaq zzcaqVar) {
        zzbcd.zza(this.zzf, this.zze, "vpc2");
        this.zzj = true;
        this.zzf.zzd("vpn", zzcaqVar.zzj());
        this.zzo = zzcaqVar;
    }

    public final void zzb() {
        if (this.zzj && !this.zzk) {
            zzbcd.zza(this.zzf, this.zze, "vfr2");
            this.zzk = true;
        }
    }

    public final void zzc() {
        this.zzn = true;
        if (this.zzk && !this.zzl) {
            zzbcd.zza(this.zzf, this.zze, "vfp2");
            this.zzl = true;
        }
    }

    public final void zzd() {
        Bundle a10;
        if (zza && !this.zzp) {
            Bundle bundle = new Bundle();
            bundle.putString("type", "native-player-metrics");
            bundle.putString("request", this.zzc);
            bundle.putString("player", this.zzo.zzj());
            com.google.android.gms.ads.internal.util.zzbh zzbhVar = this.zzg;
            zzbhVar.getClass();
            String[] strArr = zzbhVar.f10425a;
            ArrayList arrayList = new ArrayList(strArr.length);
            for (int i10 = 0; i10 < strArr.length; i10++) {
                String str = strArr[i10];
                double d10 = zzbhVar.c[i10];
                double d11 = zzbhVar.f10426b[i10];
                int i11 = zzbhVar.f10427d[i10];
                arrayList.add(new com.google.android.gms.ads.internal.util.zzbe(str, d10, d11, i11 / zzbhVar.f10428e, i11));
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                com.google.android.gms.ads.internal.util.zzbe zzbeVar = (com.google.android.gms.ads.internal.util.zzbe) it.next();
                String valueOf = String.valueOf(zzbeVar.f10419a);
                bundle.putString("fps_c_".concat(valueOf), Integer.toString(zzbeVar.f10422e));
                String valueOf2 = String.valueOf(zzbeVar.f10419a);
                bundle.putString("fps_p_".concat(valueOf2), Double.toString(zzbeVar.f10421d));
            }
            int i12 = 0;
            while (true) {
                long[] jArr = this.zzh;
                if (i12 >= jArr.length) {
                    break;
                }
                String str2 = this.zzi[i12];
                if (str2 != null) {
                    bundle.putString("fh_".concat(Long.valueOf(jArr[i12]).toString()), str2);
                }
                i12++;
            }
            final Context context = this.zzb;
            VersionInfoParcel versionInfoParcel = this.zzd;
            final com.google.android.gms.ads.internal.util.zzt zztVar = com.google.android.gms.ads.internal.zzu.B.c;
            final String str3 = versionInfoParcel.f10345a;
            zztVar.getClass();
            bundle.putString("device", com.google.android.gms.ads.internal.util.zzt.E());
            zzbbn zzbbnVar = zzbbw.zza;
            com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f10115d;
            bundle.putString("eids", TextUtils.join(",", zzbaVar.f10116a.zza()));
            if (bundle.isEmpty()) {
                com.google.android.gms.ads.internal.util.client.zzm.b("Empty or null bundle.");
            } else {
                final String str4 = (String) zzbaVar.c.zza(zzbbw.zzjG);
                boolean andSet = zztVar.f10499d.getAndSet(true);
                AtomicReference atomicReference = zztVar.c;
                if (!andSet) {
                    SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.google.android.gms.ads.internal.util.zzm
                        @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                        public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str5) {
                            zzt.this.c.set(zzad.a(context, str4));
                        }
                    };
                    if (TextUtils.isEmpty(str4)) {
                        a10 = Bundle.EMPTY;
                    } else {
                        PreferenceManager.getDefaultSharedPreferences(context).registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
                        a10 = com.google.android.gms.ads.internal.util.zzad.a(context, str4);
                    }
                    atomicReference.set(a10);
                }
                bundle.putAll((Bundle) atomicReference.get());
            }
            com.google.android.gms.ads.internal.util.client.zzf zzfVar = com.google.android.gms.ads.internal.client.zzay.f10107f.f10108a;
            com.google.android.gms.ads.internal.util.client.zzf.n(context, str3, bundle, new com.google.android.gms.ads.internal.util.client.zze() { // from class: com.google.android.gms.ads.internal.util.zzl
                @Override // com.google.android.gms.ads.internal.util.client.zze
                public final boolean zza(String str5) {
                    zzf zzfVar2 = zzt.f10496l;
                    zzt zztVar2 = com.google.android.gms.ads.internal.zzu.B.c;
                    zzt.j(context, str3, str5);
                    return true;
                }
            });
            this.zzp = true;
        }
    }

    public final void zze() {
        this.zzn = false;
    }

    public final void zzf(zzcaq zzcaqVar) {
        long j10;
        if (this.zzl && !this.zzm) {
            if (com.google.android.gms.ads.internal.util.zze.i() && !this.zzm) {
                com.google.android.gms.ads.internal.util.zze.h("VideoMetricsMixin first frame");
            }
            zzbcd.zza(this.zzf, this.zze, "vff2");
            this.zzm = true;
        }
        com.google.android.gms.ads.internal.zzu.B.f10560j.getClass();
        long nanoTime = System.nanoTime();
        if (this.zzn && this.zzq && this.zzr != -1) {
            com.google.android.gms.ads.internal.util.zzbh zzbhVar = this.zzg;
            double nanos = TimeUnit.SECONDS.toNanos(1L) / (nanoTime - this.zzr);
            zzbhVar.f10428e++;
            int i10 = 0;
            while (true) {
                double[] dArr = zzbhVar.c;
                if (i10 >= dArr.length) {
                    break;
                }
                double d10 = dArr[i10];
                if (d10 <= nanos && nanos < zzbhVar.f10426b[i10]) {
                    int[] iArr = zzbhVar.f10427d;
                    iArr[i10] = iArr[i10] + 1;
                }
                if (nanos < d10) {
                    break;
                }
                i10++;
            }
        }
        this.zzq = this.zzn;
        this.zzr = nanoTime;
        long longValue = ((Long) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzv)).longValue();
        long zza2 = zzcaqVar.zza();
        int i11 = 0;
        while (true) {
            String[] strArr = this.zzi;
            if (i11 < strArr.length) {
                if (strArr[i11] == null && longValue > Math.abs(zza2 - this.zzh[i11])) {
                    String[] strArr2 = this.zzi;
                    int i12 = 8;
                    Bitmap bitmap = zzcaqVar.getBitmap(8, 8);
                    long j11 = 63;
                    int i13 = 0;
                    long j12 = 0;
                    while (i13 < i12) {
                        int i14 = 0;
                        while (i14 < i12) {
                            int pixel = bitmap.getPixel(i14, i13);
                            if (Color.green(pixel) + Color.red(pixel) + Color.blue(pixel) > 128) {
                                j10 = 1;
                            } else {
                                j10 = 0;
                            }
                            j12 |= j10 << ((int) j11);
                            j11--;
                            i14++;
                            i12 = 8;
                        }
                        i13++;
                        i12 = 8;
                    }
                    strArr2[i11] = String.format("%016X", Long.valueOf(j12));
                    return;
                }
                i11++;
            } else {
                return;
            }
        }
    }
}
