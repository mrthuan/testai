package com.inmobi.media;

import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.AudioStatus;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.InMobiBanner;
import com.inmobi.ads.banner.AudioListener;
import com.inmobi.ads.controllers.PublisherCallbacks;
import java.lang.ref.WeakReference;
import java.util.Map;

/* renamed from: com.inmobi.media.s1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1795s1 extends PublisherCallbacks {

    /* renamed from: a  reason: collision with root package name */
    private WeakReference<InMobiBanner> f15428a;

    public C1795s1(InMobiBanner banner) {
        kotlin.jvm.internal.g.e(banner, "banner");
        this.f15428a = new WeakReference<>(banner);
    }

    public final WeakReference<InMobiBanner> a() {
        return this.f15428a;
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public byte getType() {
        return (byte) 1;
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdClicked(Map<Object, ? extends Object> params) {
        AbstractC1704l1 mPubListener$media_release;
        kotlin.jvm.internal.g.e(params, "params");
        InMobiBanner inMobiBanner = this.f15428a.get();
        if (inMobiBanner != null && (mPubListener$media_release = inMobiBanner.getMPubListener$media_release()) != null) {
            mPubListener$media_release.onAdClicked(inMobiBanner, params);
        }
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdDismissed() {
        InMobiBanner inMobiBanner = this.f15428a.get();
        if (inMobiBanner == null) {
            return;
        }
        AbstractC1704l1 mPubListener$media_release = inMobiBanner.getMPubListener$media_release();
        if (mPubListener$media_release != null) {
            ((C1718m1) mPubListener$media_release).f15297a.onAdDismissed(inMobiBanner);
        }
        inMobiBanner.scheduleRefresh$media_release();
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdDisplayed(AdMetaInfo info) {
        AbstractC1704l1 mPubListener$media_release;
        kotlin.jvm.internal.g.e(info, "info");
        InMobiBanner inMobiBanner = this.f15428a.get();
        if (inMobiBanner != null && (mPubListener$media_release = inMobiBanner.getMPubListener$media_release()) != null) {
            ((C1718m1) mPubListener$media_release).f15297a.onAdDisplayed(inMobiBanner);
        }
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdFetchFailed(InMobiAdRequestStatus status) {
        AbstractC1704l1 mPubListener$media_release;
        kotlin.jvm.internal.g.e(status, "status");
        InMobiBanner inMobiBanner = this.f15428a.get();
        if (inMobiBanner != null && (mPubListener$media_release = inMobiBanner.getMPubListener$media_release()) != null) {
            ((C1718m1) mPubListener$media_release).f15297a.onAdFetchFailed(inMobiBanner, status);
        }
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdFetchSuccessful(AdMetaInfo info) {
        AbstractC1704l1 mPubListener$media_release;
        kotlin.jvm.internal.g.e(info, "info");
        InMobiBanner inMobiBanner = this.f15428a.get();
        if (inMobiBanner != null && (mPubListener$media_release = inMobiBanner.getMPubListener$media_release()) != null) {
            mPubListener$media_release.onAdFetchSuccessful(inMobiBanner, info);
        }
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdImpression(C1780qb c1780qb) {
        AbstractC1704l1 abstractC1704l1;
        InMobiBanner inMobiBanner = this.f15428a.get();
        if (inMobiBanner != null) {
            abstractC1704l1 = inMobiBanner.getMPubListener$media_release();
        } else {
            abstractC1704l1 = null;
        }
        if (abstractC1704l1 == null) {
            if (c1780qb != null) {
                c1780qb.c();
                return;
            }
            return;
        }
        abstractC1704l1.onAdImpression(inMobiBanner);
        if (c1780qb != null) {
            c1780qb.d();
        }
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdLoadFailed(InMobiAdRequestStatus status) {
        kotlin.jvm.internal.g.e(status, "status");
        InMobiBanner inMobiBanner = this.f15428a.get();
        if (inMobiBanner == null) {
            return;
        }
        AbstractC1704l1 mPubListener$media_release = inMobiBanner.getMPubListener$media_release();
        if (mPubListener$media_release != null) {
            mPubListener$media_release.onAdLoadFailed(inMobiBanner, status);
        }
        inMobiBanner.scheduleRefresh$media_release();
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdLoadSucceeded(AdMetaInfo info) {
        C1834v1 mAdManager$media_release;
        kotlin.jvm.internal.g.e(info, "info");
        InMobiBanner inMobiBanner = this.f15428a.get();
        if (inMobiBanner != null && (mAdManager$media_release = inMobiBanner.getMAdManager$media_release()) != null) {
            if (!mAdManager$media_release.B() && mAdManager$media_release.x()) {
                inMobiBanner.swapAdUnitsAndDisplayAd$media_release();
                AbstractC1704l1 mPubListener$media_release = inMobiBanner.getMPubListener$media_release();
                if (mPubListener$media_release != null) {
                    mPubListener$media_release.onAdLoadSucceeded(inMobiBanner, info);
                }
                inMobiBanner.scheduleRefresh$media_release();
            } else if (mAdManager$media_release.B()) {
                AbstractC1846w0 j10 = mAdManager$media_release.j();
                if (j10 != null) {
                    j10.b((short) 2173);
                }
            } else {
                AbstractC1846w0 j11 = mAdManager$media_release.j();
                if (j11 != null) {
                    j11.b((short) 2174);
                }
            }
        }
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAudioStatusChanged(EnumC1648h1 audioStatusInternal) {
        AudioStatus audioStatus;
        kotlin.jvm.internal.g.e(audioStatusInternal, "audioStatusInternal");
        InMobiBanner inMobiBanner = this.f15428a.get();
        if (inMobiBanner == null) {
            return;
        }
        inMobiBanner.setAudioStatusInternal$media_release(audioStatusInternal);
        AudioListener mAudioListener$media_release = inMobiBanner.getMAudioListener$media_release();
        if (mAudioListener$media_release != null) {
            EnumC1648h1.f15114b.getClass();
            int ordinal = audioStatusInternal.ordinal();
            if (ordinal != 1) {
                if (ordinal != 2) {
                    audioStatus = AudioStatus.COMPLETED;
                } else {
                    audioStatus = AudioStatus.PAUSED;
                }
            } else {
                audioStatus = AudioStatus.PLAYING;
            }
            mAudioListener$media_release.onAudioStatusChanged(inMobiBanner, audioStatus);
        }
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onImraidLog(String log) {
        AbstractC1704l1 mPubListener$media_release;
        kotlin.jvm.internal.g.e(log, "log");
        InMobiBanner inMobiBanner = this.f15428a.get();
        if (inMobiBanner == null || (mPubListener$media_release = inMobiBanner.getMPubListener$media_release()) == null) {
            return;
        }
        mPubListener$media_release.onImraidLog(inMobiBanner, log);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onRequestPayloadCreated(byte[] request) {
        AbstractC1704l1 mPubListener$media_release;
        kotlin.jvm.internal.g.e(request, "request");
        InMobiBanner inMobiBanner = this.f15428a.get();
        if (inMobiBanner != null && (mPubListener$media_release = inMobiBanner.getMPubListener$media_release()) != null) {
            ((C1718m1) mPubListener$media_release).f15297a.onRequestPayloadCreated(request);
        }
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onRequestPayloadCreationFailed(InMobiAdRequestStatus reason) {
        AbstractC1704l1 mPubListener$media_release;
        kotlin.jvm.internal.g.e(reason, "reason");
        InMobiBanner inMobiBanner = this.f15428a.get();
        if (inMobiBanner != null && (mPubListener$media_release = inMobiBanner.getMPubListener$media_release()) != null) {
            ((C1718m1) mPubListener$media_release).f15297a.onRequestPayloadCreationFailed(reason);
        }
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onRewardsUnlocked(Map<Object, ? extends Object> rewards) {
        AbstractC1704l1 mPubListener$media_release;
        kotlin.jvm.internal.g.e(rewards, "rewards");
        InMobiBanner inMobiBanner = this.f15428a.get();
        if (inMobiBanner != null && (mPubListener$media_release = inMobiBanner.getMPubListener$media_release()) != null) {
            ((C1718m1) mPubListener$media_release).f15297a.onRewardsUnlocked(inMobiBanner, rewards);
        }
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onUserLeftApplication() {
        AbstractC1704l1 mPubListener$media_release;
        InMobiBanner inMobiBanner = this.f15428a.get();
        if (inMobiBanner != null && (mPubListener$media_release = inMobiBanner.getMPubListener$media_release()) != null) {
            ((C1718m1) mPubListener$media_release).f15297a.onUserLeftApplication(inMobiBanner);
        }
    }

    public final void a(WeakReference<InMobiBanner> weakReference) {
        kotlin.jvm.internal.g.e(weakReference, "<set-?>");
        this.f15428a = weakReference;
    }
}
