package l6;

import android.graphics.RectF;
import java.util.Comparator;
import kotlin.jvm.internal.g;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements Comparator {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f20519a;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f20519a) {
            case 0:
                a aVar = (a) obj;
                a o22 = (a) obj2;
                g.d(o22, "o2");
                aVar.getClass();
                Long l10 = aVar.c;
                if (l10 == null) {
                    return -1;
                }
                long longValue = l10.longValue();
                int i10 = 1;
                Long l11 = o22.c;
                if (l11 != null) {
                    int i11 = (l11.longValue() > longValue ? 1 : (l11.longValue() == longValue ? 0 : -1));
                    if (i11 < 0) {
                        return -1;
                    }
                    if (i11 == 0) {
                        i10 = 0;
                    }
                }
                return i10;
            default:
                return Float.compare(((RectF) obj).top, ((RectF) obj2).top);
        }
    }
}
