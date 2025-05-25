package pdf.pdfreader.viewer.editor.free.decrypt;

import android.content.Context;
import android.widget.EditText;
import android.widget.LinearLayout;
import androidx.fragment.app.w;
import java.util.ArrayList;
import java.util.Iterator;
import pdf.pdfreader.viewer.editor.free.decrypt.DecryptAndCopyUIHelper;
import pdf.pdfreader.viewer.editor.free.ui.dialog.f0;

/* compiled from: DecryptAndCopyUIHelper.kt */
/* loaded from: classes3.dex */
public final class b extends w {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ DecryptAndCopyUIHelper f24249d;

    public b(DecryptAndCopyUIHelper decryptAndCopyUIHelper) {
        this.f24249d = decryptAndCopyUIHelper;
    }

    @Override // oo.a
    public final void a() {
        Object obj;
        Object obj2;
        boolean z10;
        boolean z11;
        DecryptAndCopyUIHelper decryptAndCopyUIHelper = this.f24249d;
        Iterator it = decryptAndCopyUIHelper.f24222g.iterator();
        while (true) {
            obj = null;
            if (it.hasNext()) {
                obj2 = it.next();
                if (((DecryptContainer) obj2).getPdfPreviewEntity().getId() == decryptAndCopyUIHelper.f24224i) {
                    z11 = true;
                    continue;
                } else {
                    z11 = false;
                    continue;
                }
                if (z11) {
                    break;
                }
            } else {
                obj2 = null;
                break;
            }
        }
        DecryptContainer decryptContainer = (DecryptContainer) obj2;
        if (decryptContainer != null) {
            try {
                String path = decryptContainer.getPdfPreviewEntity().getPath();
                kotlin.jvm.internal.g.d(path, ea.a.p("LHVDchxuQ0k0cD90W3AMZmVyC3YsZRJFAHQldAwuHGE7aA==", "FMA3nLul"));
                String B = decryptAndCopyUIHelper.e().B();
                kotlin.jvm.internal.g.d(B, ea.a.p("Jm5BdQ1QQGQeaStsGmdGY1puGmUrdA==", "jVlZ1MbI"));
                if (!decryptAndCopyUIHelper.c(path, B)) {
                    DecryptAndCopyUIHelper.a aVar = decryptAndCopyUIHelper.f24225j;
                    if (aVar != null) {
                        aVar.a();
                    }
                    decryptAndCopyUIHelper.e().g();
                    return;
                }
                String B2 = decryptAndCopyUIHelper.e().B();
                kotlin.jvm.internal.g.d(B2, ea.a.p("Jm5BdQ1QQGQeaStsGmdGY1puGmUrdA==", "jiid2yxy"));
                decryptContainer.setPassword(B2);
            } catch (Exception unused) {
                DecryptAndCopyUIHelper.a aVar2 = decryptAndCopyUIHelper.f24225j;
                if (aVar2 != null) {
                    aVar2.a();
                }
                decryptAndCopyUIHelper.e().g();
                return;
            }
        }
        ArrayList arrayList = decryptAndCopyUIHelper.f24222g;
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (((DecryptContainer) next).getPassword().length() == 0) {
                z10 = true;
                continue;
            } else {
                z10 = false;
                continue;
            }
            if (z10) {
                obj = next;
                break;
            }
        }
        DecryptContainer decryptContainer2 = (DecryptContainer) obj;
        if (decryptContainer2 == null) {
            ((ReaderDecryptAndCopyExecutor) decryptAndCopyUIHelper.f24220e.getValue()).a(arrayList);
            return;
        }
        decryptAndCopyUIHelper.f24224i = decryptContainer2.getPdfPreviewEntity().getId();
        f0 e10 = decryptAndCopyUIHelper.e();
        if (e10.f23531g) {
            EditText editText = e10.f27550n;
            if (editText != null) {
                editText.setText("");
            }
            LinearLayout linearLayout = e10.f27552p;
            if (linearLayout != null) {
                linearLayout.setVisibility(8);
            }
        }
        f0 e11 = decryptAndCopyUIHelper.e();
        Context context = decryptAndCopyUIHelper.f24217a;
        String f10 = DecryptAndCopyUIHelper.f(context);
        String name = decryptContainer2.getPdfPreviewEntity().getName();
        kotlin.jvm.internal.g.d(name, ea.a.p("XWUzdDpuEnUGLkRkD1AkZTJpV3cDbjdpJ3lPbiNtZQ==", "SaBp0IHC"));
        e11.C(f10, DecryptAndCopyUIHelper.d(context, name), decryptAndCopyUIHelper.f24218b.size());
    }
}
