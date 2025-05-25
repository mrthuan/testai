package com.inmobi.media;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class K4 extends AbstractC1687jc {

    /* renamed from: e  reason: collision with root package name */
    public final M6 f14388e;

    /* renamed from: f  reason: collision with root package name */
    public final AbstractC1701kc f14389f;

    /* renamed from: g  reason: collision with root package name */
    public final A4 f14390g;

    /* renamed from: h  reason: collision with root package name */
    public final String f14391h;

    /* renamed from: i  reason: collision with root package name */
    public final WeakReference f14392i;

    /* renamed from: j  reason: collision with root package name */
    public final S6 f14393j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K4(Context context, M6 mAdContainer, mc mViewableAd, A4 a42) {
        super(mAdContainer);
        kotlin.jvm.internal.g.e(context, "context");
        kotlin.jvm.internal.g.e(mAdContainer, "mAdContainer");
        kotlin.jvm.internal.g.e(mViewableAd, "mViewableAd");
        this.f14388e = mAdContainer;
        this.f14389f = mViewableAd;
        this.f14390g = a42;
        this.f14391h = "K4";
        this.f14392i = new WeakReference(context);
        this.f14393j = new S6((byte) 1, a42);
    }

    @Override // com.inmobi.media.AbstractC1701kc
    public final View a(View view, ViewGroup parent, boolean z10) {
        kotlin.jvm.internal.g.e(parent, "parent");
        A4 a42 = this.f14390g;
        if (a42 != null) {
            String TAG = this.f14391h;
            kotlin.jvm.internal.g.d(TAG, "TAG");
            ((B4) a42).c(TAG, "inflate view - deferred - " + z10);
        }
        View b10 = this.f14389f.b();
        Context context = (Context) this.f14388e.f14481w.get();
        if (b10 != null && context != null) {
            this.f14393j.a(context, b10, this.f14388e);
        }
        return this.f14389f.a(view, parent, z10);
    }

    @Override // com.inmobi.media.AbstractC1701kc
    public final View b() {
        return this.f14389f.b();
    }

    @Override // com.inmobi.media.AbstractC1701kc
    public final C1788r7 c() {
        return this.f14389f.c();
    }

    @Override // com.inmobi.media.AbstractC1701kc
    public final void e() {
        A4 a42 = this.f14390g;
        if (a42 != null) {
            String TAG = this.f14391h;
            kotlin.jvm.internal.g.d(TAG, "TAG");
            ((B4) a42).a(TAG, "stopTrackingForImpression");
        }
        try {
            Context context = (Context) this.f14392i.get();
            if (context != null && !this.f14388e.f14477s) {
                A4 a43 = this.f14390g;
                if (a43 != null) {
                    String TAG2 = this.f14391h;
                    kotlin.jvm.internal.g.d(TAG2, "TAG");
                    ((B4) a43).a(TAG2, "stop tracking");
                }
                this.f14393j.a(context, this.f14388e);
            }
        } catch (Exception e10) {
            A4 a44 = this.f14390g;
            if (a44 != null) {
                String TAG3 = this.f14391h;
                kotlin.jvm.internal.g.d(TAG3, "TAG");
                ((B4) a44).b(TAG3, "Exception in stopTrackingForImpression with message : " + e10.getMessage());
            }
            Q4 q42 = Q4.f14590a;
            Q4.c.a(new J1(e10));
        } finally {
            this.f14389f.e();
        }
    }

    @Override // com.inmobi.media.AbstractC1701kc
    public final void a(View childView, FriendlyObstructionPurpose obstructionCode) {
        kotlin.jvm.internal.g.e(childView, "childView");
        kotlin.jvm.internal.g.e(obstructionCode, "obstructionCode");
        this.f14389f.a(childView, obstructionCode);
    }

    @Override // com.inmobi.media.AbstractC1701kc
    public final void a(View childView) {
        kotlin.jvm.internal.g.e(childView, "childView");
        this.f14389f.a(childView);
    }

    @Override // com.inmobi.media.AbstractC1701kc
    public final void a(HashMap hashMap) {
        A4 a42 = this.f14390g;
        if (a42 != null) {
            String str = this.f14391h;
            StringBuilder a10 = A5.a(str, "TAG", "start tracking impression with ");
            a10.append(hashMap != null ? Integer.valueOf(hashMap.size()) : null);
            a10.append(" friendlyViews");
            ((B4) a42).a(str, a10.toString());
        }
        try {
            Context context = (Context) this.f14392i.get();
            View b10 = this.f14389f.b();
            if (context != null && b10 != null && !this.f14388e.f14477s) {
                A4 a43 = this.f14390g;
                if (a43 != null) {
                    String TAG = this.f14391h;
                    kotlin.jvm.internal.g.d(TAG, "TAG");
                    ((B4) a43).a(TAG, "start tracking");
                }
                this.f14393j.a(context, b10, this.f14388e, this.f15273d.getViewability());
                S6 s62 = this.f14393j;
                M6 m62 = this.f14388e;
                s62.a(context, b10, m62, m62.i(), this.f15273d.getViewability());
            }
        } catch (Exception e10) {
            A4 a44 = this.f14390g;
            if (a44 != null) {
                String TAG2 = this.f14391h;
                kotlin.jvm.internal.g.d(TAG2, "TAG");
                ((B4) a44).b(TAG2, "Exception in startTrackingForImpression with message : " + e10.getMessage());
            }
            Q4 q42 = Q4.f14590a;
            Q4.c.a(new J1(e10));
        } finally {
            this.f14389f.a(hashMap);
        }
    }

    @Override // com.inmobi.media.AbstractC1701kc
    public final void a(byte b10) {
        A4 a42 = this.f14390g;
        if (a42 != null) {
            String TAG = this.f14391h;
            kotlin.jvm.internal.g.d(TAG, "TAG");
            ((B4) a42).a(TAG, "onAdEvent - " + ((int) b10));
        }
        this.f14389f.a(b10);
    }

    @Override // com.inmobi.media.AbstractC1701kc
    public final void a(Context context, byte b10) {
        kotlin.jvm.internal.g.e(context, "context");
        A4 a42 = this.f14390g;
        if (a42 != null) {
            String TAG = this.f14391h;
            kotlin.jvm.internal.g.d(TAG, "TAG");
            ((B4) a42).a(TAG, "onActivityStateChanged - " + ((int) b10));
        }
        try {
            try {
                if (b10 == 0) {
                    S6 s62 = this.f14393j;
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
                    S6 s63 = this.f14393j;
                    s63.getClass();
                    C1665i4 c1665i42 = (C1665i4) s63.f14641d.get(context);
                    if (c1665i42 != null) {
                        kotlin.jvm.internal.g.d(c1665i42.f15184d, "TAG");
                        c1665i42.c.a();
                        c1665i42.f15185e.removeCallbacksAndMessages(null);
                        c1665i42.f15183b.clear();
                    }
                } else if (b10 == 2) {
                    S6 s64 = this.f14393j;
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
                    A4 a44 = this.f14390g;
                    if (a44 != null) {
                        String TAG3 = this.f14391h;
                        kotlin.jvm.internal.g.d(TAG3, "TAG");
                        ((B4) a44).b(TAG3, "UnHandled sate ( " + ((int) b10) + " ) received in onActivityStateChanged()");
                    }
                }
                this.f14389f.a(context, b10);
            } catch (Exception e10) {
                A4 a45 = this.f14390g;
                if (a45 != null) {
                    String TAG4 = this.f14391h;
                    kotlin.jvm.internal.g.d(TAG4, "TAG");
                    ((B4) a45).b(TAG4, "Exception in onActivityStateChanged with message : " + e10.getMessage());
                }
                Q4 q42 = Q4.f14590a;
                Q4.c.a(new J1(e10));
                this.f14389f.a(context, b10);
            }
        } catch (Throwable th2) {
            this.f14389f.a(context, b10);
            throw th2;
        }
    }

    @Override // com.inmobi.media.AbstractC1701kc
    public final void a() {
        A4 a42 = this.f14390g;
        if (a42 != null) {
            String TAG = this.f14391h;
            kotlin.jvm.internal.g.d(TAG, "TAG");
            ((B4) a42).a(TAG, "destroy");
        }
        Context context = (Context) this.f14388e.f14481w.get();
        View b10 = this.f14389f.b();
        if (context != null && b10 != null) {
            this.f14393j.a(context, b10, this.f14388e);
        }
        super.a();
        this.f14392i.clear();
        this.f14389f.a();
    }
}
