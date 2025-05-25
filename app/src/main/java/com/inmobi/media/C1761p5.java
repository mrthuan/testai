package com.inmobi.media;

import android.app.Activity;
import android.content.Context;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.webkit.JavascriptInterface;
import android.webkit.URLUtil;
import android.widget.FrameLayout;
import com.google.ads.mediation.inmobi.InMobiNetworkValues;
import com.inmobi.media.C1761p5;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.PDLayoutAttributeObject;
import com.tom_roush.pdfbox.pdmodel.interactive.action.PDWindowsLaunchParams;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.Pair;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.p5  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1761p5 {

    /* renamed from: a  reason: collision with root package name */
    public final S9 f15370a;

    /* renamed from: b  reason: collision with root package name */
    public final int f15371b;
    public C1614e9 c;

    /* renamed from: d  reason: collision with root package name */
    public A4 f15372d;

    public C1761p5(int i10, S9 mRenderView) {
        kotlin.jvm.internal.g.e(mRenderView, "mRenderView");
        this.f15370a = mRenderView;
        this.f15371b = i10;
    }

    public static final void a(C1761p5 this$0, String str, String str2) {
        kotlin.jvm.internal.g.e(this$0, "this$0");
        try {
            this$0.f15370a.e(str);
        } catch (Exception e10) {
            this$0.f15370a.a(str2, "Unexpected error", "expand");
            Z5.a((byte) 1, "InMobi", "Failed to expand ad; SDK encountered an unexpected error");
            A4 a42 = this$0.f15372d;
            if (a42 != null) {
                String str3 = AbstractC1774q5.f15390a;
                ((B4) a42).b(str3, Cc.a(e10, A5.a(str3, "access$getTAG$p(...)", "SDK encountered unexpected error in handling expand() request; ")));
            }
        }
    }

    public static final void b(C1761p5 this$0, String str, String str2) {
        kotlin.jvm.internal.g.e(this$0, "this$0");
        this$0.f15370a.getLandingPageHandler().a(PDWindowsLaunchParams.OPERATION_OPEN, str, str2, true);
    }

    public static final void c(C1761p5 this$0, String str, String str2) {
        kotlin.jvm.internal.g.e(this$0, "this$0");
        try {
            this$0.f15370a.getLandingPageHandler().e("openEmbedded", str, str2);
        } catch (Exception e10) {
            this$0.f15370a.a(str, "Unexpected error", "openEmbedded");
            Z5.a((byte) 1, "InMobi", "Failed to open URL; SDK encountered unexpected error");
            A4 a42 = this$0.f15372d;
            if (a42 != null) {
                String str3 = AbstractC1774q5.f15390a;
                ((B4) a42).b(str3, Cc.a(e10, A5.a(str3, "access$getTAG$p(...)", "SDK encountered unexpected error in handling openEmbedded() request from creative; ")));
            }
        }
    }

    public static final void d(C1761p5 this$0, String str, String str2) {
        kotlin.jvm.internal.g.e(this$0, "this$0");
        this$0.f15370a.getLandingPageHandler().a("openWithoutTracker", str, str2, true);
    }

    public static final void e(C1761p5 this$0, String str, String str2) {
        int i10;
        boolean z10;
        kotlin.jvm.internal.g.e(this$0, "this$0");
        try {
            S9 s92 = this$0.f15370a;
            int length = str2.length() - 1;
            int i11 = 0;
            boolean z11 = false;
            while (i11 <= length) {
                if (!z11) {
                    i10 = i11;
                } else {
                    i10 = length;
                }
                if (kotlin.jvm.internal.g.f(str2.charAt(i10), 32) <= 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z11) {
                    if (!z10) {
                        z11 = true;
                    } else {
                        i11++;
                    }
                } else if (!z10) {
                    break;
                } else {
                    length--;
                }
            }
            s92.b(str, str2.subSequence(i11, length + 1).toString());
        } catch (Exception e10) {
            this$0.f15370a.a(str, "Unexpected error", "playVideo");
            Z5.a((byte) 1, "InMobi", "Error playing video; SDK encountered an unexpected error");
            A4 a42 = this$0.f15372d;
            if (a42 != null) {
                String str3 = AbstractC1774q5.f15390a;
                ((B4) a42).b(str3, Cc.a(e10, A5.a(str3, "access$getTAG$p(...)", "SDK encountered unexpected error in handling playVideo() request from creative; ")));
            }
        }
    }

    @JavascriptInterface
    public final void asyncPing(String str, String url) {
        kotlin.jvm.internal.g.e(url, "url");
        A4 a42 = this.f15372d;
        if (a42 != null) {
            String str2 = AbstractC1774q5.f15390a;
            ((B4) a42).a(str2, AbstractC1890z5.a(str2, "access$getTAG$p(...)", "asyncPing called: ", url));
        }
        if (!URLUtil.isValidUrl(url)) {
            this.f15370a.a(str, "Invalid url", "asyncPing");
            return;
        }
        try {
            G8 g82 = new G8(url, this.f15372d);
            g82.f14297x = false;
            g82.f14293t = false;
            g82.f14294u = false;
            g82.a(new Z0(new C1550a1(g82, new C1748o5(this))));
        } catch (Exception e10) {
            this.f15370a.a(str, "Unexpected error", "asyncPing");
            A4 a43 = this.f15372d;
            if (a43 != null) {
                String str3 = AbstractC1774q5.f15390a;
                ((B4) a43).b(str3, Cc.a(e10, A5.a(str3, "access$getTAG$p(...)", "SDK encountered internal error in handling asyncPing() request from creative; ")));
            }
        }
    }

    @JavascriptInterface
    public final void cancelSaveContent(String str, String mediaId) {
        kotlin.jvm.internal.g.e(mediaId, "mediaId");
        A4 a42 = this.f15372d;
        if (a42 != null) {
            String str2 = AbstractC1774q5.f15390a;
            ((B4) a42).a(str2, AbstractC1890z5.a(str2, "access$getTAG$p(...)", "cancelSaveContent called. mediaId:", mediaId));
        }
    }

    @JavascriptInterface
    public final void close(String str) {
        A4 a42 = this.f15372d;
        if (a42 != null) {
            String str2 = AbstractC1774q5.f15390a;
            kotlin.jvm.internal.g.d(str2, "access$getTAG$p(...)");
            ((B4) a42).a(str2, "close called");
        }
        new Handler(this.f15370a.getContainerContext().getMainLooper()).post(new com.facebook.appevents.g(6, this, str));
    }

    @JavascriptInterface
    public final void closeAll(String str) {
        A4 a42 = this.f15372d;
        if (a42 != null) {
            String str2 = AbstractC1774q5.f15390a;
            kotlin.jvm.internal.g.d(str2, "access$getTAG$p(...)");
            ((B4) a42).a(str2, "closeAll is called");
        }
        S9 s92 = this.f15370a;
        A4 a43 = s92.f14665j;
        if (a43 != null) {
            String str3 = S9.O0;
            ((B4) a43).a(str3, G9.a(s92, str3, "TAG", "closeAll "));
        }
        K k10 = s92.f14654d0;
        if (k10 != null) {
            k10.b();
        }
        Activity activity = (Activity) s92.f14671m.get();
        if (activity != null) {
            activity.finish();
        }
    }

    @JavascriptInterface
    public final void closeCustomExpand(String str) {
        A4 a42 = this.f15372d;
        if (a42 != null) {
            String str2 = AbstractC1774q5.f15390a;
            kotlin.jvm.internal.g.d(str2, "access$getTAG$p(...)");
            ((B4) a42).a(str2, "closeCustomExpand called.");
        }
        if (this.f15371b != 1) {
            A4 a43 = this.f15372d;
            if (a43 != null) {
                String str3 = AbstractC1774q5.f15390a;
                StringBuilder a10 = A5.a(str3, "access$getTAG$p(...)", "closeCustomExpand called in incorrect Ad type: ");
                a10.append(this.f15371b);
                ((B4) a43).b(str3, a10.toString());
            }
        } else if (this.f15370a == null) {
            A4 a44 = this.f15372d;
            if (a44 != null) {
                String str4 = AbstractC1774q5.f15390a;
                kotlin.jvm.internal.g.d(str4, "access$getTAG$p(...)");
                ((B4) a44).b(str4, "Found a null instance of render view!");
            }
        } else {
            new Handler(this.f15370a.getContainerContext().getMainLooper()).post(new b1.e(this, 9));
        }
    }

    @JavascriptInterface
    public final void customExpand(final String str, final String str2, final int i10, final float f10, boolean z10, final boolean z11) {
        int i11;
        boolean z12;
        A4 a42 = this.f15372d;
        if (a42 != null) {
            String str3 = AbstractC1774q5.f15390a;
            kotlin.jvm.internal.g.d(str3, "access$getTAG$p(...)");
            ((B4) a42).a(str3, "customExpand called");
        }
        if (this.f15371b != 1) {
            A4 a43 = this.f15372d;
            if (a43 != null) {
                String str4 = AbstractC1774q5.f15390a;
                StringBuilder a10 = A5.a(str4, "access$getTAG$p(...)", "customExpand called in incorrect Ad type: ");
                a10.append(this.f15371b);
                ((B4) a43).b(str4, a10.toString());
                return;
            }
            return;
        }
        if (str2 != null) {
            int length = str2.length() - 1;
            int i12 = 0;
            boolean z13 = false;
            while (i12 <= length) {
                if (!z13) {
                    i11 = i12;
                } else {
                    i11 = length;
                }
                if (kotlin.jvm.internal.g.f(str2.charAt(i11), 32) <= 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (!z13) {
                    if (!z12) {
                        z13 = true;
                    } else {
                        i12++;
                    }
                } else if (!z12) {
                    break;
                } else {
                    length--;
                }
            }
            if (str2.subSequence(i12, length + 1).toString().length() != 0) {
                if (i10 >= 0 && i10 < EnumC1733n3.values().length) {
                    if (f10 >= 0.0f && f10 <= 1.0f) {
                        this.f15370a.getLandingPageHandler().a("clickStartCalled", kotlin.collections.q.B0(new Pair("trigger", this.f15370a.getLandingPageHandler().a(str2))));
                        new Handler(this.f15370a.getContainerContext().getMainLooper()).post(new Runnable() { // from class: qb.e1
                            @Override // java.lang.Runnable
                            public final void run() {
                                C1761p5.a(C1761p5.this, str2, i10, str, f10, z11);
                            }
                        });
                        return;
                    }
                    this.f15370a.a(str, "Invalid screenPercentage", "customExpand");
                    return;
                }
                this.f15370a.a(str, "Invalid inputType", "customExpand");
                return;
            }
        }
        this.f15370a.a(str, "Invalid " + i10, "customExpand");
    }

    @JavascriptInterface
    public final void disableBackButton(String str, boolean z10) {
        A4 a42 = this.f15372d;
        if (a42 != null) {
            String str2 = AbstractC1774q5.f15390a;
            kotlin.jvm.internal.g.d(str2, "access$getTAG$p(...)");
            ((B4) a42).a(str2, "disableBackButton called");
        }
        S9 s92 = this.f15370a;
        if (s92 == null) {
            A4 a43 = this.f15372d;
            if (a43 != null) {
                String str3 = AbstractC1774q5.f15390a;
                kotlin.jvm.internal.g.d(str3, "access$getTAG$p(...)");
                ((B4) a43).b(str3, "Found a null instance of render view!");
                return;
            }
            return;
        }
        s92.setDisableBackButton(z10);
    }

    @JavascriptInterface
    public final void disableCloseRegion(String str, boolean z10) {
        A4 a42 = this.f15372d;
        if (a42 != null) {
            String str2 = AbstractC1774q5.f15390a;
            kotlin.jvm.internal.g.d(str2, "access$getTAG$p(...)");
            ((B4) a42).a(str2, "disableCloseRegion called");
        }
        if (this.f15370a == null) {
            A4 a43 = this.f15372d;
            if (a43 != null) {
                String str3 = AbstractC1774q5.f15390a;
                kotlin.jvm.internal.g.d(str3, "access$getTAG$p(...)");
                ((B4) a43).b(str3, "Found a null instance of render view!");
                return;
            }
            return;
        }
        new Handler(this.f15370a.getContainerContext().getMainLooper()).post(new qb.b1(this, z10, str));
    }

    @JavascriptInterface
    public final void expand(String str, String str2) {
        A4 a42 = this.f15372d;
        if (a42 != null) {
            String str3 = AbstractC1774q5.f15390a;
            kotlin.jvm.internal.g.d(str3, "access$getTAG$p(...)");
            ((B4) a42).a(str3, "expand called");
        }
        if (this.f15371b != 1) {
            S9 s92 = this.f15370a;
            if (s92 == null) {
                A4 a43 = this.f15372d;
                if (a43 != null) {
                    String str4 = AbstractC1774q5.f15390a;
                    kotlin.jvm.internal.g.d(str4, "access$getTAG$p(...)");
                    ((B4) a43).b(str4, "Found a null instance of render view!");
                }
            } else if (!s92.k()) {
                this.f15370a.a("expand");
            } else {
                A4 a44 = this.f15372d;
                if (a44 != null) {
                    String str5 = AbstractC1774q5.f15390a;
                    ((B4) a44).a(str5, AbstractC1890z5.a(str5, "access$getTAG$p(...)", "expand called. Url:", str2));
                }
                S9 s93 = this.f15370a;
                if (s93.E == oc.c) {
                    if (str2 != null && str2.length() > 0 && !kotlin.text.j.M(str2, "http", false)) {
                        this.f15370a.a(str, "Invalid URL", "expand");
                        return;
                    }
                    if (URLUtil.isValidUrl(str2)) {
                        this.f15370a.i();
                    }
                    new Handler(this.f15370a.getContainerContext().getMainLooper()).post(new a6.e(4, this, str2, str));
                    return;
                }
                s93.a(str, "Creative is not visible. Ignoring request.", "expand");
            }
        }
    }

    @JavascriptInterface
    public final void fireAdFailed(String str) {
        try {
            A4 a42 = this.f15372d;
            if (a42 != null) {
                String str2 = AbstractC1774q5.f15390a;
                kotlin.jvm.internal.g.d(str2, "access$getTAG$p(...)");
                ((B4) a42).a(str2, "fireAdFailed called.");
            }
            S9 s92 = this.f15370a;
            Z9 z92 = s92.T;
            if (z92 != null) {
                Map a10 = z92.a();
                long j10 = z92.f14922b;
                ScheduledExecutorService scheduledExecutorService = Vb.f14759a;
                a10.put("latency", Long.valueOf(SystemClock.elapsedRealtime() - j10));
                C1616eb c1616eb = C1616eb.f15034a;
                C1616eb.b("FireAdFailed", a10, EnumC1686jb.f15238a);
            }
            s92.getListener().g(s92);
        } catch (Exception e10) {
            this.f15370a.a(str, "Unexpected error", "fireAdFailed");
            A4 a43 = this.f15372d;
            if (a43 != null) {
                String str3 = AbstractC1774q5.f15390a;
                ((B4) a43).b(str3, Cc.a(e10, A5.a(str3, "access$getTAG$p(...)", "SDK encountered unexpected error in handling fireAdFailed() signal from creative; ")));
            }
        }
    }

    @JavascriptInterface
    public final void fireAdReady(String str) {
        try {
            A4 a42 = this.f15372d;
            if (a42 != null) {
                String str2 = AbstractC1774q5.f15390a;
                kotlin.jvm.internal.g.d(str2, "access$getTAG$p(...)");
                ((B4) a42).a(str2, "fireAdReady called.");
            }
            this.f15370a.h();
        } catch (Exception e10) {
            this.f15370a.a(str, "Unexpected error", "fireAdReady");
            A4 a43 = this.f15372d;
            if (a43 != null) {
                String str3 = AbstractC1774q5.f15390a;
                ((B4) a43).b(str3, Cc.a(e10, A5.a(str3, "access$getTAG$p(...)", "SDK encountered unexpected error in handling fireAdReady() signal from creative; ")));
            }
        }
    }

    @JavascriptInterface
    public final void fireComplete(String str) {
        A4 a42 = this.f15372d;
        if (a42 != null) {
            String str2 = AbstractC1774q5.f15390a;
            kotlin.jvm.internal.g.d(str2, "access$getTAG$p(...)");
            ((B4) a42).a(str2, "fireComplete is called");
        }
        S9 s92 = this.f15370a;
        if (s92 == null) {
            A4 a43 = this.f15372d;
            if (a43 != null) {
                String str3 = AbstractC1774q5.f15390a;
                kotlin.jvm.internal.g.d(str3, "access$getTAG$p(...)");
                ((B4) a43).b(str3, "Found a null instance of render view!");
                return;
            }
            return;
        }
        A4 a44 = s92.f14665j;
        if (a44 != null) {
            String str4 = S9.O0;
            ((B4) a44).c(str4, G9.a(s92, str4, "TAG", "completeFromInterActive "));
        }
        A2 a22 = s92.H0;
        if (a22 != null && !a22.f14115g.get()) {
            a22.f14112d.f14220i = 1;
            kotlin.jvm.internal.g.b(a22.c);
        }
        A4 a45 = s92.f14665j;
        if (a45 != null) {
            String TAG = S9.O0;
            kotlin.jvm.internal.g.d(TAG, "TAG");
            ((B4) a45).a(TAG, "completeFromInterActive");
        }
    }

    @JavascriptInterface
    public final void fireSkip(String str) {
        A4 a42;
        A4 a43 = this.f15372d;
        if (a43 != null) {
            String str2 = AbstractC1774q5.f15390a;
            kotlin.jvm.internal.g.d(str2, "access$getTAG$p(...)");
            ((B4) a43).a(str2, "fireSkip is called");
        }
        if (this.f15370a == null && (a42 = this.f15372d) != null) {
            String str3 = AbstractC1774q5.f15390a;
            kotlin.jvm.internal.g.d(str3, "access$getTAG$p(...)");
            ((B4) a42).b(str3, "Found a null instance of render view!");
        }
        S9 s92 = this.f15370a;
        A4 a44 = s92.f14665j;
        if (a44 != null) {
            String str4 = S9.O0;
            ((B4) a44).c(str4, G9.a(s92, str4, "TAG", "skipFromInterActive "));
        }
        A2 a22 = s92.H0;
        if (a22 != null && !a22.f14115g.get()) {
            a22.f14112d.f14219h = 1;
            kotlin.jvm.internal.g.b(a22.c);
        }
        A4 a45 = s92.f14665j;
        if (a45 != null) {
            String TAG = S9.O0;
            kotlin.jvm.internal.g.d(TAG, "TAG");
            ((B4) a45).a(TAG, "skipFromInterActive");
        }
    }

    @JavascriptInterface
    public final String getAdContext(String str) {
        A4 a42 = this.f15372d;
        if (a42 != null) {
            String str2 = AbstractC1774q5.f15390a;
            kotlin.jvm.internal.g.d(str2, "access$getTAG$p(...)");
            ((B4) a42).a(str2, "getAdContext is called");
        }
        K adPodHandler = this.f15370a.getAdPodHandler();
        if (adPodHandler != null) {
            return ((AbstractC1846w0) adPodHandler).K();
        }
        return null;
    }

    @JavascriptInterface
    public final void getBlob(String str, String str2) {
        F1 f12;
        A4 a42 = this.f15372d;
        if (a42 != null) {
            String str3 = AbstractC1774q5.f15390a;
            kotlin.jvm.internal.g.d(str3, "access$getTAG$p(...)");
            ((B4) a42).a(str3, "getBlob is called");
        }
        S9 s92 = this.f15370a;
        if (s92 == null) {
            A4 a43 = this.f15372d;
            if (a43 != null) {
                String str4 = AbstractC1774q5.f15390a;
                kotlin.jvm.internal.g.d(str4, "access$getTAG$p(...)");
                ((B4) a43).b(str4, "Found a null instance of render view!");
                return;
            }
            return;
        }
        A4 a44 = s92.f14665j;
        if (a44 != null) {
            String TAG = S9.O0;
            kotlin.jvm.internal.g.d(TAG, "TAG");
            ((B4) a44).a(TAG, "getBlob");
        }
        if (str != null && str2 != null && (f12 = s92.W) != null) {
            ((AbstractC1846w0) f12).a(str, str2, s92, s92.getImpressionId());
        }
    }

    @JavascriptInterface
    public final String getCurrentPosition(String str) {
        S9 s92;
        A4 a42 = this.f15372d;
        if (a42 != null) {
            String str2 = AbstractC1774q5.f15390a;
            kotlin.jvm.internal.g.d(str2, "access$getTAG$p(...)");
            ((B4) a42).a(str2, "getCurrentPosition called");
        }
        S9 s93 = this.f15370a;
        if (s93 == null) {
            A4 a43 = this.f15372d;
            if (a43 != null) {
                String str3 = AbstractC1774q5.f15390a;
                kotlin.jvm.internal.g.d(str3, "access$getTAG$p(...)");
                ((B4) a43).b(str3, "Found a null instance of render view!");
                return "";
            }
            return "";
        }
        synchronized (s93.getCurrentPositionMonitor()) {
            this.f15370a.B = true;
            new Handler(this.f15370a.getContainerContext().getMainLooper()).post(new b7.g(this, 9));
            while (true) {
                s92 = this.f15370a;
                if (s92.B) {
                    try {
                        s92.getCurrentPositionMonitor().wait();
                    } catch (InterruptedException unused) {
                    }
                } else {
                    tf.d dVar = tf.d.f30009a;
                }
            }
        }
        return s92.getCurrentPosition();
    }

    @JavascriptInterface
    public final int getCurrentRenderingIndex(String str) {
        A4 a42 = this.f15372d;
        if (a42 != null) {
            String str2 = AbstractC1774q5.f15390a;
            kotlin.jvm.internal.g.d(str2, "access$getTAG$p(...)");
            ((B4) a42).a(str2, "getCurrentRenderingIndex is called");
        }
        return this.f15370a.getCurrentRenderingPodAdIndex();
    }

    @JavascriptInterface
    public final String getDefaultPosition(String str) {
        S9 s92;
        A4 a42 = this.f15372d;
        if (a42 != null) {
            String str2 = AbstractC1774q5.f15390a;
            kotlin.jvm.internal.g.d(str2, "access$getTAG$p(...)");
            ((B4) a42).a(str2, "getDefaultPosition called");
        }
        S9 s93 = this.f15370a;
        if (s93 == null) {
            A4 a43 = this.f15372d;
            if (a43 != null) {
                String str3 = AbstractC1774q5.f15390a;
                kotlin.jvm.internal.g.d(str3, "access$getTAG$p(...)");
                ((B4) a43).b(str3, "Found a null instance of render view!");
            }
            String jSONObject = new JSONObject().toString();
            kotlin.jvm.internal.g.d(jSONObject, "toString(...)");
            return jSONObject;
        }
        synchronized (s93.getDefaultPositionMonitor()) {
            this.f15370a.A = true;
            new Handler(this.f15370a.getContainerContext().getMainLooper()).post(new androidx.activity.b(this, 15));
            while (true) {
                s92 = this.f15370a;
                if (s92.A) {
                    try {
                        s92.getDefaultPositionMonitor().wait();
                    } catch (InterruptedException unused) {
                    }
                } else {
                    tf.d dVar = tf.d.f30009a;
                }
            }
        }
        return s92.getDefaultPosition();
    }

    @JavascriptInterface
    public final int getDeviceVolume(String str) {
        A4 a42 = this.f15372d;
        if (a42 != null) {
            String str2 = AbstractC1774q5.f15390a;
            kotlin.jvm.internal.g.d(str2, "access$getTAG$p(...)");
            ((B4) a42).a(str2, "getDeviceVolume called");
        }
        S9 s92 = this.f15370a;
        if (s92 == null) {
            A4 a43 = this.f15372d;
            if (a43 != null) {
                String str3 = AbstractC1774q5.f15390a;
                kotlin.jvm.internal.g.d(str3, "access$getTAG$p(...)");
                ((B4) a43).b(str3, "Found a null instance of render view!");
            }
            return -1;
        }
        try {
            C1878y6 mediaProcessor = s92.getMediaProcessor();
            if (mediaProcessor != null) {
                return mediaProcessor.a();
            }
        } catch (Exception e10) {
            this.f15370a.a(str, "Unexpected error", "getDeviceVolume");
            A4 a44 = this.f15372d;
            if (a44 != null) {
                String str4 = AbstractC1774q5.f15390a;
                ((B4) a44).b(str4, Cc.a(e10, A5.a(str4, "access$getTAG$p(...)", "SDK encountered unexpected error in handling getDeviceVolume() request from creative; ")));
            }
        }
        return -1;
    }

    @JavascriptInterface
    public final String getExpandProperties(String str) {
        A4 a42 = this.f15372d;
        if (a42 != null) {
            String str2 = AbstractC1774q5.f15390a;
            kotlin.jvm.internal.g.d(str2, "access$getTAG$p(...)");
            ((B4) a42).a(str2, "getExpandedProperties called");
        }
        S9 s92 = this.f15370a;
        if (s92 == null) {
            A4 a43 = this.f15372d;
            if (a43 != null) {
                String str3 = AbstractC1774q5.f15390a;
                kotlin.jvm.internal.g.d(str3, "access$getTAG$p(...)");
                ((B4) a43).b(str3, "Found a null instance of render view!");
                return "";
            }
            return "";
        }
        I3 expandProperties = s92.getExpandProperties();
        kotlin.jvm.internal.g.b(expandProperties);
        return expandProperties.f14342b;
    }

    @JavascriptInterface
    public final int getMaxDeviceVolume(String str) {
        A4 a42 = this.f15372d;
        if (a42 != null) {
            String str2 = AbstractC1774q5.f15390a;
            kotlin.jvm.internal.g.d(str2, "access$getTAG$p(...)");
            ((B4) a42).a(str2, "getMaxDeviceVolume called");
        }
        try {
            return C1566b3.f14952a.m();
        } catch (Exception e10) {
            this.f15370a.a(str, "Unexpected error", "getMaxDeviceVolume");
            A4 a43 = this.f15372d;
            if (a43 != null) {
                String str3 = AbstractC1774q5.f15390a;
                ((B4) a43).b(str3, Cc.a(e10, A5.a(str3, "access$getTAG$p(...)", "SDK encountered unexpected error in handling getMaxDeviceVolume() request from creative; ")));
                return 0;
            }
            return 0;
        }
    }

    @JavascriptInterface
    public final String getMaxSize(String str) {
        int i10;
        int i11;
        Activity activity;
        A4 a42 = this.f15372d;
        if (a42 != null) {
            String str2 = AbstractC1774q5.f15390a;
            kotlin.jvm.internal.g.d(str2, "access$getTAG$p(...)");
            ((B4) a42).a(str2, "getMaxSize called");
        }
        JSONObject jSONObject = new JSONObject();
        try {
            Activity fullScreenActivity = this.f15370a.getFullScreenActivity();
            if (fullScreenActivity == null) {
                Context containerContext = this.f15370a.getContainerContext();
                if (containerContext instanceof Activity) {
                    activity = (Activity) containerContext;
                } else {
                    activity = null;
                }
                if (activity == null) {
                    return getScreenSize(str);
                }
                Context containerContext2 = this.f15370a.getContainerContext();
                kotlin.jvm.internal.g.c(containerContext2, "null cannot be cast to non-null type android.app.Activity");
                fullScreenActivity = (Activity) containerContext2;
            }
            FrameLayout frameLayout = (FrameLayout) fullScreenActivity.findViewById(16908290);
            int a10 = AbstractC1692k3.a(frameLayout.getWidth());
            int a11 = AbstractC1692k3.a(frameLayout.getHeight());
            if (this.f15370a.getFullScreenActivity() != null && (a10 == 0 || a11 == 0)) {
                ViewTreeObserver$OnGlobalLayoutListenerC1735n5 viewTreeObserver$OnGlobalLayoutListenerC1735n5 = new ViewTreeObserver$OnGlobalLayoutListenerC1735n5(frameLayout, this.f15372d);
                frameLayout.getViewTreeObserver().addOnGlobalLayoutListener(viewTreeObserver$OnGlobalLayoutListenerC1735n5);
                Boolean bool = Boolean.FALSE;
                synchronized (bool) {
                    try {
                        bool.wait();
                    } catch (InterruptedException unused) {
                    }
                    i10 = viewTreeObserver$OnGlobalLayoutListenerC1735n5.c;
                    i11 = viewTreeObserver$OnGlobalLayoutListenerC1735n5.f15346d;
                    tf.d dVar = tf.d.f30009a;
                }
                a11 = i11;
                a10 = i10;
            }
            try {
                jSONObject.put(InMobiNetworkValues.WIDTH, a10);
                jSONObject.put(InMobiNetworkValues.HEIGHT, a11);
            } catch (JSONException e10) {
                A4 a43 = this.f15372d;
                if (a43 != null) {
                    String str3 = AbstractC1774q5.f15390a;
                    kotlin.jvm.internal.g.d(str3, "access$getTAG$p(...)");
                    ((B4) a43).a(str3, "Error while creating max size Json.", e10);
                }
            }
            A4 a44 = this.f15372d;
            if (a44 != null) {
                String str4 = AbstractC1774q5.f15390a;
                kotlin.jvm.internal.g.d(str4, "access$getTAG$p(...)");
                ((B4) a44).a(str4, "getMaxSize called:" + jSONObject);
            }
        } catch (Exception e11) {
            this.f15370a.a(str, "Unexpected error", "getMaxSize");
            A4 a45 = this.f15372d;
            if (a45 != null) {
                String str5 = AbstractC1774q5.f15390a;
                ((B4) a45).b(str5, Cc.a(e11, A5.a(str5, "access$getTAG$p(...)", "SDK encountered unexpected error in handling getMaxSize() request from creative; ")));
            }
        }
        String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.g.d(jSONObject2, "toString(...)");
        return jSONObject2;
    }

    @JavascriptInterface
    public final String getOrientation(String str) {
        A4 a42 = this.f15372d;
        if (a42 != null) {
            String str2 = AbstractC1774q5.f15390a;
            kotlin.jvm.internal.g.d(str2, "access$getTAG$p(...)");
            ((B4) a42).a(str2, "getOrientation called");
        }
        byte g10 = AbstractC1692k3.g();
        if (g10 == 1) {
            return PDLayoutAttributeObject.GLYPH_ORIENTATION_VERTICAL_ZERO_DEGREES;
        }
        if (g10 == 3) {
            return PDLayoutAttributeObject.GLYPH_ORIENTATION_VERTICAL_90_DEGREES;
        }
        if (g10 == 2) {
            return PDLayoutAttributeObject.GLYPH_ORIENTATION_VERTICAL_180_DEGREES;
        }
        if (g10 == 4) {
            return PDLayoutAttributeObject.GLYPH_ORIENTATION_VERTICAL_270_DEGREES;
        }
        return "-1";
    }

    @JavascriptInterface
    public final String getOrientationProperties(String str) {
        String str2;
        C1614e9 c1614e9 = this.c;
        if (c1614e9 != null) {
            str2 = c1614e9.f15031d;
        } else {
            str2 = null;
        }
        A4 a42 = this.f15372d;
        if (a42 != null) {
            String str3 = AbstractC1774q5.f15390a;
            ((B4) a42).a(str3, AbstractC1890z5.a(str3, "access$getTAG$p(...)", "getOrientationProperties called: ", str2));
        }
        kotlin.jvm.internal.g.b(str2);
        return str2;
    }

    @JavascriptInterface
    public final String getPlacementType(String str) {
        A4 a42 = this.f15372d;
        if (a42 != null) {
            String str2 = AbstractC1774q5.f15390a;
            kotlin.jvm.internal.g.d(str2, "access$getTAG$p(...)");
            ((B4) a42).a(str2, "getPlacementType called");
        }
        if (1 == this.f15371b) {
            return "interstitial";
        }
        return "inline";
    }

    @JavascriptInterface
    public final String getPlatform(String str) {
        A4 a42 = this.f15372d;
        if (a42 != null) {
            String str2 = AbstractC1774q5.f15390a;
            kotlin.jvm.internal.g.d(str2, "access$getTAG$p(...)");
            ((B4) a42).a(str2, "getPlatform. Platform:android");
            return "android";
        }
        return "android";
    }

    @JavascriptInterface
    public final String getPlatformVersion(String str) {
        String valueOf = String.valueOf(Build.VERSION.SDK_INT);
        A4 a42 = this.f15372d;
        if (a42 != null) {
            String str2 = AbstractC1774q5.f15390a;
            ((B4) a42).a(str2, AbstractC1890z5.a(str2, "access$getTAG$p(...)", "getPlatformVersion. Version:", valueOf));
        }
        return valueOf;
    }

    @JavascriptInterface
    public final String getRenderableAdIndexes(String str) {
        A4 a42 = this.f15372d;
        if (a42 != null) {
            String str2 = AbstractC1774q5.f15390a;
            kotlin.jvm.internal.g.d(str2, "access$getTAG$p(...)");
            ((B4) a42).a(str2, "getRenderableAdIndexes is called");
        }
        JSONArray renderableAdIndexes = this.f15370a.getRenderableAdIndexes();
        A4 a43 = this.f15372d;
        if (a43 != null) {
            String str3 = AbstractC1774q5.f15390a;
            kotlin.jvm.internal.g.d(str3, "access$getTAG$p(...)");
            ((B4) a43).a(str3, "renderableAdIndexes called:" + renderableAdIndexes);
        }
        String jSONArray = renderableAdIndexes.toString();
        kotlin.jvm.internal.g.d(jSONArray, "toString(...)");
        return jSONArray;
    }

    @JavascriptInterface
    public final String getResizeProperties(String str) {
        String str2;
        A4 a42 = this.f15372d;
        if (a42 != null) {
            String str3 = AbstractC1774q5.f15390a;
            kotlin.jvm.internal.g.d(str3, "access$getTAG$p(...)");
            ((B4) a42).a(str3, "getResizeProperties called");
        }
        S9 s92 = this.f15370a;
        if (s92 == null) {
            A4 a43 = this.f15372d;
            if (a43 != null) {
                String str4 = AbstractC1774q5.f15390a;
                kotlin.jvm.internal.g.d(str4, "access$getTAG$p(...)");
                ((B4) a43).b(str4, "Found a null instance of render view!");
            }
            return "";
        }
        C1713la resizeProperties = s92.getResizeProperties();
        if (resizeProperties == null) {
            return "";
        }
        JSONObject a10 = new C1722m5().a(resizeProperties);
        if (a10 != null) {
            str2 = a10.toString();
        } else {
            str2 = null;
        }
        if (str2 == null) {
            return "";
        }
        return str2;
    }

    @JavascriptInterface
    public final String getSafeArea(String str) {
        S9 s92 = this.f15370a;
        if (!s92.D0) {
            return null;
        }
        Integer navBarTypeViaSettings = s92.getNavBarTypeViaSettings();
        if (navBarTypeViaSettings == null) {
            navBarTypeViaSettings = this.f15370a.getNavBarTypeViaInsets();
        }
        JSONObject jSONObject = this.f15370a.getSafeArea().get(navBarTypeViaSettings);
        A4 a42 = this.f15372d;
        if (a42 != null) {
            String str2 = AbstractC1774q5.f15390a;
            kotlin.jvm.internal.g.d(str2, "access$getTAG$p(...)");
            ((B4) a42).a(str2, "getSafeArea called:" + jSONObject);
        }
        if (jSONObject == null) {
            return null;
        }
        return jSONObject.toString();
    }

    @JavascriptInterface
    public final String getScreenSize(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(InMobiNetworkValues.WIDTH, AbstractC1692k3.h().f15274a);
            jSONObject.put(InMobiNetworkValues.HEIGHT, AbstractC1692k3.h().f15275b);
        } catch (JSONException unused) {
        } catch (Exception e10) {
            this.f15370a.a(str, "Unexpected error", "getScreenSize");
            A4 a42 = this.f15372d;
            if (a42 != null) {
                String str2 = AbstractC1774q5.f15390a;
                ((B4) a42).b(str2, Cc.a(e10, A5.a(str2, "access$getTAG$p(...)", "SDK encountered unexpected error while getting screen dimensions; ")));
            }
        }
        String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.g.d(jSONObject2, "toString(...)");
        A4 a43 = this.f15372d;
        if (a43 != null) {
            String str3 = AbstractC1774q5.f15390a;
            ((B4) a43).a(str3, AbstractC1890z5.a(str3, "access$getTAG$p(...)", "getScreenSize called:", jSONObject2));
        }
        return jSONObject2;
    }

    @JavascriptInterface
    public final String getSdkVersion(String str) {
        A4 a42 = this.f15372d;
        if (a42 != null) {
            String str2 = AbstractC1774q5.f15390a;
            kotlin.jvm.internal.g.d(str2, "access$getTAG$p(...)");
            ((B4) a42).a(str2, "getSdkVersion called. Version:10.7.8");
            return "10.7.8";
        }
        return "10.7.8";
    }

    @JavascriptInterface
    public final long getShowTimeStamp(String str) {
        A4 a42 = this.f15372d;
        if (a42 != null) {
            String str2 = AbstractC1774q5.f15390a;
            kotlin.jvm.internal.g.d(str2, "access$getTAG$p(...)");
            ((B4) a42).a(str2, "getShowTimeStamp is called");
        }
        long showTimeStamp = this.f15370a.getShowTimeStamp();
        A4 a43 = this.f15372d;
        if (a43 != null) {
            String str3 = AbstractC1774q5.f15390a;
            kotlin.jvm.internal.g.d(str3, "access$getTAG$p(...)");
            ((B4) a43).a(str3, "getShowTimeStamp is " + showTimeStamp);
        }
        return showTimeStamp;
    }

    @JavascriptInterface
    public final String getState(String str) {
        String viewState = this.f15370a.getViewState();
        Locale locale = Locale.ENGLISH;
        String e10 = a0.d.e(locale, "ENGLISH", viewState, locale, "this as java.lang.String).toLowerCase(locale)");
        A4 a42 = this.f15372d;
        if (a42 != null) {
            String str2 = AbstractC1774q5.f15390a;
            ((B4) a42).c(str2, AbstractC1890z5.a(str2, "access$getTAG$p(...)", "getState called:", e10));
        }
        return e10;
    }

    @JavascriptInterface
    public final String getVersion(String str) {
        A4 a42 = this.f15372d;
        if (a42 != null) {
            String str2 = AbstractC1774q5.f15390a;
            kotlin.jvm.internal.g.d(str2, "access$getTAG$p(...)");
            ((B4) a42).a(str2, "getVersion called. Version:2.0");
            return "2.0";
        }
        return "2.0";
    }

    @JavascriptInterface
    public final void impressionFired(String str) {
        A4 a42 = this.f15372d;
        if (a42 != null) {
            String str2 = AbstractC1774q5.f15390a;
            kotlin.jvm.internal.g.d(str2, "access$getTAG$p(...)");
            ((B4) a42).a(str2, "impressionFired is called");
        }
        S9 s92 = this.f15370a;
        A4 a43 = s92.f14665j;
        if (a43 != null) {
            String str3 = S9.O0;
            ((B4) a43).a(str3, G9.a(s92, str3, "TAG", "onImpressionFired "));
        }
        A4 a44 = s92.f14665j;
        if (a44 != null) {
            String str4 = S9.O0;
            ((B4) a44).a(str4, G9.a(s92, str4, "TAG", "recordContextualData "));
        }
        A2 a22 = s92.H0;
        if (a22 != null) {
            a22.a();
        }
        s92.getListener().a(s92.getTelemetryOnAdImpression());
    }

    @JavascriptInterface
    public final void incentCompleted(String str, String str2) {
        A4 a42 = this.f15372d;
        if (a42 != null) {
            String str3 = AbstractC1774q5.f15390a;
            ((B4) a42).a(str3, AbstractC1890z5.a(str3, "access$getTAG$p(...)", "incentCompleted called. IncentData:", str2));
        }
        if (str2 == null) {
            try {
                this.f15370a.getListener().b(new HashMap());
                return;
            } catch (Exception e10) {
                this.f15370a.a(str, "Unexpected error", "incentCompleted");
                A4 a43 = this.f15372d;
                if (a43 != null) {
                    String str4 = AbstractC1774q5.f15390a;
                    ((B4) a43).b(str4, Cc.a(e10, A5.a(str4, "access$getTAG$p(...)", "SDK encountered unexpected error in handling onUserInteraction() signal from creative; ")));
                    return;
                }
                return;
            }
        }
        try {
            JSONObject jSONObject = new JSONObject(str2);
            HashMap hashMap = new HashMap();
            Iterator<String> keys = jSONObject.keys();
            kotlin.jvm.internal.g.d(keys, "keys(...)");
            while (keys.hasNext()) {
                String next = keys.next();
                kotlin.jvm.internal.g.c(next, "null cannot be cast to non-null type kotlin.String");
                String str5 = next;
                Object obj = jSONObject.get(str5);
                kotlin.jvm.internal.g.b(obj);
                hashMap.put(str5, obj);
            }
            try {
                try {
                    this.f15370a.getListener().b(hashMap);
                } catch (Exception e11) {
                    this.f15370a.a(str, "Unexpected error", "incentCompleted");
                    A4 a44 = this.f15372d;
                    if (a44 != null) {
                        String str6 = AbstractC1774q5.f15390a;
                        ((B4) a44).b(str6, Cc.a(e11, A5.a(str6, "access$getTAG$p(...)", "SDK encountered unexpected error in handling onUserInteraction() signal from creative; ")));
                    }
                }
            } catch (Exception e12) {
                this.f15370a.a(str, "Unexpected error", "incentCompleted");
                A4 a45 = this.f15372d;
                if (a45 != null) {
                    String str7 = AbstractC1774q5.f15390a;
                    kotlin.jvm.internal.g.d(str7, "access$getTAG$p(...)");
                    ((B4) a45).b(str7, "SDK encountered unexpected error in handling onUserInteraction() signal from creative; " + e12.getMessage());
                }
            }
        } catch (JSONException unused) {
            this.f15370a.getListener().b(new HashMap());
        }
    }

    @JavascriptInterface
    public final boolean isBackButtonDisabled(String str) {
        A4 a42 = this.f15372d;
        if (a42 != null) {
            String str2 = AbstractC1774q5.f15390a;
            kotlin.jvm.internal.g.d(str2, "access$getTAG$p(...)");
            ((B4) a42).a(str2, "isBackButtonDisabled called");
        }
        S9 s92 = this.f15370a;
        if (s92 == null) {
            A4 a43 = this.f15372d;
            if (a43 != null) {
                String str3 = AbstractC1774q5.f15390a;
                kotlin.jvm.internal.g.d(str3, "access$getTAG$p(...)");
                ((B4) a43).b(str3, "Found a null instance of render view!");
                return false;
            }
            return false;
        }
        return s92.G;
    }

    @JavascriptInterface
    public final String isDeviceMuted(String str) {
        AudioManager audioManager;
        A4 a42 = this.f15372d;
        if (a42 != null) {
            String str2 = AbstractC1774q5.f15390a;
            kotlin.jvm.internal.g.d(str2, "access$getTAG$p(...)");
            ((B4) a42).a(str2, "isDeviceMuted called");
        }
        if (this.f15370a == null) {
            A4 a43 = this.f15372d;
            if (a43 != null) {
                String str3 = AbstractC1774q5.f15390a;
                kotlin.jvm.internal.g.d(str3, "access$getTAG$p(...)");
                ((B4) a43).b(str3, "Found a null instance of render view!");
                return "false";
            }
            return "false";
        }
        A4 a44 = this.f15372d;
        if (a44 != null) {
            String str4 = AbstractC1774q5.f15390a;
            kotlin.jvm.internal.g.d(str4, "access$getTAG$p(...)");
            ((B4) a44).a(str4, "JavaScript called: isDeviceMuted()");
        }
        boolean z10 = false;
        try {
            C1878y6 mediaProcessor = this.f15370a.getMediaProcessor();
            kotlin.jvm.internal.g.b(mediaProcessor);
            A4 a45 = mediaProcessor.f15679b;
            if (a45 != null) {
                ((B4) a45).c("MraidMediaProcessor", "isVolumeMuted");
            }
            Context d10 = Ha.d();
            if (d10 != null) {
                Object systemService = d10.getSystemService("audio");
                if (systemService instanceof AudioManager) {
                    audioManager = (AudioManager) systemService;
                } else {
                    audioManager = null;
                }
                if (audioManager != null) {
                    if (2 != audioManager.getRingerMode()) {
                        z10 = true;
                    }
                }
            }
        } catch (Exception e10) {
            A4 a46 = this.f15372d;
            if (a46 != null) {
                String str5 = AbstractC1774q5.f15390a;
                ((B4) a46).b(str5, Cc.a(e10, A5.a(str5, "access$getTAG$p(...)", "SDK encountered unexpected error in checking if device is muted; ")));
            }
        }
        return String.valueOf(z10);
    }

    @JavascriptInterface
    public final String isHeadphonePlugged(String str) {
        boolean z10;
        A4 a42 = this.f15372d;
        if (a42 != null) {
            String str2 = AbstractC1774q5.f15390a;
            kotlin.jvm.internal.g.d(str2, "access$getTAG$p(...)");
            ((B4) a42).a(str2, "isHeadphonePlugged called");
        }
        if (this.f15370a == null) {
            A4 a43 = this.f15372d;
            if (a43 != null) {
                String str3 = AbstractC1774q5.f15390a;
                kotlin.jvm.internal.g.d(str3, "access$getTAG$p(...)");
                ((B4) a43).b(str3, "Found a null instance of render view!");
                return "false";
            }
            return "false";
        }
        A4 a44 = this.f15372d;
        if (a44 != null) {
            String str4 = AbstractC1774q5.f15390a;
            kotlin.jvm.internal.g.d(str4, "access$getTAG$p(...)");
            ((B4) a44).a(str4, "JavaScript called: isHeadphonePlugged()");
        }
        try {
            kotlin.jvm.internal.g.b(this.f15370a.getMediaProcessor());
            z10 = C1878y6.b();
        } catch (Exception e10) {
            A4 a45 = this.f15372d;
            if (a45 != null) {
                String str5 = AbstractC1774q5.f15390a;
                ((B4) a45).b(str5, Cc.a(e10, A5.a(str5, "access$getTAG$p(...)", "SDK encountered unexpected error in checking if headphones are plugged-in; ")));
            }
            z10 = false;
        }
        return String.valueOf(z10);
    }

    @JavascriptInterface
    public final boolean isViewable(String str) {
        String str2 = AbstractC1774q5.f15390a;
        kotlin.jvm.internal.g.d(str2, "access$getTAG$p(...)");
        S9 s92 = this.f15370a;
        if (s92 == null) {
            A4 a42 = this.f15372d;
            if (a42 != null) {
                ((B4) a42).b(str2, "Found a null instance of render view!");
            }
            return false;
        } else if (s92.E != oc.c) {
            return false;
        } else {
            return true;
        }
    }

    @JavascriptInterface
    public final void loadAd(String str, int i10) {
        K k10;
        A4 a42 = this.f15372d;
        if (a42 != null) {
            String str2 = AbstractC1774q5.f15390a;
            kotlin.jvm.internal.g.d(str2, "access$getTAG$p(...)");
            ((B4) a42).a(str2, "loadAd is called");
        }
        S9 s92 = this.f15370a;
        A4 a43 = s92.f14665j;
        if (a43 != null) {
            String str3 = S9.O0;
            ((B4) a43).a(str3, G9.a(s92, str3, "TAG", "loadPodAd "));
        }
        if (s92.E == oc.c && (k10 = s92.f14654d0) != null) {
            k10.a(i10, s92);
            return;
        }
        A4 a44 = s92.f14665j;
        if (a44 != null) {
            String TAG = S9.O0;
            kotlin.jvm.internal.g.d(TAG, "TAG");
            ((B4) a44).b(TAG, "Cannot load index pod ad as the current ad is not viewable");
        }
        s92.a(false);
    }

    @JavascriptInterface
    public final void log(String str, String message) {
        kotlin.jvm.internal.g.e(message, "message");
        A4 a42 = this.f15372d;
        if (a42 != null) {
            String str2 = AbstractC1774q5.f15390a;
            ((B4) a42).c(str2, AbstractC1890z5.a(str2, "access$getTAG$p(...)", "Log called. Message:", message));
        }
        S9 s92 = this.f15370a;
        s92.getClass();
        K9 k92 = S9.M0;
        k92.getClass();
        if (((Boolean) S9.P0.getValue(k92, K9.f14400a[0])).booleanValue()) {
            s92.getListener().a(message);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0075, code lost:
        if (new org.json.JSONObject(r9).length() == 0) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c8  */
    @android.webkit.JavascriptInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void logTelemetryEvent(java.lang.String r7, java.lang.String r8, java.lang.String r9) {
        /*
            r6 = this;
            java.lang.String r7 = "access$getTAG$p(...)"
            if (r8 != 0) goto L15
            com.inmobi.media.A4 r8 = r6.f15372d
            if (r8 == 0) goto L14
            java.lang.String r9 = com.inmobi.media.AbstractC1774q5.f15390a
            kotlin.jvm.internal.g.d(r9, r7)
            com.inmobi.media.B4 r8 = (com.inmobi.media.B4) r8
            java.lang.String r7 = "eventType is null"
            r8.b(r9, r7)
        L14:
            return
        L15:
            com.inmobi.media.A4 r0 = r6.f15372d
            if (r0 == 0) goto L29
            java.lang.String r1 = com.inmobi.media.AbstractC1774q5.f15390a
            kotlin.jvm.internal.g.d(r1, r7)
            java.lang.String r7 = "logTelemetryEvent is called: "
            java.lang.String r7 = r7.concat(r8)
            com.inmobi.media.B4 r0 = (com.inmobi.media.B4) r0
            r0.a(r1, r7)
        L29:
            com.inmobi.media.S9 r7 = r6.f15370a
            r7.getClass()
            com.inmobi.media.Z9 r7 = r7.T
            if (r7 == 0) goto Ld6
            java.util.concurrent.atomic.AtomicBoolean r0 = r7.f14925f
            boolean r0 = r0.get()
            if (r0 == 0) goto L3c
            goto Ld6
        L3c:
            java.util.concurrent.atomic.AtomicInteger r0 = r7.f14924e
            int r0 = r0.decrementAndGet()
            r1 = 1
            if (r0 > 0) goto L6a
            java.util.concurrent.atomic.AtomicBoolean r8 = r7.f14925f
            r8.set(r1)
            java.util.Map r8 = r7.a()
            long r0 = r7.f14922b
            java.util.concurrent.ScheduledExecutorService r7 = com.inmobi.media.Vb.f14759a
            long r2 = android.os.SystemClock.elapsedRealtime()
            long r2 = r2 - r0
            java.lang.Long r7 = java.lang.Long.valueOf(r2)
            java.lang.String r9 = "latency"
            r8.put(r9, r7)
            com.inmobi.media.eb r7 = com.inmobi.media.C1616eb.f15034a
            com.inmobi.media.jb r7 = com.inmobi.media.EnumC1686jb.f15238a
            java.lang.String r9 = "TemplateEventDropped"
            com.inmobi.media.C1616eb.b(r9, r8, r7)
            goto Ld6
        L6a:
            if (r9 == 0) goto L7f
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: org.json.JSONException -> L78
            r0.<init>(r9)     // Catch: org.json.JSONException -> L78
            int r0 = r0.length()     // Catch: org.json.JSONException -> L78
            if (r0 != 0) goto L7f
            goto L7e
        L78:
            r9 = move-exception
            com.inmobi.media.eb r0 = com.inmobi.media.C1616eb.f15034a
            r9.toString()
        L7e:
            r9 = 0
        L7f:
            com.inmobi.media.V9 r0 = r7.f14921a
            com.inmobi.media.J r0 = r0.f14749a
            java.lang.String r0 = r0.m()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            kotlin.Pair r2 = new kotlin.Pair
            java.lang.String r3 = "plType"
            r2.<init>(r3, r0)
            com.inmobi.media.V9 r0 = r7.f14921a
            java.lang.String r0 = r0.f14750b
            kotlin.Pair r3 = new kotlin.Pair
            java.lang.String r4 = "markupType"
            r3.<init>(r4, r0)
            java.lang.String r0 = com.inmobi.media.C1566b3.q()
            kotlin.Pair r4 = new kotlin.Pair
            java.lang.String r5 = "networkType"
            r4.<init>(r5, r0)
            r0 = 3
            kotlin.Pair[] r0 = new kotlin.Pair[r0]
            r5 = 0
            r0[r5] = r2
            r0[r1] = r3
            r1 = 2
            r0[r1] = r4
            java.util.LinkedHashMap r0 = kotlin.collections.q.B0(r0)
            if (r9 == 0) goto Lbe
            java.lang.String r1 = "payload"
            r0.put(r1, r9)
        Lbe:
            com.inmobi.media.V9 r9 = r7.f14921a
            java.lang.String r9 = r9.c
            int r9 = r9.length()
            if (r9 <= 0) goto Ld1
            com.inmobi.media.V9 r7 = r7.f14921a
            java.lang.String r7 = r7.c
            java.lang.String r9 = "metadataBlob"
            r0.put(r9, r7)
        Ld1:
            com.inmobi.media.jb r7 = com.inmobi.media.EnumC1686jb.f15239b
            com.inmobi.media.C1616eb.b(r8, r0, r7)
        Ld6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C1761p5.logTelemetryEvent(java.lang.String, java.lang.String, java.lang.String):void");
    }

    @JavascriptInterface
    public final void onAudioStateChanged(String str, int i10) {
        A4 a42 = this.f15372d;
        if (a42 != null) {
            String str2 = AbstractC1774q5.f15390a;
            kotlin.jvm.internal.g.d(str2, "access$getTAG$p(...)");
            ((B4) a42).a(str2, "onAudioStateChanged is called: " + i10);
        }
        EnumC1648h1.f15114b.getClass();
        EnumC1648h1 enumC1648h1 = (EnumC1648h1) EnumC1648h1.c.get(i10);
        if (enumC1648h1 == null) {
            enumC1648h1 = EnumC1648h1.f15115d;
        }
        if (enumC1648h1 != EnumC1648h1.f15115d) {
            this.f15370a.getListener().a(enumC1648h1);
        }
    }

    @JavascriptInterface
    public final void onOrientationChange(String str) {
        A4 a42 = this.f15372d;
        if (a42 != null) {
            String str2 = AbstractC1774q5.f15390a;
            kotlin.jvm.internal.g.d(str2, "access$getTAG$p(...)");
            ((B4) a42).a(str2, ">>> onOrientationChange() >>> This API is deprecated!");
        }
    }

    @JavascriptInterface
    public final void onUserAudioMuteInteraction(String str, boolean z10) {
        A4 a42 = this.f15372d;
        if (a42 != null) {
            String str2 = AbstractC1774q5.f15390a;
            kotlin.jvm.internal.g.d(str2, "access$getTAG$p(...)");
            ((B4) a42).a(str2, "onAudioMuteInteraction is called: " + z10);
        }
        this.f15370a.getListener().a(z10);
    }

    @JavascriptInterface
    public final void onUserInteraction(String str, String str2) {
        A4 a42 = this.f15372d;
        if (a42 != null) {
            String str3 = AbstractC1774q5.f15390a;
            kotlin.jvm.internal.g.d(str3, "access$getTAG$p(...)");
            ((B4) a42).a(str3, "onUserInteraction called");
        }
        S9 s92 = this.f15370a;
        if (s92 != null && !s92.k()) {
            this.f15370a.a("onUserInteraction");
            return;
        }
        A4 a43 = this.f15372d;
        if (a43 != null) {
            String str4 = AbstractC1774q5.f15390a;
            ((B4) a43).a(str4, AbstractC1890z5.a(str4, "access$getTAG$p(...)", "onUserInteraction called. Params:", str2));
        }
        if (str2 == null) {
            try {
                this.f15370a.getListener().a(new HashMap());
                return;
            } catch (Exception e10) {
                this.f15370a.a(str, "Unexpected error", "onUserInteraction");
                A4 a44 = this.f15372d;
                if (a44 != null) {
                    String str5 = AbstractC1774q5.f15390a;
                    ((B4) a44).b(str5, Cc.a(e10, A5.a(str5, "access$getTAG$p(...)", "SDK encountered unexpected error in handling onUserInteraction() signal from creative; ")));
                    return;
                }
                return;
            }
        }
        try {
            JSONObject jSONObject = new JSONObject(str2);
            HashMap hashMap = new HashMap();
            Iterator<String> keys = jSONObject.keys();
            kotlin.jvm.internal.g.d(keys, "keys(...)");
            while (keys.hasNext()) {
                String next = keys.next();
                kotlin.jvm.internal.g.c(next, "null cannot be cast to non-null type kotlin.String");
                String str6 = next;
                Object obj = jSONObject.get(str6);
                kotlin.jvm.internal.g.b(obj);
                hashMap.put(str6, obj);
            }
            try {
                try {
                    this.f15370a.getListener().a(hashMap);
                } catch (Exception e11) {
                    this.f15370a.a(str, "Unexpected error", "onUserInteraction");
                    A4 a45 = this.f15372d;
                    if (a45 != null) {
                        String str7 = AbstractC1774q5.f15390a;
                        ((B4) a45).b(str7, Cc.a(e11, A5.a(str7, "access$getTAG$p(...)", "SDK encountered unexpected error in handling onUserInteraction() signal from creative; ")));
                    }
                }
            } catch (Exception e12) {
                this.f15370a.a(str, "Unexpected error", "onUserInteraction");
                A4 a46 = this.f15372d;
                if (a46 != null) {
                    String str8 = AbstractC1774q5.f15390a;
                    kotlin.jvm.internal.g.d(str8, "access$getTAG$p(...)");
                    ((B4) a46).b(str8, "SDK encountered unexpected error in handling onUserInteraction() signal from creative; " + e12.getMessage());
                }
            }
        } catch (JSONException unused) {
            this.f15370a.getListener().a(new HashMap());
        }
    }

    @JavascriptInterface
    public final void open(String str, String str2) {
        A4 a42 = this.f15372d;
        if (a42 != null) {
            String str3 = AbstractC1774q5.f15390a;
            kotlin.jvm.internal.g.d(str3, "access$getTAG$p(...)");
            ((B4) a42).a(str3, "open called");
        }
        String a10 = this.f15370a.getLandingPageHandler().a(str2);
        this.f15370a.getLandingPageHandler().a("clickStartCalled", kotlin.collections.q.B0(new Pair("trigger", a10)));
        if (!this.f15370a.k()) {
            this.f15370a.a(PDWindowsLaunchParams.OPERATION_OPEN);
            this.f15370a.getLandingPageHandler().a("landingsStartFailed", kotlin.collections.q.B0(new Pair("errorCode", 8), new Pair("trigger", a10)));
            return;
        }
        this.f15370a.i();
        AbstractC1574bb.a(new androidx.fragment.app.d(6, this, str, str2));
    }

    @JavascriptInterface
    public final void openEmbedded(String str, String str2) {
        A4 a42 = this.f15372d;
        if (a42 != null) {
            String str3 = AbstractC1774q5.f15390a;
            kotlin.jvm.internal.g.d(str3, "access$getTAG$p(...)");
            ((B4) a42).a(str3, "openEmbedded called");
        }
        if (!this.f15370a.k()) {
            this.f15370a.a("openEmbedded");
            return;
        }
        this.f15370a.i();
        AbstractC1574bb.a(new androidx.fragment.app.f(5, this, str, str2));
    }

    @JavascriptInterface
    public final void openExternal(String str, String url, String str2) {
        kotlin.jvm.internal.g.e(url, "url");
        A4 a42 = this.f15372d;
        if (a42 != null) {
            String str3 = AbstractC1774q5.f15390a;
            kotlin.jvm.internal.g.d(str3, "access$getTAG$p(...)");
            ((B4) a42).a(str3, "open External");
        }
        S9 s92 = this.f15370a;
        if (s92 == null) {
            A4 a43 = this.f15372d;
            if (a43 != null) {
                String str4 = AbstractC1774q5.f15390a;
                kotlin.jvm.internal.g.d(str4, "access$getTAG$p(...)");
                ((B4) a43).b(str4, "Found a null instance of render view!");
            }
        } else if (!s92.k()) {
            this.f15370a.a("openExternal");
        } else {
            this.f15370a.i();
            A4 a44 = this.f15372d;
            if (a44 != null) {
                String str5 = AbstractC1774q5.f15390a;
                ((B4) a44).a(str5, AbstractC1890z5.a(str5, "access$getTAG$p(...)", "openExternal called with url: ", url));
            }
            D5 landingPageHandler = this.f15370a.getLandingPageHandler();
            landingPageHandler.getClass();
            landingPageHandler.f(str, url, str2);
        }
    }

    @JavascriptInterface
    public final void openWithoutTracker(String str, String str2) {
        A4 a42 = this.f15372d;
        if (a42 != null) {
            String str3 = AbstractC1774q5.f15390a;
            kotlin.jvm.internal.g.d(str3, "access$getTAG$p(...)");
            ((B4) a42).a(str3, "openWithoutTracker called");
        }
        String a10 = this.f15370a.getLandingPageHandler().a(str2);
        this.f15370a.getLandingPageHandler().a("clickStartCalled", new HashMap());
        S9 s92 = this.f15370a;
        if (s92 == null) {
            A4 a43 = this.f15372d;
            if (a43 != null) {
                String str4 = AbstractC1774q5.f15390a;
                kotlin.jvm.internal.g.d(str4, "access$getTAG$p(...)");
                ((B4) a43).b(str4, "Found a null instance of render view!");
            }
            this.f15370a.getLandingPageHandler().a("landingsStartFailed", kotlin.collections.q.B0(new Pair("errorCode", 11), new Pair("trigger", a10)));
        } else if (!s92.k()) {
            this.f15370a.a("openWithoutTracker");
            this.f15370a.getLandingPageHandler().a("landingsStartFailed", kotlin.collections.q.B0(new Pair("errorCode", 8), new Pair("trigger", a10)));
        } else {
            AbstractC1574bb.a(new ha.e(2, this, str, str2));
        }
    }

    @JavascriptInterface
    public final void ping(String str, String str2, boolean z10) {
        int i10;
        boolean z11;
        A4 a42 = this.f15372d;
        if (a42 != null) {
            String str3 = AbstractC1774q5.f15390a;
            kotlin.jvm.internal.g.d(str3, "access$getTAG$p(...)");
            ((B4) a42).a(str3, "ping called");
        }
        if (this.f15370a == null) {
            A4 a43 = this.f15372d;
            if (a43 != null) {
                String str4 = AbstractC1774q5.f15390a;
                kotlin.jvm.internal.g.d(str4, "access$getTAG$p(...)");
                ((B4) a43).b(str4, "Found a null instance of render view!");
                return;
            }
            return;
        }
        if (str2 != null) {
            int length = str2.length() - 1;
            int i11 = 0;
            boolean z12 = false;
            while (i11 <= length) {
                if (!z12) {
                    i10 = i11;
                } else {
                    i10 = length;
                }
                if (kotlin.jvm.internal.g.f(str2.charAt(i10), 32) <= 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!z12) {
                    if (!z11) {
                        z12 = true;
                    } else {
                        i11++;
                    }
                } else if (!z11) {
                    break;
                } else {
                    length--;
                }
            }
            if (str2.subSequence(i11, length + 1).toString().length() != 0 && URLUtil.isValidUrl(str2)) {
                A4 a44 = this.f15372d;
                if (a44 != null) {
                    String str5 = AbstractC1774q5.f15390a;
                    kotlin.jvm.internal.g.d(str5, "access$getTAG$p(...)");
                    ((B4) a44).a(str5, "JavaScript called ping() URL: >>> " + str2 + " <<<");
                }
                try {
                    Y1.f14860a.a(str2, z10, this.f15372d);
                    return;
                } catch (Exception e10) {
                    this.f15370a.a(str, "Unexpected error", "ping");
                    Z5.a((byte) 1, "InMobi", "Failed to fire ping; SDK encountered unexpected error");
                    A4 a45 = this.f15372d;
                    if (a45 != null) {
                        String str6 = AbstractC1774q5.f15390a;
                        ((B4) a45).b(str6, Cc.a(e10, A5.a(str6, "access$getTAG$p(...)", "SDK encountered unexpected error in handling ping() request from creative; ")));
                        return;
                    }
                    return;
                }
            }
        }
        this.f15370a.a(str, "Invalid URL:" + str2, "ping");
    }

    @JavascriptInterface
    public final void pingInWebView(String str, String str2, boolean z10) {
        int i10;
        boolean z11;
        A4 a42 = this.f15372d;
        if (a42 != null) {
            String str3 = AbstractC1774q5.f15390a;
            kotlin.jvm.internal.g.d(str3, "access$getTAG$p(...)");
            ((B4) a42).a(str3, "openInWebView called");
        }
        if (this.f15370a == null) {
            A4 a43 = this.f15372d;
            if (a43 != null) {
                String str4 = AbstractC1774q5.f15390a;
                kotlin.jvm.internal.g.d(str4, "access$getTAG$p(...)");
                ((B4) a43).b(str4, "Found a null instance of render view!");
                return;
            }
            return;
        }
        if (str2 != null) {
            int length = str2.length() - 1;
            int i11 = 0;
            boolean z12 = false;
            while (i11 <= length) {
                if (!z12) {
                    i10 = i11;
                } else {
                    i10 = length;
                }
                if (kotlin.jvm.internal.g.f(str2.charAt(i10), 32) <= 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!z12) {
                    if (!z11) {
                        z12 = true;
                    } else {
                        i11++;
                    }
                } else if (!z11) {
                    break;
                } else {
                    length--;
                }
            }
            if (str2.subSequence(i11, length + 1).toString().length() != 0 && URLUtil.isValidUrl(str2)) {
                A4 a44 = this.f15372d;
                if (a44 != null) {
                    String str5 = AbstractC1774q5.f15390a;
                    kotlin.jvm.internal.g.d(str5, "access$getTAG$p(...)");
                    ((B4) a44).a(str5, "JavaScript called pingInWebView() URL: >>> " + str2 + " <<<");
                }
                try {
                    Y1.f14860a.b(str2, z10, this.f15372d);
                    return;
                } catch (Exception e10) {
                    this.f15370a.a(str, "Unexpected error", "pingInWebView");
                    Z5.a((byte) 1, "InMobi", "Failed to fire ping; SDK encountered unexpected error");
                    A4 a45 = this.f15372d;
                    if (a45 != null) {
                        String str6 = AbstractC1774q5.f15390a;
                        ((B4) a45).b(str6, Cc.a(e10, A5.a(str6, "access$getTAG$p(...)", "SDK encountered unexpected error in handling pingInWebView() request from creative; ")));
                        return;
                    }
                    return;
                }
            }
        }
        this.f15370a.a(str, "Invalid URL:" + str2, "pingInWebView");
    }

    @JavascriptInterface
    public final void playVideo(String str, String str2) {
        int i10;
        boolean z10;
        if (this.f15370a == null) {
            A4 a42 = this.f15372d;
            if (a42 != null) {
                String str3 = AbstractC1774q5.f15390a;
                kotlin.jvm.internal.g.d(str3, "access$getTAG$p(...)");
                ((B4) a42).b(str3, "Found a null instance of render view!");
                return;
            }
            return;
        }
        if (str2 != null) {
            int length = str2.length() - 1;
            int i11 = 0;
            boolean z11 = false;
            while (i11 <= length) {
                if (!z11) {
                    i10 = i11;
                } else {
                    i10 = length;
                }
                if (kotlin.jvm.internal.g.f(str2.charAt(i10), 32) <= 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z11) {
                    if (!z10) {
                        z11 = true;
                    } else {
                        i11++;
                    }
                } else if (!z10) {
                    break;
                } else {
                    length--;
                }
            }
            if (str2.subSequence(i11, length + 1).toString().length() != 0 && kotlin.text.j.M(str2, "http", false) && (kotlin.text.j.F(str2, "mp4", false) || kotlin.text.j.F(str2, "avi", false) || kotlin.text.j.F(str2, "m4v", false))) {
                A4 a43 = this.f15372d;
                if (a43 != null) {
                    String str4 = AbstractC1774q5.f15390a;
                    kotlin.jvm.internal.g.d(str4, "access$getTAG$p(...)");
                    ((B4) a43).a(str4, "JavaScript called: playVideo (" + str2 + ')');
                }
                new Handler(this.f15370a.getContainerContext().getMainLooper()).post(new qb.c1(0, this, str, str2));
                return;
            }
        }
        this.f15370a.a(str, "Null or empty or invalid media playback URL supplied", "playVideo");
    }

    @JavascriptInterface
    public final void registerBackButtonPressedEventListener(String str) {
        A4 a42 = this.f15372d;
        if (a42 != null) {
            String str2 = AbstractC1774q5.f15390a;
            kotlin.jvm.internal.g.d(str2, "access$getTAG$p(...)");
            ((B4) a42).a(str2, "registerBackButtonPressedEventListener called");
        }
        S9 s92 = this.f15370a;
        if (s92 == null) {
            A4 a43 = this.f15372d;
            if (a43 != null) {
                String str3 = AbstractC1774q5.f15390a;
                kotlin.jvm.internal.g.d(str3, "access$getTAG$p(...)");
                ((B4) a43).b(str3, "Found a null instance of render view!");
                return;
            }
            return;
        }
        try {
            A4 a44 = s92.f14665j;
            if (a44 != null) {
                String TAG = S9.O0;
                kotlin.jvm.internal.g.d(TAG, "TAG");
                ((B4) a44).a(TAG, "registerBackButtonPressedEventListener " + s92);
            }
            s92.H = str;
        } catch (Exception e10) {
            this.f15370a.a(str, "Unexpected error", "registerBackButtonPressedEventListener");
            A4 a45 = this.f15372d;
            if (a45 != null) {
                String str4 = AbstractC1774q5.f15390a;
                ((B4) a45).b(str4, Cc.a(e10, A5.a(str4, "access$getTAG$p(...)", "SDK encountered unexpected error in handling registerBackButtonPressedEventListener() request from creative; ")));
            }
        }
    }

    @JavascriptInterface
    public final void registerDeviceMuteEventListener(String str) {
        A4 a42 = this.f15372d;
        if (a42 != null) {
            String str2 = AbstractC1774q5.f15390a;
            kotlin.jvm.internal.g.d(str2, "access$getTAG$p(...)");
            ((B4) a42).a(str2, "registerDeviceMuteEventListener called");
        }
        S9 s92 = this.f15370a;
        if (s92 == null) {
            A4 a43 = this.f15372d;
            if (a43 != null) {
                String str3 = AbstractC1774q5.f15390a;
                kotlin.jvm.internal.g.d(str3, "access$getTAG$p(...)");
                ((B4) a43).b(str3, "Found a null instance of render view!");
            }
        } else if (str != null) {
            try {
                C1878y6 mediaProcessor = s92.getMediaProcessor();
                if (mediaProcessor != null && mediaProcessor.f15680d == null) {
                    C1681j6 c1681j6 = new C1681j6(new C1839v6(mediaProcessor, str));
                    mediaProcessor.f15680d = c1681j6;
                    c1681j6.b();
                }
            } catch (Exception e10) {
                this.f15370a.a(str, "Unexpected error", "registerDeviceMuteEventListener");
                A4 a44 = this.f15372d;
                if (a44 != null) {
                    String str4 = AbstractC1774q5.f15390a;
                    ((B4) a44).b(str4, Cc.a(e10, A5.a(str4, "access$getTAG$p(...)", "SDK encountered unexpected error in handling registerDeviceMuteEventListener() request from creative; ")));
                }
            }
        }
    }

    @JavascriptInterface
    public final void registerDeviceVolumeChangeEventListener(String str) {
        Context d10;
        A4 a42 = this.f15372d;
        if (a42 != null) {
            String str2 = AbstractC1774q5.f15390a;
            kotlin.jvm.internal.g.d(str2, "access$getTAG$p(...)");
            ((B4) a42).a(str2, "registerDeviceVolumeChangeEventListener called");
        }
        S9 s92 = this.f15370a;
        if (s92 == null) {
            A4 a43 = this.f15372d;
            if (a43 != null) {
                String str3 = AbstractC1774q5.f15390a;
                kotlin.jvm.internal.g.d(str3, "access$getTAG$p(...)");
                ((B4) a43).b(str3, "Found a null instance of render view!");
            }
        } else if (str != null) {
            try {
                C1878y6 mediaProcessor = s92.getMediaProcessor();
                if (mediaProcessor != null && (d10 = Ha.d()) != null && mediaProcessor.f15681e == null) {
                    C1681j6 c1681j6 = new C1681j6(new C1852w6(mediaProcessor, str, d10, new Handler(Looper.getMainLooper())));
                    mediaProcessor.f15681e = c1681j6;
                    c1681j6.b();
                }
            } catch (Exception e10) {
                this.f15370a.a(str, "Unexpected error", "registerDeviceVolumeChangeEventListener");
                A4 a44 = this.f15372d;
                if (a44 != null) {
                    String str4 = AbstractC1774q5.f15390a;
                    ((B4) a44).b(str4, Cc.a(e10, A5.a(str4, "access$getTAG$p(...)", "SDK encountered unexpected error in handling registerDeviceVolumeChangeEventListener() request from creative; ")));
                }
            }
        }
    }

    @JavascriptInterface
    public final void registerHeadphonePluggedEventListener(String str) {
        A4 a42 = this.f15372d;
        if (a42 != null) {
            String str2 = AbstractC1774q5.f15390a;
            kotlin.jvm.internal.g.d(str2, "access$getTAG$p(...)");
            ((B4) a42).a(str2, "registerHeadphonePluggedEventListener called");
        }
        S9 s92 = this.f15370a;
        if (s92 == null) {
            A4 a43 = this.f15372d;
            if (a43 != null) {
                String str3 = AbstractC1774q5.f15390a;
                kotlin.jvm.internal.g.d(str3, "access$getTAG$p(...)");
                ((B4) a43).b(str3, "Found a null instance of render view!");
            }
        } else if (str != null) {
            try {
                C1878y6 mediaProcessor = s92.getMediaProcessor();
                if (mediaProcessor != null && mediaProcessor.f15682f == null) {
                    C1681j6 c1681j6 = new C1681j6(new C1826u6(mediaProcessor, str));
                    mediaProcessor.f15682f = c1681j6;
                    c1681j6.b();
                }
            } catch (Exception e10) {
                this.f15370a.a(str, "Unexpected error", "registerHeadphonePluggedEventListener");
                A4 a44 = this.f15372d;
                if (a44 != null) {
                    String str4 = AbstractC1774q5.f15390a;
                    ((B4) a44).b(str4, Cc.a(e10, A5.a(str4, "access$getTAG$p(...)", "SDK encountered unexpected error in handling registerHeadphonePluggedEventListener() request from creative; ")));
                }
            }
        }
    }

    @JavascriptInterface
    public final void resize(String str) {
        A4 a42 = this.f15372d;
        if (a42 != null) {
            String str2 = AbstractC1774q5.f15390a;
            kotlin.jvm.internal.g.d(str2, "access$getTAG$p(...)");
            ((B4) a42).a(str2, "resize called");
        }
        if (this.f15371b != 1) {
            if (this.f15370a == null) {
                A4 a43 = this.f15372d;
                if (a43 != null) {
                    String str3 = AbstractC1774q5.f15390a;
                    kotlin.jvm.internal.g.d(str3, "access$getTAG$p(...)");
                    ((B4) a43).b(str3, "Found a null instance of render view!");
                    return;
                }
                return;
            }
            new Handler(Looper.getMainLooper()).post(new n0.g(18, this, str));
        }
    }

    @JavascriptInterface
    public final void saveBlob(String str, String str2) {
        F1 f12;
        A4 a42 = this.f15372d;
        if (a42 != null) {
            String str3 = AbstractC1774q5.f15390a;
            kotlin.jvm.internal.g.d(str3, "access$getTAG$p(...)");
            ((B4) a42).a(str3, "saveBlob is called");
        }
        S9 s92 = this.f15370a;
        if (s92 == null) {
            A4 a43 = this.f15372d;
            if (a43 != null) {
                String str4 = AbstractC1774q5.f15390a;
                kotlin.jvm.internal.g.d(str4, "access$getTAG$p(...)");
                ((B4) a43).b(str4, "Found a null instance of render view!");
                return;
            }
            return;
        }
        A4 a44 = s92.f14665j;
        if (a44 != null) {
            String TAG = S9.O0;
            kotlin.jvm.internal.g.d(TAG, "TAG");
            ((B4) a44).a(TAG, "saveBlob");
        }
        if (str2 != null && (f12 = s92.W) != null) {
            ((AbstractC1846w0) f12).a(str2, s92.getImpressionId());
        }
    }

    @JavascriptInterface
    public final void saveContent(String str, String str2, String str3) {
        if (str2 != null && str2.length() != 0 && str3 != null && str3.length() != 0) {
            try {
                this.f15370a.b(str, str2, str3);
                return;
            } catch (Exception e10) {
                this.f15370a.a(str, "Unexpected error", "saveContent");
                A4 a42 = this.f15372d;
                if (a42 != null) {
                    String str4 = AbstractC1774q5.f15390a;
                    ((B4) a42).b(str4, Cc.a(e10, A5.a(str4, "access$getTAG$p(...)", "SDK encountered unexpected error in handling saveContent() request from creative; ")));
                    return;
                }
                return;
            }
        }
        A4 a43 = this.f15372d;
        if (a43 != null) {
            String str5 = AbstractC1774q5.f15390a;
            kotlin.jvm.internal.g.d(str5, "access$getTAG$p(...)");
            ((B4) a43).a(str5, "saveContent called with invalid parameters");
        }
        JSONObject jSONObject = new JSONObject();
        if (str3 == null) {
            str3 = "";
        }
        try {
            jSONObject.put(InMobiNetworkValues.URL, str3);
            jSONObject.put("reason", 8);
        } catch (JSONException unused) {
        }
        String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.g.d(jSONObject2, "toString(...)");
        String K = kotlin.text.j.K(jSONObject2, OperatorName.SHOW_TEXT_LINE_AND_SPACE, "\\\"");
        StringBuilder sb2 = new StringBuilder("sendSaveContentResult(\"saveContent_");
        if (str2 == null) {
            str2 = "";
        }
        sb2.append(str2);
        sb2.append("\", 'failed', \"");
        sb2.append(K);
        sb2.append("\");");
        this.f15370a.a(str, sb2.toString());
    }

    @JavascriptInterface
    public final void setAdContext(String str, String podAdContext) {
        kotlin.jvm.internal.g.e(podAdContext, "podAdContext");
        A4 a42 = this.f15372d;
        if (a42 != null) {
            String str2 = AbstractC1774q5.f15390a;
            ((B4) a42).a(str2, AbstractC1890z5.a(str2, "access$getTAG$p(...)", "setAdContext is called ", podAdContext));
        }
        K adPodHandler = this.f15370a.getAdPodHandler();
        if (adPodHandler != null) {
            ((AbstractC1846w0) adPodHandler).d(podAdContext);
        }
    }

    @JavascriptInterface
    public final void setCloseEndCardTracker(String str, String str2) {
        A4 a42 = this.f15372d;
        if (a42 != null) {
            String str3 = AbstractC1774q5.f15390a;
            kotlin.jvm.internal.g.d(str3, "access$getTAG$p(...)");
            ((B4) a42).a(str3, "setCloseEndCardTracker is called");
        }
        S9 s92 = this.f15370a;
        if (s92 == null) {
            A4 a43 = this.f15372d;
            if (a43 != null) {
                String str4 = AbstractC1774q5.f15390a;
                kotlin.jvm.internal.g.d(str4, "access$getTAG$p(...)");
                ((B4) a43).b(str4, "Found a null instance of render view!");
                return;
            }
            return;
        }
        try {
            s92.setCloseEndCardTracker(str2);
        } catch (Exception e10) {
            this.f15370a.a(str, "Unexpected error", "getDownloadStatus");
            A4 a44 = this.f15372d;
            if (a44 != null) {
                String str5 = AbstractC1774q5.f15390a;
                ((B4) a44).b(str5, Cc.a(e10, A5.a(str5, "access$getTAG$p(...)", "SDK encountered unexpected error in handling getDownloadStatus() request from creative; ")));
            }
        }
    }

    @JavascriptInterface
    public final void setExpandProperties(String str, String expandPropertiesString) {
        kotlin.jvm.internal.g.e(expandPropertiesString, "expandPropertiesString");
        A4 a42 = this.f15372d;
        if (a42 != null) {
            String str2 = AbstractC1774q5.f15390a;
            ((B4) a42).a(str2, AbstractC1890z5.a(str2, "access$getTAG$p(...)", "setExpandProperties called. Params:", expandPropertiesString));
        }
        S9 s92 = this.f15370a;
        if (s92 == null) {
            A4 a43 = this.f15372d;
            if (a43 != null) {
                String str3 = AbstractC1774q5.f15390a;
                kotlin.jvm.internal.g.d(str3, "access$getTAG$p(...)");
                ((B4) a43).b(str3, "Found a null instance of render view!");
            }
        } else if (kotlin.jvm.internal.g.a("Expanded", s92.getViewState())) {
            A4 a44 = this.f15372d;
            if (a44 != null) {
                String str4 = AbstractC1774q5.f15390a;
                kotlin.jvm.internal.g.d(str4, "access$getTAG$p(...)");
                ((B4) a44).b(str4, "setExpandProperties can't be called on an already expanded ad.");
            }
        } else {
            try {
                this.f15370a.setExpandProperties(H3.a(expandPropertiesString));
            } catch (Exception e10) {
                this.f15370a.a(str, "Unexpected error", "setExpandProperties");
                A4 a45 = this.f15372d;
                if (a45 != null) {
                    String str5 = AbstractC1774q5.f15390a;
                    ((B4) a45).b(str5, Cc.a(e10, A5.a(str5, "access$getTAG$p(...)", "SDK encountered unexpected error in setExpandProperties(); ")));
                }
            }
        }
    }

    @JavascriptInterface
    public final void setOrientationProperties(String str, String orientationPropertiesString) {
        kotlin.jvm.internal.g.e(orientationPropertiesString, "orientationPropertiesString");
        A4 a42 = this.f15372d;
        if (a42 != null) {
            String str2 = AbstractC1774q5.f15390a;
            ((B4) a42).a(str2, AbstractC1890z5.a(str2, "access$getTAG$p(...)", "setOrientationProperties called: ", orientationPropertiesString));
        }
        new Handler(this.f15370a.getContainerContext().getMainLooper()).post(new l.r(13, this, orientationPropertiesString));
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x007e  */
    @android.webkit.JavascriptInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void setResizeProperties(java.lang.String r5, java.lang.String r6) {
        /*
            r4 = this;
            java.lang.String r0 = "resizePropertiesString"
            kotlin.jvm.internal.g.e(r6, r0)
            com.inmobi.media.A4 r0 = r4.f15372d
            java.lang.String r1 = "access$getTAG$p(...)"
            if (r0 == 0) goto L17
            java.lang.String r2 = com.inmobi.media.AbstractC1774q5.f15390a
            kotlin.jvm.internal.g.d(r2, r1)
            com.inmobi.media.B4 r0 = (com.inmobi.media.B4) r0
            java.lang.String r3 = "setResizeProperties called"
            r0.a(r2, r3)
        L17:
            com.inmobi.media.S9 r0 = r4.f15370a
            if (r0 != 0) goto L2c
            com.inmobi.media.A4 r5 = r4.f15372d
            if (r5 == 0) goto L2b
            java.lang.String r6 = com.inmobi.media.AbstractC1774q5.f15390a
            kotlin.jvm.internal.g.d(r6, r1)
            com.inmobi.media.B4 r5 = (com.inmobi.media.B4) r5
            java.lang.String r0 = "Found a null instance of render view!"
            r5.b(r6, r0)
        L2b:
            return
        L2c:
            com.inmobi.media.A4 r0 = r4.f15372d
            if (r0 == 0) goto L3d
            java.lang.String r2 = com.inmobi.media.AbstractC1774q5.f15390a
            java.lang.String r3 = "setResizeProperties called. Properties:"
            java.lang.String r1 = com.inmobi.media.AbstractC1890z5.a(r2, r1, r3, r6)
            com.inmobi.media.B4 r0 = (com.inmobi.media.B4) r0
            r0.a(r2, r1)
        L3d:
            com.inmobi.media.S9 r0 = r4.f15370a
            com.inmobi.media.la r0 = r0.getResizeProperties()
            com.inmobi.media.ka r1 = com.inmobi.media.C1713la.Companion
            r1.getClass()
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: org.json.JSONException -> L7b
            r1.<init>(r6)     // Catch: org.json.JSONException -> L7b
            com.inmobi.media.m5 r6 = new com.inmobi.media.m5     // Catch: org.json.JSONException -> L7b
            r6.<init>()     // Catch: org.json.JSONException -> L7b
            java.lang.Class<com.inmobi.media.la> r2 = com.inmobi.media.C1713la.class
            java.lang.Object r6 = r6.a(r1, r2)     // Catch: org.json.JSONException -> L7b
            com.inmobi.media.la r6 = (com.inmobi.media.C1713la) r6     // Catch: org.json.JSONException -> L7b
            if (r6 == 0) goto L7b
            java.lang.String r1 = r6.b()     // Catch: org.json.JSONException -> L7b
            if (r1 != 0) goto L6f
            if (r0 == 0) goto L6a
            java.lang.String r1 = r0.b()     // Catch: org.json.JSONException -> L7b
            if (r1 != 0) goto L6c
        L6a:
            java.lang.String r1 = "top-right"
        L6c:
            r6.a(r1)     // Catch: org.json.JSONException -> L7b
        L6f:
            if (r0 == 0) goto L76
            boolean r0 = r0.a()     // Catch: org.json.JSONException -> L7b
            goto L77
        L76:
            r0 = 1
        L77:
            r6.a(r0)     // Catch: org.json.JSONException -> L7b
            goto L7c
        L7b:
            r6 = 0
        L7c:
            if (r6 != 0) goto L87
            com.inmobi.media.S9 r0 = r4.f15370a
            java.lang.String r1 = "setResizeProperties"
            java.lang.String r2 = "All mandatory fields are not present"
            r0.a(r5, r1, r2)
        L87:
            com.inmobi.media.S9 r5 = r4.f15370a
            r5.setResizeProperties(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C1761p5.setResizeProperties(java.lang.String, java.lang.String):void");
    }

    @JavascriptInterface
    public final void showAd(String str, int i10) {
        K k10;
        A4 a42 = this.f15372d;
        if (a42 != null) {
            String str2 = AbstractC1774q5.f15390a;
            kotlin.jvm.internal.g.d(str2, "access$getTAG$p(...)");
            ((B4) a42).a(str2, "showAd is called");
        }
        S9 s92 = this.f15370a;
        A4 a43 = s92.f14665j;
        if (a43 != null) {
            String TAG = S9.O0;
            kotlin.jvm.internal.g.d(TAG, "TAG");
            ((B4) a43).a(TAG, "showPodAdAtIndex " + s92 + ' ' + i10);
        }
        if (s92.E == oc.c && (k10 = s92.f14654d0) != null) {
            k10.a(i10, s92, s92.getFullScreenActivity());
            return;
        }
        A4 a44 = s92.f14665j;
        if (a44 != null) {
            String TAG2 = S9.O0;
            kotlin.jvm.internal.g.d(TAG2, "TAG");
            ((B4) a44).b(TAG2, "Cannot show index pod ad as the current ad is not viewable");
        }
        s92.b(false);
    }

    @JavascriptInterface
    public final void showAlert(String str, String alert) {
        kotlin.jvm.internal.g.e(alert, "alert");
        A4 a42 = this.f15372d;
        if (a42 != null) {
            String str2 = AbstractC1774q5.f15390a;
            ((B4) a42).a(str2, AbstractC1890z5.a(str2, "access$getTAG$p(...)", "showAlert: ", alert));
        }
    }

    @JavascriptInterface
    public final void showEndCard(String str) {
        A4 a42 = this.f15372d;
        if (a42 != null) {
            String str2 = AbstractC1774q5.f15390a;
            kotlin.jvm.internal.g.d(str2, "access$getTAG$p(...)");
            ((B4) a42).a(str2, "showEndCard is called");
        }
        S9 s92 = this.f15370a;
        if (s92 == null) {
            A4 a43 = this.f15372d;
            if (a43 != null) {
                String str3 = AbstractC1774q5.f15390a;
                kotlin.jvm.internal.g.d(str3, "access$getTAG$p(...)");
                ((B4) a43).b(str3, "Found a null instance of render view!");
                return;
            }
            return;
        }
        A4 a44 = s92.f14665j;
        if (a44 != null) {
            String TAG = S9.O0;
            kotlin.jvm.internal.g.d(TAG, "TAG");
            ((B4) a44).a(TAG, "showEndCardFromInterActive");
        }
        r referenceContainer = s92.getReferenceContainer();
        if (referenceContainer instanceof M6) {
            ((M6) referenceContainer).p();
        }
    }

    @JavascriptInterface
    public final void storePicture(String str, String str2) {
        A4 a42 = this.f15372d;
        if (a42 != null) {
            String str3 = AbstractC1774q5.f15390a;
            kotlin.jvm.internal.g.d(str3, "access$getTAG$p(...)");
            ((B4) a42).a(str3, "storePicture is deprecated and no-op. ");
        }
    }

    @JavascriptInterface
    public final void submitAdReport(String str, String adQualityUrl, String enableUserAdReportScreenshot, String templateInfo) {
        kotlin.jvm.internal.g.e(adQualityUrl, "adQualityUrl");
        kotlin.jvm.internal.g.e(enableUserAdReportScreenshot, "enableUserAdReportScreenshot");
        kotlin.jvm.internal.g.e(templateInfo, "templateInfo");
        A4 a42 = this.f15372d;
        if (a42 != null) {
            String str2 = AbstractC1774q5.f15390a;
            kotlin.jvm.internal.g.d(str2, "access$getTAG$p(...)");
            ((B4) a42).a(str2, "submitAdReport called");
        }
        this.f15370a.a(adQualityUrl, templateInfo, kotlin.jvm.internal.g.a(enableUserAdReportScreenshot, "1"));
    }

    @JavascriptInterface
    public final String supports(String str, String feature) {
        kotlin.jvm.internal.g.e(feature, "feature");
        A4 a42 = this.f15372d;
        if (a42 != null) {
            String str2 = AbstractC1774q5.f15390a;
            ((B4) a42).a(str2, AbstractC1890z5.a(str2, "access$getTAG$p(...)", "Checking support for: ", feature));
        }
        return String.valueOf(this.f15370a.f(feature));
    }

    @JavascriptInterface
    public final long timeSinceShow(String str) {
        A4 a42 = this.f15372d;
        if (a42 != null) {
            String str2 = AbstractC1774q5.f15390a;
            kotlin.jvm.internal.g.d(str2, "access$getTAG$p(...)");
            ((B4) a42).a(str2, "timeSinceShow is called");
        }
        S9 s92 = this.f15370a;
        A4 a43 = s92.f14665j;
        if (a43 != null) {
            String str3 = S9.O0;
            ((B4) a43).c(str3, G9.a(s92, str3, "TAG", "timeSincePodShow "));
        }
        K k10 = s92.f14654d0;
        if (k10 != null) {
            return ((AbstractC1846w0) k10).A0();
        }
        return 0L;
    }

    @JavascriptInterface
    public final void unregisterBackButtonPressedEventListener(String str) {
        A4 a42 = this.f15372d;
        if (a42 != null) {
            String str2 = AbstractC1774q5.f15390a;
            kotlin.jvm.internal.g.d(str2, "access$getTAG$p(...)");
            ((B4) a42).a(str2, "unregisterBackButtonPressedEventListener called");
        }
        S9 s92 = this.f15370a;
        if (s92 == null) {
            A4 a43 = this.f15372d;
            if (a43 != null) {
                String str3 = AbstractC1774q5.f15390a;
                kotlin.jvm.internal.g.d(str3, "access$getTAG$p(...)");
                ((B4) a43).b(str3, "Found a null instance of render view!");
                return;
            }
            return;
        }
        try {
            A4 a44 = s92.f14665j;
            if (a44 != null) {
                String TAG = S9.O0;
                kotlin.jvm.internal.g.d(TAG, "TAG");
                ((B4) a44).a(TAG, "unregisterBackButtonPressedEventListener " + s92);
            }
            s92.H = null;
        } catch (Exception e10) {
            this.f15370a.a(str, "Unexpected error", "unregisterBackButtonPressedEventListener");
            A4 a45 = this.f15372d;
            if (a45 != null) {
                String str4 = AbstractC1774q5.f15390a;
                ((B4) a45).b(str4, Cc.a(e10, A5.a(str4, "access$getTAG$p(...)", "SDK encountered unexpected error in handling unregisterBackButtonPressedEventListener() request from creative; ")));
            }
        }
    }

    @JavascriptInterface
    public final void unregisterDeviceMuteEventListener(String str) {
        A4 a42 = this.f15372d;
        if (a42 != null) {
            String str2 = AbstractC1774q5.f15390a;
            kotlin.jvm.internal.g.d(str2, "access$getTAG$p(...)");
            ((B4) a42).a(str2, "unregisterDeviceMuteEventListener called");
        }
        if (this.f15370a == null) {
            A4 a43 = this.f15372d;
            if (a43 != null) {
                String str3 = AbstractC1774q5.f15390a;
                kotlin.jvm.internal.g.d(str3, "access$getTAG$p(...)");
                ((B4) a43).b(str3, "Found a null instance of render view!");
                return;
            }
            return;
        }
        A4 a44 = this.f15372d;
        if (a44 != null) {
            String str4 = AbstractC1774q5.f15390a;
            kotlin.jvm.internal.g.d(str4, "access$getTAG$p(...)");
            ((B4) a44).a(str4, "Unregister device mute event listener ...");
        }
        try {
            C1878y6 mediaProcessor = this.f15370a.getMediaProcessor();
            if (mediaProcessor != null) {
                C1681j6 c1681j6 = mediaProcessor.f15680d;
                if (c1681j6 != null) {
                    c1681j6.a();
                }
                mediaProcessor.f15680d = null;
            }
        } catch (Exception e10) {
            this.f15370a.a(str, "Unexpected error", "unRegisterDeviceMuteEventListener");
            A4 a45 = this.f15372d;
            if (a45 != null) {
                String str5 = AbstractC1774q5.f15390a;
                ((B4) a45).b(str5, Cc.a(e10, A5.a(str5, "access$getTAG$p(...)", "SDK encountered unexpected error in handling unregisterDeviceMuteEventListener() request from creative; ")));
            }
        }
    }

    @JavascriptInterface
    public final void unregisterDeviceVolumeChangeEventListener(String str) {
        A4 a42 = this.f15372d;
        if (a42 != null) {
            String str2 = AbstractC1774q5.f15390a;
            kotlin.jvm.internal.g.d(str2, "access$getTAG$p(...)");
            ((B4) a42).a(str2, "unregisterDeviceVolumeChangeEventListener called");
        }
        if (this.f15370a == null) {
            A4 a43 = this.f15372d;
            if (a43 != null) {
                String str3 = AbstractC1774q5.f15390a;
                kotlin.jvm.internal.g.d(str3, "access$getTAG$p(...)");
                ((B4) a43).b(str3, "Found a null instance of render view!");
                return;
            }
            return;
        }
        A4 a44 = this.f15372d;
        if (a44 != null) {
            String str4 = AbstractC1774q5.f15390a;
            kotlin.jvm.internal.g.d(str4, "access$getTAG$p(...)");
            ((B4) a44).a(str4, "Unregister device volume change listener ...");
        }
        try {
            C1878y6 mediaProcessor = this.f15370a.getMediaProcessor();
            if (mediaProcessor != null) {
                C1681j6 c1681j6 = mediaProcessor.f15681e;
                if (c1681j6 != null) {
                    c1681j6.a();
                }
                mediaProcessor.f15681e = null;
            }
        } catch (Exception e10) {
            this.f15370a.a(str, "Unexpected error", "unregisterDeviceVolumeChangeEventListener");
            A4 a45 = this.f15372d;
            if (a45 != null) {
                String str5 = AbstractC1774q5.f15390a;
                ((B4) a45).b(str5, Cc.a(e10, A5.a(str5, "access$getTAG$p(...)", "SDK encountered unexpected error in handling unregisterDeviceVolumeChangeEventListener() request from creative; ")));
            }
        }
    }

    @JavascriptInterface
    public final void unregisterHeadphonePluggedEventListener(String str) {
        A4 a42 = this.f15372d;
        if (a42 != null) {
            String str2 = AbstractC1774q5.f15390a;
            kotlin.jvm.internal.g.d(str2, "access$getTAG$p(...)");
            ((B4) a42).a(str2, "unregisterHeadphonePluggedEventListener called");
        }
        if (this.f15370a == null) {
            A4 a43 = this.f15372d;
            if (a43 != null) {
                String str3 = AbstractC1774q5.f15390a;
                kotlin.jvm.internal.g.d(str3, "access$getTAG$p(...)");
                ((B4) a43).b(str3, "Found a null instance of render view!");
                return;
            }
            return;
        }
        A4 a44 = this.f15372d;
        if (a44 != null) {
            String str4 = AbstractC1774q5.f15390a;
            kotlin.jvm.internal.g.d(str4, "access$getTAG$p(...)");
            ((B4) a44).a(str4, "Unregister headphone plugged event listener ...");
        }
        try {
            C1878y6 mediaProcessor = this.f15370a.getMediaProcessor();
            if (mediaProcessor != null) {
                C1681j6 c1681j6 = mediaProcessor.f15682f;
                if (c1681j6 != null) {
                    c1681j6.a();
                }
                mediaProcessor.f15682f = null;
            }
        } catch (Exception e10) {
            this.f15370a.a(str, "Unexpected error", "unregisterHeadphonePluggedEventListener");
            A4 a45 = this.f15372d;
            if (a45 != null) {
                String str5 = AbstractC1774q5.f15390a;
                ((B4) a45).b(str5, Cc.a(e10, A5.a(str5, "access$getTAG$p(...)", "SDK encountered unexpected error in handling unregisterHeadphonePluggedEventListener() request from creative; ")));
            }
        }
    }

    @JavascriptInterface
    public final void useCustomClose(final String str, final boolean z10) {
        A4 a42 = this.f15372d;
        if (a42 != null) {
            String str2 = AbstractC1774q5.f15390a;
            kotlin.jvm.internal.g.d(str2, "access$getTAG$p(...)");
            ((B4) a42).a(str2, "useCustomClose called:" + z10);
        }
        new Handler(this.f15370a.getContainerContext().getMainLooper()).post(new Runnable() { // from class: qb.d1
            @Override // java.lang.Runnable
            public final void run() {
                C1761p5.b(C1761p5.this, z10, str);
            }
        });
    }

    @JavascriptInterface
    public final void zoom(String jsCallbackNamespace, int i10) {
        kotlin.jvm.internal.g.e(jsCallbackNamespace, "jsCallbackNamespace");
        A4 a42 = this.f15372d;
        if (a42 != null) {
            String str = AbstractC1774q5.f15390a;
            kotlin.jvm.internal.g.d(str, "access$getTAG$p(...)");
            ((B4) a42).a(str, "zoom is called " + jsCallbackNamespace + ' ' + i10);
        }
        AbstractC1574bb.a(new qb.a1(this, i10, 0));
    }

    public static final void b(C1761p5 this$0) {
        kotlin.jvm.internal.g.e(this$0, "this$0");
        try {
            this$0.f15370a.n();
        } catch (Exception e10) {
            A4 a42 = this$0.f15372d;
            if (a42 != null) {
                String str = AbstractC1774q5.f15390a;
                ((B4) a42).b(str, Cc.a(e10, A5.a(str, "access$getTAG$p(...)", "SDK encountered unexpected error in getting/setting current position; ")));
            }
        }
    }

    public static final void a(C1761p5 this$0, String str, int i10, String str2, float f10, boolean z10) {
        kotlin.jvm.internal.g.e(this$0, "this$0");
        try {
            if (this$0.f15370a.getEmbeddedBrowserJSCallbacks() == null) {
                A4 a42 = this$0.f15372d;
                if (a42 != null) {
                    String str3 = AbstractC1774q5.f15390a;
                    kotlin.jvm.internal.g.d(str3, "access$getTAG$p(...)");
                    ((B4) a42).b(str3, "Found a null instance of EmbeddedBrowserJSCallback instance to customExpand");
                    return;
                }
                return;
            }
            A4 a43 = this$0.f15372d;
            if (a43 != null) {
                String str4 = AbstractC1774q5.f15390a;
                kotlin.jvm.internal.g.d(str4, "access$getTAG$p(...)");
                ((B4) a43).a(str4, "Custom expand called. Url: " + str);
            }
            EnumC1733n3 enumC1733n3 = EnumC1733n3.values()[i10];
            if (enumC1733n3 == EnumC1733n3.f15339a) {
                if (this$0.f15370a.getLandingPageHandler().a(str2, str) == 3) {
                    InterfaceC1746o3 embeddedBrowserJSCallbacks = this$0.f15370a.getEmbeddedBrowserJSCallbacks();
                    if (embeddedBrowserJSCallbacks != null) {
                        ((C1679j4) embeddedBrowserJSCallbacks).a(str, enumC1733n3, f10, z10, this$0.f15370a.getViewTouchTimestamp(), this$0.f15370a.m());
                        return;
                    }
                    return;
                }
                InterfaceC1746o3 embeddedBrowserJSCallbacks2 = this$0.f15370a.getEmbeddedBrowserJSCallbacks();
                if (embeddedBrowserJSCallbacks2 != null) {
                    C1707l4.a(((C1679j4) embeddedBrowserJSCallbacks2).f15211a);
                    return;
                }
                return;
            }
            InterfaceC1746o3 embeddedBrowserJSCallbacks3 = this$0.f15370a.getEmbeddedBrowserJSCallbacks();
            if (embeddedBrowserJSCallbacks3 != null) {
                ((C1679j4) embeddedBrowserJSCallbacks3).a(str, enumC1733n3, f10, z10, this$0.f15370a.getViewTouchTimestamp(), this$0.f15370a.m());
            }
        } catch (Exception e10) {
            this$0.f15370a.a(str2, "Unexpected error", "customExpand");
            Z5.a((byte) 1, "InMobi", "Failed to custom expand ad; SDK encountered an unexpected error");
            A4 a44 = this$0.f15372d;
            if (a44 != null) {
                String str5 = AbstractC1774q5.f15390a;
                ((B4) a44).b(str5, Cc.a(e10, A5.a(str5, "access$getTAG$p(...)", "SDK encountered unexpected error in handling customExpand() request; ")));
            }
        }
    }

    public static final void b(C1761p5 this$0, String str) {
        kotlin.jvm.internal.g.e(this$0, "this$0");
        try {
            this$0.f15370a.l();
        } catch (Exception e10) {
            this$0.f15370a.a(str, "Unexpected error", "resize");
            String str2 = AbstractC1774q5.f15390a;
            kotlin.jvm.internal.g.d(str2, "access$getTAG$p(...)");
            Z5.a((byte) 1, str2, "Could not resize ad; SDK encountered an unexpected error");
            A4 a42 = this$0.f15372d;
            if (a42 != null) {
                ((B4) a42).b(str2, Cc.a(e10, A5.a(str2, "access$getTAG$p(...)", "SDK encountered an unexpected error in handling resize() request; ")));
            }
        }
    }

    public static final void c(C1761p5 this$0) {
        kotlin.jvm.internal.g.e(this$0, "this$0");
        try {
            this$0.f15370a.o();
        } catch (Exception e10) {
            A4 a42 = this$0.f15372d;
            if (a42 != null) {
                String str = AbstractC1774q5.f15390a;
                ((B4) a42).b(str, Cc.a(e10, A5.a(str, "access$getTAG$p(...)", "SDK encountered unexpected error in getting/setting default position; ")));
            }
        }
    }

    public static final void c(C1761p5 this$0, String orientationPropertiesString) {
        kotlin.jvm.internal.g.e(this$0, "this$0");
        kotlin.jvm.internal.g.e(orientationPropertiesString, "$orientationPropertiesString");
        C1614e9 orientationProperties = this$0.f15370a.getOrientationProperties();
        if (orientationProperties != null) {
            C1614e9 c1614e9 = new C1614e9();
            c1614e9.f15031d = orientationPropertiesString;
            try {
                JSONObject jSONObject = new JSONObject(orientationPropertiesString);
                String optString = jSONObject.optString("forceOrientation", orientationProperties.f15030b);
                kotlin.jvm.internal.g.d(optString, "optString(...)");
                c1614e9.f15030b = optString;
                c1614e9.f15029a = jSONObject.optBoolean("allowOrientationChange", orientationProperties.f15029a);
                String optString2 = jSONObject.optString("direction", orientationProperties.c);
                kotlin.jvm.internal.g.d(optString2, "optString(...)");
                c1614e9.c = optString2;
                if (!kotlin.jvm.internal.g.a(c1614e9.f15030b, "portrait") && !kotlin.jvm.internal.g.a(c1614e9.f15030b, "landscape")) {
                    c1614e9.f15030b = "none";
                }
                if (!kotlin.jvm.internal.g.a(c1614e9.c, "left") && !kotlin.jvm.internal.g.a(c1614e9.c, "right")) {
                    c1614e9.c = "right";
                }
            } catch (JSONException unused) {
                c1614e9 = null;
            }
            this$0.c = c1614e9;
        }
        C1614e9 c1614e92 = this$0.c;
        if (c1614e92 != null) {
            this$0.f15370a.setOrientationProperties(c1614e92);
        }
    }

    public static final void b(C1761p5 this$0, boolean z10, String str) {
        kotlin.jvm.internal.g.e(this$0, "this$0");
        try {
            this$0.f15370a.e(z10);
        } catch (Exception e10) {
            this$0.f15370a.a(str, "Unexpected error", "useCustomClose");
            A4 a42 = this$0.f15372d;
            if (a42 != null) {
                String str2 = AbstractC1774q5.f15390a;
                ((B4) a42).b(str2, Cc.a(e10, A5.a(str2, "access$getTAG$p(...)", "SDK encountered internal error in handling useCustomClose() request from creative; ")));
            }
        }
    }

    public static final void a(C1761p5 this$0) {
        kotlin.jvm.internal.g.e(this$0, "this$0");
        if (this$0.f15370a.getEmbeddedBrowserJSCallbacks() == null) {
            A4 a42 = this$0.f15372d;
            if (a42 != null) {
                String str = AbstractC1774q5.f15390a;
                kotlin.jvm.internal.g.d(str, "access$getTAG$p(...)");
                ((B4) a42).b(str, "Found a null instance of EmbeddedBrowserJSCallback instance to closeCustomExpand");
                return;
            }
            return;
        }
        InterfaceC1746o3 embeddedBrowserJSCallbacks = this$0.f15370a.getEmbeddedBrowserJSCallbacks();
        if (embeddedBrowserJSCallbacks != null) {
            C1707l4.a(((C1679j4) embeddedBrowserJSCallbacks).f15211a);
        }
    }

    public static final void a(C1761p5 this$0, String str) {
        kotlin.jvm.internal.g.e(this$0, "this$0");
        try {
            r referenceContainer = this$0.f15370a.getReferenceContainer();
            if (referenceContainer != null) {
                referenceContainer.a();
            }
        } catch (Exception e10) {
            this$0.f15370a.a(str, "Unexpected error", "close");
            Z5.a((byte) 1, "InMobi", "Failed to close ad; SDK encountered an unexpected error");
            A4 a42 = this$0.f15372d;
            if (a42 != null) {
                String str2 = AbstractC1774q5.f15390a;
                ((B4) a42).b(str2, Cc.a(e10, A5.a(str2, "access$getTAG$p(...)", "SDK encountered an expected error in handling the close() request from creative; ")));
            }
        }
    }

    public static final void a(C1761p5 this$0, boolean z10, String str) {
        kotlin.jvm.internal.g.e(this$0, "this$0");
        try {
            this$0.f15370a.d(z10);
        } catch (Exception e10) {
            this$0.f15370a.a(str, "Unexpected error", "disableCloseRegion");
            A4 a42 = this$0.f15372d;
            if (a42 != null) {
                String str2 = AbstractC1774q5.f15390a;
                ((B4) a42).b(str2, Cc.a(e10, A5.a(str2, "access$getTAG$p(...)", "SDK encountered unexpected error in handling disableCloseRegion() request from creative; ")));
            }
        }
    }

    public static final void a(C1761p5 this$0, int i10) {
        kotlin.jvm.internal.g.e(this$0, "this$0");
        this$0.f15370a.setInitialScale(i10);
    }
}
