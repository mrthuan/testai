package g1;

import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Queue;
import p4.j;
import w3.k;

/* compiled from: FloatPropertyCompat.java */
/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a  reason: collision with root package name */
    public Serializable f17399a;

    public c(int i10) {
        if (i10 == 2) {
            this.f17399a = new HashSet();
        } else if (i10 != 3) {
            char[] cArr = j.f23703a;
            this.f17399a = new ArrayDeque(20);
        }
    }

    public abstract k a();

    public final k b() {
        k kVar = (k) ((Queue) this.f17399a).poll();
        if (kVar == null) {
            return a();
        }
        return kVar;
    }

    public abstract float c(Object obj);

    public final void d(k kVar) {
        if (((Queue) this.f17399a).size() < 20) {
            ((Queue) this.f17399a).offer(kVar);
        }
    }

    public abstract void e(Object obj, float f10);

    public c(String str) {
        this.f17399a = str;
    }
}
