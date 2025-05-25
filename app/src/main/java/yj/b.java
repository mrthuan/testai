package yj;

import net.lingala.zip4j.exception.ZipException;
import yj.d;

/* compiled from: AsyncZipTask.java */
/* loaded from: classes3.dex */
public final class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Object f32166a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ c f32167b;

    public b(d dVar, d.a aVar) {
        this.f32167b = dVar;
        this.f32166a = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        c cVar = this.f32167b;
        try {
            cVar.b(this.f32166a, cVar.f32168a);
        } catch (ZipException unused) {
        } catch (Throwable th2) {
            cVar.c.shutdown();
            throw th2;
        }
        cVar.c.shutdown();
    }
}
