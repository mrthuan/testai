package com.inmobi.ads;

import android.content.Context;
import android.os.Build;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.exceptions.SdkNotInitializedException;
import com.inmobi.ads.listeners.InterstitialAdEventListener;
import com.inmobi.media.AbstractC1610e5;
import com.inmobi.media.AbstractC1692k3;
import com.inmobi.media.AbstractC1863x4;
import com.inmobi.media.C1624f5;
import com.inmobi.media.C1680j5;
import com.inmobi.media.C1694k5;
import com.inmobi.media.C1803s9;
import com.inmobi.media.C1876y4;
import com.inmobi.media.Ha;
import com.inmobi.media.Ia;
import com.inmobi.media.Q4;
import com.inmobi.media.Z5;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.jvm.internal.g;

/* loaded from: classes2.dex */
public final class InMobiInterstitial {
    public static final C1876y4 Companion = new C1876y4();

    /* renamed from: a  reason: collision with root package name */
    public final Context f14065a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f14066b;
    public final WeakReference c;

    /* renamed from: d  reason: collision with root package name */
    public final C1803s9 f14067d;

    /* renamed from: e  reason: collision with root package name */
    public final a f14068e;

    /* renamed from: f  reason: collision with root package name */
    public final f f14069f;
    public C1694k5 mAdManager;
    public AbstractC1610e5 mPubListener;

    /* loaded from: classes2.dex */
    public static final class a extends C1680j5 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InMobiInterstitial interstitial) {
            super(interstitial);
            g.e(interstitial, "interstitial");
        }

        @Override // com.inmobi.media.C1680j5, com.inmobi.ads.controllers.PublisherCallbacks
        public byte getType() {
            return (byte) 0;
        }

        @Override // com.inmobi.media.C1680j5, com.inmobi.ads.controllers.PublisherCallbacks
        public void onAdFetchFailed(InMobiAdRequestStatus status) {
            AbstractC1610e5 mPubListener$media_release;
            g.e(status, "status");
            InMobiInterstitial inMobiInterstitial = this.f15212a.get();
            if (inMobiInterstitial != null && (mPubListener$media_release = inMobiInterstitial.getMPubListener$media_release()) != null) {
                mPubListener$media_release.onAdLoadFailed(inMobiInterstitial, status);
            }
        }

        @Override // com.inmobi.media.C1680j5, com.inmobi.ads.controllers.PublisherCallbacks
        public void onAdFetchSuccessful(AdMetaInfo info) {
            g.e(info, "info");
            super.onAdFetchSuccessful(info);
            InMobiInterstitial inMobiInterstitial = this.f15212a.get();
            if (inMobiInterstitial != null) {
                try {
                    inMobiInterstitial.getMAdManager$media_release().D();
                } catch (IllegalStateException e10) {
                    String access$getTAG$cp = InMobiInterstitial.access$getTAG$cp();
                    g.d(access$getTAG$cp, "access$getTAG$cp(...)");
                    Z5.a((byte) 1, access$getTAG$cp, e10.getMessage());
                    inMobiInterstitial.getMPubListener$media_release().onAdLoadFailed(inMobiInterstitial, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
                }
            }
        }
    }

    public InMobiInterstitial(Context context, long j10, InterstitialAdEventListener listener) {
        g.e(context, "context");
        g.e(listener, "listener");
        C1803s9 c1803s9 = new C1803s9();
        this.f14067d = c1803s9;
        this.f14068e = new a(this);
        this.f14069f = new f(this);
        if (Ha.q()) {
            Context applicationContext = context.getApplicationContext();
            g.d(applicationContext, "getApplicationContext(...)");
            this.f14065a = applicationContext;
            c1803s9.f15448a = j10;
            this.c = new WeakReference(context);
            setMPubListener$media_release(new C1624f5(listener));
            setMAdManager$media_release(new C1694k5());
            return;
        }
        throw new SdkNotInitializedException("InMobiInterstitial");
    }

    public static final /* synthetic */ String access$getTAG$cp() {
        return "InMobiInterstitial";
    }

    public final void disableHardwareAcceleration() {
        this.f14067d.f15450d = true;
    }

    public final C1694k5 getMAdManager$media_release() {
        C1694k5 c1694k5 = this.mAdManager;
        if (c1694k5 != null) {
            return c1694k5;
        }
        g.i("mAdManager");
        throw null;
    }

    public final AbstractC1610e5 getMPubListener$media_release() {
        AbstractC1610e5 abstractC1610e5 = this.mPubListener;
        if (abstractC1610e5 != null) {
            return abstractC1610e5;
        }
        g.i("mPubListener");
        throw null;
    }

    public final PreloadManager getPreloadManager() {
        return this.f14069f;
    }

    public final void getSignals() {
        this.f14067d.f15451e = "AB";
        C1694k5 mAdManager$media_release = getMAdManager$media_release();
        C1803s9 c1803s9 = this.f14067d;
        Context context = this.f14065a;
        if (context != null) {
            mAdManager$media_release.a(c1803s9, context, false, "getToken");
            getMAdManager$media_release().a(this.f14068e);
            return;
        }
        g.i("mContext");
        throw null;
    }

    public final boolean isReady() {
        boolean B = getMAdManager$media_release().B();
        if (!B) {
            getMAdManager$media_release().E();
        }
        return B;
    }

    public final void load(byte[] bArr) {
        this.f14066b = true;
        this.f14067d.f15451e = "AB";
        C1694k5 mAdManager$media_release = getMAdManager$media_release();
        C1803s9 c1803s9 = this.f14067d;
        Context context = this.f14065a;
        if (context != null) {
            C1694k5.a(mAdManager$media_release, c1803s9, context, false, null, 12, null);
            if (Build.VERSION.SDK_INT >= 29) {
                AbstractC1692k3.c((Context) this.c.get());
            }
            getMAdManager$media_release().a(bArr, this.f14068e);
            return;
        }
        g.i("mContext");
        throw null;
    }

    public final void loadAdUnit() {
        getMAdManager$media_release().c(this.f14068e);
    }

    public final void setContentUrl(String contentUrl) {
        g.e(contentUrl, "contentUrl");
        this.f14067d.f15452f = contentUrl;
    }

    public final void setExtras(Map<String, String> map) {
        if (map != null) {
            Ia.a(map.get("tp"));
            Ia.b(map.get("tp-v"));
        }
        this.f14067d.c = map;
    }

    public final void setKeywords(String str) {
        this.f14067d.f15449b = str;
    }

    public final void setListener(InterstitialAdEventListener listener) {
        g.e(listener, "listener");
        setMPubListener$media_release(new C1624f5(listener));
    }

    public final void setMAdManager$media_release(C1694k5 c1694k5) {
        g.e(c1694k5, "<set-?>");
        this.mAdManager = c1694k5;
    }

    public final void setMPubListener$media_release(AbstractC1610e5 abstractC1610e5) {
        g.e(abstractC1610e5, "<set-?>");
        this.mPubListener = abstractC1610e5;
    }

    public final void setWatermarkData(WatermarkData watermarkData) {
        g.e(watermarkData, "watermarkData");
        getMAdManager$media_release().a(watermarkData);
    }

    public final void show() {
        try {
            if (!this.f14066b) {
                Z5.a((byte) 1, "InMobiInterstitial", "load() must be called before trying to show the ad");
            } else {
                getMAdManager$media_release().F();
            }
        } catch (Exception e10) {
            Z5.a((byte) 1, "InMobiInterstitial", "Unable to show ad; SDK encountered an unexpected error");
            Q4 q42 = Q4.f14590a;
            Q4.c.a(AbstractC1863x4.a(e10, "event"));
        }
    }

    public final void load() {
        try {
            this.f14066b = true;
            this.f14067d.f15451e = "NonAB";
            C1694k5 mAdManager$media_release = getMAdManager$media_release();
            C1803s9 c1803s9 = this.f14067d;
            Context context = this.f14065a;
            if (context != null) {
                C1694k5.a(mAdManager$media_release, c1803s9, context, false, null, 12, null);
                if (Build.VERSION.SDK_INT >= 29) {
                    AbstractC1692k3.c((Context) this.c.get());
                }
                loadAdUnit();
                return;
            }
            g.i("mContext");
            throw null;
        } catch (Exception e10) {
            Z5.a((byte) 1, "InMobiInterstitial", "Unable to load ad; SDK encountered an unexpected error");
            getMAdManager$media_release().a((short) 2000);
            getMAdManager$media_release().a(getMAdManager$media_release().j(), new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
            Q4 q42 = Q4.f14590a;
            Q4.c.a(AbstractC1863x4.a(e10, "event"));
        }
    }
}
