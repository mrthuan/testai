package com.inmobi.media;

import com.inmobi.commons.core.configs.AdConfig;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class U1 {

    /* renamed from: a  reason: collision with root package name */
    public final V1 f14726a;

    /* renamed from: b  reason: collision with root package name */
    public final A4 f14727b;

    public U1(V1 mEventHandler, A4 a42) {
        kotlin.jvm.internal.g.e(mEventHandler, "mEventHandler");
        this.f14726a = mEventHandler;
        this.f14727b = a42;
    }

    public final void a(N1 click) {
        AdConfig.ImaiConfig imaiConfig;
        EnumC1849w3 enumC1849w3;
        HashMap hashMap;
        kotlin.jvm.internal.g.e(click, "click");
        try {
            A4 a42 = this.f14727b;
            if (a42 != null) {
                String f10 = Y1.f();
                kotlin.jvm.internal.g.d(f10, "access$getTAG$p(...)");
                ((B4) a42).c(f10, "ping - " + click.f14506a);
            }
            G8 g82 = new G8(click.f14507b, this.f14727b);
            HashMap a10 = Y1.a(Y1.f14860a, click);
            if (!a10.isEmpty()) {
                g82.f14282i.putAll(a10);
            }
            g82.f14297x = false;
            g82.f14293t = false;
            g82.f14294u = false;
            Map map = click.c;
            if (map != null && (hashMap = g82.f14283j) != null) {
                hashMap.putAll(map);
            }
            g82.f14291r = click.f14508d;
            imaiConfig = Y1.f14865g;
            if (imaiConfig != null) {
                g82.f14289p = imaiConfig.getPingTimeout() * 1000;
                g82.f14290q = imaiConfig.getPingTimeout() * 1000;
            }
            H8 b10 = g82.b();
            if (b10.b()) {
                D8 d82 = b10.c;
                if (d82 == null || (enumC1849w3 = d82.f14201a) == null) {
                    enumC1849w3 = EnumC1849w3.f15554e;
                }
                if (EnumC1849w3.f15560k == enumC1849w3) {
                    this.f14726a.a(click);
                    return;
                } else if (!click.f14508d && (EnumC1849w3.f15569t == enumC1849w3 || EnumC1849w3.f15571v == enumC1849w3)) {
                    this.f14726a.a(click);
                    return;
                } else {
                    this.f14726a.a(click, enumC1849w3);
                    return;
                }
            }
            this.f14726a.a(click);
        } catch (Exception unused) {
            kotlin.jvm.internal.g.d(Y1.f(), "access$getTAG$p(...)");
            V1 v12 = this.f14726a;
            EnumC1849w3 errorCode = EnumC1849w3.f15554e;
            kotlin.jvm.internal.g.e(errorCode, "errorCode");
            v12.a(click, errorCode);
        }
    }
}
