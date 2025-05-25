package com.google.android.gms.internal.ads;

import java.util.HashSet;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzfny extends zzfnu {
    public zzfny(zzfnn zzfnnVar, HashSet hashSet, JSONObject jSONObject, long j10) {
        super(zzfnnVar, hashSet, jSONObject, j10);
    }

    private final void zzc(String str) {
        zzfml zza = zzfml.zza();
        if (zza != null) {
            for (zzflu zzfluVar : zza.zzc()) {
                if (((zzfnu) this).zza.contains(zzfluVar.zzh())) {
                    zzfluVar.zzg().zzd(str, this.zzc);
                }
            }
        }
    }

    @Override // android.os.AsyncTask
    public final /* synthetic */ Object doInBackground(Object[] objArr) {
        return this.zzb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzfnv, android.os.AsyncTask
    public final /* synthetic */ void onPostExecute(Object obj) {
        String str = (String) obj;
        zzc(str);
        super.onPostExecute(str);
    }

    @Override // com.google.android.gms.internal.ads.zzfnv
    public final void zza(String str) {
        zzc(str);
        super.onPostExecute(str);
    }
}
