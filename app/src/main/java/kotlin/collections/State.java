package kotlin.collections;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AbstractIterator.kt */
/* loaded from: classes.dex */
final class State {
    public static final State Done;
    public static final State Failed;
    public static final State NotReady;
    public static final State Ready;

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ State[] f19913a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ xf.a f19914b;

    static {
        State state = new State("Ready", 0);
        Ready = state;
        State state2 = new State("NotReady", 1);
        NotReady = state2;
        State state3 = new State("Done", 2);
        Done = state3;
        State state4 = new State("Failed", 3);
        Failed = state4;
        State[] stateArr = {state, state2, state3, state4};
        f19913a = stateArr;
        f19914b = kotlin.enums.a.a(stateArr);
    }

    public State(String str, int i10) {
    }

    public static xf.a<State> getEntries() {
        return f19914b;
    }

    public static State valueOf(String str) {
        return (State) Enum.valueOf(State.class, str);
    }

    public static State[] values() {
        return (State[]) f19913a.clone();
    }
}
