package ca;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-measurement-api@@21.2.2 */
/* loaded from: classes2.dex */
public final class a extends ThreadPoolExecutor {
    public a(TimeUnit timeUnit, ArrayBlockingQueue arrayBlockingQueue) {
        super(0, 1, 30L, timeUnit, arrayBlockingQueue);
    }
}
