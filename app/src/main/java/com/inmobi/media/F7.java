package com.inmobi.media;

import android.content.Context;
import android.widget.FrameLayout;

/* loaded from: classes2.dex */
public abstract class F7 extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public final byte f14247a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F7(Context context, byte b10) {
        super(context);
        kotlin.jvm.internal.g.e(context, "context");
        this.f14247a = b10;
    }

    public abstract void a(C1570b7 c1570b7, G7 g72, int i10, int i11, E7 e72);

    public final byte getType() {
        return this.f14247a;
    }
}
