package j6;

import android.graphics.RectF;
import com.facebook.internal.instrument.InstrumentData;
import java.io.File;
import java.nio.charset.Charset;
import java.util.Comparator;
import kotlin.jvm.internal.g;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements Comparator {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f19042a;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f19042a) {
            case 0:
                InstrumentData o22 = (InstrumentData) obj2;
                g.d(o22, "o2");
                return ((InstrumentData) obj).a(o22);
            case 1:
                Charset charset = ra.c.f29488d;
                return ((File) obj2).getName().compareTo(((File) obj).getName());
            default:
                return Float.compare(((RectF) obj).top, ((RectF) obj2).top);
        }
    }
}
