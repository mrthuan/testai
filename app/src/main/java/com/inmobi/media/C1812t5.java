package com.inmobi.media;

import android.app.Activity;
import android.graphics.Point;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import android.view.View;
import android.widget.RelativeLayout;
import com.inmobi.ads.rendering.InMobiAdActivity;
import com.inmobi.commons.core.configs.AdConfig;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* renamed from: com.inmobi.media.t5  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1812t5 extends B {

    /* renamed from: e  reason: collision with root package name */
    public final WeakReference f15461e;

    /* renamed from: f  reason: collision with root package name */
    public final r f15462f;

    /* renamed from: g  reason: collision with root package name */
    public final RelativeLayout f15463g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f15464h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f15465i;

    /* renamed from: j  reason: collision with root package name */
    public C1627f8 f15466j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1812t5(WeakReference activityRef, r adContainer, RelativeLayout adBackgroundView) {
        super(adBackgroundView);
        kotlin.jvm.internal.g.e(activityRef, "activityRef");
        kotlin.jvm.internal.g.e(adContainer, "adContainer");
        kotlin.jvm.internal.g.e(adBackgroundView, "adBackgroundView");
        this.f15461e = activityRef;
        this.f15462f = adContainer;
        this.f15463g = adBackgroundView;
    }

    public static final void a(C1812t5 this$0, W7 w7) {
        kotlin.jvm.internal.g.e(this$0, "this$0");
        if (this$0.f15462f.getPlacementType() == 1) {
            Object obj = w7.f14804t.get("didCompleteQ4");
            kotlin.jvm.internal.g.c(obj, "null cannot be cast to non-null type kotlin.Boolean");
            if (((Boolean) obj).booleanValue()) {
                return;
            }
        }
        C1627f8 c1627f8 = this$0.f15466j;
        if (c1627f8 != null) {
            c1627f8.start();
        }
    }

    @Override // com.inmobi.media.B
    public final void b() {
        boolean z10;
        Object obj;
        C1627f8 c1627f8;
        Activity activity = (Activity) this.f15461e.get();
        if (!(activity instanceof InMobiAdActivity)) {
            z10 = false;
        } else {
            z10 = ((InMobiAdActivity) activity).f14098e;
        }
        W7 w7 = null;
        C1641g8 c1641g8 = null;
        if (z10) {
            r rVar = this.f15462f;
            if (rVar instanceof U7) {
                View videoContainerView = ((U7) rVar).getVideoContainerView();
                if (videoContainerView instanceof C1641g8) {
                    c1641g8 = (C1641g8) videoContainerView;
                }
                if (c1641g8 != null) {
                    Object tag = c1641g8.getVideoView().getTag();
                    kotlin.jvm.internal.g.c(tag, "null cannot be cast to non-null type com.inmobi.ads.modelsv2.NativeVideoAsset");
                    a((W7) tag);
                }
            } else if (rVar instanceof M6) {
                a((W7) null);
            }
        } else {
            r rVar2 = this.f15462f;
            if (rVar2 instanceof U7) {
                C1627f8 c1627f82 = this.f15466j;
                if (c1627f82 != null) {
                    obj = c1627f82.getTag();
                } else {
                    obj = null;
                }
                if (obj instanceof W7) {
                    w7 = obj;
                }
                if (w7 != null) {
                    if (1 == ((M6) rVar2).f14460a && (c1627f8 = this.f15466j) != null) {
                        c1627f8.f();
                    }
                    a(w7);
                }
            } else if (rVar2 instanceof M6) {
                a((W7) null);
            }
            SparseArray sparseArray = InMobiAdActivity.f14092j;
            r container = this.f15462f;
            kotlin.jvm.internal.g.e(container, "container");
            InMobiAdActivity.f14092j.remove(container.hashCode());
        }
        this.f15462f.b();
    }

    @Override // com.inmobi.media.B
    public final void c() {
        Object obj;
        r rVar = this.f15462f;
        W7 w7 = null;
        if (rVar instanceof U7) {
            C1627f8 c1627f8 = this.f15466j;
            if (c1627f8 != null) {
                obj = c1627f8.getTag();
            } else {
                obj = null;
            }
            if (obj instanceof W7) {
                w7 = obj;
            }
            if (w7 != null && this.f15464h) {
                new Handler(Looper.getMainLooper()).postDelayed(new com.facebook.appevents.g(7, this, w7), 50L);
            }
            try {
                if (!this.f15465i) {
                    this.f15465i = true;
                    InterfaceC1768q fullScreenEventsListener = this.f15462f.getFullScreenEventsListener();
                    if (fullScreenEventsListener != null) {
                        fullScreenEventsListener.a(w7);
                    }
                }
            } catch (Exception e10) {
                Q4 q42 = Q4.f14590a;
                Q4.c.a(AbstractC1863x4.a(e10, "event"));
            }
        } else if (rVar instanceof M6) {
            try {
                if (!this.f15465i) {
                    this.f15465i = true;
                    InterfaceC1768q fullScreenEventsListener2 = rVar.getFullScreenEventsListener();
                    if (fullScreenEventsListener2 != null) {
                        fullScreenEventsListener2.a(null);
                    }
                }
            } catch (Exception e11) {
                Q4 q43 = Q4.f14590a;
                Q4.c.a(AbstractC1863x4.a(e11, "event"));
            }
        }
        this.f15464h = false;
    }

    @Override // com.inmobi.media.B
    public final void d() {
        this.f15464h = true;
        C1627f8 c1627f8 = this.f15466j;
        if (c1627f8 != null) {
            c1627f8.pause();
        }
    }

    @Override // com.inmobi.media.B
    public final void f() {
        C1682j7 c1682j7;
        Point point;
        View view;
        C1641g8 c1641g8;
        Object obj;
        C1570b7 c1570b7;
        X6 x62;
        byte placementType = this.f15462f.getPlacementType();
        this.f15463g.setBackgroundColor(-16777216);
        Object dataModel = this.f15462f.getDataModel();
        if (dataModel instanceof C1682j7) {
            c1682j7 = (C1682j7) dataModel;
        } else {
            c1682j7 = null;
        }
        if (c1682j7 != null && (c1570b7 = c1682j7.f15220f) != null && (x62 = c1570b7.f14788d) != null) {
            point = x62.f14841a;
        } else {
            point = null;
        }
        AbstractC1701kc viewableAd = this.f15462f.getViewableAd();
        int i10 = 1;
        if (c1682j7 != null && c1682j7.f15218d && viewableAd != null) {
            view = viewableAd.b();
        } else {
            view = null;
        }
        if (view == null) {
            if (viewableAd != null) {
                view = viewableAd.a(null, this.f15463g, false);
            } else {
                view = null;
            }
        }
        r rVar = this.f15462f;
        if (rVar instanceof U7) {
            View videoContainerView = ((U7) rVar).getVideoContainerView();
            if (videoContainerView instanceof C1641g8) {
                c1641g8 = (C1641g8) videoContainerView;
            } else {
                c1641g8 = null;
            }
            if (c1641g8 != null) {
                C1627f8 videoView = c1641g8.getVideoView();
                this.f15466j = videoView;
                if (videoView != null) {
                    videoView.requestFocus();
                }
                C1627f8 c1627f8 = this.f15466j;
                if (c1627f8 != null) {
                    obj = c1627f8.getTag();
                } else {
                    obj = null;
                }
                kotlin.jvm.internal.g.c(obj, "null cannot be cast to non-null type com.inmobi.ads.modelsv2.NativeVideoAsset");
                W7 w7 = (W7) obj;
                W6 w62 = w7.f14807w;
                if (w62 != null) {
                    w7.a((W7) w62);
                }
                if (placementType == 0) {
                    w7.f14804t.put("placementType", (byte) 0);
                } else {
                    w7.f14804t.put("placementType", (byte) 1);
                }
            }
        }
        if (view != null) {
            kotlin.jvm.internal.g.b(point);
            this.f15463g.addView(view, new RelativeLayout.LayoutParams(point.x, point.y));
        }
        Activity activity = (Activity) this.f15461e.get();
        if (activity != null && c1682j7 != null) {
            byte b10 = c1682j7.f15217b;
            if (b10 != 1) {
                if (b10 == 2) {
                    i10 = 0;
                } else {
                    i10 = activity.getRequestedOrientation();
                }
            }
            if (activity instanceof InMobiAdActivity) {
                C1734n4 c1734n4 = ((InMobiAdActivity) activity).f14095a;
                if (c1734n4 != null) {
                    c1734n4.f15342a.setRequestedOrientation(i10);
                } else {
                    kotlin.jvm.internal.g.i("orientationHandler");
                    throw null;
                }
            }
        }
    }

    @Override // com.inmobi.media.B
    public final void g() {
        View view;
        Object obj;
        W7 w7;
        Object obj2;
        try {
            AdConfig adConfig = this.f15462f.getAdConfig();
            AbstractC1701kc viewableAd = this.f15462f.getViewableAd();
            if (viewableAd != null) {
                view = viewableAd.b();
            } else {
                view = null;
            }
            if (view != null) {
                r rVar = this.f15462f;
                if (rVar instanceof U7) {
                    C1627f8 c1627f8 = this.f15466j;
                    if (c1627f8 != null) {
                        obj = c1627f8.getTag();
                    } else {
                        obj = null;
                    }
                    if (obj instanceof W7) {
                        w7 = (W7) obj;
                    } else {
                        w7 = null;
                    }
                    if (w7 != null) {
                        AdConfig.ViewabilityConfig viewability = adConfig.getViewability();
                        int videoImpressionMinTimeViewed = viewability.getVideoImpressionMinTimeViewed();
                        HashMap hashMap = w7.F;
                        if (hashMap != null) {
                            obj2 = hashMap.get("time");
                        } else {
                            obj2 = null;
                        }
                        if (obj2 instanceof Integer) {
                            videoImpressionMinTimeViewed = ((Number) obj2).intValue();
                        }
                        viewability.setVideoImpressionMinTimeViewed(videoImpressionMinTimeViewed);
                        viewableAd.a((HashMap) null);
                    }
                } else if (rVar instanceof M6) {
                    try {
                        viewableAd.a((HashMap) null);
                    } catch (Exception unused) {
                        InterfaceC1768q fullScreenEventsListener = this.f15462f.getFullScreenEventsListener();
                        if (fullScreenEventsListener != null) {
                            fullScreenEventsListener.a();
                        }
                    }
                }
            }
        } catch (Exception e10) {
            InterfaceC1768q fullScreenEventsListener2 = this.f15462f.getFullScreenEventsListener();
            if (fullScreenEventsListener2 != null) {
                fullScreenEventsListener2.a();
            }
            Q4 q42 = Q4.f14590a;
            Q4.c.a(AbstractC1863x4.a(e10, "event"));
        }
    }

    @Override // com.inmobi.media.B
    public final void a() {
        if (this.f15462f.c()) {
            return;
        }
        r rVar = this.f15462f;
        if (rVar instanceof U7) {
            C1682j7 c1682j7 = ((U7) rVar).f14461b;
            if (!(c1682j7 instanceof C1682j7)) {
                c1682j7 = null;
            }
            if (c1682j7 == null || !c1682j7.c) {
                Activity activity = (Activity) this.f15461e.get();
                if (activity instanceof InMobiAdActivity) {
                    ((InMobiAdActivity) activity).f14098e = true;
                }
                C1627f8 c1627f8 = this.f15466j;
                if (c1627f8 == null) {
                    Activity activity2 = (Activity) this.f15461e.get();
                    if (activity2 == null) {
                        return;
                    }
                    activity2.finish();
                    return;
                }
                Object tag = c1627f8.getTag();
                W7 w7 = tag instanceof W7 ? (W7) tag : null;
                if (w7 != null) {
                    if (1 == ((M6) rVar).f14460a) {
                        c1627f8.f();
                    }
                    try {
                        Object obj = w7.f14804t.get("isFullScreen");
                        kotlin.jvm.internal.g.c(obj, "null cannot be cast to non-null type kotlin.Boolean");
                        if (((Boolean) obj).booleanValue()) {
                            w7.f14804t.put("seekPosition", Integer.valueOf(c1627f8.getCurrentPosition()));
                            ((U7) rVar).b(w7);
                        }
                    } catch (Exception e10) {
                        Z5.a((byte) 2, "InMobi", "SDK encountered unexpected error in closing video");
                        Q4 q42 = Q4.f14590a;
                        Q4.c.a(AbstractC1863x4.a(e10, "event"));
                    }
                }
            }
        } else if (rVar instanceof M6) {
            M6 m62 = (M6) rVar;
            C1682j7 c1682j72 = m62.f14461b;
            C1682j7 c1682j73 = c1682j72 instanceof C1682j7 ? c1682j72 : null;
            if (c1682j73 == null || !c1682j73.c) {
                m62.a();
            }
        } else {
            Activity activity3 = (Activity) this.f15461e.get();
            if (activity3 == null) {
                return;
            }
            activity3.finish();
        }
    }

    public final void a(W7 w7) {
        try {
            InterfaceC1768q fullScreenEventsListener = this.f15462f.getFullScreenEventsListener();
            if (fullScreenEventsListener != null) {
                fullScreenEventsListener.b(w7);
            }
        } catch (Exception e10) {
            Z5.a((byte) 2, "InMobi", "SDK encountered unexpected error while finishing fullscreen view");
            Q4 q42 = Q4.f14590a;
            Q4.c.a(AbstractC1863x4.a(e10, "event"));
        }
    }
}
