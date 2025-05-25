package com.bytedance.adsdk.ugeno.core.cJ;

import android.content.Context;
import android.view.MotionEvent;
import com.bytedance.adsdk.ugeno.core.iMK;
import com.bytedance.adsdk.ugeno.core.zc;

/* compiled from: UGOnlyTapEvent.java */
/* loaded from: classes.dex */
public class ac {
    private Context CJ;
    private float Qhi;

    /* renamed from: ac  reason: collision with root package name */
    private zc f7935ac;
    private float cJ;

    /* renamed from: fl  reason: collision with root package name */
    private boolean f7936fl;

    public ac(Context context, zc zcVar) {
        this.CJ = context;
        this.f7935ac = zcVar;
    }

    public boolean Qhi(iMK imk, com.bytedance.adsdk.ugeno.component.cJ cJVar, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action == 3) {
                        this.f7936fl = false;
                    }
                } else {
                    float x4 = motionEvent.getX();
                    float y10 = motionEvent.getY();
                    if (Math.abs(x4 - this.Qhi) >= 15.0f || Math.abs(y10 - this.cJ) >= 15.0f) {
                        this.f7936fl = true;
                    }
                }
            } else if (this.f7936fl) {
                this.f7936fl = false;
                return false;
            } else {
                float x10 = motionEvent.getX();
                float y11 = motionEvent.getY();
                if (Math.abs(x10 - this.Qhi) < 15.0f && Math.abs(y11 - this.cJ) < 15.0f) {
                    if (imk != null) {
                        imk.Qhi(this.f7935ac, cJVar, cJVar);
                        return true;
                    }
                } else {
                    this.f7936fl = false;
                }
            }
        } else {
            this.Qhi = motionEvent.getX();
            this.cJ = motionEvent.getY();
        }
        return true;
    }
}
