package com.bytedance.sdk.component.adexpress.theme;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class ThemeStatusBroadcastReceiver extends BroadcastReceiver {
    private WeakReference<Qhi> Qhi;

    public void Qhi(Qhi qhi) {
        this.Qhi = new WeakReference<>(qhi);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        int intExtra = intent.getIntExtra("theme_status_change", 0);
        WeakReference<Qhi> weakReference = this.Qhi;
        if (weakReference != null && weakReference.get() != null) {
            this.Qhi.get().Qhi(intExtra);
        }
    }
}
