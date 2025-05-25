package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.ConstraintProxy;
import o2.h;
import p2.j;
import y2.g;

/* loaded from: classes.dex */
public class ConstraintProxyUpdateReceiver extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f4930a = 0;

    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Intent f4931a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Context f4932b;
        public final /* synthetic */ BroadcastReceiver.PendingResult c;

        public a(Intent intent, Context context, BroadcastReceiver.PendingResult pendingResult) {
            this.f4931a = intent;
            this.f4932b = context;
            this.c = pendingResult;
        }

        @Override // java.lang.Runnable
        public final void run() {
            BroadcastReceiver.PendingResult pendingResult = this.c;
            Context context = this.f4932b;
            Intent intent = this.f4931a;
            try {
                boolean booleanExtra = intent.getBooleanExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", false);
                boolean booleanExtra2 = intent.getBooleanExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", false);
                boolean booleanExtra3 = intent.getBooleanExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", false);
                boolean booleanExtra4 = intent.getBooleanExtra("KEY_NETWORK_STATE_PROXY_ENABLED", false);
                h c = h.c();
                int i10 = ConstraintProxyUpdateReceiver.f4930a;
                String.format("Updating proxies: BatteryNotLowProxy enabled (%s), BatteryChargingProxy enabled (%s), StorageNotLowProxy (%s), NetworkStateProxy enabled (%s)", Boolean.valueOf(booleanExtra), Boolean.valueOf(booleanExtra2), Boolean.valueOf(booleanExtra3), Boolean.valueOf(booleanExtra4));
                c.a(new Throwable[0]);
                g.a(context, ConstraintProxy.BatteryNotLowProxy.class, booleanExtra);
                g.a(context, ConstraintProxy.BatteryChargingProxy.class, booleanExtra2);
                g.a(context, ConstraintProxy.StorageNotLowProxy.class, booleanExtra3);
                g.a(context, ConstraintProxy.NetworkStateProxy.class, booleanExtra4);
            } finally {
                pendingResult.finish();
            }
        }
    }

    static {
        h.e("ConstrntProxyUpdtRecvr");
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String str;
        if (intent != null) {
            str = intent.getAction();
        } else {
            str = null;
        }
        if (!"androidx.work.impl.background.systemalarm.UpdateProxies".equals(str)) {
            h c = h.c();
            String.format("Ignoring unknown action %s", str);
            c.a(new Throwable[0]);
            return;
        }
        ((z2.b) j.e(context).f23629d).a(new a(intent, context, goAsync()));
    }
}
