package com.inmobi.media;

import android.app.Activity;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.RelativeLayout;
import com.inmobi.ads.rendering.InMobiAdActivity;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class X3 extends B {

    /* renamed from: e  reason: collision with root package name */
    public final WeakReference f14829e;

    /* renamed from: f  reason: collision with root package name */
    public final r f14830f;

    /* renamed from: g  reason: collision with root package name */
    public final RelativeLayout f14831g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f14832h;

    /* renamed from: i  reason: collision with root package name */
    public Aa f14833i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X3(WeakReference activityRef, r adContainer, RelativeLayout adBackgroundView) {
        super(adBackgroundView);
        kotlin.jvm.internal.g.e(activityRef, "activityRef");
        kotlin.jvm.internal.g.e(adContainer, "adContainer");
        kotlin.jvm.internal.g.e(adBackgroundView, "adBackgroundView");
        this.f14829e = activityRef;
        this.f14830f = adContainer;
        this.f14831g = adBackgroundView;
    }

    @Override // com.inmobi.media.B
    public final void a(EnumC1586c9 orientation) {
        kotlin.jvm.internal.g.e(orientation, "orientation");
        this.f14136b = orientation;
        r rVar = this.f14830f;
        kotlin.jvm.internal.g.c(rVar, "null cannot be cast to non-null type com.inmobi.ads.containers.RenderView");
        S9 s92 = (S9) rVar;
        int a10 = AbstractC1600d9.a(orientation);
        A4 a42 = s92.f14665j;
        if (a42 != null) {
            String TAG = S9.O0;
            kotlin.jvm.internal.g.d(TAG, "TAG");
            ((B4) a42).a(TAG, "fireOrientationChange " + s92 + ' ' + a10);
        }
        s92.b("window.imraid.broadcastEvent('orientationChange','" + a10 + "');");
    }

    @Override // com.inmobi.media.B
    public final void b() {
        boolean z10;
        Activity activity = (Activity) this.f14829e.get();
        if (!(activity instanceof InMobiAdActivity)) {
            z10 = false;
        } else {
            z10 = ((InMobiAdActivity) activity).f14098e;
        }
        if (z10) {
            try {
                InterfaceC1768q fullScreenEventsListener = this.f14830f.getFullScreenEventsListener();
                if (fullScreenEventsListener != null) {
                    fullScreenEventsListener.b(null);
                }
            } catch (Exception unused) {
                Z5.a((byte) 2, "InMobi", "SDK encountered unexpected error while finishing fullscreen view");
            }
        } else {
            r rVar = this.f14830f;
            kotlin.jvm.internal.g.c(rVar, "null cannot be cast to non-null type com.inmobi.ads.containers.RenderView");
            S9 s92 = (S9) rVar;
            s92.setFullScreenActivityContext(null);
            try {
                s92.a();
            } catch (Exception unused2) {
                Z5.a((byte) 2, "InMobi", "SDK encountered unexpected error in processing close request");
            }
            SparseArray sparseArray = InMobiAdActivity.f14092j;
            r container = this.f14830f;
            kotlin.jvm.internal.g.e(container, "container");
            InMobiAdActivity.f14092j.remove(container.hashCode());
        }
        Aa aa2 = this.f14833i;
        if (aa2 != null) {
            aa2.a();
        }
        this.f14830f.b();
    }

    @Override // com.inmobi.media.B
    public final void c() {
        if (this.f14832h) {
            return;
        }
        try {
            this.f14832h = true;
            InterfaceC1768q fullScreenEventsListener = this.f14830f.getFullScreenEventsListener();
            if (fullScreenEventsListener != null) {
                fullScreenEventsListener.a(null);
            }
        } catch (Exception unused) {
        }
    }

    @Override // com.inmobi.media.B
    public final void f() {
        View view;
        this.f14831g.setBackgroundColor(0);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(10);
        AbstractC1701kc viewableAd = this.f14830f.getViewableAd();
        ViewGroup viewGroup = null;
        if (viewableAd != null) {
            view = viewableAd.d();
        } else {
            view = null;
        }
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                viewGroup = (ViewGroup) parent;
            }
            if (viewGroup != null) {
                viewGroup.removeView(view);
            }
            this.f14831g.addView(view, layoutParams);
        }
    }

    @Override // com.inmobi.media.B
    public final void g() {
        if (1 == this.f14830f.getPlacementType()) {
            try {
                HashMap hashMap = new HashMap();
                AbstractC1701kc viewableAd = this.f14830f.getViewableAd();
                if (viewableAd != null) {
                    viewableAd.a(hashMap);
                }
            } catch (Exception unused) {
                InterfaceC1768q fullScreenEventsListener = this.f14830f.getFullScreenEventsListener();
                if (fullScreenEventsListener != null) {
                    fullScreenEventsListener.a();
                }
            }
        }
    }

    @Override // com.inmobi.media.B
    public final void a() {
        r rVar = this.f14830f;
        S9 s92 = rVar instanceof S9 ? (S9) rVar : null;
        if (s92 == null) {
            return;
        }
        A4 a42 = s92.f14665j;
        if (a42 != null) {
            String str = S9.O0;
            ((B4) a42).a(str, G9.a(s92, str, "TAG", "fireBackButtonPressedEvent "));
        }
        String str2 = s92.H;
        if (str2 != null) {
            s92.a(str2, "broadcastEvent('backButtonPressed')");
        }
        if (s92.G) {
            return;
        }
        try {
            s92.a();
        } catch (Exception unused) {
            Z5.a((byte) 2, "InMobi", "SDK encountered unexpected error in processing close request");
        }
    }

    @Override // com.inmobi.media.B
    public final void d() {
    }
}
