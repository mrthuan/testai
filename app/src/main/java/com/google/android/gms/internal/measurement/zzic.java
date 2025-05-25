package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.StrictMode;
import java.util.Iterator;
import java.util.Map;
import y.b;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.2 */
/* loaded from: classes2.dex */
public final class zzic implements zzhk {
    private static final Map zza = new b();
    private final SharedPreferences zzb;
    private final SharedPreferences.OnSharedPreferenceChangeListener zzc;

    public static zzic zza(Context context, String str, Runnable runnable) {
        zzic zzicVar;
        if (!zzhb.zzb()) {
            synchronized (zzic.class) {
                zzicVar = (zzic) zza.get(null);
                if (zzicVar == null) {
                    StrictMode.allowThreadDiskReads();
                    throw null;
                }
            }
            return zzicVar;
        }
        throw null;
    }

    public static synchronized void zzc() {
        synchronized (zzic.class) {
            Map map = zza;
            Iterator it = map.values().iterator();
            if (!it.hasNext()) {
                map.clear();
            } else {
                SharedPreferences sharedPreferences = ((zzic) it.next()).zzb;
                throw null;
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzhk
    public final Object zzb(String str) {
        throw null;
    }
}
