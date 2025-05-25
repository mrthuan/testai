package ek;

import kotlin.jvm.internal.Ref$ObjectRef;

/* compiled from: TaskQueue.kt */
/* loaded from: classes3.dex */
public final class e extends bk.a {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ d f16715e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Ref$ObjectRef f16716f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(String str, d dVar, Ref$ObjectRef ref$ObjectRef) {
        super(str, true);
        this.f16715e = dVar;
        this.f16716f = ref$ObjectRef;
    }

    @Override // bk.a
    public final long a() {
        d dVar = this.f16715e;
        dVar.f16672b.a(dVar, (t) this.f16716f.element);
        return -1L;
    }
}
