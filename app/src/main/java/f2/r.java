package f2;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: TransitionValues.java */
/* loaded from: classes.dex */
public final class r {

    /* renamed from: b  reason: collision with root package name */
    public final View f17076b;

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f17075a = new HashMap();
    public final ArrayList<k> c = new ArrayList<>();

    @Deprecated
    public r() {
    }

    public final boolean equals(Object obj) {
        if (obj instanceof r) {
            r rVar = (r) obj;
            if (this.f17076b == rVar.f17076b && this.f17075a.equals(rVar.f17075a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.f17075a.hashCode() + (this.f17076b.hashCode() * 31);
    }

    public final String toString() {
        HashMap hashMap;
        StringBuilder g10 = a0.d.g("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n", "    view = ");
        g10.append(this.f17076b);
        g10.append("\n");
        String c = a6.h.c(g10.toString(), "    values:");
        for (String str : this.f17075a.keySet()) {
            c = c + "    " + str + ": " + hashMap.get(str) + "\n";
        }
        return c;
    }

    public r(View view) {
        this.f17076b = view;
    }
}
