package com.bytedance.sdk.openadsdk.ABk.ac;

import android.content.Context;
import android.content.SharedPreferences;

/* compiled from: MonitorSp.java */
/* loaded from: classes.dex */
public class Qhi {
    private final SharedPreferences Qhi;

    public Qhi(Context context) {
        this.Qhi = context.getSharedPreferences("pag_monitor_record", 0);
    }

    public long Qhi() {
        return this.Qhi.getLong("last_upload_time", 0L);
    }

    public void Qhi(long j10) {
        SharedPreferences.Editor edit = this.Qhi.edit();
        edit.putLong("last_upload_time", j10);
        edit.apply();
    }
}
