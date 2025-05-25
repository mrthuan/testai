package pdf.pdfreader.viewer.editor.free.ui.dialog;

import android.text.InputFilter;
import android.text.Spanned;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import lib.zj.office.fc.openxml4j.opc.PackagingURIHelper;

/* compiled from: RenameDialog.kt */
/* loaded from: classes3.dex */
public final class l implements InputFilter {

    /* renamed from: a  reason: collision with root package name */
    public static final List<Character> f27648a = ge.a.I('\"', '*', Character.valueOf(PackagingURIHelper.FORWARD_SLASH_CHAR), ':', '<', '>', '?', '\\', '|', (char) 127);

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i10, int i11, Spanned dest, int i12, int i13) {
        boolean z10;
        kotlin.jvm.internal.g.e(dest, "dest");
        if (charSequence != null) {
            if (charSequence.length() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                if (f27648a.contains(Character.valueOf(kotlin.text.l.o0(charSequence)))) {
                    return "";
                }
            }
            String obj = dest.toString();
            Charset charset = StandardCharsets.UTF_8;
            kotlin.jvm.internal.g.d(charset, ea.a.p("ZlQNXzg=", "GBKH80Pu"));
            byte[] bytes = obj.getBytes(charset);
            kotlin.jvm.internal.g.d(bytes, ea.a.p("R2gic1NhESAYYUJhR2w3biMuYXQ0aS1nUC4sZUxCE3RWc2NjG2EQcxd0KQ==", "yK8jVFSm"));
            if (bytes.length > 240) {
                return "";
            }
        }
        return charSequence;
    }
}
