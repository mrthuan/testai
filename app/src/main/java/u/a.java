package u;

import android.os.Bundle;

/* compiled from: Api33Impl.java */
/* loaded from: classes.dex */
public final class a {
    public static <T> T a(Bundle bundle, String str, Class<T> cls) {
        return (T) bundle.getParcelable(str, cls);
    }
}
