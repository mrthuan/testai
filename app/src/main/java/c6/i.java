package c6;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.util.List;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.Ref$ObjectRef;

/* compiled from: HashUtils.kt */
/* loaded from: classes.dex */
public final class i implements InvocationHandler {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Object f5615a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Ref$ObjectRef<String> f5616b;
    public final /* synthetic */ ReentrantLock c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Condition f5617d;

    public i(Object obj, Ref$ObjectRef<String> ref$ObjectRef, ReentrantLock reentrantLock, Condition condition) {
        this.f5615a = obj;
        this.f5616b = ref$ObjectRef;
        this.c = reentrantLock;
        this.f5617d = condition;
    }

    /* JADX WARN: Type inference failed for: r9v9, types: [T, java.lang.String] */
    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objects) {
        ReentrantLock reentrantLock = this.c;
        kotlin.jvm.internal.g.e(method, "method");
        kotlin.jvm.internal.g.e(objects, "objects");
        try {
            if (kotlin.jvm.internal.g.a(method.getName(), "onChecksumsReady") && objects.length == 1) {
                Object obj2 = objects[0];
                if (obj2 instanceof List) {
                    kotlin.jvm.internal.g.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<*>");
                    for (Object obj3 : (List) obj2) {
                        if (obj3 != null) {
                            Method method2 = obj3.getClass().getMethod("getSplitName", new Class[0]);
                            kotlin.jvm.internal.g.d(method2, "c.javaClass.getMethod(\"getSplitName\")");
                            Method method3 = obj3.getClass().getMethod("getType", new Class[0]);
                            kotlin.jvm.internal.g.d(method3, "c.javaClass.getMethod(\"getType\")");
                            if (method2.invoke(obj3, new Object[0]) == null && kotlin.jvm.internal.g.a(method3.invoke(obj3, new Object[0]), this.f5615a)) {
                                Method method4 = obj3.getClass().getMethod("getValue", new Class[0]);
                                kotlin.jvm.internal.g.d(method4, "c.javaClass.getMethod(\"getValue\")");
                                Object invoke = method4.invoke(obj3, new Object[0]);
                                kotlin.jvm.internal.g.c(invoke, "null cannot be cast to non-null type kotlin.ByteArray");
                                this.f5616b.element = new BigInteger(1, (byte[]) invoke).toString(16);
                                reentrantLock.lock();
                                this.f5617d.signalAll();
                                reentrantLock.unlock();
                                return null;
                            }
                        }
                    }
                }
            }
        } catch (Throwable unused) {
            j jVar = j.f5618a;
        }
        return null;
    }
}
