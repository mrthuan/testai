package kotlinx.coroutines.internal;

import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.f1;

/* compiled from: MainDispatchers.kt */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    public static final f1 f20194a;

    static {
        String str;
        Object next;
        f1 b10;
        int i10 = s.f20199a;
        try {
            str = System.getProperty("kotlinx.coroutines.fast.service.loader");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str != null) {
            Boolean.parseBoolean(str);
        }
        List<? extends k> i02 = kotlin.sequences.a.i0(jg.k.f0(android.support.v4.media.session.h.h()));
        Iterator it = i02.iterator();
        if (!it.hasNext()) {
            next = null;
        } else {
            next = it.next();
            if (it.hasNext()) {
                int c = ((k) next).c();
                do {
                    Object next2 = it.next();
                    int c10 = ((k) next2).c();
                    if (c < c10) {
                        next = next2;
                        c = c10;
                    }
                } while (it.hasNext());
            }
        }
        k kVar = (k) next;
        if (kVar != null && (b10 = kVar.b(i02)) != null) {
            f20194a = b10;
            return;
        }
        throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
    }
}
