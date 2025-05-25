package com.bytedance.sdk.component.Tgh.Qhi.Qhi.Qhi;

import android.annotation.SuppressLint;
import android.content.Context;
import com.bytedance.sdk.component.Tgh.Qhi.Qhi.Qhi.cJ;

/* compiled from: DBAdapter.java */
/* loaded from: classes.dex */
public class Qhi extends cJ {
    @SuppressLint({"StaticFieldLeak"})
    private static volatile Qhi Qhi;

    private Qhi(Context context) {
        super(context);
    }

    @Override // com.bytedance.sdk.component.Tgh.Qhi.Qhi.Qhi.cJ
    public /* bridge */ /* synthetic */ cJ.C0082cJ Qhi() {
        return super.Qhi();
    }

    public static Qhi Qhi(Context context) {
        if (Qhi == null) {
            synchronized (Qhi.class) {
                if (Qhi == null) {
                    Qhi = new Qhi(context);
                }
            }
        }
        return Qhi;
    }
}
