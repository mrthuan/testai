package ua;

import a5.d;

/* compiled from: MiddleOutFallbackStrategy.java */
/* loaded from: classes2.dex */
public final class a implements b {

    /* renamed from: a  reason: collision with root package name */
    public final b[] f30274a;

    /* renamed from: b  reason: collision with root package name */
    public final d f30275b = new d(0);

    public a(b... bVarArr) {
        this.f30274a = bVarArr;
    }

    @Override // ua.b
    public final StackTraceElement[] f(StackTraceElement[] stackTraceElementArr) {
        b[] bVarArr;
        if (stackTraceElementArr.length <= 1024) {
            return stackTraceElementArr;
        }
        StackTraceElement[] stackTraceElementArr2 = stackTraceElementArr;
        for (b bVar : this.f30274a) {
            if (stackTraceElementArr2.length <= 1024) {
                break;
            }
            stackTraceElementArr2 = bVar.f(stackTraceElementArr);
        }
        if (stackTraceElementArr2.length > 1024) {
            return this.f30275b.f(stackTraceElementArr2);
        }
        return stackTraceElementArr2;
    }
}
