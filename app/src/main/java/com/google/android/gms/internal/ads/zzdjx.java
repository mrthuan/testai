package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzdjx extends zzbfg implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, zzdkx {
    public static final zzfxr zza = zzfxr.zzp("2011", "1009", "3010");
    private final String zzb;
    private FrameLayout zzd;
    private FrameLayout zze;
    private final zzgcu zzf;
    private View zzg;
    private zzdiw zzi;
    private zzaxx zzj;
    private zzbfa zzl;
    private boolean zzm;
    private GestureDetector zzo;
    private Map zzc = new HashMap();
    private IObjectWrapper zzk = null;
    private boolean zzn = false;
    private final int zzh = 242402000;

    public zzdjx(FrameLayout frameLayout, FrameLayout frameLayout2, int i10) {
        String str;
        this.zzd = frameLayout;
        this.zze = frameLayout2;
        String canonicalName = frameLayout.getClass().getCanonicalName();
        if ("com.google.android.gms.ads.formats.NativeContentAdView".equals(canonicalName)) {
            str = "1007";
        } else if ("com.google.android.gms.ads.formats.NativeAppInstallAdView".equals(canonicalName)) {
            str = "2009";
        } else {
            "com.google.android.gms.ads.formats.UnifiedNativeAdView".equals(canonicalName);
            str = "3012";
        }
        this.zzb = str;
        com.google.android.gms.ads.internal.zzu zzuVar = com.google.android.gms.ads.internal.zzu.B;
        zzcab zzcabVar = zzuVar.A;
        zzcab.zza(frameLayout, this);
        zzcab zzcabVar2 = zzuVar.A;
        zzcab.zzb(frameLayout, this);
        this.zzf = zzbzo.zze;
        this.zzj = new zzaxx(this.zzd.getContext(), this.zzd);
        frameLayout.setOnTouchListener(this);
        frameLayout.setOnClickListener(this);
    }

    private final synchronized void zzt(String str) {
        DisplayMetrics displayMetrics;
        View frameLayout = new FrameLayout(this.zze.getContext());
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        Context context = this.zze.getContext();
        frameLayout.setClickable(false);
        frameLayout.setFocusable(false);
        if (!TextUtils.isEmpty(str)) {
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            Resources resources = context.getResources();
            if (resources != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
                try {
                    byte[] decode = Base64.decode(str, 0);
                    BitmapDrawable bitmapDrawable = new BitmapDrawable(BitmapFactory.decodeByteArray(decode, 0, decode.length));
                    bitmapDrawable.setTargetDensity(displayMetrics.densityDpi);
                    Shader.TileMode tileMode = Shader.TileMode.REPEAT;
                    bitmapDrawable.setTileModeXY(tileMode, tileMode);
                    frameLayout.setBackground(bitmapDrawable);
                } catch (IllegalArgumentException unused) {
                    com.google.android.gms.ads.internal.util.client.zzm.g(5);
                }
            }
        }
        this.zze.addView(frameLayout);
    }

    private final synchronized void zzu() {
        this.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdjw
            @Override // java.lang.Runnable
            public final void run() {
                zzdjx.this.zzs();
            }
        });
    }

    private final synchronized void zzv() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzkE)).booleanValue() && this.zzi.zza() != 0) {
            this.zzo = new GestureDetector(this.zzd.getContext(), new zzdkd(this.zzi, this));
        }
    }

    @Override // android.view.View.OnClickListener
    public final synchronized void onClick(View view) {
        zzdiw zzdiwVar = this.zzi;
        if (zzdiwVar != null && zzdiwVar.zzU()) {
            this.zzi.zzv();
            this.zzi.zzD(view, this.zzd, zzl(), zzm(), false);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final synchronized void onGlobalLayout() {
        zzdiw zzdiwVar = this.zzi;
        if (zzdiwVar != null) {
            FrameLayout frameLayout = this.zzd;
            zzdiwVar.zzB(frameLayout, zzl(), zzm(), zzdiw.zzX(frameLayout));
        }
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final synchronized void onScrollChanged() {
        zzdiw zzdiwVar = this.zzi;
        if (zzdiwVar != null) {
            FrameLayout frameLayout = this.zzd;
            zzdiwVar.zzB(frameLayout, zzl(), zzm(), zzdiw.zzX(frameLayout));
        }
    }

    @Override // android.view.View.OnTouchListener
    public final synchronized boolean onTouch(View view, MotionEvent motionEvent) {
        zzdiw zzdiwVar = this.zzi;
        if (zzdiwVar != null) {
            zzdiwVar.zzK(view, motionEvent, this.zzd);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzkE)).booleanValue() && this.zzo != null && this.zzi.zza() != 0) {
                this.zzo.onTouchEvent(motionEvent);
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbfh
    public final synchronized IObjectWrapper zzb(String str) {
        return new ObjectWrapper(zzg(str));
    }

    @Override // com.google.android.gms.internal.ads.zzbfh
    public final synchronized void zzc() {
        if (this.zzn) {
            return;
        }
        zzdiw zzdiwVar = this.zzi;
        if (zzdiwVar != null) {
            zzdiwVar.zzS(this);
            this.zzi = null;
        }
        this.zzc.clear();
        this.zzd.removeAllViews();
        this.zze.removeAllViews();
        this.zzc = null;
        this.zzd = null;
        this.zze = null;
        this.zzg = null;
        this.zzj = null;
        this.zzn = true;
    }

    @Override // com.google.android.gms.internal.ads.zzbfh
    public final void zzd(IObjectWrapper iObjectWrapper) {
        onTouch(this.zzd, (MotionEvent) ObjectWrapper.L0(iObjectWrapper));
    }

    @Override // com.google.android.gms.internal.ads.zzbfh
    public final synchronized void zzdv(String str, IObjectWrapper iObjectWrapper) {
        zzq(str, (View) ObjectWrapper.L0(iObjectWrapper), true);
    }

    @Override // com.google.android.gms.internal.ads.zzbfh
    public final synchronized void zzdw(IObjectWrapper iObjectWrapper) {
        this.zzi.zzM((View) ObjectWrapper.L0(iObjectWrapper));
    }

    @Override // com.google.android.gms.internal.ads.zzbfh
    public final synchronized void zzdx(zzbfa zzbfaVar) {
        if (!this.zzn) {
            this.zzm = true;
            this.zzl = zzbfaVar;
            zzdiw zzdiwVar = this.zzi;
            if (zzdiwVar != null) {
                zzdiwVar.zzc().zzb(zzbfaVar);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbfh
    public final synchronized void zzdy(IObjectWrapper iObjectWrapper) {
        if (this.zzn) {
            return;
        }
        this.zzk = iObjectWrapper;
    }

    @Override // com.google.android.gms.internal.ads.zzbfh
    public final synchronized void zzdz(IObjectWrapper iObjectWrapper) {
        if (this.zzn) {
            return;
        }
        Object L0 = ObjectWrapper.L0(iObjectWrapper);
        if (!(L0 instanceof zzdiw)) {
            com.google.android.gms.ads.internal.util.client.zzm.e("Not an instance of native engine. This is most likely a transient error");
            return;
        }
        zzdiw zzdiwVar = this.zzi;
        if (zzdiwVar != null) {
            zzdiwVar.zzS(this);
        }
        zzu();
        zzdiw zzdiwVar2 = (zzdiw) L0;
        this.zzi = zzdiwVar2;
        zzdiwVar2.zzR(this);
        this.zzi.zzJ(this.zzd);
        this.zzi.zzu(this.zze);
        if (this.zzm) {
            this.zzi.zzc().zzb(this.zzl);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzdz)).booleanValue() && !TextUtils.isEmpty(this.zzi.zzg())) {
            zzt(this.zzi.zzg());
        }
        zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzbfh
    public final synchronized void zze(IObjectWrapper iObjectWrapper, int i10) {
    }

    @Override // com.google.android.gms.internal.ads.zzdkx
    public final /* synthetic */ View zzf() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzdkx
    public final synchronized View zzg(String str) {
        WeakReference weakReference;
        if (!this.zzn && (weakReference = (WeakReference) this.zzc.get(str)) != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdkx
    public final FrameLayout zzh() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzdkx
    public final zzaxx zzi() {
        return this.zzj;
    }

    @Override // com.google.android.gms.internal.ads.zzdkx
    public final IObjectWrapper zzj() {
        return this.zzk;
    }

    @Override // com.google.android.gms.internal.ads.zzdkx
    public final synchronized String zzk() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzdkx
    public final synchronized Map zzl() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzdkx
    public final synchronized Map zzm() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzdkx
    public final synchronized Map zzn() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdkx
    public final synchronized JSONObject zzo() {
        zzdiw zzdiwVar = this.zzi;
        if (zzdiwVar != null) {
            return zzdiwVar.zzi(this.zzd, zzl(), zzm());
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdkx
    public final synchronized JSONObject zzp() {
        zzdiw zzdiwVar = this.zzi;
        if (zzdiwVar != null) {
            return zzdiwVar.zzj(this.zzd, zzl(), zzm());
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdkx
    public final synchronized void zzq(String str, View view, boolean z10) {
        if (!this.zzn) {
            if (view == null) {
                this.zzc.remove(str);
                return;
            }
            this.zzc.put(str, new WeakReference(view));
            if (!"1098".equals(str) && !"3011".equals(str)) {
                if (com.google.android.gms.ads.internal.util.zzbv.h(this.zzh)) {
                    view.setOnTouchListener(this);
                }
                view.setClickable(true);
                view.setOnClickListener(this);
            }
        }
    }

    public final FrameLayout zzr() {
        return this.zzd;
    }

    public final /* synthetic */ void zzs() {
        if (this.zzg == null) {
            View view = new View(this.zzd.getContext());
            this.zzg = view;
            view.setLayoutParams(new FrameLayout.LayoutParams(-1, 0));
        }
        if (this.zzd != this.zzg.getParent()) {
            this.zzd.addView(this.zzg);
        }
    }
}
