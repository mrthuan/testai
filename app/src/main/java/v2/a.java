package v2;

import android.content.Intent;
import android.content.IntentFilter;
import o2.h;

/* compiled from: BatteryChargingTracker.java */
/* loaded from: classes.dex */
public final class a extends c<Boolean> {
    static {
        h.e("BatteryChrgTracker");
    }

    @Override // v2.d
    public final Object a() {
        Intent registerReceiver = this.f30485b.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        boolean z10 = false;
        if (registerReceiver == null) {
            h.c().b(new Throwable[0]);
            return null;
        }
        int intExtra = registerReceiver.getIntExtra("status", -1);
        return Boolean.valueOf((intExtra == 2 || intExtra == 5) ? true : true);
    }

    @Override // v2.c
    public final IntentFilter f() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.os.action.CHARGING");
        intentFilter.addAction("android.os.action.DISCHARGING");
        return intentFilter;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0041, code lost:
        if (r5.equals("android.os.action.DISCHARGING") == false) goto L7;
     */
    @Override // v2.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onBroadcastReceive(android.content.Context r5, android.content.Intent r6) {
        /*
            r4 = this;
            java.lang.String r5 = r6.getAction()
            if (r5 != 0) goto L7
            return
        L7:
            o2.h r6 = o2.h.c()
            r0 = 1
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r2 = 0
            r1[r2] = r5
            java.lang.String r3 = "Received %s"
            java.lang.String.format(r3, r1)
            java.lang.Throwable[] r1 = new java.lang.Throwable[r2]
            r6.a(r1)
            int r6 = r5.hashCode()
            r1 = -1
            switch(r6) {
                case -1886648615: goto L44;
                case -54942926: goto L3b;
                case 948344062: goto L30;
                case 1019184907: goto L25;
                default: goto L23;
            }
        L23:
            r0 = r1
            goto L4e
        L25:
            java.lang.String r6 = "android.intent.action.ACTION_POWER_CONNECTED"
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L2e
            goto L23
        L2e:
            r0 = 3
            goto L4e
        L30:
            java.lang.String r6 = "android.os.action.CHARGING"
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L39
            goto L23
        L39:
            r0 = 2
            goto L4e
        L3b:
            java.lang.String r6 = "android.os.action.DISCHARGING"
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L4e
            goto L23
        L44:
            java.lang.String r6 = "android.intent.action.ACTION_POWER_DISCONNECTED"
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L4d
            goto L23
        L4d:
            r0 = r2
        L4e:
            switch(r0) {
                case 0: goto L64;
                case 1: goto L5e;
                case 2: goto L58;
                case 3: goto L52;
                default: goto L51;
            }
        L51:
            goto L69
        L52:
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            r4.c(r5)
            goto L69
        L58:
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            r4.c(r5)
            goto L69
        L5e:
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            r4.c(r5)
            goto L69
        L64:
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            r4.c(r5)
        L69:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: v2.a.onBroadcastReceive(android.content.Context, android.content.Intent):void");
    }
}
