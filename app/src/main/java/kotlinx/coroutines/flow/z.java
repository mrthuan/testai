package kotlinx.coroutines.flow;

/* compiled from: SharingStarted.kt */
/* loaded from: classes.dex */
public final class z implements y {
    @Override // kotlinx.coroutines.flow.y
    public final c<SharingCommand> a(a0<Integer> a0Var) {
        return new e(SharingCommand.START);
    }

    public final String toString() {
        return "SharingStarted.Eagerly";
    }
}
