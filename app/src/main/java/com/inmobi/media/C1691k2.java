package com.inmobi.media;

import android.os.HandlerThread;
import android.os.Looper;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.inmobi.media.k2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1691k2 extends Lambda implements cg.a {

    /* renamed from: a  reason: collision with root package name */
    public static final C1691k2 f15249a = new C1691k2();

    public C1691k2() {
        super(0);
    }

    @Override // cg.a
    public final Object invoke() {
        LinkedHashMap linkedHashMap = C1732n2.f15334a;
        HandlerThread handlerThread = new HandlerThread(C1732n2.b());
        J3.a(handlerThread, C1732n2.b());
        Looper looper = handlerThread.getLooper();
        kotlin.jvm.internal.g.d(looper, "getLooper(...)");
        return new HandlerC1649h2(looper);
    }
}
