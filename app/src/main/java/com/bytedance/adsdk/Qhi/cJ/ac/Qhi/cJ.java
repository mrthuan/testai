package com.bytedance.adsdk.Qhi.cJ.ac.Qhi;

import com.bytedance.adsdk.Qhi.cJ.cJ.Qhi.qMt;
import java.util.Deque;

/* compiled from: ConstantStringParser.java */
/* loaded from: classes.dex */
public class cJ extends ROR {
    @Override // com.bytedance.adsdk.Qhi.cJ.ac.Qhi.ROR
    public int Qhi(String str, int i10, Deque<com.bytedance.adsdk.Qhi.cJ.cJ.Qhi> deque, com.bytedance.adsdk.Qhi.cJ.ac.Qhi qhi) {
        if ('\'' != Qhi(i10, str)) {
            return qhi.Qhi(str, i10, deque);
        }
        int i11 = i10 + 1;
        int length = str.length();
        int i12 = i11;
        while (i12 < length && Qhi(i12, str) != '\'') {
            i12++;
        }
        if (Qhi(i12, str) == '\'') {
            deque.push(new qMt(str.substring(i11, i12)));
            return i12 + 1;
        }
        throw new com.bytedance.adsdk.Qhi.Qhi.Qhi("String expression not surrounded by '", str.substring(i11 - 1));
    }
}
