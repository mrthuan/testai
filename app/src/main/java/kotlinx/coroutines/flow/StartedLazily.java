package kotlinx.coroutines.flow;

/* compiled from: SharingStarted.kt */
/* loaded from: classes.dex */
public final class StartedLazily implements y {
    @Override // kotlinx.coroutines.flow.y
    public final c<SharingCommand> a(a0<Integer> a0Var) {
        return new t(new StartedLazily$command$1(a0Var, null));
    }

    public final String toString() {
        return "SharingStarted.Lazily";
    }
}
