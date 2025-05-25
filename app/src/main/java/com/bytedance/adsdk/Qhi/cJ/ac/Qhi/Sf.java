package com.bytedance.adsdk.Qhi.cJ.ac.Qhi;

import com.bytedance.adsdk.Qhi.cJ.cJ.Qhi.hpZ;
import java.util.Deque;

/* compiled from: NumberParser.java */
/* loaded from: classes.dex */
public class Sf extends ROR {
    private boolean Qhi(String str, int i10, Deque<com.bytedance.adsdk.Qhi.cJ.cJ.Qhi> deque) {
        if ('-' == Qhi(i10, str)) {
            if (deque.peek() == null || com.bytedance.adsdk.Qhi.cJ.CJ.Tgh.Qhi(deque.peek().Qhi())) {
                if (com.bytedance.adsdk.Qhi.cJ.fl.Qhi.ac(Qhi(i10 + 1, str))) {
                    return true;
                }
                throw new IllegalArgumentException("Unrecognized - symbol, not a negative number or operator, problem range:" + str.substring(0, i10));
            }
            return false;
        }
        return com.bytedance.adsdk.Qhi.cJ.fl.Qhi.ac(Qhi(i10, str));
    }

    @Override // com.bytedance.adsdk.Qhi.cJ.ac.Qhi.ROR
    public int Qhi(String str, int i10, Deque<com.bytedance.adsdk.Qhi.cJ.cJ.Qhi> deque, com.bytedance.adsdk.Qhi.cJ.ac.Qhi qhi) {
        char Qhi;
        if (!Qhi(str, i10, deque)) {
            return qhi.Qhi(str, i10, deque);
        }
        int i11 = Qhi(i10, str) == '-' ? i10 + 1 : i10;
        boolean z10 = false;
        while (true) {
            Qhi = Qhi(i11, str);
            if (com.bytedance.adsdk.Qhi.cJ.fl.Qhi.ac(Qhi) || (!z10 && Qhi == '.')) {
                i11++;
                if (Qhi == '.') {
                    z10 = true;
                }
            }
        }
        if (Qhi != '.') {
            deque.push(new hpZ(str.substring(i10, i11)));
            return i11;
        }
        throw new IllegalArgumentException("Illegal negative number format, problem interval:" + str.substring(i10, i11));
    }
}
