package pdf.pdfreader.viewer.editor.free.utils;

import android.text.TextUtils;
import java.io.File;

/* compiled from: PrintUtil.kt */
/* loaded from: classes3.dex */
public final class PrintUtil {
    public static void a(File file, String str, u0 u0Var) {
        if (file.exists() && !TextUtils.isEmpty(str)) {
            u0Var.onStart();
            w0.a().c.execute(new androidx.emoji2.text.h(10, file, str, u0Var));
            return;
        }
        u0Var.a(null);
        androidx.activity.f.q("Q3IibgcgDW4lcl10DCAwaShlEm4pdGNmHXUdZA==", "rszQ5wdC", dp.a.a());
    }
}
