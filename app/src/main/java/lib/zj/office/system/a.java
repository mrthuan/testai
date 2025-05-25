package lib.zj.office.system;

import java.lang.Thread;

/* compiled from: AUncaughtExceptionHandler.java */
/* loaded from: classes3.dex */
public final class a implements Thread.UncaughtExceptionHandler {

    /* renamed from: a  reason: collision with root package name */
    public final f f20975a;

    public a(f fVar) {
        this.f20975a = fVar;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th2) {
        f fVar = this.f20975a;
        if (fVar != null && fVar.o() != null && fVar.o().c() != null) {
            fVar.o().c().a(false, th2);
        }
    }
}
