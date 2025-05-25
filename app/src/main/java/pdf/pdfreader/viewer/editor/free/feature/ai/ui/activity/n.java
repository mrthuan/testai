package pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity;

import android.view.KeyEvent;
import android.widget.EditText;
import java.util.ArrayList;
import jm.c;
import pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AIChatActivity;
import pdf.pdfreader.viewer.editor.free.feature.ai.widget.AskQuestionView;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class n implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f24626a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ KeyEvent.Callback f24627b;
    public final /* synthetic */ Object c;

    public /* synthetic */ n(KeyEvent.Callback callback, Object obj, int i10) {
        this.f24626a = i10;
        this.f24627b = callback;
        this.c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        EditText editContentView;
        int i10 = this.f24626a;
        Object obj = this.c;
        KeyEvent.Callback callback = this.f24627b;
        switch (i10) {
            case 0:
                AIChatActivity aIChatActivity = (AIChatActivity) callback;
                String str = (String) obj;
                kotlin.jvm.internal.g.e(aIChatActivity, ea.a.p("O2hYc10w", "cDoxfzQc"));
                kotlin.jvm.internal.g.e(str, ea.a.p("F3M_chpuZw==", "RctT50kT"));
                AskQuestionView askQuestionView = aIChatActivity.D;
                if (askQuestionView != null && (editContentView = askQuestionView.getEditContentView()) != null) {
                    aIChatActivity.X.removeCallbacks(aIChatActivity.f24367g0);
                    pdf.pdfreader.viewer.editor.free.utils.extension.g.f(editContentView);
                    editContentView.setText(str);
                    editContentView.setSelection(str.length());
                    return;
                }
                return;
            case 1:
                AIChatActivity aIChatActivity2 = (AIChatActivity) callback;
                km.a aVar = (km.a) obj;
                kotlin.jvm.internal.g.e(aIChatActivity2, ea.a.p("R2gic1cw", "Qvg5uEEX"));
                kotlin.jvm.internal.g.e(aVar, ea.a.p("a2Ffcw5lRUMyYT5JG2Zv", "yPgdRdjy"));
                if (!aIChatActivity2.isFinishing()) {
                    ArrayList arrayList = jm.c.f19315a;
                    c.a.e(aVar);
                    return;
                }
                return;
            default:
                EditText editText = (EditText) callback;
                String str2 = (String) obj;
                AIChatActivity.a aVar2 = AIChatActivity.f24356v0;
                kotlin.jvm.internal.g.e(editText, ea.a.p("F3QjaQBfEHVu", "SrdOTLwb"));
                kotlin.jvm.internal.g.e(str2, ea.a.p("cXMFcg9uZw==", "tsUqfZ1V"));
                editText.setText(str2);
                editText.setSelection(str2.length());
                return;
        }
    }
}
