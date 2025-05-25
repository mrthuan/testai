package com.bytedance.adsdk.ugeno.core;

import android.animation.AnimatorSet;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: UGenAnimation.java */
/* loaded from: classes.dex */
public class hm {
    private View CJ;
    Paint Qhi;
    private String ROR;
    private int Tgh;

    /* renamed from: ac  reason: collision with root package name */
    private AnimatorSet f7942ac = new AnimatorSet();
    private Qhi cJ;

    /* renamed from: fl  reason: collision with root package name */
    private int f7943fl;

    public hm(View view, Qhi qhi) {
        this.CJ = view;
        this.cJ = qhi;
        Paint paint = new Paint();
        this.Qhi = paint;
        paint.setAntiAlias(true);
    }

    public void cJ() {
        AnimatorSet animatorSet = this.f7942ac;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0167, code lost:
        if (r2.equals("accelerate") == false) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void Qhi() {
        /*
            Method dump skipped, instructions count: 508
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.ugeno.core.hm.Qhi():void");
    }

    public void Qhi(Canvas canvas, IAnimation iAnimation) {
        try {
            if (iAnimation.getRipple() == 0.0f || TextUtils.isEmpty(this.ROR)) {
                return;
            }
            this.Qhi.setColor(com.bytedance.adsdk.ugeno.cJ.Qhi.Qhi(this.ROR));
            this.Qhi.setAlpha(90);
            ((ViewGroup) this.CJ.getParent()).setClipChildren(true);
            int i10 = this.f7943fl;
            int i11 = this.Tgh;
            canvas.drawCircle(i10, i11, Math.min(i10, i11) * 2 * iAnimation.getRipple(), this.Qhi);
        } catch (Throwable th2) {
            th2.getMessage();
        }
    }

    public void Qhi(int i10, int i11) {
        this.f7943fl = i10 / 2;
        this.Tgh = i11 / 2;
    }
}
