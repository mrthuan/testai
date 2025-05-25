package com.inmobi.media;

import com.inmobi.commons.core.configs.Config;
import com.inmobi.commons.core.configs.CrashConfig;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class P4 extends Lambda implements cg.a {

    /* renamed from: a  reason: collision with root package name */
    public static final P4 f14569a = new P4();

    public P4() {
        super(0);
    }

    @Override // cg.a
    public final Object invoke() {
        LinkedHashMap linkedHashMap = C1732n2.f15334a;
        Config a10 = C1705l2.a("crashReporting", Ha.b(), Q4.f14590a);
        kotlin.jvm.internal.g.c(a10, "null cannot be cast to non-null type com.inmobi.commons.core.configs.CrashConfig");
        return (CrashConfig) a10;
    }
}
