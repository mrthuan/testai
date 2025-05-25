package com.facebook.ads.redexgen.X;

import android.media.MediaCodec;
import android.os.Handler;

/* loaded from: assets/audience_network.dex */
public final class IV implements MediaCodec.OnFrameRenderedListener {
    public final /* synthetic */ C3F A00;

    public IV(C3F c3f, MediaCodec mediaCodec) {
        this.A00 = c3f;
        mediaCodec.setOnFrameRenderedListener(this, new Handler());
    }

    @Override // android.media.MediaCodec.OnFrameRenderedListener
    public final void onFrameRendered(MediaCodec mediaCodec, long j10, long j11) {
        if (this != this.A00.A00) {
            return;
        }
        this.A00.A1S();
    }
}
