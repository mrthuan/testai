package com.inmobi.media;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.iab.omid.library.inmobi.Omid;
import com.iab.omid.library.inmobi.adsession.AdSession;
import com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose;
import com.iab.omid.library.inmobi.adsession.media.VastProperties;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class Z8 extends AbstractC1687jc {

    /* renamed from: e  reason: collision with root package name */
    public final AbstractC1701kc f14913e;

    /* renamed from: f  reason: collision with root package name */
    public T8 f14914f;

    /* renamed from: g  reason: collision with root package name */
    public final VastProperties f14915g;

    /* renamed from: h  reason: collision with root package name */
    public final A4 f14916h;

    /* renamed from: i  reason: collision with root package name */
    public final String f14917i;

    /* renamed from: j  reason: collision with root package name */
    public final float f14918j;

    /* renamed from: k  reason: collision with root package name */
    public final WeakReference f14919k;

    /* renamed from: l  reason: collision with root package name */
    public WeakReference f14920l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z8(Context context, AbstractC1701kc mViewableAd, U7 adContainer, T8 t82, VastProperties mVastProperties, A4 a42) {
        super(adContainer);
        kotlin.jvm.internal.g.e(context, "context");
        kotlin.jvm.internal.g.e(mViewableAd, "mViewableAd");
        kotlin.jvm.internal.g.e(adContainer, "adContainer");
        kotlin.jvm.internal.g.e(mVastProperties, "mVastProperties");
        this.f14913e = mViewableAd;
        this.f14914f = t82;
        this.f14915g = mVastProperties;
        this.f14916h = a42;
        this.f14917i = "Z8";
        this.f14918j = 1.0f;
        this.f14919k = new WeakReference(context);
    }

    @Override // com.inmobi.media.AbstractC1701kc
    public final View a(View view, ViewGroup parent, boolean z10) {
        kotlin.jvm.internal.g.e(parent, "parent");
        return this.f14913e.a(view, parent, z10);
    }

    @Override // com.inmobi.media.AbstractC1701kc
    public final View b() {
        return this.f14913e.b();
    }

    @Override // com.inmobi.media.AbstractC1701kc
    public final C1788r7 c() {
        return this.f14913e.c();
    }

    @Override // com.inmobi.media.AbstractC1701kc
    public final View d() {
        return this.f14913e.d();
    }

    @Override // com.inmobi.media.AbstractC1701kc
    public final void e() {
        int i10;
        try {
            r rVar = this.f15271a;
            if ((rVar instanceof U7) && !((U7) rVar).k()) {
                T8 t82 = this.f14914f;
                if (t82 != null) {
                    t82.a();
                }
                A4 a42 = this.f14916h;
                if (a42 != null) {
                    String TAG = this.f14917i;
                    kotlin.jvm.internal.g.d(TAG, "TAG");
                    StringBuilder sb2 = new StringBuilder("Unregistered VideoView to OMID AdSession : ");
                    T8 t83 = this.f14914f;
                    if (t83 != null) {
                        i10 = t83.hashCode();
                    } else {
                        i10 = 0;
                    }
                    sb2.append(i10);
                    ((B4) a42).a(TAG, sb2.toString());
                }
            }
        } catch (Exception e10) {
            A4 a43 = this.f14916h;
            if (a43 != null) {
                String TAG2 = this.f14917i;
                kotlin.jvm.internal.g.d(TAG2, "TAG");
                ((B4) a43).b(TAG2, "Exception in stopTrackingForImpression with message : " + e10.getMessage());
            }
            Q4 q42 = Q4.f14590a;
            Q4.c.a(new J1(e10));
        } finally {
            this.f14913e.e();
        }
    }

    @Override // com.inmobi.media.AbstractC1701kc
    public final void a(View childView, FriendlyObstructionPurpose obstructionCode) {
        kotlin.jvm.internal.g.e(childView, "childView");
        kotlin.jvm.internal.g.e(obstructionCode, "obstructionCode");
        T8 t82 = this.f14914f;
        if (t82 != null) {
            t82.a(childView, obstructionCode);
        }
    }

    @Override // com.inmobi.media.AbstractC1701kc
    public final void a(View childView) {
        kotlin.jvm.internal.g.e(childView, "childView");
        T8 t82 = this.f14914f;
        if (t82 != null) {
            byte b10 = t82.f14713e;
            if (b10 > 0) {
                AdSession adSession = t82.f14714f;
                if (adSession != null) {
                    adSession.removeFriendlyObstruction(childView);
                    return;
                }
                return;
            }
            Q4 q42 = Q4.f14590a;
            Q4.c.a(new J1(new Exception(a0.a.g("Omid AdSession State Error currentState :: ", b10, ", expectedState :: 1"))));
        }
    }

    @Override // com.inmobi.media.AbstractC1701kc
    public final void a(HashMap hashMap) {
        try {
            A4 a42 = this.f14916h;
            if (a42 != null) {
                String TAG = this.f14917i;
                kotlin.jvm.internal.g.d(TAG, "TAG");
                ((B4) a42).c(TAG, "startTrackingForImpression");
            }
            if (this.f15273d.getViewability().getOmidConfig().isOmidEnabled()) {
                AbstractC1558a9.f14936a.getClass();
                if (Omid.isActive()) {
                    A4 a43 = this.f14916h;
                    if (a43 != null) {
                        String TAG2 = this.f14917i;
                        kotlin.jvm.internal.g.d(TAG2, "TAG");
                        ((B4) a43).a(TAG2, "OMID enabled and OM SDK initialised");
                    }
                    r rVar = this.f15271a;
                    if (rVar instanceof U7) {
                        View videoContainerView = ((U7) rVar).getVideoContainerView();
                        C1641g8 c1641g8 = videoContainerView instanceof C1641g8 ? (C1641g8) videoContainerView : null;
                        if (c1641g8 instanceof View) {
                            Y7 mediaController = c1641g8.getVideoView().getMediaController();
                            this.f14920l = new WeakReference(c1641g8);
                            A4 a44 = this.f14916h;
                            if (a44 != null) {
                                String TAG3 = this.f14917i;
                                kotlin.jvm.internal.g.d(TAG3, "TAG");
                                ((B4) a44).a(TAG3, "creating new OM SDK ad session");
                            }
                            T8 t82 = this.f14914f;
                            if (t82 != null) {
                                t82.a(c1641g8, mediaController != null ? mediaController.getFriendlyViews() : null, this.f14913e.b());
                            }
                            A4 a45 = this.f14916h;
                            if (a45 != null) {
                                String TAG4 = this.f14917i;
                                kotlin.jvm.internal.g.d(TAG4, "TAG");
                                StringBuilder sb2 = new StringBuilder("Registered ad view with OMID Video AdSession ");
                                T8 t83 = this.f14914f;
                                sb2.append(t83 != null ? t83.hashCode() : 0);
                                ((B4) a45).a(TAG4, sb2.toString());
                            }
                        }
                    }
                }
            }
        } catch (Exception e10) {
            A4 a46 = this.f14916h;
            if (a46 != null) {
                String TAG5 = this.f14917i;
                kotlin.jvm.internal.g.d(TAG5, "TAG");
                ((B4) a46).b(TAG5, "Exception in startTrackingForImpression with message : " + e10.getMessage());
            }
            Q4 q42 = Q4.f14590a;
            Q4.c.a(new J1(e10));
        } finally {
            this.f14913e.a(hashMap);
        }
    }

    @Override // com.inmobi.media.AbstractC1701kc
    public final void a(byte b10) {
        try {
            A4 a42 = this.f14916h;
            if (a42 != null) {
                String TAG = this.f14917i;
                kotlin.jvm.internal.g.d(TAG, "TAG");
                ((B4) a42).a(TAG, "onAdView - event - " + ((int) b10));
            }
            float f10 = this.f14918j;
            int i10 = 0;
            if (b10 == 13) {
                f10 = 0.0f;
            } else if (b10 != 14) {
                if (b10 == 6) {
                    r rVar = this.f15271a;
                    if (rVar instanceof U7) {
                        View videoContainerView = ((U7) rVar).getVideoContainerView();
                        C1641g8 c1641g8 = videoContainerView instanceof C1641g8 ? (C1641g8) videoContainerView : null;
                        if (c1641g8 != null) {
                            i10 = c1641g8.getVideoView().getDuration();
                            Object tag = c1641g8.getVideoView().getTag();
                            f10 = a(tag instanceof W7 ? (W7) tag : null);
                        }
                    }
                } else if (b10 == 5) {
                    r rVar2 = this.f15271a;
                    if ((rVar2 instanceof U7) && ((U7) rVar2).k()) {
                        return;
                    }
                }
            }
            T8 t82 = this.f14914f;
            if (t82 != null) {
                t82.a(b10, i10, f10, this.f14915g);
            }
        } catch (Exception e10) {
            A4 a43 = this.f14916h;
            if (a43 != null) {
                String TAG2 = this.f14917i;
                kotlin.jvm.internal.g.d(TAG2, "TAG");
                ((B4) a43).b(TAG2, "Exception in onAdEvent with message : " + e10.getMessage());
            }
            Q4 q42 = Q4.f14590a;
            Q4.c.a(new J1(e10));
        } finally {
            this.f14913e.a(b10);
        }
    }

    @Override // com.inmobi.media.AbstractC1701kc
    public final void a(Context context, byte b10) {
        kotlin.jvm.internal.g.e(context, "context");
        A4 a42 = this.f14916h;
        if (a42 != null) {
            String TAG = this.f14917i;
            kotlin.jvm.internal.g.d(TAG, "TAG");
            ((B4) a42).c(TAG, "onActivityStateChanged - state - " + ((int) b10));
        }
        this.f14913e.a(context, b10);
    }

    @Override // com.inmobi.media.AbstractC1701kc
    public final void a() {
        super.a();
        A4 a42 = this.f14916h;
        if (a42 != null) {
            String TAG = this.f14917i;
            kotlin.jvm.internal.g.d(TAG, "TAG");
            ((B4) a42).a(TAG, "destroy");
        }
        try {
            try {
                this.f14919k.clear();
                WeakReference weakReference = this.f14920l;
                if (weakReference != null) {
                    weakReference.clear();
                }
                this.f14914f = null;
            } catch (Exception e10) {
                A4 a43 = this.f14916h;
                if (a43 != null) {
                    String TAG2 = this.f14917i;
                    kotlin.jvm.internal.g.d(TAG2, "TAG");
                    ((B4) a43).b(TAG2, "Exception in destroy with message : " + e10.getMessage());
                }
                Q4 q42 = Q4.f14590a;
                Q4.c.a(new J1(e10));
            }
        } finally {
            this.f14913e.a();
        }
    }

    public final float a(W7 w7) {
        if (w7 == null) {
            return 0.0f;
        }
        Object obj = w7.f14804t.get("currentMediaVolume");
        Integer num = obj instanceof Integer ? (Integer) obj : null;
        Object obj2 = w7.f14804t.get("lastMediaVolume");
        Integer num2 = obj2 instanceof Integer ? (Integer) obj2 : null;
        if (num == null || num2 == null || num.intValue() <= 0 || num2.intValue() != 0) {
            return 0.0f;
        }
        return this.f14918j;
    }
}
