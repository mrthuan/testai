package kotlin.coroutines.jvm.internal;

import androidx.activity.s;
import com.tom_roush.fontbox.ttf.NamingTable;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.Result;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.g;
import lib.zj.office.fc.openxml4j.opc.PackagingURIHelper;
import tf.d;
import wf.b;
import wf.d;

/* compiled from: ContinuationImpl.kt */
/* loaded from: classes.dex */
public abstract class BaseContinuationImpl implements c<Object>, b, Serializable {
    private final c<Object> completion;

    public BaseContinuationImpl(c<Object> cVar) {
        this.completion = cVar;
    }

    public c<d> create(c<?> completion) {
        g.e(completion, "completion");
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    @Override // wf.b
    public b getCallerFrame() {
        c<Object> cVar = this.completion;
        if (cVar instanceof b) {
            return (b) cVar;
        }
        return null;
    }

    public final c<Object> getCompletion() {
        return this.completion;
    }

    @Override // kotlin.coroutines.c
    public abstract /* synthetic */ CoroutineContext getContext();

    public StackTraceElement getStackTraceElement() {
        int i10;
        String str;
        Object obj;
        Object obj2;
        Object obj3;
        Integer num;
        int i11;
        wf.c cVar = (wf.c) getClass().getAnnotation(wf.c.class);
        String str2 = null;
        if (cVar == null) {
            return null;
        }
        int v10 = cVar.v();
        if (v10 <= 1) {
            int i12 = -1;
            try {
                Field declaredField = getClass().getDeclaredField("label");
                declaredField.setAccessible(true);
                Object obj4 = declaredField.get(this);
                if (obj4 instanceof Integer) {
                    num = (Integer) obj4;
                } else {
                    num = null;
                }
                if (num != null) {
                    i11 = num.intValue();
                } else {
                    i11 = 0;
                }
                i10 = i11 - 1;
            } catch (Exception unused) {
                i10 = -1;
            }
            if (i10 >= 0) {
                i12 = cVar.l()[i10];
            }
            d.a aVar = wf.d.f31212b;
            d.a aVar2 = wf.d.f31211a;
            if (aVar == null) {
                try {
                    d.a aVar3 = new d.a(Class.class.getDeclaredMethod("getModule", new Class[0]), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", new Class[0]), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod(NamingTable.TAG, new Class[0]));
                    wf.d.f31212b = aVar3;
                    aVar = aVar3;
                } catch (Exception unused2) {
                    wf.d.f31212b = aVar2;
                    aVar = aVar2;
                }
            }
            if (aVar != aVar2) {
                Method method = aVar.f31213a;
                if (method != null) {
                    obj = method.invoke(getClass(), new Object[0]);
                } else {
                    obj = null;
                }
                if (obj != null) {
                    Method method2 = aVar.f31214b;
                    if (method2 != null) {
                        obj2 = method2.invoke(obj, new Object[0]);
                    } else {
                        obj2 = null;
                    }
                    if (obj2 != null) {
                        Method method3 = aVar.c;
                        if (method3 != null) {
                            obj3 = method3.invoke(obj2, new Object[0]);
                        } else {
                            obj3 = null;
                        }
                        if (obj3 instanceof String) {
                            str2 = obj3;
                        }
                    }
                }
            }
            if (str2 == null) {
                str = cVar.c();
            } else {
                str = str2 + PackagingURIHelper.FORWARD_SLASH_CHAR + cVar.c();
            }
            return new StackTraceElement(str, cVar.m(), cVar.f(), i12);
        }
        throw new IllegalStateException(("Debug metadata version mismatch. Expected: 1, got " + v10 + ". Please update the Kotlin standard library.").toString());
    }

    public abstract Object invokeSuspend(Object obj);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.c
    public final void resumeWith(Object obj) {
        Object invokeSuspend;
        c cVar = this;
        while (true) {
            BaseContinuationImpl baseContinuationImpl = (BaseContinuationImpl) cVar;
            c cVar2 = baseContinuationImpl.completion;
            g.b(cVar2);
            try {
                invokeSuspend = baseContinuationImpl.invokeSuspend(obj);
            } catch (Throwable th2) {
                obj = Result.m13constructorimpl(s.v(th2));
            }
            if (invokeSuspend == CoroutineSingletons.COROUTINE_SUSPENDED) {
                return;
            }
            obj = Result.m13constructorimpl(invokeSuspend);
            baseContinuationImpl.releaseIntercepted();
            if (cVar2 instanceof BaseContinuationImpl) {
                cVar = cVar2;
            } else {
                cVar2.resumeWith(obj);
                return;
            }
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Continuation at ");
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        sb2.append(stackTraceElement);
        return sb2.toString();
    }

    public c<tf.d> create(Object obj, c<?> completion) {
        g.e(completion, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public void releaseIntercepted() {
    }
}
