package com.inmobi.media;

import java.util.HashMap;

/* loaded from: classes2.dex */
public final class T7 implements InterfaceC1768q {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ U7 f14709a;

    public T7(U7 u7) {
        this.f14709a = u7;
    }

    @Override // com.inmobi.media.InterfaceC1768q
    public final void a() {
        kotlin.jvm.internal.g.d(this.f14709a.W, "access$getTAG$p(...)");
        C1820u0 c1820u0 = this.f14709a.f14480v;
        if (c1820u0 != null) {
            c1820u0.c();
        }
    }

    @Override // com.inmobi.media.InterfaceC1768q
    public final void b(Object obj) {
        W7 w7;
        AbstractC1701kc viewableAd;
        kotlin.jvm.internal.g.d(this.f14709a.W, "access$getTAG$p(...)");
        if (obj instanceof W7) {
            w7 = (W7) obj;
        } else {
            w7 = null;
        }
        if (w7 != null) {
            HashMap hashMap = w7.f14804t;
            Boolean bool = Boolean.FALSE;
            hashMap.put("didRequestFullScreen", bool);
            hashMap.put("isFullScreen", bool);
            w7.f14807w = null;
            HashMap hashMap2 = w7.f14804t;
            hashMap2.put("didRequestFullScreen", bool);
            hashMap2.put("isFullScreen", bool);
            w7.f14807w = null;
        }
        U7 u7 = this.f14709a;
        if (u7.f14460a == 0) {
            AbstractC1701kc viewableAd2 = u7.getViewableAd();
            if (viewableAd2 != null) {
                viewableAd2.a((byte) 2);
            }
            M6 m62 = this.f14709a.f14479u;
            if (m62 != null && (viewableAd = m62.getViewableAd()) != null) {
                viewableAd.a((byte) 16);
            }
            if (w7 != null) {
                w7.a("exitFullscreen", this.f14709a.j(w7), (F6) null, this.f14709a.V);
            }
        } else {
            AbstractC1701kc viewableAd3 = u7.getViewableAd();
            if (viewableAd3 != null) {
                viewableAd3.a((byte) 3);
            }
        }
        C1820u0 c1820u0 = this.f14709a.f14480v;
        if (c1820u0 != null) {
            c1820u0.b();
        }
        A4 a42 = this.f14709a.V;
        if (a42 != null) {
            ((B4) a42).a();
        }
    }

    @Override // com.inmobi.media.InterfaceC1768q
    public final void a(Object obj) {
        if (this.f14709a.f() == null) {
            return;
        }
        W7 w7 = obj instanceof W7 ? (W7) obj : null;
        kotlin.jvm.internal.g.d(this.f14709a.W, "access$getTAG$p(...)");
        if (w7 != null) {
            HashMap hashMap = w7.f14804t;
            Boolean bool = Boolean.TRUE;
            hashMap.put("didRequestFullScreen", bool);
            hashMap.put("isFullScreen", bool);
            hashMap.put("shouldAutoPlay", bool);
            W6 w62 = w7.f14807w;
            if (w62 != null) {
                HashMap hashMap2 = w62.f14804t;
                hashMap2.put("didRequestFullScreen", bool);
                hashMap2.put("isFullScreen", bool);
                hashMap2.put("shouldAutoPlay", bool);
            }
        }
        U7 u7 = this.f14709a;
        if (u7.f14460a == 0) {
            AbstractC1701kc viewableAd = u7.getViewableAd();
            if (viewableAd != null) {
                viewableAd.a((byte) 1);
            }
            if (w7 != null) {
                w7.a("fullscreen", this.f14709a.j(w7), (F6) null, this.f14709a.V);
            }
        }
        C1820u0 c1820u0 = this.f14709a.f14480v;
        if (c1820u0 != null) {
            c1820u0.d();
        }
    }
}
