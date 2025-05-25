package ek;

import java.io.IOException;

/* compiled from: TaskQueue.kt */
/* loaded from: classes3.dex */
public final class g extends bk.a {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ d f16719e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f16720f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ int f16721g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(String str, d dVar, int i10, int i11) {
        super(str, true);
        this.f16719e = dVar;
        this.f16720f = i10;
        this.f16721g = i11;
    }

    @Override // bk.a
    public final long a() {
        int i10 = this.f16720f;
        int i11 = this.f16721g;
        d dVar = this.f16719e;
        dVar.getClass();
        try {
            dVar.f16694y.h(i10, i11, true);
            return -1L;
        } catch (IOException e10) {
            dVar.b(e10);
            return -1L;
        }
    }
}
