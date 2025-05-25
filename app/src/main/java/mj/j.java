package mj;

import android.graphics.RectF;
import java.util.Comparator;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class j implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return Float.compare(((RectF) obj).top, ((RectF) obj2).top);
    }
}
