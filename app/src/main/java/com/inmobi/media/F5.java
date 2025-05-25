package com.inmobi.media;

import java.util.Timer;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class F5 extends Lambda implements cg.a {

    /* renamed from: a  reason: collision with root package name */
    public static final F5 f14245a = new F5();

    public F5() {
        super(0);
    }

    @Override // cg.a
    public final Object invoke() {
        return new Timer("IM-PageStateTracker");
    }
}
