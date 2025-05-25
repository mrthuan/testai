package com.inmobi.media;

import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.AudioStatus;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.InMobiAudio;
import com.inmobi.ads.controllers.PublisherCallbacks;
import com.inmobi.ads.listeners.AudioAdEventListener;
import java.lang.ref.WeakReference;
import java.util.Map;

/* renamed from: com.inmobi.media.e1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1606e1 extends PublisherCallbacks {

    /* renamed from: a  reason: collision with root package name */
    private WeakReference<InMobiAudio> f15023a;

    public AbstractC1606e1(InMobiAudio audio) {
        kotlin.jvm.internal.g.e(audio, "audio");
        this.f15023a = new WeakReference<>(audio);
    }

    public final WeakReference<InMobiAudio> a() {
        return this.f15023a;
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdClicked(Map<Object, ? extends Object> params) {
        AudioAdEventListener mPubListener$media_release;
        kotlin.jvm.internal.g.e(params, "params");
        InMobiAudio inMobiAudio = this.f15023a.get();
        if (inMobiAudio != null && (mPubListener$media_release = inMobiAudio.getMPubListener$media_release()) != null) {
            mPubListener$media_release.onAdClicked(inMobiAudio, params);
        }
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdDismissed() {
        AudioAdEventListener mPubListener$media_release;
        InMobiAudio inMobiAudio = this.f15023a.get();
        if (inMobiAudio != null && (mPubListener$media_release = inMobiAudio.getMPubListener$media_release()) != null) {
            mPubListener$media_release.onAdDismissed(inMobiAudio);
        }
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdDisplayFailed() {
        AudioAdEventListener mPubListener$media_release;
        InMobiAudio inMobiAudio = this.f15023a.get();
        if (inMobiAudio != null && (mPubListener$media_release = inMobiAudio.getMPubListener$media_release()) != null) {
            mPubListener$media_release.onAdDisplayFailed(inMobiAudio);
        }
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdDisplayed(AdMetaInfo info) {
        AudioAdEventListener mPubListener$media_release;
        kotlin.jvm.internal.g.e(info, "info");
        InMobiAudio inMobiAudio = this.f15023a.get();
        if (inMobiAudio != null && (mPubListener$media_release = inMobiAudio.getMPubListener$media_release()) != null) {
            mPubListener$media_release.onAdDisplayed(inMobiAudio);
        }
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdFetchSuccessful(AdMetaInfo info) {
        AudioAdEventListener mPubListener$media_release;
        kotlin.jvm.internal.g.e(info, "info");
        InMobiAudio inMobiAudio = this.f15023a.get();
        if (inMobiAudio != null && (mPubListener$media_release = inMobiAudio.getMPubListener$media_release()) != null) {
            mPubListener$media_release.onAdFetchSuccessful(inMobiAudio, info);
        }
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdImpression(C1780qb c1780qb) {
        AudioAdEventListener audioAdEventListener;
        InMobiAudio inMobiAudio = this.f15023a.get();
        if (inMobiAudio != null) {
            audioAdEventListener = inMobiAudio.getMPubListener$media_release();
        } else {
            audioAdEventListener = null;
        }
        if (audioAdEventListener == null) {
            if (c1780qb != null) {
                c1780qb.c();
                return;
            }
            return;
        }
        audioAdEventListener.onAdImpression(inMobiAudio);
        if (c1780qb != null) {
            c1780qb.d();
        }
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdLoadFailed(InMobiAdRequestStatus status) {
        AudioAdEventListener mPubListener$media_release;
        kotlin.jvm.internal.g.e(status, "status");
        InMobiAudio inMobiAudio = this.f15023a.get();
        if (inMobiAudio != null && (mPubListener$media_release = inMobiAudio.getMPubListener$media_release()) != null) {
            mPubListener$media_release.onAdLoadFailed(inMobiAudio, status);
        }
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdLoadSucceeded(AdMetaInfo info) {
        AudioAdEventListener mPubListener$media_release;
        kotlin.jvm.internal.g.e(info, "info");
        InMobiAudio inMobiAudio = this.f15023a.get();
        if (inMobiAudio != null && (mPubListener$media_release = inMobiAudio.getMPubListener$media_release()) != null) {
            mPubListener$media_release.onAdLoadSucceeded(inMobiAudio, info);
        }
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAudioStatusChanged(EnumC1648h1 audioStatusInternal) {
        AudioAdEventListener mPubListener$media_release;
        AudioStatus audioStatus;
        kotlin.jvm.internal.g.e(audioStatusInternal, "audioStatusInternal");
        InMobiAudio inMobiAudio = this.f15023a.get();
        if (inMobiAudio != null && (mPubListener$media_release = inMobiAudio.getMPubListener$media_release()) != null) {
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
            mPubListener$media_release.onAudioStatusChanged(inMobiAudio, audioStatus);
        }
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onRequestPayloadCreated(byte[] request) {
        AudioAdEventListener mPubListener$media_release;
        kotlin.jvm.internal.g.e(request, "request");
        InMobiAudio inMobiAudio = this.f15023a.get();
        if (inMobiAudio != null && (mPubListener$media_release = inMobiAudio.getMPubListener$media_release()) != null) {
            mPubListener$media_release.onRequestPayloadCreated(request);
        }
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onRequestPayloadCreationFailed(InMobiAdRequestStatus reason) {
        AudioAdEventListener mPubListener$media_release;
        kotlin.jvm.internal.g.e(reason, "reason");
        InMobiAudio inMobiAudio = this.f15023a.get();
        if (inMobiAudio != null && (mPubListener$media_release = inMobiAudio.getMPubListener$media_release()) != null) {
            mPubListener$media_release.onRequestPayloadCreationFailed(reason);
        }
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onRewardsUnlocked(Map<Object, ? extends Object> rewards) {
        AudioAdEventListener mPubListener$media_release;
        kotlin.jvm.internal.g.e(rewards, "rewards");
        InMobiAudio inMobiAudio = this.f15023a.get();
        if (inMobiAudio != null && (mPubListener$media_release = inMobiAudio.getMPubListener$media_release()) != null) {
            mPubListener$media_release.onRewardsUnlocked(inMobiAudio, rewards);
        }
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onUserLeftApplication() {
        AudioAdEventListener mPubListener$media_release;
        InMobiAudio inMobiAudio = this.f15023a.get();
        if (inMobiAudio != null && (mPubListener$media_release = inMobiAudio.getMPubListener$media_release()) != null) {
            mPubListener$media_release.onUserLeftApplication(inMobiAudio);
        }
    }

    public final void a(WeakReference<InMobiAudio> weakReference) {
        kotlin.jvm.internal.g.e(weakReference, "<set-?>");
        this.f15023a = weakReference;
    }
}
