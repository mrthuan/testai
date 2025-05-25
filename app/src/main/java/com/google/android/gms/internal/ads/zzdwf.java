package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.ViewGroup;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.appopen.AppOpenAd;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzdwf extends com.google.android.gms.ads.internal.client.zzdi {
    final Map zza = new HashMap();
    private final Context zzb;
    private final WeakReference zzc;
    private final zzdvt zzd;
    private final zzgcu zze;
    private zzdvi zzf;

    public zzdwf(Context context, WeakReference weakReference, zzdvt zzdvtVar, zzdwg zzdwgVar, zzgcu zzgcuVar) {
        this.zzb = context;
        this.zzc = weakReference;
        this.zzd = zzdvtVar;
        this.zze = zzgcuVar;
    }

    private final Context zzj() {
        Context context = (Context) this.zzc.get();
        if (context == null) {
            return this.zzb;
        }
        return context;
    }

    private static AdRequest zzk() {
        Bundle bundle = new Bundle();
        bundle.putString("request_origin", "inspector_ooct");
        return new AdRequest((AdRequest.Builder) new AdRequest.Builder().a(bundle));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String zzl(Object obj) {
        ResponseInfo responseInfo;
        com.google.android.gms.ads.internal.client.zzdn zzdnVar;
        if (obj instanceof LoadAdError) {
            responseInfo = ((LoadAdError) obj).f10036e;
        } else if (obj instanceof AppOpenAd) {
            responseInfo = ((AppOpenAd) obj).getResponseInfo();
        } else if (obj instanceof InterstitialAd) {
            responseInfo = ((InterstitialAd) obj).getResponseInfo();
        } else if (obj instanceof RewardedAd) {
            responseInfo = ((RewardedAd) obj).getResponseInfo();
        } else if (obj instanceof RewardedInterstitialAd) {
            responseInfo = ((RewardedInterstitialAd) obj).getResponseInfo();
        } else if (obj instanceof AdView) {
            responseInfo = ((AdView) obj).getResponseInfo();
        } else if (obj instanceof NativeAd) {
            responseInfo = ((NativeAd) obj).getResponseInfo();
        } else {
            return "";
        }
        if (responseInfo != null && (zzdnVar = responseInfo.f10049a) != null) {
            try {
                return zzdnVar.zzh();
            } catch (RemoteException unused) {
                return "";
            }
        }
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void zzm(String str, String str2) {
        try {
            zzgcj.zzr(this.zzf.zzb(str), new zzdwd(this, str2), this.zze);
        } catch (NullPointerException e10) {
            com.google.android.gms.ads.internal.zzu.B.f10557g.zzw(e10, "OutOfContextTester.setAdAsOutOfContext");
            this.zzd.zzk(str2);
        }
    }

    private final synchronized void zzn(String str, String str2) {
        try {
            zzgcj.zzr(this.zzf.zzb(str), new zzdwe(this, str2), this.zze);
        } catch (NullPointerException e10) {
            com.google.android.gms.ads.internal.zzu.B.f10557g.zzw(e10, "OutOfContextTester.setAdAsShown");
            this.zzd.zzk(str2);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzdj
    public final void zze(String str, IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) {
        Context context = (Context) ObjectWrapper.L0(iObjectWrapper);
        ViewGroup viewGroup = (ViewGroup) ObjectWrapper.L0(iObjectWrapper2);
        if (context != null && viewGroup != null) {
            Object obj = this.zza.get(str);
            if (obj != null) {
                this.zza.remove(str);
            }
            if (obj instanceof AdView) {
                zzdwg.zza(context, viewGroup, (AdView) obj);
            } else if (obj instanceof NativeAd) {
                zzdwg.zzb(context, viewGroup, (NativeAd) obj);
            }
        }
    }

    public final void zzf(zzdvi zzdviVar) {
        this.zzf = zzdviVar;
    }

    public final synchronized void zzg(String str, Object obj, String str2) {
        this.zza.put(str, obj);
        zzm(zzl(obj), str2);
    }

    public final synchronized void zzh(final String str, String str2, final String str3) {
        char c;
        switch (str2.hashCode()) {
            case -1999289321:
                if (str2.equals("NATIVE")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -1372958932:
                if (str2.equals("INTERSTITIAL")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -428325382:
                if (str2.equals("APP_OPEN_AD")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 543046670:
                if (str2.equals("REWARDED")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 1854800829:
                if (str2.equals("REWARDED_INTERSTITIAL")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 1951953708:
                if (str2.equals("BANNER")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c != 0) {
            if (c != 1) {
                if (c != 2) {
                    if (c != 3) {
                        if (c != 4) {
                            if (c != 5) {
                                return;
                            }
                            RewardedInterstitialAd.load(zzj(), str, zzk(), new zzdwb(this, str, str3));
                            return;
                        }
                        RewardedAd.load(zzj(), str, zzk(), new zzdwa(this, str, str3));
                        return;
                    }
                    AdLoader.Builder builder = new AdLoader.Builder(zzj(), str);
                    builder.b(new NativeAd.OnNativeAdLoadedListener() { // from class: com.google.android.gms.internal.ads.zzdvu
                        @Override // com.google.android.gms.ads.nativead.NativeAd.OnNativeAdLoadedListener
                        public final void onNativeAdLoaded(NativeAd nativeAd) {
                            zzdwf.this.zzg(str, nativeAd, str3);
                        }
                    });
                    builder.c(new zzdwc(this, str3));
                    builder.a().a(zzk());
                    return;
                }
                InterstitialAd.load(zzj(), str, zzk(), new zzdvz(this, str, str3));
                return;
            }
            AdView adView = new AdView(zzj());
            adView.setAdSize(AdSize.f10014i);
            adView.setAdUnitId(str);
            adView.setAdListener(new zzdvy(this, str, adView, str3));
            adView.b(zzk());
            return;
        }
        AppOpenAd.load(zzj(), str, zzk(), 1, new zzdvx(this, str, str3));
    }

    public final synchronized void zzi(String str, String str2) {
        Object obj;
        Activity zzg = this.zzd.zzg();
        if (zzg != null && (obj = this.zza.get(str)) != null) {
            zzbbn zzbbnVar = zzbbw.zziz;
            com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f10115d;
            if (!((Boolean) zzbaVar.c.zza(zzbbnVar)).booleanValue() || (obj instanceof AppOpenAd) || (obj instanceof InterstitialAd) || (obj instanceof RewardedAd) || (obj instanceof RewardedInterstitialAd)) {
                this.zza.remove(str);
            }
            zzn(zzl(obj), str2);
            if (obj instanceof AppOpenAd) {
                ((AppOpenAd) obj).show(zzg);
            } else if (obj instanceof InterstitialAd) {
                ((InterstitialAd) obj).show(zzg);
            } else if (obj instanceof RewardedAd) {
                ((RewardedAd) obj).show(zzg, new OnUserEarnedRewardListener() { // from class: com.google.android.gms.internal.ads.zzdvv
                    @Override // com.google.android.gms.ads.OnUserEarnedRewardListener
                    public final void onUserEarnedReward(RewardItem rewardItem) {
                    }
                });
            } else if (obj instanceof RewardedInterstitialAd) {
                ((RewardedInterstitialAd) obj).show(zzg, new OnUserEarnedRewardListener() { // from class: com.google.android.gms.internal.ads.zzdvw
                    @Override // com.google.android.gms.ads.OnUserEarnedRewardListener
                    public final void onUserEarnedReward(RewardItem rewardItem) {
                    }
                });
            } else if (((Boolean) zzbaVar.c.zza(zzbbnVar)).booleanValue() && ((obj instanceof AdView) || (obj instanceof NativeAd))) {
                Intent intent = new Intent();
                Context zzj = zzj();
                intent.setClassName(zzj, "com.google.android.gms.ads.OutOfContextTestingActivity");
                intent.putExtra("adUnit", str);
                com.google.android.gms.ads.internal.util.zzt zztVar = com.google.android.gms.ads.internal.zzu.B.c;
                com.google.android.gms.ads.internal.util.zzt.zzT(zzj, intent);
            }
        }
    }
}
