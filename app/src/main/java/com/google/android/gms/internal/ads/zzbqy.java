package com.google.android.gms.internal.ads;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.mediation.MediationAppOpenAd;
import com.google.android.gms.ads.mediation.MediationAppOpenAdConfiguration;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import com.google.android.gms.ads.mediation.MediationNativeAdConfiguration;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzbqy extends zzbqk {
    private final RtbAdapter zza;
    private MediationInterstitialAd zzb;
    private MediationRewardedAd zzc;
    private MediationAppOpenAd zzd;
    private String zze = "";

    public zzbqy(RtbAdapter rtbAdapter) {
        this.zza = rtbAdapter;
    }

    private final Bundle zzv(com.google.android.gms.ads.internal.client.zzl zzlVar) {
        Bundle bundle;
        Bundle bundle2 = zzlVar.f10211m;
        if (bundle2 != null && (bundle = bundle2.getBundle(this.zza.getClass().getName())) != null) {
            return bundle;
        }
        return new Bundle();
    }

    private static final Bundle zzw(String str) {
        com.google.android.gms.ads.internal.util.client.zzm.e("Server parameters: ".concat(String.valueOf(str)));
        try {
            Bundle bundle = new Bundle();
            if (str != null) {
                JSONObject jSONObject = new JSONObject(str);
                Bundle bundle2 = new Bundle();
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    bundle2.putString(next, jSONObject.getString(next));
                }
                return bundle2;
            }
            return bundle;
        } catch (JSONException unused) {
            com.google.android.gms.ads.internal.util.client.zzm.g(6);
            throw new RemoteException();
        }
    }

    private static final boolean zzx(com.google.android.gms.ads.internal.client.zzl zzlVar) {
        if (!zzlVar.f10204f) {
            com.google.android.gms.ads.internal.util.client.zzf zzfVar = com.google.android.gms.ads.internal.client.zzay.f10107f.f10108a;
            if (!com.google.android.gms.ads.internal.util.client.zzf.m()) {
                return false;
            }
            return true;
        }
        return true;
    }

    private static final String zzy(String str, com.google.android.gms.ads.internal.client.zzl zzlVar) {
        String str2 = zzlVar.f10219u;
        try {
            return new JSONObject(str).getString("max_ad_content_rating");
        } catch (JSONException unused) {
            return str2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbql
    public final com.google.android.gms.ads.internal.client.zzdq zze() {
        RtbAdapter rtbAdapter = this.zza;
        if (rtbAdapter instanceof com.google.android.gms.ads.mediation.zza) {
            try {
                return ((com.google.android.gms.ads.mediation.zza) rtbAdapter).getVideoController();
            } catch (Throwable unused) {
                com.google.android.gms.ads.internal.util.client.zzm.g(6);
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbql
    public final zzbra zzf() {
        return zzbra.zza(this.zza.getVersionInfo());
    }

    @Override // com.google.android.gms.internal.ads.zzbql
    public final zzbra zzg() {
        return zzbra.zza(this.zza.getSDKVersionInfo());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006d, code lost:
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(com.google.android.gms.internal.ads.zzbbw.zzkR)).booleanValue() != false) goto L11;
     */
    @Override // com.google.android.gms.internal.ads.zzbql
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzh(com.google.android.gms.dynamic.IObjectWrapper r7, java.lang.String r8, android.os.Bundle r9, android.os.Bundle r10, com.google.android.gms.ads.internal.client.zzq r11, com.google.android.gms.internal.ads.zzbqo r12) {
        /*
            r6 = this;
            r0 = 6
            com.google.android.gms.internal.ads.zzbqw r1 = new com.google.android.gms.internal.ads.zzbqw     // Catch: java.lang.Throwable -> L94
            r1.<init>(r6, r12)     // Catch: java.lang.Throwable -> L94
            com.google.android.gms.ads.mediation.rtb.RtbAdapter r12 = r6.zza     // Catch: java.lang.Throwable -> L94
            com.google.android.gms.ads.mediation.MediationConfiguration r2 = new com.google.android.gms.ads.mediation.MediationConfiguration     // Catch: java.lang.Throwable -> L94
            int r3 = r8.hashCode()     // Catch: java.lang.Throwable -> L94
            switch(r3) {
                case -1396342996: goto L4e;
                case -1052618729: goto L44;
                case -239580146: goto L3a;
                case 604727084: goto L30;
                case 1167692200: goto L26;
                case 1778294298: goto L1c;
                case 1911491517: goto L12;
                default: goto L11;
            }
        L11:
            goto L58
        L12:
            java.lang.String r3 = "rewarded_interstitial"
            boolean r8 = r8.equals(r3)
            if (r8 == 0) goto L58
            r8 = 3
            goto L59
        L1c:
            java.lang.String r3 = "app_open_ad"
            boolean r8 = r8.equals(r3)
            if (r8 == 0) goto L58
            r8 = r0
            goto L59
        L26:
            java.lang.String r3 = "app_open"
            boolean r8 = r8.equals(r3)
            if (r8 == 0) goto L58
            r8 = 5
            goto L59
        L30:
            java.lang.String r3 = "interstitial"
            boolean r8 = r8.equals(r3)
            if (r8 == 0) goto L58
            r8 = 1
            goto L59
        L3a:
            java.lang.String r3 = "rewarded"
            boolean r8 = r8.equals(r3)
            if (r8 == 0) goto L58
            r8 = 2
            goto L59
        L44:
            java.lang.String r3 = "native"
            boolean r8 = r8.equals(r3)
            if (r8 == 0) goto L58
            r8 = 4
            goto L59
        L4e:
            java.lang.String r3 = "banner"
            boolean r8 = r8.equals(r3)
            if (r8 == 0) goto L58
            r8 = 0
            goto L59
        L58:
            r8 = -1
        L59:
            switch(r8) {
                case 0: goto L6f;
                case 1: goto L6f;
                case 2: goto L6f;
                case 3: goto L6f;
                case 4: goto L6f;
                case 5: goto L6f;
                case 6: goto L5d;
                default: goto L5c;
            }
        L5c:
            goto L96
        L5d:
            com.google.android.gms.internal.ads.zzbbn r8 = com.google.android.gms.internal.ads.zzbbw.zzkR     // Catch: java.lang.Throwable -> L94
            com.google.android.gms.ads.internal.client.zzba r3 = com.google.android.gms.ads.internal.client.zzba.f10115d     // Catch: java.lang.Throwable -> L94
            com.google.android.gms.internal.ads.zzbbu r3 = r3.c     // Catch: java.lang.Throwable -> L94
            java.lang.Object r8 = r3.zza(r8)     // Catch: java.lang.Throwable -> L94
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L94
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L94
            if (r8 == 0) goto L96
        L6f:
            r2.<init>(r10)     // Catch: java.lang.Throwable -> L94
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L94
            r8.<init>()     // Catch: java.lang.Throwable -> L94
            r8.add(r2)     // Catch: java.lang.Throwable -> L94
            com.google.android.gms.ads.mediation.rtb.RtbSignalData r10 = new com.google.android.gms.ads.mediation.rtb.RtbSignalData     // Catch: java.lang.Throwable -> L94
            java.lang.Object r2 = com.google.android.gms.dynamic.ObjectWrapper.L0(r7)     // Catch: java.lang.Throwable -> L94
            android.content.Context r2 = (android.content.Context) r2     // Catch: java.lang.Throwable -> L94
            int r3 = r11.f10241e     // Catch: java.lang.Throwable -> L94
            int r4 = r11.f10239b     // Catch: java.lang.Throwable -> L94
            java.lang.String r11 = r11.f10238a     // Catch: java.lang.Throwable -> L94
            com.google.android.gms.ads.AdSize r5 = new com.google.android.gms.ads.AdSize     // Catch: java.lang.Throwable -> L94
            r5.<init>(r3, r4, r11)     // Catch: java.lang.Throwable -> L94
            r10.<init>(r2, r8, r9)     // Catch: java.lang.Throwable -> L94
            r12.collectSignals(r10, r1)     // Catch: java.lang.Throwable -> L94
            return
        L94:
            r8 = move-exception
            goto L9e
        L96:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L94
            java.lang.String r9 = "Internal Error"
            r8.<init>(r9)     // Catch: java.lang.Throwable -> L94
            throw r8     // Catch: java.lang.Throwable -> L94
        L9e:
            com.google.android.gms.ads.internal.util.client.zzm.g(r0)
            java.lang.String r9 = "adapter.collectSignals"
            com.google.android.gms.internal.ads.zzboj.zza(r7, r8, r9)
            android.os.RemoteException r7 = new android.os.RemoteException
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbqy.zzh(com.google.android.gms.dynamic.IObjectWrapper, java.lang.String, android.os.Bundle, android.os.Bundle, com.google.android.gms.ads.internal.client.zzq, com.google.android.gms.internal.ads.zzbqo):void");
    }

    @Override // com.google.android.gms.internal.ads.zzbql
    public final void zzi(String str, String str2, com.google.android.gms.ads.internal.client.zzl zzlVar, IObjectWrapper iObjectWrapper, zzbpw zzbpwVar, zzbos zzbosVar) {
        try {
            zzbqv zzbqvVar = new zzbqv(this, zzbpwVar, zzbosVar);
            RtbAdapter rtbAdapter = this.zza;
            Context context = (Context) ObjectWrapper.L0(iObjectWrapper);
            Bundle zzw = zzw(str2);
            Bundle zzv = zzv(zzlVar);
            boolean zzx = zzx(zzlVar);
            Location location = zzlVar.f10209k;
            int i10 = zzlVar.f10205g;
            int i11 = zzlVar.f10218t;
            zzy(str2, zzlVar);
            rtbAdapter.loadRtbAppOpenAd(new MediationAppOpenAdConfiguration(context, str, zzw, zzv, zzx, i10, i11, this.zze), zzbqvVar);
        } catch (Throwable th2) {
            com.google.android.gms.ads.internal.util.client.zzm.g(6);
            zzboj.zza(iObjectWrapper, th2, "adapter.loadRtbAppOpenAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbql
    public final void zzj(String str, String str2, com.google.android.gms.ads.internal.client.zzl zzlVar, IObjectWrapper iObjectWrapper, zzbpz zzbpzVar, zzbos zzbosVar, com.google.android.gms.ads.internal.client.zzq zzqVar) {
        try {
            zzbqq zzbqqVar = new zzbqq(this, zzbpzVar, zzbosVar);
            RtbAdapter rtbAdapter = this.zza;
            Context context = (Context) ObjectWrapper.L0(iObjectWrapper);
            Bundle zzw = zzw(str2);
            Bundle zzv = zzv(zzlVar);
            boolean zzx = zzx(zzlVar);
            Location location = zzlVar.f10209k;
            int i10 = zzlVar.f10205g;
            int i11 = zzlVar.f10218t;
            zzy(str2, zzlVar);
            rtbAdapter.loadRtbBannerAd(new MediationBannerAdConfiguration(context, str, zzw, zzv, zzx, i10, i11, new AdSize(zzqVar.f10241e, zzqVar.f10239b, zzqVar.f10238a), this.zze), zzbqqVar);
        } catch (Throwable th2) {
            com.google.android.gms.ads.internal.util.client.zzm.g(6);
            zzboj.zza(iObjectWrapper, th2, "adapter.loadRtbBannerAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbql
    public final void zzk(String str, String str2, com.google.android.gms.ads.internal.client.zzl zzlVar, IObjectWrapper iObjectWrapper, zzbpz zzbpzVar, zzbos zzbosVar, com.google.android.gms.ads.internal.client.zzq zzqVar) {
        try {
            zzbqr zzbqrVar = new zzbqr(this, zzbpzVar, zzbosVar);
            RtbAdapter rtbAdapter = this.zza;
            Context context = (Context) ObjectWrapper.L0(iObjectWrapper);
            Bundle zzw = zzw(str2);
            Bundle zzv = zzv(zzlVar);
            boolean zzx = zzx(zzlVar);
            Location location = zzlVar.f10209k;
            int i10 = zzlVar.f10205g;
            int i11 = zzlVar.f10218t;
            zzy(str2, zzlVar);
            rtbAdapter.loadRtbInterscrollerAd(new MediationBannerAdConfiguration(context, str, zzw, zzv, zzx, i10, i11, new AdSize(zzqVar.f10241e, zzqVar.f10239b, zzqVar.f10238a), this.zze), zzbqrVar);
        } catch (Throwable th2) {
            com.google.android.gms.ads.internal.util.client.zzm.g(6);
            zzboj.zza(iObjectWrapper, th2, "adapter.loadRtbInterscrollerAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbql
    public final void zzl(String str, String str2, com.google.android.gms.ads.internal.client.zzl zzlVar, IObjectWrapper iObjectWrapper, zzbqc zzbqcVar, zzbos zzbosVar) {
        try {
            zzbqs zzbqsVar = new zzbqs(this, zzbqcVar, zzbosVar);
            RtbAdapter rtbAdapter = this.zza;
            Context context = (Context) ObjectWrapper.L0(iObjectWrapper);
            Bundle zzw = zzw(str2);
            Bundle zzv = zzv(zzlVar);
            boolean zzx = zzx(zzlVar);
            Location location = zzlVar.f10209k;
            int i10 = zzlVar.f10205g;
            int i11 = zzlVar.f10218t;
            zzy(str2, zzlVar);
            rtbAdapter.loadRtbInterstitialAd(new MediationInterstitialAdConfiguration(context, str, zzw, zzv, zzx, i10, i11, this.zze), zzbqsVar);
        } catch (Throwable th2) {
            com.google.android.gms.ads.internal.util.client.zzm.g(6);
            zzboj.zza(iObjectWrapper, th2, "adapter.loadRtbInterstitialAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbql
    public final void zzm(String str, String str2, com.google.android.gms.ads.internal.client.zzl zzlVar, IObjectWrapper iObjectWrapper, zzbqf zzbqfVar, zzbos zzbosVar) {
        zzn(str, str2, zzlVar, iObjectWrapper, zzbqfVar, zzbosVar, null);
    }

    @Override // com.google.android.gms.internal.ads.zzbql
    public final void zzn(String str, String str2, com.google.android.gms.ads.internal.client.zzl zzlVar, IObjectWrapper iObjectWrapper, zzbqf zzbqfVar, zzbos zzbosVar, zzbes zzbesVar) {
        try {
            zzbqt zzbqtVar = new zzbqt(this, zzbqfVar, zzbosVar);
            RtbAdapter rtbAdapter = this.zza;
            Context context = (Context) ObjectWrapper.L0(iObjectWrapper);
            Bundle zzw = zzw(str2);
            Bundle zzv = zzv(zzlVar);
            boolean zzx = zzx(zzlVar);
            Location location = zzlVar.f10209k;
            int i10 = zzlVar.f10205g;
            int i11 = zzlVar.f10218t;
            zzy(str2, zzlVar);
            rtbAdapter.loadRtbNativeAdMapper(new MediationNativeAdConfiguration(context, str, zzw, zzv, zzx, i10, i11, this.zze, zzbesVar), zzbqtVar);
        } catch (Throwable th2) {
            com.google.android.gms.ads.internal.util.client.zzm.g(6);
            zzboj.zza(iObjectWrapper, th2, "adapter.loadRtbNativeAdMapper");
            String message = th2.getMessage();
            if (!TextUtils.isEmpty(message) && message.equals("Method is not found")) {
                try {
                    zzbqu zzbquVar = new zzbqu(this, zzbqfVar, zzbosVar);
                    RtbAdapter rtbAdapter2 = this.zza;
                    Bundle zzw2 = zzw(str2);
                    Bundle zzv2 = zzv(zzlVar);
                    boolean zzx2 = zzx(zzlVar);
                    Location location2 = zzlVar.f10209k;
                    int i12 = zzlVar.f10205g;
                    int i13 = zzlVar.f10218t;
                    zzy(str2, zzlVar);
                    rtbAdapter2.loadRtbNativeAd(new MediationNativeAdConfiguration((Context) ObjectWrapper.L0(iObjectWrapper), str, zzw2, zzv2, zzx2, i12, i13, this.zze, zzbesVar), zzbquVar);
                    return;
                } catch (Throwable th3) {
                    com.google.android.gms.ads.internal.util.client.zzm.g(6);
                    zzboj.zza(iObjectWrapper, th3, "adapter.loadRtbNativeAd");
                    throw new RemoteException();
                }
            }
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbql
    public final void zzo(String str, String str2, com.google.android.gms.ads.internal.client.zzl zzlVar, IObjectWrapper iObjectWrapper, zzbqi zzbqiVar, zzbos zzbosVar) {
        try {
            zzbqx zzbqxVar = new zzbqx(this, zzbqiVar, zzbosVar);
            RtbAdapter rtbAdapter = this.zza;
            Context context = (Context) ObjectWrapper.L0(iObjectWrapper);
            Bundle zzw = zzw(str2);
            Bundle zzv = zzv(zzlVar);
            boolean zzx = zzx(zzlVar);
            Location location = zzlVar.f10209k;
            int i10 = zzlVar.f10205g;
            int i11 = zzlVar.f10218t;
            zzy(str2, zzlVar);
            rtbAdapter.loadRtbRewardedInterstitialAd(new MediationRewardedAdConfiguration(context, str, zzw, zzv, zzx, i10, i11, this.zze), zzbqxVar);
        } catch (Throwable th2) {
            com.google.android.gms.ads.internal.util.client.zzm.g(6);
            zzboj.zza(iObjectWrapper, th2, "adapter.loadRtbRewardedInterstitialAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbql
    public final void zzp(String str, String str2, com.google.android.gms.ads.internal.client.zzl zzlVar, IObjectWrapper iObjectWrapper, zzbqi zzbqiVar, zzbos zzbosVar) {
        try {
            zzbqx zzbqxVar = new zzbqx(this, zzbqiVar, zzbosVar);
            RtbAdapter rtbAdapter = this.zza;
            Context context = (Context) ObjectWrapper.L0(iObjectWrapper);
            Bundle zzw = zzw(str2);
            Bundle zzv = zzv(zzlVar);
            boolean zzx = zzx(zzlVar);
            Location location = zzlVar.f10209k;
            int i10 = zzlVar.f10205g;
            int i11 = zzlVar.f10218t;
            zzy(str2, zzlVar);
            rtbAdapter.loadRtbRewardedAd(new MediationRewardedAdConfiguration(context, str, zzw, zzv, zzx, i10, i11, this.zze), zzbqxVar);
        } catch (Throwable th2) {
            com.google.android.gms.ads.internal.util.client.zzm.g(6);
            zzboj.zza(iObjectWrapper, th2, "adapter.loadRtbRewardedAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbql
    public final void zzq(String str) {
        this.zze = str;
    }

    @Override // com.google.android.gms.internal.ads.zzbql
    public final boolean zzr(IObjectWrapper iObjectWrapper) {
        MediationAppOpenAd mediationAppOpenAd = this.zzd;
        if (mediationAppOpenAd != null) {
            try {
                mediationAppOpenAd.showAd((Context) ObjectWrapper.L0(iObjectWrapper));
                return true;
            } catch (Throwable th2) {
                com.google.android.gms.ads.internal.util.client.zzm.g(6);
                zzboj.zza(iObjectWrapper, th2, "adapter.showRtbAppOpenAd");
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbql
    public final boolean zzs(IObjectWrapper iObjectWrapper) {
        MediationInterstitialAd mediationInterstitialAd = this.zzb;
        if (mediationInterstitialAd != null) {
            try {
                mediationInterstitialAd.showAd((Context) ObjectWrapper.L0(iObjectWrapper));
                return true;
            } catch (Throwable th2) {
                com.google.android.gms.ads.internal.util.client.zzm.g(6);
                zzboj.zza(iObjectWrapper, th2, "adapter.showRtbInterstitialAd");
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbql
    public final boolean zzt(IObjectWrapper iObjectWrapper) {
        MediationRewardedAd mediationRewardedAd = this.zzc;
        if (mediationRewardedAd != null) {
            try {
                mediationRewardedAd.showAd((Context) ObjectWrapper.L0(iObjectWrapper));
                return true;
            } catch (Throwable th2) {
                com.google.android.gms.ads.internal.util.client.zzm.g(6);
                zzboj.zza(iObjectWrapper, th2, "adapter.showRtbRewardedAd");
                return true;
            }
        }
        return false;
    }
}
