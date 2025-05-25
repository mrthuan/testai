package pdf.pdfreader.viewer.editor.free.ui.dialog;

import android.text.InputFilter;
import android.text.Spanned;
import java.util.regex.Pattern;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class f2 implements InputFilter {
    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i10, int i11, Spanned spanned, int i12, int i13) {
        if (charSequence != null) {
            if (!Pattern.matches(ea.a.p("J1sYLTFdKw==", "mXy9O1ri"), charSequence)) {
                return "";
            }
            return charSequence;
        }
        return null;
    }
}
