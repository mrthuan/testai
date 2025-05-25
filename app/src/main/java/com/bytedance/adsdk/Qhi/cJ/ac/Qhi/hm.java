package com.bytedance.adsdk.Qhi.cJ.ac.Qhi;

import b.a;
import com.bytedance.adsdk.Qhi.cJ.cJ.Qhi.HzH;
import java.util.Deque;

/* compiled from: OperatorParser.java */
/* loaded from: classes.dex */
public class hm extends ROR {
    @Override // com.bytedance.adsdk.Qhi.cJ.ac.Qhi.ROR
    public int Qhi(String str, int i10, Deque<com.bytedance.adsdk.Qhi.cJ.cJ.Qhi> deque, com.bytedance.adsdk.Qhi.cJ.ac.Qhi qhi) {
        if (!com.bytedance.adsdk.Qhi.cJ.fl.Qhi.CJ(Qhi(i10, str))) {
            return qhi.Qhi(str, i10, deque);
        }
        int i11 = i10 + 1;
        String str2 = new String(new char[]{Qhi(i10, str), Qhi(i11, str)});
        if (com.bytedance.adsdk.Qhi.cJ.CJ.Tgh.Qhi(str2) != null) {
            deque.push(new HzH(com.bytedance.adsdk.Qhi.cJ.CJ.Tgh.Qhi(str2)));
            return i10 + 2;
        }
        String valueOf = String.valueOf(Qhi(i10, str));
        if (com.bytedance.adsdk.Qhi.cJ.CJ.Tgh.Qhi(valueOf) != null) {
            deque.push(new HzH(com.bytedance.adsdk.Qhi.cJ.CJ.Tgh.Qhi(valueOf)));
            return i11;
        }
        StringBuilder g10 = a.g("Unrecognized:", valueOf, "examine:");
        g10.append(str.substring(0, i10));
        throw new IllegalArgumentException(g10.toString());
    }
}
