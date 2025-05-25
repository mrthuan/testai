package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.RemoteException;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.ads.mediation.NativeMediationAdRequest;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzbps implements NativeMediationAdRequest {
    private final Date zza;
    private final int zzb;
    private final Set zzc;
    private final boolean zzd;
    private final Location zze;
    private final int zzf;
    private final zzbes zzg;
    private final boolean zzi;
    private final List zzh = new ArrayList();
    private final Map zzj = new HashMap();

    public zzbps(Date date, int i10, Set set, Location location, boolean z10, int i11, zzbes zzbesVar, List list, boolean z11, int i12, String str) {
        this.zza = date;
        this.zzb = i10;
        this.zzc = set;
        this.zze = location;
        this.zzd = z10;
        this.zzf = i11;
        this.zzg = zzbesVar;
        this.zzi = z11;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                if (str2.startsWith("custom:")) {
                    String[] split = str2.split(":", 3);
                    if (split.length == 3) {
                        if ("true".equals(split[2])) {
                            this.zzj.put(split[1], Boolean.TRUE);
                        } else if ("false".equals(split[2])) {
                            this.zzj.put(split[1], Boolean.FALSE);
                        }
                    }
                } else {
                    this.zzh.add(str2);
                }
            }
        }
    }

    public final float getAdVolume() {
        float f10;
        com.google.android.gms.ads.internal.client.zzej b10 = com.google.android.gms.ads.internal.client.zzej.b();
        synchronized (b10.f10172e) {
            com.google.android.gms.ads.internal.client.zzco zzcoVar = b10.f10173f;
            f10 = 1.0f;
            if (zzcoVar != null) {
                try {
                    f10 = zzcoVar.zze();
                } catch (RemoteException unused) {
                    com.google.android.gms.ads.internal.util.client.zzm.g(6);
                }
            }
        }
        return f10;
    }

    @Deprecated
    public final Date getBirthday() {
        return this.zza;
    }

    @Deprecated
    public final int getGender() {
        return this.zzb;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    public final Set<String> getKeywords() {
        return this.zzc;
    }

    public final Location getLocation() {
        return this.zze;
    }

    @Override // com.google.android.gms.ads.mediation.NativeMediationAdRequest
    public final NativeAdOptions getNativeAdOptions() {
        NativeAdOptions.Builder builder = new NativeAdOptions.Builder();
        zzbes zzbesVar = this.zzg;
        if (zzbesVar == null) {
            return new NativeAdOptions(builder);
        }
        int i10 = zzbesVar.zza;
        if (i10 != 2) {
            if (i10 != 3) {
                if (i10 == 4) {
                    builder.f10087g = zzbesVar.zzg;
                    builder.c = zzbesVar.zzh;
                }
                builder.f10082a = zzbesVar.zzb;
                builder.f10083b = zzbesVar.zzc;
                builder.f10084d = zzbesVar.zzd;
                return new NativeAdOptions(builder);
            }
            com.google.android.gms.ads.internal.client.zzfk zzfkVar = zzbesVar.zzf;
            if (zzfkVar != null) {
                builder.f10085e = new VideoOptions(zzfkVar);
            }
        }
        builder.f10086f = zzbesVar.zze;
        builder.f10082a = zzbesVar.zzb;
        builder.f10083b = zzbesVar.zzc;
        builder.f10084d = zzbesVar.zzd;
        return new NativeAdOptions(builder);
    }

    @Override // com.google.android.gms.ads.mediation.NativeMediationAdRequest
    public final com.google.android.gms.ads.nativead.NativeAdOptions getNativeAdRequestOptions() {
        return zzbes.zza(this.zzg);
    }

    public final boolean isAdMuted() {
        boolean z10;
        com.google.android.gms.ads.internal.client.zzej b10 = com.google.android.gms.ads.internal.client.zzej.b();
        synchronized (b10.f10172e) {
            com.google.android.gms.ads.internal.client.zzco zzcoVar = b10.f10173f;
            z10 = false;
            if (zzcoVar != null) {
                try {
                    z10 = zzcoVar.zzv();
                } catch (RemoteException unused) {
                    com.google.android.gms.ads.internal.util.client.zzm.g(6);
                }
            }
        }
        return z10;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    @Deprecated
    public final boolean isDesignedForFamilies() {
        return this.zzi;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    public final boolean isTesting() {
        return this.zzd;
    }

    @Override // com.google.android.gms.ads.mediation.NativeMediationAdRequest
    public final boolean isUnifiedNativeAdRequested() {
        if (this.zzh.contains("6")) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    public final int taggedForChildDirectedTreatment() {
        return this.zzf;
    }

    @Override // com.google.android.gms.ads.mediation.NativeMediationAdRequest
    public final Map zza() {
        return this.zzj;
    }

    @Override // com.google.android.gms.ads.mediation.NativeMediationAdRequest
    public final boolean zzb() {
        if (this.zzh.contains("3")) {
            return true;
        }
        return false;
    }
}
