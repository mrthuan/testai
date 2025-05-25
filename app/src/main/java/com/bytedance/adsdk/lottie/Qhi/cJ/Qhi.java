package com.bytedance.adsdk.lottie.Qhi.cJ;

import a0.a;
import android.view.animation.Interpolator;
import com.bytedance.component.sdk.annotation.FloatRange;
import com.inmobi.commons.core.configs.CrashConfig;
import java.util.ArrayList;
import java.util.List;

/* compiled from: BaseKeyframeAnimation.java */
/* loaded from: classes.dex */
public abstract class Qhi<K, A> {

    /* renamed from: ac  reason: collision with root package name */
    protected com.bytedance.adsdk.lottie.ROR.cJ<A> f7744ac;

    /* renamed from: fl  reason: collision with root package name */
    private final ac<K> f7745fl;
    final List<InterfaceC0071Qhi> Qhi = new ArrayList(1);
    private boolean CJ = false;
    protected float cJ = 0.0f;
    private A Tgh = null;
    private float ROR = -1.0f;
    private float Sf = -1.0f;

    /* compiled from: BaseKeyframeAnimation.java */
    /* renamed from: com.bytedance.adsdk.lottie.Qhi.cJ.Qhi$Qhi  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0071Qhi {
        void Qhi();
    }

    /* compiled from: BaseKeyframeAnimation.java */
    /* loaded from: classes.dex */
    public static final class Tgh<T> implements ac<T> {
        private final com.bytedance.adsdk.lottie.ROR.Qhi<T> Qhi;
        private float cJ = -1.0f;

        public Tgh(List<? extends com.bytedance.adsdk.lottie.ROR.Qhi<T>> list) {
            this.Qhi = list.get(0);
        }

        @Override // com.bytedance.adsdk.lottie.Qhi.cJ.Qhi.ac
        public float CJ() {
            return this.Qhi.CJ();
        }

        @Override // com.bytedance.adsdk.lottie.Qhi.cJ.Qhi.ac
        public boolean Qhi() {
            return false;
        }

        @Override // com.bytedance.adsdk.lottie.Qhi.cJ.Qhi.ac
        public float ac() {
            return this.Qhi.ac();
        }

        @Override // com.bytedance.adsdk.lottie.Qhi.cJ.Qhi.ac
        public com.bytedance.adsdk.lottie.ROR.Qhi<T> cJ() {
            return this.Qhi;
        }

        @Override // com.bytedance.adsdk.lottie.Qhi.cJ.Qhi.ac
        public boolean Qhi(float f10) {
            return !this.Qhi.fl();
        }

        @Override // com.bytedance.adsdk.lottie.Qhi.cJ.Qhi.ac
        public boolean cJ(float f10) {
            if (this.cJ == f10) {
                return true;
            }
            this.cJ = f10;
            return false;
        }
    }

    /* compiled from: BaseKeyframeAnimation.java */
    /* loaded from: classes.dex */
    public interface ac<T> {
        @FloatRange(from = 0.0d, to = CrashConfig.DEFAULT_CRASH_SAMPLING_PERCENT)
        float CJ();

        boolean Qhi();

        boolean Qhi(float f10);

        @FloatRange(from = 0.0d, to = CrashConfig.DEFAULT_CRASH_SAMPLING_PERCENT)
        float ac();

        com.bytedance.adsdk.lottie.ROR.Qhi<T> cJ();

        boolean cJ(float f10);
    }

    /* compiled from: BaseKeyframeAnimation.java */
    /* loaded from: classes.dex */
    public static final class cJ<T> implements ac<T> {
        private cJ() {
        }

        @Override // com.bytedance.adsdk.lottie.Qhi.cJ.Qhi.ac
        public float CJ() {
            return 1.0f;
        }

        @Override // com.bytedance.adsdk.lottie.Qhi.cJ.Qhi.ac
        public boolean Qhi() {
            return true;
        }

        @Override // com.bytedance.adsdk.lottie.Qhi.cJ.Qhi.ac
        public float ac() {
            return 0.0f;
        }

        @Override // com.bytedance.adsdk.lottie.Qhi.cJ.Qhi.ac
        public com.bytedance.adsdk.lottie.ROR.Qhi<T> cJ() {
            throw new IllegalStateException("not implemented");
        }

        @Override // com.bytedance.adsdk.lottie.Qhi.cJ.Qhi.ac
        public boolean Qhi(float f10) {
            return false;
        }

        @Override // com.bytedance.adsdk.lottie.Qhi.cJ.Qhi.ac
        public boolean cJ(float f10) {
            throw new IllegalStateException("not implemented");
        }
    }

    /* compiled from: BaseKeyframeAnimation.java */
    /* loaded from: classes.dex */
    public static final class fl<T> implements ac<T> {
        private final List<? extends com.bytedance.adsdk.lottie.ROR.Qhi<T>> Qhi;

        /* renamed from: ac  reason: collision with root package name */
        private com.bytedance.adsdk.lottie.ROR.Qhi<T> f7746ac = null;
        private float CJ = -1.0f;
        private com.bytedance.adsdk.lottie.ROR.Qhi<T> cJ = ac(0.0f);

        public fl(List<? extends com.bytedance.adsdk.lottie.ROR.Qhi<T>> list) {
            this.Qhi = list;
        }

        private com.bytedance.adsdk.lottie.ROR.Qhi<T> ac(float f10) {
            com.bytedance.adsdk.lottie.ROR.Qhi<T> qhi = (com.bytedance.adsdk.lottie.ROR.Qhi) a.f(this.Qhi, -1);
            if (f10 >= qhi.ac()) {
                return qhi;
            }
            for (int size = this.Qhi.size() - 2; size > 0; size--) {
                com.bytedance.adsdk.lottie.ROR.Qhi<T> qhi2 = this.Qhi.get(size);
                if (this.cJ != qhi2 && qhi2.Qhi(f10)) {
                    return qhi2;
                }
            }
            return this.Qhi.get(0);
        }

        @Override // com.bytedance.adsdk.lottie.Qhi.cJ.Qhi.ac
        public float CJ() {
            return ((com.bytedance.adsdk.lottie.ROR.Qhi) a.f(this.Qhi, -1)).CJ();
        }

        @Override // com.bytedance.adsdk.lottie.Qhi.cJ.Qhi.ac
        public boolean Qhi() {
            return false;
        }

        @Override // com.bytedance.adsdk.lottie.Qhi.cJ.Qhi.ac
        public com.bytedance.adsdk.lottie.ROR.Qhi<T> cJ() {
            return this.cJ;
        }

        @Override // com.bytedance.adsdk.lottie.Qhi.cJ.Qhi.ac
        public boolean Qhi(float f10) {
            if (this.cJ.Qhi(f10)) {
                return !this.cJ.fl();
            }
            this.cJ = ac(f10);
            return true;
        }

        @Override // com.bytedance.adsdk.lottie.Qhi.cJ.Qhi.ac
        public boolean cJ(float f10) {
            com.bytedance.adsdk.lottie.ROR.Qhi<T> qhi = this.f7746ac;
            com.bytedance.adsdk.lottie.ROR.Qhi<T> qhi2 = this.cJ;
            if (qhi == qhi2 && this.CJ == f10) {
                return true;
            }
            this.f7746ac = qhi2;
            this.CJ = f10;
            return false;
        }

        @Override // com.bytedance.adsdk.lottie.Qhi.cJ.Qhi.ac
        public float ac() {
            return this.Qhi.get(0).ac();
        }
    }

    public Qhi(List<? extends com.bytedance.adsdk.lottie.ROR.Qhi<K>> list) {
        this.f7745fl = Qhi(list);
    }

    @FloatRange(from = 0.0d, to = CrashConfig.DEFAULT_CRASH_SAMPLING_PERCENT)
    private float hm() {
        if (this.ROR == -1.0f) {
            this.ROR = this.f7745fl.ac();
        }
        return this.ROR;
    }

    public float CJ() {
        if (this.CJ) {
            return 0.0f;
        }
        com.bytedance.adsdk.lottie.ROR.Qhi<K> ac2 = ac();
        if (ac2.fl()) {
            return 0.0f;
        }
        return (this.cJ - ac2.ac()) / (ac2.CJ() - ac2.ac());
    }

    public abstract A Qhi(com.bytedance.adsdk.lottie.ROR.Qhi<K> qhi, float f10);

    public void Qhi() {
        this.CJ = true;
    }

    public A ROR() {
        A Qhi;
        float CJ = CJ();
        if (this.f7744ac == null && this.f7745fl.cJ(CJ)) {
            return this.Tgh;
        }
        com.bytedance.adsdk.lottie.ROR.Qhi<K> ac2 = ac();
        Interpolator interpolator = ac2.CJ;
        if (interpolator != null && ac2.f7758fl != null) {
            Qhi = Qhi(ac2, CJ, interpolator.getInterpolation(CJ), ac2.f7758fl.getInterpolation(CJ));
        } else {
            Qhi = Qhi(ac2, fl());
        }
        this.Tgh = Qhi;
        return Qhi;
    }

    public float Sf() {
        return this.cJ;
    }

    @FloatRange(from = 0.0d, to = CrashConfig.DEFAULT_CRASH_SAMPLING_PERCENT)
    public float Tgh() {
        if (this.Sf == -1.0f) {
            this.Sf = this.f7745fl.CJ();
        }
        return this.Sf;
    }

    public com.bytedance.adsdk.lottie.ROR.Qhi<K> ac() {
        com.bytedance.adsdk.lottie.Tgh.Qhi("BaseKeyframeAnimation#getCurrentKeyframe");
        com.bytedance.adsdk.lottie.ROR.Qhi<K> cJ2 = this.f7745fl.cJ();
        com.bytedance.adsdk.lottie.Tgh.cJ("BaseKeyframeAnimation#getCurrentKeyframe");
        return cJ2;
    }

    public void cJ() {
        for (int i10 = 0; i10 < this.Qhi.size(); i10++) {
            this.Qhi.get(i10).Qhi();
        }
    }

    public float fl() {
        com.bytedance.adsdk.lottie.ROR.Qhi<K> ac2 = ac();
        if (ac2 != null && !ac2.fl()) {
            return ac2.f7757ac.getInterpolation(CJ());
        }
        return 0.0f;
    }

    public void Qhi(InterfaceC0071Qhi interfaceC0071Qhi) {
        this.Qhi.add(interfaceC0071Qhi);
    }

    public void Qhi(@FloatRange(from = 0.0d, to = 1.0d) float f10) {
        if (this.f7745fl.Qhi()) {
            return;
        }
        if (f10 < hm()) {
            f10 = hm();
        } else if (f10 > Tgh()) {
            f10 = Tgh();
        }
        if (f10 == this.cJ) {
            return;
        }
        this.cJ = f10;
        if (this.f7745fl.Qhi(f10)) {
            cJ();
        }
    }

    public A Qhi(com.bytedance.adsdk.lottie.ROR.Qhi<K> qhi, float f10, float f11, float f12) {
        throw new UnsupportedOperationException("This animation does not support split dimensions!");
    }

    private static <T> ac<T> Qhi(List<? extends com.bytedance.adsdk.lottie.ROR.Qhi<T>> list) {
        if (list.isEmpty()) {
            return new cJ();
        }
        if (list.size() == 1) {
            return new Tgh(list);
        }
        return new fl(list);
    }
}
