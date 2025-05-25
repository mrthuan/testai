package com.bytedance.adsdk.lottie.Qhi.Qhi;

import com.bytedance.adsdk.lottie.Qhi.cJ.Qhi;
import com.bytedance.adsdk.lottie.ac.cJ.MQ;
import java.util.ArrayList;
import java.util.List;

/* compiled from: TrimPathContent.java */
/* loaded from: classes.dex */
public class EBS implements ac, Qhi.InterfaceC0071Qhi {
    private final MQ.Qhi CJ;
    private final String Qhi;
    private final com.bytedance.adsdk.lottie.Qhi.cJ.Qhi<?, Float> ROR;
    private final com.bytedance.adsdk.lottie.Qhi.cJ.Qhi<?, Float> Tgh;

    /* renamed from: ac  reason: collision with root package name */
    private final List<Qhi.InterfaceC0071Qhi> f7703ac = new ArrayList();
    private final boolean cJ;

    /* renamed from: fl  reason: collision with root package name */
    private final com.bytedance.adsdk.lottie.Qhi.cJ.Qhi<?, Float> f7704fl;

    public EBS(com.bytedance.adsdk.lottie.ac.ac.Qhi qhi, com.bytedance.adsdk.lottie.ac.cJ.MQ mq) {
        this.Qhi = mq.Qhi();
        this.cJ = mq.Tgh();
        this.CJ = mq.cJ();
        com.bytedance.adsdk.lottie.Qhi.cJ.Qhi<Float, Float> Qhi = mq.CJ().Qhi();
        this.f7704fl = Qhi;
        com.bytedance.adsdk.lottie.Qhi.cJ.Qhi<Float, Float> Qhi2 = mq.ac().Qhi();
        this.Tgh = Qhi2;
        com.bytedance.adsdk.lottie.Qhi.cJ.Qhi<Float, Float> Qhi3 = mq.fl().Qhi();
        this.ROR = Qhi3;
        qhi.Qhi(Qhi);
        qhi.Qhi(Qhi2);
        qhi.Qhi(Qhi3);
        Qhi.Qhi(this);
        Qhi2.Qhi(this);
        Qhi3.Qhi(this);
    }

    public com.bytedance.adsdk.lottie.Qhi.cJ.Qhi<?, Float> CJ() {
        return this.Tgh;
    }

    @Override // com.bytedance.adsdk.lottie.Qhi.Qhi.ac
    public void Qhi(List<ac> list, List<ac> list2) {
    }

    public boolean Tgh() {
        return this.cJ;
    }

    public com.bytedance.adsdk.lottie.Qhi.cJ.Qhi<?, Float> ac() {
        return this.f7704fl;
    }

    public MQ.Qhi cJ() {
        return this.CJ;
    }

    public com.bytedance.adsdk.lottie.Qhi.cJ.Qhi<?, Float> fl() {
        return this.ROR;
    }

    @Override // com.bytedance.adsdk.lottie.Qhi.cJ.Qhi.InterfaceC0071Qhi
    public void Qhi() {
        for (int i10 = 0; i10 < this.f7703ac.size(); i10++) {
            this.f7703ac.get(i10).Qhi();
        }
    }

    public void Qhi(Qhi.InterfaceC0071Qhi interfaceC0071Qhi) {
        this.f7703ac.add(interfaceC0071Qhi);
    }
}
