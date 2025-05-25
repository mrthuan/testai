package com.bytedance.sdk.openadsdk.component.reward;

import android.os.CountDownTimer;
import com.bykv.vk.openvk.component.video.api.CJ.fl;
import com.bytedance.sdk.openadsdk.cJ.CJ.cJ.hpZ;
import com.bytedance.sdk.openadsdk.core.model.tP;
import com.bytedance.sdk.openadsdk.core.video.ac.Qhi;

/* compiled from: FakeVideoController.java */
/* loaded from: classes.dex */
public class ac implements com.bykv.vk.openvk.component.video.api.CJ.fl {
    private final Qhi Qhi;
    private final com.bykv.vk.openvk.component.video.api.cJ.Qhi ROR;
    private Qhi.InterfaceC0130Qhi Sf;
    private final tP Tgh;

    /* renamed from: fl  reason: collision with root package name */
    private boolean f8851fl;
    private boolean cJ = true;

    /* renamed from: ac  reason: collision with root package name */
    private long f8850ac = 0;
    private boolean CJ = false;

    /* compiled from: FakeVideoController.java */
    /* loaded from: classes.dex */
    public static class Qhi implements com.bykv.vk.openvk.component.video.api.Qhi {
        private CountDownTimer CJ;
        private final long Qhi;
        private final com.bykv.vk.openvk.component.video.api.cJ.Qhi ROR;
        private final com.bytedance.sdk.openadsdk.cJ.Sf Sf;
        private long Tgh;

        /* renamed from: ac  reason: collision with root package name */
        private int f8852ac = 0;
        private long cJ;

        /* renamed from: fl  reason: collision with root package name */
        private fl.Qhi f8853fl;

        public Qhi(long j10, com.bykv.vk.openvk.component.video.api.cJ.Qhi qhi, com.bytedance.sdk.openadsdk.cJ.Sf sf2) {
            this.Qhi = j10;
            this.ROR = qhi;
            this.Sf = sf2;
        }

        public int ABk() {
            return 0;
        }

        @Override // com.bykv.vk.openvk.component.video.api.Qhi
        public int CJ() {
            return 0;
        }

        public void Gm() {
            this.f8852ac = 0;
            CountDownTimer countDownTimer = this.CJ;
            if (countDownTimer != null) {
                countDownTimer.cancel();
                this.CJ = null;
            }
            if (this.f8853fl != null) {
                this.f8853fl = null;
            }
        }

        @Override // com.bykv.vk.openvk.component.video.api.Qhi
        public boolean Qhi() {
            return false;
        }

        @Override // com.bykv.vk.openvk.component.video.api.Qhi
        public boolean ROR() {
            if (this.f8852ac == 2) {
                return true;
            }
            return false;
        }

        @Override // com.bykv.vk.openvk.component.video.api.Qhi
        public boolean Sf() {
            if (this.f8852ac == 0) {
                return true;
            }
            return false;
        }

        public void WAv() {
            this.f8852ac = 2;
            this.cJ = this.Tgh;
            CountDownTimer countDownTimer = this.CJ;
            if (countDownTimer != null) {
                countDownTimer.cancel();
                this.CJ = null;
            }
        }

        @Override // com.bykv.vk.openvk.component.video.api.Qhi
        public boolean ac() {
            return false;
        }

        @Override // com.bykv.vk.openvk.component.video.api.Qhi
        public boolean cJ() {
            return false;
        }

        @Override // com.bykv.vk.openvk.component.video.api.Qhi
        public int fl() {
            return 0;
        }

        public void hm() {
            if (this.f8852ac == 1) {
                return;
            }
            this.f8852ac = 1;
            final long iMK = iMK();
            final long j10 = iMK - this.cJ;
            CountDownTimer countDownTimer = new CountDownTimer(j10, 200L) { // from class: com.bytedance.sdk.openadsdk.component.reward.ac.Qhi.1
                @Override // android.os.CountDownTimer
                public void onFinish() {
                    Qhi.this.f8852ac = 4;
                    Qhi.this.Tgh = iMK;
                    if (Qhi.this.f8853fl != null) {
                        Qhi.this.f8853fl.Qhi(Qhi.this.pA(), 100);
                    }
                    hpZ.Qhi qhi = new hpZ.Qhi();
                    qhi.Qhi(iMK);
                    qhi.ac(iMK);
                    qhi.cJ(Qhi.this.zc());
                    qhi.CJ(Qhi.this.ABk());
                    com.bytedance.sdk.openadsdk.cJ.CJ.Qhi.Qhi.cJ(Qhi.this.ROR, qhi, Qhi.this.Sf);
                }

                @Override // android.os.CountDownTimer
                public void onTick(long j11) {
                    long j12 = (j10 - j11) + Qhi.this.cJ;
                    Qhi.this.Tgh = j12;
                    if (Qhi.this.f8853fl != null) {
                        Qhi.this.f8853fl.Qhi(j12, iMK);
                    }
                }
            };
            this.CJ = countDownTimer;
            countDownTimer.start();
        }

        public long iMK() {
            return this.Qhi;
        }

        public long pA() {
            return this.Tgh;
        }

        public long zc() {
            return 0L;
        }

        @Override // com.bykv.vk.openvk.component.video.api.Qhi
        public boolean Tgh() {
            return this.f8852ac == 1;
        }

        public void Qhi(long j10) {
            this.cJ = j10;
        }

        public void Qhi(fl.Qhi qhi) {
            this.f8853fl = qhi;
        }
    }

    public ac(tP tPVar, com.bytedance.sdk.openadsdk.cJ.Sf sf2) {
        long j10;
        com.bykv.vk.openvk.component.video.api.cJ.Qhi qhi = new com.bykv.vk.openvk.component.video.api.cJ.Qhi() { // from class: com.bytedance.sdk.openadsdk.component.reward.ac.1
        };
        this.ROR = qhi;
        this.Tgh = tPVar;
        com.bykv.vk.openvk.component.video.api.ac.cJ FQ = tPVar.FQ();
        long j11 = 10;
        if (FQ != null) {
            j10 = (long) FQ.Tgh();
        } else {
            j10 = 10;
        }
        if (j10 <= 0) {
            FQ.Qhi(10.0d);
        } else {
            j11 = j10;
        }
        this.Qhi = new Qhi(j11 * 1000, qhi, sf2);
    }

    @Override // com.bykv.vk.openvk.component.video.api.CJ.fl
    public com.bykv.vk.openvk.component.video.api.CJ.ac ABk() {
        return null;
    }

    @Override // com.bykv.vk.openvk.component.video.api.CJ.fl
    public void CJ(boolean z10) {
    }

    @Override // com.bykv.vk.openvk.component.video.api.CJ.fl
    public boolean Gm() {
        return false;
    }

    @Override // com.bykv.vk.openvk.component.video.api.CJ.fl
    public boolean HzH() {
        return false;
    }

    @Override // com.bykv.vk.openvk.component.video.api.CJ.fl
    public void Qhi(fl.cJ cJVar) {
    }

    @Override // com.bykv.vk.openvk.component.video.api.CJ.fl
    public int ROR() {
        return 0;
    }

    @Override // com.bykv.vk.openvk.component.video.api.CJ.fl
    public long Sf() {
        return this.Qhi.iMK();
    }

    @Override // com.bykv.vk.openvk.component.video.api.CJ.fl
    public long Tgh() {
        return 0L;
    }

    @Override // com.bykv.vk.openvk.component.video.api.CJ.fl
    public int WAv() {
        return com.bykv.vk.openvk.component.video.Qhi.fl.Qhi.Qhi(this.Qhi.Tgh, this.Qhi.Qhi);
    }

    @Override // com.bykv.vk.openvk.component.video.api.CJ.fl
    public void ac(long j10) {
    }

    @Override // com.bykv.vk.openvk.component.video.api.CJ.fl
    public void cJ(com.bykv.vk.openvk.component.video.api.ac.ac acVar) {
    }

    @Override // com.bykv.vk.openvk.component.video.api.CJ.fl
    public void fl(boolean z10) {
    }

    @Override // com.bykv.vk.openvk.component.video.api.CJ.fl
    public long hm() {
        return fl();
    }

    @Override // com.bykv.vk.openvk.component.video.api.CJ.fl
    public boolean hpZ() {
        return false;
    }

    @Override // com.bykv.vk.openvk.component.video.api.CJ.fl
    public boolean iMK() {
        return this.CJ;
    }

    public com.bykv.vk.openvk.component.video.api.cJ.Qhi kYc() {
        return this.ROR;
    }

    @Override // com.bykv.vk.openvk.component.video.api.CJ.fl
    public boolean pA() {
        return this.f8851fl;
    }

    @Override // com.bykv.vk.openvk.component.video.api.CJ.fl
    public com.bykv.vk.openvk.component.video.api.Qhi zc() {
        return this.Qhi;
    }

    @Override // com.bykv.vk.openvk.component.video.api.CJ.fl
    public void CJ() {
        ac();
    }

    @Override // com.bykv.vk.openvk.component.video.api.CJ.fl
    public void Qhi(fl.InterfaceC0061fl interfaceC0061fl) {
    }

    @Override // com.bykv.vk.openvk.component.video.api.CJ.fl
    public void ac() {
        this.Qhi.Gm();
    }

    @Override // com.bykv.vk.openvk.component.video.api.CJ.fl
    public void cJ() {
        this.Qhi.hm();
        hpZ.Qhi qhi = new hpZ.Qhi();
        qhi.Qhi(fl());
        qhi.ac(Sf());
        qhi.cJ(Tgh());
        com.bytedance.sdk.openadsdk.cJ.CJ.Qhi.Qhi.cJ(this.ROR, qhi);
        Qhi.InterfaceC0130Qhi interfaceC0130Qhi = this.Sf;
        if (interfaceC0130Qhi != null) {
            interfaceC0130Qhi.Qhi(1);
        }
    }

    @Override // com.bykv.vk.openvk.component.video.api.CJ.fl
    public long fl() {
        return this.Qhi.pA();
    }

    @Override // com.bykv.vk.openvk.component.video.api.CJ.fl
    public void Qhi() {
        this.Qhi.WAv();
        hpZ.Qhi qhi = new hpZ.Qhi();
        qhi.Qhi(fl());
        qhi.ac(Sf());
        qhi.cJ(Tgh());
        com.bytedance.sdk.openadsdk.cJ.CJ.Qhi.Qhi.Qhi(this.ROR, qhi);
        Qhi.InterfaceC0130Qhi interfaceC0130Qhi = this.Sf;
        if (interfaceC0130Qhi != null) {
            interfaceC0130Qhi.Qhi(2);
        }
    }

    @Override // com.bykv.vk.openvk.component.video.api.CJ.fl
    public void ac(boolean z10) {
        this.f8851fl = z10;
    }

    @Override // com.bykv.vk.openvk.component.video.api.CJ.fl
    public void cJ(long j10) {
        this.f8850ac = j10;
    }

    @Override // com.bykv.vk.openvk.component.video.api.CJ.fl
    public void Qhi(boolean z10, int i10) {
        ac();
    }

    @Override // com.bykv.vk.openvk.component.video.api.CJ.fl
    public void cJ(boolean z10) {
        this.CJ = z10;
    }

    @Override // com.bykv.vk.openvk.component.video.api.CJ.fl
    public boolean Qhi(com.bykv.vk.openvk.component.video.api.ac.ac acVar) {
        this.CJ = acVar.Sf();
        if (acVar.ROR() > 0) {
            this.Qhi.Qhi(acVar.ROR());
        }
        com.bytedance.sdk.openadsdk.cJ.CJ.Qhi.Qhi.Qhi(this.Tgh, this.ROR, acVar);
        this.Qhi.hm();
        return true;
    }

    @Override // com.bykv.vk.openvk.component.video.api.CJ.fl
    public void Qhi(long j10) {
        this.Qhi.Qhi(j10);
    }

    @Override // com.bykv.vk.openvk.component.video.api.CJ.fl
    public void Qhi(boolean z10) {
        this.cJ = z10;
    }

    @Override // com.bykv.vk.openvk.component.video.api.CJ.fl
    public void Qhi(fl.Qhi qhi) {
        this.Qhi.Qhi(qhi);
    }

    public void Qhi(Qhi.InterfaceC0130Qhi interfaceC0130Qhi) {
        this.Sf = interfaceC0130Qhi;
    }
}
