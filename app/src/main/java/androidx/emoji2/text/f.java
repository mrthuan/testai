package androidx.emoji2.text;

import androidx.emoji2.text.g;

/* compiled from: EmojiCompat.java */
/* loaded from: classes.dex */
public final class f extends g.h {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ g.a f3616a;

    public f(g.a aVar) {
        this.f3616a = aVar;
    }

    @Override // androidx.emoji2.text.g.h
    public final void a(Throwable th2) {
        this.f3616a.f3627a.d(th2);
    }

    @Override // androidx.emoji2.text.g.h
    public final void b(o oVar) {
        g.a aVar = this.f3616a;
        aVar.c = oVar;
        aVar.f3626b = new k(aVar.c, new g.i(), aVar.f3627a.f3625h);
        aVar.f3627a.e();
    }
}
