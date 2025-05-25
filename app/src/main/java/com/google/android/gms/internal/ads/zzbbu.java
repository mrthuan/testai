package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.ConditionVariable;
import com.inmobi.commons.core.configs.TelemetryConfig;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzbbu implements SharedPreferences.OnSharedPreferenceChangeListener {
    private Context zzg;
    private final Object zzb = new Object();
    private final ConditionVariable zzc = new ConditionVariable();
    private volatile boolean zzd = false;
    volatile boolean zza = false;
    private SharedPreferences zze = null;
    private Bundle zzf = new Bundle();
    private JSONObject zzh = new JSONObject();
    private boolean zzi = false;
    private boolean zzj = false;

    private final void zzg(final SharedPreferences sharedPreferences) {
        if (sharedPreferences == null) {
            return;
        }
        try {
            this.zzh = new JSONObject((String) zzbby.zza(new zzfvk() { // from class: com.google.android.gms.internal.ads.zzbbr
                @Override // com.google.android.gms.internal.ads.zzfvk
                public final Object zza() {
                    return sharedPreferences.getString("flag_configuration", "{}");
                }
            }));
        } catch (JSONException unused) {
        }
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if ("flag_configuration".equals(str)) {
            zzg(sharedPreferences);
        }
    }

    public final Object zza(final zzbbn zzbbnVar) {
        if (!this.zzc.block(TelemetryConfig.DEFAULT_LOG_RETRY_INTERVAL)) {
            synchronized (this.zzb) {
                if (!this.zza) {
                    throw new IllegalStateException("Flags.initialize() was not called!");
                }
            }
        }
        if (!this.zzd || this.zze == null || this.zzj) {
            synchronized (this.zzb) {
                if (this.zzd && this.zze != null && !this.zzj) {
                }
                return zzbbnVar.zzm();
            }
        }
        if (zzbbnVar.zze() == 2) {
            Bundle bundle = this.zzf;
            if (bundle == null) {
                return zzbbnVar.zzm();
            }
            return zzbbnVar.zzb(bundle);
        } else if (zzbbnVar.zze() == 1 && this.zzh.has(zzbbnVar.zzn())) {
            return zzbbnVar.zza(this.zzh);
        } else {
            return zzbby.zza(new zzfvk() { // from class: com.google.android.gms.internal.ads.zzbbs
                @Override // com.google.android.gms.internal.ads.zzfvk
                public final Object zza() {
                    return zzbbu.this.zzc(zzbbnVar);
                }
            });
        }
    }

    public final Object zzb(zzbbn zzbbnVar) {
        if (!this.zzd && !this.zza) {
            return zzbbnVar.zzm();
        }
        return zza(zzbbnVar);
    }

    public final /* synthetic */ Object zzc(zzbbn zzbbnVar) {
        return zzbbnVar.zzc(this.zze);
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x011d, code lost:
        if (new org.json.JSONObject((java.lang.String) com.google.android.gms.internal.ads.zzbby.zza(new com.google.android.gms.internal.ads.zzbbq(r3))).optBoolean("local_flags_enabled") != false) goto L57;
     */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0123 A[Catch: all -> 0x0163, TRY_ENTER, TryCatch #1 {, blocks: (B:7:0x0008, B:9:0x000c, B:11:0x000e, B:13:0x0013, B:14:0x0015, B:16:0x0027, B:17:0x002b, B:18:0x002d, B:43:0x00a1, B:44:0x00a8, B:53:0x00d7, B:54:0x00de, B:68:0x0123, B:69:0x012a, B:77:0x0152, B:78:0x0159, B:20:0x0042, B:22:0x0047, B:29:0x0057, B:33:0x0060, B:35:0x006a, B:36:0x0072, B:38:0x0078, B:40:0x0088, B:42:0x009d, B:46:0x00aa, B:48:0x00ae, B:50:0x00be, B:52:0x00d3, B:56:0x00e0, B:66:0x011f, B:71:0x012c, B:73:0x0144, B:75:0x0148, B:76:0x014b, B:59:0x00f1, B:61:0x00ff, B:63:0x0107, B:64:0x0112), top: B:87:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x012c A[Catch: all -> 0x004f, TRY_ENTER, TryCatch #1 {, blocks: (B:7:0x0008, B:9:0x000c, B:11:0x000e, B:13:0x0013, B:14:0x0015, B:16:0x0027, B:17:0x002b, B:18:0x002d, B:43:0x00a1, B:44:0x00a8, B:53:0x00d7, B:54:0x00de, B:68:0x0123, B:69:0x012a, B:77:0x0152, B:78:0x0159, B:20:0x0042, B:22:0x0047, B:29:0x0057, B:33:0x0060, B:35:0x006a, B:36:0x0072, B:38:0x0078, B:40:0x0088, B:42:0x009d, B:46:0x00aa, B:48:0x00ae, B:50:0x00be, B:52:0x00d3, B:56:0x00e0, B:66:0x011f, B:71:0x012c, B:73:0x0144, B:75:0x0148, B:76:0x014b, B:59:0x00f1, B:61:0x00ff, B:63:0x0107, B:64:0x0112), top: B:87:0x0008 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzd(android.content.Context r11) {
        /*
            Method dump skipped, instructions count: 358
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbbu.zzd(android.content.Context):void");
    }

    public final boolean zze() {
        return this.zzj;
    }

    public final boolean zzf() {
        return this.zzi;
    }
}
