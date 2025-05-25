package com.google.android.gms.ads.internal.util;

import android.content.Context;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.internal.ads.zzapd;
import com.google.android.gms.internal.ads.zzaph;
import com.google.android.gms.internal.ads.zzapk;
import com.google.android.gms.internal.ads.zzapw;
import com.google.android.gms.internal.ads.zzaqd;
import com.google.android.gms.internal.ads.zzaqi;
import com.google.android.gms.internal.ads.zzbbw;
import com.google.android.gms.internal.ads.zzbku;
import com.google.android.gms.internal.ads.zzfqt;
import com.google.android.gms.internal.ads.zzfqu;
import com.google.android.gms.internal.ads.zzfru;
import java.io.File;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes.dex */
public final class zzaz extends zzapw {

    /* renamed from: a  reason: collision with root package name */
    public final Context f10416a;

    public zzaz(Context context, zzaqi zzaqiVar) {
        super(zzaqiVar);
        this.f10416a = context;
    }

    public static zzapk a(Context context) {
        zzapk zzapkVar = new zzapk(new zzaqd(new File(zzfqu.zza(zzfqt.zza(), context.getCacheDir(), "admob_volley")), 20971520), new zzaz(context, new zzaqi(null, null)), 4);
        zzapkVar.zzd();
        return zzapkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzapw, com.google.android.gms.internal.ads.zzapa
    public final zzapd zza(zzaph zzaphVar) {
        boolean z10;
        if (zzaphVar.zza() == 0) {
            if (Pattern.matches((String) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzdX), zzaphVar.zzk())) {
                com.google.android.gms.ads.internal.util.client.zzf zzfVar = com.google.android.gms.ads.internal.client.zzay.f10107f.f10108a;
                zzfru zzfruVar = com.google.android.gms.ads.internal.util.client.zzf.f10351b;
                GoogleApiAvailabilityLight googleApiAvailabilityLight = GoogleApiAvailabilityLight.f10884b;
                Context context = this.f10416a;
                if (googleApiAvailabilityLight.c(context, 13400000) == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    zzapd zza = new zzbku(context).zza(zzaphVar);
                    if (zza != null) {
                        zze.h("Got gmscore asset response: ".concat(String.valueOf(zzaphVar.zzk())));
                        return zza;
                    }
                    zze.h("Failed to get gmscore asset response: ".concat(String.valueOf(zzaphVar.zzk())));
                }
            }
        }
        return super.zza(zzaphVar);
    }
}
