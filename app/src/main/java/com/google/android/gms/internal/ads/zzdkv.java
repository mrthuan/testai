package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzdkv {
    private final zzdpl zza;
    private final zzdoa zzb;
    private ViewTreeObserver.OnScrollChangedListener zzc = null;

    public zzdkv(zzdpl zzdplVar, zzdoa zzdoaVar) {
        this.zza = zzdplVar;
        this.zzb = zzdoaVar;
    }

    private static final int zzf(Context context, String str, int i10) {
        try {
            i10 = Integer.parseInt(str);
        } catch (NumberFormatException unused) {
        }
        com.google.android.gms.ads.internal.util.client.zzf zzfVar = com.google.android.gms.ads.internal.client.zzay.f10107f.f10108a;
        return com.google.android.gms.ads.internal.util.client.zzf.o(context, i10);
    }

    public final View zza(final View view, final WindowManager windowManager) {
        zzcej zza = this.zza.zza(com.google.android.gms.ads.internal.client.zzq.f(), null, null);
        View view2 = (View) zza;
        view2.setVisibility(4);
        view2.setContentDescription("policy_validator");
        zza.zzag("/sendMessageToSdk", new zzbix() { // from class: com.google.android.gms.internal.ads.zzdkp
            @Override // com.google.android.gms.internal.ads.zzbix
            public final void zza(Object obj, Map map) {
                zzdkv.this.zzb((zzcej) obj, map);
            }
        });
        zza.zzag("/hideValidatorOverlay", new zzbix() { // from class: com.google.android.gms.internal.ads.zzdkq
            @Override // com.google.android.gms.internal.ads.zzbix
            public final void zza(Object obj, Map map) {
                zzdkv.this.zzc(windowManager, view, (zzcej) obj, map);
            }
        });
        zza.zzag("/open", new zzbjj(null, null, null, null, null));
        this.zzb.zzm(new WeakReference(zza), "/loadNativeAdPolicyViolations", new zzbix() { // from class: com.google.android.gms.internal.ads.zzdkr
            @Override // com.google.android.gms.internal.ads.zzbix
            public final void zza(Object obj, Map map) {
                zzdkv.this.zze(view, windowManager, (zzcej) obj, map);
            }
        });
        this.zzb.zzm(new WeakReference(zza), "/showValidatorOverlay", new zzbix() { // from class: com.google.android.gms.internal.ads.zzdks
            @Override // com.google.android.gms.internal.ads.zzbix
            public final void zza(Object obj, Map map) {
                com.google.android.gms.ads.internal.util.client.zzm.b("Show native ad policy validator overlay.");
                ((zzcej) obj).zzF().setVisibility(0);
            }
        });
        return (View) zza;
    }

    public final /* synthetic */ void zzb(zzcej zzcejVar, Map map) {
        this.zzb.zzj("sendMessageToNativeJs", map);
    }

    public final /* synthetic */ void zzc(WindowManager windowManager, View view, zzcej zzcejVar, Map map) {
        com.google.android.gms.ads.internal.util.client.zzm.b("Hide native ad policy validator overlay.");
        zzcejVar.zzF().setVisibility(8);
        if (zzcejVar.zzF().getWindowToken() != null) {
            windowManager.removeView(zzcejVar.zzF());
        }
        zzcejVar.destroy();
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (this.zzc != null && viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnScrollChangedListener(this.zzc);
        }
    }

    public final /* synthetic */ void zzd(Map map, boolean z10, int i10, String str, String str2) {
        HashMap h10 = a6.h.h("messageType", "validatorHtmlLoaded");
        h10.put(FacebookMediationAdapter.KEY_ID, (String) map.get(FacebookMediationAdapter.KEY_ID));
        this.zzb.zzj("sendMessageToNativeJs", h10);
    }

    public final void zze(final View view, final WindowManager windowManager, final zzcej zzcejVar, final Map map) {
        int i10;
        zzcejVar.zzN().zzB(new zzcfz() { // from class: com.google.android.gms.internal.ads.zzdku
            @Override // com.google.android.gms.internal.ads.zzcfz
            public final void zza(boolean z10, int i11, String str, String str2) {
                zzdkv.this.zzd(map, z10, i11, str, str2);
            }
        });
        if (map != null) {
            Context context = view.getContext();
            zzbbn zzbbnVar = zzbbw.zzhl;
            com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f10115d;
            int zzf = zzf(context, (String) map.get("validator_width"), ((Integer) zzbaVar.c.zza(zzbbnVar)).intValue());
            int zzf2 = zzf(context, (String) map.get("validator_height"), ((Integer) zzbaVar.c.zza(zzbbw.zzhm)).intValue());
            int zzf3 = zzf(context, (String) map.get("validator_x"), 0);
            int zzf4 = zzf(context, (String) map.get("validator_y"), 0);
            zzcejVar.zzaj(zzcgd.zzb(zzf, zzf2));
            try {
                zzcejVar.zzG().getSettings().setUseWideViewPort(((Boolean) zzbaVar.c.zza(zzbbw.zzhn)).booleanValue());
                zzcejVar.zzG().getSettings().setLoadWithOverviewMode(((Boolean) zzbaVar.c.zza(zzbbw.zzho)).booleanValue());
            } catch (NullPointerException unused) {
            }
            final WindowManager.LayoutParams a10 = com.google.android.gms.ads.internal.util.zzbv.a();
            a10.x = zzf3;
            a10.y = zzf4;
            windowManager.updateViewLayout(zzcejVar.zzF(), a10);
            final String str = (String) map.get("orientation");
            Rect rect = new Rect();
            if (view.getGlobalVisibleRect(rect)) {
                if (!"1".equals(str) && !"2".equals(str)) {
                    i10 = rect.top;
                } else {
                    i10 = rect.bottom;
                }
                final int i11 = i10 - zzf4;
                this.zzc = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.google.android.gms.internal.ads.zzdkt
                    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
                    public final void onScrollChanged() {
                        Rect rect2 = new Rect();
                        if (view.getGlobalVisibleRect(rect2)) {
                            zzcej zzcejVar2 = zzcejVar;
                            if (zzcejVar2.zzF().getWindowToken() != null) {
                                int i12 = i11;
                                WindowManager.LayoutParams layoutParams = a10;
                                String str2 = str;
                                if (!"1".equals(str2) && !"2".equals(str2)) {
                                    layoutParams.y = rect2.top - i12;
                                } else {
                                    layoutParams.y = rect2.bottom - i12;
                                }
                                windowManager.updateViewLayout(zzcejVar2.zzF(), layoutParams);
                            }
                        }
                    }
                };
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    viewTreeObserver.addOnScrollChangedListener(this.zzc);
                }
            }
            String str2 = (String) map.get("overlay_url");
            if (!TextUtils.isEmpty(str2)) {
                zzcejVar.loadUrl(str2);
            }
        }
    }
}
