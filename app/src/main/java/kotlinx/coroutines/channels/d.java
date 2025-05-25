package kotlinx.coroutines.channels;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: Channel.kt */
/* loaded from: classes.dex */
public interface d<E> {
    Object a(ContinuationImpl continuationImpl);

    E next();
}
