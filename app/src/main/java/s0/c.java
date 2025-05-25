package s0;

import android.os.Bundle;
import android.util.Size;
import android.util.SizeF;

/* compiled from: Bundle.kt */
/* loaded from: classes.dex */
public final class c {
    public static final void a(Bundle bundle, String key, Size size) {
        kotlin.jvm.internal.g.e(bundle, "bundle");
        kotlin.jvm.internal.g.e(key, "key");
        bundle.putSize(key, size);
    }

    public static final void b(Bundle bundle, String key, SizeF sizeF) {
        kotlin.jvm.internal.g.e(bundle, "bundle");
        kotlin.jvm.internal.g.e(key, "key");
        bundle.putSizeF(key, sizeF);
    }
}
