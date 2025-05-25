package com.bytedance.sdk.openadsdk.zc;

import java.util.ArrayList;
import java.util.List;

/* compiled from: FeatureDurationModel.java */
/* loaded from: classes.dex */
public class cJ {
    private long Qhi = 0;
    private long cJ = 0;

    /* renamed from: ac  reason: collision with root package name */
    private final List<ac> f9405ac = new ArrayList();
    private long CJ = 0;

    public void CJ(long j10) {
        this.f9405ac.add(new ac(this.CJ, j10));
        this.CJ = 0L;
    }

    public void Qhi(long j10) {
        this.Qhi = j10;
    }

    public void ac(long j10) {
        this.CJ = j10;
    }

    public void cJ(long j10) {
        this.cJ = j10;
    }

    public long Qhi(long j10, long j11) {
        long j12;
        int i10 = 0;
        for (ac acVar : this.f9405ac) {
            if (j10 < acVar.Qhi()) {
                i10 = (int) ((acVar.cJ() - acVar.Qhi()) + i10);
            } else {
                i10 = (int) ((acVar.cJ() - j10) + i10);
            }
        }
        long j13 = this.Qhi;
        if (j13 < j10) {
            long j14 = this.cJ;
            if (j14 == 0) {
                j14 = this.CJ;
                if (j14 == 0) {
                    j12 = j11 - j10;
                }
            }
            return (j14 - j10) - i10;
        }
        long j15 = this.cJ;
        if (j15 == 0) {
            j15 = this.CJ;
            if (j15 == 0) {
                j12 = j11 - j13;
            }
        }
        return (j15 - j13) - i10;
        return j12 - i10;
    }
}
