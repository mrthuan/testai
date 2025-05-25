package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzayk;
import com.google.android.gms.internal.ads.zzbbw;
import com.google.android.gms.internal.ads.zzbdq;
import com.google.android.gms.internal.ads.zzboi;
import java.util.concurrent.atomic.AtomicBoolean;
import k7.f;
import k7.h;
import k7.o;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes.dex */
public final class zzea {

    /* renamed from: a  reason: collision with root package name */
    public final zzboi f10150a;

    /* renamed from: b  reason: collision with root package name */
    public final zzp f10151b;
    public final VideoController c;

    /* renamed from: d  reason: collision with root package name */
    public final o f10152d;

    /* renamed from: e  reason: collision with root package name */
    public zza f10153e;

    /* renamed from: f  reason: collision with root package name */
    public AdListener f10154f;

    /* renamed from: g  reason: collision with root package name */
    public AdSize[] f10155g;

    /* renamed from: h  reason: collision with root package name */
    public AppEventListener f10156h;

    /* renamed from: i  reason: collision with root package name */
    public zzbu f10157i;

    /* renamed from: j  reason: collision with root package name */
    public VideoOptions f10158j;

    /* renamed from: k  reason: collision with root package name */
    public String f10159k;

    /* renamed from: l  reason: collision with root package name */
    public final ViewGroup f10160l;

    /* renamed from: m  reason: collision with root package name */
    public final int f10161m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f10162n;

    /* renamed from: o  reason: collision with root package name */
    public OnPaidEventListener f10163o;

    public zzea(ViewGroup viewGroup, AttributeSet attributeSet, boolean z10) {
        this(viewGroup, attributeSet, z10, zzp.f10237a);
    }

    public static zzq a(Context context, AdSize[] adSizeArr, int i10) {
        boolean z10 = false;
        for (AdSize adSize : adSizeArr) {
            if (adSize.equals(AdSize.f10022q)) {
                return new zzq("invalid", 0, 0, false, 0, 0, null, false, false, false, true, false, false, false, false);
            }
        }
        zzq zzqVar = new zzq(context, adSizeArr);
        if (i10 == 1) {
            z10 = true;
        }
        zzqVar.f10246j = z10;
        return zzqVar;
    }

    public final AdSize b() {
        zzq zzg;
        try {
            zzbu zzbuVar = this.f10157i;
            if (zzbuVar != null && (zzg = zzbuVar.zzg()) != null) {
                return new AdSize(zzg.f10241e, zzg.f10239b, zzg.f10238a);
            }
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzm.f("#007 Could not call remote method.", e10);
        }
        AdSize[] adSizeArr = this.f10155g;
        if (adSizeArr != null) {
            return adSizeArr[0];
        }
        return null;
    }

    public final void c(zzdx zzdxVar) {
        zzbu zzbuVar;
        try {
            long currentTimeMillis = System.currentTimeMillis();
            zzbu zzbuVar2 = this.f10157i;
            ViewGroup viewGroup = this.f10160l;
            if (zzbuVar2 == null) {
                if (this.f10155g != null && this.f10159k != null) {
                    Context context = viewGroup.getContext();
                    zzq a10 = a(context, this.f10155g, this.f10161m);
                    if ("search_v2".equals(a10.f10238a)) {
                        zzbuVar = (zzbu) new h(zzay.f10107f.f10109b, context, a10, this.f10159k).d(context, false);
                    } else {
                        zzbuVar = (zzbu) new f(zzay.f10107f.f10109b, context, a10, this.f10159k, this.f10150a).d(context, false);
                    }
                    this.f10157i = zzbuVar;
                    zzbuVar.zzD(new zzg(this.f10152d));
                    zza zzaVar = this.f10153e;
                    if (zzaVar != null) {
                        this.f10157i.zzC(new zzb(zzaVar));
                    }
                    AppEventListener appEventListener = this.f10156h;
                    if (appEventListener != null) {
                        this.f10157i.zzG(new zzayk(appEventListener));
                    }
                    if (this.f10158j != null) {
                        this.f10157i.zzU(new zzfk(this.f10158j));
                    }
                    this.f10157i.zzP(new zzfe(this.f10163o));
                    this.f10157i.zzN(this.f10162n);
                    zzbu zzbuVar3 = this.f10157i;
                    if (zzbuVar3 != null) {
                        try {
                            final IObjectWrapper zzn = zzbuVar3.zzn();
                            if (zzn != null) {
                                if (((Boolean) zzbdq.zzf.zze()).booleanValue()) {
                                    if (((Boolean) zzba.f10115d.c.zza(zzbbw.zzkl)).booleanValue()) {
                                        com.google.android.gms.ads.internal.util.client.zzf.f10351b.post(new Runnable() { // from class: com.google.android.gms.ads.internal.client.zzdy
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                zzea zzeaVar = zzea.this;
                                                zzeaVar.getClass();
                                                zzeaVar.f10160l.addView((View) ObjectWrapper.L0(zzn));
                                            }
                                        });
                                    }
                                }
                                viewGroup.addView((View) ObjectWrapper.L0(zzn));
                            }
                        } catch (RemoteException e10) {
                            com.google.android.gms.ads.internal.util.client.zzm.f("#007 Could not call remote method.", e10);
                        }
                    }
                } else {
                    throw new IllegalStateException("The ad size and ad unit ID must be set before loadAd is called.");
                }
            }
            if (zzdxVar != null) {
                zzdxVar.f10143k = currentTimeMillis;
            }
            zzbu zzbuVar4 = this.f10157i;
            zzbuVar4.getClass();
            zzp zzpVar = this.f10151b;
            Context context2 = viewGroup.getContext();
            zzpVar.getClass();
            zzbuVar4.zzab(zzp.a(context2, zzdxVar));
        } catch (RemoteException e11) {
            com.google.android.gms.ads.internal.util.client.zzm.f("#007 Could not call remote method.", e11);
        }
    }

    public final void d(AdSize... adSizeArr) {
        ViewGroup viewGroup = this.f10160l;
        this.f10155g = adSizeArr;
        try {
            zzbu zzbuVar = this.f10157i;
            if (zzbuVar != null) {
                zzbuVar.zzF(a(viewGroup.getContext(), this.f10155g, this.f10161m));
            }
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzm.f("#007 Could not call remote method.", e10);
        }
        viewGroup.requestLayout();
    }

    public zzea(ViewGroup viewGroup, AttributeSet attributeSet, boolean z10, int i10) {
        this(viewGroup, attributeSet, z10, zzp.f10237a);
    }

    public zzea(ViewGroup viewGroup, AttributeSet attributeSet, boolean z10, zzp zzpVar) {
        zzq zzqVar;
        this.f10150a = new zzboi();
        this.c = new VideoController();
        this.f10152d = new o(this);
        this.f10160l = viewGroup;
        this.f10151b = zzpVar;
        this.f10157i = null;
        new AtomicBoolean(false);
        this.f10161m = 0;
        if (attributeSet != null) {
            Context context = viewGroup.getContext();
            try {
                zzy zzyVar = new zzy(context, attributeSet);
                AdSize[] adSizeArr = zzyVar.f10263a;
                if (!z10 && adSizeArr.length != 1) {
                    throw new IllegalArgumentException("The adSizes XML attribute is only allowed on PublisherAdViews.");
                }
                this.f10155g = adSizeArr;
                this.f10159k = zzyVar.f10264b;
                if (viewGroup.isInEditMode()) {
                    com.google.android.gms.ads.internal.util.client.zzf zzfVar = zzay.f10107f.f10108a;
                    AdSize adSize = this.f10155g[0];
                    if (adSize.equals(AdSize.f10022q)) {
                        zzqVar = new zzq("invalid", 0, 0, false, 0, 0, null, false, false, false, true, false, false, false, false);
                    } else {
                        zzq zzqVar2 = new zzq(context, adSize);
                        zzqVar2.f10246j = false;
                        zzqVar = zzqVar2;
                    }
                    zzfVar.getClass();
                    com.google.android.gms.ads.internal.util.client.zzf.e(viewGroup, zzqVar, "Ads by Google", -16777216, -1);
                }
            } catch (IllegalArgumentException e10) {
                com.google.android.gms.ads.internal.util.client.zzf zzfVar2 = zzay.f10107f.f10108a;
                zzq zzqVar3 = new zzq(context, AdSize.f10014i);
                String message = e10.getMessage();
                String message2 = e10.getMessage();
                zzfVar2.getClass();
                if (message2 != null) {
                    com.google.android.gms.ads.internal.util.client.zzm.e(message2);
                }
                com.google.android.gms.ads.internal.util.client.zzf.e(viewGroup, zzqVar3, message, -65536, -16777216);
            }
        }
    }
}
