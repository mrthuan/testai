package com.bytedance.sdk.openadsdk.Gm.ac;

/* compiled from: LogUploaderImplEmpty.java */
/* loaded from: classes.dex */
class fl implements cJ {
    private static volatile fl Qhi;

    private fl() {
    }

    @Override // com.bytedance.sdk.openadsdk.Gm.ac.cJ
    public void Qhi(com.bytedance.sdk.openadsdk.Gm.cJ cJVar) {
    }

    @Override // com.bytedance.sdk.openadsdk.Gm.ac.cJ
    public void Qhi(com.bytedance.sdk.openadsdk.Gm.cJ cJVar, boolean z10) {
    }

    public static fl Qhi() {
        if (Qhi == null) {
            synchronized (fl.class) {
                if (Qhi == null) {
                    Qhi = new fl();
                }
            }
        }
        return Qhi;
    }
}
