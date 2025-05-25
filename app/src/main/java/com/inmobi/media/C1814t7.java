package com.inmobi.media;

/* renamed from: com.inmobi.media.t7  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1814t7 implements InterfaceC1571b8 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C1866x7 f15473a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ W7 f15474b;

    public C1814t7(C1866x7 c1866x7, W7 w7) {
        this.f15473a = c1866x7;
        this.f15474b = w7;
    }

    public final void a(byte b10) {
        M6 m62 = this.f15473a.f15636b;
        if (!m62.f14477s && (m62 instanceof U7)) {
            U7 u7 = (U7) m62;
            W7 videoAsset = this.f15474b;
            kotlin.jvm.internal.g.e(videoAsset, "videoAsset");
            if (!u7.f14477s) {
                Boolean bool = null;
                if (b10 == 0) {
                    videoAsset.a("firstQuartile", u7.j(videoAsset), (F6) null, u7.V);
                    A4 a42 = u7.V;
                    if (a42 != null) {
                        String TAG = u7.W;
                        kotlin.jvm.internal.g.d(TAG, "TAG");
                        ((B4) a42).c(TAG, "onVideoQuartileEvent(Q1)");
                    }
                    AbstractC1701kc abstractC1701kc = u7.f14473o;
                    if (abstractC1701kc != null) {
                        abstractC1701kc.a((byte) 9);
                    }
                } else if (b10 == 1) {
                    videoAsset.a("midpoint", u7.j(videoAsset), (F6) null, u7.V);
                    A4 a43 = u7.V;
                    if (a43 != null) {
                        String TAG2 = u7.W;
                        kotlin.jvm.internal.g.d(TAG2, "TAG");
                        ((B4) a43).c(TAG2, "onVideoQuartileEvent(Q2)");
                    }
                    AbstractC1701kc abstractC1701kc2 = u7.f14473o;
                    if (abstractC1701kc2 != null) {
                        abstractC1701kc2.a((byte) 10);
                    }
                } else if (b10 == 2) {
                    videoAsset.a("thirdQuartile", u7.j(videoAsset), (F6) null, u7.V);
                    A4 a44 = u7.V;
                    if (a44 != null) {
                        String TAG3 = u7.W;
                        kotlin.jvm.internal.g.d(TAG3, "TAG");
                        ((B4) a44).c(TAG3, "onVideoQuartileEvent(Q3)");
                    }
                    AbstractC1701kc abstractC1701kc3 = u7.f14473o;
                    if (abstractC1701kc3 != null) {
                        abstractC1701kc3.a((byte) 11);
                    }
                } else if (b10 == 3) {
                    Object obj = videoAsset.f14804t.get("didQ4Fire");
                    if (obj instanceof Boolean) {
                        bool = (Boolean) obj;
                    }
                    if (kotlin.jvm.internal.g.a(bool, Boolean.FALSE)) {
                        u7.d(videoAsset);
                    }
                } else {
                    A4 a45 = u7.V;
                    if (a45 != null) {
                        String TAG4 = u7.W;
                        kotlin.jvm.internal.g.d(TAG4, "TAG");
                        ((B4) a45).b(TAG4, "Unhandled quartileEvent ( " + ((int) b10) + " ) for Native Video");
                    }
                }
            }
            if (3 == b10) {
                try {
                    ((U7) this.f15473a.f15636b).c(this.f15474b);
                } catch (Exception e10) {
                    C1866x7 c1866x7 = this.f15473a;
                    A4 a46 = c1866x7.f15639f;
                    if (a46 != null) {
                        String str = c1866x7.f15640g;
                        ((B4) a46).b(str, Cc.a(e10, A5.a(str, "access$getTAG$p(...)", "SDK encountered unexpected error in handling the onVideoCompleted event; ")));
                    }
                }
            }
        }
    }
}
