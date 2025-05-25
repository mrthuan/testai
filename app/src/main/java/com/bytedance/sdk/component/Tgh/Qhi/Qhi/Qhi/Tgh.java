package com.bytedance.sdk.component.Tgh.Qhi.Qhi.Qhi;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/* compiled from: MyDBCallback.java */
/* loaded from: classes.dex */
public class Tgh implements com.bytedance.sdk.component.Tgh.Qhi.Qhi.Tgh {
    public static final Tgh Qhi = new Tgh();
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
                    this.cJ = new fl(context).getWritableDatabase();
                }
            }
        }
        return this.cJ;
    }
}
