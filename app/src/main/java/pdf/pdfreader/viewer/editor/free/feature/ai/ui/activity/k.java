package pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity;

import android.widget.EditText;
import java.util.ArrayList;
import jm.c;
import pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AIChatActivity;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class k implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f24612a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AIChatActivity f24613b;
    public final /* synthetic */ Object c;

    public /* synthetic */ k(AIChatActivity aIChatActivity, Object obj, int i10) {
        this.f24612a = i10;
        this.f24613b = aIChatActivity;
        this.c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f24612a;
        AIChatActivity aIChatActivity = this.f24613b;
        Object obj = this.c;
        switch (i10) {
            case 0:
                km.a aVar = (km.a) obj;
                kotlin.jvm.internal.g.e(aIChatActivity, ea.a.p("BWgMc10w", "wGqeytUQ"));
                kotlin.jvm.internal.g.e(aVar, ea.a.p("amkSZW0=", "qdNfMBoF"));
                if (!aIChatActivity.isFinishing()) {
                    ArrayList arrayList = jm.c.f19315a;
                    c.a.c(aVar);
                    c.a.InterfaceC0260a interfaceC0260a = jm.c.f19316b;
                    if (interfaceC0260a != null) {
                        interfaceC0260a.I();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                km.a aVar2 = (km.a) obj;
                kotlin.jvm.internal.g.e(aIChatActivity, ea.a.p("F3QjaQBfEHVu", "zqRY5hFk"));
                kotlin.jvm.internal.g.e(aVar2, ea.a.p("a3NUbh1DX2EuSSRmbw==", "XO2ULWxW"));
                if (!aIChatActivity.isFinishing()) {
                    ArrayList arrayList2 = jm.c.f19315a;
                    c.a.c(aVar2);
                    return;
                }
                return;
            default:
                EditText editText = (EditText) obj;
                AIChatActivity.a aVar3 = AIChatActivity.f24356v0;
                kotlin.jvm.internal.g.e(aIChatActivity, ea.a.p("O2hYc10w", "teN2AF3i"));
                kotlin.jvm.internal.g.e(editText, ea.a.p("F3QjaQBfEHVu", "bEvbSNXB"));
                if (!pdf.pdfreader.viewer.editor.free.utils.extension.a.b(aIChatActivity)) {
                    editText.requestFocus();
                    pdf.pdfreader.viewer.editor.free.utils.extension.g.f(editText);
                    return;
                }
                return;
        }
    }
}
