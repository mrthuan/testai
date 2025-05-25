package f2;

import android.view.View;
import android.view.WindowId;

/* compiled from: WindowIdApi18.java */
/* loaded from: classes.dex */
public final class e0 implements f0 {

    /* renamed from: a  reason: collision with root package name */
    public final WindowId f17021a;

    public e0(View view) {
        this.f17021a = view.getWindowId();
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof e0) && ((e0) obj).f17021a.equals(this.f17021a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f17021a.hashCode();
    }
}
