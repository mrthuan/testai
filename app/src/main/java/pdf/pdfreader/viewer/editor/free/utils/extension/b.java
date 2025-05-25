package pdf.pdfreader.viewer.editor.free.utils.extension;

import android.annotation.SuppressLint;
import android.widget.TextView;
import kotlin.text.k;

/* compiled from: Common.kt */
/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static long f28690a;

    @SuppressLint({"SetTextI18n"})
    public static final void a(TextView textView, String str, String str2) {
        boolean z10;
        kotlin.jvm.internal.g.e(textView, "<this>");
        if (str == null) {
            return;
        }
        if (str2 != null) {
            String l02 = k.l0(str2, ea.a.p("Lg==", "HtsCVR6n"), "");
            if (l02.length() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                textView.setText(str + "." + l02);
                return;
            }
        }
        textView.setText(str);
    }
}
