package com.google.android.gms.internal.ads;

import java.util.HashSet;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public abstract class zzfnu extends zzfnv {
    protected final HashSet zza;
    protected final JSONObject zzb;
    protected final long zzc;

    public zzfnu(zzfnn zzfnnVar, HashSet hashSet, JSONObject jSONObject, long j10) {
        super(zzfnnVar);
        this.zza = new HashSet(hashSet);
        this.zzb = jSONObject;
        this.zzc = j10;
    }
}
