package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzbnr implements zzbjm {
    final /* synthetic */ zzbns zza;
    private final zzbmu zzb;
    private final zzbzt zzc;

    public zzbnr(zzbns zzbnsVar, zzbmu zzbmuVar, zzbzt zzbztVar) {
        this.zza = zzbnsVar;
        this.zzb = zzbmuVar;
        this.zzc = zzbztVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbjm
    public final void zza(String str) {
        try {
            if (str == null) {
                this.zzc.zzd(new zzbnd());
            } else {
                this.zzc.zzd(new zzbnd(str));
            }
        } catch (IllegalStateException unused) {
        } catch (Throwable th2) {
            this.zzb.zzb();
            throw th2;
        }
        this.zzb.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzbjm
    public final void zzb(JSONObject jSONObject) {
        zzbng zzbngVar;
        try {
            try {
                zzbzt zzbztVar = this.zzc;
                zzbngVar = this.zza.zza;
                zzbztVar.zzc(zzbngVar.zza(jSONObject));
            } catch (IllegalStateException unused) {
            } catch (JSONException e10) {
                this.zzc.zzd(e10);
            }
        } finally {
            this.zzb.zzb();
        }
    }
}
