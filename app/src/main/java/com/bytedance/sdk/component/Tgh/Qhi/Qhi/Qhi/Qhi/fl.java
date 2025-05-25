package com.bytedance.sdk.component.Tgh.Qhi.Qhi.Qhi.Qhi;

import a6.h;
import android.content.Context;
import com.bytedance.sdk.component.Tgh.Qhi.hm;

/* compiled from: HighPriorityAdEventRepoImpl.java */
/* loaded from: classes.dex */
public class fl extends Qhi {
    public fl(Context context, com.bytedance.sdk.component.Tgh.Qhi.CJ.cJ.ac acVar) {
        super(context, acVar);
    }

    @Override // com.bytedance.sdk.component.Tgh.Qhi.Qhi.Qhi.Qhi.Qhi
    public byte CJ() {
        return (byte) 0;
    }

    @Override // com.bytedance.sdk.component.Tgh.Qhi.Qhi.Qhi.Qhi.Qhi
    public byte ac() {
        return (byte) 1;
    }

    @Override // com.bytedance.sdk.component.Tgh.Qhi.Qhi.Qhi.Qhi.Qhi, com.bytedance.sdk.component.Tgh.Qhi.Qhi.Qhi.Qhi.ac
    public String cJ() {
        com.bytedance.sdk.component.Tgh.Qhi.Qhi.Tgh CJ = hm.ROR().CJ();
        if (CJ != null) {
            return CJ.Qhi();
        }
        return null;
    }

    public static String ac(String str) {
        return h.d("CREATE TABLE IF NOT EXISTS ", str, " (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,value TEXT ,gen_time TEXT , retry INTEGER default 0 , encrypt INTEGER default 0)");
    }
}
