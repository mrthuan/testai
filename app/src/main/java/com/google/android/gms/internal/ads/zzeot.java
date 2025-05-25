package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzeot implements zzevo {
    private final Context zza;
    private final zzgcu zzb;

    public zzeot(zzgcu zzgcuVar, Context context) {
        this.zzb = zzgcuVar;
        this.zza = context;
    }

    private static final zzeou zzc() {
        return new zzeou(null, false);
    }

    @Override // com.google.android.gms.internal.ads.zzevo
    public final int zza() {
        return 61;
    }

    @Override // com.google.android.gms.internal.ads.zzevo
    public final y9.a zzb() {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzlT)).booleanValue()) {
            return zzgcj.zzh(zzc());
        }
        final ContentResolver contentResolver = this.zza.getContentResolver();
        if (contentResolver == null) {
            return zzgcj.zzh(zzc());
        }
        return this.zzb.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzeos
            @Override // java.util.concurrent.Callable
            public final Object call() {
                ContentResolver contentResolver2 = contentResolver;
                String string = Settings.Secure.getString(contentResolver2, "advertising_id");
                boolean z10 = false;
                if (Settings.Secure.getInt(contentResolver2, "limit_ad_tracking", 0) == 1) {
                    z10 = true;
                }
                return new zzeou(string, z10);
            }
        });
    }
}
