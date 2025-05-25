package com.bytedance.sdk.component.fl.CJ;

import com.bytedance.sdk.component.fl.ac.ac;
import com.bytedance.sdk.component.fl.ac.ac.Qhi;

/* compiled from: BytesVisitor.java */
/* loaded from: classes.dex */
public class Sf implements pA {
    private byte[] Qhi;
    private com.bytedance.sdk.component.fl.ROR cJ;

    public Sf(byte[] bArr, com.bytedance.sdk.component.fl.ROR ror) {
        this.Qhi = bArr;
        this.cJ = ror;
    }

    @Override // com.bytedance.sdk.component.fl.CJ.pA
    public String Qhi() {
        return "image_type";
    }

    @Override // com.bytedance.sdk.component.fl.CJ.pA
    public void Qhi(ac acVar) {
        pA imk;
        int zc2 = acVar.zc();
        acVar.Qhi(this.Qhi.length);
        if (zc2 != 2) {
            if (zc2 != 3) {
                boolean cJ = Qhi.cJ(this.Qhi);
                if (cJ) {
                    imk = new tP(this.Qhi, this.cJ, cJ);
                } else if (Qhi.Qhi(this.Qhi)) {
                    imk = new Gm(this.Qhi, this.cJ);
                } else {
                    imk = new tP(this.Qhi, this.cJ, cJ);
                }
            } else {
                byte[] bArr = this.Qhi;
                imk = new tP(bArr, this.cJ, Qhi.cJ(bArr));
            }
        } else if (Qhi.Qhi(this.Qhi)) {
            imk = new Gm(this.Qhi, this.cJ);
        } else if (this.cJ == null) {
            imk = new HzH();
        } else {
            imk = new iMK(1001, "not image format", null);
        }
        acVar.Qhi(imk);
    }
}
