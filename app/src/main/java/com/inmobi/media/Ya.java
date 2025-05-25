package com.inmobi.media;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public abstract class Ya {

    /* renamed from: a  reason: collision with root package name */
    public static final ConcurrentHashMap f14890a = new ConcurrentHashMap();

    /* renamed from: b  reason: collision with root package name */
    public static ConnectivityManager.NetworkCallback f14891b;

    public static void a(String str) {
        Context d10 = Ha.d();
        if (d10 != null) {
            if (C1566b3.f14952a.C() && kotlin.jvm.internal.g.a("SYSTEM_CONNECTIVITY_CHANGE", str)) {
                Object systemService = d10.getSystemService("connectivity");
                ConnectivityManager connectivityManager = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
                if (connectivityManager != null) {
                    Xa xa2 = new Xa();
                    f14891b = xa2;
                    connectivityManager.registerDefaultNetworkCallback(xa2);
                    return;
                }
                return;
            }
            ConcurrentHashMap concurrentHashMap = f14890a;
            if (concurrentHashMap.get(str) == null) {
                Wa wa2 = new Wa();
                concurrentHashMap.put(str, wa2);
                AbstractC1579c2.a(d10, wa2, new IntentFilter(str));
            }
        }
    }

    public static void b() {
        a("android.intent.action.ACTION_SHUTDOWN");
        a("android.intent.action.REBOOT");
        if (C1566b3.z()) {
            a("android.os.action.DEVICE_IDLE_MODE_CHANGED");
        }
        a("android.intent.action.USER_PRESENT");
        if (C1566b3.f14952a.C()) {
            a("SYSTEM_CONNECTIVITY_CHANGE");
        } else {
            a("android.net.conn.CONNECTIVITY_CHANGE");
        }
    }

    public static void b(String action) {
        kotlin.jvm.internal.g.e(action, "action");
        Context d10 = Ha.d();
        if (d10 != null) {
            if (C1566b3.f14952a.C() && kotlin.jvm.internal.g.a("SYSTEM_CONNECTIVITY_CHANGE", action) && f14891b != null) {
                Object systemService = d10.getSystemService("connectivity");
                ConnectivityManager connectivityManager = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
                if (connectivityManager != null) {
                    ConnectivityManager.NetworkCallback networkCallback = f14891b;
                    kotlin.jvm.internal.g.b(networkCallback);
                    connectivityManager.unregisterNetworkCallback(networkCallback);
                    f14891b = null;
                    return;
                }
                return;
            }
            ConcurrentHashMap concurrentHashMap = f14890a;
            if (concurrentHashMap.get(action) != null) {
                d10.unregisterReceiver((BroadcastReceiver) concurrentHashMap.get(action));
                concurrentHashMap.remove(action);
            }
        }
    }

    public static void a() {
        b("android.intent.action.ACTION_SHUTDOWN");
        b("android.intent.action.REBOOT");
        if (C1566b3.z()) {
            b("android.os.action.DEVICE_IDLE_MODE_CHANGED");
        }
        b("android.intent.action.USER_PRESENT");
        if (C1566b3.f14952a.C()) {
            b("SYSTEM_CONNECTIVITY_CHANGE");
        } else {
            b("android.net.conn.CONNECTIVITY_CHANGE");
        }
    }
}
