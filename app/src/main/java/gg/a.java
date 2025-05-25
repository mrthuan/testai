package gg;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import kotlin.jvm.internal.g;

/* compiled from: PlatformThreadLocalRandom.kt */
/* loaded from: classes.dex */
public final class a extends fg.a {
    @Override // fg.a
    public final Random a() {
        ThreadLocalRandom current = ThreadLocalRandom.current();
        g.d(current, "current()");
        return current;
    }

    @Override // kotlin.random.Random
    public final double nextDouble(double d10) {
        return ThreadLocalRandom.current().nextDouble(d10);
    }

    @Override // kotlin.random.Random
    public final int nextInt(int i10, int i11) {
        return ThreadLocalRandom.current().nextInt(i10, i11);
    }

    @Override // kotlin.random.Random
    public final long nextLong(long j10) {
        return ThreadLocalRandom.current().nextLong(j10);
    }

    @Override // kotlin.random.Random
    public final long nextLong(long j10, long j11) {
        return ThreadLocalRandom.current().nextLong(j10, j11);
    }
}
