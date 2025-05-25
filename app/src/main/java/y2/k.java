package y2;

import androidx.work.WorkerParameters;

/* compiled from: StartWorkRunnable.java */
/* loaded from: classes.dex */
public final class k implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final p2.j f32007a;

    /* renamed from: b  reason: collision with root package name */
    public final String f32008b;
    public final WorkerParameters.a c;

    public k(p2.j jVar, String str, WorkerParameters.a aVar) {
        this.f32007a = jVar;
        this.f32008b = str;
        this.c = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f32007a.f23631f.h(this.f32008b, this.c);
    }
}
