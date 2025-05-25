package com.inmobi.media;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.iab.omid.library.inmobi.Omid;
import com.iab.omid.library.inmobi.adsession.AdSession;
import com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class X8 extends AbstractC1687jc {

    /* renamed from: h  reason: collision with root package name */
    public static final /* synthetic */ int f14852h = 0;

    /* renamed from: e  reason: collision with root package name */
    public final AbstractC1701kc f14853e;

    /* renamed from: f  reason: collision with root package name */
    public T8 f14854f;

    /* renamed from: g  reason: collision with root package name */
    public final A4 f14855g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X8(r adContainer, AbstractC1701kc mViewableAd, T8 t82, A4 a42) {
        super(adContainer);
        kotlin.jvm.internal.g.e(adContainer, "adContainer");
        kotlin.jvm.internal.g.e(mViewableAd, "mViewableAd");
        this.f14853e = mViewableAd;
        this.f14854f = t82;
        this.f14855g = a42;
    }

    @Override // com.inmobi.media.AbstractC1701kc
    public final View a(View view, ViewGroup parent, boolean z10) {
        kotlin.jvm.internal.g.e(parent, "parent");
        return this.f14853e.a(view, parent, z10);
    }

    @Override // com.inmobi.media.AbstractC1701kc
    public final View b() {
        return this.f14853e.b();
    }

    @Override // com.inmobi.media.AbstractC1701kc
    public final View d() {
        A4 a42 = this.f14855g;
        if (a42 != null) {
            ((B4) a42).c("X8", "inflateView called");
        }
        return this.f14853e.d();
    }

    @Override // com.inmobi.media.AbstractC1701kc
    public final void e() {
        try {
            try {
                A4 a42 = this.f14855g;
                if (a42 != null) {
                    ((B4) a42).a("X8", "stopTrackingForImpression");
                }
                T8 t82 = this.f14854f;
                if (t82 != null) {
                    t82.a();
                }
            } catch (Exception e10) {
                A4 a43 = this.f14855g;
                if (a43 != null) {
                    ((B4) a43).b("X8", "Exception in stopTrackingForImpression with message : " + e10.getMessage());
                }
            }
        } finally {
            this.f14853e.e();
        }
    }

    @Override // com.inmobi.media.AbstractC1701kc
    public final void a(View childView, FriendlyObstructionPurpose obstructionCode) {
        kotlin.jvm.internal.g.e(childView, "childView");
        kotlin.jvm.internal.g.e(obstructionCode, "obstructionCode");
        T8 t82 = this.f14854f;
        if (t82 != null) {
            t82.a(childView, obstructionCode);
        }
    }

    @Override // com.inmobi.media.AbstractC1701kc
    public final void a(View childView) {
        kotlin.jvm.internal.g.e(childView, "childView");
        T8 t82 = this.f14854f;
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
        View view;
        A4 a42 = this.f14855g;
        if (a42 != null) {
            ((B4) a42).a("X8", "startTrackingForImpression");
        }
        try {
            try {
                if (this.f15273d.getViewability().getOmidConfig().isOmidEnabled()) {
                    AbstractC1558a9.f14936a.getClass();
                    if (Omid.isActive()) {
                        r rVar = this.f15271a;
                        if (rVar instanceof M6) {
                            M6 m62 = (M6) rVar;
                            view = m62.G;
                            if (view == null) {
                                view = m62.H;
                            }
                        } else {
                            View b10 = this.f14853e.b();
                            view = b10 instanceof WebView ? (WebView) b10 : null;
                        }
                        if (view != null) {
                            A4 a43 = this.f14855g;
                            if (a43 != null) {
                                ((B4) a43).a("X8", "creating OMSDK session");
                            }
                            T8 t82 = this.f14854f;
                            if (t82 != null) {
                                t82.a(view, hashMap, (View) null);
                            }
                        }
                    }
                }
            } catch (Exception e10) {
                A4 a44 = this.f14855g;
                if (a44 != null) {
                    ((B4) a44).b("X8", "Exception in startTrackingForImpression with message : " + e10.getMessage());
                }
            }
        } finally {
            this.f14853e.a(hashMap);
        }
    }

    @Override // com.inmobi.media.AbstractC1701kc
    public final void a(byte b10) {
        this.f14853e.a(b10);
    }

    @Override // com.inmobi.media.AbstractC1701kc
    public final void a(Context context, byte b10) {
        kotlin.jvm.internal.g.e(context, "context");
        this.f14853e.a(context, b10);
    }

    @Override // com.inmobi.media.AbstractC1701kc
    public final void a() {
        A4 a42 = this.f14855g;
        if (a42 != null) {
            ((B4) a42).c("X8", "destroy");
        }
        super.a();
        try {
            this.f14854f = null;
        } catch (Exception e10) {
            A4 a43 = this.f14855g;
            if (a43 != null) {
                ((B4) a43).a("X8", "Exception in destroy with message", e10);
            }
        } finally {
            this.f14853e.a();
        }
    }
}
