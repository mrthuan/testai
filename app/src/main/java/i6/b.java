package i6;

import com.facebook.internal.instrument.InstrumentData;
import java.util.Comparator;
import kotlin.jvm.internal.g;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        InstrumentData instrumentData = (InstrumentData) obj;
        InstrumentData o22 = (InstrumentData) obj2;
        if (!k6.a.b(d.class)) {
            try {
                g.d(o22, "o2");
                return instrumentData.a(o22);
            } catch (Throwable th2) {
                k6.a.a(d.class, th2);
            }
        }
        return 0;
    }
}
