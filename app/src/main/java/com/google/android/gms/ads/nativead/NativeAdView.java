package com.google.android.gms.ads.nativead;

import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.ads.MediaContent;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzep;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbbw;
import com.google.android.gms.internal.ads.zzbfh;
import k7.l;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes.dex */
public final class NativeAdView extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public final FrameLayout f10615a;

    /* renamed from: b  reason: collision with root package name */
    public final zzbfh f10616b;

    public NativeAdView(Context context) {
        super(context);
        this.f10615a = c(context);
        this.f10616b = d();
    }

    public final View a(String str) {
        zzbfh zzbfhVar = this.f10616b;
        if (zzbfhVar != null) {
            try {
                IObjectWrapper zzb = zzbfhVar.zzb(str);
                if (zzb != null) {
                    return (View) ObjectWrapper.L0(zzb);
                }
                return null;
            } catch (RemoteException unused) {
                zzm.g(6);
                return null;
            }
        }
        return null;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
        super.bringChildToFront(this.f10615a);
    }

    public final void b(MediaContent mediaContent) {
        zzbfh zzbfhVar = this.f10616b;
        if (zzbfhVar == null) {
            return;
        }
        try {
            if (mediaContent instanceof zzep) {
                zzbfhVar.zzdx(((zzep) mediaContent).f10181a);
            } else if (mediaContent == null) {
                zzbfhVar.zzdx(null);
            } else {
                zzm.b("Use MediaContent provided by NativeAd.getMediaContent");
            }
        } catch (RemoteException unused) {
            zzm.g(6);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void bringChildToFront(View view) {
        super.bringChildToFront(view);
        FrameLayout frameLayout = this.f10615a;
        if (frameLayout != view) {
            super.bringChildToFront(frameLayout);
        }
    }

    public final FrameLayout c(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(frameLayout);
        return frameLayout;
    }

    public final zzbfh d() {
        if (isInEditMode()) {
            return null;
        }
        zzaw zzawVar = zzay.f10107f.f10109b;
        FrameLayout frameLayout = this.f10615a;
        Context context = frameLayout.getContext();
        zzawVar.getClass();
        return (zzbfh) new l(zzawVar, this, frameLayout, context).d(context, false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        zzbfh zzbfhVar = this.f10616b;
        if (zzbfhVar != null) {
            if (((Boolean) zzba.f10115d.c.zza(zzbbw.zzkE)).booleanValue()) {
                try {
                    zzbfhVar.zzd(new ObjectWrapper(motionEvent));
                } catch (RemoteException unused) {
                    zzm.g(6);
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void e(View view, String str) {
        zzbfh zzbfhVar = this.f10616b;
        if (zzbfhVar == null) {
            return;
        }
        try {
            zzbfhVar.zzdv(str, new ObjectWrapper(view));
        } catch (RemoteException unused) {
            zzm.g(6);
        }
    }

    public AdChoicesView getAdChoicesView() {
        View a10 = a("3011");
        if (a10 instanceof AdChoicesView) {
            return (AdChoicesView) a10;
        }
        return null;
    }

    public final View getAdvertiserView() {
        return a("3005");
    }

    public final View getBodyView() {
        return a("3004");
    }

    public final View getCallToActionView() {
        return a("3002");
    }

    public final View getHeadlineView() {
        return a("3001");
    }

    public final View getIconView() {
        return a("3003");
    }

    public final View getImageView() {
        return a("3008");
    }

    public final MediaView getMediaView() {
        View a10 = a("3010");
        if (a10 instanceof MediaView) {
            return (MediaView) a10;
        }
        if (a10 != null) {
            zzm.b("View is not an instance of MediaView");
            return null;
        }
        return null;
    }

    public final View getPriceView() {
        return a("3007");
    }

    public final View getStarRatingView() {
        return a("3009");
    }

    public final View getStoreView() {
        return a("3006");
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i10) {
        super.onVisibilityChanged(view, i10);
        zzbfh zzbfhVar = this.f10616b;
        if (zzbfhVar == null) {
            return;
        }
        try {
            zzbfhVar.zze(new ObjectWrapper(view), i10);
        } catch (RemoteException unused) {
            zzm.g(6);
        }
    }

    @Override // android.view.ViewGroup
    public final void removeAllViews() {
        super.removeAllViews();
        addView(this.f10615a);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        if (this.f10615a == view) {
            return;
        }
        super.removeView(view);
    }

    public void setAdChoicesView(AdChoicesView adChoicesView) {
        e(adChoicesView, "3011");
    }

    public final void setAdvertiserView(View view) {
        e(view, "3005");
    }

    public final void setBodyView(View view) {
        e(view, "3004");
    }

    public final void setCallToActionView(View view) {
        e(view, "3002");
    }

    public final void setClickConfirmingView(View view) {
        zzbfh zzbfhVar = this.f10616b;
        if (zzbfhVar == null) {
            return;
        }
        try {
            zzbfhVar.zzdw(new ObjectWrapper(view));
        } catch (RemoteException unused) {
            zzm.g(6);
        }
    }

    public final void setHeadlineView(View view) {
        e(view, "3001");
    }

    public final void setIconView(View view) {
        e(view, "3003");
    }

    public final void setImageView(View view) {
        e(view, "3008");
    }

    public final void setMediaView(MediaView mediaView) {
        e(mediaView, "3010");
        if (mediaView == null) {
            return;
        }
        zzb zzbVar = new zzb(this);
        synchronized (mediaView) {
            mediaView.f10597e = zzbVar;
            if (mediaView.f10595b) {
                b(mediaView.f10594a);
            }
        }
        mediaView.a(new zzc(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.google.android.gms.dynamic.IObjectWrapper, java.lang.Object] */
    public void setNativeAd(NativeAd nativeAd) {
        zzbfh zzbfhVar = this.f10616b;
        if (zzbfhVar == 0) {
            return;
        }
        try {
            zzbfhVar.zzdz(nativeAd.zza());
        } catch (RemoteException unused) {
            zzm.g(6);
        }
    }

    public final void setPriceView(View view) {
        e(view, "3007");
    }

    public final void setStarRatingView(View view) {
        e(view, "3009");
    }

    public final void setStoreView(View view) {
        e(view, "3006");
    }

    public NativeAdView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10615a = c(context);
        this.f10616b = d();
    }

    public NativeAdView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f10615a = c(context);
        this.f10616b = d();
    }
}
