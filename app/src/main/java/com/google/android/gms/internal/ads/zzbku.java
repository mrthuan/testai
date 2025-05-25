package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.os.SystemClock;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzbku implements zzapa {
    private volatile zzbkh zza;
    private final Context zzb;

    public zzbku(Context context) {
        this.zzb = context;
    }

    public static /* bridge */ /* synthetic */ void zzc(zzbku zzbkuVar) {
        if (zzbkuVar.zza == null) {
            return;
        }
        zzbkuVar.zza.disconnect();
        Binder.flushPendingCommands();
    }

    @Override // com.google.android.gms.internal.ads.zzapa
    public final zzapd zza(zzaph zzaphVar) {
        Parcelable.Creator<zzbki> creator = zzbki.CREATOR;
        Map zzl = zzaphVar.zzl();
        int size = zzl.size();
        String[] strArr = new String[size];
        String[] strArr2 = new String[size];
        int i10 = 0;
        int i11 = 0;
        for (Map.Entry entry : zzl.entrySet()) {
            strArr[i11] = (String) entry.getKey();
            strArr2[i11] = (String) entry.getValue();
            i11++;
        }
        zzbki zzbkiVar = new zzbki(zzaphVar.zzk(), strArr, strArr2);
        com.google.android.gms.ads.internal.zzu zzuVar = com.google.android.gms.ads.internal.zzu.B;
        zzuVar.f10560j.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        try {
            zzbzt zzbztVar = new zzbzt();
            this.zza = new zzbkh(this.zzb, zzuVar.f10568r.a(), new zzbks(this, zzbztVar), new zzbkt(this, zzbztVar));
            this.zza.checkAvailabilityAndConnect();
            zzbkq zzbkqVar = new zzbkq(this, zzbkiVar);
            zzgcu zzgcuVar = zzbzo.zza;
            y9.a zzo = zzgcj.zzo(zzgcj.zzn(zzbztVar, zzbkqVar, zzgcuVar), ((Integer) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzdY)).intValue(), TimeUnit.MILLISECONDS, zzbzo.zzd);
            zzo.addListener(new zzbkr(this), zzgcuVar);
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) zzo.get();
            zzuVar.f10560j.getClass();
            com.google.android.gms.ads.internal.util.zze.h("Http assets remote cache took " + (SystemClock.elapsedRealtime() - elapsedRealtime) + "ms");
            zzbkk zzbkkVar = (zzbkk) new zzbuz(parcelFileDescriptor).zza(zzbkk.CREATOR);
            if (zzbkkVar == null) {
                return null;
            }
            if (!zzbkkVar.zza) {
                if (zzbkkVar.zze.length != zzbkkVar.zzf.length) {
                    return null;
                }
                HashMap hashMap = new HashMap();
                while (true) {
                    String[] strArr3 = zzbkkVar.zze;
                    if (i10 < strArr3.length) {
                        hashMap.put(strArr3[i10], zzbkkVar.zzf[i10]);
                        i10++;
                    } else {
                        return new zzapd(zzbkkVar.zzc, zzbkkVar.zzd, hashMap, zzbkkVar.zzg, zzbkkVar.zzh);
                    }
                }
            } else {
                throw new zzapq(zzbkkVar.zzb);
            }
        } catch (InterruptedException | ExecutionException unused) {
            com.google.android.gms.ads.internal.zzu.B.f10560j.getClass();
            com.google.android.gms.ads.internal.util.zze.h("Http assets remote cache took " + (SystemClock.elapsedRealtime() - elapsedRealtime) + "ms");
            return null;
        } catch (Throwable th2) {
            com.google.android.gms.ads.internal.zzu.B.f10560j.getClass();
            com.google.android.gms.ads.internal.util.zze.h("Http assets remote cache took " + (SystemClock.elapsedRealtime() - elapsedRealtime) + "ms");
            throw th2;
        }
    }
}
