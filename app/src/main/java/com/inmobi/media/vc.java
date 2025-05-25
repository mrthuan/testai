package com.inmobi.media;

import java.util.Objects;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class vc extends Lambda implements cg.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ wc f15520a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vc(wc wcVar) {
        super(0);
        this.f15520a = wcVar;
    }

    @Override // cg.a
    /* renamed from: a */
    public final Runnable invoke() {
        return new androidx.appcompat.widget.y0(this.f15520a, 13);
    }

    public static final void a(wc this$0) {
        kotlin.jvm.internal.g.e(this$0, "this$0");
        Objects.toString(this$0);
        this$0.c.post((rc) this$0.f15611k.getValue());
    }
}
