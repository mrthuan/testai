package com.facebook;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: CurrentAccessTokenExpirationBroadcastReceiver.kt */
/* loaded from: classes.dex */
public final class CurrentAccessTokenExpirationBroadcastReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        kotlin.jvm.internal.g.e(context, "context");
        kotlin.jvm.internal.g.e(intent, "intent");
        if (kotlin.jvm.internal.g.a("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED", intent.getAction()) && d.g()) {
            c a10 = c.f9675f.a();
            a aVar = a10.c;
            a10.b(aVar, aVar);
        }
    }
}
