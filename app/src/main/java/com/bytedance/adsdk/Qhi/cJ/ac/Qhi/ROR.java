package com.bytedance.adsdk.Qhi.cJ.ac.Qhi;

import java.util.Deque;

/* compiled from: NodeParser.java */
/* loaded from: classes.dex */
public abstract class ROR {
    public char Qhi(int i10, String str) {
        if (i10 >= str.length()) {
            return (char) 26;
        }
        return str.charAt(i10);
    }

    public abstract int Qhi(String str, int i10, Deque<com.bytedance.adsdk.Qhi.cJ.cJ.Qhi> deque, com.bytedance.adsdk.Qhi.cJ.ac.Qhi qhi);

    public int cJ(int i10, String str) {
        while (com.bytedance.adsdk.Qhi.cJ.fl.Qhi.Qhi(Qhi(i10, str))) {
            i10++;
        }
        return i10;
    }
}
