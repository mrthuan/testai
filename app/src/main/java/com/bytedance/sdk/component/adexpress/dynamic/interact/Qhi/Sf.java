package com.bytedance.sdk.component.adexpress.dynamic.interact.Qhi;

import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.component.adexpress.CJ.CQU;
import com.bytedance.sdk.component.adexpress.dynamic.interact.WAv;
import java.lang.ref.SoftReference;

/* compiled from: UnlockTapTouch.java */
/* loaded from: classes.dex */
public class Sf implements View.OnTouchListener {

    /* renamed from: ac  reason: collision with root package name */
    private static int f8227ac = 10;
    private WAv CJ;
    private float Qhi;
    private float cJ;

    /* renamed from: fl  reason: collision with root package name */
    private int f8228fl;
    private RectF Tgh = new RectF();
    private long ROR = 0;
    private final int Sf = 200;

    /* renamed from: hm  reason: collision with root package name */
    private final int f8229hm = 3;
    private SoftReference<View> WAv = new SoftReference<>(null);

    public Sf(WAv wAv, int i10, final ViewGroup viewGroup) {
        this.f8228fl = f8227ac;
        this.CJ = wAv;
        if (i10 > 0) {
            this.f8228fl = i10;
        }
        if (viewGroup != null) {
            viewGroup.post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.interact.Qhi.Sf.1
                @Override // java.lang.Runnable
                public void run() {
                    View findViewById = viewGroup.findViewById(2097610746);
                    Sf.this.WAv = new SoftReference(findViewById);
                }
            });
        }
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        WAv wAv;
        WAv wAv2;
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1) {
                RectF rectF = this.Tgh;
                if (rectF != null && !rectF.contains(this.Qhi, this.cJ)) {
                    return false;
                }
                float rawX = motionEvent.getRawX();
                float rawY = motionEvent.getRawY();
                float abs = Math.abs(rawX - this.Qhi);
                float abs2 = Math.abs(rawY - this.cJ);
                int cJ = CQU.cJ(com.bytedance.sdk.component.adexpress.fl.Qhi(), Math.abs(rawX - this.Qhi));
                int i10 = f8227ac;
                if (abs >= i10 && abs2 >= i10) {
                    if (rawX > this.Qhi && cJ > this.f8228fl && (wAv2 = this.CJ) != null) {
                        wAv2.Qhi();
                    }
                } else if ((System.currentTimeMillis() - this.ROR < 200 || (abs < 3.0f && abs2 < 3.0f)) && (wAv = this.CJ) != null) {
                    wAv.Qhi();
                }
            }
        } else {
            this.Tgh = Qhi(this.WAv.get());
            this.Qhi = motionEvent.getRawX();
            this.cJ = motionEvent.getRawY();
            this.ROR = System.currentTimeMillis();
        }
        return true;
    }

    private RectF Qhi(View view) {
        if (view == null) {
            return new RectF();
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i10 = iArr[0];
        return new RectF(i10, iArr[1], view.getWidth() + i10, view.getHeight() + iArr[1]);
    }
}
