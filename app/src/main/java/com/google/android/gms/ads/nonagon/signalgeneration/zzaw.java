package com.google.android.gms.ads.nonagon.signalgeneration;

import android.util.JsonReader;
import com.google.android.gms.internal.ads.zzbvb;
import com.google.android.gms.internal.ads.zzdxk;
import com.google.android.gms.internal.ads.zzdyq;
import com.google.android.gms.internal.ads.zzgbq;
import com.google.android.gms.internal.ads.zzgcj;
import com.google.android.gms.internal.ads.zzgcu;
import java.io.InputStreamReader;
import java.util.concurrent.Executor;
import org.json.JSONException;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes.dex */
public final class zzaw implements zzgbq {

    /* renamed from: a  reason: collision with root package name */
    public final Executor f10690a;

    /* renamed from: b  reason: collision with root package name */
    public final zzdxk f10691b;

    public zzaw(zzgcu zzgcuVar, zzdxk zzdxkVar) {
        this.f10690a = zzgcuVar;
        this.f10691b = zzdxkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgbq
    public final /* bridge */ /* synthetic */ y9.a zza(Object obj) {
        final zzbvb zzbvbVar = (zzbvb) obj;
        return zzgcj.zzn(this.f10691b.zzc(zzbvbVar), new zzgbq() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzav
            @Override // com.google.android.gms.internal.ads.zzgbq
            public final y9.a zza(Object obj2) {
                zzdyq zzdyqVar = (zzdyq) obj2;
                zzay zzayVar = new zzay(new JsonReader(new InputStreamReader(zzdyqVar.zzb())), zzdyqVar.zza());
                try {
                    zzayVar.f10694b = com.google.android.gms.ads.internal.client.zzay.f10107f.f10108a.i(zzbvb.this.zza).toString();
                } catch (JSONException unused) {
                    zzayVar.f10694b = "{}";
                }
                return zzgcj.zzh(zzayVar);
            }
        }, this.f10690a);
    }
}
