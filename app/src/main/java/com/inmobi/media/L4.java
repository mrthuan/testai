package com.inmobi.media;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose;
import com.inmobi.commons.core.configs.AdConfig;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class L4 extends AbstractC1687jc {

    /* renamed from: e  reason: collision with root package name */
    public final U7 f14419e;

    /* renamed from: f  reason: collision with root package name */
    public final AbstractC1701kc f14420f;

    /* renamed from: g  reason: collision with root package name */
    public final A4 f14421g;

    /* renamed from: h  reason: collision with root package name */
    public final String f14422h;

    /* renamed from: i  reason: collision with root package name */
    public final WeakReference f14423i;

    /* renamed from: j  reason: collision with root package name */
    public final S6 f14424j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L4(U7 mAdContainer, nc mViewableAd, A4 a42) {
        super(mAdContainer);
        kotlin.jvm.internal.g.e(mAdContainer, "mAdContainer");
        kotlin.jvm.internal.g.e(mViewableAd, "mViewableAd");
        this.f14419e = mAdContainer;
        this.f14420f = mViewableAd;
        this.f14421g = a42;
        this.f14422h = "L4";
        this.f14423i = new WeakReference(mAdContainer.j());
        this.f14424j = new S6((byte) 0, a42);
    }

    @Override // com.inmobi.media.AbstractC1701kc
    public final View a(View view, ViewGroup parent, boolean z10) {
        kotlin.jvm.internal.g.e(parent, "parent");
        A4 a42 = this.f14421g;
        if (a42 != null) {
            String TAG = this.f14422h;
            kotlin.jvm.internal.g.d(TAG, "TAG");
            ((B4) a42).c(TAG, "inflate view");
        }
        View b10 = this.f14420f.b();
        Context context = (Context) this.f14423i.get();
        if (b10 != null && context != null) {
            this.f14424j.a(context, b10, this.f14419e);
        }
        return this.f14420f.a(view, parent, z10);
    }

    @Override // com.inmobi.media.AbstractC1701kc
    public final View b() {
        return this.f14420f.b();
    }

    @Override // com.inmobi.media.AbstractC1701kc
    public final C1788r7 c() {
        return this.f14420f.c();
    }

    @Override // com.inmobi.media.AbstractC1701kc
    public final void e() {
        A4 a42 = this.f14421g;
        if (a42 != null) {
            String TAG = this.f14422h;
            kotlin.jvm.internal.g.d(TAG, "TAG");
            ((B4) a42).a(TAG, "stop tracking for impression");
        }
        try {
            Context context = (Context) this.f14423i.get();
            if (context != null && !this.f14419e.f14477s) {
                A4 a43 = this.f14421g;
                if (a43 != null) {
                    String TAG2 = this.f14422h;
                    kotlin.jvm.internal.g.d(TAG2, "TAG");
                    ((B4) a43).a(TAG2, "stop tracking");
                }
                this.f14424j.a(context, this.f14419e);
            }
        } catch (Exception e10) {
            A4 a44 = this.f14421g;
            if (a44 != null) {
                String TAG3 = this.f14422h;
                kotlin.jvm.internal.g.d(TAG3, "TAG");
                ((B4) a44).b(TAG3, "Exception in stopTrackingForImpression with message : " + e10.getMessage());
            }
            Q4 q42 = Q4.f14590a;
            Q4.c.a(new J1(e10));
        } finally {
            this.f14420f.e();
        }
    }

    @Override // com.inmobi.media.AbstractC1701kc
    public final void a(View childView, FriendlyObstructionPurpose obstructionCode) {
        kotlin.jvm.internal.g.e(childView, "childView");
        kotlin.jvm.internal.g.e(obstructionCode, "obstructionCode");
        this.f14420f.a(childView, obstructionCode);
    }

    @Override // com.inmobi.media.AbstractC1701kc
    public final void a(View childView) {
        kotlin.jvm.internal.g.e(childView, "childView");
        this.f14420f.a(childView);
    }

    @Override // com.inmobi.media.AbstractC1701kc
    public final void a(HashMap hashMap) {
        A4 a42 = this.f14421g;
        if (a42 != null) {
            String str = this.f14422h;
            StringBuilder a10 = A5.a(str, "TAG", "start tracking impression with ");
            a10.append(hashMap != null ? Integer.valueOf(hashMap.size()) : null);
            a10.append(" friendlyViews");
            ((B4) a42).a(str, a10.toString());
        }
        try {
            try {
                View videoContainerView = this.f15271a.getVideoContainerView();
                C1641g8 c1641g8 = videoContainerView instanceof C1641g8 ? (C1641g8) videoContainerView : null;
                Context context = (Context) this.f14423i.get();
                AdConfig.ViewabilityConfig viewability = this.f15273d.getViewability();
                if (context != null && c1641g8 != null && !this.f14419e.f14477s) {
                    C1627f8 videoView = c1641g8.getVideoView();
                    A4 a43 = this.f14421g;
                    if (a43 != null) {
                        String TAG = this.f14422h;
                        kotlin.jvm.internal.g.d(TAG, "TAG");
                        ((B4) a43).a(TAG, "start tracking");
                    }
                    this.f14424j.a(context, videoView, this.f14419e, viewability);
                    View b10 = this.f14420f.b();
                    Object tag = videoView.getTag();
                    W7 w7 = tag instanceof W7 ? (W7) tag : null;
                    if (w7 != null && b10 != null && a(w7)) {
                        A4 a44 = this.f14421g;
                        if (a44 != null) {
                            String TAG2 = this.f14422h;
                            kotlin.jvm.internal.g.d(TAG2, "TAG");
                            ((B4) a44).a(TAG2, "start tracking inline ad");
                        }
                        S6 s62 = this.f14424j;
                        U7 u7 = this.f14419e;
                        s62.a(context, b10, u7, u7.f14734a0, viewability);
                    }
                }
            } catch (Exception e10) {
                A4 a45 = this.f14421g;
                if (a45 != null) {
                    String TAG3 = this.f14422h;
                    kotlin.jvm.internal.g.d(TAG3, "TAG");
                    ((B4) a45).b(TAG3, "Exception in startTrackingForImpression with message : " + e10.getMessage());
                }
                Q4 q42 = Q4.f14590a;
                Q4.c.a(new J1(e10));
            }
        } finally {
            this.f14420f.a(hashMap);
        }
    }

    @Override // com.inmobi.media.AbstractC1701kc
    public final void a(byte b10) {
        A4 a42 = this.f14421g;
        if (a42 != null) {
            String TAG = this.f14422h;
            kotlin.jvm.internal.g.d(TAG, "TAG");
            ((B4) a42).a(TAG, "Received event : " + ((int) b10));
        }
        this.f14420f.a(b10);
    }

    @Override // com.inmobi.media.AbstractC1701kc
    public final void a(Context context, byte b10) {
        kotlin.jvm.internal.g.e(context, "context");
        A4 a42 = this.f14421g;
        if (a42 != null) {
            String TAG = this.f14422h;
            kotlin.jvm.internal.g.d(TAG, "TAG");
            ((B4) a42).c(TAG, "onActivityStateChanged state - " + ((int) b10));
        }
        try {
            try {
                if (b10 == 0) {
                    S6 s62 = this.f14424j;
                    s62.getClass();
                    C1665i4 c1665i4 = (C1665i4) s62.f14641d.get(context);
                    if (c1665i4 != null) {
                        kotlin.jvm.internal.g.d(c1665i4.f15184d, "TAG");
                        for (Map.Entry entry : c1665i4.f15182a.entrySet()) {
                            C1637g4 c1637g4 = (C1637g4) entry.getValue();
                            c1665i4.c.a((View) entry.getKey(), c1637g4.f15092a, c1637g4.f15093b);
                        }
                        if (!c1665i4.f15185e.hasMessages(0)) {
                            c1665i4.f15185e.postDelayed(c1665i4.f15186f, c1665i4.f15187g);
                        }
                        c1665i4.c.f();
                    }
                } else if (b10 == 1) {
                    S6 s63 = this.f14424j;
                    s63.getClass();
                    C1665i4 c1665i42 = (C1665i4) s63.f14641d.get(context);
                    if (c1665i42 != null) {
                        kotlin.jvm.internal.g.d(c1665i42.f15184d, "TAG");
                        c1665i42.c.a();
                        c1665i42.f15185e.removeCallbacksAndMessages(null);
                        c1665i42.f15183b.clear();
                    }
                } else if (b10 == 2) {
                    S6 s64 = this.f14424j;
                    s64.getClass();
                    A4 a43 = s64.f14640b;
                    if (a43 != null) {
                        String TAG2 = s64.c;
                        kotlin.jvm.internal.g.d(TAG2, "TAG");
                        ((B4) a43).a(TAG2, "Activity destroyed, removing impression tracker");
                    }
                    C1665i4 c1665i43 = (C1665i4) s64.f14641d.remove(context);
                    if (c1665i43 != null) {
                        c1665i43.f15182a.clear();
                        c1665i43.f15183b.clear();
                        c1665i43.c.a();
                        c1665i43.f15185e.removeMessages(0);
                        c1665i43.c.b();
                    }
                    if (context instanceof Activity) {
                        s64.f14641d.isEmpty();
                    }
                } else {
                    A4 a44 = this.f14421g;
                    if (a44 != null) {
                        String TAG3 = this.f14422h;
                        kotlin.jvm.internal.g.d(TAG3, "TAG");
                        ((B4) a44).b(TAG3, "UnHandled sate ( " + ((int) b10) + " ) received in onActivityStateChanged()");
                    }
                }
                this.f14420f.a(context, b10);
            } catch (Exception e10) {
                A4 a45 = this.f14421g;
                if (a45 != null) {
                    String TAG4 = this.f14422h;
                    kotlin.jvm.internal.g.d(TAG4, "TAG");
                    ((B4) a45).b(TAG4, "Exception in onActivityStateChanged with message : " + e10.getMessage());
                }
                Q4 q42 = Q4.f14590a;
                Q4.c.a(new J1(e10));
                this.f14420f.a(context, b10);
            }
        } catch (Throwable th2) {
            this.f14420f.a(context, b10);
            throw th2;
        }
    }

    @Override // com.inmobi.media.AbstractC1701kc
    public final void a() {
        A4 a42 = this.f14421g;
        if (a42 != null) {
            String TAG = this.f14422h;
            kotlin.jvm.internal.g.d(TAG, "TAG");
            ((B4) a42).a(TAG, "destroy");
        }
        Context context = (Context) this.f14423i.get();
        View b10 = this.f14420f.b();
        if (context != null && b10 != null) {
            this.f14424j.a(context, b10, this.f14419e);
        }
        super.a();
        this.f14423i.clear();
        this.f14420f.a();
    }

    public final boolean a(W7 w7) {
        Object obj = w7.f14804t.get("isFullScreen");
        Boolean bool = obj instanceof Boolean ? (Boolean) obj : null;
        return this.f14419e.f14460a == 0 && !(bool != null ? bool.booleanValue() : false);
    }
}
