package k3;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: BaseAnimatableValue.java */
/* loaded from: classes.dex */
public abstract class m implements l {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f19571a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f19572b;

    public /* synthetic */ m(Object obj, int i10) {
        this.f19571a = i10;
        this.f19572b = obj;
    }

    @Override // k3.l
    public final List b() {
        return (List) this.f19572b;
    }

    @Override // k3.l
    public final boolean c() {
        Object obj = this.f19572b;
        if (((List) obj).isEmpty()) {
            return true;
        }
        if (((List) obj).size() == 1 && ((q3.a) ((List) obj).get(0)).c()) {
            return true;
        }
        return false;
    }

    public final String toString() {
        switch (this.f19571a) {
            case 0:
                StringBuilder sb2 = new StringBuilder();
                List list = (List) this.f19572b;
                if (!list.isEmpty()) {
                    sb2.append("values=");
                    sb2.append(Arrays.toString(list.toArray()));
                }
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public m(Float f10) {
        this(Collections.singletonList(new q3.a(f10)), 0);
        this.f19571a = 0;
    }
}
