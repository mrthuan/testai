package a5;

/* compiled from: BillingAnalytics.java */
/* loaded from: classes.dex */
public final class d implements ua.b {

    /* renamed from: b  reason: collision with root package name */
    public static d f61b;

    /* renamed from: a  reason: collision with root package name */
    public int f62a = -1;

    public d() {
    }

    @Override // ua.b
    public final StackTraceElement[] f(StackTraceElement[] stackTraceElementArr) {
        int length = stackTraceElementArr.length;
        int i10 = this.f62a;
        if (length <= i10) {
            return stackTraceElementArr;
        }
        int i11 = i10 / 2;
        int i12 = i10 - i11;
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[i10];
        System.arraycopy(stackTraceElementArr, 0, stackTraceElementArr2, 0, i12);
        System.arraycopy(stackTraceElementArr, stackTraceElementArr.length - i11, stackTraceElementArr2, i12, i11);
        return stackTraceElementArr2;
    }

    public d(int i10) {
    }
}
