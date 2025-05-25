package com.google.android.gms.internal.ads;

import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.util.UUID;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzboa implements zzgbq {
    private final String zza = "google.afma.activeView.handleUpdate";
    private final y9.a zzb;

    public zzboa(y9.a aVar, String str, zzbnh zzbnhVar, zzbng zzbngVar) {
        this.zzb = aVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgbq
    public final y9.a zza(Object obj) {
        return zzb(obj);
    }

    public final y9.a zzb(final Object obj) {
        return zzgcj.zzn(this.zzb, new zzgbq() { // from class: com.google.android.gms.internal.ads.zzbny
            @Override // com.google.android.gms.internal.ads.zzgbq
            public final y9.a zza(Object obj2) {
                return zzboa.this.zzc(obj, (zzbnb) obj2);
            }
        }, zzbzo.zzf);
    }

    public final y9.a zzc(Object obj, zzbnb zzbnbVar) {
        zzbzt zzbztVar = new zzbzt();
        com.google.android.gms.ads.internal.util.zzt zztVar = com.google.android.gms.ads.internal.zzu.B.c;
        String uuid = UUID.randomUUID().toString();
        zzbiw.zzo.zzc(uuid, new zzbnz(this, zzbztVar));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(FacebookMediationAdapter.KEY_ID, uuid);
        jSONObject.put("args", (JSONObject) obj);
        zzbnbVar.zzl(this.zza, jSONObject);
        return zzbztVar;
    }
}
