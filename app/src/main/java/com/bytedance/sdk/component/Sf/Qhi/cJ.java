package com.bytedance.sdk.component.Sf.Qhi;

import android.os.HandlerThread;
import com.bytedance.sdk.component.utils.CQU;
import java.lang.ref.WeakReference;

/* compiled from: HandlerWapper.java */
/* loaded from: classes.dex */
public class cJ extends CQU implements ac {
    private final HandlerThread cJ;

    public cJ(HandlerThread handlerThread, CQU.Qhi qhi) {
        super(handlerThread.getLooper(), qhi);
        this.cJ = handlerThread;
    }

    @Override // com.bytedance.sdk.component.Sf.Qhi.ac
    public void Qhi() {
        removeCallbacksAndMessages(null);
        WeakReference<CQU.Qhi> weakReference = this.Qhi;
        if (weakReference != null) {
            weakReference.clear();
            this.Qhi = null;
        }
    }

    public void cJ() {
        HandlerThread handlerThread = this.cJ;
        if (handlerThread != null) {
            handlerThread.quit();
        }
    }

    public void Qhi(CQU.Qhi qhi) {
        this.Qhi = new WeakReference<>(qhi);
    }
}
