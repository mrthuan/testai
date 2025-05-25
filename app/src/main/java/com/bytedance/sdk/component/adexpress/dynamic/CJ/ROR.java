package com.bytedance.sdk.component.adexpress.dynamic.CJ;

import a0.a;
import android.text.TextUtils;
import com.bytedance.sdk.component.adexpress.cJ.iMK;
import com.bytedance.sdk.component.adexpress.dynamic.CJ.ac;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.PDLayoutAttributeObject;
import java.util.List;

/* compiled from: DynamicCanvas.java */
/* loaded from: classes.dex */
public class ROR {
    private Qhi CJ;
    public com.bytedance.sdk.component.adexpress.dynamic.ac.cJ Qhi;

    /* renamed from: ac  reason: collision with root package name */
    private com.bytedance.sdk.component.adexpress.dynamic.ac.hm f8156ac;
    protected ac cJ;

    /* compiled from: DynamicCanvas.java */
    /* loaded from: classes.dex */
    public static class Qhi {
        float Qhi;

        /* renamed from: ac  reason: collision with root package name */
        float f8157ac;
        float cJ;
    }

    public ROR(double d10, int i10, double d11, String str, iMK imk) {
        this.cJ = new ac(d10, i10, d11, str, imk);
    }

    public void Qhi(Qhi qhi) {
        this.CJ = qhi;
    }

    public void Qhi() {
        this.cJ.Qhi();
    }

    public void Qhi(com.bytedance.sdk.component.adexpress.dynamic.ac.hm hmVar, float f10, float f11) {
        if (hmVar != null) {
            this.f8156ac = hmVar;
        }
        com.bytedance.sdk.component.adexpress.dynamic.ac.hm hmVar2 = this.f8156ac;
        float Sf = hmVar2.Sf();
        float hm2 = hmVar2.hm();
        float f12 = TextUtils.equals(hmVar2.WAv().fl().Eh(), "fixed") ? hm2 : 65536.0f;
        this.cJ.Qhi();
        this.cJ.ac(hmVar2, Sf, f12);
        ac.C0086ac Qhi2 = this.cJ.Qhi(hmVar2);
        com.bytedance.sdk.component.adexpress.dynamic.ac.cJ cJVar = new com.bytedance.sdk.component.adexpress.dynamic.ac.cJ();
        cJVar.Qhi = f10;
        cJVar.cJ = f11;
        if (Qhi2 != null) {
            Sf = Qhi2.Qhi;
        }
        cJVar.f8190ac = Sf;
        if (Qhi2 != null) {
            hm2 = Qhi2.cJ;
        }
        cJVar.CJ = hm2;
        cJVar.f8191fl = "root";
        cJVar.f8192hm = 1280.0f;
        cJVar.Tgh = hmVar2;
        hmVar2.ac(f10);
        cJVar.Tgh.CJ(cJVar.cJ);
        cJVar.Tgh.fl(cJVar.f8190ac);
        cJVar.Tgh.Tgh(cJVar.CJ);
        com.bytedance.sdk.component.adexpress.dynamic.ac.cJ Qhi3 = Qhi(cJVar, 0.0f);
        this.Qhi = Qhi3;
        Qhi(Qhi3);
    }

    public void Qhi(com.bytedance.sdk.component.adexpress.dynamic.ac.cJ cJVar) {
        if (cJVar == null) {
            return;
        }
        cJVar.Tgh.WAv().cJ();
        List<List<com.bytedance.sdk.component.adexpress.dynamic.ac.cJ>> list = cJVar.ROR;
        if (list == null || list.size() <= 0) {
            return;
        }
        for (List<com.bytedance.sdk.component.adexpress.dynamic.ac.cJ> list2 : list) {
            if (list2 != null && list2.size() > 0) {
                for (com.bytedance.sdk.component.adexpress.dynamic.ac.cJ cJVar2 : list2) {
                    Qhi(cJVar2);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.bytedance.sdk.component.adexpress.dynamic.ac.cJ Qhi(com.bytedance.sdk.component.adexpress.dynamic.ac.cJ r37, float r38) {
        /*
            Method dump skipped, instructions count: 998
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.adexpress.dynamic.CJ.ROR.Qhi(com.bytedance.sdk.component.adexpress.dynamic.ac.cJ, float):com.bytedance.sdk.component.adexpress.dynamic.ac.cJ");
    }

    private com.bytedance.sdk.component.adexpress.dynamic.ac.WAv Qhi(com.bytedance.sdk.component.adexpress.dynamic.ac.ROR ror, ac.C0086ac c0086ac, ac.C0086ac c0086ac2) {
        float PER = ror.PER();
        float et = ror.et();
        float Gy = ror.Gy();
        float SL = ror.SL();
        boolean ots = ror.ots();
        boolean HLI = ror.HLI();
        boolean oU = ror.oU();
        boolean pv = ror.pv();
        if (!ots) {
            if (HLI) {
                float f10 = this.CJ.Qhi;
                PER = ((f10 != 0.0f ? Math.min(f10, c0086ac.Qhi) : c0086ac.Qhi) - Gy) - c0086ac2.Qhi;
            } else {
                PER = 0.0f;
            }
        }
        if (!oU) {
            if (pv) {
                float f11 = this.CJ.cJ;
                if (f11 == 0.0f) {
                    f11 = c0086ac.cJ;
                }
                et = (f11 - SL) - c0086ac2.cJ;
            } else {
                et = 0.0f;
            }
        }
        return new com.bytedance.sdk.component.adexpress.dynamic.ac.WAv(PER, et);
    }

    private com.bytedance.sdk.component.adexpress.dynamic.ac.WAv Qhi(com.bytedance.sdk.component.adexpress.dynamic.ac.cJ cJVar, com.bytedance.sdk.component.adexpress.dynamic.ac.ROR ror, float f10, float f11) {
        float f12;
        float f13;
        float f14;
        float f15 = cJVar.Qhi;
        float f16 = cJVar.cJ;
        float PER = ror.PER();
        float et = ror.et();
        float Gy = ror.Gy();
        float SL = ror.SL();
        boolean ots = ror.ots();
        boolean HLI = ror.HLI();
        boolean oU = ror.oU();
        boolean pv = ror.pv();
        String zjb = ror.zjb();
        float f17 = cJVar.f8190ac;
        float f18 = cJVar.CJ;
        if (TextUtils.equals(zjb, PDLayoutAttributeObject.GLYPH_ORIENTATION_VERTICAL_ZERO_DEGREES)) {
            if (ots) {
                f12 = cJVar.Qhi + PER;
            } else {
                f12 = HLI ? ((cJVar.Qhi + f17) - Gy) - f10 : f15;
            }
            if (oU) {
                f14 = cJVar.cJ;
                f16 = f14 + et;
            } else if (pv) {
                f13 = cJVar.cJ;
                f16 = ((f13 + f18) - SL) - f11;
            }
        } else {
            if (TextUtils.equals(zjb, "1")) {
                f12 = a.m(f17, f10, 2.0f, cJVar.Qhi);
                if (oU) {
                    f14 = cJVar.cJ;
                    f16 = f14 + et;
                } else if (pv) {
                    f13 = cJVar.cJ;
                    f16 = ((f13 + f18) - SL) - f11;
                }
            } else if (TextUtils.equals(zjb, "2")) {
                f16 = a.m(f18, f11, 2.0f, cJVar.cJ);
                if (ots) {
                    f12 = cJVar.Qhi + PER;
                } else {
                    f12 = HLI ? ((cJVar.Qhi + f17) - Gy) - f10 : f15;
                }
            } else if (TextUtils.equals(zjb, "3")) {
                f12 = a.m(f17, f10, 2.0f, cJVar.Qhi);
                f16 = a.m(f18, f11, 2.0f, cJVar.cJ);
            } else {
                f12 = f15;
            }
            f16 = f16;
        }
        return new com.bytedance.sdk.component.adexpress.dynamic.ac.WAv(f12, f16);
    }
}
