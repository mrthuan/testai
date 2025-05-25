package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import o2.h;
import p2.j;

/* loaded from: classes.dex */
public class RescheduleReceiver extends BroadcastReceiver {
    static {
        h.e("RescheduleReceiver");
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        h c = h.c();
        String.format("Received intent %s", intent);
        c.a(new Throwable[0]);
        try {
            j e10 = j.e(context);
            BroadcastReceiver.PendingResult goAsync = goAsync();
            e10.getClass();
            synchronized (j.f23626l) {
                e10.f23634i = goAsync;
                if (e10.f23633h) {
                    goAsync.finish();
                    e10.f23634i = null;
                }
            }
        } catch (IllegalStateException e11) {
            h.c().b(e11);
        }
    }
}
