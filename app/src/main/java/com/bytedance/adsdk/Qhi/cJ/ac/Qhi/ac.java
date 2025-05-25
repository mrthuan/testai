package com.bytedance.adsdk.Qhi.cJ.ac.Qhi;

import com.bytedance.adsdk.Qhi.cJ.cJ.Qhi.bxS;
import java.util.Deque;

/* compiled from: IdentifierParser.java */
/* loaded from: classes.dex */
public class ac extends ROR {
    @Override // com.bytedance.adsdk.Qhi.cJ.ac.Qhi.ROR
    public int Qhi(String str, int i10, Deque<com.bytedance.adsdk.Qhi.cJ.cJ.Qhi> deque, com.bytedance.adsdk.Qhi.cJ.ac.Qhi qhi) {
        if (!com.bytedance.adsdk.Qhi.cJ.fl.Qhi.cJ(Qhi(i10, str))) {
            return qhi.Qhi(str, i10, deque);
        }
        return Qhi(str, i10, deque);
    }

    private int Qhi(String str, int i10, Deque<com.bytedance.adsdk.Qhi.cJ.cJ.Qhi> deque) {
        int i11;
        int i12 = 0;
        while (true) {
            i11 = i12 + i10;
            char Qhi = Qhi(i11, str);
            if (!com.bytedance.adsdk.Qhi.cJ.fl.Qhi.cJ(Qhi) && !com.bytedance.adsdk.Qhi.cJ.fl.Qhi.ac(Qhi) && '.' != Qhi && '[' != Qhi && ']' != Qhi && '_' != Qhi && '-' != Qhi) {
                break;
            }
            i12++;
        }
        String substring = str.substring(i10, i11);
        if (com.bytedance.adsdk.Qhi.cJ.CJ.ac.Qhi(substring) != null) {
            deque.push(new com.bytedance.adsdk.Qhi.cJ.cJ.Qhi.Sf(substring));
        } else {
            deque.push(new bxS(substring));
        }
        return i11;
    }
}
