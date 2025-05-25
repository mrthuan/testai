package com.inmobi.media;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose;
import com.inmobi.commons.core.configs.AdConfig;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class J4 extends AbstractC1701kc {

    /* renamed from: e  reason: collision with root package name */
    public final AbstractC1701kc f14363e;

    /* renamed from: f  reason: collision with root package name */
    public final W3 f14364f;

    /* renamed from: g  reason: collision with root package name */
    public final A4 f14365g;

    /* renamed from: h  reason: collision with root package name */
    public final String f14366h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J4(r container, C1715lc mViewableAd, W3 htmlAdTracker, A4 a42) {
        super(container);
        kotlin.jvm.internal.g.e(container, "container");
        kotlin.jvm.internal.g.e(mViewableAd, "mViewableAd");
        kotlin.jvm.internal.g.e(htmlAdTracker, "htmlAdTracker");
        this.f14363e = mViewableAd;
        this.f14364f = htmlAdTracker;
        this.f14365g = a42;
        this.f14366h = "J4";
    }

    @Override // com.inmobi.media.AbstractC1701kc
    public final void a(byte b10) {
    }

    @Override // com.inmobi.media.AbstractC1701kc
    public final View b() {
        return this.f14363e.b();
    }

    @Override // com.inmobi.media.AbstractC1701kc
    public final C1788r7 c() {
        return this.f14363e.c();
    }

    @Override // com.inmobi.media.AbstractC1701kc
    public final View d() {
        return this.f14363e.d();
    }

    @Override // com.inmobi.media.AbstractC1701kc
    public final void e() {
        A4 a42 = this.f14365g;
        if (a42 != null) {
            String TAG = this.f14366h;
            kotlin.jvm.internal.g.d(TAG, "TAG");
            ((B4) a42).a(TAG, "stopTrackingForImpression");
        }
        View b10 = this.f14363e.b();
        if (b10 != null) {
            this.f14364f.a(b10);
            this.f14363e.e();
        }
    }

    @Override // com.inmobi.media.AbstractC1701kc
    public final View a(View view, ViewGroup parent, boolean z10) {
        kotlin.jvm.internal.g.e(parent, "parent");
        View b10 = this.f14363e.b();
        if (b10 != null) {
            this.f14364f.a(b10);
            this.f14364f.b(b10);
        }
        return this.f14363e.a(view, parent, z10);
    }

    @Override // com.inmobi.media.AbstractC1701kc
    public final void a(HashMap hashMap) {
        A4 a42 = this.f14365g;
        if (a42 != null) {
            String str = this.f14366h;
            StringBuilder a10 = A5.a(str, "TAG", "startTrackingForImpression with ");
            a10.append(hashMap != null ? Integer.valueOf(hashMap.size()) : null);
            a10.append(" friendly views");
            ((B4) a42).a(str, a10.toString());
        }
        View b10 = this.f14363e.b();
        if (b10 != null) {
            A4 a43 = this.f14365g;
            if (a43 != null) {
                String TAG = this.f14366h;
                kotlin.jvm.internal.g.d(TAG, "TAG");
                ((B4) a43).a(TAG, "start tracking");
            }
            AdConfig.ViewabilityConfig viewabilityConfig = this.f15273d.getViewability();
            r rVar = this.f15271a;
            kotlin.jvm.internal.g.c(rVar, "null cannot be cast to non-null type com.inmobi.ads.containers.RenderView");
            S9 s92 = (S9) rVar;
            s92.setFriendlyViews(hashMap);
            W3 w32 = this.f14364f;
            w32.getClass();
            kotlin.jvm.internal.g.e(viewabilityConfig, "viewabilityConfig");
            A4 a44 = w32.f14777f;
            if (a44 != null) {
                ((B4) a44).c("HtmlAdTracker", "startTrackingForImpression");
            }
            if (w32.f14773a == 0) {
                A4 a45 = w32.f14777f;
                if (a45 != null) {
                    ((B4) a45).b("HtmlAdTracker", "impression type is loaded. return");
                }
            } else if (!kotlin.jvm.internal.g.a(w32.f14774b, "video") && !kotlin.jvm.internal.g.a(w32.f14774b, "audio")) {
                byte b11 = w32.f14773a;
                C1665i4 c1665i4 = w32.f14778g;
                if (c1665i4 == null) {
                    A4 a46 = w32.f14777f;
                    if (a46 != null) {
                        ((B4) a46).c("HtmlAdTracker", b.a.c("creating Visibility Tracker for ", b11));
                    }
                    Z3 z32 = new Z3(viewabilityConfig, b11, w32.f14777f);
                    A4 a47 = w32.f14777f;
                    if (a47 != null) {
                        ((B4) a47).c("HtmlAdTracker", b.a.c("creating Impression Tracker for ", b11));
                    }
                    C1665i4 c1665i42 = new C1665i4(viewabilityConfig, z32, w32.f14781j);
                    w32.f14778g = c1665i42;
                    c1665i4 = c1665i42;
                }
                A4 a48 = w32.f14777f;
                if (a48 != null) {
                    ((B4) a48).c("HtmlAdTracker", "impression tracker add view");
                }
                c1665i4.a(b10, b10, w32.f14775d, w32.c);
            } else {
                A4 a49 = w32.f14777f;
                if (a49 != null) {
                    ((B4) a49).b("HtmlAdTracker", "creative type is video and audio. return");
                }
            }
            W3 w33 = this.f14364f;
            pc listener = s92.getVISIBILITY_CHANGE_LISTENER();
            w33.getClass();
            kotlin.jvm.internal.g.e(listener, "listener");
            A4 a410 = w33.f14777f;
            if (a410 != null) {
                ((B4) a410).c("HtmlAdTracker", "startTrackingForVisibility");
            }
            Z3 z33 = w33.f14779h;
            if (z33 == null) {
                z33 = new Z3(viewabilityConfig, (byte) 1, w33.f14777f);
                V3 v32 = new V3(w33);
                A4 a411 = z33.f15605e;
                if (a411 != null) {
                    ((B4) a411).c("VisibilityTracker", "setVisibilityTrackerListener logger");
                }
                z33.f15610j = v32;
                w33.f14779h = z33;
            }
            w33.f14780i.put(b10, listener);
            z33.a(b10, b10, w33.f14776e);
            this.f14363e.a(hashMap);
        }
    }

    @Override // com.inmobi.media.AbstractC1701kc
    public final void a(View childView, FriendlyObstructionPurpose obstructionCode) {
        kotlin.jvm.internal.g.e(childView, "childView");
        kotlin.jvm.internal.g.e(obstructionCode, "obstructionCode");
        this.f14363e.a(childView, obstructionCode);
    }

    @Override // com.inmobi.media.AbstractC1701kc
    public final void a(View childView) {
        kotlin.jvm.internal.g.e(childView, "childView");
        this.f14363e.a(childView);
    }

    @Override // com.inmobi.media.AbstractC1701kc
    public final void a(Context context, byte b10) {
        kotlin.jvm.internal.g.e(context, "context");
        A4 a42 = this.f14365g;
        if (a42 != null) {
            String TAG = this.f14366h;
            kotlin.jvm.internal.g.d(TAG, "TAG");
            ((B4) a42).a(TAG, "onActivityStateChanged - state - " + ((int) b10));
        }
        try {
            try {
                if (b10 == 0) {
                    this.f14364f.a();
                } else if (b10 == 1) {
                    this.f14364f.b();
                } else if (b10 == 2) {
                    W3 w32 = this.f14364f;
                    A4 a43 = w32.f14777f;
                    if (a43 != null) {
                        ((B4) a43).c("HtmlAdTracker", "onActivityDestroyed");
                    }
                    C1665i4 c1665i4 = w32.f14778g;
                    if (c1665i4 != null) {
                        c1665i4.f15182a.clear();
                        c1665i4.f15183b.clear();
                        c1665i4.c.a();
                        c1665i4.f15185e.removeMessages(0);
                        c1665i4.c.b();
                    }
                    w32.f14778g = null;
                    Z3 z32 = w32.f14779h;
                    if (z32 != null) {
                        z32.b();
                    }
                    w32.f14779h = null;
                } else {
                    kotlin.jvm.internal.g.d(this.f14366h, "TAG");
                }
                this.f14363e.a(context, b10);
            } catch (Exception e10) {
                A4 a44 = this.f14365g;
                if (a44 != null) {
                    String TAG2 = this.f14366h;
                    kotlin.jvm.internal.g.d(TAG2, "TAG");
                    ((B4) a44).b(TAG2, "Exception in onActivityStateChanged with message : " + e10.getMessage());
                }
                Q4 q42 = Q4.f14590a;
                Q4.c.a(new J1(e10));
                this.f14363e.a(context, b10);
            }
        } catch (Throwable th2) {
            this.f14363e.a(context, b10);
            throw th2;
        }
    }

    @Override // com.inmobi.media.AbstractC1701kc
    public final void a() {
        A4 a42 = this.f14365g;
        if (a42 != null) {
            String TAG = this.f14366h;
            kotlin.jvm.internal.g.d(TAG, "TAG");
            ((B4) a42).a(TAG, "destroy");
        }
        View b10 = this.f14363e.b();
        if (b10 != null) {
            this.f14364f.a(b10);
            this.f14364f.b(b10);
        }
        super.a();
        this.f14363e.a();
    }
}
