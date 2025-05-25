package com.bytedance.sdk.openadsdk.core.ROR;

import android.util.Pair;
import android.view.View;
import com.iab.omid.library.bytedance2.adsession.AdEvents;
import com.iab.omid.library.bytedance2.adsession.AdSession;
import com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose;
import com.iab.omid.library.bytedance2.adsession.media.Position;
import com.iab.omid.library.bytedance2.adsession.media.VastProperties;
import java.util.Set;

/* compiled from: ViewabilityTracker.java */
/* loaded from: classes.dex */
public class Sf {
    protected VastProperties CJ;
    private final AdEvents Tgh;

    /* renamed from: ac  reason: collision with root package name */
    protected String f8957ac;

    /* renamed from: fl  reason: collision with root package name */
    private final AdSession f8958fl;
    private boolean ROR = false;
    protected boolean Qhi = false;
    protected int cJ = 0;

    public Sf(AdSession adSession, AdEvents adEvents, View view) {
        this.f8958fl = adSession;
        this.Tgh = adEvents;
        this.f8957ac = adSession.getAdSessionId();
        Qhi(view);
    }

    public void CJ() {
        Qhi(3);
    }

    public void Qhi(float f10, boolean z10) {
    }

    public void ac() {
        Qhi(4);
    }

    public void cJ(int i10) {
    }

    public void Qhi(boolean z10) {
    }

    public void cJ() {
        Qhi(1);
    }

    public void Qhi(boolean z10, float f10) {
    }

    public void Qhi(View view) {
        AdSession adSession;
        if (view == null || (adSession = this.f8958fl) == null) {
            return;
        }
        adSession.registerAdView(view);
    }

    public void Qhi(View view, FriendlyObstructionPurpose friendlyObstructionPurpose) {
        AdSession adSession = this.f8958fl;
        if (adSession != null) {
            adSession.addFriendlyObstruction(view, friendlyObstructionPurpose, null);
        }
    }

    public boolean Qhi() {
        return this.Qhi;
    }

    public void Qhi(int i10) {
        int i11;
        int i12;
        if (this.f8958fl == null || this.Tgh == null) {
            return;
        }
        boolean z10 = false;
        if (Tgh.ac()) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 == 4 && (i12 = this.cJ) != 0 && i12 != 4) {
                            this.f8958fl.finish();
                            this.Qhi = false;
                            z10 = true;
                        }
                    } else if (!this.ROR && ((i11 = this.cJ) == 1 || i11 == 2)) {
                        this.Tgh.impressionOccurred();
                        this.ROR = true;
                        z10 = true;
                    }
                } else if (this.cJ == 0) {
                    this.f8958fl.start();
                    if (this.CJ == null) {
                        this.CJ = VastProperties.createVastPropertiesForNonSkippableMedia(true, Position.STANDALONE);
                    }
                    this.Tgh.loaded(this.CJ);
                    this.Qhi = true;
                    this.CJ = null;
                    z10 = true;
                }
            } else if (this.cJ == 0) {
                this.f8958fl.start();
                this.Tgh.loaded();
                this.Qhi = true;
                z10 = true;
            }
        }
        if (z10) {
            this.cJ = i10;
        }
    }

    public void Qhi(Set<Pair<View, FriendlyObstructionPurpose>> set) {
        for (Pair<View, FriendlyObstructionPurpose> pair : set) {
            Qhi((View) pair.first, (FriendlyObstructionPurpose) pair.second);
        }
    }
}
