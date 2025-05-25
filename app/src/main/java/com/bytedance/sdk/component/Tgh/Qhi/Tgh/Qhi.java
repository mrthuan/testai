package com.bytedance.sdk.component.Tgh.Qhi.Tgh;

import com.bytedance.sdk.component.Tgh.Qhi.hm;

/* compiled from: MyTrack.java */
/* loaded from: classes.dex */
public class Qhi {
    private static volatile cJ Qhi;

    public static cJ Qhi() {
        if (Qhi == null) {
            synchronized (cJ.class) {
                if (Qhi == null) {
                    Qhi = new ac(hm.ROR().Tgh(), new ROR(hm.ROR().Tgh()));
                }
            }
        }
        return Qhi;
    }
}
