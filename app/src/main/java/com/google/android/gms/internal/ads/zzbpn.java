package com.google.android.gms.internal.ads;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.mediation.Adapter;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.ads.mediation.MediationAppOpenAd;
import com.google.android.gms.ads.mediation.MediationAppOpenAdConfiguration;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationConfiguration;
import com.google.android.gms.ads.mediation.MediationInterscrollerAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdConfiguration;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import com.google.android.gms.ads.mediation.NativeAdMapper;
import com.google.android.gms.ads.mediation.OnContextChangedListener;
import com.google.android.gms.ads.mediation.OnImmersiveModeUpdatedListener;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzbpn extends zzboo {
    private final Object zza;
    private zzbpp zzb;
    private zzbvy zzc;
    private IObjectWrapper zzd;
    private View zze;
    private MediationInterstitialAd zzf;
    private UnifiedNativeAdMapper zzg;
    private NativeAdMapper zzh;
    private MediationRewardedAd zzi;
    private MediationInterscrollerAd zzj;
    private MediationAppOpenAd zzk;
    private final String zzl = "";

    public zzbpn(Adapter adapter) {
        this.zza = adapter;
    }

    private final Bundle zzV(com.google.android.gms.ads.internal.client.zzl zzlVar) {
        Bundle bundle;
        Bundle bundle2 = zzlVar.f10211m;
        if (bundle2 != null && (bundle = bundle2.getBundle(this.zza.getClass().getName())) != null) {
            return bundle;
        }
        return new Bundle();
    }

    private final Bundle zzW(String str, com.google.android.gms.ads.internal.client.zzl zzlVar, String str2) {
        com.google.android.gms.ads.internal.util.client.zzm.b("Server parameters: ".concat(String.valueOf(str)));
        Bundle bundle = new Bundle();
        if (str != null) {
            JSONObject jSONObject = new JSONObject(str);
            Bundle bundle2 = new Bundle();
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                bundle2.putString(next, jSONObject.getString(next));
            }
            bundle = bundle2;
        }
        if (this.zza instanceof AdMobAdapter) {
            bundle.putString("adJson", str2);
            if (zzlVar != null) {
                bundle.putInt("tagForChildDirectedTreatment", zzlVar.f10205g);
            }
        }
        bundle.remove("max_ad_content_rating");
        return bundle;
    }

    private static final boolean zzX(com.google.android.gms.ads.internal.client.zzl zzlVar) {
        if (!zzlVar.f10204f) {
            com.google.android.gms.ads.internal.util.client.zzf zzfVar = com.google.android.gms.ads.internal.client.zzay.f10107f.f10108a;
            if (!com.google.android.gms.ads.internal.util.client.zzf.m()) {
                return false;
            }
            return true;
        }
        return true;
    }

    private static final String zzY(String str, com.google.android.gms.ads.internal.client.zzl zzlVar) {
        String str2 = zzlVar.f10219u;
        try {
            return new JSONObject(str).getString("max_ad_content_rating");
        } catch (JSONException unused) {
            return str2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbop
    public final void zzA(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzbos zzbosVar) {
        Object obj = this.zza;
        if (obj instanceof Adapter) {
            com.google.android.gms.ads.internal.util.client.zzm.b("Requesting rewarded ad from adapter.");
            try {
                zzbpl zzbplVar = new zzbpl(this, zzbosVar);
                Context context = (Context) ObjectWrapper.L0(iObjectWrapper);
                Bundle zzW = zzW(str, zzlVar, null);
                Bundle zzV = zzV(zzlVar);
                boolean zzX = zzX(zzlVar);
                Location location = zzlVar.f10209k;
                int i10 = zzlVar.f10205g;
                int i11 = zzlVar.f10218t;
                zzY(str, zzlVar);
                ((Adapter) this.zza).loadRewardedAd(new MediationRewardedAdConfiguration(context, "", zzW, zzV, zzX, i10, i11, ""), zzbplVar);
                return;
            } catch (Exception e10) {
                com.google.android.gms.ads.internal.util.client.zzm.g(6);
                zzboj.zza(iObjectWrapper, e10, "adapter.loadRewardedAd");
                throw new RemoteException();
            }
        }
        String canonicalName = Adapter.class.getCanonicalName();
        String canonicalName2 = obj.getClass().getCanonicalName();
        com.google.android.gms.ads.internal.util.client.zzm.e(canonicalName + " #009 Class mismatch: " + canonicalName2);
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbop
    public final void zzB(com.google.android.gms.ads.internal.client.zzl zzlVar, String str, String str2) {
        Object obj = this.zza;
        if (obj instanceof Adapter) {
            zzA(this.zzd, zzlVar, str, new zzbpq((Adapter) obj, this.zzc));
            return;
        }
        String canonicalName = Adapter.class.getCanonicalName();
        String canonicalName2 = obj.getClass().getCanonicalName();
        com.google.android.gms.ads.internal.util.client.zzm.e(canonicalName + " #009 Class mismatch: " + canonicalName2);
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbop
    public final void zzC(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzbos zzbosVar) {
        Object obj = this.zza;
        if (obj instanceof Adapter) {
            com.google.android.gms.ads.internal.util.client.zzm.b("Requesting rewarded interstitial ad from adapter.");
            try {
                zzbpl zzbplVar = new zzbpl(this, zzbosVar);
                Context context = (Context) ObjectWrapper.L0(iObjectWrapper);
                Bundle zzW = zzW(str, zzlVar, null);
                Bundle zzV = zzV(zzlVar);
                boolean zzX = zzX(zzlVar);
                Location location = zzlVar.f10209k;
                int i10 = zzlVar.f10205g;
                int i11 = zzlVar.f10218t;
                zzY(str, zzlVar);
                ((Adapter) this.zza).loadRewardedInterstitialAd(new MediationRewardedAdConfiguration(context, "", zzW, zzV, zzX, i10, i11, ""), zzbplVar);
                return;
            } catch (Exception e10) {
                zzboj.zza(iObjectWrapper, e10, "adapter.loadRewardedInterstitialAd");
                throw new RemoteException();
            }
        }
        String canonicalName = Adapter.class.getCanonicalName();
        String canonicalName2 = obj.getClass().getCanonicalName();
        com.google.android.gms.ads.internal.util.client.zzm.e(canonicalName + " #009 Class mismatch: " + canonicalName2);
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbop
    public final void zzD(IObjectWrapper iObjectWrapper) {
        Context context = (Context) ObjectWrapper.L0(iObjectWrapper);
        Object obj = this.zza;
        if (obj instanceof OnContextChangedListener) {
            ((OnContextChangedListener) obj).a();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbop
    public final void zzE() {
        Object obj = this.zza;
        if (!(obj instanceof MediationAdapter)) {
            return;
        }
        ((MediationAdapter) obj).onPause();
    }

    @Override // com.google.android.gms.internal.ads.zzbop
    public final void zzF() {
        Object obj = this.zza;
        if (!(obj instanceof MediationAdapter)) {
            return;
        }
        ((MediationAdapter) obj).onResume();
    }

    @Override // com.google.android.gms.internal.ads.zzbop
    public final void zzG(boolean z10) {
        Object obj = this.zza;
        if (obj instanceof OnImmersiveModeUpdatedListener) {
            try {
                ((OnImmersiveModeUpdatedListener) obj).onImmersiveModeUpdated(z10);
                return;
            } catch (Throwable unused) {
                com.google.android.gms.ads.internal.util.client.zzm.g(6);
                return;
            }
        }
        String canonicalName = OnImmersiveModeUpdatedListener.class.getCanonicalName();
        String canonicalName2 = obj.getClass().getCanonicalName();
        com.google.android.gms.ads.internal.util.client.zzm.b(canonicalName + " #009 Class mismatch: " + canonicalName2);
    }

    @Override // com.google.android.gms.internal.ads.zzbop
    public final void zzH(IObjectWrapper iObjectWrapper) {
        Object obj = this.zza;
        if (obj instanceof Adapter) {
            com.google.android.gms.ads.internal.util.client.zzm.b("Show app open ad from adapter.");
            MediationAppOpenAd mediationAppOpenAd = this.zzk;
            if (mediationAppOpenAd != null) {
                try {
                    mediationAppOpenAd.showAd((Context) ObjectWrapper.L0(iObjectWrapper));
                    return;
                } catch (RuntimeException e10) {
                    zzboj.zza(iObjectWrapper, e10, "adapter.appOpen.showAd");
                    throw e10;
                }
            }
            com.google.android.gms.ads.internal.util.client.zzm.c("Can not show null mediation app open ad.");
            throw new RemoteException();
        }
        String canonicalName = Adapter.class.getCanonicalName();
        String canonicalName2 = obj.getClass().getCanonicalName();
        com.google.android.gms.ads.internal.util.client.zzm.e(canonicalName + " #009 Class mismatch: " + canonicalName2);
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbop
    public final void zzI() {
        Object obj = this.zza;
        if (obj instanceof MediationInterstitialAdapter) {
            com.google.android.gms.ads.internal.util.client.zzm.b("Showing interstitial from adapter.");
            ((MediationInterstitialAdapter) this.zza).showInterstitial();
            return;
        }
        String canonicalName = MediationInterstitialAdapter.class.getCanonicalName();
        String canonicalName2 = obj.getClass().getCanonicalName();
        com.google.android.gms.ads.internal.util.client.zzm.e(canonicalName + " #009 Class mismatch: " + canonicalName2);
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbop
    public final void zzJ(IObjectWrapper iObjectWrapper) {
        Object obj = this.zza;
        if (!(obj instanceof Adapter) && !(obj instanceof MediationInterstitialAdapter)) {
            String canonicalName = MediationInterstitialAdapter.class.getCanonicalName();
            String canonicalName2 = Adapter.class.getCanonicalName();
            String canonicalName3 = obj.getClass().getCanonicalName();
            com.google.android.gms.ads.internal.util.client.zzm.e(canonicalName + " or " + canonicalName2 + " #009 Class mismatch: " + canonicalName3);
            throw new RemoteException();
        } else if (obj instanceof MediationInterstitialAdapter) {
            zzI();
        } else {
            com.google.android.gms.ads.internal.util.client.zzm.b("Show interstitial ad from adapter.");
            MediationInterstitialAd mediationInterstitialAd = this.zzf;
            if (mediationInterstitialAd != null) {
                try {
                    mediationInterstitialAd.showAd((Context) ObjectWrapper.L0(iObjectWrapper));
                    return;
                } catch (RuntimeException e10) {
                    zzboj.zza(iObjectWrapper, e10, "adapter.interstitial.showAd");
                    throw e10;
                }
            }
            com.google.android.gms.ads.internal.util.client.zzm.c("Can not show null mediation interstitial ad.");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbop
    public final void zzK(IObjectWrapper iObjectWrapper) {
        Object obj = this.zza;
        if (obj instanceof Adapter) {
            com.google.android.gms.ads.internal.util.client.zzm.b("Show rewarded ad from adapter.");
            MediationRewardedAd mediationRewardedAd = this.zzi;
            if (mediationRewardedAd != null) {
                try {
                    mediationRewardedAd.showAd((Context) ObjectWrapper.L0(iObjectWrapper));
                    return;
                } catch (RuntimeException e10) {
                    zzboj.zza(iObjectWrapper, e10, "adapter.rewarded.showAd");
                    throw e10;
                }
            }
            com.google.android.gms.ads.internal.util.client.zzm.c("Can not show null mediation rewarded ad.");
            throw new RemoteException();
        }
        String canonicalName = Adapter.class.getCanonicalName();
        String canonicalName2 = obj.getClass().getCanonicalName();
        com.google.android.gms.ads.internal.util.client.zzm.e(canonicalName + " #009 Class mismatch: " + canonicalName2);
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbop
    public final void zzL() {
        Object obj = this.zza;
        if (obj instanceof Adapter) {
            MediationRewardedAd mediationRewardedAd = this.zzi;
            if (mediationRewardedAd != null) {
                try {
                    mediationRewardedAd.showAd((Context) ObjectWrapper.L0(this.zzd));
                    return;
                } catch (RuntimeException e10) {
                    zzboj.zza(this.zzd, e10, "adapter.showVideo");
                    throw e10;
                }
            }
            com.google.android.gms.ads.internal.util.client.zzm.c("Can not show null mediated rewarded ad.");
            throw new RemoteException();
        }
        String canonicalName = Adapter.class.getCanonicalName();
        String canonicalName2 = obj.getClass().getCanonicalName();
        com.google.android.gms.ads.internal.util.client.zzm.e(canonicalName + " #009 Class mismatch: " + canonicalName2);
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbop
    public final boolean zzM() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbop
    public final boolean zzN() {
        Object obj = this.zza;
        if (!(obj instanceof Adapter) && !Objects.equals(obj.getClass().getCanonicalName(), "com.google.ads.mediation.admob.AdMobAdapter")) {
            Object obj2 = this.zza;
            String canonicalName = Adapter.class.getCanonicalName();
            String canonicalName2 = obj2.getClass().getCanonicalName();
            com.google.android.gms.ads.internal.util.client.zzm.e(canonicalName + " #009 Class mismatch: " + canonicalName2);
            throw new RemoteException();
        } else if (this.zzc != null) {
            return true;
        } else {
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbop
    public final zzbox zzO() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbop
    public final zzboy zzP() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbop
    public final Bundle zze() {
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzbop
    public final Bundle zzf() {
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzbop
    public final Bundle zzg() {
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzbop
    public final com.google.android.gms.ads.internal.client.zzdq zzh() {
        Object obj = this.zza;
        if (obj instanceof com.google.android.gms.ads.mediation.zza) {
            try {
                return ((com.google.android.gms.ads.mediation.zza) obj).getVideoController();
            } catch (Throwable unused) {
                com.google.android.gms.ads.internal.util.client.zzm.g(6);
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbop
    public final zzbfx zzi() {
        zzbpp zzbppVar = this.zzb;
        if (zzbppVar != null) {
            zzbfy zzc = zzbppVar.zzc();
            if (zzc instanceof zzbfy) {
                return zzc.zza();
            }
            return null;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbop
    public final zzbov zzj() {
        MediationInterscrollerAd mediationInterscrollerAd = this.zzj;
        if (mediationInterscrollerAd != null) {
            return new zzbpo(mediationInterscrollerAd);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbop
    public final zzbpb zzk() {
        UnifiedNativeAdMapper zza;
        Object obj = this.zza;
        if (obj instanceof MediationNativeAdapter) {
            zzbpp zzbppVar = this.zzb;
            if (zzbppVar != null && (zza = zzbppVar.zza()) != null) {
                return new zzbpt(zza);
            }
            return null;
        } else if (obj instanceof Adapter) {
            NativeAdMapper nativeAdMapper = this.zzh;
            if (nativeAdMapper != null) {
                return new zzbpr(nativeAdMapper);
            }
            UnifiedNativeAdMapper unifiedNativeAdMapper = this.zzg;
            if (unifiedNativeAdMapper != null) {
                return new zzbpt(unifiedNativeAdMapper);
            }
            return null;
        } else {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbop
    public final zzbra zzl() {
        Object obj = this.zza;
        if (!(obj instanceof Adapter)) {
            return null;
        }
        return zzbra.zza(((Adapter) obj).getVersionInfo());
    }

    @Override // com.google.android.gms.internal.ads.zzbop
    public final zzbra zzm() {
        Object obj = this.zza;
        if (!(obj instanceof Adapter)) {
            return null;
        }
        return zzbra.zza(((Adapter) obj).getSDKVersionInfo());
    }

    @Override // com.google.android.gms.internal.ads.zzbop
    public final IObjectWrapper zzn() {
        Object obj = this.zza;
        if (obj instanceof MediationBannerAdapter) {
            return new ObjectWrapper(((MediationBannerAdapter) obj).getBannerView());
        }
        if (obj instanceof Adapter) {
            return new ObjectWrapper(this.zze);
        }
        String canonicalName = MediationBannerAdapter.class.getCanonicalName();
        String canonicalName2 = Adapter.class.getCanonicalName();
        String canonicalName3 = obj.getClass().getCanonicalName();
        com.google.android.gms.ads.internal.util.client.zzm.e(canonicalName + " or " + canonicalName2 + " #009 Class mismatch: " + canonicalName3);
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbop
    public final void zzo() {
        Object obj = this.zza;
        if (!(obj instanceof MediationAdapter)) {
            return;
        }
        ((MediationAdapter) obj).onDestroy();
    }

    @Override // com.google.android.gms.internal.ads.zzbop
    public final void zzp(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzbvy zzbvyVar, String str2) {
        Object obj = this.zza;
        if (!(obj instanceof Adapter) && !Objects.equals(obj.getClass().getCanonicalName(), "com.google.ads.mediation.admob.AdMobAdapter")) {
            Object obj2 = this.zza;
            String canonicalName = Adapter.class.getCanonicalName();
            String canonicalName2 = obj2.getClass().getCanonicalName();
            com.google.android.gms.ads.internal.util.client.zzm.e(canonicalName + " #009 Class mismatch: " + canonicalName2);
            throw new RemoteException();
        }
        this.zzd = iObjectWrapper;
        this.zzc = zzbvyVar;
        zzbvyVar.zzl(new ObjectWrapper(this.zza));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.ads.zzbop
    public final void zzq(IObjectWrapper iObjectWrapper, zzbkz zzbkzVar, List list) {
        char c;
        AdFormat adFormat;
        if (this.zza instanceof Adapter) {
            zzbpg zzbpgVar = new zzbpg(this, zzbkzVar);
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                zzblf zzblfVar = (zzblf) it.next();
                String str = zzblfVar.zza;
                switch (str.hashCode()) {
                    case -1396342996:
                        if (str.equals("banner")) {
                            c = 0;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1052618729:
                        if (str.equals("native")) {
                            c = 4;
                            break;
                        }
                        c = 65535;
                        break;
                    case -239580146:
                        if (str.equals("rewarded")) {
                            c = 2;
                            break;
                        }
                        c = 65535;
                        break;
                    case 604727084:
                        if (str.equals("interstitial")) {
                            c = 1;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1167692200:
                        if (str.equals("app_open")) {
                            c = 5;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1778294298:
                        if (str.equals("app_open_ad")) {
                            c = 6;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1911491517:
                        if (str.equals("rewarded_interstitial")) {
                            c = 3;
                            break;
                        }
                        c = 65535;
                        break;
                    default:
                        c = 65535;
                        break;
                }
                switch (c) {
                    case 0:
                        adFormat = AdFormat.BANNER;
                        break;
                    case 1:
                        adFormat = AdFormat.INTERSTITIAL;
                        break;
                    case 2:
                        adFormat = AdFormat.REWARDED;
                        break;
                    case 3:
                        adFormat = AdFormat.REWARDED_INTERSTITIAL;
                        break;
                    case 4:
                        adFormat = AdFormat.NATIVE;
                        break;
                    case 5:
                        adFormat = AdFormat.APP_OPEN_AD;
                        break;
                    case 6:
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzkR)).booleanValue()) {
                            adFormat = AdFormat.APP_OPEN_AD;
                            break;
                        }
                    default:
                        adFormat = null;
                        break;
                }
                if (adFormat != null) {
                    arrayList.add(new MediationConfiguration(zzblfVar.zzb));
                }
            }
            ((Adapter) this.zza).initialize((Context) ObjectWrapper.L0(iObjectWrapper), zzbpgVar, arrayList);
            return;
        }
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbop
    public final void zzr(IObjectWrapper iObjectWrapper, zzbvy zzbvyVar, List list) {
        com.google.android.gms.ads.internal.util.client.zzm.e("Could not initialize rewarded video adapter.");
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbop
    public final void zzs(com.google.android.gms.ads.internal.client.zzl zzlVar, String str) {
        zzB(zzlVar, str, null);
    }

    @Override // com.google.android.gms.internal.ads.zzbop
    public final void zzt(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzbos zzbosVar) {
        Object obj = this.zza;
        if (obj instanceof Adapter) {
            com.google.android.gms.ads.internal.util.client.zzm.b("Requesting app open ad from adapter.");
            try {
                zzbpm zzbpmVar = new zzbpm(this, zzbosVar);
                Context context = (Context) ObjectWrapper.L0(iObjectWrapper);
                Bundle zzW = zzW(str, zzlVar, null);
                Bundle zzV = zzV(zzlVar);
                boolean zzX = zzX(zzlVar);
                Location location = zzlVar.f10209k;
                int i10 = zzlVar.f10205g;
                int i11 = zzlVar.f10218t;
                zzY(str, zzlVar);
                ((Adapter) this.zza).loadAppOpenAd(new MediationAppOpenAdConfiguration(context, "", zzW, zzV, zzX, i10, i11, ""), zzbpmVar);
                return;
            } catch (Exception e10) {
                com.google.android.gms.ads.internal.util.client.zzm.g(6);
                zzboj.zza(iObjectWrapper, e10, "adapter.loadAppOpenAd");
                throw new RemoteException();
            }
        }
        String canonicalName = Adapter.class.getCanonicalName();
        String canonicalName2 = obj.getClass().getCanonicalName();
        com.google.android.gms.ads.internal.util.client.zzm.e(canonicalName + " #009 Class mismatch: " + canonicalName2);
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbop
    public final void zzu(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzq zzqVar, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzbos zzbosVar) {
        zzv(iObjectWrapper, zzqVar, zzlVar, str, null, zzbosVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbop
    public final void zzv(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzq zzqVar, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, String str2, zzbos zzbosVar) {
        AdSize adSize;
        HashSet hashSet;
        Date date;
        Bundle bundle;
        Object obj = this.zza;
        if (!(obj instanceof MediationBannerAdapter) && !(obj instanceof Adapter)) {
            com.google.android.gms.ads.internal.util.client.zzm.e(MediationBannerAdapter.class.getCanonicalName() + " or " + Adapter.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
            throw new RemoteException();
        }
        com.google.android.gms.ads.internal.util.client.zzm.b("Requesting banner ad from adapter.");
        boolean z10 = zzqVar.f10250n;
        int i10 = zzqVar.f10239b;
        int i11 = zzqVar.f10241e;
        if (z10) {
            AdSize adSize2 = new AdSize(i11, i10);
            adSize2.f10027e = true;
            adSize2.f10028f = i10;
            adSize = adSize2;
        } else {
            adSize = new AdSize(i11, i10, zzqVar.f10238a);
        }
        Object obj2 = this.zza;
        if (obj2 instanceof MediationBannerAdapter) {
            try {
                MediationBannerAdapter mediationBannerAdapter = (MediationBannerAdapter) obj2;
                List list = zzlVar.f10203e;
                if (list != null) {
                    hashSet = new HashSet(list);
                } else {
                    hashSet = null;
                }
                long j10 = zzlVar.f10201b;
                if (j10 == -1) {
                    date = null;
                } else {
                    date = new Date(j10);
                }
                zzbpe zzbpeVar = new zzbpe(date, zzlVar.f10202d, hashSet, zzlVar.f10209k, zzX(zzlVar), zzlVar.f10205g, zzlVar.f10216r, zzlVar.f10218t, zzY(str, zzlVar));
                Bundle bundle2 = zzlVar.f10211m;
                if (bundle2 != null) {
                    bundle = bundle2.getBundle(mediationBannerAdapter.getClass().getName());
                } else {
                    bundle = null;
                }
                mediationBannerAdapter.requestBannerAd((Context) ObjectWrapper.L0(iObjectWrapper), new zzbpp(zzbosVar), zzW(str, zzlVar, str2), adSize, zzbpeVar, bundle);
            } catch (Throwable th2) {
                com.google.android.gms.ads.internal.util.client.zzm.g(6);
                zzboj.zza(iObjectWrapper, th2, "adapter.requestBannerAd");
                throw new RemoteException();
            }
        } else if (obj2 instanceof Adapter) {
            try {
                zzbph zzbphVar = new zzbph(this, zzbosVar);
                Context context = (Context) ObjectWrapper.L0(iObjectWrapper);
                Bundle zzW = zzW(str, zzlVar, str2);
                Bundle zzV = zzV(zzlVar);
                boolean zzX = zzX(zzlVar);
                Location location = zzlVar.f10209k;
                int i12 = zzlVar.f10205g;
                int i13 = zzlVar.f10218t;
                zzY(str, zzlVar);
                ((Adapter) obj2).loadBannerAd(new MediationBannerAdConfiguration(context, "", zzW, zzV, zzX, i12, i13, adSize, this.zzl), zzbphVar);
            } catch (Throwable th3) {
                com.google.android.gms.ads.internal.util.client.zzm.g(6);
                zzboj.zza(iObjectWrapper, th3, "adapter.loadBannerAd");
                throw new RemoteException();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbop
    public final void zzw(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzq zzqVar, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, String str2, zzbos zzbosVar) {
        Object obj = this.zza;
        if (obj instanceof Adapter) {
            com.google.android.gms.ads.internal.util.client.zzm.b("Requesting interscroller ad from adapter.");
            try {
                Adapter adapter = (Adapter) this.zza;
                zzbpf zzbpfVar = new zzbpf(this, zzbosVar, adapter);
                Context context = (Context) ObjectWrapper.L0(iObjectWrapper);
                Bundle zzW = zzW(str, zzlVar, str2);
                Bundle zzV = zzV(zzlVar);
                boolean zzX = zzX(zzlVar);
                Location location = zzlVar.f10209k;
                int i10 = zzlVar.f10205g;
                int i11 = zzlVar.f10218t;
                zzY(str, zzlVar);
                int i12 = zzqVar.f10241e;
                int i13 = zzqVar.f10239b;
                AdSize adSize = new AdSize(i12, i13);
                adSize.f10029g = true;
                adSize.f10030h = i13;
                adapter.loadInterscrollerAd(new MediationBannerAdConfiguration(context, "", zzW, zzV, zzX, i10, i11, adSize, ""), zzbpfVar);
                return;
            } catch (Exception e10) {
                com.google.android.gms.ads.internal.util.client.zzm.g(6);
                zzboj.zza(iObjectWrapper, e10, "adapter.loadInterscrollerAd");
                throw new RemoteException();
            }
        }
        String canonicalName = Adapter.class.getCanonicalName();
        String canonicalName2 = obj.getClass().getCanonicalName();
        com.google.android.gms.ads.internal.util.client.zzm.e(canonicalName + " #009 Class mismatch: " + canonicalName2);
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbop
    public final void zzx(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzbos zzbosVar) {
        zzy(iObjectWrapper, zzlVar, str, null, zzbosVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbop
    public final void zzy(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, String str2, zzbos zzbosVar) {
        HashSet hashSet;
        Date date;
        Bundle bundle;
        Object obj = this.zza;
        if (!(obj instanceof MediationInterstitialAdapter) && !(obj instanceof Adapter)) {
            String canonicalName = MediationInterstitialAdapter.class.getCanonicalName();
            String canonicalName2 = Adapter.class.getCanonicalName();
            String canonicalName3 = obj.getClass().getCanonicalName();
            com.google.android.gms.ads.internal.util.client.zzm.e(canonicalName + " or " + canonicalName2 + " #009 Class mismatch: " + canonicalName3);
            throw new RemoteException();
        }
        com.google.android.gms.ads.internal.util.client.zzm.b("Requesting interstitial ad from adapter.");
        Object obj2 = this.zza;
        if (obj2 instanceof MediationInterstitialAdapter) {
            try {
                MediationInterstitialAdapter mediationInterstitialAdapter = (MediationInterstitialAdapter) obj2;
                List list = zzlVar.f10203e;
                if (list != null) {
                    hashSet = new HashSet(list);
                } else {
                    hashSet = null;
                }
                long j10 = zzlVar.f10201b;
                if (j10 == -1) {
                    date = null;
                } else {
                    date = new Date(j10);
                }
                zzbpe zzbpeVar = new zzbpe(date, zzlVar.f10202d, hashSet, zzlVar.f10209k, zzX(zzlVar), zzlVar.f10205g, zzlVar.f10216r, zzlVar.f10218t, zzY(str, zzlVar));
                Bundle bundle2 = zzlVar.f10211m;
                if (bundle2 != null) {
                    bundle = bundle2.getBundle(mediationInterstitialAdapter.getClass().getName());
                } else {
                    bundle = null;
                }
                mediationInterstitialAdapter.requestInterstitialAd((Context) ObjectWrapper.L0(iObjectWrapper), new zzbpp(zzbosVar), zzW(str, zzlVar, str2), zzbpeVar, bundle);
            } catch (Throwable th2) {
                com.google.android.gms.ads.internal.util.client.zzm.g(6);
                zzboj.zza(iObjectWrapper, th2, "adapter.requestInterstitialAd");
                throw new RemoteException();
            }
        } else if (obj2 instanceof Adapter) {
            try {
                zzbpi zzbpiVar = new zzbpi(this, zzbosVar);
                Bundle zzW = zzW(str, zzlVar, str2);
                Bundle zzV = zzV(zzlVar);
                boolean zzX = zzX(zzlVar);
                Location location = zzlVar.f10209k;
                int i10 = zzlVar.f10205g;
                int i11 = zzlVar.f10218t;
                zzY(str, zzlVar);
                ((Adapter) obj2).loadInterstitialAd(new MediationInterstitialAdConfiguration((Context) ObjectWrapper.L0(iObjectWrapper), "", zzW, zzV, zzX, i10, i11, this.zzl), zzbpiVar);
            } catch (Throwable th3) {
                com.google.android.gms.ads.internal.util.client.zzm.g(6);
                zzboj.zza(iObjectWrapper, th3, "adapter.loadInterstitialAd");
                throw new RemoteException();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbop
    public final void zzz(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, String str2, zzbos zzbosVar, zzbes zzbesVar, List list) {
        HashSet hashSet;
        Date date;
        Bundle bundle;
        Object obj = this.zza;
        if (!(obj instanceof MediationNativeAdapter) && !(obj instanceof Adapter)) {
            String canonicalName = MediationNativeAdapter.class.getCanonicalName();
            String canonicalName2 = Adapter.class.getCanonicalName();
            String canonicalName3 = obj.getClass().getCanonicalName();
            com.google.android.gms.ads.internal.util.client.zzm.e(canonicalName + " or " + canonicalName2 + " #009 Class mismatch: " + canonicalName3);
            throw new RemoteException();
        }
        com.google.android.gms.ads.internal.util.client.zzm.b("Requesting native ad from adapter.");
        Object obj2 = this.zza;
        if (obj2 instanceof MediationNativeAdapter) {
            try {
                MediationNativeAdapter mediationNativeAdapter = (MediationNativeAdapter) obj2;
                List list2 = zzlVar.f10203e;
                if (list2 != null) {
                    hashSet = new HashSet(list2);
                } else {
                    hashSet = null;
                }
                long j10 = zzlVar.f10201b;
                if (j10 == -1) {
                    date = null;
                } else {
                    date = new Date(j10);
                }
                zzbps zzbpsVar = new zzbps(date, zzlVar.f10202d, hashSet, zzlVar.f10209k, zzX(zzlVar), zzlVar.f10205g, zzbesVar, list, zzlVar.f10216r, zzlVar.f10218t, zzY(str, zzlVar));
                Bundle bundle2 = zzlVar.f10211m;
                if (bundle2 != null) {
                    bundle = bundle2.getBundle(mediationNativeAdapter.getClass().getName());
                } else {
                    bundle = null;
                }
                this.zzb = new zzbpp(zzbosVar);
                mediationNativeAdapter.requestNativeAd((Context) ObjectWrapper.L0(iObjectWrapper), this.zzb, zzW(str, zzlVar, str2), zzbpsVar, bundle);
            } catch (Throwable th2) {
                com.google.android.gms.ads.internal.util.client.zzm.g(6);
                zzboj.zza(iObjectWrapper, th2, "adapter.requestNativeAd");
                throw new RemoteException();
            }
        } else if (obj2 instanceof Adapter) {
            try {
                zzbpk zzbpkVar = new zzbpk(this, zzbosVar);
                Context context = (Context) ObjectWrapper.L0(iObjectWrapper);
                Bundle zzW = zzW(str, zzlVar, str2);
                Bundle zzV = zzV(zzlVar);
                boolean zzX = zzX(zzlVar);
                Location location = zzlVar.f10209k;
                int i10 = zzlVar.f10205g;
                int i11 = zzlVar.f10218t;
                zzY(str, zzlVar);
                ((Adapter) obj2).loadNativeAdMapper(new MediationNativeAdConfiguration(context, "", zzW, zzV, zzX, i10, i11, this.zzl, zzbesVar), zzbpkVar);
            } catch (Throwable th3) {
                com.google.android.gms.ads.internal.util.client.zzm.g(6);
                zzboj.zza(iObjectWrapper, th3, "adapter.loadNativeAdMapper");
                String message = th3.getMessage();
                if (!TextUtils.isEmpty(message) && message.equals("Method is not found")) {
                    try {
                        zzbpj zzbpjVar = new zzbpj(this, zzbosVar);
                        Bundle zzW2 = zzW(str, zzlVar, str2);
                        Bundle zzV2 = zzV(zzlVar);
                        boolean zzX2 = zzX(zzlVar);
                        Location location2 = zzlVar.f10209k;
                        int i12 = zzlVar.f10205g;
                        int i13 = zzlVar.f10218t;
                        zzY(str, zzlVar);
                        ((Adapter) this.zza).loadNativeAd(new MediationNativeAdConfiguration((Context) ObjectWrapper.L0(iObjectWrapper), "", zzW2, zzV2, zzX2, i12, i13, this.zzl, zzbesVar), zzbpjVar);
                        return;
                    } catch (Throwable th4) {
                        com.google.android.gms.ads.internal.util.client.zzm.g(6);
                        zzboj.zza(iObjectWrapper, th4, "adapter.loadNativeAd");
                        throw new RemoteException();
                    }
                }
                throw new RemoteException();
            }
        }
    }

    public zzbpn(MediationAdapter mediationAdapter) {
        this.zza = mediationAdapter;
    }
}
