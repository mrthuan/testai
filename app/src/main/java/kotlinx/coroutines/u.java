package kotlinx.coroutines;

import kotlin.coroutines.CoroutineContext;

/* compiled from: CoroutineExceptionHandler.kt */
/* loaded from: classes.dex */
public interface u extends CoroutineContext.a {

    /* compiled from: CoroutineExceptionHandler.kt */
    /* loaded from: classes.dex */
    public static final class a implements CoroutineContext.b<u> {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ a f20269a = new a();
    }

    void R(CoroutineContext coroutineContext, Throwable th2);
}
