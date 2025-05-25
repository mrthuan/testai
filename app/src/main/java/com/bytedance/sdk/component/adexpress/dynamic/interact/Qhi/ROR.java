package com.bytedance.sdk.component.adexpress.dynamic.interact.Qhi;

import android.view.MotionEvent;
import android.view.View;
import com.bytedance.sdk.component.adexpress.dynamic.interact.WAv;

/* compiled from: TapTouch.java */
/* loaded from: classes.dex */
public class ROR implements View.OnTouchListener {

    /* renamed from: ac  reason: collision with root package name */
    private static int f8225ac = 10;
    private boolean CJ;
    private float Qhi;
    private float cJ;

    /* renamed from: fl  reason: collision with root package name */
    private WAv f8226fl;

    public ROR(WAv wAv) {
        this.f8226fl = wAv;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action == 3) {
                        this.CJ = false;
                    }
                } else {
                    float x4 = motionEvent.getX();
                    float y10 = motionEvent.getY();
                    if (Math.abs(x4 - this.Qhi) >= f8225ac || Math.abs(y10 - this.cJ) >= f8225ac) {
                        this.CJ = true;
                    }
                }
            } else if (this.CJ) {
                this.CJ = false;
                return false;
            } else {
                float x10 = motionEvent.getX();
                float y11 = motionEvent.getY();
                if (Math.abs(x10 - this.Qhi) < f8225ac && Math.abs(y11 - this.cJ) < f8225ac) {
                    WAv wAv = this.f8226fl;
                    if (wAv != null) {
                        wAv.Qhi();
                    }
                } else {
                    this.CJ = false;
                }
            }
        } else {
            this.Qhi = motionEvent.getX();
            this.cJ = motionEvent.getY();
        }
        return true;
    }
}
