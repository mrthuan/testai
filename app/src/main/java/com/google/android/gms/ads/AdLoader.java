package com.google.android.gms.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzbn;
import com.google.android.gms.ads.internal.client.zzbq;
import com.google.android.gms.ads.internal.client.zzdx;
import com.google.android.gms.ads.internal.client.zzeu;
import com.google.android.gms.ads.internal.client.zzfk;
import com.google.android.gms.ads.internal.client.zzp;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeAdOptions;
import com.google.android.gms.internal.ads.zzbbw;
import com.google.android.gms.internal.ads.zzbdq;
import com.google.android.gms.internal.ads.zzbes;
import com.google.android.gms.internal.ads.zzboi;
import com.google.android.gms.internal.ads.zzbsc;
import k7.j;
import k7.s;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes.dex */
public class AdLoader {

    /* renamed from: a  reason: collision with root package name */
    public final zzp f10009a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f10010b;
    public final zzbn c;

    /* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
    /* loaded from: classes.dex */
    public static class Builder {

        /* renamed from: a  reason: collision with root package name */
        public final Context f10011a;

        /* renamed from: b  reason: collision with root package name */
        public final zzbq f10012b;

        public Builder(Context context, String str) {
            if (context != null) {
                zzaw zzawVar = zzay.f10107f.f10109b;
                zzboi zzboiVar = new zzboi();
                zzawVar.getClass();
                this.f10011a = context;
                this.f10012b = (zzbq) new j(zzawVar, context, str, zzboiVar).d(context, false);
                return;
            }
            throw new NullPointerException("context cannot be null");
        }

        public final AdLoader a() {
            Context context = this.f10011a;
            try {
                return new AdLoader(context, this.f10012b.zze(), zzp.f10237a);
            } catch (RemoteException unused) {
                zzm.g(6);
                return new AdLoader(context, new s(new zzeu()), zzp.f10237a);
            }
        }

        public final void b(NativeAd.OnNativeAdLoadedListener onNativeAdLoadedListener) {
            try {
                this.f10012b.zzk(new zzbsc(onNativeAdLoadedListener));
            } catch (RemoteException unused) {
                zzm.g(5);
            }
        }

        public final void c(AdListener adListener) {
            try {
                this.f10012b.zzl(new com.google.android.gms.ads.internal.client.zzg(adListener));
            } catch (RemoteException unused) {
                zzm.g(5);
            }
        }

        public final void d(NativeAdOptions nativeAdOptions) {
            zzfk zzfkVar;
            try {
                zzbq zzbqVar = this.f10012b;
                boolean z10 = nativeAdOptions.f10599a;
                boolean z11 = nativeAdOptions.c;
                int i10 = nativeAdOptions.f10601d;
                VideoOptions videoOptions = nativeAdOptions.f10602e;
                if (videoOptions != null) {
                    zzfkVar = new zzfk(videoOptions);
                } else {
                    zzfkVar = null;
                }
                zzbqVar.zzo(new zzbes(4, z10, -1, z11, i10, zzfkVar, nativeAdOptions.f10603f, nativeAdOptions.f10600b, nativeAdOptions.f10605h, nativeAdOptions.f10604g, nativeAdOptions.f10606i - 1));
            } catch (RemoteException unused) {
                zzm.g(5);
            }
        }
    }

    public AdLoader(Context context, zzbn zzbnVar, zzp zzpVar) {
        this.f10010b = context;
        this.c = zzbnVar;
        this.f10009a = zzpVar;
    }

    public final void a(AdRequest adRequest) {
        final zzdx zzdxVar = adRequest.f10013a;
        Context context = this.f10010b;
        zzbbw.zza(context);
        if (((Boolean) zzbdq.zzc.zze()).booleanValue()) {
            if (((Boolean) zzba.f10115d.c.zza(zzbbw.zzkl)).booleanValue()) {
                com.google.android.gms.ads.internal.util.client.zzb.f10350b.execute(new Runnable() { // from class: com.google.android.gms.ads.zza
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzdx zzdxVar2 = zzdxVar;
                        AdLoader adLoader = AdLoader.this;
                        adLoader.getClass();
                        try {
                            zzbn zzbnVar = adLoader.c;
                            zzp zzpVar = adLoader.f10009a;
                            Context context2 = adLoader.f10010b;
                            zzpVar.getClass();
                            zzbnVar.zzg(zzp.a(context2, zzdxVar2));
                        } catch (RemoteException unused) {
                            zzm.g(6);
                        }
                    }
                });
                return;
            }
        }
        try {
            zzbn zzbnVar = this.c;
            this.f10009a.getClass();
            zzbnVar.zzg(zzp.a(context, zzdxVar));
        } catch (RemoteException unused) {
            zzm.g(6);
        }
    }
}
