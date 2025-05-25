package com.inmobi.media;

import java.util.Timer;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class G5 extends Lambda implements cg.a {

    /* renamed from: a  reason: collision with root package name */
    public static final G5 f14272a = new G5();

    public G5() {
        super(0);
    }

    @Override // cg.a
    public final Object invoke() {
        return new Timer("IM-PageStateTracker");
    }
}
