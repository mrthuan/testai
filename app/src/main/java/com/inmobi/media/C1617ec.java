package com.inmobi.media;

import java.util.concurrent.Executors;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.inmobi.media.ec  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1617ec extends Lambda implements cg.a {

    /* renamed from: a  reason: collision with root package name */
    public static final C1617ec f15042a = new C1617ec();

    public C1617ec() {
        super(0);
    }

    @Override // cg.a
    public final Object invoke() {
        C1631fc c1631fc = C1631fc.f15077a;
        return Executors.newCachedThreadPool(new I4("fc"));
    }
}
