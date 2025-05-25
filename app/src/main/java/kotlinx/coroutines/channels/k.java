package kotlinx.coroutines.channels;

import kotlinx.coroutines.internal.q;
import kotlinx.coroutines.s1;

/* compiled from: BufferedChannel.kt */
/* loaded from: classes.dex */
public final class k<E> implements s1 {

    /* renamed from: a  reason: collision with root package name */
    public final kotlinx.coroutines.h<f<? extends E>> f20043a;

    /* JADX WARN: Multi-variable type inference failed */
    public k(kotlinx.coroutines.h<? super f<? extends E>> hVar) {
        this.f20043a = hVar;
    }

    @Override // kotlinx.coroutines.s1
    public final void b(q<?> qVar, int i10) {
        this.f20043a.b(qVar, i10);
    }
}
