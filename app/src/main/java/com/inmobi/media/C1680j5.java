package com.inmobi.media;

import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.InMobiInterstitial;
import com.inmobi.ads.controllers.PublisherCallbacks;
import java.lang.ref.WeakReference;
import java.util.Map;

/* renamed from: com.inmobi.media.j5  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1680j5 extends PublisherCallbacks {

    /* renamed from: a  reason: collision with root package name */
    public WeakReference<InMobiInterstitial> f15212a;

    public C1680j5(InMobiInterstitial interstitial) {
        kotlin.jvm.internal.g.e(interstitial, "interstitial");
        this.f15212a = new WeakReference<>(interstitial);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public byte getType() {
        return (byte) 1;
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdClicked(Map<Object, ? extends Object> params) {
        AbstractC1610e5 mPubListener$media_release;
        kotlin.jvm.internal.g.e(params, "params");
        InMobiInterstitial inMobiInterstitial = this.f15212a.get();
        if (inMobiInterstitial != null && (mPubListener$media_release = inMobiInterstitial.getMPubListener$media_release()) != null) {
            mPubListener$media_release.onAdClicked(inMobiInterstitial, params);
        }
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdDismissed() {
        AbstractC1610e5 mPubListener$media_release;
        InMobiInterstitial inMobiInterstitial = this.f15212a.get();
        if (inMobiInterstitial != null && (mPubListener$media_release = inMobiInterstitial.getMPubListener$media_release()) != null) {
            ((C1624f5) mPubListener$media_release).f15048a.onAdDismissed(inMobiInterstitial);
        }
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdDisplayFailed() {
        AbstractC1610e5 mPubListener$media_release;
        InMobiInterstitial inMobiInterstitial = this.f15212a.get();
        if (inMobiInterstitial != null && (mPubListener$media_release = inMobiInterstitial.getMPubListener$media_release()) != null) {
            ((C1624f5) mPubListener$media_release).f15048a.onAdDisplayFailed(inMobiInterstitial);
        }
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdDisplayed(AdMetaInfo info) {
        AbstractC1610e5 mPubListener$media_release;
        kotlin.jvm.internal.g.e(info, "info");
        InMobiInterstitial inMobiInterstitial = this.f15212a.get();
        if (inMobiInterstitial != null && (mPubListener$media_release = inMobiInterstitial.getMPubListener$media_release()) != null) {
            ((C1624f5) mPubListener$media_release).f15048a.onAdDisplayed(inMobiInterstitial, info);
        }
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdFetchFailed(InMobiAdRequestStatus status) {
        AbstractC1610e5 mPubListener$media_release;
        kotlin.jvm.internal.g.e(status, "status");
        InMobiInterstitial inMobiInterstitial = this.f15212a.get();
        if (inMobiInterstitial != null && (mPubListener$media_release = inMobiInterstitial.getMPubListener$media_release()) != null) {
            ((C1624f5) mPubListener$media_release).f15048a.onAdFetchFailed(inMobiInterstitial, status);
        }
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdFetchSuccessful(AdMetaInfo info) {
        AbstractC1610e5 mPubListener$media_release;
        kotlin.jvm.internal.g.e(info, "info");
        InMobiInterstitial inMobiInterstitial = this.f15212a.get();
        if (inMobiInterstitial != null && (mPubListener$media_release = inMobiInterstitial.getMPubListener$media_release()) != null) {
            mPubListener$media_release.onAdFetchSuccessful(inMobiInterstitial, info);
        }
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdImpression(C1780qb c1780qb) {
        AbstractC1610e5 abstractC1610e5;
        InMobiInterstitial inMobiInterstitial = this.f15212a.get();
        if (inMobiInterstitial != null) {
            abstractC1610e5 = inMobiInterstitial.getMPubListener$media_release();
        } else {
            abstractC1610e5 = null;
        }
        if (abstractC1610e5 == null) {
            if (c1780qb != null) {
                c1780qb.c();
                return;
            }
            return;
        }
        abstractC1610e5.onAdImpression(inMobiInterstitial);
        if (c1780qb != null) {
            c1780qb.d();
        }
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdLoadFailed(InMobiAdRequestStatus status) {
        AbstractC1610e5 mPubListener$media_release;
        kotlin.jvm.internal.g.e(status, "status");
        InMobiInterstitial inMobiInterstitial = this.f15212a.get();
        if (inMobiInterstitial != null && (mPubListener$media_release = inMobiInterstitial.getMPubListener$media_release()) != null) {
            mPubListener$media_release.onAdLoadFailed(inMobiInterstitial, status);
        }
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdLoadSucceeded(AdMetaInfo info) {
        AbstractC1610e5 mPubListener$media_release;
        kotlin.jvm.internal.g.e(info, "info");
        InMobiInterstitial inMobiInterstitial = this.f15212a.get();
        if (inMobiInterstitial != null && (mPubListener$media_release = inMobiInterstitial.getMPubListener$media_release()) != null) {
            mPubListener$media_release.onAdLoadSucceeded(inMobiInterstitial, info);
        }
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdWillDisplay() {
        AbstractC1610e5 mPubListener$media_release;
        InMobiInterstitial inMobiInterstitial = this.f15212a.get();
        if (inMobiInterstitial != null && (mPubListener$media_release = inMobiInterstitial.getMPubListener$media_release()) != null) {
            ((C1624f5) mPubListener$media_release).f15048a.onAdWillDisplay(inMobiInterstitial);
        }
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onImraidLog(String log) {
        AbstractC1610e5 mPubListener$media_release;
        kotlin.jvm.internal.g.e(log, "log");
        InMobiInterstitial inMobiInterstitial = this.f15212a.get();
        if (inMobiInterstitial == null || (mPubListener$media_release = inMobiInterstitial.getMPubListener$media_release()) == null) {
            return;
        }
        mPubListener$media_release.onImraidLog(inMobiInterstitial, log);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onRequestPayloadCreated(byte[] request) {
        AbstractC1610e5 mPubListener$media_release;
        kotlin.jvm.internal.g.e(request, "request");
        InMobiInterstitial inMobiInterstitial = this.f15212a.get();
        if (inMobiInterstitial != null && (mPubListener$media_release = inMobiInterstitial.getMPubListener$media_release()) != null) {
            ((C1624f5) mPubListener$media_release).f15048a.onRequestPayloadCreated(request);
        }
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onRequestPayloadCreationFailed(InMobiAdRequestStatus reason) {
        AbstractC1610e5 mPubListener$media_release;
        kotlin.jvm.internal.g.e(reason, "reason");
        InMobiInterstitial inMobiInterstitial = this.f15212a.get();
        if (inMobiInterstitial != null && (mPubListener$media_release = inMobiInterstitial.getMPubListener$media_release()) != null) {
            ((C1624f5) mPubListener$media_release).f15048a.onRequestPayloadCreationFailed(reason);
        }
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onRewardsUnlocked(Map<Object, ? extends Object> rewards) {
        AbstractC1610e5 mPubListener$media_release;
        kotlin.jvm.internal.g.e(rewards, "rewards");
        InMobiInterstitial inMobiInterstitial = this.f15212a.get();
        if (inMobiInterstitial != null && (mPubListener$media_release = inMobiInterstitial.getMPubListener$media_release()) != null) {
            ((C1624f5) mPubListener$media_release).f15048a.onRewardsUnlocked(inMobiInterstitial, rewards);
        }
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onUserLeftApplication() {
        AbstractC1610e5 mPubListener$media_release;
        InMobiInterstitial inMobiInterstitial = this.f15212a.get();
        if (inMobiInterstitial != null && (mPubListener$media_release = inMobiInterstitial.getMPubListener$media_release()) != null) {
            ((C1624f5) mPubListener$media_release).f15048a.onUserLeftApplication(inMobiInterstitial);
        }
    }
}
