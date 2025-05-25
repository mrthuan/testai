package com.bytedance.sdk.openadsdk.cJ.Qhi;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/* compiled from: MyDBCallback.java */
/* loaded from: classes.dex */
public class hm implements com.bytedance.sdk.component.Tgh.Qhi.Qhi.Tgh {
    public static final hm Qhi = new hm();
    private volatile SQLiteDatabase cJ;

    @Override // com.bytedance.sdk.component.Tgh.Qhi.Qhi.Tgh
    public String CJ() {
        return "logstats";
    }

    @Override // com.bytedance.sdk.component.Tgh.Qhi.Qhi.Tgh
    public String Qhi() {
        return "loghighpriority";
    }

    @Override // com.bytedance.sdk.component.Tgh.Qhi.Qhi.Tgh
    public String Tgh() {
        return null;
    }

    @Override // com.bytedance.sdk.component.Tgh.Qhi.Qhi.Tgh
    public String ac() {
        return null;
    }

    @Override // com.bytedance.sdk.component.Tgh.Qhi.Qhi.Tgh
    public String cJ() {
        return "adevent";
    }

    @Override // com.bytedance.sdk.component.Tgh.Qhi.Qhi.Tgh
    public String fl() {
        return "logstatsbatch";
    }

    @Override // com.bytedance.sdk.component.Tgh.Qhi.Qhi.Tgh
    public SQLiteDatabase Qhi(Context context) {
        if (this.cJ == null) {
            synchronized (this) {
                if (this.cJ == null) {
                    this.cJ = com.bytedance.sdk.openadsdk.core.Tgh.Qhi(context).Qhi().Qhi();
                }
            }
        }
        return this.cJ;
    }
}
