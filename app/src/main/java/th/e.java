package th;

import java.util.HashMap;
import java.util.Hashtable;
import lib.zj.office.java.awt.Rectangle;
import zh.f;

/* compiled from: PGStyle.java */
/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public Rectangle f30047a;

    /* renamed from: b  reason: collision with root package name */
    public f f30048b;
    public final HashMap c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    public Hashtable f30049d;

    public final void a() {
        f fVar = this.f30048b;
        if (fVar != null) {
            ((zh.c) fVar).f32378d = null;
        }
        HashMap hashMap = this.c;
        if (hashMap != null) {
            hashMap.clear();
        }
        Hashtable hashtable = this.f30049d;
        if (hashtable != null) {
            hashtable.clear();
        }
    }

    public final int b(int i10) {
        Integer num;
        HashMap hashMap = this.c;
        if (!hashMap.isEmpty() && (num = (Integer) hashMap.get(Integer.valueOf(i10))) != null) {
            return num.intValue();
        }
        return -1;
    }
}
