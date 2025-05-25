package com.inmobi.media;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class Wa extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String str;
        kotlin.jvm.internal.g.e(context, "context");
        kotlin.jvm.internal.g.e(intent, "intent");
        try {
            if (intent.getAction() != null) {
                boolean z10 = false;
                PowerManager powerManager = null;
                ConnectivityManager connectivityManager = null;
                if (kotlin.jvm.internal.g.a("android.net.conn.CONNECTIVITY_CHANGE", intent.getAction())) {
                    Object systemService = context.getSystemService("connectivity");
                    if (systemService instanceof ConnectivityManager) {
                        connectivityManager = (ConnectivityManager) systemService;
                    }
                    if (connectivityManager != null) {
                        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                        if (activeNetworkInfo != null && !activeNetworkInfo.isConnected()) {
                            return;
                        }
                        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                            z10 = true;
                        }
                        ConcurrentHashMap concurrentHashMap = Ya.f14890a;
                        B6 f10 = Ha.f();
                        if (z10) {
                            str = "available";
                        } else {
                            str = "lost";
                        }
                        f10.b(new H1(10, 4, str));
                    }
                } else if (kotlin.text.j.G("android.os.action.DEVICE_IDLE_MODE_CHANGED", intent.getAction(), true)) {
                    Object systemService2 = context.getSystemService("power");
                    if (systemService2 instanceof PowerManager) {
                        powerManager = (PowerManager) systemService2;
                    }
                    if (powerManager != null) {
                        z10 = powerManager.isDeviceIdleMode();
                    }
                    if (z10 && C1566b3.z()) {
                        ConcurrentHashMap concurrentHashMap2 = Ya.f14890a;
                        Ha.f().b(new H1(11, 4, String.valueOf(z10)));
                    }
                } else if (kotlin.jvm.internal.g.a("android.intent.action.USER_PRESENT", intent.getAction())) {
                    ConcurrentHashMap concurrentHashMap3 = Ya.f14890a;
                    Ha.f().b(new H1(100, 6, (String) null));
                } else if (kotlin.jvm.internal.g.a("android.intent.action.ACTION_SHUTDOWN", intent.getAction())) {
                    ConcurrentHashMap concurrentHashMap4 = Ya.f14890a;
                    Ha.f().b(new H1(1, 6, (String) null));
                    for (Map.Entry entry : Ya.f14890a.entrySet()) {
                        ConcurrentHashMap concurrentHashMap5 = Ya.f14890a;
                        Ya.b((String) entry.getKey());
                    }
                    Ya.f14890a.clear();
                    Ya.f14891b = null;
                } else if (kotlin.jvm.internal.g.a("android.intent.action.REBOOT", intent.getAction())) {
                    ConcurrentHashMap concurrentHashMap6 = Ya.f14890a;
                    Ha.f().b(new H1(2, 6, (String) null));
                    for (Map.Entry entry2 : Ya.f14890a.entrySet()) {
                        ConcurrentHashMap concurrentHashMap7 = Ya.f14890a;
                        Ya.b((String) entry2.getKey());
                    }
                    Ya.f14890a.clear();
                    Ya.f14891b = null;
                } else {
                    ConcurrentHashMap concurrentHashMap8 = Ya.f14890a;
                    Ha.f().b(new H1(99, 4, intent.getAction()));
                }
            }
        } catch (Exception unused) {
            ConcurrentHashMap concurrentHashMap9 = Ya.f14890a;
        }
    }
}
