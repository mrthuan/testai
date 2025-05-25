package com.bytedance.sdk.openadsdk.core.video.ac;

import com.bykv.vk.openvk.component.video.Qhi.CJ.HzH;
import com.bykv.vk.openvk.component.video.api.Qhi;
import com.tom_roush.fontbox.ttf.OS2WindowsMetricsTable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: SupportReplayMediaPlayer.java */
/* loaded from: classes.dex */
public class ac extends HzH {
    private final Qhi CJ;
    private final List<cJ> Qhi = Collections.synchronizedList(new ArrayList());
    private int cJ = 1;

    /* renamed from: ac  reason: collision with root package name */
    private int f9222ac = 1;

    /* compiled from: SupportReplayMediaPlayer.java */
    /* loaded from: classes.dex */
    public interface cJ extends Qhi.InterfaceC0062Qhi {
        void Qhi(int i10, int i11);
    }

    public ac() {
        Qhi qhi = new Qhi();
        this.CJ = qhi;
        super.Qhi(qhi);
        Qhi(OS2WindowsMetricsTable.WEIGHT_CLASS_MEDIUM);
    }

    public static /* synthetic */ int Qhi(ac acVar) {
        int i10 = acVar.f9222ac;
        acVar.f9222ac = i10 + 1;
        return i10;
    }

    @Override // com.bykv.vk.openvk.component.video.Qhi.CJ.HzH
    public long HzH() {
        return ((this.f9222ac - 1) * super.hpZ()) + super.HzH();
    }

    public int MQ() {
        return this.f9222ac;
    }

    @Override // com.bykv.vk.openvk.component.video.Qhi.CJ.HzH
    public long hpZ() {
        return super.hpZ() * this.cJ;
    }

    /* compiled from: SupportReplayMediaPlayer.java */
    /* loaded from: classes.dex */
    public class Qhi implements Qhi.InterfaceC0062Qhi {
        private Qhi() {
        }

        @Override // com.bykv.vk.openvk.component.video.api.Qhi.InterfaceC0062Qhi
        public void CJ(com.bykv.vk.openvk.component.video.api.Qhi qhi) {
            for (cJ cJVar : ac.this.Qhi) {
                cJVar.CJ(qhi);
            }
        }

        @Override // com.bykv.vk.openvk.component.video.api.Qhi.InterfaceC0062Qhi
        public void Qhi(com.bykv.vk.openvk.component.video.api.Qhi qhi) {
            ac.Qhi(ac.this);
            if (ac.this.f9222ac <= ac.this.cJ) {
                for (cJ cJVar : ac.this.Qhi) {
                    cJVar.Qhi(ac.this.f9222ac, ac.this.cJ);
                }
                ac.this.hm();
                return;
            }
            for (cJ cJVar2 : ac.this.Qhi) {
                cJVar2.Qhi(qhi);
            }
        }

        @Override // com.bykv.vk.openvk.component.video.api.Qhi.InterfaceC0062Qhi
        public void ac(com.bykv.vk.openvk.component.video.api.Qhi qhi) {
            for (cJ cJVar : ac.this.Qhi) {
                cJVar.ac(qhi);
            }
        }

        @Override // com.bykv.vk.openvk.component.video.api.Qhi.InterfaceC0062Qhi
        public void cJ(com.bykv.vk.openvk.component.video.api.Qhi qhi) {
            for (cJ cJVar : ac.this.Qhi) {
                cJVar.cJ(qhi);
            }
        }

        @Override // com.bykv.vk.openvk.component.video.api.Qhi.InterfaceC0062Qhi
        public void fl(com.bykv.vk.openvk.component.video.api.Qhi qhi) {
            for (cJ cJVar : ac.this.Qhi) {
                cJVar.fl(qhi);
            }
        }

        @Override // com.bykv.vk.openvk.component.video.api.Qhi.InterfaceC0062Qhi
        public void cJ(com.bykv.vk.openvk.component.video.api.Qhi qhi, int i10) {
            for (cJ cJVar : ac.this.Qhi) {
                cJVar.cJ(qhi, i10);
            }
        }

        @Override // com.bykv.vk.openvk.component.video.api.Qhi.InterfaceC0062Qhi
        public void Qhi(com.bykv.vk.openvk.component.video.api.Qhi qhi, long j10) {
            for (cJ cJVar : ac.this.Qhi) {
                cJVar.Qhi(qhi, j10);
            }
        }

        @Override // com.bykv.vk.openvk.component.video.api.Qhi.InterfaceC0062Qhi
        public void Qhi(com.bykv.vk.openvk.component.video.api.Qhi qhi, com.bykv.vk.openvk.component.video.api.ac.Qhi qhi2) {
            for (cJ cJVar : ac.this.Qhi) {
                cJVar.Qhi(qhi, qhi2);
            }
        }

        @Override // com.bykv.vk.openvk.component.video.api.Qhi.InterfaceC0062Qhi
        public void Qhi(com.bykv.vk.openvk.component.video.api.Qhi qhi, boolean z10) {
            for (cJ cJVar : ac.this.Qhi) {
                cJVar.Qhi(qhi, z10);
            }
        }

        @Override // com.bykv.vk.openvk.component.video.api.Qhi.InterfaceC0062Qhi
        public void Qhi(com.bykv.vk.openvk.component.video.api.Qhi qhi, int i10, int i11) {
            for (cJ cJVar : ac.this.Qhi) {
                cJVar.Qhi(qhi, i10, i11);
            }
        }

        @Override // com.bykv.vk.openvk.component.video.api.Qhi.InterfaceC0062Qhi
        public void Qhi(com.bykv.vk.openvk.component.video.api.Qhi qhi, int i10, int i11, int i12) {
            for (cJ cJVar : ac.this.Qhi) {
                cJVar.Qhi(qhi, i10, i11, i12);
            }
        }

        @Override // com.bykv.vk.openvk.component.video.api.Qhi.InterfaceC0062Qhi
        public void Qhi(com.bykv.vk.openvk.component.video.api.Qhi qhi, int i10) {
            for (cJ cJVar : ac.this.Qhi) {
                cJVar.Qhi(qhi, i10);
            }
        }

        @Override // com.bykv.vk.openvk.component.video.api.Qhi.InterfaceC0062Qhi
        public void Qhi(com.bykv.vk.openvk.component.video.api.Qhi qhi, long j10, long j11) {
            for (cJ cJVar : ac.this.Qhi) {
                cJVar.Qhi(qhi, j10, j11);
            }
        }
    }

    @Override // com.bykv.vk.openvk.component.video.Qhi.CJ.HzH
    public void Qhi(Qhi.InterfaceC0062Qhi interfaceC0062Qhi) {
        if (interfaceC0062Qhi instanceof cJ) {
            if (this.Qhi.contains(interfaceC0062Qhi)) {
                return;
            }
            this.Qhi.add((cJ) interfaceC0062Qhi);
            return;
        }
        super.Qhi(interfaceC0062Qhi);
    }

    public void ac(int i10) {
        this.cJ = Math.max(1, i10);
    }
}
