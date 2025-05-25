package b6;

import com.facebook.appevents.ml.ModelManager;

/* compiled from: IntegrityManager.kt */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f5330a = new c();

    /* renamed from: b  reason: collision with root package name */
    public static boolean f5331b;
    public static boolean c;

    public final boolean a(String str) {
        String str2;
        if (k6.a.b(this)) {
            return false;
        }
        try {
            String str3 = null;
            if (!k6.a.b(this)) {
                float[] fArr = new float[30];
                for (int i10 = 0; i10 < 30; i10++) {
                    fArr[i10] = 0.0f;
                }
                String[] f10 = ModelManager.f(ModelManager.Task.MTML_INTEGRITY_DETECT, new float[][]{fArr}, new String[]{str});
                if (f10 == null || (str2 = f10[0]) == null) {
                    str3 = "none";
                } else {
                    str3 = str2;
                }
            }
            return !kotlin.jvm.internal.g.a("none", str3);
        } catch (Throwable th2) {
            k6.a.a(this, th2);
            return false;
        }
    }
}
