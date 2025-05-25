package com.bytedance.sdk.openadsdk.utils;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: CloseButtonController.java */
/* loaded from: classes.dex */
public class ROR implements zc, Runnable {
    private long CJ;
    private final Qhi ROR;
    private boolean Sf;
    private boolean Tgh;
    private final Activity cJ;

    /* renamed from: fl  reason: collision with root package name */
    private long f9373fl;

    /* renamed from: hm  reason: collision with root package name */
    private final AtomicBoolean f9374hm = new AtomicBoolean(false);

    /* renamed from: ac  reason: collision with root package name */
    private final Handler f9372ac = new Handler(Looper.getMainLooper());
    private View Qhi = CJ();

    /* compiled from: CloseButtonController.java */
    /* loaded from: classes.dex */
    public interface Qhi {
        View Qhi();

        void cJ();
    }

    private ROR(Activity activity, int i10, Qhi qhi) {
        this.ROR = qhi;
        this.cJ = activity;
        this.CJ = i10;
    }

    private View CJ() {
        Qhi qhi = this.ROR;
        if (qhi != null) {
            return qhi.Qhi();
        }
        return null;
    }

    public static zc Qhi(Activity activity, Qhi qhi) {
        int wp = com.bytedance.sdk.openadsdk.core.settings.HzH.YD().wp();
        if (wp < 0) {
            return new zc() { // from class: com.bytedance.sdk.openadsdk.utils.ROR.1
                @Override // com.bytedance.sdk.openadsdk.utils.zc
                public void Qhi() {
                }

                @Override // com.bytedance.sdk.openadsdk.utils.zc
                public void Qhi(long j10) {
                }

                @Override // com.bytedance.sdk.openadsdk.utils.zc
                public void ac() {
                }

                @Override // com.bytedance.sdk.openadsdk.utils.zc
                public void cJ() {
                }
            };
        }
        return new ROR(activity, Math.min(wp, 50) * 1000, qhi);
    }

    private void ROR() {
        ViewParent parent = this.Qhi.getParent();
        if (parent instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) parent;
            if (viewGroup.indexOfChild(this.Qhi) != viewGroup.getChildCount() - 1) {
                this.Qhi.bringToFront();
            }
        }
    }

    private void Tgh() {
        Activity activity;
        View childAt;
        if (this.Tgh || (activity = this.cJ) == null || activity.isFinishing() || this.cJ.isDestroyed()) {
            return;
        }
        if (this.Qhi == null) {
            this.Qhi = CJ();
        }
        View view = this.Qhi;
        if (view != null) {
            if (cJ(view)) {
                Qhi(this.Qhi);
                View view2 = this.Qhi;
                if ((view2 instanceof ViewGroup) && ((ViewGroup) view2).getChildCount() > 0 && (childAt = ((ViewGroup) this.Qhi).getChildAt(0)) != null && cJ(childAt)) {
                    Qhi(childAt);
                }
                Qhi qhi = this.ROR;
                if (qhi != null) {
                    qhi.cJ();
                }
            }
            ROR();
        }
        this.Tgh = true;
    }

    private void fl() {
        this.Sf = false;
        this.f9373fl = SystemClock.elapsedRealtime();
        Handler handler = this.f9372ac;
        if (handler != null) {
            handler.postDelayed(this, this.CJ);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.utils.zc
    public void ac() {
        if (this.Tgh) {
            return;
        }
        this.Tgh = true;
        Handler handler = this.f9372ac;
        if (handler != null) {
            try {
                handler.removeCallbacks(this);
            } catch (Throwable th2) {
                com.bytedance.sdk.component.utils.ABk.cJ(th2.getMessage());
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.utils.zc
    public void cJ() {
        if (this.f9373fl <= 0 || this.Tgh) {
            return;
        }
        if (!this.Sf) {
            this.CJ -= SystemClock.elapsedRealtime() - this.f9373fl;
        }
        this.Sf = true;
        if (this.CJ <= 0) {
            Tgh();
            return;
        }
        Handler handler = this.f9372ac;
        if (handler != null) {
            try {
                handler.removeCallbacks(this);
            } catch (Throwable th2) {
                com.bytedance.sdk.component.utils.ABk.cJ(th2.getMessage());
            }
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        Tgh();
    }

    @Override // com.bytedance.sdk.openadsdk.utils.zc
    public void Qhi(long j10) {
        if (this.f9374hm.compareAndSet(false, true)) {
            if (j10 < 0) {
                j10 = 0;
            }
            this.CJ += j10;
            fl();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.utils.zc
    public void Qhi() {
        if (this.f9373fl == 0 || !this.Sf) {
            return;
        }
        fl();
    }

    private void Qhi(View view) {
        view.setVisibility(0);
        view.setAlpha(1.0f);
    }

    private boolean cJ(View view) {
        if (view == null) {
            return true;
        }
        return !view.isShown() || ((double) view.getAlpha()) <= 0.9d;
    }
}
