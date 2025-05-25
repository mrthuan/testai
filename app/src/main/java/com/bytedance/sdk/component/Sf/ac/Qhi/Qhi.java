package com.bytedance.sdk.component.Sf.ac.Qhi;

import android.text.TextUtils;
import com.bytedance.sdk.component.Sf.ac.cJ;

/* compiled from: PAGRunnableLogModel.java */
/* loaded from: classes.dex */
public class Qhi {
    private long CJ;
    private String Qhi;
    private long Tgh;

    /* renamed from: ac  reason: collision with root package name */
    private long f8034ac;
    private int cJ = 0;

    /* renamed from: fl  reason: collision with root package name */
    private long f8035fl;

    public long CJ() {
        return this.CJ;
    }

    public String Qhi() {
        return this.Qhi;
    }

    public long Tgh() {
        return this.Tgh;
    }

    public long ac() {
        return this.f8034ac;
    }

    public int cJ() {
        return this.cJ;
    }

    public long fl() {
        return this.f8035fl;
    }

    public String toString() {
        return this.Qhi + " times=" + this.cJ + ",waitMaxTime=" + this.f8035fl + ",runMaxTime=" + this.Tgh + ",runTotalTime=" + this.CJ + ",waitTotalTime=" + this.f8034ac;
    }

    public void Qhi(cJ cJVar) {
        synchronized (this) {
            if (TextUtils.isEmpty(this.Qhi)) {
                this.Qhi = cJVar.cJ();
            }
            this.f8034ac += cJVar.Tgh();
            this.CJ += cJVar.ROR();
            this.f8035fl = Math.max(this.f8035fl, cJVar.Tgh());
            this.Tgh = Math.max(this.Tgh, cJVar.ROR());
            this.cJ++;
        }
        cJVar.Tgh();
        cJVar.ROR();
        toString();
    }
}
