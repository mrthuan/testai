package com.inmobi.media;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.iab.omid.library.inmobi.Omid;
import com.iab.omid.library.inmobi.adsession.AdEvents;
import com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class Y8 extends AbstractC1687jc {

    /* renamed from: e  reason: collision with root package name */
    public final AbstractC1701kc f14885e;

    /* renamed from: f  reason: collision with root package name */
    public T8 f14886f;

    /* renamed from: g  reason: collision with root package name */
    public final A4 f14887g;

    /* renamed from: h  reason: collision with root package name */
    public final String f14888h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y8(r adContainer, AbstractC1701kc mViewableAd, T8 t82, A4 a42) {
        super(adContainer);
        kotlin.jvm.internal.g.e(adContainer, "adContainer");
        kotlin.jvm.internal.g.e(mViewableAd, "mViewableAd");
        this.f14885e = mViewableAd;
        this.f14886f = t82;
        this.f14887g = a42;
        this.f14888h = "Y8";
    }

    @Override // com.inmobi.media.AbstractC1701kc
    public final View a(View view, ViewGroup parent, boolean z10) {
        kotlin.jvm.internal.g.e(parent, "parent");
        return this.f14885e.a(view, parent, z10);
    }

    @Override // com.inmobi.media.AbstractC1701kc
    public final View b() {
        return this.f14885e.b();
    }

    @Override // com.inmobi.media.AbstractC1701kc
    public final View d() {
        A4 a42 = this.f14887g;
        if (a42 != null) {
            String TAG = this.f14888h;
            kotlin.jvm.internal.g.d(TAG, "TAG");
            ((B4) a42).c(TAG, "inflateView");
        }
        return this.f14885e.d();
    }

    @Override // com.inmobi.media.AbstractC1701kc
    public final void e() {
        try {
            try {
                A4 a42 = this.f14887g;
                if (a42 != null) {
                    String TAG = this.f14888h;
                    kotlin.jvm.internal.g.d(TAG, "TAG");
                    ((B4) a42).c(TAG, "stopTrackingForImpression");
                }
                T8 t82 = this.f14886f;
                if (t82 != null) {
                    t82.a();
                }
            } catch (Exception e10) {
                A4 a43 = this.f14887g;
                if (a43 != null) {
                    String TAG2 = this.f14888h;
                    kotlin.jvm.internal.g.d(TAG2, "TAG");
                    ((B4) a43).b(TAG2, "Exception in stopTrackingForImpression with message : " + e10.getMessage());
                }
            }
        } finally {
            this.f14885e.e();
        }
    }

    @Override // com.inmobi.media.AbstractC1701kc
    public final void a(View childView, FriendlyObstructionPurpose obstructionCode) {
        kotlin.jvm.internal.g.e(childView, "childView");
        kotlin.jvm.internal.g.e(obstructionCode, "obstructionCode");
        this.f14885e.a(childView, obstructionCode);
    }

    public final void b(HashMap hashMap) {
        View g10;
        A4 a42 = this.f14887g;
        if (a42 != null) {
            String TAG = this.f14888h;
            kotlin.jvm.internal.g.d(TAG, "TAG");
            ((B4) a42).c(TAG, "registerView");
        }
        r rVar = this.f15271a;
        if (!(rVar instanceof M6) || (g10 = ((M6) rVar).g()) == null) {
            return;
        }
        A4 a43 = this.f14887g;
        if (a43 != null) {
            String TAG2 = this.f14888h;
            kotlin.jvm.internal.g.d(TAG2, "TAG");
            ((B4) a43).a(TAG2, "creating AD session");
        }
        T8 t82 = this.f14886f;
        if (t82 != null) {
            t82.a(g10, hashMap, this.f14885e.b());
        }
    }

    @Override // com.inmobi.media.AbstractC1701kc
    public final void a(View childView) {
        kotlin.jvm.internal.g.e(childView, "childView");
        this.f14885e.a(childView);
    }

    @Override // com.inmobi.media.AbstractC1701kc
    public final void a(HashMap hashMap) {
        A4 a42 = this.f14887g;
        if (a42 != null) {
            String TAG = this.f14888h;
            kotlin.jvm.internal.g.d(TAG, "TAG");
            ((B4) a42).a(TAG, "startTrackingForImpression");
        }
        try {
            try {
                if (this.f15273d.getViewability().getOmidConfig().isOmidEnabled()) {
                    AbstractC1558a9.f14936a.getClass();
                    if (Omid.isActive()) {
                        A4 a43 = this.f14887g;
                        if (a43 != null) {
                            String TAG2 = this.f14888h;
                            kotlin.jvm.internal.g.d(TAG2, "TAG");
                            ((B4) a43).a(TAG2, "OMID enabled and initialised");
                        }
                        b(hashMap);
                        a((byte) 19);
                    }
                }
            } catch (Exception e10) {
                A4 a44 = this.f14887g;
                if (a44 != null) {
                    String TAG3 = this.f14888h;
                    kotlin.jvm.internal.g.d(TAG3, "TAG");
                    ((B4) a44).b(TAG3, "Exception in startTrackingForImpression with message : " + e10.getMessage());
                }
            }
        } finally {
            this.f14885e.a(hashMap);
        }
    }

    @Override // com.inmobi.media.AbstractC1701kc
    public final void a(byte b10) {
        C1793s c1793s;
        AdEvents adEvents;
        AdEvents adEvents2;
        try {
            try {
                A4 a42 = this.f14887g;
                if (a42 != null) {
                    String TAG = this.f14888h;
                    kotlin.jvm.internal.g.d(TAG, "TAG");
                    ((B4) a42).c(TAG, "onAdEvent - event - " + ((int) b10));
                }
                T8 t82 = this.f14886f;
                if (t82 != null && T8.a(t82.f14713e, (byte) 2)) {
                    byte b11 = b10;
                    if (b11 == 0) {
                        C1793s c1793s2 = t82.f14715g;
                        if (c1793s2 != null && (adEvents2 = c1793s2.f15425a) != null) {
                            adEvents2.impressionOccurred();
                        }
                    } else if (b11 == 19 && (c1793s = t82.f14715g) != null && (adEvents = c1793s.f15425a) != null) {
                        adEvents.loaded();
                    }
                }
            } catch (Exception e10) {
                A4 a43 = this.f14887g;
                if (a43 != null) {
                    String TAG2 = this.f14888h;
                    kotlin.jvm.internal.g.d(TAG2, "TAG");
                    ((B4) a43).b(TAG2, "Exception in onAdEvent with message : " + e10.getMessage());
                }
            }
        } finally {
            this.f14885e.a(b10);
        }
    }

    @Override // com.inmobi.media.AbstractC1701kc
    public final void a(Context context, byte b10) {
        kotlin.jvm.internal.g.e(context, "context");
        this.f14885e.a(context, b10);
    }

    @Override // com.inmobi.media.AbstractC1701kc
    public final void a() {
        super.a();
        A4 a42 = this.f14887g;
        if (a42 != null) {
            String TAG = this.f14888h;
            kotlin.jvm.internal.g.d(TAG, "TAG");
            ((B4) a42).c(TAG, "destroy");
        }
        try {
            this.f14886f = null;
        } catch (Exception e10) {
            A4 a43 = this.f14887g;
            if (a43 != null) {
                String TAG2 = this.f14888h;
                kotlin.jvm.internal.g.d(TAG2, "TAG");
                ((B4) a43).b(TAG2, "Exception in destroy with message : " + e10.getMessage());
            }
        } finally {
            this.f14885e.a();
        }
    }
}
