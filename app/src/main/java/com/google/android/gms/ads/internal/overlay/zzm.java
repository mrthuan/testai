package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.Toolbar;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzf;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbbn;
import com.google.android.gms.internal.ads.zzbbw;
import com.google.android.gms.internal.ads.zzbrq;
import com.google.android.gms.internal.ads.zzbsg;
import com.google.android.gms.internal.ads.zzbsm;
import com.google.android.gms.internal.ads.zzcej;
import com.google.android.gms.internal.ads.zzedt;
import com.google.android.gms.internal.ads.zzedu;
import com.google.android.gms.internal.ads.zzeem;
import com.google.android.gms.internal.ads.zzeeo;
import java.util.Collections;
import l7.a;
import l7.b;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes.dex */
public class zzm extends zzbsm implements zzae {

    /* renamed from: w  reason: collision with root package name */
    public static final int f10307w = Color.argb(0, 0, 0, 0);

    /* renamed from: a  reason: collision with root package name */
    public final Activity f10308a;

    /* renamed from: b  reason: collision with root package name */
    public AdOverlayInfoParcel f10309b;
    public zzcej c;

    /* renamed from: d  reason: collision with root package name */
    public zzi f10310d;

    /* renamed from: e  reason: collision with root package name */
    public zzs f10311e;

    /* renamed from: g  reason: collision with root package name */
    public FrameLayout f10313g;

    /* renamed from: h  reason: collision with root package name */
    public WebChromeClient.CustomViewCallback f10314h;

    /* renamed from: k  reason: collision with root package name */
    public b f10317k;

    /* renamed from: o  reason: collision with root package name */
    public zzd f10321o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f10322p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f10323q;

    /* renamed from: u  reason: collision with root package name */
    public Toolbar f10327u;

    /* renamed from: f  reason: collision with root package name */
    public boolean f10312f = false;

    /* renamed from: i  reason: collision with root package name */
    public boolean f10315i = false;

    /* renamed from: j  reason: collision with root package name */
    public boolean f10316j = false;

    /* renamed from: l  reason: collision with root package name */
    public boolean f10318l = false;

    /* renamed from: v  reason: collision with root package name */
    public int f10328v = 1;

    /* renamed from: m  reason: collision with root package name */
    public final Object f10319m = new Object();

    /* renamed from: n  reason: collision with root package name */
    public final a f10320n = new a(this);

    /* renamed from: r  reason: collision with root package name */
    public boolean f10324r = false;

    /* renamed from: s  reason: collision with root package name */
    public boolean f10325s = false;

    /* renamed from: t  reason: collision with root package name */
    public boolean f10326t = true;

    public zzm(Activity activity) {
        this.f10308a = activity;
    }

    public static final void O0(View view, zzeeo zzeeoVar) {
        if (zzeeoVar != null && view != null) {
            if (!((Boolean) zzba.f10115d.c.zza(zzbbw.zzeB)).booleanValue() || !zzeeoVar.zzb()) {
                com.google.android.gms.ads.internal.zzu.B.f10573w.zzj(zzeeoVar.zza(), view);
            }
        }
    }

    public final void K(int i10) {
        Activity activity = this.f10308a;
        int i11 = activity.getApplicationInfo().targetSdkVersion;
        zzbbn zzbbnVar = zzbbw.zzfq;
        zzba zzbaVar = zzba.f10115d;
        if (i11 >= ((Integer) zzbaVar.c.zza(zzbbnVar)).intValue()) {
            if (activity.getApplicationInfo().targetSdkVersion <= ((Integer) zzbaVar.c.zza(zzbbw.zzfr)).intValue()) {
                int i12 = Build.VERSION.SDK_INT;
                if (i12 >= ((Integer) zzbaVar.c.zza(zzbbw.zzfs)).intValue()) {
                    if (i12 <= ((Integer) zzbaVar.c.zza(zzbbw.zzft)).intValue()) {
                        return;
                    }
                }
            }
        }
        try {
            activity.setRequestedOrientation(i10);
        } catch (Throwable th2) {
            com.google.android.gms.ads.internal.zzu.B.f10557g.zzv(th2, "AdOverlay.setRequestedOrientation");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x009d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void L0(boolean r45) {
        /*
            Method dump skipped, instructions count: 698
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.overlay.zzm.L0(boolean):void");
    }

    public final void M0(ViewGroup viewGroup) {
        zzeeo zzQ;
        zzeem zzP;
        zzbbn zzbbnVar = zzbbw.zzeC;
        zzba zzbaVar = zzba.f10115d;
        if (((Boolean) zzbaVar.c.zza(zzbbnVar)).booleanValue() && (zzP = this.c.zzP()) != null) {
            zzP.zza(viewGroup);
        } else if (((Boolean) zzbaVar.c.zza(zzbbw.zzeB)).booleanValue() && (zzQ = this.c.zzQ()) != null && zzQ.zzb()) {
            com.google.android.gms.ads.internal.zzu.B.f10573w.zzg(zzQ.zza(), viewGroup);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0031, code lost:
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(com.google.android.gms.internal.ads.zzbbw.zzax)).booleanValue() != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0045, code lost:
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(com.google.android.gms.internal.ads.zzbbw.zzaw)).booleanValue() != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0048, code lost:
        r1 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void N0(android.content.res.Configuration r6) {
        /*
            r5 = this;
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r0 = r5.f10309b
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L10
            com.google.android.gms.ads.internal.zzk r0 = r0.f10282o
            if (r0 == 0) goto L10
            boolean r0 = r0.f10537b
            if (r0 == 0) goto L10
            r0 = r1
            goto L11
        L10:
            r0 = r2
        L11:
            com.google.android.gms.ads.internal.zzu r3 = com.google.android.gms.ads.internal.zzu.B
            com.google.android.gms.ads.internal.util.zzu r3 = r3.f10555e
            android.app.Activity r4 = r5.f10308a
            boolean r6 = r3.a(r4, r6)
            boolean r3 = r5.f10316j
            if (r3 == 0) goto L33
            if (r0 != 0) goto L33
            com.google.android.gms.internal.ads.zzbbn r0 = com.google.android.gms.internal.ads.zzbbw.zzax
            com.google.android.gms.ads.internal.client.zzba r3 = com.google.android.gms.ads.internal.client.zzba.f10115d
            com.google.android.gms.internal.ads.zzbbu r3 = r3.c
            java.lang.Object r0 = r3.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L48
        L33:
            if (r6 == 0) goto L4a
            com.google.android.gms.internal.ads.zzbbn r6 = com.google.android.gms.internal.ads.zzbbw.zzaw
            com.google.android.gms.ads.internal.client.zzba r0 = com.google.android.gms.ads.internal.client.zzba.f10115d
            com.google.android.gms.internal.ads.zzbbu r0 = r0.c
            java.lang.Object r6 = r0.zza(r6)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L48
            goto L4a
        L48:
            r1 = r2
            goto L57
        L4a:
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r6 = r5.f10309b
            if (r6 == 0) goto L57
            com.google.android.gms.ads.internal.zzk r6 = r6.f10282o
            if (r6 == 0) goto L57
            boolean r6 = r6.f10541g
            if (r6 == 0) goto L57
            r2 = r1
        L57:
            android.view.Window r6 = r4.getWindow()
            com.google.android.gms.internal.ads.zzbbn r0 = com.google.android.gms.internal.ads.zzbbw.zzaV
            com.google.android.gms.ads.internal.client.zzba r3 = com.google.android.gms.ads.internal.client.zzba.f10115d
            com.google.android.gms.internal.ads.zzbbu r3 = r3.c
            java.lang.Object r0 = r3.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L81
            android.view.View r6 = r6.getDecorView()
            if (r1 == 0) goto L7b
            if (r2 == 0) goto L78
            r0 = 5894(0x1706, float:8.259E-42)
            goto L7d
        L78:
            r0 = 5380(0x1504, float:7.539E-42)
            goto L7d
        L7b:
            r0 = 256(0x100, float:3.59E-43)
        L7d:
            r6.setSystemUiVisibility(r0)
            return
        L81:
            r0 = 1024(0x400, float:1.435E-42)
            r3 = 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L99
            r6.addFlags(r0)
            r6.clearFlags(r3)
            if (r2 == 0) goto L98
            android.view.View r6 = r6.getDecorView()
            r0 = 4098(0x1002, float:5.743E-42)
            r6.setSystemUiVisibility(r0)
        L98:
            return
        L99:
            r6.addFlags(r3)
            r6.clearFlags(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.overlay.zzm.N0(android.content.res.Configuration):void");
    }

    public final void P0(zzedu zzeduVar) {
        zzbsg zzbsgVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.f10309b;
        if (adOverlayInfoParcel != null && (zzbsgVar = adOverlayInfoParcel.f10289v) != null) {
            zzbsgVar.zzg(new ObjectWrapper(zzeduVar));
            return;
        }
        throw new zzg("noioou");
    }

    public final void Q0(boolean z10) {
        boolean z11;
        int i10;
        int i11;
        if (this.f10309b.f10290w) {
            return;
        }
        zzbbn zzbbnVar = zzbbw.zzes;
        zzba zzbaVar = zzba.f10115d;
        int intValue = ((Integer) zzbaVar.c.zza(zzbbnVar)).intValue();
        int i12 = 0;
        if (!((Boolean) zzbaVar.c.zza(zzbbw.zzaR)).booleanValue() && !z10) {
            z11 = false;
        } else {
            z11 = true;
        }
        zzr zzrVar = new zzr();
        zzrVar.f10331d = 50;
        if (true != z11) {
            i10 = 0;
        } else {
            i10 = intValue;
        }
        zzrVar.f10329a = i10;
        if (true != z11) {
            i12 = intValue;
        }
        zzrVar.f10330b = i12;
        zzrVar.c = intValue;
        this.f10311e = new zzs(this.f10308a, zzrVar, this);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(10);
        if (true != z11) {
            i11 = 9;
        } else {
            i11 = 11;
        }
        layoutParams.addRule(i11);
        R0(z10, this.f10309b.f10274g);
        this.f10317k.addView(this.f10311e, layoutParams);
        M0(this.f10311e);
    }

    public final void R0(boolean z10, boolean z11) {
        boolean z12;
        boolean z13;
        AdOverlayInfoParcel adOverlayInfoParcel;
        com.google.android.gms.ads.internal.zzk zzkVar;
        AdOverlayInfoParcel adOverlayInfoParcel2;
        com.google.android.gms.ads.internal.zzk zzkVar2;
        zzbbn zzbbnVar = zzbbw.zzaP;
        zzba zzbaVar = zzba.f10115d;
        boolean z14 = true;
        if (((Boolean) zzbaVar.c.zza(zzbbnVar)).booleanValue() && (adOverlayInfoParcel2 = this.f10309b) != null && (zzkVar2 = adOverlayInfoParcel2.f10282o) != null && zzkVar2.f10542h) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (((Boolean) zzbaVar.c.zza(zzbbw.zzaQ)).booleanValue() && (adOverlayInfoParcel = this.f10309b) != null && (zzkVar = adOverlayInfoParcel.f10282o) != null && zzkVar.f10543i) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (z10 && z11 && z12 && !z13) {
            new zzbrq(this.c, "useCustomClose").zzh("Custom close has been disabled for interstitial ads in this ad slot.");
        }
        zzs zzsVar = this.f10311e;
        if (zzsVar != null) {
            if (!z13 && (!z11 || z12)) {
                z14 = false;
            }
            ImageButton imageButton = zzsVar.f10332a;
            if (z14) {
                imageButton.setVisibility(8);
                if (((Long) zzbaVar.c.zza(zzbbw.zzaT)).longValue() > 0) {
                    imageButton.animate().cancel();
                    imageButton.clearAnimation();
                    return;
                }
                return;
            }
            imageButton.setVisibility(0);
        }
    }

    public final void zzE() {
        synchronized (this.f10319m) {
            this.f10322p = true;
            zzd zzdVar = this.f10321o;
            if (zzdVar != null) {
                zzf zzfVar = com.google.android.gms.ads.internal.util.zzt.f10496l;
                zzfVar.removeCallbacks(zzdVar);
                zzfVar.post(this.f10321o);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [com.google.android.gms.ads.internal.overlay.zzd, java.lang.Runnable] */
    public final void zzF() {
        AdOverlayInfoParcel adOverlayInfoParcel;
        zzp zzpVar;
        if (this.f10308a.isFinishing() && !this.f10324r) {
            this.f10324r = true;
            zzcej zzcejVar = this.c;
            if (zzcejVar != null) {
                zzcejVar.zzZ(this.f10328v - 1);
                synchronized (this.f10319m) {
                    try {
                        if (!this.f10322p && this.c.zzaC()) {
                            zzbbn zzbbnVar = zzbbw.zzen;
                            zzba zzbaVar = zzba.f10115d;
                            if (((Boolean) zzbaVar.c.zza(zzbbnVar)).booleanValue() && !this.f10325s && (adOverlayInfoParcel = this.f10309b) != null && (zzpVar = adOverlayInfoParcel.c) != null) {
                                zzpVar.zzdq();
                            }
                            ?? r12 = new Runnable() { // from class: com.google.android.gms.ads.internal.overlay.zzd
                                @Override // java.lang.Runnable
                                public final void run() {
                                    zzm.this.zzc();
                                }
                            };
                            this.f10321o = r12;
                            com.google.android.gms.ads.internal.util.zzt.f10496l.postDelayed(r12, ((Long) zzbaVar.c.zza(zzbbw.zzaO)).longValue());
                            return;
                        }
                    } finally {
                    }
                }
            }
            zzc();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbsn
    public final boolean zzH() {
        this.f10328v = 1;
        if (this.c == null) {
            return true;
        }
        if (((Boolean) zzba.f10115d.c.zza(zzbbw.zzia)).booleanValue() && this.c.canGoBack()) {
            this.c.goBack();
            return false;
        }
        boolean zzaH = this.c.zzaH();
        if (!zzaH) {
            this.c.zzd("onbackblocked", Collections.emptyMap());
        }
        return zzaH;
    }

    public final void zzb() {
        this.f10328v = 3;
        Activity activity = this.f10308a;
        activity.finish();
        AdOverlayInfoParcel adOverlayInfoParcel = this.f10309b;
        if (adOverlayInfoParcel != null && adOverlayInfoParcel.f10278k == 5) {
            activity.overridePendingTransition(0, 0);
        }
    }

    public final void zzc() {
        zzcej zzcejVar;
        zzp zzpVar;
        if (!this.f10325s) {
            this.f10325s = true;
            zzcej zzcejVar2 = this.c;
            if (zzcejVar2 != null) {
                this.f10317k.removeView(zzcejVar2.zzF());
                zzi zziVar = this.f10310d;
                if (zziVar != null) {
                    this.c.zzan(zziVar.f10304d);
                    this.c.zzaq(false);
                    if (((Boolean) zzba.f10115d.c.zza(zzbbw.zzlJ)).booleanValue() && this.c.getParent() != null) {
                        ((ViewGroup) this.c.getParent()).removeView(this.c.zzF());
                    }
                    ViewGroup viewGroup = this.f10310d.c;
                    View zzF = this.c.zzF();
                    zzi zziVar2 = this.f10310d;
                    viewGroup.addView(zzF, zziVar2.f10302a, zziVar2.f10303b);
                    this.f10310d = null;
                } else {
                    Activity activity = this.f10308a;
                    if (activity.getApplicationContext() != null) {
                        this.c.zzan(activity.getApplicationContext());
                    }
                }
                this.c = null;
            }
            AdOverlayInfoParcel adOverlayInfoParcel = this.f10309b;
            if (adOverlayInfoParcel != null && (zzpVar = adOverlayInfoParcel.c) != null) {
                zzpVar.zzdu(this.f10328v);
            }
            AdOverlayInfoParcel adOverlayInfoParcel2 = this.f10309b;
            if (adOverlayInfoParcel2 != null && (zzcejVar = adOverlayInfoParcel2.f10271d) != null) {
                O0(this.f10309b.f10271d.zzF(), zzcejVar.zzQ());
            }
        }
    }

    public final void zzg() {
        AdOverlayInfoParcel adOverlayInfoParcel = this.f10309b;
        if (adOverlayInfoParcel != null && this.f10312f) {
            K(adOverlayInfoParcel.f10277j);
        }
        if (this.f10313g != null) {
            this.f10308a.setContentView(this.f10317k);
            this.f10323q = true;
            this.f10313g.removeAllViews();
            this.f10313g = null;
        }
        WebChromeClient.CustomViewCallback customViewCallback = this.f10314h;
        if (customViewCallback != null) {
            customViewCallback.onCustomViewHidden();
            this.f10314h = null;
        }
        this.f10312f = false;
    }

    @Override // com.google.android.gms.internal.ads.zzbsn
    public final void zzi() {
        this.f10328v = 1;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzae
    public final void zzj() {
        this.f10328v = 2;
        this.f10308a.finish();
    }

    @Override // com.google.android.gms.internal.ads.zzbsn
    public final void zzk(IObjectWrapper iObjectWrapper) {
        N0((Configuration) ObjectWrapper.L0(iObjectWrapper));
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x009a A[Catch: zzg -> 0x011a, TryCatch #1 {zzg -> 0x011a, blocks: (B:12:0x001b, B:16:0x0038, B:18:0x003c, B:20:0x0040, B:22:0x0046, B:23:0x004a, B:24:0x0053, B:26:0x005e, B:27:0x0060, B:29:0x0066, B:30:0x0072, B:33:0x007b, B:39:0x0088, B:41:0x008d, B:44:0x009a, B:46:0x009e, B:48:0x00a4, B:49:0x00a7, B:51:0x00ad, B:52:0x00b0, B:54:0x00b6, B:56:0x00ba, B:57:0x00bd, B:59:0x00c3, B:60:0x00c6, B:67:0x00f1, B:69:0x00f5, B:70:0x00fc, B:71:0x00fd, B:73:0x0101, B:75:0x010e, B:37:0x0084, B:42:0x0096, B:77:0x0112, B:78:0x0119), top: B:84:0x001b }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x010e A[Catch: zzg -> 0x011a, TryCatch #1 {zzg -> 0x011a, blocks: (B:12:0x001b, B:16:0x0038, B:18:0x003c, B:20:0x0040, B:22:0x0046, B:23:0x004a, B:24:0x0053, B:26:0x005e, B:27:0x0060, B:29:0x0066, B:30:0x0072, B:33:0x007b, B:39:0x0088, B:41:0x008d, B:44:0x009a, B:46:0x009e, B:48:0x00a4, B:49:0x00a7, B:51:0x00ad, B:52:0x00b0, B:54:0x00b6, B:56:0x00ba, B:57:0x00bd, B:59:0x00c3, B:60:0x00c6, B:67:0x00f1, B:69:0x00f5, B:70:0x00fc, B:71:0x00fd, B:73:0x0101, B:75:0x010e, B:37:0x0084, B:42:0x0096, B:77:0x0112, B:78:0x0119), top: B:84:0x001b }] */
    @Override // com.google.android.gms.internal.ads.zzbsn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void zzl(android.os.Bundle r9) {
        /*
            Method dump skipped, instructions count: 296
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.overlay.zzm.zzl(android.os.Bundle):void");
    }

    @Override // com.google.android.gms.internal.ads.zzbsn
    public final void zzm() {
        zzcej zzcejVar = this.c;
        if (zzcejVar != null) {
            try {
                this.f10317k.removeView(zzcejVar.zzF());
            } catch (NullPointerException unused) {
            }
        }
        zzF();
    }

    @Override // com.google.android.gms.internal.ads.zzbsn
    public final void zzo() {
        zzp zzpVar;
        zzg();
        AdOverlayInfoParcel adOverlayInfoParcel = this.f10309b;
        if (adOverlayInfoParcel != null && (zzpVar = adOverlayInfoParcel.c) != null) {
            zzpVar.zzdk();
        }
        if (!((Boolean) zzba.f10115d.c.zza(zzbbw.zzep)).booleanValue() && this.c != null && (!this.f10308a.isFinishing() || this.f10310d == null)) {
            this.c.onPause();
        }
        zzF();
    }

    @Override // com.google.android.gms.internal.ads.zzbsn
    public final void zzp(int i10, String[] strArr, int[] iArr) {
        zzm zzmVar;
        if (i10 == 12345) {
            zzedt zze = zzedu.zze();
            zze.zza(this.f10308a);
            if (this.f10309b.f10278k == 5) {
                zzmVar = this;
            } else {
                zzmVar = null;
            }
            zze.zzb(zzmVar);
            try {
                this.f10309b.f10289v.zzf(strArr, iArr, new ObjectWrapper(zze.zze()));
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbsn
    public final void zzr() {
        zzp zzpVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.f10309b;
        if (adOverlayInfoParcel != null && (zzpVar = adOverlayInfoParcel.c) != null) {
            zzpVar.zzdH();
        }
        N0(this.f10308a.getResources().getConfiguration());
        if (!((Boolean) zzba.f10115d.c.zza(zzbbw.zzep)).booleanValue()) {
            zzcej zzcejVar = this.c;
            if (zzcejVar != null && !zzcejVar.zzaE()) {
                this.c.onResume();
            } else {
                com.google.android.gms.ads.internal.util.client.zzm.e("The webview does not exist. Ignoring action.");
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbsn
    public final void zzs(Bundle bundle) {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.f10315i);
    }

    @Override // com.google.android.gms.internal.ads.zzbsn
    public final void zzt() {
        if (((Boolean) zzba.f10115d.c.zza(zzbbw.zzep)).booleanValue()) {
            zzcej zzcejVar = this.c;
            if (zzcejVar != null && !zzcejVar.zzaE()) {
                this.c.onResume();
            } else {
                com.google.android.gms.ads.internal.util.client.zzm.e("The webview does not exist. Ignoring action.");
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbsn
    public final void zzu() {
        if (((Boolean) zzba.f10115d.c.zza(zzbbw.zzep)).booleanValue() && this.c != null && (!this.f10308a.isFinishing() || this.f10310d == null)) {
            this.c.onPause();
        }
        zzF();
    }

    @Override // com.google.android.gms.internal.ads.zzbsn
    public final void zzv() {
        zzp zzpVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.f10309b;
        if (adOverlayInfoParcel != null && (zzpVar = adOverlayInfoParcel.c) != null) {
            zzpVar.zzdt();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbsn
    public final void zzx() {
        this.f10323q = true;
    }

    @Override // com.google.android.gms.internal.ads.zzbsn
    public final void zzq() {
    }

    @Override // com.google.android.gms.internal.ads.zzbsn
    public final void zzh(int i10, int i11, Intent intent) {
    }
}
