package com.inmobi.media;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import java.util.List;

/* loaded from: classes2.dex */
public final class Lc {

    /* renamed from: b  reason: collision with root package name */
    public static Context f14440b;
    public static Handler c;

    /* renamed from: d  reason: collision with root package name */
    public static boolean f14441d;

    /* renamed from: f  reason: collision with root package name */
    public static List f14443f;

    /* renamed from: a  reason: collision with root package name */
    public static final Lc f14439a = new Lc();

    /* renamed from: e  reason: collision with root package name */
    public static final IntentFilter f14442e = new IntentFilter("android.net.wifi.SCAN_RESULTS");

    /* renamed from: g  reason: collision with root package name */
    public static final Runnable f14444g = new c6.b(2);

    /* renamed from: h  reason: collision with root package name */
    public static final Kc f14445h = new Kc();

    public static final void b() {
        f14439a.a();
    }

    public final synchronized void a() {
        Handler handler = c;
        if (handler == null) {
            return;
        }
        handler.removeCallbacks(f14444g);
        if (f14441d) {
            f14441d = false;
            try {
                Context context = f14440b;
                if (context != null) {
                    context.unregisterReceiver(f14445h);
                }
            } catch (IllegalArgumentException unused) {
            }
        }
        c = null;
        f14440b = null;
    }
}
