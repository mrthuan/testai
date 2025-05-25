package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.HashSet;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzfnz extends zzfnu {
    public zzfnz(zzfnn zzfnnVar, HashSet hashSet, JSONObject jSONObject, long j10) {
        super(zzfnnVar, hashSet, jSONObject, j10);
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        if (zzfnf.zzg(this.zzb, this.zzd.zza())) {
            return null;
        }
        this.zzd.zze(this.zzb);
        return this.zzb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzfnv, android.os.AsyncTask
    /* renamed from: zza */
    public final void onPostExecute(String str) {
        zzfml zza;
        if (!TextUtils.isEmpty(str) && (zza = zzfml.zza()) != null) {
            for (zzflu zzfluVar : zza.zzc()) {
                if (((zzfnu) this).zza.contains(zzfluVar.zzh())) {
                    zzfluVar.zzg().zzh(str, this.zzc);
                }
            }
        }
        super.onPostExecute(str);
    }
}
