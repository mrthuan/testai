package androidx.concurrent.futures;

import z.b;

/* compiled from: CallbackToFutureAdapter.java */
/* loaded from: classes.dex */
public final class a<T> {

    /* renamed from: a  reason: collision with root package name */
    public Object f2749a;

    /* renamed from: b  reason: collision with root package name */
    public z.a<T> f2750b;
    public b<Void> c = new b<>();

    /* renamed from: d  reason: collision with root package name */
    public boolean f2751d;

    public final void finalize() {
        b<Void> bVar;
        z.a<T> aVar = this.f2750b;
        if (aVar != null && !aVar.isDone()) {
            final String str = "The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.f2749a;
            aVar.f32213b.i(new Throwable(str) { // from class: androidx.concurrent.futures.CallbackToFutureAdapter$FutureGarbageCollectedException
                @Override // java.lang.Throwable
                public synchronized Throwable fillInStackTrace() {
                    return this;
                }
            });
        }
        if (!this.f2751d && (bVar = this.c) != null) {
            bVar.h(null);
        }
    }
}
