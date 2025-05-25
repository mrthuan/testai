package com.inmobi.media;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.gms.common.api.Api;
import com.iab.omid.library.inmobi.adsession.media.Position;
import com.iab.omid.library.inmobi.adsession.media.VastProperties;
import com.inmobi.commons.core.configs.AdConfig;
import com.inmobi.media.U7;
import com.inmobi.media.W7;
import java.lang.ref.WeakReference;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class U7 extends M6 {
    public final String T;
    public final String U;
    public final A4 V;
    public final String W;
    public final String X;
    public WeakReference Y;
    public final T7 Z;

    /* renamed from: a0  reason: collision with root package name */
    public final S7 f14734a0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U7(Context context, byte b10, C1682j7 dataModel, String impressionId, Set set, AdConfig adConfig, long j10, boolean z10, String creativeId, A2 a22, L5 l52, A4 a42) {
        super(context, b10, dataModel, impressionId, set, adConfig, j10, z10, creativeId, a22, l52, a42);
        kotlin.jvm.internal.g.e(context, "context");
        kotlin.jvm.internal.g.e(dataModel, "dataModel");
        kotlin.jvm.internal.g.e(impressionId, "impressionId");
        kotlin.jvm.internal.g.e(adConfig, "adConfig");
        kotlin.jvm.internal.g.e(creativeId, "creativeId");
        this.T = impressionId;
        this.U = creativeId;
        this.V = a42;
        this.W = "U7";
        this.X = "InMobi";
        this.Z = new T7(this);
        this.f14734a0 = new S7(this);
    }

    public final void a(View view, final boolean z10) {
        final C1627f8 c1627f8 = (C1627f8) view.findViewById(Api.BaseClientBuilder.API_PRIORITY_OTHER);
        if (c1627f8 != null) {
            Object tag = c1627f8.getTag();
            final W7 w7 = tag instanceof W7 ? (W7) tag : null;
            if (w7 != null) {
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: qb.z
                    @Override // java.lang.Runnable
                    public final void run() {
                        U7.a(W7.this, z10, this, c1627f8);
                    }
                });
            }
        }
    }

    @Override // com.inmobi.media.M6
    public final void b(View view) {
        if (this.f14475q || this.f14477s || !(view instanceof C1627f8)) {
            return;
        }
        this.f14475q = true;
        A2 a22 = this.f14466h;
        if (a22 != null) {
            a22.a();
        }
        Object tag = ((C1627f8) view).getTag();
        if (tag instanceof W7) {
            String TAG = this.W;
            kotlin.jvm.internal.g.d(TAG, "TAG");
            W7 w7 = (W7) tag;
            Object obj = w7.f14804t.get("didImpressionFire");
            if (kotlin.jvm.internal.g.a(obj instanceof Boolean ? (Boolean) obj : null, Boolean.TRUE)) {
                return;
            }
            ArrayList arrayList = w7.f14803s;
            HashMap j10 = j(w7);
            Iterator it = arrayList.iterator();
            List<String> list = null;
            while (it.hasNext()) {
                P7 p72 = (P7) it.next();
                if (kotlin.jvm.internal.g.a("VideoImpression", p72.c)) {
                    if (kotlin.text.j.M(p72.f14579e, "http", false)) {
                        W6.a(p72, j10, (F6) null, this.V);
                    }
                    HashMap hashMap = p72.f14580f;
                    Object obj2 = hashMap != null ? hashMap.get("referencedEvents") : null;
                    list = obj2 instanceof List ? (List) obj2 : null;
                    if (list != null) {
                        for (String str : list) {
                            w7.a(str, j10, (F6) null, this.V);
                        }
                    }
                }
            }
            if (list == null || list.isEmpty()) {
                w7.a("start", j10, (F6) null, this.V);
                w7.a("Impression", j10, this.N, this.V);
            }
            C1570b7 c1570b7 = this.f14461b.f15220f;
            if (c1570b7 != null) {
                c1570b7.a("Impression", j(w7), this.N, this.V);
            }
            w7.f14804t.put("didImpressionFire", Boolean.TRUE);
            AbstractC1701kc abstractC1701kc = this.f14473o;
            if (abstractC1701kc != null) {
                abstractC1701kc.a((byte) 0);
            }
            C1820u0 c1820u0 = this.f14480v;
            if (c1820u0 != null) {
                c1820u0.f();
            }
        }
    }

    @Override // com.inmobi.media.M6
    public final void c(W6 asset) {
        kotlin.jvm.internal.g.e(asset, "asset");
        byte b10 = asset.f14795k;
        if (b10 != 0) {
            if (b10 == 2) {
                try {
                    if (1 == this.f14460a) {
                        super.c(asset);
                        if (!kotlin.jvm.internal.g.a("VIDEO", asset.c)) {
                            A4 a42 = this.V;
                            if (a42 != null) {
                                String TAG = this.W;
                                kotlin.jvm.internal.g.d(TAG, "TAG");
                                ((B4) a42).b(TAG, "Action 2 not valid for asset of type: " + asset.c);
                                return;
                            }
                            return;
                        }
                        View videoContainerView = getVideoContainerView();
                        C1641g8 c1641g8 = videoContainerView instanceof C1641g8 ? (C1641g8) videoContainerView : null;
                        if (c1641g8 != null) {
                            c1641g8.getVideoView().c();
                            c1641g8.getVideoView().j();
                        }
                        s();
                        return;
                    }
                    C1820u0 c1820u0 = this.f14480v;
                    if (c1820u0 != null) {
                        c1820u0.h();
                    }
                    s();
                } catch (Exception e10) {
                    A4 a43 = this.V;
                    if (a43 != null) {
                        String str = this.W;
                        StringBuilder a10 = A5.a(str, "TAG", "Action 2 not valid for asset of type: ");
                        a10.append(asset.c);
                        ((B4) a43).b(str, a10.toString());
                    }
                    Q4 q42 = Q4.f14590a;
                    Q4.c.a(AbstractC1863x4.a(e10, "event"));
                }
            } else if (b10 == 3) {
                try {
                    if (!kotlin.jvm.internal.g.a("VIDEO", asset.c)) {
                        A4 a44 = this.V;
                        if (a44 != null) {
                            String TAG2 = this.W;
                            kotlin.jvm.internal.g.d(TAG2, "TAG");
                            ((B4) a44).b(TAG2, "Action 3 not valid for asset of type: " + asset.c);
                            return;
                        }
                        return;
                    }
                    S9 s92 = this.G;
                    if (s92 != null) {
                        A4 a45 = s92.f14665j;
                        if (a45 != null) {
                            String TAG3 = S9.O0;
                            kotlin.jvm.internal.g.d(TAG3, "TAG");
                            ((B4) a45).a(TAG3, "replayToInterActive");
                        }
                        s92.b("window.imraid.broadcastEvent('replay');");
                    }
                    View g10 = g();
                    if (g10 != null) {
                        O7 a11 = M6.a(g10);
                        if (a11 != null) {
                            a11.d();
                        }
                        ViewParent parent = g10.getParent();
                        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                        if (viewGroup != null) {
                            viewGroup.removeView(g10);
                        }
                    }
                    View videoContainerView2 = getVideoContainerView();
                    C1641g8 c1641g82 = videoContainerView2 instanceof C1641g8 ? (C1641g8) videoContainerView2 : null;
                    if (c1641g82 != null) {
                        c1641g82.getVideoView().k();
                        c1641g82.getVideoView().start();
                    }
                } catch (Exception e11) {
                    A4 a46 = this.V;
                    if (a46 != null) {
                        String str2 = this.W;
                        ((B4) a46).b(str2, Cc.a(e11, A5.a(str2, "TAG", "Encountered unexpected error in handling replay action on video: ")));
                    }
                    Z5.a((byte) 2, this.X, "SDK encountered unexpected error in replaying video");
                    Q4 q43 = Q4.f14590a;
                    Q4.c.a(AbstractC1863x4.a(e11, "event"));
                }
            } else if (b10 == 1) {
                super.c(asset);
            } else if (b10 == 4) {
                try {
                    if (this.f14460a == 0) {
                        View videoContainerView3 = getVideoContainerView();
                        C1641g8 c1641g83 = videoContainerView3 instanceof C1641g8 ? (C1641g8) videoContainerView3 : null;
                        if (c1641g83 != null) {
                            C1627f8 videoView = c1641g83.getVideoView();
                            Object tag = videoView.getTag();
                            W7 w7 = tag instanceof W7 ? (W7) tag : null;
                            if (videoView.getState() == 1 || w7 == null) {
                                return;
                            }
                            try {
                                a(w7, videoView);
                                return;
                            } catch (Exception e12) {
                                A4 a47 = this.V;
                                if (a47 != null) {
                                    String TAG4 = this.W;
                                    kotlin.jvm.internal.g.d(TAG4, "TAG");
                                    ((B4) a47).b(TAG4, "SDK encountered unexpected error in handling the onVideoRequestedFullScreen event; " + e12.getMessage());
                                }
                                Q4 q44 = Q4.f14590a;
                                Q4.c.a(new J1(e12));
                                return;
                            }
                        }
                        return;
                    }
                    A4 a48 = this.V;
                    if (a48 != null) {
                        String TAG5 = this.W;
                        kotlin.jvm.internal.g.d(TAG5, "TAG");
                        ((B4) a48).b(TAG5, "Invalid action! Online inline videos can be expanded to fullscreen!");
                    }
                } catch (Exception e13) {
                    A4 a49 = this.V;
                    if (a49 != null) {
                        String str3 = this.W;
                        ((B4) a49).b(str3, Cc.a(e13, A5.a(str3, "TAG", "Encountered unexpected error in handling fullscreen action on video: ")));
                    }
                    Z5.a((byte) 2, this.X, "SDK encountered unexpected error in expanding video to fullscreen");
                    Q4 q45 = Q4.f14590a;
                    Q4.c.a(AbstractC1863x4.a(e13, "event"));
                }
            } else if (b10 == 5) {
                try {
                    View videoContainerView4 = getVideoContainerView();
                    C1641g8 c1641g84 = videoContainerView4 instanceof C1641g8 ? (C1641g8) videoContainerView4 : null;
                    if (c1641g84 != null) {
                        Object tag2 = c1641g84.getVideoView().getTag();
                        W7 w72 = tag2 instanceof W7 ? (W7) tag2 : null;
                        if (w72 != null) {
                            HashMap hashMap = w72.f14804t;
                            Boolean bool = Boolean.TRUE;
                            hashMap.put("shouldAutoPlay", bool);
                            W6 w62 = w72.f14807w;
                            if (w62 != null) {
                                w62.f14804t.put("shouldAutoPlay", bool);
                            }
                        }
                        c1641g84.getVideoView().start();
                    }
                } catch (Exception e14) {
                    A4 a410 = this.V;
                    if (a410 != null) {
                        String str4 = this.W;
                        ((B4) a410).b(str4, Cc.a(e14, A5.a(str4, "TAG", "Encountered unexpected error in handling play action on video: ")));
                    }
                    Z5.a((byte) 2, this.X, "SDK encountered unexpected error in playing video");
                    Q4 q46 = Q4.f14590a;
                    Q4.c.a(AbstractC1863x4.a(e14, "event"));
                }
            } else {
                try {
                    if (1 == this.f14460a) {
                        super.c(asset);
                        if (!kotlin.jvm.internal.g.a("VIDEO", asset.c)) {
                            A4 a411 = this.V;
                            if (a411 != null) {
                                String TAG6 = this.W;
                                kotlin.jvm.internal.g.d(TAG6, "TAG");
                                ((B4) a411).b(TAG6, "Action 2 not valid for asset of type: " + asset.c);
                                return;
                            }
                            return;
                        }
                        View videoContainerView5 = getVideoContainerView();
                        C1641g8 c1641g85 = videoContainerView5 instanceof C1641g8 ? (C1641g8) videoContainerView5 : null;
                        if (c1641g85 != null) {
                            c1641g85.getVideoView().c();
                            c1641g85.getVideoView().j();
                        }
                        s();
                        return;
                    }
                    C1820u0 c1820u02 = this.f14480v;
                    if (c1820u02 != null) {
                        c1820u02.h();
                    }
                    s();
                } catch (Exception e15) {
                    A4 a412 = this.V;
                    if (a412 != null) {
                        String str5 = this.W;
                        StringBuilder a12 = A5.a(str5, "TAG", "Action 2 not valid for asset of type: ");
                        a12.append(asset.c);
                        ((B4) a412).b(str5, a12.toString());
                    }
                    Q4 q47 = Q4.f14590a;
                    Q4.c.a(AbstractC1863x4.a(e15, "event"));
                }
            }
        }
    }

    public final void d(W7 videoAsset) {
        kotlin.jvm.internal.g.e(videoAsset, "videoAsset");
        A4 a42 = this.V;
        if (a42 != null) {
            String str = this.W;
            StringBuilder a10 = A5.a(str, "TAG", "Firing Q4 beacons for completion at ");
            a10.append(videoAsset.D);
            ((B4) a42).c(str, a10.toString());
        }
        videoAsset.f14804t.put("didQ4Fire", Boolean.TRUE);
        videoAsset.a("complete", j(videoAsset), (F6) null, this.V);
        AbstractC1701kc abstractC1701kc = this.f14473o;
        if (abstractC1701kc != null) {
            abstractC1701kc.a((byte) 12);
        }
        A4 a43 = this.V;
        if (a43 != null) {
            String TAG = this.W;
            kotlin.jvm.internal.g.d(TAG, "TAG");
            ((B4) a43).c(TAG, "onVideoQuartileEvent(Q4)");
        }
    }

    public final void e(W7 videoAsset) {
        kotlin.jvm.internal.g.e(videoAsset, "videoAsset");
        if (this.f14477s) {
            return;
        }
        videoAsset.f14804t.put("lastMediaVolume", 0);
        videoAsset.a("mute", j(videoAsset), (F6) null, this.V);
        A4 a42 = this.V;
        if (a42 != null) {
            String TAG = this.W;
            kotlin.jvm.internal.g.d(TAG, "TAG");
            ((B4) a42).c(TAG, "onVideoMuted");
        }
        AbstractC1701kc abstractC1701kc = this.f14473o;
        if (abstractC1701kc != null) {
            abstractC1701kc.a((byte) 13);
        }
    }

    public final void f(W7 videoAsset) {
        kotlin.jvm.internal.g.e(videoAsset, "videoAsset");
        if (this.f14477s) {
            return;
        }
        O7 a10 = M6.a(g());
        if (a10 != null) {
            a10.b();
        }
        videoAsset.a("pause", j(videoAsset), (F6) null, this.V);
        A4 a42 = this.V;
        if (a42 != null) {
            String TAG = this.W;
            kotlin.jvm.internal.g.d(TAG, "TAG");
            ((B4) a42).c(TAG, "onVideoPaused");
        }
        AbstractC1701kc abstractC1701kc = this.f14473o;
        if (abstractC1701kc != null) {
            abstractC1701kc.a((byte) 7);
        }
    }

    public final void g(W7 videoAsset) {
        Integer num;
        int i10;
        Integer num2;
        int i11;
        Integer num3;
        int i12;
        Integer num4;
        kotlin.jvm.internal.g.e(videoAsset, "videoAsset");
        if (this.f14477s) {
            return;
        }
        A4 a42 = this.V;
        if (a42 != null) {
            String TAG = this.W;
            kotlin.jvm.internal.g.d(TAG, "TAG");
            ((B4) a42).c(TAG, "onVideoPlayed");
        }
        Boolean bool = null;
        if (this.f14460a == 0) {
            Object obj = videoAsset.f14804t.get("currentMediaVolume");
            if (obj instanceof Integer) {
                num = (Integer) obj;
            } else {
                num = null;
            }
            int i13 = 0;
            if (num != null) {
                i10 = num.intValue();
            } else {
                i10 = 0;
            }
            Object obj2 = videoAsset.f14804t.get("lastMediaVolume");
            if (obj2 instanceof Integer) {
                num2 = (Integer) obj2;
            } else {
                num2 = null;
            }
            if (num2 != null) {
                i11 = num2.intValue();
            } else {
                i11 = 0;
            }
            if (i10 > 0 && i11 == 0) {
                i(videoAsset);
            }
            Object obj3 = videoAsset.f14804t.get("currentMediaVolume");
            if (obj3 instanceof Integer) {
                num3 = (Integer) obj3;
            } else {
                num3 = null;
            }
            if (num3 != null) {
                i12 = num3.intValue();
            } else {
                i12 = 0;
            }
            Object obj4 = videoAsset.f14804t.get("lastMediaVolume");
            if (obj4 instanceof Integer) {
                num4 = (Integer) obj4;
            } else {
                num4 = null;
            }
            if (num4 != null) {
                i13 = num4.intValue();
            }
            if (i12 == 0 && i13 > 0) {
                e(videoAsset);
            }
        }
        Object obj5 = videoAsset.f14804t.get("didStartPlaying");
        if (obj5 instanceof Boolean) {
            bool = (Boolean) obj5;
        }
        if (kotlin.jvm.internal.g.a(bool, Boolean.FALSE)) {
            videoAsset.f14804t.put("didStartPlaying", Boolean.TRUE);
            AbstractC1701kc viewableAd = getViewableAd();
            if (viewableAd != null) {
                viewableAd.a((byte) 6);
            }
        }
    }

    @Override // com.inmobi.media.M6, com.inmobi.media.r
    public final String getCreativeId() {
        return this.U;
    }

    @Override // com.inmobi.media.M6, com.inmobi.media.r
    public final InterfaceC1768q getFullScreenEventsListener() {
        return this.Z;
    }

    @Override // com.inmobi.media.M6, com.inmobi.media.r
    public final String getImpressionId() {
        return this.T;
    }

    @Override // com.inmobi.media.M6, com.inmobi.media.r
    public final View getVideoContainerView() {
        WeakReference weakReference = this.Y;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // com.inmobi.media.M6, com.inmobi.media.r
    public final AbstractC1701kc getViewableAd() {
        T8 t82;
        Boolean bool;
        boolean z10;
        Boolean bool2;
        boolean z11;
        VastProperties createVastPropertiesForNonSkippableMedia;
        Context j10 = j();
        if (this.f14473o == null && j10 != null) {
            A4 a42 = this.f14468j;
            if (a42 != null) {
                String TAG = this.f14470l;
                kotlin.jvm.internal.g.d(TAG, "TAG");
                ((B4) a42).c(TAG, "fireLoadedAndServedBeacons");
            }
            C1570b7 c1570b7 = this.f14461b.f15220f;
            if (c1570b7 != null) {
                HashMap a10 = a(c1570b7);
                a((byte) 1, a10);
                a((byte) 2, a10);
            }
            this.f14473o = new L4(this, new nc(this, this.V), this.V);
            Set<Fb> set = this.f14462d;
            if (set != null) {
                for (Fb fb2 : set) {
                    try {
                        if (fb2.f14255a == 3) {
                            Object obj = fb2.f14256b.get("omidAdSession");
                            Integer num = null;
                            if (obj instanceof T8) {
                                t82 = (T8) obj;
                            } else {
                                t82 = null;
                            }
                            Object obj2 = fb2.f14256b.get("videoAutoPlay");
                            if (obj2 instanceof Boolean) {
                                bool = (Boolean) obj2;
                            } else {
                                bool = null;
                            }
                            int i10 = 0;
                            if (bool != null) {
                                z10 = bool.booleanValue();
                            } else {
                                z10 = false;
                            }
                            Object obj3 = fb2.f14256b.get("videoSkippable");
                            if (obj3 instanceof Boolean) {
                                bool2 = (Boolean) obj3;
                            } else {
                                bool2 = null;
                            }
                            if (bool2 != null) {
                                z11 = bool2.booleanValue();
                            } else {
                                z11 = false;
                            }
                            Object obj4 = fb2.f14256b.get("videoSkipOffset");
                            if (obj4 instanceof Integer) {
                                num = (Integer) obj4;
                            }
                            if (num != null) {
                                i10 = num.intValue();
                            }
                            if (z11) {
                                createVastPropertiesForNonSkippableMedia = VastProperties.createVastPropertiesForSkippableMedia(i10, z10, Position.STANDALONE);
                            } else {
                                createVastPropertiesForNonSkippableMedia = VastProperties.createVastPropertiesForNonSkippableMedia(z10, Position.STANDALONE);
                            }
                            VastProperties vastProperties = createVastPropertiesForNonSkippableMedia;
                            AbstractC1701kc abstractC1701kc = this.f14473o;
                            if (t82 != null && abstractC1701kc != null) {
                                kotlin.jvm.internal.g.b(vastProperties);
                                this.f14473o = new Z8(j10, abstractC1701kc, this, t82, vastProperties, this.V);
                            } else {
                                A4 a43 = this.V;
                                if (a43 != null) {
                                    String TAG2 = this.W;
                                    kotlin.jvm.internal.g.d(TAG2, "TAG");
                                    ((B4) a43).b(TAG2, "Did not find a OMID video ad session; the OMID decorator will not be applied.");
                                }
                            }
                        }
                    } catch (Exception e10) {
                        A4 a44 = this.V;
                        if (a44 != null) {
                            String str = this.W;
                            ((B4) a44).b(str, Cc.a(e10, A5.a(str, "TAG", "Exception occurred while creating the video viewable ad : ")));
                        }
                        Q4 q42 = Q4.f14590a;
                        Q4.c.a(AbstractC1863x4.a(e10, "event"));
                    }
                }
            }
        }
        return this.f14473o;
    }

    public final void h(W7 videoAsset) {
        kotlin.jvm.internal.g.e(videoAsset, "videoAsset");
        if (this.f14477s) {
            return;
        }
        O7 a10 = M6.a(g());
        if (a10 != null) {
            a10.c();
        }
        videoAsset.a("resume", j(videoAsset), (F6) null, this.V);
        A4 a42 = this.V;
        if (a42 != null) {
            String TAG = this.W;
            kotlin.jvm.internal.g.d(TAG, "TAG");
            ((B4) a42).c(TAG, "onVideoResumed");
        }
        AbstractC1701kc abstractC1701kc = this.f14473o;
        if (abstractC1701kc != null) {
            abstractC1701kc.a((byte) 8);
        }
    }

    @Override // com.inmobi.media.M6
    public final pc i() {
        return this.f14734a0;
    }

    public final HashMap j(W7 w7) {
        C1570b7 c1570b7;
        View view;
        C1641g8 c1641g8;
        int i10;
        String b10;
        C1627f8 videoView;
        W6 w62 = w7.f14802r;
        Integer num = null;
        if (w62 instanceof C1570b7) {
            c1570b7 = (C1570b7) w62;
        } else {
            c1570b7 = null;
        }
        HashMap hashMap = new HashMap();
        WeakReference weakReference = this.Y;
        if (weakReference != null) {
            view = (View) weakReference.get();
        } else {
            view = null;
        }
        if (view instanceof C1641g8) {
            c1641g8 = (C1641g8) view;
        } else {
            c1641g8 = null;
        }
        if (c1641g8 != null && (videoView = c1641g8.getVideoView()) != null) {
            String str = (String) hashMap.put("$MD", String.valueOf(pdf.pdfreader.viewer.editor.free.utils.t0.n0((videoView.getDuration() * 1.0d) / 1000)));
        }
        hashMap.put("[ERRORCODE]", "405");
        SecureRandom secureRandom = new SecureRandom();
        StringBuilder sb2 = new StringBuilder();
        int i11 = 0;
        while (i11 == 0) {
            i11 = (secureRandom.nextInt() & Api.BaseClientBuilder.API_PRIORITY_OTHER) % 10;
        }
        sb2.append(i11);
        for (int i12 = 1; i12 < 8; i12++) {
            sb2.append((secureRandom.nextInt() & Api.BaseClientBuilder.API_PRIORITY_OTHER) % 10);
        }
        String sb3 = sb2.toString();
        kotlin.jvm.internal.g.d(sb3, "toString(...)");
        hashMap.put("[CACHEBUSTING]", sb3);
        InterfaceC1673ic b11 = w7.b();
        if (b11 != null && (b10 = ((C1659hc) b11).b()) != null) {
            String str2 = (String) hashMap.put("[ASSETURI]", b10);
        }
        hashMap.put("$TS", String.valueOf(System.currentTimeMillis()));
        Object obj = w7.f14804t.get("seekPosition");
        if (obj instanceof Integer) {
            num = (Integer) obj;
        }
        if (num != null) {
            i10 = num.intValue();
        } else {
            i10 = 0;
        }
        Locale locale = Locale.US;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long j10 = i10;
        String format = String.format(locale, "%02d:%02d:%02d.%03d", Arrays.copyOf(new Object[]{Long.valueOf(timeUnit.toHours(j10)), Long.valueOf(timeUnit.toMinutes(j10) - TimeUnit.HOURS.toMinutes(timeUnit.toHours(j10))), Long.valueOf(timeUnit.toSeconds(j10) - TimeUnit.MINUTES.toSeconds(timeUnit.toMinutes(j10))), Long.valueOf(j10 - (timeUnit.toSeconds(j10) * 1000))}, 4));
        kotlin.jvm.internal.g.d(format, "format(locale, format, *args)");
        hashMap.put("[CONTENTPLAYHEAD]", format);
        if (c1570b7 != null) {
            String str3 = (String) hashMap.put("$STS", String.valueOf(c1570b7.f14966y));
        }
        Object obj2 = this.f14461b.f15235u;
        if (obj2 == null) {
            obj2 = new HashMap();
        }
        hashMap.putAll(obj2);
        return hashMap;
    }

    @Override // com.inmobi.media.M6
    public final boolean k() {
        if (this.f14460a == 0 && f() != null) {
            return true;
        }
        return false;
    }

    @Override // com.inmobi.media.M6
    public final void l() {
        C1641g8 c1641g8;
        super.l();
        View videoContainerView = getVideoContainerView();
        if (videoContainerView instanceof C1641g8) {
            c1641g8 = (C1641g8) videoContainerView;
        } else {
            c1641g8 = null;
        }
        if (c1641g8 != null) {
            C1627f8 videoView = c1641g8.getVideoView();
            if (this.f14460a == 0 && !k() && videoView.getVideoVolume() > 0) {
                videoView.setLastVolume(-2);
                a(true);
            }
            videoView.pause();
        }
    }

    @Override // com.inmobi.media.M6
    public final boolean o() {
        return !this.f14484z;
    }

    public final void s() {
        A2 a22 = this.f14466h;
        if (a22 != null) {
            if (!a22.f14115g.get()) {
                a22.f14112d.f14219h = 1;
                kotlin.jvm.internal.g.b(a22.c);
            }
            this.f14466h.b();
        }
        AbstractC1701kc abstractC1701kc = this.f14473o;
        if (abstractC1701kc != null) {
            abstractC1701kc.a((byte) 15);
        }
    }

    public final void i(W7 videoAsset) {
        kotlin.jvm.internal.g.e(videoAsset, "videoAsset");
        if (this.f14477s) {
            return;
        }
        videoAsset.f14804t.put("lastMediaVolume", 15);
        videoAsset.a("unmute", j(videoAsset), (F6) null, this.V);
        A4 a42 = this.V;
        if (a42 != null) {
            String TAG = this.W;
            kotlin.jvm.internal.g.d(TAG, "TAG");
            ((B4) a42).c(TAG, "onVideoUnMuted");
        }
        AbstractC1701kc abstractC1701kc = this.f14473o;
        if (abstractC1701kc != null) {
            abstractC1701kc.a((byte) 14);
        }
    }

    public static final void a(W7 w7, boolean z10, U7 this$0, C1627f8 c1627f8) {
        int videoVolume;
        int lastVolume;
        int videoVolume2;
        int lastVolume2;
        int videoVolume3;
        kotlin.jvm.internal.g.e(this$0, "this$0");
        w7.f14804t.put("visible", Boolean.valueOf(z10));
        if (z10 && !this$0.f14478t) {
            w7.f14804t.put("lastVisibleTimestamp", Long.valueOf(SystemClock.uptimeMillis()));
            if (c1627f8.getPauseScheduled() && c1627f8.getMediaPlayer() != null) {
                if (w7.a()) {
                    c1627f8.k();
                } else {
                    c1627f8.c();
                }
            }
            Handler handler = c1627f8.f15068t;
            if (handler != null) {
                handler.removeMessages(0);
            }
            c1627f8.f15069u = false;
            if (this$0.f14460a == 0 && !this$0.k() && (videoVolume3 = c1627f8.getVideoVolume()) != c1627f8.getLastVolume() && c1627f8.isPlaying()) {
                this$0.a(videoVolume3 <= 0);
                c1627f8.setLastVolume(videoVolume3);
            }
            if (this$0.f14460a == 0 && !this$0.k() && !w7.B && !c1627f8.isPlaying() && c1627f8.getState() == 5 && (videoVolume2 = c1627f8.getVideoVolume()) != (lastVolume2 = c1627f8.getLastVolume()) && lastVolume2 > 0) {
                this$0.a(true);
                c1627f8.setLastVolume(videoVolume2);
            }
            if (1 == c1627f8.getState()) {
                A7 mediaPlayer = c1627f8.getMediaPlayer();
                if (mediaPlayer == null) {
                    return;
                }
                mediaPlayer.f14129b = 3;
                return;
            } else if (2 == c1627f8.getState() || 4 == c1627f8.getState() || (5 == c1627f8.getState() && w7.B)) {
                c1627f8.start();
                return;
            } else {
                return;
            }
        }
        kotlin.jvm.internal.g.b(c1627f8);
        if (this$0.f14460a == 0 && !this$0.k() && !this$0.f14478t && (videoVolume = c1627f8.getVideoVolume()) != (lastVolume = c1627f8.getLastVolume()) && lastVolume > 0) {
            this$0.a(true);
            c1627f8.setLastVolume(videoVolume);
        }
        c1627f8.a(w7.E);
    }

    @Override // com.inmobi.media.M6, com.inmobi.media.r
    public final void b() {
        C1627f8 videoView;
        if (this.f14477s) {
            return;
        }
        View videoContainerView = getVideoContainerView();
        C1641g8 c1641g8 = videoContainerView instanceof C1641g8 ? (C1641g8) videoContainerView : null;
        if (c1641g8 != null && (videoView = c1641g8.getVideoView()) != null) {
            videoView.g();
        }
        super.b();
    }

    public final void b(W7 videoAsset) {
        HashMap hashMap;
        kotlin.jvm.internal.g.e(videoAsset, "videoAsset");
        if (this.f14477s) {
            return;
        }
        Object obj = videoAsset.f14804t.get("didRequestFullScreen");
        if (kotlin.jvm.internal.g.a(obj instanceof Boolean ? (Boolean) obj : null, Boolean.TRUE)) {
            HashMap hashMap2 = videoAsset.f14804t;
            Boolean bool = Boolean.FALSE;
            hashMap2.put("didRequestFullScreen", bool);
            W6 w62 = videoAsset.f14807w;
            if (w62 != null && (hashMap = w62.f14804t) != null) {
                hashMap.put("didRequestFullScreen", bool);
            }
            a();
            videoAsset.f14804t.put("isFullScreen", bool);
        }
    }

    public final void a(boolean z10) {
        C1820u0 c1820u0;
        if (this.f14460a != 0 || k() || (c1820u0 = this.f14480v) == null) {
            return;
        }
        A4 a42 = c1820u0.f15485a.f15531j;
        if (a42 != null) {
            String e10 = AbstractC1846w0.e();
            kotlin.jvm.internal.g.d(e10, "<get-TAG>(...)");
            ((B4) a42).a(e10, "onAudioStateChanged");
        }
        if (c1820u0.f15485a.Z()) {
            return;
        }
        AbstractC1689k0 abstractC1689k0 = (AbstractC1689k0) c1820u0.f15486b.get();
        if (abstractC1689k0 != null) {
            abstractC1689k0.a(z10);
            return;
        }
        A4 a43 = c1820u0.f15485a.f15531j;
        if (a43 != null) {
            ((B4) a43).b("InMobi", "Listener was garbage collected.Unable to give callback");
        }
    }

    public final void b(String url) {
        InterfaceC1673ic b10;
        Yb yb2;
        kotlin.jvm.internal.g.e(url, "url");
        A4 a42 = this.V;
        if (a42 != null) {
            String str = this.W;
            ((B4) a42).c(str, AbstractC1890z5.a(str, "TAG", "Setting close end tracker with URL : ", url));
        }
        View videoContainerView = getVideoContainerView();
        if (videoContainerView instanceof C1641g8) {
            Object tag = ((C1641g8) videoContainerView).getVideoView().getTag();
            W7 w7 = tag instanceof W7 ? (W7) tag : null;
            if (w7 == null || (b10 = w7.b()) == null || (yb2 = ((C1659hc) b10).f15150g) == null) {
                return;
            }
            yb2.f14897f.add(new P7(url, 0, "closeEndCard", null));
        }
    }

    public final void a(W7 videoAsset, int i10) {
        kotlin.jvm.internal.g.e(videoAsset, "videoAsset");
        if (this.f14477s) {
            return;
        }
        A4 a42 = this.V;
        if (a42 != null) {
            String TAG = this.W;
            kotlin.jvm.internal.g.d(TAG, "TAG");
            ((B4) a42).a(TAG, "Moat onVideoError + " + i10);
        }
        videoAsset.a("error", j(videoAsset), (F6) null, this.V);
        A4 a43 = this.V;
        if (a43 != null) {
            String TAG2 = this.W;
            kotlin.jvm.internal.g.d(TAG2, "TAG");
            ((B4) a43).c(TAG2, "onVideoError");
        }
        AbstractC1701kc abstractC1701kc = this.f14473o;
        if (abstractC1701kc != null) {
            abstractC1701kc.a((byte) 17);
        }
    }

    public final void b(W7 videoAsset, C1627f8 videoView) {
        kotlin.jvm.internal.g.e(videoAsset, "videoAsset");
        kotlin.jvm.internal.g.e(videoView, "videoView");
        A4 a42 = this.V;
        if (a42 != null) {
            String TAG = this.W;
            kotlin.jvm.internal.g.d(TAG, "TAG");
            ((B4) a42).c(TAG, "onVideoViewCreated");
        }
        videoView.setIsLockScreen(this.C);
        ViewParent parent = videoView.getParent();
        C1641g8 c1641g8 = parent instanceof C1641g8 ? (C1641g8) parent : null;
        if (c1641g8 != null) {
            this.Y = new WeakReference(c1641g8);
            Y7 mediaController = c1641g8.getVideoView().getMediaController();
            if (mediaController != null) {
                mediaController.setVideoAd(this);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0055, code lost:
        if (r0.isPlaying() == true) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(com.inmobi.media.W7 r7, com.inmobi.media.C1627f8 r8) {
        /*
            r6 = this;
            boolean r0 = r6.f14477s
            if (r0 != 0) goto Lc0
            java.lang.ref.WeakReference r0 = r6.f14481w
            java.lang.Object r0 = r0.get()
            if (r0 != 0) goto Le
            goto Lc0
        Le:
            java.util.HashMap r0 = r7.f14804t
            java.lang.String r1 = "didRequestFullScreen"
            java.lang.Object r0 = r0.get(r1)
            boolean r2 = r0 instanceof java.lang.Boolean
            if (r2 == 0) goto L1d
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            goto L1e
        L1d:
            r0 = 0
        L1e:
            r2 = 0
            if (r0 == 0) goto L26
            boolean r0 = r0.booleanValue()
            goto L27
        L26:
            r0 = r2
        L27:
            if (r0 != 0) goto Lc0
            java.util.HashMap r0 = r7.f14804t
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            r0.put(r1, r3)
            int r1 = r8.getCurrentPosition()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r4 = "seekPosition"
            r0.put(r4, r1)
            int r1 = r8.getVolume()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r5 = "lastMediaVolume"
            r0.put(r5, r1)
            com.inmobi.media.A7 r0 = r8.getMediaPlayer()
            if (r0 == 0) goto L58
            boolean r0 = r0.isPlaying()
            r1 = 1
            if (r0 != r1) goto L58
            goto L59
        L58:
            r1 = r2
        L59:
            if (r1 == 0) goto L6b
            com.inmobi.media.A7 r0 = r8.getMediaPlayer()
            if (r0 == 0) goto L64
            r0.pause()
        L64:
            com.inmobi.media.Z6 r0 = r8.getAudioFocusManager$media_release()
            r0.a()
        L6b:
            com.inmobi.media.A7 r0 = r8.getMediaPlayer()
            if (r0 != 0) goto L72
            goto L75
        L72:
            r1 = 4
            r0.f14128a = r1
        L75:
            java.util.HashMap r0 = r7.f14804t
            java.lang.String r1 = "isFullScreen"
            r0.put(r1, r3)
            java.util.HashMap r7 = r7.f14804t
            com.inmobi.media.A7 r8 = r8.getMediaPlayer()
            if (r8 == 0) goto L88
            int r2 = r8.getCurrentPosition()
        L88:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r2)
            r7.put(r4, r8)
            com.inmobi.media.A4 r7 = r6.f14468j
            if (r7 == 0) goto La1
            java.lang.String r8 = r6.f14470l
            java.lang.String r0 = "TAG"
            kotlin.jvm.internal.g.d(r8, r0)
            com.inmobi.media.B4 r7 = (com.inmobi.media.B4) r7
            java.lang.String r0 = "launchFullscreen"
            r7.c(r8, r0)
        La1:
            com.inmobi.media.M6 r7 = com.inmobi.media.M6.c(r6)
            if (r7 != 0) goto La8
            goto Lc0
        La8:
            com.inmobi.media.u0 r8 = r7.f14480v
            if (r8 == 0) goto Laf
            r8.e()
        Laf:
            com.inmobi.media.u r8 = r6.L
            int r0 = r6.hashCode()
            com.inmobi.media.G6 r1 = new com.inmobi.media.G6
            r1.<init>(r6, r7)
            r8.getClass()
            com.inmobi.media.C1819u.a(r0, r1)
        Lc0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.U7.a(com.inmobi.media.W7, com.inmobi.media.f8):void");
    }

    public final void c(W7 videoAsset) {
        kotlin.jvm.internal.g.e(videoAsset, "videoAsset");
        A4 a42 = this.V;
        if (a42 != null) {
            String TAG = this.W;
            kotlin.jvm.internal.g.d(TAG, "TAG");
            ((B4) a42).c(TAG, "Video completed; rewards, if any, will be unlocked and end-card displayed");
        }
        Object obj = videoAsset.f14804t.get("didSignalVideoCompleted");
        Boolean bool = obj instanceof Boolean ? (Boolean) obj : null;
        A2 a22 = this.f14466h;
        if (a22 != null) {
            if (!a22.f14115g.get()) {
                a22.f14112d.f14220i = 1;
                kotlin.jvm.internal.g.b(a22.c);
            }
            this.f14466h.b();
        }
        if (kotlin.jvm.internal.g.a(bool, Boolean.TRUE)) {
            A4 a43 = this.V;
            if (a43 != null) {
                String TAG2 = this.W;
                kotlin.jvm.internal.g.d(TAG2, "TAG");
                ((B4) a43).c(TAG2, "Ignoring callback onAdRewardsUnlocked(), as it is only fired after first time video is played.");
            }
        } else {
            r();
            C1820u0 c1820u0 = this.f14480v;
            if (c1820u0 != null) {
                A4 a44 = c1820u0.f15485a.f15531j;
                if (a44 != null) {
                    String e10 = AbstractC1846w0.e();
                    kotlin.jvm.internal.g.d(e10, "<get-TAG>(...)");
                    ((B4) a44).a(e10, "onMediaPlaybackComplete");
                }
                if (!c1820u0.f15485a.Z()) {
                    AbstractC1689k0 abstractC1689k0 = (AbstractC1689k0) c1820u0.f15486b.get();
                    if (abstractC1689k0 != null) {
                        abstractC1689k0.f();
                    } else {
                        A4 a45 = c1820u0.f15485a.f15531j;
                        if (a45 != null) {
                            ((B4) a45).b("InMobi", "Listener was garbage collected.Unable to give callback");
                        }
                    }
                }
            }
        }
        if (1 == this.f14460a) {
            b((W6) videoAsset);
        }
    }
}
