package com.bytedance.sdk.component.adexpress.dynamic.interact.Qhi;

import android.view.MotionEvent;
import android.view.View;
import com.bytedance.sdk.component.adexpress.CJ.CQU;
import com.bytedance.sdk.component.adexpress.dynamic.interact.InteractViewContainer;
import com.bytedance.sdk.component.adexpress.dynamic.interact.WAv;

/* compiled from: LongPressTouch.java */
/* loaded from: classes.dex */
public class cJ implements View.OnTouchListener {
    private boolean CJ;
    private float Qhi;
    private WAv Tgh;

    /* renamed from: ac  reason: collision with root package name */
    private long f8235ac;
    private float cJ;

    /* renamed from: fl  reason: collision with root package name */
    private InteractViewContainer f8236fl;

    public cJ(InteractViewContainer interactViewContainer, WAv wAv) {
        this.f8236fl = interactViewContainer;
        this.Tgh = wAv;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    float x4 = motionEvent.getX();
                    float y10 = motionEvent.getY();
                    if (Math.abs(x4 - this.Qhi) >= CQU.Qhi(com.bytedance.sdk.component.adexpress.fl.Qhi(), 10.0f) || Math.abs(y10 - this.cJ) >= CQU.Qhi(com.bytedance.sdk.component.adexpress.fl.Qhi(), 10.0f)) {
                        this.CJ = true;
                        this.f8236fl.Tgh();
                    }
                }
            } else if (this.CJ) {
                return false;
            } else {
                if (System.currentTimeMillis() - this.f8235ac >= 1500) {
                    WAv wAv = this.Tgh;
                    if (wAv != null) {
                        wAv.Qhi();
                    }
                }
                this.f8236fl.Tgh();
            }
        } else {
            this.f8235ac = System.currentTimeMillis();
            this.Qhi = motionEvent.getX();
            this.cJ = motionEvent.getY();
            this.f8236fl.fl();
        }
        return true;
    }
}
