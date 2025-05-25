package com.inmobi.media;

import android.location.LocationManager;
import com.google.android.gms.common.api.GoogleApiClient;
import com.inmobi.commons.core.configs.Config;
import com.inmobi.commons.core.configs.SignalsConfig;
import java.util.LinkedHashMap;

/* loaded from: classes2.dex */
public final class Na {

    /* renamed from: a  reason: collision with root package name */
    public static final Na f14534a = new Na();

    /* renamed from: b  reason: collision with root package name */
    public static C1567b4 f14535b;
    public static boolean c;

    public static SignalsConfig.IceConfig a(String str) {
        LinkedHashMap linkedHashMap = C1732n2.f15334a;
        Config a10 = C1705l2.a("signals", str, null);
        kotlin.jvm.internal.g.c(a10, "null cannot be cast to non-null type com.inmobi.commons.core.configs.SignalsConfig");
        return ((SignalsConfig) a10).getIceConfig();
    }

    public final synchronized void b() {
        LinkedHashMap linkedHashMap = C1732n2.f15334a;
        C1705l2.a("signals", Ha.b(), null);
        Ma ma2 = Ma.f14488a;
        boolean isSessionEnabled = a().isSessionEnabled();
        ma2.getClass();
        Ma.f14491e = isSessionEnabled;
        if (!isSessionEnabled) {
            Ma.f14490d = null;
        }
        Ma.c();
        Ha ha2 = Ha.f14324a;
        String h10 = ha2.h();
        if (h10 == null || a(h10).isVisibleWifiEnabled()) {
            c();
        }
        String h11 = ha2.h();
        if (h11 == null || a(h11).isLocationEnabled()) {
            P5.f14570a.d();
        }
    }

    public final synchronized void c() {
        if (c) {
            return;
        }
        c = true;
        if (f14535b == null) {
            f14535b = new C1567b4();
        }
        C1567b4 c1567b4 = f14535b;
        if (c1567b4 != null) {
            c1567b4.a();
        }
    }

    public final synchronized void d() {
        if (c) {
            c = false;
            C1567b4 c1567b4 = f14535b;
            if (c1567b4 != null) {
                HandlerC1553a4 handlerC1553a4 = c1567b4.f14962a;
                handlerC1553a4.f14932a = true;
                handlerC1553a4.sendEmptyMessageDelayed(2, a().getStopRequestTimeout() * 1000);
            }
        }
        P5 p52 = P5.f14570a;
        if (P5.c()) {
            LocationManager locationManager = P5.f14571b;
            if (locationManager != null) {
                locationManager.removeUpdates(p52);
            }
            GoogleApiClient googleApiClient = P5.f14572d;
            if (googleApiClient != null) {
                googleApiClient.e();
            }
        }
        P5.f14572d = null;
    }

    public static SignalsConfig.IceConfig a() {
        LinkedHashMap linkedHashMap = C1732n2.f15334a;
        return ((SignalsConfig) AbstractC1773q4.a("signals", "null cannot be cast to non-null type com.inmobi.commons.core.configs.SignalsConfig", null)).getIceConfig();
    }
}
