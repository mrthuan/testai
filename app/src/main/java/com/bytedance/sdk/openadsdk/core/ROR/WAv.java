package com.bytedance.sdk.openadsdk.core.ROR;

import android.view.View;
import com.iab.omid.library.bytedance2.adsession.AdEvents;
import com.iab.omid.library.bytedance2.adsession.AdSession;
import com.iab.omid.library.bytedance2.adsession.media.InteractionType;
import com.iab.omid.library.bytedance2.adsession.media.MediaEvents;
import com.iab.omid.library.bytedance2.adsession.media.PlayerState;
import com.iab.omid.library.bytedance2.adsession.media.Position;
import com.iab.omid.library.bytedance2.adsession.media.VastProperties;

/* compiled from: ViewabilityTrackerForVideo.java */
/* loaded from: classes.dex */
public class WAv extends Sf {
    private boolean Tgh;

    /* renamed from: fl  reason: collision with root package name */
    private final MediaEvents f8960fl;

    public WAv(AdSession adSession, AdEvents adEvents, View view, MediaEvents mediaEvents) {
        super(adSession, adEvents, view);
        this.f8960fl = mediaEvents;
    }

    @Override // com.bytedance.sdk.openadsdk.core.ROR.Sf
    public void Qhi(boolean z10, float f10) {
        if (z10) {
            this.CJ = VastProperties.createVastPropertiesForSkippableMedia(f10, true, Position.STANDALONE);
        } else {
            this.CJ = VastProperties.createVastPropertiesForNonSkippableMedia(true, Position.STANDALONE);
        }
        Qhi(2);
    }

    @Override // com.bytedance.sdk.openadsdk.core.ROR.Sf
    public void cJ(int i10) {
        float f10;
        if (!Qhi()) {
            return;
        }
        switch (i10) {
            case 0:
                this.f8960fl.pause();
                return;
            case 1:
                this.f8960fl.resume();
                return;
            case 2:
            case 14:
                this.f8960fl.skipped();
                return;
            case 3:
            default:
                return;
            case 4:
                this.f8960fl.bufferStart();
                return;
            case 5:
                this.f8960fl.bufferFinish();
                return;
            case 6:
                this.f8960fl.firstQuartile();
                return;
            case 7:
                this.f8960fl.midpoint();
                return;
            case 8:
                this.f8960fl.thirdQuartile();
                return;
            case 9:
                this.f8960fl.complete();
                return;
            case 10:
                this.f8960fl.playerStateChange(PlayerState.FULLSCREEN);
                return;
            case 11:
                this.f8960fl.playerStateChange(PlayerState.NORMAL);
                return;
            case 12:
                MediaEvents mediaEvents = this.f8960fl;
                if (this.Tgh) {
                    f10 = 0.0f;
                } else {
                    f10 = 1.0f;
                }
                mediaEvents.volumeChange(f10);
                return;
            case 13:
                this.f8960fl.adUserInteraction(InteractionType.CLICK);
                return;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.ROR.Sf
    public void Qhi(float f10, boolean z10) {
        if (Qhi()) {
            this.f8960fl.start(f10, z10 ? 0.0f : 1.0f);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.ROR.Sf
    public void Qhi(boolean z10) {
        this.Tgh = z10;
        cJ(12);
    }
}
