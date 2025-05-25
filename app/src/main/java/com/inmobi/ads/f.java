package com.inmobi.ads;

import android.content.Context;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.media.C1680j5;
import com.inmobi.media.C1694k5;
import com.inmobi.media.C1803s9;
import com.inmobi.media.Z5;
import kotlin.jvm.internal.g;

/* loaded from: classes2.dex */
public final class f implements PreloadManager {

    /* renamed from: a  reason: collision with root package name */
    public final C1680j5 f14090a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ InMobiInterstitial f14091b;

    public f(InMobiInterstitial inMobiInterstitial) {
        this.f14091b = inMobiInterstitial;
        this.f14090a = new C1680j5(inMobiInterstitial);
    }

    @Override // com.inmobi.ads.PreloadManager
    public final void load() {
        try {
            this.f14091b.getMAdManager$media_release().D();
        } catch (IllegalStateException e10) {
            String access$getTAG$cp = InMobiInterstitial.access$getTAG$cp();
            g.d(access$getTAG$cp, "access$getTAG$cp(...)");
            Z5.a((byte) 1, access$getTAG$cp, e10.getMessage());
            this.f14091b.getMPubListener$media_release().onAdLoadFailed(this.f14091b, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
        }
    }

    @Override // com.inmobi.ads.PreloadManager
    public final void preload() {
        C1803s9 c1803s9;
        C1803s9 c1803s92;
        Context context;
        this.f14091b.f14066b = true;
        c1803s9 = this.f14091b.f14067d;
        c1803s9.f15451e = "Preload";
        C1694k5 mAdManager$media_release = this.f14091b.getMAdManager$media_release();
        c1803s92 = this.f14091b.f14067d;
        context = this.f14091b.f14065a;
        if (context != null) {
            C1694k5.a(mAdManager$media_release, c1803s92, context, false, null, 12, null);
            this.f14091b.getMAdManager$media_release().c(this.f14090a);
            return;
        }
        g.i("mContext");
        throw null;
    }
}
