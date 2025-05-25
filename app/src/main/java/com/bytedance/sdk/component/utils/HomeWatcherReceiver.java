package com.bytedance.sdk.component.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes.dex */
public class HomeWatcherReceiver extends BroadcastReceiver {
    private Qhi Qhi;

    /* loaded from: classes.dex */
    public interface Qhi {
        void Qhi();

        void cJ();
    }

    public void Qhi(Qhi qhi) {
        this.Qhi = qhi;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        try {
            String action = intent.getAction();
            "onReceive: action: ".concat(String.valueOf(action));
            if ("android.intent.action.CLOSE_SYSTEM_DIALOGS".equals(action)) {
                String stringExtra = intent.getStringExtra("reason");
                "reason: ".concat(String.valueOf(stringExtra));
                if ("homekey".equals(stringExtra)) {
                    Qhi qhi = this.Qhi;
                    if (qhi != null) {
                        qhi.Qhi();
                    }
                } else if ("recentapps".equals(stringExtra)) {
                    Qhi qhi2 = this.Qhi;
                    if (qhi2 != null) {
                        qhi2.cJ();
                    }
                } else {
                    "assist".equals(stringExtra);
                }
            }
        } catch (Throwable unused) {
            ABk.Qhi("HomeReceiver", "ACTION_CLOSE_SYSTEM_DIALOGS throw");
        }
    }
}
