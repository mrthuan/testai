package com.bytedance.sdk.component.adexpress.dynamic.interact.Qhi;

import android.view.MotionEvent;
import android.view.View;
import com.bytedance.sdk.component.adexpress.CJ.CQU;
import com.bytedance.sdk.component.adexpress.dynamic.interact.WAv;

/* compiled from: SlideRightTouch.java */
/* loaded from: classes.dex */
public class ac implements View.OnTouchListener {
    private float CJ;
    private float Qhi;
    private int ROR;
    private boolean Sf;
    private WAv Tgh;

    /* renamed from: ac  reason: collision with root package name */
    private float f8232ac;
    private float cJ;

    /* renamed from: fl  reason: collision with root package name */
    private boolean f8233fl;

    /* renamed from: hm  reason: collision with root package name */
    private boolean f8234hm;

    public ac(WAv wAv) {
        this(wAv, 5);
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        WAv wAv;
        WAv wAv2;
        WAv wAv3;
        if (this.f8234hm) {
            return true;
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    this.CJ = motionEvent.getX();
                    this.f8232ac = motionEvent.getY();
                    if (Math.abs(this.CJ - this.Qhi) > 10.0f) {
                        this.f8233fl = true;
                    }
                    if (Math.abs(this.CJ - this.Qhi) > 8.0f || Math.abs(this.f8232ac - this.cJ) > 8.0f) {
                        this.Sf = false;
                    }
                    int cJ = CQU.cJ(com.bytedance.sdk.component.adexpress.fl.Qhi(), Math.abs(this.CJ - this.Qhi));
                    if (this.CJ > this.Qhi && cJ > this.ROR && (wAv3 = this.Tgh) != null) {
                        wAv3.Qhi();
                        this.f8234hm = true;
                    }
                }
            } else if (!this.f8233fl && !this.Sf) {
                return false;
            } else {
                float x4 = motionEvent.getX();
                float y10 = motionEvent.getY();
                int cJ2 = CQU.cJ(com.bytedance.sdk.component.adexpress.fl.Qhi(), Math.abs(this.CJ - this.Qhi));
                if (this.CJ > this.Qhi && cJ2 > this.ROR && (wAv2 = this.Tgh) != null) {
                    wAv2.Qhi();
                    this.f8234hm = true;
                }
                float abs = Math.abs(x4 - this.Qhi);
                float abs2 = Math.abs(y10 - this.cJ);
                if ((abs < 8.0f || abs2 < 8.0f) && (wAv = this.Tgh) != null) {
                    wAv.cJ();
                    this.f8234hm = true;
                }
            }
        } else {
            this.Qhi = motionEvent.getX();
            this.cJ = motionEvent.getY();
        }
        return true;
    }

    public ac(WAv wAv, int i10) {
        this.ROR = 5;
        this.Sf = true;
        this.Tgh = wAv;
        if (i10 > 0) {
            this.ROR = i10;
        }
    }
}
