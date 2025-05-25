package kotlinx.coroutines.android;

import kotlinx.coroutines.g;
import kotlinx.coroutines.h;

/* compiled from: Runnable.kt */
/* loaded from: classes.dex */
public final class c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ g f19983a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ d f19984b;

    public c(h hVar, d dVar) {
        this.f19983a = hVar;
        this.f19984b = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f19983a.z(this.f19984b, tf.d.f30009a);
    }
}
