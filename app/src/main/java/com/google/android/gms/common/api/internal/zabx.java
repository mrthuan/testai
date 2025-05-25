package com.google.android.gms.common.api.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
/* loaded from: classes.dex */
public final class zabx extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    public Context f11122a;

    /* renamed from: b  reason: collision with root package name */
    public final zabw f11123b;

    public zabx(zabw zabwVar) {
        this.f11123b = zabwVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String str;
        Uri data = intent.getData();
        if (data != null) {
            str = data.getSchemeSpecificPart();
        } else {
            str = null;
        }
        if ("com.google.android.gms".equals(str)) {
            this.f11123b.a();
            synchronized (this) {
                Context context2 = this.f11122a;
                if (context2 != null) {
                    context2.unregisterReceiver(this);
                }
                this.f11122a = null;
            }
        }
    }
}
