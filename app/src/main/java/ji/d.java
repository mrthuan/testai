package ji;

import java.util.HashMap;

/* compiled from: TableFormatManager.java */
/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f19273a = new HashMap(5);

    public final ii.e a(int i10) {
        if (i10 >= 0) {
            HashMap hashMap = this.f19273a;
            if (i10 < hashMap.size()) {
                return (ii.e) hashMap.get(Integer.valueOf(i10));
            }
            return null;
        }
        return null;
    }
}
