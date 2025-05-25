package com.bytedance.adsdk.lottie.ac.cJ;

/* compiled from: MergePaths.java */
/* loaded from: classes.dex */
public class WAv implements ac {
    private final String Qhi;

    /* renamed from: ac  reason: collision with root package name */
    private final boolean f7828ac;
    private final Qhi cJ;

    /* compiled from: MergePaths.java */
    /* loaded from: classes.dex */
    public enum Qhi {
        MERGE,
        ADD,
        SUBTRACT,
        INTERSECT,
        EXCLUDE_INTERSECTIONS;

        public static Qhi Qhi(int i10) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            if (i10 != 5) {
                                return MERGE;
                            }
                            return EXCLUDE_INTERSECTIONS;
                        }
                        return INTERSECT;
                    }
                    return SUBTRACT;
                }
                return ADD;
            }
            return MERGE;
        }
    }

    public WAv(String str, Qhi qhi, boolean z10) {
        this.Qhi = str;
        this.cJ = qhi;
        this.f7828ac = z10;
    }

    public String Qhi() {
        return this.Qhi;
    }

    public boolean ac() {
        return this.f7828ac;
    }

    public Qhi cJ() {
        return this.cJ;
    }

    public String toString() {
        return "MergePaths{mode=" + this.cJ + '}';
    }

    @Override // com.bytedance.adsdk.lottie.ac.cJ.ac
    public com.bytedance.adsdk.lottie.Qhi.Qhi.ac Qhi(com.bytedance.adsdk.lottie.hm hmVar, com.bytedance.adsdk.lottie.ROR ror, com.bytedance.adsdk.lottie.ac.ac.Qhi qhi) {
        if (hmVar.Qhi()) {
            return new com.bytedance.adsdk.lottie.Qhi.Qhi.ABk(this);
        }
        return null;
    }
}
