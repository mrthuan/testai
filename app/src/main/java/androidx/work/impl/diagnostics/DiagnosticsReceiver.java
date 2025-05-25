package androidx.work.impl.diagnostics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.workers.DiagnosticsWorker;
import o2.h;
import o2.i;
import p2.j;

/* loaded from: classes.dex */
public class DiagnosticsReceiver extends BroadcastReceiver {
    static {
        h.e("DiagnosticsRcvr");
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        h.c().a(new Throwable[0]);
        try {
            j.e(context).b(new i.a(DiagnosticsWorker.class).a());
        } catch (IllegalStateException e10) {
            h.c().b(e10);
        }
    }
}
