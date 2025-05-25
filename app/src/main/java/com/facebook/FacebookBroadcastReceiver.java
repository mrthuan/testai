package com.facebook;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

/* compiled from: FacebookBroadcastReceiver.kt */
/* loaded from: classes.dex */
public class FacebookBroadcastReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        kotlin.jvm.internal.g.e(context, "context");
        kotlin.jvm.internal.g.e(intent, "intent");
        String stringExtra = intent.getStringExtra("com.facebook.platform.protocol.CALL_ID");
        String stringExtra2 = intent.getStringExtra("com.facebook.platform.protocol.PROTOCOL_ACTION");
        Bundle extras = intent.getExtras();
        if (stringExtra != null && stringExtra2 != null && extras != null) {
            com.facebook.internal.k kVar = com.facebook.internal.k.f9807a;
            if (!k6.a.b(com.facebook.internal.k.class)) {
                try {
                    Bundle c = com.facebook.internal.k.c(intent);
                    if (c != null) {
                        c.containsKey("error");
                    } else {
                        intent.hasExtra("com.facebook.platform.status.ERROR_TYPE");
                    }
                } catch (Throwable th2) {
                    k6.a.a(com.facebook.internal.k.class, th2);
                }
            }
        }
    }
}
