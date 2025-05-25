package com.bytedance.adsdk.lottie.Qhi.Qhi;

import android.graphics.PointF;
import androidx.activity.r;
import com.bytedance.adsdk.lottie.Qhi.cJ.Qhi;
import java.util.ArrayList;
import java.util.List;

/* compiled from: RoundedCornersContent.java */
/* loaded from: classes.dex */
public class kYc implements MQ, Qhi.InterfaceC0071Qhi {
    private com.bytedance.adsdk.lottie.ac.cJ.pA CJ;
    private final com.bytedance.adsdk.lottie.hm Qhi;

    /* renamed from: ac  reason: collision with root package name */
    private final com.bytedance.adsdk.lottie.Qhi.cJ.Qhi<Float, Float> f7731ac;
    private final String cJ;

    public kYc(com.bytedance.adsdk.lottie.hm hmVar, com.bytedance.adsdk.lottie.ac.ac.Qhi qhi, com.bytedance.adsdk.lottie.ac.cJ.iMK imk) {
        this.Qhi = hmVar;
        this.cJ = imk.Qhi();
        com.bytedance.adsdk.lottie.Qhi.cJ.Qhi<Float, Float> Qhi = imk.cJ().Qhi();
        this.f7731ac = Qhi;
        qhi.Qhi(Qhi);
        Qhi.Qhi(this);
    }

    @Override // com.bytedance.adsdk.lottie.Qhi.Qhi.ac
    public void Qhi(List<ac> list, List<ac> list2) {
    }

    public com.bytedance.adsdk.lottie.Qhi.cJ.Qhi<Float, Float> cJ() {
        return this.f7731ac;
    }

    private com.bytedance.adsdk.lottie.ac.cJ.pA cJ(com.bytedance.adsdk.lottie.ac.cJ.pA pAVar) {
        List<com.bytedance.adsdk.lottie.ac.Qhi> ac2 = pAVar.ac();
        boolean cJ = pAVar.cJ();
        int size = ac2.size() - 1;
        int i10 = 0;
        while (size >= 0) {
            com.bytedance.adsdk.lottie.ac.Qhi qhi = ac2.get(size);
            com.bytedance.adsdk.lottie.ac.Qhi qhi2 = ac2.get(Qhi(size - 1, ac2.size()));
            PointF ac3 = (size != 0 || cJ) ? qhi2.ac() : pAVar.Qhi();
            i10 = (((size != 0 || cJ) ? qhi2.cJ() : ac3).equals(ac3) && qhi.Qhi().equals(ac3) && !(!pAVar.cJ() && size == 0 && size == ac2.size() - 1)) ? i10 + 2 : i10 + 1;
            size--;
        }
        com.bytedance.adsdk.lottie.ac.cJ.pA pAVar2 = this.CJ;
        if (pAVar2 == null || pAVar2.ac().size() != i10) {
            ArrayList arrayList = new ArrayList(i10);
            for (int i11 = 0; i11 < i10; i11++) {
                arrayList.add(new com.bytedance.adsdk.lottie.ac.Qhi());
            }
            this.CJ = new com.bytedance.adsdk.lottie.ac.cJ.pA(new PointF(0.0f, 0.0f), false, arrayList);
        }
        this.CJ.Qhi(cJ);
        return this.CJ;
    }

    @Override // com.bytedance.adsdk.lottie.Qhi.cJ.Qhi.InterfaceC0071Qhi
    public void Qhi() {
        this.Qhi.invalidateSelf();
    }

    @Override // com.bytedance.adsdk.lottie.Qhi.Qhi.MQ
    public com.bytedance.adsdk.lottie.ac.cJ.pA Qhi(com.bytedance.adsdk.lottie.ac.cJ.pA pAVar) {
        List<com.bytedance.adsdk.lottie.ac.Qhi> list;
        List<com.bytedance.adsdk.lottie.ac.Qhi> ac2 = pAVar.ac();
        if (ac2.size() <= 2) {
            return pAVar;
        }
        float floatValue = this.f7731ac.ROR().floatValue();
        if (floatValue == 0.0f) {
            return pAVar;
        }
        com.bytedance.adsdk.lottie.ac.cJ.pA cJ = cJ(pAVar);
        cJ.Qhi(pAVar.Qhi().x, pAVar.Qhi().y);
        List<com.bytedance.adsdk.lottie.ac.Qhi> ac3 = cJ.ac();
        boolean cJ2 = pAVar.cJ();
        int i10 = 0;
        int i11 = 0;
        while (i10 < ac2.size()) {
            com.bytedance.adsdk.lottie.ac.Qhi qhi = ac2.get(i10);
            com.bytedance.adsdk.lottie.ac.Qhi qhi2 = ac2.get(Qhi(i10 - 1, ac2.size()));
            com.bytedance.adsdk.lottie.ac.Qhi qhi3 = ac2.get(Qhi(i10 - 2, ac2.size()));
            PointF ac4 = (i10 != 0 || cJ2) ? qhi2.ac() : pAVar.Qhi();
            PointF cJ3 = (i10 != 0 || cJ2) ? qhi2.cJ() : ac4;
            PointF Qhi = qhi.Qhi();
            PointF ac5 = qhi3.ac();
            PointF ac6 = qhi.ac();
            boolean z10 = true;
            z10 = (!pAVar.cJ() && i10 == 0 && i10 == ac2.size() + (-1)) ? false : false;
            if (cJ3.equals(ac4) && Qhi.equals(ac4) && !z10) {
                float f10 = ac4.x;
                float f11 = f10 - ac5.x;
                float f12 = ac4.y;
                float f13 = f12 - ac5.y;
                float f14 = ac6.x - f10;
                float f15 = ac6.y - f12;
                list = ac2;
                float min = Math.min(floatValue / ((float) Math.hypot(f11, f13)), 0.5f);
                float min2 = Math.min(floatValue / ((float) Math.hypot(f14, f15)), 0.5f);
                float f16 = ac4.x;
                float l10 = r.l(ac5.x, f16, min, f16);
                float f17 = ac4.y;
                float l11 = r.l(ac5.y, f17, min, f17);
                float l12 = r.l(ac6.x, f16, min2, f16);
                float l13 = r.l(ac6.y, f17, min2, f17);
                float f18 = l10 - ((l10 - f16) * 0.5519f);
                float f19 = l11 - ((l11 - f17) * 0.5519f);
                float f20 = l12 - ((l12 - f16) * 0.5519f);
                float f21 = l13 - ((l13 - f17) * 0.5519f);
                com.bytedance.adsdk.lottie.ac.Qhi qhi4 = ac3.get(Qhi(i11 - 1, ac3.size()));
                com.bytedance.adsdk.lottie.ac.Qhi qhi5 = ac3.get(i11);
                qhi4.cJ(l10, l11);
                qhi4.ac(l10, l11);
                if (i10 == 0) {
                    cJ.Qhi(l10, l11);
                }
                qhi5.Qhi(f18, f19);
                i11++;
                qhi5.cJ(f20, f21);
                qhi5.ac(l12, l13);
                ac3.get(i11).Qhi(l12, l13);
            } else {
                list = ac2;
                com.bytedance.adsdk.lottie.ac.Qhi qhi6 = ac3.get(Qhi(i11 - 1, ac3.size()));
                qhi6.cJ(qhi2.cJ().x, qhi2.cJ().y);
                qhi6.ac(qhi2.ac().x, qhi2.ac().y);
                ac3.get(i11).Qhi(qhi.Qhi().x, qhi.Qhi().y);
            }
            i11++;
            i10++;
            ac2 = list;
        }
        return cJ;
    }

    private static int cJ(int i10, int i11) {
        int i12 = i10 / i11;
        return ((i10 ^ i11) >= 0 || i11 * i12 == i10) ? i12 : i12 - 1;
    }

    private static int Qhi(int i10, int i11) {
        return i10 - (cJ(i10, i11) * i11);
    }
}
