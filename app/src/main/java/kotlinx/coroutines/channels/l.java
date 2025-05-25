package kotlinx.coroutines.channels;

import java.util.concurrent.CancellationException;

/* compiled from: Channel.kt */
/* loaded from: classes.dex */
public interface l<E> {
    void b(CancellationException cancellationException);

    Object e();

    d<E> iterator();

    Object j(kotlin.coroutines.c<? super f<? extends E>> cVar);
}
