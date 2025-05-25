package com.bytedance.sdk.openadsdk.core.widget;

import android.annotation.SuppressLint;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.HzH;
import com.bytedance.sdk.openadsdk.utils.zn;

/* compiled from: VideoOnTouchLayout.java */
/* loaded from: classes.dex */
public class fl {
    private float CJ;
    private boolean Gm;
    private final Qhi Qhi;
    private int ROR;
    private int Tgh;

    /* renamed from: fl  reason: collision with root package name */
    private float f9294fl;
    private final boolean cJ = false;

    /* renamed from: ac  reason: collision with root package name */
    private boolean f9293ac = false;
    private boolean Sf = true;

    /* renamed from: hm  reason: collision with root package name */
    private boolean f9295hm = false;
    private final View.OnTouchListener WAv = new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.core.widget.fl.1
        @Override // android.view.View.OnTouchListener
        @SuppressLint({"ClickableViewAccessibility"})
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (fl.this.Qhi.bxS()) {
                if (!fl.this.f9293ac) {
                    return true;
                }
                return false;
            }
            float x4 = motionEvent.getX();
            float y10 = motionEvent.getY();
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action != 1) {
                    if (action == 3) {
                        fl.this.Gm = false;
                    }
                } else {
                    if (Math.abs(x4 - fl.this.Tgh) > 20.0f || Math.abs(y10 - fl.this.ROR) > 20.0f) {
                        fl.this.Sf = false;
                    }
                    fl.this.Sf = true;
                    fl.this.f9295hm = false;
                    fl.this.CJ = 0.0f;
                    fl.this.f9294fl = 0.0f;
                    fl.this.Tgh = 0;
                    if (fl.this.Qhi != null) {
                        fl.this.Qhi.Qhi(view, fl.this.Sf);
                    }
                    fl.this.Gm = false;
                }
            } else {
                fl flVar = fl.this;
                flVar.Gm = flVar.Qhi(motionEvent);
                fl.this.CJ = x4;
                fl.this.f9294fl = y10;
                fl.this.Tgh = (int) x4;
                fl.this.ROR = (int) y10;
                fl.this.Sf = true;
                if (fl.this.Qhi != null && fl.this.f9293ac) {
                    fl.this.Qhi.Qhi(view, true);
                }
            }
            if (!fl.this.f9293ac) {
                return true;
            }
            return false;
        }
    };

    /* compiled from: VideoOnTouchLayout.java */
    /* loaded from: classes.dex */
    public interface Qhi {
        void Qhi(View view, boolean z10);

        boolean bxS();
    }

    public fl(Qhi qhi) {
        this.Qhi = qhi;
    }

    public void Qhi(View view) {
        if (view != null) {
            view.setOnTouchListener(this.WAv);
        }
    }

    public void Qhi(boolean z10) {
        this.f9293ac = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean Qhi(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            int ac2 = zn.ac(HzH.Qhi().getApplicationContext());
            int CJ = zn.CJ(HzH.Qhi().getApplicationContext());
            float rawX = motionEvent.getRawX();
            float rawY = motionEvent.getRawY();
            float f10 = ac2;
            if (rawX <= f10 * 0.01f || rawX >= f10 * 0.99f) {
                return true;
            }
            float f11 = CJ;
            return rawY <= 0.01f * f11 || rawY >= f11 * 0.99f;
        }
        return false;
    }
}
