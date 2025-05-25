package com.inmobi.media;

import com.inmobi.commons.core.configs.Config;
import java.util.LinkedHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.inmobi.media.n2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1732n2 {

    /* renamed from: a  reason: collision with root package name */
    public static final LinkedHashMap f15334a = new LinkedHashMap();

    /* renamed from: b  reason: collision with root package name */
    public static final tf.c f15335b = kotlin.a.a(C1691k2.f15249a);
    public static final AtomicBoolean c = new AtomicBoolean(false);

    /* renamed from: d  reason: collision with root package name */
    public static final AtomicBoolean f15336d = new AtomicBoolean(true);

    /* renamed from: e  reason: collision with root package name */
    public static final ConcurrentHashMap f15337e = new ConcurrentHashMap();

    /* renamed from: f  reason: collision with root package name */
    public static final tf.c f15338f = kotlin.a.a(C1677j2.f15208a);

    static {
        Ha.f().a(new int[]{2, 1}, C1635g2.f15087a);
        Ha.a(new com.facebook.appevents.a(6));
    }

    public static final Config a(String str, String str2, InterfaceC1719m2 interfaceC1719m2) {
        return C1705l2.a(str, str2, interfaceC1719m2);
    }

    public static final /* synthetic */ String b() {
        return "ConfigBootstrapHandler";
    }

    public static final /* synthetic */ String f() {
        return "n2";
    }

    public static final void g() {
        C1705l2.a();
    }

    public static final void h() {
        if (c.getAndSet(false)) {
            kotlin.jvm.internal.g.d(f(), "access$getTAG$cp(...)");
            ((HandlerC1649h2) f15335b.getValue()).sendEmptyMessage(5);
        }
    }

    public static final void a() {
        C1705l2.a();
    }
}
