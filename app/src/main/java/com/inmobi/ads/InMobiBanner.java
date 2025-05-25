package com.inmobi.ads;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import android.view.View;
import android.view.WindowInsets;
import android.view.animation.Animation;
import android.widget.RelativeLayout;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.banner.AudioListener;
import com.inmobi.ads.controllers.PublisherCallbacks;
import com.inmobi.ads.exceptions.SdkNotInitializedException;
import com.inmobi.ads.listeners.BannerAdEventListener;
import com.inmobi.media.A4;
import com.inmobi.media.AbstractC1574bb;
import com.inmobi.media.AbstractC1692k3;
import com.inmobi.media.AbstractC1704l1;
import com.inmobi.media.B4;
import com.inmobi.media.C1706l3;
import com.inmobi.media.C1718m1;
import com.inmobi.media.C1795s1;
import com.inmobi.media.C1803s9;
import com.inmobi.media.C1811t4;
import com.inmobi.media.C1824u4;
import com.inmobi.media.C1834v1;
import com.inmobi.media.EnumC1648h1;
import com.inmobi.media.Ha;
import com.inmobi.media.HandlerC1808t1;
import com.inmobi.media.Ia;
import com.inmobi.media.ViewTreeObserver$OnGlobalLayoutListenerC1837v4;
import com.inmobi.media.Z5;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.jvm.internal.g;

/* loaded from: classes2.dex */
public final class InMobiBanner extends RelativeLayout {
    public static final C1811t4 Companion = new C1811t4();

    /* renamed from: a  reason: collision with root package name */
    public AbstractC1704l1 f14051a;

    /* renamed from: b  reason: collision with root package name */
    public AudioListener f14052b;
    public EnumC1648h1 c;

    /* renamed from: d  reason: collision with root package name */
    public C1834v1 f14053d;

    /* renamed from: e  reason: collision with root package name */
    public final a f14054e;

    /* renamed from: f  reason: collision with root package name */
    public int f14055f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f14056g;

    /* renamed from: h  reason: collision with root package name */
    public final HandlerC1808t1 f14057h;

    /* renamed from: i  reason: collision with root package name */
    public int f14058i;

    /* renamed from: j  reason: collision with root package name */
    public int f14059j;

    /* renamed from: k  reason: collision with root package name */
    public AnimationType f14060k;

    /* renamed from: l  reason: collision with root package name */
    public long f14061l;

    /* renamed from: m  reason: collision with root package name */
    public WeakReference f14062m;

    /* renamed from: n  reason: collision with root package name */
    public final C1803s9 f14063n;

    /* renamed from: o  reason: collision with root package name */
    public final e f14064o;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes2.dex */
    public static final class AnimationType {
        private static final /* synthetic */ xf.a $ENTRIES;
        private static final /* synthetic */ AnimationType[] $VALUES;
        public static final AnimationType ANIMATION_OFF = new AnimationType("ANIMATION_OFF", 0);
        public static final AnimationType ROTATE_HORIZONTAL_AXIS = new AnimationType("ROTATE_HORIZONTAL_AXIS", 1);
        public static final AnimationType ANIMATION_ALPHA = new AnimationType("ANIMATION_ALPHA", 2);
        public static final AnimationType ROTATE_VERTICAL_AXIS = new AnimationType("ROTATE_VERTICAL_AXIS", 3);

        private static final /* synthetic */ AnimationType[] $values() {
            return new AnimationType[]{ANIMATION_OFF, ROTATE_HORIZONTAL_AXIS, ANIMATION_ALPHA, ROTATE_VERTICAL_AXIS};
        }

        static {
            AnimationType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
        }

        private AnimationType(String str, int i10) {
        }

        public static xf.a<AnimationType> getEntries() {
            return $ENTRIES;
        }

        public static AnimationType valueOf(String str) {
            return (AnimationType) Enum.valueOf(AnimationType.class, str);
        }

        public static AnimationType[] values() {
            return (AnimationType[]) $VALUES.clone();
        }
    }

    /* loaded from: classes2.dex */
    public static final class a extends C1795s1 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InMobiBanner banner) {
            super(banner);
            g.e(banner, "banner");
        }

        @Override // com.inmobi.media.C1795s1, com.inmobi.ads.controllers.PublisherCallbacks
        public byte getType() {
            return (byte) 0;
        }

        @Override // com.inmobi.media.C1795s1, com.inmobi.ads.controllers.PublisherCallbacks
        public void onAdFetchFailed(InMobiAdRequestStatus status) {
            g.e(status, "status");
            InMobiBanner inMobiBanner = a().get();
            if (inMobiBanner == null) {
                return;
            }
            AbstractC1704l1 mPubListener$media_release = inMobiBanner.getMPubListener$media_release();
            if (mPubListener$media_release != null) {
                mPubListener$media_release.onAdLoadFailed(inMobiBanner, status);
            }
            inMobiBanner.scheduleRefresh$media_release();
        }

        @Override // com.inmobi.media.C1795s1, com.inmobi.ads.controllers.PublisherCallbacks
        public void onAdFetchSuccessful(AdMetaInfo info) {
            g.e(info, "info");
            super.onAdFetchSuccessful(info);
            InMobiBanner inMobiBanner = a().get();
            if (inMobiBanner != null) {
                try {
                    C1834v1 mAdManager$media_release = inMobiBanner.getMAdManager$media_release();
                    if (mAdManager$media_release != null) {
                        mAdManager$media_release.G();
                    }
                } catch (IllegalStateException e10) {
                    String access$getTAG$cp = InMobiBanner.access$getTAG$cp();
                    g.d(access$getTAG$cp, "access$getTAG$cp(...)");
                    Z5.a((byte) 1, access$getTAG$cp, e10.getMessage());
                    AbstractC1704l1 mPubListener$media_release = inMobiBanner.getMPubListener$media_release();
                    if (mPubListener$media_release != null) {
                        mPubListener$media_release.onAdLoadFailed(inMobiBanner, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
                    }
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0136  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public InMobiBanner(android.content.Context r13, android.util.AttributeSet r14) {
        /*
            Method dump skipped, instructions count: 425
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.ads.InMobiBanner.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public static final boolean access$checkForRefreshRate(InMobiBanner inMobiBanner) {
        C1834v1 c1834v1;
        long j10 = inMobiBanner.f14061l;
        if (j10 != 0 && (c1834v1 = inMobiBanner.f14053d) != null && !c1834v1.a(j10)) {
            return false;
        }
        inMobiBanner.f14061l = SystemClock.elapsedRealtime();
        return true;
    }

    public static final /* synthetic */ String access$getTAG$cp() {
        return "InMobiBanner";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getFrameSizeString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f14058i);
        sb2.append('x');
        sb2.append(this.f14059j);
        return sb2.toString();
    }

    public final boolean a(boolean z10) {
        A4 p10;
        A4 p11;
        C1834v1 c1834v1 = this.f14053d;
        if (c1834v1 != null && (p11 = c1834v1.p()) != null) {
            ((B4) p11).c("InMobiBanner", "checkStateAndLogError");
        }
        if (z10 && this.f14051a == null) {
            C1834v1 c1834v12 = this.f14053d;
            if (c1834v12 != null && (p10 = c1834v12.p()) != null) {
                ((B4) p10).b("InMobiBanner", "Listener supplied is null, Ignoring your call.");
            }
            return false;
        }
        return true;
    }

    public final boolean b() {
        if (this.f14058i > 0 && this.f14059j > 0) {
            return true;
        }
        return false;
    }

    public final void destroy() {
        a();
        removeAllViews();
        C1834v1 c1834v1 = this.f14053d;
        if (c1834v1 != null) {
            c1834v1.z();
        }
        this.f14051a = null;
    }

    public final void disableHardwareAcceleration() {
        this.f14063n.f15450d = true;
    }

    public final EnumC1648h1 getAudioStatusInternal$media_release() {
        return this.c;
    }

    public final C1834v1 getMAdManager$media_release() {
        return this.f14053d;
    }

    public final AudioListener getMAudioListener$media_release() {
        return this.f14052b;
    }

    public final AbstractC1704l1 getMPubListener$media_release() {
        return this.f14051a;
    }

    public final C1803s9 getMPubSettings$media_release() {
        return this.f14063n;
    }

    public final long getPlacementId() {
        return this.f14063n.f15448a;
    }

    public final PreloadManager getPreloadManager() {
        return this.f14064o;
    }

    public final void getSignals() {
        A4 p10;
        if (a(true)) {
            if (a("getSignals()")) {
                C1834v1 c1834v1 = this.f14053d;
                if (c1834v1 == null || !c1834v1.D()) {
                    Context context = getContext();
                    g.d(context, "getContext(...)");
                    a(context, "getToken");
                }
                C1834v1 c1834v12 = this.f14053d;
                if (c1834v12 != null && (p10 = c1834v12.p()) != null) {
                    ((B4) p10).a("InMobiBanner", "getSignals");
                }
                setEnableAutoRefresh(false);
                C1834v1 c1834v13 = this.f14053d;
                if (c1834v13 != null) {
                    c1834v13.a(this.f14054e);
                    return;
                }
                return;
            }
            this.f14054e.onRequestPayloadCreationFailed(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.CONFIGURATION_ERROR));
        }
    }

    public final boolean isAudioAd() {
        C1834v1 c1834v1 = this.f14053d;
        if (c1834v1 != null) {
            return c1834v1.C();
        }
        return false;
    }

    public final void load(byte[] bArr) {
        C1834v1 c1834v1;
        C1834v1 c1834v12;
        if (a(false)) {
            this.f14063n.f15451e = "AB";
            if (getLayoutParams() != null) {
                this.f14058i = AbstractC1692k3.a(getLayoutParams().width);
                this.f14059j = AbstractC1692k3.a(getLayoutParams().height);
            }
            C1834v1 c1834v13 = this.f14053d;
            if (c1834v13 == null || !c1834v13.D() || ((c1834v1 = this.f14053d) != null && c1834v1.D() && (c1834v12 = this.f14053d) != null && c1834v12.q() == 0)) {
                Context context = getContext();
                g.d(context, "getContext(...)");
                a(context, "banner");
            }
            C1834v1 c1834v14 = this.f14053d;
            if (c1834v14 != null) {
                c1834v14.w();
            }
            a("load(byte[])", new d(this, bArr));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        A4 p10;
        try {
            super.onAttachedToWindow();
            C1834v1 c1834v1 = this.f14053d;
            if (c1834v1 != null) {
                c1834v1.F();
            }
            if (getLayoutParams() != null) {
                this.f14058i = AbstractC1692k3.a(getLayoutParams().width);
                this.f14059j = AbstractC1692k3.a(getLayoutParams().height);
            }
            if (!b()) {
                setupBannerSizeObserver();
            }
            scheduleRefresh$media_release();
            if (Build.VERSION.SDK_INT >= 29) {
                C1706l3 c1706l3 = AbstractC1692k3.f15250a;
                Context context = getContext();
                WindowInsets rootWindowInsets = getRootWindowInsets();
                g.d(rootWindowInsets, "getRootWindowInsets(...)");
                AbstractC1692k3.a(rootWindowInsets, context);
            }
        } catch (Exception e10) {
            C1834v1 c1834v12 = this.f14053d;
            if (c1834v12 != null && (p10 = c1834v12.p()) != null) {
                ((B4) p10).a("InMobiBanner", "InMobiBanner#onAttachedToWindow() handler threw unexpected error: ", e10);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        A4 p10;
        try {
            super.onDetachedFromWindow();
            a();
            C1834v1 c1834v1 = this.f14053d;
            if (c1834v1 != null) {
                c1834v1.K();
            }
        } catch (Exception e10) {
            C1834v1 c1834v12 = this.f14053d;
            if (c1834v12 != null && (p10 = c1834v12.p()) != null) {
                ((B4) p10).a("InMobiBanner", "InMobiBanner.onDetachedFromWindow() handler threw unexpected error: ", e10);
            }
        }
    }

    @Override // android.view.View
    public void onVisibilityChanged(View changedView, int i10) {
        A4 p10;
        g.e(changedView, "changedView");
        try {
            super.onVisibilityChanged(changedView, i10);
            if (i10 == 0) {
                scheduleRefresh$media_release();
            } else {
                a();
            }
        } catch (Exception e10) {
            C1834v1 c1834v1 = this.f14053d;
            if (c1834v1 != null && (p10 = c1834v1.p()) != null) {
                ((B4) p10).a("InMobiBanner", "InMobiBanner$1.onVisibilityChanged() handler threw unexpected error: ", e10);
            }
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
        A4 p10;
        try {
            super.onWindowFocusChanged(z10);
            if (z10) {
                scheduleRefresh$media_release();
            } else {
                a();
            }
        } catch (Exception e10) {
            C1834v1 c1834v1 = this.f14053d;
            if (c1834v1 != null && (p10 = c1834v1.p()) != null) {
                ((B4) p10).a("InMobiBanner", "InMobiBanner$1.onWindowFocusChanged() handler threw unexpected error: ", e10);
            }
        }
    }

    public final void pause() {
        A4 p10;
        C1834v1 c1834v1;
        try {
            if (this.f14062m == null && (c1834v1 = this.f14053d) != null) {
                c1834v1.E();
            }
        } catch (Exception e10) {
            C1834v1 c1834v12 = this.f14053d;
            if (c1834v12 != null && (p10 = c1834v12.p()) != null) {
                ((B4) p10).a("InMobiBanner", "SDK encountered unexpected error in pausing ad; ", e10);
            }
        }
    }

    public final void refreshBanner$media_release() {
        a(this.f14054e, "NonAB", true);
    }

    public final void resume() {
        A4 p10;
        C1834v1 c1834v1;
        try {
            if (this.f14062m == null && (c1834v1 = this.f14053d) != null) {
                c1834v1.H();
            }
        } catch (Exception e10) {
            C1834v1 c1834v12 = this.f14053d;
            if (c1834v12 != null && (p10 = c1834v12.p()) != null) {
                ((B4) p10).a("InMobiBanner", "SDK encountered unexpected error in resuming ad; ", e10);
            }
        }
    }

    public final void scheduleRefresh$media_release() {
        HandlerC1808t1 handlerC1808t1;
        if (isShown() && hasWindowFocus()) {
            HandlerC1808t1 handlerC1808t12 = this.f14057h;
            if (handlerC1808t12 != null) {
                handlerC1808t12.removeMessages(1);
            }
            C1834v1 c1834v1 = this.f14053d;
            if (c1834v1 != null && c1834v1.y() && this.f14056g && (handlerC1808t1 = this.f14057h) != null) {
                handlerC1808t1.sendEmptyMessageDelayed(1, this.f14055f * 1000);
            }
        }
    }

    public final void setAnimationType(AnimationType animationType) {
        g.e(animationType, "animationType");
        this.f14060k = animationType;
    }

    public final void setAudioListener(AudioListener audioListener) {
        AudioStatus audioStatus;
        g.e(audioListener, "audioListener");
        this.f14052b = audioListener;
        EnumC1648h1 item = this.c;
        if (item != EnumC1648h1.f15115d) {
            EnumC1648h1.f15114b.getClass();
            g.e(item, "item");
            int ordinal = item.ordinal();
            if (ordinal != 1) {
                if (ordinal != 2) {
                    audioStatus = AudioStatus.COMPLETED;
                } else {
                    audioStatus = AudioStatus.PAUSED;
                }
            } else {
                audioStatus = AudioStatus.PLAYING;
            }
            audioListener.onAudioStatusChanged(this, audioStatus);
        }
    }

    public final void setAudioStatusInternal$media_release(EnumC1648h1 enumC1648h1) {
        g.e(enumC1648h1, "<set-?>");
        this.c = enumC1648h1;
    }

    public final void setBannerSize(int i10, int i11) {
        this.f14058i = i10;
        this.f14059j = i11;
    }

    public final void setContentUrl(String contentUrl) {
        g.e(contentUrl, "contentUrl");
        this.f14063n.f15452f = contentUrl;
    }

    public final void setEnableAutoRefresh(boolean z10) {
        A4 p10;
        try {
            if (this.f14056g == z10) {
                return;
            }
            this.f14056g = z10;
            if (z10) {
                scheduleRefresh$media_release();
            } else {
                a();
            }
        } catch (Exception e10) {
            C1834v1 c1834v1 = this.f14053d;
            if (c1834v1 != null && (p10 = c1834v1.p()) != null) {
                ((B4) p10).a("InMobiBanner", "Setting up auto-refresh failed with unexpected error: ", e10);
            }
        }
    }

    public final void setExtras(Map<String, String> map) {
        if (map != null) {
            Ia.a(map.get("tp"));
            Ia.b(map.get("tp-v"));
        }
        this.f14063n.c = map;
    }

    public final void setKeywords(String str) {
        this.f14063n.f15449b = str;
    }

    public final void setListener(BannerAdEventListener listener) {
        g.e(listener, "listener");
        this.f14051a = new C1718m1(listener);
    }

    public final void setMAdManager$media_release(C1834v1 c1834v1) {
        this.f14053d = c1834v1;
    }

    public final void setMAudioListener$media_release(AudioListener audioListener) {
        this.f14052b = audioListener;
    }

    public final void setMPubListener$media_release(AbstractC1704l1 abstractC1704l1) {
        this.f14051a = abstractC1704l1;
    }

    public final void setRefreshInterval(int i10) {
        A4 p10;
        int i11;
        try {
            this.f14063n.f15451e = "NonAB";
            Context context = getContext();
            g.d(context, "getContext(...)");
            a(context, "banner");
            C1834v1 c1834v1 = this.f14053d;
            if (c1834v1 != null) {
                i11 = c1834v1.a(i10, this.f14055f);
            } else {
                i11 = 0;
            }
            this.f14055f = i11;
        } catch (Exception e10) {
            C1834v1 c1834v12 = this.f14053d;
            if (c1834v12 != null && (p10 = c1834v12.p()) != null) {
                ((B4) p10).a("InMobiBanner", "Setting refresh interval failed with unexpected error: ", e10);
            }
        }
    }

    public final void setWatermarkData(WatermarkData watermarkData) {
        g.e(watermarkData, "watermarkData");
        C1834v1 c1834v1 = this.f14053d;
        if (c1834v1 != null) {
            c1834v1.a(watermarkData);
        }
    }

    @TargetApi(16)
    public final void setupBannerSizeObserver() {
        getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver$OnGlobalLayoutListenerC1837v4(this));
    }

    public final void swapAdUnitsAndDisplayAd$media_release() {
        A4 p10;
        C1834v1 c1834v1 = this.f14053d;
        if (c1834v1 != null) {
            c1834v1.J();
        }
        try {
            Animation a10 = b.a(this.f14060k, getWidth(), getHeight());
            C1834v1 c1834v12 = this.f14053d;
            if (c1834v12 != null) {
                c1834v12.a(this);
            }
            if (a10 != null) {
                startAnimation(a10);
            }
        } catch (Exception e10) {
            C1834v1 c1834v13 = this.f14053d;
            if (c1834v13 != null && (p10 = c1834v13.p()) != null) {
                ((B4) p10).a("InMobiBanner", "Unexpected error while displaying Banner Ad : ", e10);
            }
        }
    }

    public final void a(PublisherCallbacks publisherCallbacks, String str, boolean z10) {
        A4 p10;
        A4 p11;
        A4 p12;
        A4 p13;
        A4 p14;
        try {
            this.f14063n.f15451e = str;
            C1834v1 c1834v1 = this.f14053d;
            if (c1834v1 != null && c1834v1.B()) {
                C1834v1 c1834v12 = this.f14053d;
                if (c1834v12 != null) {
                    c1834v12.w();
                }
                C1834v1 c1834v13 = this.f14053d;
                if (c1834v13 != null && (p14 = c1834v13.p()) != null) {
                    ((B4) p14).a("InMobiBanner", "load called - placementType - " + str + ' ' + this);
                }
                C1834v1 c1834v14 = this.f14053d;
                if (c1834v14 != null && (p13 = c1834v14.p()) != null) {
                    ((B4) p13).b("InMobiBanner", "load already in progress");
                }
                C1834v1 c1834v15 = this.f14053d;
                if (c1834v15 != null) {
                    c1834v15.b((short) 2169);
                }
                AbstractC1704l1 abstractC1704l1 = this.f14051a;
                if (abstractC1704l1 != null) {
                    abstractC1704l1.onAdLoadFailed(this, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.AD_ACTIVE));
                }
                C1834v1 c1834v16 = this.f14053d;
                if (c1834v16 != null && (p12 = c1834v16.p()) != null) {
                    ((B4) p12).b("InMobiBanner", "An ad is currently being viewed by the user. Please wait for the user to close the ad before requesting for another ad.");
                }
                Z5.a((byte) 1, "InMobi", "An ad is currently being viewed by the user. Please wait for the user to close the ad before requesting for another ad.");
                return;
            }
            Context context = getContext();
            g.d(context, "getContext(...)");
            a(context, "banner");
            C1834v1 c1834v17 = this.f14053d;
            if (c1834v17 != null) {
                c1834v17.w();
            }
            C1834v1 c1834v18 = this.f14053d;
            if (c1834v18 != null && (p11 = c1834v18.p()) != null) {
                ((B4) p11).a("InMobiBanner", "load called - placementType - " + str + ' ' + this);
            }
            a("load", new C1824u4(this, publisherCallbacks, z10));
        } catch (Exception e10) {
            C1834v1 c1834v19 = this.f14053d;
            if (c1834v19 != null) {
                c1834v19.a((short) 2172);
            }
            AbstractC1704l1 abstractC1704l12 = this.f14051a;
            if (abstractC1704l12 != null) {
                abstractC1704l12.onAdLoadFailed(this, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
            }
            C1834v1 c1834v110 = this.f14053d;
            if (c1834v110 == null || (p10 = c1834v110.p()) == null) {
                return;
            }
            ((B4) p10).a("InMobiBanner", "Load failed with unexpected error: ", e10);
        }
    }

    public final void load() {
        if (a(false)) {
            a(this.f14054e, "NonAB", false);
        }
    }

    public final void load(Context context) {
        g.e(context, "context");
        if (a(false)) {
            this.f14062m = context instanceof Activity ? new WeakReference(context) : null;
            a(this.f14054e, "NonAB", false);
        }
    }

    public final void a(String str, cg.a aVar) {
        A4 p10;
        A4 p11;
        C1834v1 c1834v1 = this.f14053d;
        if (c1834v1 != null && (p11 = c1834v1.p()) != null) {
            ((B4) p11).c("InMobiBanner", "validateSizeAndLoad");
        }
        if (!a(str)) {
            C1834v1 c1834v12 = this.f14053d;
            if (c1834v12 != null && (p10 = c1834v12.p()) != null) {
                ((B4) p10).b("InMobiBanner", "invalid banner size. fail.");
            }
            C1834v1 c1834v13 = this.f14053d;
            if (c1834v13 != null) {
                c1834v13.a((short) 2170);
            }
            AbstractC1704l1 abstractC1704l1 = this.f14051a;
            if (abstractC1704l1 != null) {
                abstractC1704l1.onAdLoadFailed(this, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.CONFIGURATION_ERROR));
            }
        } else if (!b()) {
            AbstractC1574bb.a(new androidx.fragment.app.g(6, this, aVar), 200L);
        } else {
            aVar.invoke();
        }
    }

    public static final void a(InMobiBanner this$0, cg.a onSuccess) {
        A4 p10;
        A4 p11;
        g.e(this$0, "this$0");
        g.e(onSuccess, "$onSuccess");
        try {
            if (this$0.b()) {
                onSuccess.invoke();
                return;
            }
            C1834v1 c1834v1 = this$0.f14053d;
            if (c1834v1 != null && (p11 = c1834v1.p()) != null) {
                ((B4) p11).b("InMobiBanner", "The height or width of the banner can not be determined");
            }
            C1834v1 c1834v12 = this$0.f14053d;
            if (c1834v12 != null) {
                c1834v12.a((short) 2171);
            }
            AbstractC1704l1 abstractC1704l1 = this$0.f14051a;
            if (abstractC1704l1 != null) {
                abstractC1704l1.onAdLoadFailed(this$0, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.CONFIGURATION_ERROR));
            }
        } catch (Exception e10) {
            C1834v1 c1834v13 = this$0.f14053d;
            if (c1834v13 != null) {
                c1834v13.a((short) 2172);
            }
            AbstractC1704l1 abstractC1704l12 = this$0.f14051a;
            if (abstractC1704l12 != null) {
                abstractC1704l12.onAdLoadFailed(this$0, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
            }
            C1834v1 c1834v14 = this$0.f14053d;
            if (c1834v14 == null || (p10 = c1834v14.p()) == null) {
                return;
            }
            ((B4) p10).a("InMobiBanner", "InMobiBanner$4.run() threw unexpected error: ", e10);
        }
    }

    public final boolean a(String str) {
        A4 p10;
        A4 p11;
        if (b()) {
            return true;
        }
        if (getLayoutParams() == null) {
            C1834v1 c1834v1 = this.f14053d;
            if (c1834v1 != null && (p11 = c1834v1.p()) != null) {
                ((B4) p11).b("InMobiBanner", androidx.appcompat.view.menu.d.d("The layout params of the banner must be set before calling ", str, " or call setBannerSize(int widthInDp, int heightInDp) before ", str));
            }
            return false;
        } else if (getLayoutParams().width != -2 && getLayoutParams().height != -2) {
            if (getLayoutParams() != null) {
                this.f14058i = AbstractC1692k3.a(getLayoutParams().width);
                this.f14059j = AbstractC1692k3.a(getLayoutParams().height);
                return true;
            }
            return true;
        } else {
            C1834v1 c1834v12 = this.f14053d;
            if (c1834v12 != null && (p10 = c1834v12.p()) != null) {
                ((B4) p10).b("InMobiBanner", "The height or width of a Banner ad can't be WRAP_CONTENT or call setBannerSize(int widthInDp, int heightInDp) before ".concat(str));
            }
            return false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InMobiBanner(Context context, long j10) {
        super(context);
        g.e(context, "context");
        this.c = EnumC1648h1.f15115d;
        this.f14054e = new a(this);
        this.f14056g = true;
        this.f14060k = AnimationType.ROTATE_HORIZONTAL_AXIS;
        C1803s9 c1803s9 = new C1803s9();
        this.f14063n = c1803s9;
        this.f14064o = new e(this);
        if (Ha.q()) {
            if (context instanceof Activity) {
                this.f14062m = new WeakReference(context);
            }
            this.f14053d = new C1834v1();
            c1803s9.f15448a = j10;
            a(context, "banner");
            C1834v1 c1834v1 = this.f14053d;
            this.f14055f = c1834v1 != null ? c1834v1.A() : 0;
            this.f14057h = new HandlerC1808t1(this);
            return;
        }
        throw new SdkNotInitializedException("InMobiBanner");
    }

    public final void a(Context context, String str) {
        int i10;
        C1834v1 c1834v1 = this.f14053d;
        if (c1834v1 != null) {
            c1834v1.a(context, this.f14063n, getFrameSizeString(), str);
        }
        C1834v1 c1834v12 = this.f14053d;
        if (c1834v12 != null) {
            int i11 = this.f14055f;
            i10 = c1834v12.a(i11, i11);
        } else {
            i10 = 0;
        }
        this.f14055f = i10;
    }

    public final void a() {
        HandlerC1808t1 handlerC1808t1 = this.f14057h;
        if (handlerC1808t1 != null) {
            handlerC1808t1.removeMessages(1);
        }
    }
}
