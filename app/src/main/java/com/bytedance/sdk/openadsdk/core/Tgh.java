package com.bytedance.sdk.openadsdk.core;

import android.annotation.SuppressLint;
import android.content.Context;
import com.bytedance.sdk.openadsdk.core.ROR;

/* compiled from: DBAdapter.java */
/* loaded from: classes.dex */
public class Tgh extends ROR {
    @SuppressLint({"StaticFieldLeak"})
    private static volatile Tgh Qhi;

    private Tgh(Context context) {
        super(context);
    }

    @Override // com.bytedance.sdk.openadsdk.core.ROR
    public /* bridge */ /* synthetic */ ROR.ac Qhi() {
        return super.Qhi();
    }

    public static Tgh Qhi(Context context) {
        if (Qhi == null) {
            synchronized (Tgh.class) {
                if (Qhi == null) {
                    Qhi = new Tgh(context);
                }
            }
        }
        return Qhi;
    }
}
