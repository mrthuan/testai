package com.bytedance.sdk.component.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: TTNetworkUtils.java */
/* loaded from: classes.dex */
public class bxS {
    private static final Object Qhi = new Object();
    private static final Map<Qhi, Object> cJ = new ConcurrentHashMap();

    /* renamed from: ac  reason: collision with root package name */
    private static AtomicBoolean f8425ac = new AtomicBoolean(false);
    private static volatile int CJ = -1;

    /* renamed from: fl  reason: collision with root package name */
    private static volatile long f8426fl = 0;
    private static volatile int Tgh = 60000;
    private static HzH ROR = null;
    private static final AtomicBoolean Sf = new AtomicBoolean(false);

    /* compiled from: TTNetworkUtils.java */
    /* loaded from: classes.dex */
    public interface Qhi {
        void Qhi(Context context, Intent intent, boolean z10, int i10);
    }

    /* compiled from: TTNetworkUtils.java */
    /* loaded from: classes.dex */
    public static class cJ extends BroadcastReceiver {
        private cJ() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            boolean z10 = false;
            boolean booleanExtra = intent.getBooleanExtra("noConnectivity", false);
            if (bxS.cJ != null && bxS.cJ.size() > 0) {
                z10 = true;
            }
            bxS.cJ(context, intent, z10, booleanExtra);
        }
    }

    private static int ac(Context context) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null && activeNetworkInfo.isAvailable()) {
                int type = activeNetworkInfo.getType();
                if (type != 0) {
                    return type != 1 ? 1 : 4;
                }
                TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                switch (activeNetworkInfo.getSubtype()) {
                    case 1:
                    case 2:
                    case 4:
                    case 7:
                    case 11:
                    case 16:
                        return 2;
                    case 3:
                    case 5:
                    case 6:
                    case 8:
                    case 9:
                    case 10:
                    case 12:
                    case 14:
                    case 15:
                    case 17:
                        return 3;
                    case 13:
                    case 18:
                    case 19:
                        HzH hzH = ROR;
                        return (hzH == null || !hzH.Qhi(context, telephonyManager)) ? 5 : 6;
                    case 20:
                        return 6;
                    default:
                        String subtypeName = activeNetworkInfo.getSubtypeName();
                        return (TextUtils.isEmpty(subtypeName) || !(subtypeName.equalsIgnoreCase("TD-SCDMA") || subtypeName.equalsIgnoreCase("WCDMA") || subtypeName.equalsIgnoreCase("CDMA2000"))) ? 1 : 3;
                }
            }
            return 0;
        } catch (Throwable unused) {
            return 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void cJ(final Context context, final Intent intent, final boolean z10, final boolean z11) {
        if (!z10 && z11) {
            CJ = 0;
        } else if (Sf.compareAndSet(false, true)) {
            com.bytedance.sdk.component.Sf.ROR.cJ(new com.bytedance.sdk.component.Sf.hm("getNetworkType") { // from class: com.bytedance.sdk.component.utils.bxS.1
                @Override // java.lang.Runnable
                public void run() {
                    int cJ2;
                    if (!z11) {
                        cJ2 = bxS.cJ(context);
                    } else {
                        cJ2 = 0;
                    }
                    int unused = bxS.CJ = cJ2;
                    bxS.Sf.set(false);
                    if (z10) {
                        bxS.cJ(context, intent, bxS.CJ, z11);
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void cJ(Context context, Intent intent, int i10, boolean z10) {
        Map<Qhi, Object> map = cJ;
        if (map == null || map.size() <= 0) {
            return;
        }
        for (Qhi qhi : map.keySet()) {
            if (qhi != null) {
                qhi.Qhi(context, intent, !z10, i10);
            }
        }
    }

    public static int Qhi(Context context, long j10) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (f8426fl + j10 <= elapsedRealtime) {
            return cJ(context);
        }
        if (CJ == -1) {
            return cJ(context);
        }
        if (elapsedRealtime - f8426fl >= Tgh) {
            cJ(context, (Intent) null, false, false);
        }
        return CJ;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int cJ(Context context) {
        CJ = ac(context);
        f8426fl = SystemClock.elapsedRealtime();
        return CJ;
    }

    public static void Qhi(Qhi qhi, Context context) {
        if (qhi == null) {
            return;
        }
        if (!f8425ac.get()) {
            try {
                context.registerReceiver(new cJ(), new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                f8425ac.set(true);
            } catch (Throwable unused) {
            }
        }
        cJ.put(qhi, Qhi);
    }

    public static void Qhi(Qhi qhi) {
        if (qhi == null) {
            return;
        }
        cJ.remove(qhi);
    }
}
