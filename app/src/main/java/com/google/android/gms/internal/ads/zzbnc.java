package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzbnc implements zzblu, zzbnb {
    private final zzbnb zza;
    private final HashSet zzb = new HashSet();

    public zzbnc(zzbnb zzbnbVar) {
        this.zza = zzbnbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzblu, com.google.android.gms.internal.ads.zzbme
    public final void zza(String str) {
        this.zza.zza(str);
    }

    @Override // com.google.android.gms.internal.ads.zzblu, com.google.android.gms.internal.ads.zzbme
    public final /* synthetic */ void zzb(String str, String str2) {
        zzblt.zzc(this, str, str2);
    }

    public final void zzc() {
        Iterator it = this.zzb.iterator();
        while (it.hasNext()) {
            AbstractMap.SimpleEntry simpleEntry = (AbstractMap.SimpleEntry) it.next();
            com.google.android.gms.ads.internal.util.zze.h("Unregistering eventhandler: ".concat(String.valueOf(((zzbix) simpleEntry.getValue()).toString())));
            this.zza.zzr((String) simpleEntry.getKey(), (zzbix) simpleEntry.getValue());
        }
        this.zzb.clear();
    }

    @Override // com.google.android.gms.internal.ads.zzbls
    public final /* synthetic */ void zzd(String str, Map map) {
        zzblt.zza(this, str, map);
    }

    @Override // com.google.android.gms.internal.ads.zzblu, com.google.android.gms.internal.ads.zzbls
    public final /* synthetic */ void zze(String str, JSONObject jSONObject) {
        zzblt.zzb(this, str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.zzbme
    public final /* synthetic */ void zzl(String str, JSONObject jSONObject) {
        zzblt.zzd(this, str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.zzbnb
    public final void zzq(String str, zzbix zzbixVar) {
        this.zza.zzq(str, zzbixVar);
        this.zzb.add(new AbstractMap.SimpleEntry(str, zzbixVar));
    }

    @Override // com.google.android.gms.internal.ads.zzbnb
    public final void zzr(String str, zzbix zzbixVar) {
        this.zza.zzr(str, zzbixVar);
        this.zzb.remove(new AbstractMap.SimpleEntry(str, zzbixVar));
    }
}
