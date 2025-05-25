package com.bytedance.sdk.component.adexpress.dynamic.CJ;

import com.bytedance.sdk.component.adexpress.dynamic.CJ.ac;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: FlexComputeRuler.java */
/* loaded from: classes.dex */
public class zc {
    public static float Qhi(float f10) {
        return (float) Math.ceil((f10 * 16.0f) / 16.0f);
    }

    public static List<ac.Qhi> Qhi(float f10, List<ac.Qhi> list) {
        ArrayList arrayList = new ArrayList();
        for (ac.Qhi qhi : list) {
            arrayList.add((ac.Qhi) qhi.clone());
        }
        Iterator it = arrayList.iterator();
        boolean z10 = true;
        int i10 = 0;
        int i11 = 0;
        while (it.hasNext()) {
            ac.Qhi qhi2 = (ac.Qhi) it.next();
            if (qhi2.cJ) {
                i10 = (int) (i10 + qhi2.Qhi);
            } else {
                i11 = (int) (i11 + qhi2.Qhi);
                z10 = false;
            }
        }
        if (!z10 || f10 <= i10) {
            float f11 = i10;
            int i12 = (f10 > f11 ? 1 : (f10 == f11 ? 0 : -1));
            float f12 = i12 < 0 ? f10 / f11 : 1.0f;
            int i13 = (f10 > f11 ? 1 : (f10 == f11 ? 0 : -1));
            float f13 = i13 > 0 ? (f10 - f11) / i11 : 0.0f;
            if (f13 > 1.0f) {
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = arrayList.iterator();
                boolean z11 = false;
                while (it2.hasNext()) {
                    ac.Qhi qhi3 = (ac.Qhi) it2.next();
                    if (!qhi3.cJ) {
                        float f14 = qhi3.f8164ac;
                        if (f14 != 0.0f && qhi3.Qhi * f13 > f14) {
                            qhi3.Qhi = f14;
                            qhi3.cJ = true;
                            z11 = true;
                        }
                    }
                    arrayList2.add(qhi3);
                }
                if (z11) {
                    return Qhi(f10, arrayList2);
                }
            }
            Iterator it3 = arrayList.iterator();
            int i14 = 0;
            while (it3.hasNext()) {
                ac.Qhi qhi4 = (ac.Qhi) it3.next();
                if (qhi4.cJ) {
                    qhi4.Qhi = Qhi(qhi4.Qhi * f12);
                } else {
                    qhi4.Qhi = Qhi(qhi4.Qhi * f13);
                }
                i14 = (int) (i14 + qhi4.Qhi);
            }
            float f15 = i14;
            if (f15 < f10) {
                float f16 = f10 - f15;
                for (int i15 = 0; i15 < arrayList.size() && f16 > 0.0f; i15 = (i15 + 1) % arrayList.size()) {
                    ac.Qhi qhi5 = (ac.Qhi) arrayList.get(i15);
                    if ((i12 < 0 && qhi5.cJ) || (i13 > 0 && !qhi5.cJ)) {
                        qhi5.Qhi += 0.0625f;
                        f16 -= 0.0625f;
                    }
                }
            }
            return arrayList;
        }
        return arrayList;
    }
}
