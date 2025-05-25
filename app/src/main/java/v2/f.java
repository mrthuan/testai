package v2;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import o2.h;

/* compiled from: StorageNotLowTracker.java */
/* loaded from: classes.dex */
public final class f extends c<Boolean> {
    static {
        h.e("StorageNotLowTracker");
    }

    @Override // v2.d
    public final Object a() {
        Intent registerReceiver = this.f30485b.registerReceiver(null, f());
        if (registerReceiver != null && registerReceiver.getAction() != null) {
            String action = registerReceiver.getAction();
            action.getClass();
            if (!action.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
                if (!action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                    return null;
                }
                return Boolean.TRUE;
            }
            return Boolean.FALSE;
        }
        return Boolean.TRUE;
    }

    @Override // v2.c
    public final IntentFilter f() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_LOW");
        return intentFilter;
    }

    @Override // v2.c
    public void onBroadcastReceive(Context context, Intent intent) {
        if (intent.getAction() == null) {
            return;
        }
        h c = h.c();
        String.format("Received %s", intent.getAction());
        c.a(new Throwable[0]);
        String action = intent.getAction();
        action.getClass();
        if (!action.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
            if (action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                c(Boolean.TRUE);
                return;
            }
            return;
        }
        c(Boolean.FALSE);
    }
}
