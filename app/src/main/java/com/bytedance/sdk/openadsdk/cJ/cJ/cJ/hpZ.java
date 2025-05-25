package com.bytedance.sdk.openadsdk.cJ.CJ.cJ;

import com.bytedance.sdk.openadsdk.core.model.tP;

/* compiled from: VideoLogHelperModel.java */
/* loaded from: classes.dex */
public class hpZ {
    private com.bykv.vk.openvk.component.video.api.ac.ac CJ;
    private long Qhi;

    /* renamed from: ac  reason: collision with root package name */
    private int f8627ac;
    private String cJ;

    /* renamed from: fl  reason: collision with root package name */
    private tP f8628fl;

    /* compiled from: VideoLogHelperModel.java */
    /* loaded from: classes.dex */
    public static class Qhi {
        private com.bykv.vk.openvk.component.video.api.ac.Qhi Gm;
        private int ROR;
        private int Sf;
        private int Tgh;

        /* renamed from: fl  reason: collision with root package name */
        private int f8630fl;

        /* renamed from: hm  reason: collision with root package name */
        private int f8631hm;
        private long Qhi = 0;
        private long cJ = 0;

        /* renamed from: ac  reason: collision with root package name */
        private long f8629ac = 0;
        private boolean CJ = false;
        private boolean WAv = false;

        private void ABk() {
            long j10 = this.f8629ac;
            if (j10 > 0) {
                long j11 = this.Qhi;
                if (j11 > j10) {
                    this.Qhi = j11 % j10;
                }
            }
        }

        public int CJ() {
            return this.f8630fl;
        }

        public boolean Gm() {
            return this.CJ;
        }

        public long Qhi() {
            return this.Qhi;
        }

        public int ROR() {
            return this.ROR;
        }

        public int Sf() {
            return this.Sf;
        }

        public int Tgh() {
            long j10 = this.f8629ac;
            if (j10 <= 0) {
                return 0;
            }
            return Math.min((int) ((this.Qhi * 100) / j10), 100);
        }

        public boolean WAv() {
            return this.WAv;
        }

        public long ac() {
            return this.f8629ac;
        }

        public long cJ() {
            return this.cJ;
        }

        public int fl() {
            return this.Tgh;
        }

        public int hm() {
            return this.f8631hm;
        }

        public com.bykv.vk.openvk.component.video.api.ac.Qhi zc() {
            return this.Gm;
        }

        public void CJ(int i10) {
            this.f8631hm = i10;
        }

        public void Qhi(long j10) {
            this.Qhi = j10;
            ABk();
        }

        public void ac(long j10) {
            this.f8629ac = j10;
            ABk();
        }

        public void cJ(long j10) {
            this.cJ = j10;
        }

        public void cJ(int i10) {
            this.Tgh = i10;
        }

        public void Qhi(int i10) {
            this.f8630fl = i10;
        }

        public void ac(int i10) {
            this.ROR = i10;
        }

        public void Qhi(boolean z10) {
            this.CJ = z10;
        }

        public void Qhi(com.bykv.vk.openvk.component.video.api.ac.Qhi qhi) {
            this.Gm = qhi;
        }
    }

    public hpZ(long j10, String str, int i10, com.bykv.vk.openvk.component.video.api.ac.ac acVar, tP tPVar) {
        this.Qhi = j10;
        this.cJ = str;
        this.f8627ac = i10;
        this.CJ = acVar;
        this.f8628fl = tPVar;
    }

    public com.bykv.vk.openvk.component.video.api.ac.ac CJ() {
        return this.CJ;
    }

    public long Qhi() {
        return this.Qhi;
    }

    public int ac() {
        return this.f8627ac;
    }

    public String cJ() {
        return this.cJ;
    }

    public tP fl() {
        return this.f8628fl;
    }
}
