package com.inmobi.media;

import android.os.Handler;
import android.os.Looper;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.inmobi.media.ab  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1560ab extends Lambda implements cg.a {

    /* renamed from: a  reason: collision with root package name */
    public static final C1560ab f14938a = new C1560ab();

    public C1560ab() {
        super(0);
    }

    @Override // cg.a
    public final Object invoke() {
        return new Handler(Looper.getMainLooper());
    }
}
