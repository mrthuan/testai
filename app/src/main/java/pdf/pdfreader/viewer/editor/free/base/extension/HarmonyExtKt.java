package pdf.pdfreader.viewer.editor.free.base.extension;

import android.text.TextUtils;
import androidx.activity.s;
import java.lang.reflect.Method;
import kotlin.Result;
import kotlin.a;
import kotlin.jvm.internal.g;
import kotlin.text.j;
import tf.c;

/* compiled from: HarmonyExt.kt */
/* loaded from: classes3.dex */
public final class HarmonyExtKt {

    /* renamed from: a  reason: collision with root package name */
    public static final c f24026a = a.a(new cg.a<Boolean>() { // from class: pdf.pdfreader.viewer.editor.free.base.extension.HarmonyExtKt$isHarmonyOS$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // cg.a
        public final Boolean invoke() {
            Object m13constructorimpl;
            try {
                Class<?> cls = Class.forName(ea.a.p("JG9aLlB1JnctaUhzTXMjZVUuEHUgbFJFeA==", "PPG78G4t"));
                Object invoke = cls.getMethod(ea.a.p("KGVFTwpCRWE0ZA==", "2o2tLLlM"), new Class[0]).invoke(cls, new Object[0]);
                m13constructorimpl = Result.m13constructorimpl(Boolean.valueOf(j.G(ea.a.p("J2FDbRZueQ==", "FpDguLZ6"), invoke != null ? invoke.toString() : null, true)));
            } catch (Throwable th2) {
                m13constructorimpl = Result.m13constructorimpl(s.v(th2));
            }
            return Boolean.valueOf(Result.m19isSuccessimpl(m13constructorimpl));
        }
    });

    static {
        a.a(new cg.a<String>() { // from class: pdf.pdfreader.viewer.editor.free.base.extension.HarmonyExtKt$harmonyVersion$2
            @Override // cg.a
            public final String invoke() {
                String p10 = ea.a.p("IncwcyIuOHUhbAIuRGw2dF5vIG1ndlNyB2kebg==", "9xJoAZ13");
                String value = HarmonyVersionCode.NOT_HARMONY.getValue();
                c cVar = HarmonyExtKt.f24026a;
                try {
                    Class<?> cls = Class.forName(ea.a.p("Um4vchxpBi4dcxpTEHMiZSlQQG82ZTF0EGVz", "y1lpDSvM"));
                    Method declaredMethod = cls.getDeclaredMethod(ea.a.p("VGV0", "b30feaHq"), String.class);
                    g.d(declaredMethod, ea.a.p("PHBybAMuUGUuRC9jGWEaZVFNC3QtbwEoVmcgdHgsblM7clhuHjoNYzZhOXNbagl2VCk=", "WdmQtEZN"));
                    Object invoke = declaredMethod.invoke(cls, p10);
                    g.c(invoke, ea.a.p("IXVdbFljVm40bz4gF2VIY1RzGiAxb0VuHG57bhxsIyA7eUFlWWtYdDZpJC4mdBppW2c=", "6gCEsViO"));
                    String str = (String) invoke;
                    return TextUtils.isEmpty(str) ? value : str;
                } catch (Throwable th2) {
                    th2.printStackTrace();
                    return value;
                }
            }
        });
    }
}
