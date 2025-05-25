package com.inmobi.ads;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import android.view.WindowInsets;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.y0;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.exceptions.SdkNotInitializedException;
import com.inmobi.ads.listeners.AudioAdEventListener;
import com.inmobi.commons.core.configs.AdConfig;
import com.inmobi.commons.core.configs.Config;
import com.inmobi.media.A4;
import com.inmobi.media.AbstractC1574bb;
import com.inmobi.media.AbstractC1606e1;
import com.inmobi.media.AbstractC1676j1;
import com.inmobi.media.AbstractC1692k3;
import com.inmobi.media.AbstractC1773q4;
import com.inmobi.media.B4;
import com.inmobi.media.C1566b3;
import com.inmobi.media.C1592d1;
import com.inmobi.media.C1662i1;
import com.inmobi.media.C1705l2;
import com.inmobi.media.C1706l3;
import com.inmobi.media.C1732n2;
import com.inmobi.media.C1803s9;
import com.inmobi.media.E9;
import com.inmobi.media.H;
import com.inmobi.media.Ha;
import com.inmobi.media.Ia;
import com.inmobi.media.J;
import com.inmobi.media.ViewTreeObserver$OnGlobalLayoutListenerC1785r4;
import com.inmobi.media.Z5;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.g;

/* loaded from: classes2.dex */
public final class InMobiAudio extends RelativeLayout {

    /* renamed from: a  reason: collision with root package name */
    public AudioAdEventListener f14045a;

    /* renamed from: b  reason: collision with root package name */
    public C1662i1 f14046b;
    public final WeakReference c;

    /* renamed from: d  reason: collision with root package name */
    public final C1803s9 f14047d;

    /* renamed from: e  reason: collision with root package name */
    public long f14048e;

    /* renamed from: f  reason: collision with root package name */
    public int f14049f;

    /* renamed from: g  reason: collision with root package name */
    public int f14050g;

    /* loaded from: classes2.dex */
    public static final class a extends AbstractC1606e1 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InMobiAudio audio) {
            super(audio);
            g.e(audio, "audio");
        }

        @Override // com.inmobi.ads.controllers.PublisherCallbacks
        public byte getType() {
            return (byte) 0;
        }

        @Override // com.inmobi.ads.controllers.PublisherCallbacks
        public void onAdFetchFailed(InMobiAdRequestStatus status) {
            AudioAdEventListener mPubListener$media_release;
            g.e(status, "status");
            InMobiAudio inMobiAudio = a().get();
            if (inMobiAudio != null && (mPubListener$media_release = inMobiAudio.getMPubListener$media_release()) != null) {
                mPubListener$media_release.onAdLoadFailed(inMobiAudio, status);
            }
        }

        @Override // com.inmobi.media.AbstractC1606e1, com.inmobi.ads.controllers.PublisherCallbacks
        public void onAdFetchSuccessful(AdMetaInfo info) {
            g.e(info, "info");
            super.onAdFetchSuccessful(info);
            InMobiAudio inMobiAudio = a().get();
            if (inMobiAudio == null) {
                return;
            }
            try {
                C1662i1 mAdManager$media_release = inMobiAudio.getMAdManager$media_release();
                if (mAdManager$media_release != null) {
                    mAdManager$media_release.y();
                }
            } catch (IllegalStateException e10) {
                Z5.a((byte) 1, "InMobiAudio", e10.getMessage());
                AudioAdEventListener mPubListener$media_release = inMobiAudio.getMPubListener$media_release();
                if (mPubListener$media_release != null) {
                    mPubListener$media_release.onAdLoadFailed(inMobiAudio, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0106  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public InMobiAudio(android.content.Context r13, android.util.AttributeSet r14) {
        /*
            Method dump skipped, instructions count: 287
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.ads.InMobiAudio.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public static final void a(InMobiAudio this$0) {
        C1662i1 c1662i1;
        g.e(this$0, "this$0");
        try {
            if (this$0.b()) {
                if (!this$0.a() || (c1662i1 = this$0.f14046b) == null) {
                    return;
                }
                c1662i1.b(this$0.getFrameSizeString());
                return;
            }
            Z5.a((byte) 1, "InMobiAudio", "The height or width of the audio ad can not be determined");
            C1662i1 c1662i12 = this$0.f14046b;
            if (c1662i12 != null) {
                c1662i12.a((short) 108);
            }
            C1662i1 c1662i13 = this$0.f14046b;
            if (c1662i13 != null) {
                c1662i13.a(c1662i13.j(), new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
            }
        } catch (Exception unused) {
            C1662i1 c1662i14 = this$0.f14046b;
            if (c1662i14 != null) {
                c1662i14.a((short) 105);
            }
            Z5.a((byte) 1, "InMobiAudio", "SDK encountered unexpected error while loading an ad");
        }
    }

    private final String getFrameSizeString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f14049f);
        sb2.append('x');
        sb2.append(this.f14050g);
        return sb2.toString();
    }

    public final boolean b() {
        if (this.f14049f > 0 && this.f14050g > 0) {
            return true;
        }
        return false;
    }

    public final boolean c() {
        if (!b()) {
            if (getLayoutParams() == null) {
                Z5.a((byte) 1, "InMobiAudio", "The layout params of the audio ad view must be set before calling load or call setAudioSize(int widthInDp, int heightInDp) before load");
                return false;
            } else if (getLayoutParams().width != -2 && getLayoutParams().height != -2) {
                if (getLayoutParams() != null) {
                    this.f14049f = AbstractC1692k3.a(getLayoutParams().width);
                    this.f14050g = AbstractC1692k3.a(getLayoutParams().height);
                }
            } else {
                Z5.a((byte) 1, "InMobiAudio", "The height or width of a Audio ad can't be WRAP_CONTENT or call setAudioSize(int widthInDp, int heightInDp) before load");
                return false;
            }
        }
        return true;
    }

    public final void d() {
        C1662i1 c1662i1;
        boolean z10;
        try {
            LinkedHashMap linkedHashMap = C1732n2.f15334a;
            Config a10 = C1705l2.a("ads", Ha.b(), null);
            g.c(a10, "null cannot be cast to non-null type com.inmobi.commons.core.configs.AdConfig");
            if (!((AdConfig) a10).getAudio().isAudioEnabled()) {
                C1662i1 c1662i12 = this.f14046b;
                if (c1662i12 != null) {
                    c1662i12.a((short) 107);
                }
                C1662i1 c1662i13 = this.f14046b;
                if (c1662i13 != null) {
                    c1662i13.a(c1662i13.j(), new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.FEATURE_DISABLED));
                }
                Z5.a((byte) 1, "InMobi", "");
                return;
            }
            this.f14047d.f15451e = "NonAB";
            Context context = getContext();
            g.d(context, "getContext(...)");
            a(context);
            C1662i1 c1662i14 = this.f14046b;
            if (c1662i14 != null) {
                C1592d1 c1592d1 = c1662i14.f15162q;
                if (c1592d1 != null) {
                    z10 = c1592d1.D0();
                } else {
                    z10 = false;
                }
                if (z10) {
                    C1662i1 c1662i15 = this.f14046b;
                    if (c1662i15 != null) {
                        A4 p10 = c1662i15.p();
                        if (p10 != null) {
                            String str = AbstractC1676j1.f15207a;
                            g.d(str, "access$getTAG$p(...)");
                            ((B4) p10).b(str, "submitAdLoadFailed " + c1662i15);
                        }
                        C1592d1 c1592d12 = c1662i15.f15163r;
                        if (c1592d12 != null) {
                            c1592d12.b((short) 15);
                        }
                    }
                    AudioAdEventListener audioAdEventListener = this.f14045a;
                    if (audioAdEventListener != null) {
                        audioAdEventListener.onAdLoadFailed(this, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.AD_ACTIVE));
                    }
                    Z5.a((byte) 1, "InMobiAudio", "An ad is currently being viewed by the user. Please wait for the user to close the ad before requesting for another ad.");
                    return;
                }
            }
            if (!c()) {
                C1662i1 c1662i16 = this.f14046b;
                if (c1662i16 != null) {
                    c1662i16.a((short) 108);
                }
                C1662i1 c1662i17 = this.f14046b;
                if (c1662i17 != null) {
                    c1662i17.a(c1662i17.j(), new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.REQUEST_INVALID));
                    return;
                }
                return;
            }
            Config a11 = C1705l2.a("ads", Ha.b(), null);
            g.c(a11, "null cannot be cast to non-null type com.inmobi.commons.core.configs.AdConfig");
            if (((AdConfig) a11).getAudio().getMinDeviceVolume() > C1566b3.f14952a.a(Ha.d(), Ha.o())) {
                C1662i1 c1662i18 = this.f14046b;
                if (c1662i18 != null) {
                    c1662i18.a((short) 106);
                }
                C1662i1 c1662i19 = this.f14046b;
                if (c1662i19 != null) {
                    c1662i19.a(c1662i19.j(), new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.DEVICE_AUDIO_LEVEL_LOW));
                }
            } else if (!b()) {
                AbstractC1574bb.a(new y0(this, 7), 200L);
            } else if (a() && (c1662i1 = this.f14046b) != null) {
                c1662i1.b(getFrameSizeString());
            }
        } catch (Exception unused) {
            C1662i1 c1662i110 = this.f14046b;
            if (c1662i110 != null) {
                c1662i110.a((short) 105);
            }
            Z5.a((byte) 1, "InMobiAudio", "Unable to load ad; SDK encountered an unexpected error");
        }
    }

    public final void destroy() {
        removeAllViews();
        C1662i1 c1662i1 = this.f14046b;
        if (c1662i1 != null) {
            A4 p10 = c1662i1.p();
            if (p10 != null) {
                String str = AbstractC1676j1.f15207a;
                g.d(str, "access$getTAG$p(...)");
                ((B4) p10).a(str, "clear " + c1662i1);
            }
            A4 p11 = c1662i1.p();
            if (p11 != null) {
                String str2 = AbstractC1676j1.f15207a;
                g.d(str2, "access$getTAG$p(...)");
                ((B4) p11).c(str2, "unregisterLifecycleCallbacks " + c1662i1);
            }
            C1592d1 c1592d1 = c1662i1.f15160o;
            if (c1592d1 != null) {
                c1592d1.I0();
            }
            C1592d1 c1592d12 = c1662i1.f15161p;
            if (c1592d12 != null) {
                c1592d12.I0();
            }
            C1592d1 c1592d13 = c1662i1.f15160o;
            if (c1592d13 != null) {
                c1592d13.g();
            }
            c1662i1.f15160o = null;
            C1592d1 c1592d14 = c1662i1.f15161p;
            if (c1592d14 != null) {
                c1592d14.g();
            }
            c1662i1.f15161p = null;
            c1662i1.f15162q = null;
            c1662i1.f15163r = null;
            c1662i1.a((Boolean) null);
        }
        this.f14045a = null;
    }

    public final void disableHardwareAcceleration() {
        this.f14047d.f15450d = true;
    }

    public final C1662i1 getMAdManager$media_release() {
        return this.f14046b;
    }

    public final AudioAdEventListener getMPubListener$media_release() {
        return this.f14045a;
    }

    public final void load() {
        C1662i1 c1662i1 = this.f14046b;
        if (c1662i1 != null) {
            c1662i1.w();
        }
        d();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        try {
            super.onAttachedToWindow();
            C1662i1 c1662i1 = this.f14046b;
            if (c1662i1 != null) {
                c1662i1.x();
            }
            if (getLayoutParams() != null) {
                this.f14049f = AbstractC1692k3.a(getLayoutParams().width);
                this.f14050g = AbstractC1692k3.a(getLayoutParams().height);
            }
            if (!b()) {
                setupViewSizeObserver();
            }
            if (Build.VERSION.SDK_INT >= 29) {
                C1706l3 c1706l3 = AbstractC1692k3.f15250a;
                Context context = getContext();
                WindowInsets rootWindowInsets = getRootWindowInsets();
                g.d(rootWindowInsets, "getRootWindowInsets(...)");
                AbstractC1692k3.a(rootWindowInsets, context);
            }
        } catch (Exception unused) {
            Z5.a((byte) 1, "InMobiAudio", "InMobiAudio#onAttachedToWindow() handler threw unexpected error");
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        try {
            super.onDetachedFromWindow();
            C1662i1 c1662i1 = this.f14046b;
            if (c1662i1 != null) {
                A4 p10 = c1662i1.p();
                if (p10 != null) {
                    String str = AbstractC1676j1.f15207a;
                    g.d(str, "access$getTAG$p(...)");
                    ((B4) p10).c(str, "unregisterLifecycleCallbacks " + c1662i1);
                }
                C1592d1 c1592d1 = c1662i1.f15160o;
                if (c1592d1 != null) {
                    c1592d1.I0();
                }
                C1592d1 c1592d12 = c1662i1.f15161p;
                if (c1592d12 != null) {
                    c1592d12.I0();
                }
            }
        } catch (Exception unused) {
            Z5.a((byte) 1, "InMobiAudio", "InMobiAudio.onDetachedFromWindow() handler threw unexpected error");
        }
    }

    public final void pause() {
        C1662i1 c1662i1;
        try {
            if (this.c == null && (c1662i1 = this.f14046b) != null) {
                A4 p10 = c1662i1.p();
                if (p10 != null) {
                    String str = AbstractC1676j1.f15207a;
                    g.d(str, "access$getTAG$p(...)");
                    ((B4) p10).a(str, "pause " + c1662i1);
                }
                C1592d1 c1592d1 = c1662i1.f15162q;
                if (c1592d1 != null) {
                    c1592d1.E0();
                }
            }
        } catch (Exception unused) {
            Z5.a((byte) 1, "InMobi", "Could not pause ad; SDK encountered an unexpected error");
        }
    }

    public final void resume() {
        C1662i1 c1662i1;
        try {
            if (this.c == null && (c1662i1 = this.f14046b) != null) {
                A4 p10 = c1662i1.p();
                if (p10 != null) {
                    String str = AbstractC1676j1.f15207a;
                    g.d(str, "access$getTAG$p(...)");
                    ((B4) p10).a(str, "resume " + c1662i1);
                }
                C1592d1 c1592d1 = c1662i1.f15162q;
                if (c1592d1 != null) {
                    c1592d1.F0();
                }
            }
        } catch (Exception unused) {
            Z5.a((byte) 1, "InMobi", "Could not resume ad; SDK encountered an unexpected error");
        }
    }

    public final void setAudioSize(int i10, int i11) {
        this.f14049f = i10;
        this.f14050g = i11;
    }

    public final void setContentUrl(String contentUrl) {
        g.e(contentUrl, "contentUrl");
        this.f14047d.f15452f = contentUrl;
    }

    public final void setExtras(Map<String, String> map) {
        if (map != null) {
            String str = map.get("tp");
            if (str != null) {
                Ia.a(str);
            }
            String str2 = map.get("tp-v");
            if (str2 != null) {
                Ia.b(str2);
            }
        }
        this.f14047d.c = map;
    }

    public final void setKeywords(String str) {
        this.f14047d.f15449b = str;
    }

    public final void setListener(AudioAdEventListener listener) {
        g.e(listener, "listener");
        this.f14045a = listener;
    }

    public final void setMAdManager$media_release(C1662i1 c1662i1) {
        this.f14046b = c1662i1;
    }

    public final void setMPubListener$media_release(AudioAdEventListener audioAdEventListener) {
        this.f14045a = audioAdEventListener;
    }

    @TargetApi(16)
    public final void setupViewSizeObserver() {
        getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver$OnGlobalLayoutListenerC1785r4(this));
    }

    public final void show() {
        C1662i1 c1662i1 = this.f14046b;
        if (c1662i1 != null) {
            A4 p10 = c1662i1.p();
            if (p10 != null) {
                String str = AbstractC1676j1.f15207a;
                g.d(str, "access$getTAG$p(...)");
                ((B4) p10).a(str, "submitAdShowCalled " + c1662i1);
            }
            C1592d1 c1592d1 = c1662i1.f15163r;
            if (c1592d1 != null) {
                c1592d1.w0();
            }
        }
        C1662i1 c1662i12 = this.f14046b;
        if (c1662i12 != null) {
            c1662i12.a(this);
        }
    }

    public final boolean a() {
        C1662i1 c1662i1;
        long j10 = this.f14048e;
        if (j10 != 0 && (c1662i1 = this.f14046b) != null) {
            A4 p10 = c1662i1.p();
            if (p10 != null) {
                String str = AbstractC1676j1.f15207a;
                g.d(str, "access$getTAG$p(...)");
                ((B4) p10).c(str, "checkForRefreshRate " + c1662i1);
            }
            if (c1662i1.f15163r == null) {
                return false;
            }
            LinkedHashMap linkedHashMap = C1732n2.f15334a;
            int minRefreshInterval = ((AdConfig) AbstractC1773q4.a("ads", "null cannot be cast to non-null type com.inmobi.commons.core.configs.AdConfig", null)).getAudio().getMinRefreshInterval();
            if (SystemClock.elapsedRealtime() - j10 < minRefreshInterval * 1000) {
                c1662i1.a((short) 2175);
                C1592d1 c1592d1 = c1662i1.f15163r;
                InMobiAdRequestStatus inMobiAdRequestStatus = new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.EARLY_REFRESH_REQUEST);
                c1662i1.b(c1592d1, inMobiAdRequestStatus.setCustomMessage("Ad cannot be refreshed before " + minRefreshInterval + " seconds"));
                String str2 = AbstractC1676j1.f15207a;
                g.d(str2, "access$getTAG$p(...)");
                StringBuilder sb2 = new StringBuilder("Ad cannot be refreshed before ");
                sb2.append(minRefreshInterval);
                sb2.append(" seconds (AdPlacement Id = ");
                C1592d1 c1592d12 = c1662i1.f15163r;
                sb2.append(c1592d12 != null ? c1592d12.I() : null);
                sb2.append(')');
                Z5.a((byte) 1, str2, sb2.toString());
                A4 p11 = c1662i1.p();
                if (p11 != null) {
                    StringBuilder e10 = androidx.appcompat.view.menu.d.e("Ad cannot be refreshed before ", minRefreshInterval, " seconds (AdPlacement Id = ");
                    C1592d1 c1592d13 = c1662i1.f15163r;
                    e10.append(c1592d13 != null ? c1592d13.I() : null);
                    e10.append(')');
                    ((B4) p11).b(str2, e10.toString());
                    return false;
                }
                return false;
            }
        }
        this.f14048e = SystemClock.elapsedRealtime();
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InMobiAudio(Context context, long j10) {
        super(context);
        g.e(context, "context");
        a aVar = new a(this);
        C1803s9 c1803s9 = new C1803s9();
        this.f14047d = c1803s9;
        if (Ha.q()) {
            if (context instanceof Activity) {
                this.c = new WeakReference(context);
            }
            this.f14046b = new C1662i1(aVar);
            c1803s9.f15448a = j10;
            a(context);
            return;
        }
        throw new SdkNotInitializedException("InMobiAudio");
    }

    public final void a(Context context) {
        C1662i1 c1662i1 = this.f14046b;
        if (c1662i1 != null) {
            C1803s9 pubSettings = this.f14047d;
            String adSize = getFrameSizeString();
            g.e(context, "context");
            g.e(pubSettings, "pubSettings");
            g.e(adSize, "adSize");
            String str = AbstractC1676j1.f15207a;
            g.d(str, "access$getTAG$p(...)");
            J a10 = new H("audio").d(context instanceof Activity ? "activity" : "others").a(pubSettings.f15448a).c(pubSettings.f15449b).a(pubSettings.c).a(adSize).a(pubSettings.f15450d).e(pubSettings.f15451e).b(pubSettings.f15452f).a();
            C1592d1 c1592d1 = c1662i1.f15160o;
            if (c1592d1 != null && c1662i1.f15161p != null) {
                c1592d1.a(context, a10, c1662i1);
                C1592d1 c1592d12 = c1662i1.f15161p;
                if (c1592d12 != null) {
                    c1592d12.a(context, a10, c1662i1);
                }
            } else {
                c1662i1.f15160o = new C1592d1(context, a10, c1662i1);
                c1662i1.f15161p = new C1592d1(context, a10, c1662i1);
                c1662i1.f15163r = c1662i1.f15160o;
            }
            String str2 = pubSettings.f15451e;
            if (str2 != null) {
                A4 p10 = c1662i1.p();
                if (p10 != null) {
                    ((B4) p10).a();
                }
                c1662i1.a(E9.a("audio", str2, false));
                A4 p11 = c1662i1.p();
                if (p11 != null) {
                    ((B4) p11).a(str, "adding audioAdUnit1 to reference tracker");
                }
                C1592d1 c1592d13 = c1662i1.f15160o;
                g.b(c1592d13);
                E9.a(c1592d13, c1662i1.p());
                A4 p12 = c1662i1.p();
                if (p12 != null) {
                    ((B4) p12).a(str, "adding audioAdUnit2 to reference tracker");
                }
                C1592d1 c1592d14 = c1662i1.f15161p;
                g.b(c1592d14);
                E9.a(c1592d14, c1662i1.p());
            }
        }
    }
}
