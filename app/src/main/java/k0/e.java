package k0;

import java.lang.reflect.Method;

/* compiled from: ActivityRecreator.java */
/* loaded from: classes.dex */
public final class e implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Object f19465a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f19466b;

    public e(Object obj, Object obj2) {
        this.f19465a = obj;
        this.f19466b = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            Method method = f.f19469d;
            Object obj = this.f19466b;
            Object obj2 = this.f19465a;
            if (method != null) {
                method.invoke(obj2, obj, Boolean.FALSE, "AppCompat recreation");
            } else {
                f.f19470e.invoke(obj2, obj, Boolean.FALSE);
            }
        } catch (RuntimeException e10) {
            if (e10.getClass() == RuntimeException.class && e10.getMessage() != null && e10.getMessage().startsWith("Unable to stop")) {
                throw e10;
            }
        } catch (Throwable unused) {
        }
    }
}
