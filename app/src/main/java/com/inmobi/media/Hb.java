package com.inmobi.media;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class Hb {

    /* renamed from: a  reason: collision with root package name */
    public static final Hb f14332a = new Hb();

    /* renamed from: b  reason: collision with root package name */
    public static C1885z0 f14333b;

    public static void e() {
        boolean z10;
        boolean booleanValue;
        C1885z0 c1885z0;
        try {
            Context d10 = Ha.d();
            if (d10 != null) {
                C1885z0 c1885z02 = new C1885z0();
                kotlin.jvm.internal.i.a(AdvertisingIdClient.class).b();
                AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(d10);
                kotlin.jvm.internal.g.d(advertisingIdInfo, "getAdvertisingIdInfo(...)");
                c1885z02.a(advertisingIdInfo.getId());
                c1885z02.a(advertisingIdInfo.isLimitAdTrackingEnabled());
                f14333b = c1885z02;
                Boolean bool = AbstractC1855w9.f15587b;
                if (bool != null) {
                    booleanValue = bool.booleanValue();
                } else {
                    Context d11 = Ha.d();
                    z10 = false;
                    if (d11 != null) {
                        ConcurrentHashMap concurrentHashMap = C1851w5.f15578b;
                        AbstractC1855w9.f15587b = Boolean.valueOf(AbstractC1838v5.a(d11, "user_info_store").f15579a.getBoolean("user_age_restricted", false));
                    }
                    Boolean bool2 = AbstractC1855w9.f15587b;
                    if (bool2 != null) {
                        booleanValue = bool2.booleanValue();
                    }
                    if (z10 && (c1885z0 = f14333b) != null) {
                        c1885z0.a((String) null);
                    }
                    return;
                }
                z10 = booleanValue;
                if (z10) {
                    c1885z0.a((String) null);
                }
            }
        } catch (Exception | NoClassDefFoundError unused) {
        }
    }

    public static final void f() {
        e();
    }

    public final void a() {
        try {
            e();
            d();
        } catch (Exception unused) {
        }
    }

    public final C1885z0 b() {
        return f14333b;
    }

    public final Boolean c() {
        C1885z0 c1885z0 = f14333b;
        if (c1885z0 != null) {
            return c1885z0.c();
        }
        return null;
    }

    public final void d() {
        String a10;
        try {
            C1885z0 c1885z0 = f14333b;
            if (c1885z0 != null && (a10 = c1885z0.a()) != null) {
                Z5.a((byte) 2, "Hb", "Publisher device Id is ".concat(a10));
            }
        } catch (Exception unused) {
        }
    }

    public final void a(boolean z10) {
        C1885z0 c1885z0 = f14333b;
        if (c1885z0 == null) {
            return;
        }
        if (z10) {
            c1885z0.a((String) null);
        } else if (c1885z0.a() == null) {
            Ha.a(new u5.a(2));
        }
    }
}
