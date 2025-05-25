package com.google.android.gms.ads.query;

import android.content.Context;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzdx;
import com.google.android.gms.ads.internal.client.zzem;
import com.google.android.gms.internal.ads.zzbbw;
import com.google.android.gms.internal.ads.zzbdq;
import com.google.android.gms.internal.ads.zzbte;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes.dex */
public class QueryInfo {

    /* renamed from: a  reason: collision with root package name */
    public final zzem f10766a;

    public QueryInfo(zzem zzemVar) {
        this.f10766a = zzemVar;
    }

    public static void a(final Context context, final AdFormat adFormat, final AdRequest adRequest, final QueryInfoGenerationCallback queryInfoGenerationCallback) {
        zzdx zzdxVar;
        zzbbw.zza(context);
        if (((Boolean) zzbdq.zzj.zze()).booleanValue()) {
            if (((Boolean) zzba.f10115d.c.zza(zzbbw.zzkl)).booleanValue()) {
                com.google.android.gms.ads.internal.util.client.zzb.f10350b.execute(new Runnable() { // from class: com.google.android.gms.ads.query.zza

                    /* renamed from: d  reason: collision with root package name */
                    public final /* synthetic */ String f10769d = null;

                    @Override // java.lang.Runnable
                    public final void run() {
                        zzdx zzdxVar2;
                        AdRequest adRequest2 = adRequest;
                        if (adRequest2 == null) {
                            zzdxVar2 = null;
                        } else {
                            zzdxVar2 = adRequest2.f10013a;
                        }
                        new zzbte(context, adFormat, zzdxVar2, this.f10769d).zzb(queryInfoGenerationCallback);
                    }
                });
                return;
            }
        }
        if (adRequest == null) {
            zzdxVar = null;
        } else {
            zzdxVar = adRequest.f10013a;
        }
        new zzbte(context, adFormat, zzdxVar, null).zzb(queryInfoGenerationCallback);
    }
}
