package fg;

import java.util.Random;
import kotlin.jvm.internal.g;

/* compiled from: PlatformRandom.kt */
/* loaded from: classes.dex */
public final class b extends fg.a {

    /* renamed from: b  reason: collision with root package name */
    public final a f17286b = new a();

    /* compiled from: PlatformRandom.kt */
    /* loaded from: classes.dex */
    public static final class a extends ThreadLocal<Random> {
        @Override // java.lang.ThreadLocal
        public final Random initialValue() {
            return new Random();
        }
    }

    @Override // fg.a
    public final Random a() {
        Random random = this.f17286b.get();
        g.d(random, "implStorage.get()");
        return random;
    }
}
