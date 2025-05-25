package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import org.json.JSONException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzbcw extends QueryInfoGenerationCallback {
    final /* synthetic */ String zza;
    final /* synthetic */ zzbcx zzb;

    public zzbcw(zzbcx zzbcxVar, String str) {
        this.zza = str;
        this.zzb = zzbcxVar;
    }

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public final void onFailure(String str) {
        u.l lVar;
        com.google.android.gms.ads.internal.util.client.zzm.e("Failed to generate query info for Custom Tab error: ".concat(String.valueOf(str)));
        try {
            zzbcx zzbcxVar = this.zzb;
            lVar = zzbcxVar.zze;
            lVar.a(zzbcxVar.zzc(this.zza, str).toString());
        } catch (JSONException unused) {
            com.google.android.gms.ads.internal.util.client.zzm.g(6);
        }
    }

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public final void onSuccess(QueryInfo queryInfo) {
        u.l lVar;
        String str = queryInfo.f10766a.f10178a;
        try {
            zzbcx zzbcxVar = this.zzb;
            lVar = zzbcxVar.zze;
            lVar.a(zzbcxVar.zzd(this.zza, str).toString());
        } catch (JSONException unused) {
            com.google.android.gms.ads.internal.util.client.zzm.g(6);
        }
    }
}
