package com.google.android.gms.internal.ads;

import android.os.AsyncTask;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public abstract class zzfnv extends AsyncTask {
    private zzfnw zza;
    protected final zzfnn zzd;

    public zzfnv(zzfnn zzfnnVar) {
        this.zzd = zzfnnVar;
    }

    @Override // android.os.AsyncTask
    /* renamed from: zza */
    public void onPostExecute(String str) {
        zzfnw zzfnwVar = this.zza;
        if (zzfnwVar != null) {
            zzfnwVar.zza(this);
        }
    }

    public final void zzb(zzfnw zzfnwVar) {
        this.zza = zzfnwVar;
    }
}
