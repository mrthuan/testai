package com.google.android.gms.ads.admanager;

import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.BaseAdView;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzbu;
import com.google.android.gms.ads.internal.client.zzea;
import com.google.android.gms.ads.internal.client.zzfk;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzayk;
import com.google.android.gms.internal.ads.zzbbw;
import com.google.android.gms.internal.ads.zzbdq;
import com.google.android.gms.internal.ads.zzbtq;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes.dex */
public final class AdManagerAdView extends BaseAdView {
    public AdManagerAdView(Context context) {
        super(context);
        if (context == null) {
            throw new NullPointerException("Context cannot be null");
        }
    }

    public final void e(final AdManagerAdRequest adManagerAdRequest) {
        Preconditions.e("#008 Must be called on the main UI thread.");
        zzbbw.zza(getContext());
        if (((Boolean) zzbdq.zzf.zze()).booleanValue()) {
            if (((Boolean) zzba.f10115d.c.zza(zzbbw.zzkl)).booleanValue()) {
                com.google.android.gms.ads.internal.util.client.zzb.f10350b.execute(new Runnable() { // from class: com.google.android.gms.ads.admanager.zzb
                    @Override // java.lang.Runnable
                    public final void run() {
                        AdManagerAdRequest adManagerAdRequest2 = adManagerAdRequest;
                        AdManagerAdView adManagerAdView = AdManagerAdView.this;
                        adManagerAdView.getClass();
                        try {
                            adManagerAdView.f10035a.c(adManagerAdRequest2.f10013a);
                        } catch (IllegalStateException e10) {
                            zzbtq.zza(adManagerAdView.getContext()).zzh(e10, "AdManagerAdView.loadAd");
                        }
                    }
                });
                return;
            }
        }
        this.f10035a.c(adManagerAdRequest.f10013a);
    }

    public AdSize[] getAdSizes() {
        return this.f10035a.f10155g;
    }

    public AppEventListener getAppEventListener() {
        return this.f10035a.f10156h;
    }

    public VideoController getVideoController() {
        return this.f10035a.c;
    }

    public VideoOptions getVideoOptions() {
        return this.f10035a.f10158j;
    }

    public void setAdSizes(AdSize... adSizeArr) {
        if (adSizeArr != null && adSizeArr.length > 0) {
            this.f10035a.d(adSizeArr);
            return;
        }
        throw new IllegalArgumentException("The supported ad sizes must contain at least one valid ad size.");
    }

    public void setAppEventListener(AppEventListener appEventListener) {
        zzayk zzaykVar;
        zzea zzeaVar = this.f10035a;
        zzeaVar.getClass();
        try {
            zzeaVar.f10156h = appEventListener;
            zzbu zzbuVar = zzeaVar.f10157i;
            if (zzbuVar != null) {
                if (appEventListener != null) {
                    zzaykVar = new zzayk(appEventListener);
                } else {
                    zzaykVar = null;
                }
                zzbuVar.zzG(zzaykVar);
            }
        } catch (RemoteException e10) {
            zzm.f("#007 Could not call remote method.", e10);
        }
    }

    public void setManualImpressionsEnabled(boolean z10) {
        zzea zzeaVar = this.f10035a;
        zzeaVar.f10162n = z10;
        try {
            zzbu zzbuVar = zzeaVar.f10157i;
            if (zzbuVar != null) {
                zzbuVar.zzN(z10);
            }
        } catch (RemoteException e10) {
            zzm.f("#007 Could not call remote method.", e10);
        }
    }

    public void setVideoOptions(VideoOptions videoOptions) {
        zzfk zzfkVar;
        zzea zzeaVar = this.f10035a;
        zzeaVar.f10158j = videoOptions;
        try {
            zzbu zzbuVar = zzeaVar.f10157i;
            if (zzbuVar != null) {
                if (videoOptions == null) {
                    zzfkVar = null;
                } else {
                    zzfkVar = new zzfk(videoOptions);
                }
                zzbuVar.zzU(zzfkVar);
            }
        } catch (RemoteException e10) {
            zzm.f("#007 Could not call remote method.", e10);
        }
    }

    public AdManagerAdView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        if (context == null) {
            throw new NullPointerException("Context cannot be null");
        }
    }

    public AdManagerAdView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10, (Object) null);
        if (context == null) {
            throw new NullPointerException("Context cannot be null");
        }
    }
}
