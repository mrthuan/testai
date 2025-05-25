package com.bytedance.adsdk.lottie.Qhi.Qhi;

import android.graphics.Path;
import com.bytedance.adsdk.lottie.Qhi.cJ.Qhi;
import com.bytedance.adsdk.lottie.ac.cJ.MQ;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ShapeContent.java */
/* loaded from: classes.dex */
public class tP implements iMK, Qhi.InterfaceC0071Qhi {
    private final com.bytedance.adsdk.lottie.hm CJ;
    private final Path Qhi = new Path();
    private final cJ ROR = new cJ();
    private boolean Tgh;

    /* renamed from: ac  reason: collision with root package name */
    private final boolean f7737ac;
    private final String cJ;

    /* renamed from: fl  reason: collision with root package name */
    private final com.bytedance.adsdk.lottie.Qhi.cJ.iMK f7738fl;

    public tP(com.bytedance.adsdk.lottie.hm hmVar, com.bytedance.adsdk.lottie.ac.ac.Qhi qhi, com.bytedance.adsdk.lottie.ac.cJ.kYc kyc) {
        this.cJ = kyc.Qhi();
        this.f7737ac = kyc.ac();
        this.CJ = hmVar;
        com.bytedance.adsdk.lottie.Qhi.cJ.iMK Qhi = kyc.cJ().Qhi();
        this.f7738fl = Qhi;
        qhi.Qhi(Qhi);
        Qhi.Qhi(this);
    }

    private void cJ() {
        this.Tgh = false;
        this.CJ.invalidateSelf();
    }

    @Override // com.bytedance.adsdk.lottie.Qhi.Qhi.iMK
    public Path CJ() {
        if (this.Tgh) {
            return this.Qhi;
        }
        this.Qhi.reset();
        if (this.f7737ac) {
            this.Tgh = true;
            return this.Qhi;
        }
        Path ROR = this.f7738fl.ROR();
        if (ROR == null) {
            return this.Qhi;
        }
        this.Qhi.set(ROR);
        this.Qhi.setFillType(Path.FillType.EVEN_ODD);
        this.ROR.Qhi(this.Qhi);
        this.Tgh = true;
        return this.Qhi;
    }

    @Override // com.bytedance.adsdk.lottie.Qhi.cJ.Qhi.InterfaceC0071Qhi
    public void Qhi() {
        cJ();
    }

    @Override // com.bytedance.adsdk.lottie.Qhi.Qhi.ac
    public void Qhi(List<ac> list, List<ac> list2) {
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < list.size(); i10++) {
            ac acVar = list.get(i10);
            if (acVar instanceof EBS) {
                EBS ebs = (EBS) acVar;
                if (ebs.cJ() == MQ.Qhi.SIMULTANEOUSLY) {
                    this.ROR.Qhi(ebs);
                    ebs.Qhi(this);
                }
            }
            if (acVar instanceof MQ) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add((MQ) acVar);
            }
        }
        this.f7738fl.Qhi((List<MQ>) arrayList);
    }
}
