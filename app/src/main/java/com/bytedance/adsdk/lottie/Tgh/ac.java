package com.bytedance.adsdk.lottie.Tgh;

import android.view.Choreographer;
import com.bytedance.component.sdk.annotation.FloatRange;
import com.bytedance.component.sdk.annotation.MainThread;
import com.inmobi.commons.core.configs.CrashConfig;

/* compiled from: LottieValueAnimator.java */
/* loaded from: classes.dex */
public class ac extends Qhi implements Choreographer.FrameCallback {
    private com.bytedance.adsdk.lottie.ROR WAv;
    private float cJ = 1.0f;

    /* renamed from: ac  reason: collision with root package name */
    private boolean f7772ac = false;
    private long CJ = 0;

    /* renamed from: fl  reason: collision with root package name */
    private float f7773fl = 0.0f;
    private float Tgh = 0.0f;
    private int ROR = 0;
    private float Sf = -2.1474836E9f;

    /* renamed from: hm  reason: collision with root package name */
    private float f7774hm = 2.1474836E9f;
    protected boolean Qhi = false;
    private boolean Gm = false;

    private boolean MQ() {
        if (WAv() < 0.0f) {
            return true;
        }
        return false;
    }

    private void qMt() {
        if (this.WAv == null) {
            return;
        }
        float f10 = this.Tgh;
        if (f10 >= this.Sf && f10 <= this.f7774hm) {
            return;
        }
        throw new IllegalStateException(String.format("Frame must be [%f,%f]. It is %f", Float.valueOf(this.Sf), Float.valueOf(this.f7774hm), Float.valueOf(this.Tgh)));
    }

    private float tP() {
        com.bytedance.adsdk.lottie.ROR ror = this.WAv;
        if (ror == null) {
            return Float.MAX_VALUE;
        }
        return (1.0E9f / ror.Sf()) / Math.abs(this.cJ);
    }

    @MainThread
    public void ABk() {
        kYc();
        CJ();
    }

    @MainThread
    public void CJ(boolean z10) {
        Choreographer.getInstance().removeFrameCallback(this);
        if (z10) {
            this.Qhi = false;
        }
    }

    @MainThread
    public void Gm() {
        float pA;
        this.Qhi = true;
        Qhi(MQ());
        if (MQ()) {
            pA = hpZ();
        } else {
            pA = pA();
        }
        Qhi((int) pA);
        this.CJ = 0L;
        this.ROR = 0;
        HzH();
    }

    public void HzH() {
        if (isRunning()) {
            CJ(false);
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    public void Qhi(com.bytedance.adsdk.lottie.ROR ror) {
        boolean z10 = this.WAv == null;
        this.WAv = ror;
        if (z10) {
            Qhi(Math.max(this.Sf, ror.Tgh()), Math.min(this.f7774hm, ror.ROR()));
        } else {
            Qhi((int) ror.Tgh(), (int) ror.ROR());
        }
        float f10 = this.Tgh;
        this.Tgh = 0.0f;
        this.f7773fl = 0.0f;
        Qhi((int) f10);
        ac();
    }

    public float ROR() {
        return this.Tgh;
    }

    public void Sf() {
        this.WAv = null;
        this.Sf = -2.1474836E9f;
        this.f7774hm = 2.1474836E9f;
    }

    @FloatRange(from = 0.0d, to = CrashConfig.DEFAULT_CRASH_SAMPLING_PERCENT)
    public float Tgh() {
        com.bytedance.adsdk.lottie.ROR ror = this.WAv;
        if (ror == null) {
            return 0.0f;
        }
        return (this.Tgh - ror.Tgh()) / (this.WAv.ROR() - this.WAv.Tgh());
    }

    public float WAv() {
        return this.cJ;
    }

    public void ac(boolean z10) {
        this.Gm = z10;
    }

    public void cJ(float f10) {
        Qhi(this.Sf, f10);
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    @MainThread
    public void cancel() {
        cJ();
        kYc();
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j10) {
        float pA;
        float hpZ;
        HzH();
        if (this.WAv != null && isRunning()) {
            com.bytedance.adsdk.lottie.Tgh.Qhi("LottieValueAnimator#doFrame");
            long j11 = this.CJ;
            long j12 = 0;
            if (j11 != 0) {
                j12 = j10 - j11;
            }
            float tP = ((float) j12) / tP();
            float f10 = this.f7773fl;
            if (MQ()) {
                tP = -tP;
            }
            float f11 = f10 + tP;
            boolean z10 = !Tgh.ac(f11, pA(), hpZ());
            float f12 = this.f7773fl;
            float cJ = Tgh.cJ(f11, pA(), hpZ());
            this.f7773fl = cJ;
            if (this.Gm) {
                cJ = (float) Math.floor(cJ);
            }
            this.Tgh = cJ;
            this.CJ = j10;
            if (!this.Gm || this.f7773fl != f12) {
                ac();
            }
            if (z10) {
                if (getRepeatCount() != -1 && this.ROR >= getRepeatCount()) {
                    if (this.cJ < 0.0f) {
                        hpZ = pA();
                    } else {
                        hpZ = hpZ();
                    }
                    this.f7773fl = hpZ;
                    this.Tgh = hpZ;
                    kYc();
                    cJ(MQ());
                } else {
                    Qhi();
                    this.ROR++;
                    if (getRepeatMode() == 2) {
                        this.f7772ac = !this.f7772ac;
                        hm();
                    } else {
                        if (MQ()) {
                            pA = hpZ();
                        } else {
                            pA = pA();
                        }
                        this.f7773fl = pA;
                        this.Tgh = pA;
                    }
                    this.CJ = j10;
                }
            }
            qMt();
            com.bytedance.adsdk.lottie.Tgh.cJ("LottieValueAnimator#doFrame");
        }
    }

    @Override // android.animation.ValueAnimator
    @FloatRange(from = 0.0d, to = CrashConfig.DEFAULT_CRASH_SAMPLING_PERCENT)
    public float getAnimatedFraction() {
        float pA;
        float hpZ;
        float pA2;
        if (this.WAv == null) {
            return 0.0f;
        }
        if (MQ()) {
            pA = hpZ() - this.Tgh;
            hpZ = hpZ();
            pA2 = pA();
        } else {
            pA = this.Tgh - pA();
            hpZ = hpZ();
            pA2 = pA();
        }
        return pA / (hpZ - pA2);
    }

    @Override // android.animation.ValueAnimator
    public Object getAnimatedValue() {
        return Float.valueOf(Tgh());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public long getDuration() {
        com.bytedance.adsdk.lottie.ROR ror = this.WAv;
        if (ror == null) {
            return 0L;
        }
        return ror.fl();
    }

    public void hm() {
        ac(-WAv());
    }

    public float hpZ() {
        com.bytedance.adsdk.lottie.ROR ror = this.WAv;
        if (ror == null) {
            return 0.0f;
        }
        float f10 = this.f7774hm;
        if (f10 == 2.1474836E9f) {
            return ror.ROR();
        }
        return f10;
    }

    @MainThread
    public void iMK() {
        this.Qhi = true;
        HzH();
        this.CJ = 0L;
        if (MQ() && ROR() == pA()) {
            Qhi(hpZ());
        } else if (!MQ() && ROR() == hpZ()) {
            Qhi(pA());
        }
        fl();
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public boolean isRunning() {
        return this.Qhi;
    }

    @MainThread
    public void kYc() {
        CJ(true);
    }

    public float pA() {
        com.bytedance.adsdk.lottie.ROR ror = this.WAv;
        if (ror == null) {
            return 0.0f;
        }
        float f10 = this.Sf;
        if (f10 == -2.1474836E9f) {
            return ror.Tgh();
        }
        return f10;
    }

    @Override // android.animation.ValueAnimator
    public void setRepeatMode(int i10) {
        super.setRepeatMode(i10);
        if (i10 != 2 && this.f7772ac) {
            this.f7772ac = false;
            hm();
        }
    }

    @MainThread
    public void zc() {
        kYc();
        cJ(MQ());
    }

    public void ac(float f10) {
        this.cJ = f10;
    }

    @Override // com.bytedance.adsdk.lottie.Tgh.Qhi
    public void cJ() {
        super.cJ();
        cJ(MQ());
    }

    public void Qhi(float f10) {
        if (this.f7773fl == f10) {
            return;
        }
        float cJ = Tgh.cJ(f10, pA(), hpZ());
        this.f7773fl = cJ;
        if (this.Gm) {
            cJ = (float) Math.floor(cJ);
        }
        this.Tgh = cJ;
        this.CJ = 0L;
        ac();
    }

    public void Qhi(int i10) {
        Qhi(i10, (int) this.f7774hm);
    }

    public void Qhi(float f10, float f11) {
        if (f10 <= f11) {
            com.bytedance.adsdk.lottie.ROR ror = this.WAv;
            float Tgh = ror == null ? -3.4028235E38f : ror.Tgh();
            com.bytedance.adsdk.lottie.ROR ror2 = this.WAv;
            float ROR = ror2 == null ? Float.MAX_VALUE : ror2.ROR();
            float cJ = Tgh.cJ(f10, Tgh, ROR);
            float cJ2 = Tgh.cJ(f11, Tgh, ROR);
            if (cJ == this.Sf && cJ2 == this.f7774hm) {
                return;
            }
            this.Sf = cJ;
            this.f7774hm = cJ2;
            Qhi((int) Tgh.cJ(this.Tgh, cJ, cJ2));
            return;
        }
        throw new IllegalArgumentException(String.format("minFrame (%s) must be <= maxFrame (%s)", Float.valueOf(f10), Float.valueOf(f11)));
    }
}
