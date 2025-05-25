package jf;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* compiled from: RenderPropsImpl.java */
/* loaded from: classes.dex */
public final class o {

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f19201a;

    public o(int i10) {
        if (i10 != 1) {
            if (i10 != 2) {
                this.f19201a = new HashMap(3);
                return;
            } else {
                this.f19201a = new HashMap();
                return;
            }
        }
        this.f19201a = new HashMap();
    }

    public final void a(short s4, Object obj) {
        HashMap hashMap = this.f19201a;
        if (s4 != 3) {
            hashMap.put(Short.valueOf(s4), obj);
            return;
        }
        List list = (List) hashMap.get((short) 3);
        if (list == null) {
            list = new ArrayList();
            hashMap.put(Short.valueOf(s4), list);
        }
        list.add((ki.b) obj);
    }
}
