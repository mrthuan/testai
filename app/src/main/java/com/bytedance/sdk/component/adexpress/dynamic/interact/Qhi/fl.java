package com.bytedance.sdk.component.adexpress.dynamic.interact.Qhi;

import android.view.MotionEvent;
import android.view.View;
import com.bytedance.sdk.component.adexpress.CJ.CQU;
import com.bytedance.sdk.component.adexpress.dynamic.interact.WAv;

/* compiled from: SlideUpAndClickTouch.java */
/* loaded from: classes.dex */
public class fl implements View.OnTouchListener {
    private float CJ;
    private boolean Gm;
    private float Qhi;
    private float ROR;
    private boolean Sf;
    private float Tgh;
    private int WAv;

    /* renamed from: ac  reason: collision with root package name */
    private float f8237ac;
    private float cJ;

    /* renamed from: fl  reason: collision with root package name */
    private boolean f8238fl = true;

    /* renamed from: hm  reason: collision with root package name */
    private WAv f8239hm;

    public fl(WAv wAv, int i10, boolean z10) {
        this.f8239hm = wAv;
        this.WAv = i10;
        this.Gm = z10;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        WAv wAv;
        WAv wAv2;
        WAv wAv3;
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    float y10 = motionEvent.getY();
                    this.ROR = y10;
                    if (Math.abs(y10 - this.Tgh) > 10.0f) {
                        this.Sf = true;
                    }
                    this.CJ = motionEvent.getX();
                    this.f8237ac = motionEvent.getY();
                    if (Math.abs(this.CJ - this.Qhi) > 8.0f || Math.abs(this.f8237ac - this.cJ) > 8.0f) {
                        this.f8238fl = false;
                    }
                }
            } else if (!this.Sf && !this.f8238fl) {
                return false;
            } else {
                if (!this.Gm && (wAv3 = this.f8239hm) != null) {
                    wAv3.Qhi();
                } else {
                    int cJ = CQU.cJ(com.bytedance.sdk.component.adexpress.fl.Qhi(), Math.abs(this.ROR - this.Tgh));
                    if (this.ROR - this.Tgh < 0.0f && cJ > this.WAv && (wAv2 = this.f8239hm) != null) {
                        wAv2.Qhi();
                    } else if (this.f8238fl && (wAv = this.f8239hm) != null) {
                        wAv.Qhi();
                    }
                }
            }
        } else {
            this.Qhi = motionEvent.getX();
            this.cJ = motionEvent.getY();
            this.Tgh = motionEvent.getY();
            this.f8238fl = true;
        }
        return true;
    }
}
