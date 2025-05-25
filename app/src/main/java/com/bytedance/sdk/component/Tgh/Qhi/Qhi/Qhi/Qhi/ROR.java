package com.bytedance.sdk.component.Tgh.Qhi.Qhi.Qhi.Qhi;

import a6.h;
import android.content.Context;
import com.bytedance.sdk.component.Tgh.Qhi.hm;

/* compiled from: StatsBatchLogEventRepoImpl.java */
/* loaded from: classes.dex */
public class ROR extends Sf {
    public ROR(Context context, com.bytedance.sdk.component.Tgh.Qhi.CJ.cJ.ac acVar) {
        super(context, acVar);
    }

    @Override // com.bytedance.sdk.component.Tgh.Qhi.Qhi.Qhi.Qhi.Sf
    public byte Qhi() {
        return (byte) 1;
    }

    @Override // com.bytedance.sdk.component.Tgh.Qhi.Qhi.Qhi.Qhi.Sf
    public byte ac() {
        return (byte) 3;
    }

    @Override // com.bytedance.sdk.component.Tgh.Qhi.Qhi.Qhi.Qhi.Sf, com.bytedance.sdk.component.Tgh.Qhi.Qhi.Qhi.Qhi.ac
    public String cJ() {
        return hm.ROR().CJ().fl();
    }

    public static String Qhi(String str) {
        return h.d("CREATE TABLE IF NOT EXISTS ", str, " (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,value TEXT ,gen_time TEXT , retry INTEGER default 0 , encrypt INTEGER default 0)");
    }
}
