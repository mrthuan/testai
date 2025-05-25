package com.bytedance.adsdk.Qhi.cJ.ac.Qhi;

import java.util.Deque;

/* compiled from: MethodParser.java */
/* loaded from: classes.dex */
public class Tgh extends ROR {
    @Override // com.bytedance.adsdk.Qhi.cJ.ac.Qhi.ROR
    public int Qhi(String str, int i10, Deque<com.bytedance.adsdk.Qhi.cJ.cJ.Qhi> deque, com.bytedance.adsdk.Qhi.cJ.ac.Qhi qhi) {
        char Qhi;
        int i11 = i10;
        while (true) {
            Qhi = Qhi(i11, str);
            if (!com.bytedance.adsdk.Qhi.cJ.fl.Qhi.cJ(Qhi) && !com.bytedance.adsdk.Qhi.cJ.fl.Qhi.ac(Qhi)) {
                break;
            }
            i11++;
        }
        if (Qhi != '(') {
            return qhi.Qhi(str, i10, deque);
        }
        deque.push(new com.bytedance.adsdk.Qhi.cJ.cJ.Qhi.Gm(str.substring(i10, i11)));
        return i11 + 1;
    }
}
