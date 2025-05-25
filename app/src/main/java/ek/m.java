package ek;

import java.io.IOException;

/* compiled from: TaskQueue.kt */
/* loaded from: classes3.dex */
public final class m extends bk.a {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ d f16738e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(String str, d dVar) {
        super(str, true);
        this.f16738e = dVar;
    }

    @Override // bk.a
    public final long a() {
        d dVar = this.f16738e;
        dVar.getClass();
        try {
            dVar.f16694y.h(2, 0, false);
            return -1L;
        } catch (IOException e10) {
            dVar.b(e10);
            return -1L;
        }
    }
}
