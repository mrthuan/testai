package com.inmobi.ads;

import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.media.AbstractC1704l1;
import com.inmobi.media.C1795s1;
import com.inmobi.media.C1834v1;
import com.inmobi.media.Z5;
import kotlin.jvm.internal.g;

/* loaded from: classes2.dex */
public final class e implements PreloadManager {

    /* renamed from: a  reason: collision with root package name */
    public final C1795s1 f14088a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ InMobiBanner f14089b;

    public e(InMobiBanner inMobiBanner) {
        this.f14089b = inMobiBanner;
        this.f14088a = new C1795s1(inMobiBanner);
    }

    @Override // com.inmobi.ads.PreloadManager
    public final void load() {
        try {
            C1834v1 mAdManager$media_release = this.f14089b.getMAdManager$media_release();
            if (mAdManager$media_release != null) {
                mAdManager$media_release.G();
            }
        } catch (IllegalStateException e10) {
            String access$getTAG$cp = InMobiBanner.access$getTAG$cp();
            g.d(access$getTAG$cp, "access$getTAG$cp(...)");
            Z5.a((byte) 1, access$getTAG$cp, e10.getMessage());
            AbstractC1704l1 mPubListener$media_release = this.f14089b.getMPubListener$media_release();
            if (mPubListener$media_release != null) {
                mPubListener$media_release.onAdLoadFailed(this.f14089b, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
            }
        }
    }

    @Override // com.inmobi.ads.PreloadManager
    public final void preload() {
        this.f14089b.setEnableAutoRefresh(false);
        this.f14089b.a(this.f14088a, "Preload", false);
    }
}
