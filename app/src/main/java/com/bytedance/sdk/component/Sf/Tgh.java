package com.bytedance.sdk.component.Sf;

/* compiled from: TTBaseExecutor.java */
/* loaded from: classes.dex */
public class Tgh {
    private static Gm Qhi = new Gm() { // from class: com.bytedance.sdk.component.Sf.Tgh.1
        @Override // com.bytedance.sdk.component.Sf.Gm
        public WAv createThreadFactory(int i10, String str) {
            return new WAv(i10, str);
        }
    };

    public static void Qhi(Gm gm2) {
        Qhi = gm2;
    }

    public static Gm Qhi() {
        return Qhi;
    }
}
