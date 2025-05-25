package com.google.android.gms.ads;

import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzbu;
import com.google.android.gms.ads.internal.client.zzea;
import com.google.android.gms.ads.internal.client.zzfe;
import com.google.android.gms.ads.internal.client.zzp;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzayk;
import com.google.android.gms.internal.ads.zzbbw;
import com.google.android.gms.internal.ads.zzbdq;
import com.google.android.gms.internal.ads.zzbtq;
import k7.o;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes.dex */
public abstract class BaseAdView extends ViewGroup {

    /* renamed from: a  reason: collision with root package name */
    public final zzea f10035a;

    public BaseAdView(Context context) {
        super(context);
        this.f10035a = new zzea((ViewGroup) this, (AttributeSet) null, false, zzp.f10237a);
    }

    public final void a() {
        zzbbw.zza(getContext());
        if (((Boolean) zzbdq.zze.zze()).booleanValue()) {
            if (((Boolean) zzba.f10115d.c.zza(zzbbw.zzki)).booleanValue()) {
                com.google.android.gms.ads.internal.util.client.zzb.f10350b.execute(new Runnable() { // from class: com.google.android.gms.ads.zzd
                    @Override // java.lang.Runnable
                    public final void run() {
                        BaseAdView baseAdView = BaseAdView.this;
                        try {
                            zzea zzeaVar = baseAdView.f10035a;
                            zzeaVar.getClass();
                            try {
                                zzbu zzbuVar = zzeaVar.f10157i;
                                if (zzbuVar != null) {
                                    zzbuVar.zzx();
                                }
                            } catch (RemoteException e10) {
                                zzm.f("#007 Could not call remote method.", e10);
                            }
                        } catch (IllegalStateException e11) {
                            zzbtq.zza(baseAdView.getContext()).zzh(e11, "BaseAdView.destroy");
                        }
                    }
                });
                return;
            }
        }
        zzea zzeaVar = this.f10035a;
        zzeaVar.getClass();
        try {
            zzbu zzbuVar = zzeaVar.f10157i;
            if (zzbuVar != null) {
                zzbuVar.zzx();
            }
        } catch (RemoteException e10) {
            zzm.f("#007 Could not call remote method.", e10);
        }
    }

    public final void b(final AdRequest adRequest) {
        Preconditions.e("#008 Must be called on the main UI thread.");
        zzbbw.zza(getContext());
        if (((Boolean) zzbdq.zzf.zze()).booleanValue()) {
            if (((Boolean) zzba.f10115d.c.zza(zzbbw.zzkl)).booleanValue()) {
                com.google.android.gms.ads.internal.util.client.zzb.f10350b.execute(new Runnable() { // from class: com.google.android.gms.ads.zzf
                    @Override // java.lang.Runnable
                    public final void run() {
                        BaseAdView baseAdView = BaseAdView.this;
                        try {
                            baseAdView.f10035a.c(adRequest.f10013a);
                        } catch (IllegalStateException e10) {
                            zzbtq.zza(baseAdView.getContext()).zzh(e10, "BaseAdView.loadAd");
                        }
                    }
                });
                return;
            }
        }
        this.f10035a.c(adRequest.f10013a);
    }

    public final void c() {
        zzbbw.zza(getContext());
        if (((Boolean) zzbdq.zzg.zze()).booleanValue()) {
            if (((Boolean) zzba.f10115d.c.zza(zzbbw.zzkj)).booleanValue()) {
                com.google.android.gms.ads.internal.util.client.zzb.f10350b.execute(new Runnable() { // from class: com.google.android.gms.ads.zze
                    @Override // java.lang.Runnable
                    public final void run() {
                        BaseAdView baseAdView = BaseAdView.this;
                        try {
                            zzea zzeaVar = baseAdView.f10035a;
                            zzeaVar.getClass();
                            try {
                                zzbu zzbuVar = zzeaVar.f10157i;
                                if (zzbuVar != null) {
                                    zzbuVar.zzz();
                                }
                            } catch (RemoteException e10) {
                                zzm.f("#007 Could not call remote method.", e10);
                            }
                        } catch (IllegalStateException e11) {
                            zzbtq.zza(baseAdView.getContext()).zzh(e11, "BaseAdView.pause");
                        }
                    }
                });
                return;
            }
        }
        zzea zzeaVar = this.f10035a;
        zzeaVar.getClass();
        try {
            zzbu zzbuVar = zzeaVar.f10157i;
            if (zzbuVar != null) {
                zzbuVar.zzz();
            }
        } catch (RemoteException e10) {
            zzm.f("#007 Could not call remote method.", e10);
        }
    }

    public final void d() {
        zzbbw.zza(getContext());
        if (((Boolean) zzbdq.zzh.zze()).booleanValue()) {
            if (((Boolean) zzba.f10115d.c.zza(zzbbw.zzkh)).booleanValue()) {
                com.google.android.gms.ads.internal.util.client.zzb.f10350b.execute(new Runnable() { // from class: com.google.android.gms.ads.zzc
                    @Override // java.lang.Runnable
                    public final void run() {
                        BaseAdView baseAdView = BaseAdView.this;
                        try {
                            zzea zzeaVar = baseAdView.f10035a;
                            zzeaVar.getClass();
                            try {
                                zzbu zzbuVar = zzeaVar.f10157i;
                                if (zzbuVar != null) {
                                    zzbuVar.zzB();
                                }
                            } catch (RemoteException e10) {
                                zzm.f("#007 Could not call remote method.", e10);
                            }
                        } catch (IllegalStateException e11) {
                            zzbtq.zza(baseAdView.getContext()).zzh(e11, "BaseAdView.resume");
                        }
                    }
                });
                return;
            }
        }
        zzea zzeaVar = this.f10035a;
        zzeaVar.getClass();
        try {
            zzbu zzbuVar = zzeaVar.f10157i;
            if (zzbuVar != null) {
                zzbuVar.zzB();
            }
        } catch (RemoteException e10) {
            zzm.f("#007 Could not call remote method.", e10);
        }
    }

    public AdListener getAdListener() {
        return this.f10035a.f10154f;
    }

    public AdSize getAdSize() {
        return this.f10035a.b();
    }

    public String getAdUnitId() {
        zzbu zzbuVar;
        zzea zzeaVar = this.f10035a;
        if (zzeaVar.f10159k == null && (zzbuVar = zzeaVar.f10157i) != null) {
            try {
                zzeaVar.f10159k = zzbuVar.zzr();
            } catch (RemoteException e10) {
                zzm.f("#007 Could not call remote method.", e10);
            }
        }
        return zzeaVar.f10159k;
    }

    public OnPaidEventListener getOnPaidEventListener() {
        return this.f10035a.f10163o;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0018  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.google.android.gms.ads.ResponseInfo getResponseInfo() {
        /*
            r3 = this;
            com.google.android.gms.ads.internal.client.zzea r0 = r3.f10035a
            r0.getClass()
            r1 = 0
            com.google.android.gms.ads.internal.client.zzbu r0 = r0.f10157i     // Catch: android.os.RemoteException -> Lf
            if (r0 == 0) goto L15
            com.google.android.gms.ads.internal.client.zzdn r0 = r0.zzk()     // Catch: android.os.RemoteException -> Lf
            goto L16
        Lf:
            r0 = move-exception
            java.lang.String r2 = "#007 Could not call remote method."
            com.google.android.gms.ads.internal.util.client.zzm.f(r2, r0)
        L15:
            r0 = r1
        L16:
            if (r0 == 0) goto L1d
            com.google.android.gms.ads.ResponseInfo r1 = new com.google.android.gms.ads.ResponseInfo
            r1.<init>(r0)
        L1d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.BaseAdView.getResponseInfo():com.google.android.gms.ads.ResponseInfo");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        View childAt = getChildAt(0);
        if (childAt != null && childAt.getVisibility() != 8) {
            int measuredWidth = childAt.getMeasuredWidth();
            int measuredHeight = childAt.getMeasuredHeight();
            int i14 = ((i12 - i10) - measuredWidth) / 2;
            int i15 = ((i13 - i11) - measuredHeight) / 2;
            childAt.layout(i14, i15, measuredWidth + i14, measuredHeight + i15);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        AdSize adSize;
        int i12;
        int i13 = 0;
        View childAt = getChildAt(0);
        if (childAt != null && childAt.getVisibility() != 8) {
            measureChild(childAt, i10, i11);
            i13 = childAt.getMeasuredWidth();
            i12 = childAt.getMeasuredHeight();
        } else {
            try {
                adSize = getAdSize();
            } catch (NullPointerException unused) {
                zzm.g(6);
                adSize = null;
            }
            if (adSize != null) {
                Context context = getContext();
                int d10 = adSize.d(context);
                i12 = adSize.b(context);
                i13 = d10;
            } else {
                i12 = 0;
            }
        }
        setMeasuredDimension(View.resolveSize(Math.max(i13, getSuggestedMinimumWidth()), i10), View.resolveSize(Math.max(i12, getSuggestedMinimumHeight()), i11));
    }

    public void setAdListener(AdListener adListener) {
        zzea zzeaVar = this.f10035a;
        zzeaVar.f10154f = adListener;
        o oVar = zzeaVar.f10152d;
        synchronized (oVar.f10112a) {
            oVar.f10113b = adListener;
        }
        if (adListener == null) {
            try {
                zzeaVar.f10153e = null;
                zzbu zzbuVar = zzeaVar.f10157i;
                if (zzbuVar != null) {
                    zzbuVar.zzC(null);
                    return;
                }
                return;
            } catch (RemoteException e10) {
                zzm.f("#007 Could not call remote method.", e10);
                return;
            }
        }
        if (adListener instanceof com.google.android.gms.ads.internal.client.zza) {
            com.google.android.gms.ads.internal.client.zza zzaVar = (com.google.android.gms.ads.internal.client.zza) adListener;
            try {
                zzeaVar.f10153e = zzaVar;
                zzbu zzbuVar2 = zzeaVar.f10157i;
                if (zzbuVar2 != null) {
                    zzbuVar2.zzC(new com.google.android.gms.ads.internal.client.zzb(zzaVar));
                }
            } catch (RemoteException e11) {
                zzm.f("#007 Could not call remote method.", e11);
            }
        }
        if (adListener instanceof AppEventListener) {
            AppEventListener appEventListener = (AppEventListener) adListener;
            try {
                zzeaVar.f10156h = appEventListener;
                zzbu zzbuVar3 = zzeaVar.f10157i;
                if (zzbuVar3 != null) {
                    zzbuVar3.zzG(new zzayk(appEventListener));
                }
            } catch (RemoteException e12) {
                zzm.f("#007 Could not call remote method.", e12);
            }
        }
    }

    public void setAdSize(AdSize adSize) {
        AdSize[] adSizeArr = {adSize};
        zzea zzeaVar = this.f10035a;
        if (zzeaVar.f10155g == null) {
            zzeaVar.d(adSizeArr);
            return;
        }
        throw new IllegalStateException("The ad size can only be set once on AdView.");
    }

    public void setAdUnitId(String str) {
        zzea zzeaVar = this.f10035a;
        if (zzeaVar.f10159k == null) {
            zzeaVar.f10159k = str;
            return;
        }
        throw new IllegalStateException("The ad unit ID can only be set once on AdView.");
    }

    public void setOnPaidEventListener(OnPaidEventListener onPaidEventListener) {
        zzea zzeaVar = this.f10035a;
        zzeaVar.getClass();
        try {
            zzeaVar.f10163o = onPaidEventListener;
            zzbu zzbuVar = zzeaVar.f10157i;
            if (zzbuVar != null) {
                zzbuVar.zzP(new zzfe(onPaidEventListener));
            }
        } catch (RemoteException e10) {
            zzm.f("#007 Could not call remote method.", e10);
        }
    }

    public BaseAdView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10035a = new zzea((ViewGroup) this, attributeSet, false, 0);
    }

    public BaseAdView(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10);
        this.f10035a = new zzea((ViewGroup) this, attributeSet, false, 0);
    }

    public BaseAdView(Context context, AttributeSet attributeSet, int i10, Object obj) {
        super(context, attributeSet, i10);
        this.f10035a = new zzea((ViewGroup) this, attributeSet, true, 0);
    }

    public BaseAdView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet);
        this.f10035a = new zzea(this, attributeSet, true);
    }
}
