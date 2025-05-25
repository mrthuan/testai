package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.c;
import java.util.HashMap;
import java.util.List;

@Deprecated
/* loaded from: classes.dex */
class ReflectiveGenericLifecycleObserver implements n {

    /* renamed from: a  reason: collision with root package name */
    public final Object f4005a;

    /* renamed from: b  reason: collision with root package name */
    public final c.a f4006b;

    public ReflectiveGenericLifecycleObserver(Object obj) {
        this.f4005a = obj;
        this.f4006b = c.c.b(obj.getClass());
    }

    @Override // androidx.lifecycle.n
    public final void d(p pVar, Lifecycle.Event event) {
        HashMap hashMap = this.f4006b.f4032a;
        Object obj = this.f4005a;
        c.a.a((List) hashMap.get(event), pVar, event, obj);
        c.a.a((List) hashMap.get(Lifecycle.Event.ON_ANY), pVar, event, obj);
    }
}
