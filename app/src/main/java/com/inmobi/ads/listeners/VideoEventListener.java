package com.inmobi.ads.listeners;

import com.inmobi.ads.InMobiNative;
import kotlin.jvm.internal.g;

/* loaded from: classes2.dex */
public abstract class VideoEventListener {
    public void onAudioStateChanged(InMobiNative inMobiNative, boolean z10) {
        g.e(inMobiNative, "inMobiNative");
    }

    public void onVideoCompleted(InMobiNative ad2) {
        g.e(ad2, "ad");
    }

    public void onVideoSkipped(InMobiNative ad2) {
        g.e(ad2, "ad");
    }
}
