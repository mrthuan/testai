package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzbye implements SharedPreferences.OnSharedPreferenceChangeListener {
    final /* synthetic */ zzbyf zza;
    private final String zzb;

    public zzbye(zzbyf zzbyfVar, String str) {
        this.zza = zzbyfVar;
        this.zzb = str;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        List<zzbyd> list;
        synchronized (this.zza) {
            list = this.zza.zzb;
            for (zzbyd zzbydVar : list) {
                zzbydVar.zza.zzb(zzbydVar.zzb, sharedPreferences, this.zzb, str);
            }
        }
    }
}
