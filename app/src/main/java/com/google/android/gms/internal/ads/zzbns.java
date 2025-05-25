package com.google.android.gms.internal.ads;

import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.util.UUID;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzbns implements zzbne {
    private final zzbng zza;
    private final zzbnh zzb;
    private final zzbna zzc;
    private final String zzd;

    public zzbns(zzbna zzbnaVar, String str, zzbnh zzbnhVar, zzbng zzbngVar) {
        this.zzc = zzbnaVar;
        this.zzd = str;
        this.zzb = zzbnhVar;
        this.zza = zzbngVar;
    }

    public static void zzd(zzbns zzbnsVar, zzbmu zzbmuVar, zzbnb zzbnbVar, Object obj, zzbzt zzbztVar) {
        try {
            com.google.android.gms.ads.internal.util.zzt zztVar = com.google.android.gms.ads.internal.zzu.B.c;
            String uuid = UUID.randomUUID().toString();
            zzbiw.zzo.zzc(uuid, new zzbnr(zzbnsVar, zzbmuVar, zzbztVar));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(FacebookMediationAdapter.KEY_ID, uuid);
            jSONObject.put("args", zzbnsVar.zzb.zzb(obj));
            zzbnbVar.zzl(zzbnsVar.zzd, jSONObject);
        } catch (Exception e10) {
            try {
                zzbztVar.zzd(e10);
                com.google.android.gms.ads.internal.util.client.zzm.g(6);
            } finally {
                zzbmuVar.zzb();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgbq
    public final y9.a zza(Object obj) {
        return zzb(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzbne
    public final y9.a zzb(Object obj) {
        zzbzt zzbztVar = new zzbzt();
        zzbmu zzb = this.zzc.zzb(null);
        com.google.android.gms.ads.internal.util.zze.h("callJs > getEngine: Promise created");
        zzb.zzj(new zzbnp(this, zzb, obj, zzbztVar), new zzbnq(this, zzbztVar, zzb));
        return zzbztVar;
    }
}
