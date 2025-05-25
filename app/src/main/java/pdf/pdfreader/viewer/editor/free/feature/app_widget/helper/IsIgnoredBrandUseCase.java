package pdf.pdfreader.viewer.editor.free.feature.app_widget.helper;

import android.os.Build;
import com.google.android.gms.common.api.Api;
import kotlin.Pair;
import kotlin.text.k;

/* compiled from: IsIgnoredBrandUseCase.kt */
/* loaded from: classes3.dex */
public final class IsIgnoredBrandUseCase {

    /* renamed from: a  reason: collision with root package name */
    public static final tf.c<Pair<String, Integer>[]> f24785a = kotlin.a.a(new cg.a<Pair<? extends String, ? extends Integer>[]>() { // from class: pdf.pdfreader.viewer.editor.free.feature.app_widget.helper.IsIgnoredBrandUseCase$Companion$ignoredBrandList$2
        @Override // cg.a
        public final Pair<? extends String, ? extends Integer>[] invoke() {
            return new Pair[]{new Pair<>(ea.a.p("FGkpbyNp", "pllHNdyh"), 28), new Pair<>(ea.a.p("QWUvbWk=", "L5czJYMe"), 28), new Pair<>(ea.a.p("P29Sbw==", "y36FsrNE"), 28), new Pair<>(ea.a.p("UWwqYxhzCmEAaw==", "9SRNZQkE"), 28), new Pair<>(ea.a.p("EmlFbw==", "YDd32DqY"), Integer.valueOf((int) Api.BaseClientBuilder.API_PRIORITY_OTHER)), new Pair<>(ea.a.p("XmUienU=", "GXaaHGNy"), Integer.valueOf((int) Api.BaseClientBuilder.API_PRIORITY_OTHER)), new Pair<>(ea.a.p("X2UlbwVv", "JS5pM84d"), Integer.valueOf((int) Api.BaseClientBuilder.API_PRIORITY_OTHER))};
        }
    });

    public static boolean a() {
        Pair<String, Integer>[] value;
        boolean z10;
        for (Pair<String, Integer> pair : f24785a.getValue()) {
            String str = Build.BRAND;
            kotlin.jvm.internal.g.d(str, ea.a.p("cVIKTkQ=", "fuaigrpu"));
            if (k.O(str, pair.getFirst(), true) && Build.VERSION.SDK_INT <= pair.getSecond().intValue()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                return true;
            }
        }
        return false;
    }
}
