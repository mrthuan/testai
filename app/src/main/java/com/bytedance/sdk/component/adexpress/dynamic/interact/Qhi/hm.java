package com.bytedance.sdk.component.adexpress.dynamic.interact.Qhi;

import android.view.MotionEvent;
import android.view.View;
import com.bytedance.sdk.component.adexpress.CJ.CQU;
import com.bytedance.sdk.component.adexpress.dynamic.interact.WAv;

/* compiled from: ValidateSlideUpTouch.java */
/* loaded from: classes.dex */
public class hm implements View.OnTouchListener {
    private float CJ;
    private final WAv Qhi;
    private float ROR;
    private float Tgh;

    /* renamed from: ac  reason: collision with root package name */
    private final int f8240ac = 10;
    private final boolean cJ;

    /* renamed from: fl  reason: collision with root package name */
    private float f8241fl;

    public hm(WAv wAv, boolean z10) {
        this.Qhi = wAv;
        this.cJ = z10;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        WAv wAv;
        WAv wAv2;
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1) {
                this.Tgh = motionEvent.getX();
                this.ROR = motionEvent.getY();
                new StringBuilder(", mEndY: ").append(this.ROR);
                if (!this.cJ && (wAv2 = this.Qhi) != null) {
                    wAv2.Qhi();
                } else {
                    float f10 = this.Tgh - this.CJ;
                    float f11 = this.ROR - this.f8241fl;
                    if (CQU.cJ(com.bytedance.sdk.component.adexpress.fl.Qhi(), Math.abs((float) Math.sqrt((f11 * f11) + (f10 * f10)))) > 10.0f && (wAv = this.Qhi) != null) {
                        wAv.Qhi();
                    }
                }
            }
        } else {
            this.CJ = motionEvent.getX();
            this.f8241fl = motionEvent.getY();
            new StringBuilder(", mStartY: ").append(this.f8241fl);
        }
        return true;
    }
}
