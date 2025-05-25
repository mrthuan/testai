package b6;

import android.os.Bundle;
import java.util.HashSet;

/* compiled from: BannedParamManager.kt */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: b  reason: collision with root package name */
    public static boolean f5327b;

    /* renamed from: a  reason: collision with root package name */
    public static final a f5326a = new a();
    public static HashSet<String> c = new HashSet<>();

    public static final void a(Bundle bundle) {
        if (k6.a.b(a.class)) {
            return;
        }
        try {
            if (f5327b && bundle != null) {
                for (String str : c) {
                    bundle.remove(str);
                }
            }
        } catch (Throwable th2) {
            k6.a.a(a.class, th2);
        }
    }
}
