package w1;

import com.google.android.gms.ads.mediation.MediationNativeListener;
import com.google.android.gms.ads.mediation.customevent.CustomEventAdapter;
import com.google.android.gms.ads.mediation.customevent.CustomEventNativeListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import lib.zj.office.java.awt.Rectangle;

/* compiled from: InvalidationLiveDataContainer.java */
/* loaded from: classes.dex */
public final class f implements CustomEventNativeListener {

    /* renamed from: d  reason: collision with root package name */
    public static f f30905d;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f30906a;

    /* renamed from: b  reason: collision with root package name */
    public Object f30907b;
    public Object c;

    public f(CustomEventAdapter customEventAdapter, MediationNativeListener mediationNativeListener) {
        this.f30906a = 4;
        this.f30907b = customEventAdapter;
        this.c = mediationNativeListener;
    }

    public static f b() {
        if (f30905d == null) {
            f30905d = new f(5);
        }
        return f30905d;
    }

    public final int a(String str) {
        if (((List) this.f30907b) == null) {
            this.f30907b = new ArrayList();
        }
        int indexOf = ((List) this.f30907b).indexOf(str);
        if (indexOf < 0) {
            int size = ((List) this.f30907b).size();
            ((List) this.f30907b).add(str);
            return size;
        }
        return indexOf;
    }

    public final void c(Class cls, Class cls2, Class cls3, List list) {
        synchronized (((y.b) this.c)) {
            ((y.b) this.c).put(new p4.i(cls, cls2, cls3), list);
        }
    }

    public final String toString() {
        switch (this.f30906a) {
            case 6:
                return "  Region\n    bounds: " + ((Rectangle) this.f30907b) + "\n    region: " + ((Rectangle) this.c);
            default:
                return super.toString();
        }
    }

    public f(int i10) {
        this.f30906a = i10;
        if (i10 == 2) {
            this.f30907b = new AtomicReference();
            this.c = new y.b();
        } else if (i10 != 5) {
            if (i10 != 7) {
                this.f30907b = new HashMap();
                this.c = new HashMap();
                return;
            }
            this.f30907b = new ArrayList();
            this.c = new xj.c();
        }
    }

    public f(wi.c cVar) {
        this.f30906a = 6;
        cVar.readUnsignedInt();
        cVar.readUnsignedInt();
        cVar.readUnsignedInt();
        int readUnsignedInt = (int) cVar.readUnsignedInt();
        this.f30907b = cVar.m();
        this.c = cVar.m();
        for (int i10 = 16; i10 < readUnsignedInt; i10 += 16) {
            cVar.m();
        }
    }
}
