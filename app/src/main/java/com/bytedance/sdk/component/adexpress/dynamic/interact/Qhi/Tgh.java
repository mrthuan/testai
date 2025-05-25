package com.bytedance.sdk.component.adexpress.dynamic.interact.Qhi;

import android.view.MotionEvent;
import android.view.View;
import com.bytedance.sdk.component.adexpress.CJ.CQU;
import com.bytedance.sdk.component.adexpress.dynamic.interact.WAv;

/* compiled from: SlideUpTouch.java */
/* loaded from: classes.dex */
public class Tgh implements View.OnTouchListener {
    private WAv CJ;
    private float Qhi;

    /* renamed from: ac  reason: collision with root package name */
    private boolean f8230ac;
    private float cJ;

    /* renamed from: fl  reason: collision with root package name */
    private int f8231fl;

    public Tgh(WAv wAv, int i10) {
        this.CJ = wAv;
        this.f8231fl = i10;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        WAv wAv;
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    float y10 = motionEvent.getY();
                    this.cJ = y10;
                    if (Math.abs(y10 - this.Qhi) > 10.0f) {
                        this.f8230ac = true;
                    }
                }
            } else if (!this.f8230ac) {
                return false;
            } else {
                int cJ = CQU.cJ(com.bytedance.sdk.component.adexpress.fl.Qhi(), Math.abs(this.cJ - this.Qhi));
                if (this.cJ - this.Qhi < 0.0f && cJ > this.f8231fl && (wAv = this.CJ) != null) {
                    wAv.Qhi();
                    this.Qhi = 0.0f;
                    this.cJ = 0.0f;
                    this.f8230ac = false;
                }
            }
        } else {
            this.Qhi = motionEvent.getY();
        }
        return true;
    }
}
