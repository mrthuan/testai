package com.bytedance.sdk.openadsdk.dislike;

import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.core.HzH;
import com.bytedance.sdk.openadsdk.core.tP;
import java.util.List;

/* compiled from: DislikeDispatcher.java */
/* loaded from: classes.dex */
public class Qhi {
    private static volatile Qhi Qhi;
    private final tP<com.bytedance.sdk.openadsdk.cJ.Qhi> cJ = HzH.ac();

    private Qhi() {
    }

    public static Qhi Qhi() {
        if (Qhi == null) {
            synchronized (Qhi.class) {
                if (Qhi == null) {
                    Qhi = new Qhi();
                }
            }
        }
        return Qhi;
    }

    public void Qhi(String str, List<FilterWord> list, String str2) {
        Qhi(str, list, null, null, str2);
    }

    public void Qhi(String str, List<FilterWord> list, String str2, String str3, String str4) {
        this.cJ.Qhi(str, list, str2, str3, str4);
    }
}
