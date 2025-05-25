package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;

/* compiled from: DefaultLifecycleObserverAdapter.kt */
/* loaded from: classes.dex */
public final class DefaultLifecycleObserverAdapter implements n {

    /* renamed from: a  reason: collision with root package name */
    public final e f3973a;

    /* renamed from: b  reason: collision with root package name */
    public final n f3974b;

    /* compiled from: DefaultLifecycleObserverAdapter.kt */
    /* loaded from: classes.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f3975a;

        static {
            int[] iArr = new int[Lifecycle.Event.values().length];
            try {
                iArr[Lifecycle.Event.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Lifecycle.Event.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Lifecycle.Event.ON_RESUME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Lifecycle.Event.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Lifecycle.Event.ON_STOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[Lifecycle.Event.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[Lifecycle.Event.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f3975a = iArr;
        }
    }

    public DefaultLifecycleObserverAdapter(e defaultLifecycleObserver, n nVar) {
        kotlin.jvm.internal.g.e(defaultLifecycleObserver, "defaultLifecycleObserver");
        this.f3973a = defaultLifecycleObserver;
        this.f3974b = nVar;
    }

    @Override // androidx.lifecycle.n
    public final void d(p pVar, Lifecycle.Event event) {
        int i10 = a.f3975a[event.ordinal()];
        e eVar = this.f3973a;
        switch (i10) {
            case 1:
                eVar.b(pVar);
                break;
            case 2:
                eVar.k(pVar);
                break;
            case 3:
                eVar.a(pVar);
                break;
            case 4:
                eVar.e(pVar);
                break;
            case 5:
                eVar.h(pVar);
                break;
            case 6:
                eVar.i(pVar);
                break;
            case 7:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        n nVar = this.f3974b;
        if (nVar != null) {
            nVar.d(pVar, event);
        }
    }
}
