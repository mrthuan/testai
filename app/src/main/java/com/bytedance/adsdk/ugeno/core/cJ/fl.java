package com.bytedance.adsdk.ugeno.core.cJ;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import com.bytedance.adsdk.ugeno.cJ.hm;
import com.bytedance.adsdk.ugeno.core.iMK;
import com.bytedance.adsdk.ugeno.core.zc;

/* compiled from: UGSlideRightEvent.java */
/* loaded from: classes.dex */
public class fl {
    private zc CJ;
    private float Qhi;
    private Context ROR;
    private boolean Sf;
    private String Tgh;

    /* renamed from: ac  reason: collision with root package name */
    private int f7939ac = 0;
    private float cJ;

    /* renamed from: fl  reason: collision with root package name */
    private zc f7940fl;

    /* renamed from: hm  reason: collision with root package name */
    private boolean f7941hm;

    public fl(Context context, zc zcVar, boolean z10) {
        this.ROR = context;
        this.CJ = zcVar;
        this.f7941hm = z10;
        Qhi();
    }

    private void Qhi() {
        zc zcVar = this.CJ;
        if (zcVar == null) {
            return;
        }
        this.f7939ac = zcVar.ac().optInt("slideThreshold");
        this.Tgh = this.CJ.ac().optString("slideDirection", "up");
    }

    public boolean Qhi(iMK imk, com.bytedance.adsdk.ugeno.component.cJ cJVar, MotionEvent motionEvent) {
        if (this.Sf) {
            return true;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.Qhi = motionEvent.getX();
            this.cJ = motionEvent.getY();
        } else if (action == 1 || action == 3) {
            float x4 = motionEvent.getX();
            float y10 = motionEvent.getY();
            if (this.f7941hm && Math.abs(x4 - this.Qhi) <= 10.0f && Math.abs(y10 - this.cJ) <= 10.0f && imk != null) {
                imk.Qhi(this.f7940fl, cJVar, cJVar);
                return true;
            } else if (this.f7939ac == 0 && imk != null) {
                imk.Qhi(this.CJ, cJVar, cJVar);
                this.Sf = true;
                return true;
            } else {
                int cJ = hm.cJ(this.ROR, x4 - this.Qhi);
                int cJ2 = hm.cJ(this.ROR, y10 - this.cJ);
                if (TextUtils.equals(this.Tgh, "up")) {
                    cJ = -cJ2;
                } else if (TextUtils.equals(this.Tgh, "down")) {
                    cJ = cJ2;
                } else if (TextUtils.equals(this.Tgh, "left")) {
                    cJ = -cJ;
                } else if (!TextUtils.equals(this.Tgh, "right")) {
                    cJ = 0;
                }
                if (cJ < this.f7939ac) {
                    return false;
                }
                if (imk != null) {
                    imk.Qhi(this.CJ, cJVar, cJVar);
                    this.Sf = true;
                    return true;
                }
            }
        }
        return true;
    }

    public fl(Context context, zc zcVar, zc zcVar2, boolean z10) {
        this.ROR = context;
        this.CJ = zcVar;
        this.f7940fl = zcVar2;
        this.f7941hm = z10;
        Qhi();
    }
}
