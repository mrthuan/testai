package fg;

import kotlin.jvm.internal.g;
import kotlin.random.Random;

/* compiled from: PlatformRandom.kt */
/* loaded from: classes.dex */
public abstract class a extends Random {
    public abstract java.util.Random a();

    @Override // kotlin.random.Random
    public final int nextBits(int i10) {
        return ((-i10) >> 31) & (a().nextInt() >>> (32 - i10));
    }

    @Override // kotlin.random.Random
    public final boolean nextBoolean() {
        return a().nextBoolean();
    }

    @Override // kotlin.random.Random
    public final byte[] nextBytes(byte[] array) {
        g.e(array, "array");
        a().nextBytes(array);
        return array;
    }

    @Override // kotlin.random.Random
    public final double nextDouble() {
        return a().nextDouble();
    }

    @Override // kotlin.random.Random
    public final float nextFloat() {
        return a().nextFloat();
    }

    @Override // kotlin.random.Random
    public final int nextInt() {
        return a().nextInt();
    }

    @Override // kotlin.random.Random
    public final long nextLong() {
        return a().nextLong();
    }

    @Override // kotlin.random.Random
    public final int nextInt(int i10) {
        return a().nextInt(i10);
    }
}
