package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.os.SystemClock;
import com.bytedance.sdk.openadsdk.core.model.tP;

/* loaded from: classes.dex */
public class PlayableLoadingView extends PAGFullScreenLoadingLayout {
    private long Qhi;
    private long cJ;

    public PlayableLoadingView(Context context) {
        super(context);
        setVisibility(8);
        setClickable(true);
    }

    public boolean CJ() {
        if (this.Qhi > 0 && this.cJ > 0) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.core.widget.PAGFullScreenLoadingLayout
    public boolean Qhi() {
        return false;
    }

    public void ac() {
        setVisibility(8);
        if (this.Qhi != 0) {
            this.cJ = SystemClock.elapsedRealtime();
        }
    }

    public void cJ(tP tPVar, int i10) {
        if (isShown()) {
            return;
        }
        cJ();
        setVisibility(0);
        this.Qhi = SystemClock.elapsedRealtime();
        Qhi(tPVar, i10);
    }

    public long getDisplayDuration() {
        if (this.Qhi == 0) {
            return 0L;
        }
        if (this.cJ == 0) {
            this.cJ = SystemClock.elapsedRealtime();
        }
        return this.cJ - this.Qhi;
    }
}
