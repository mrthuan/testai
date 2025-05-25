package pdf.pdfreader.viewer.editor.free.feature.ai.widget;

import am.i2;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.text.Regex;
import lib.zj.office.fc.openxml4j.opc.PackagingURIHelper;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.utils.t0;

/* compiled from: AskQuestionView.kt */
/* loaded from: classes3.dex */
public final class k implements TextWatcher {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AskQuestionView f24781a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ i2 f24782b;

    public k(AskQuestionView askQuestionView, i2 i2Var) {
        this.f24781a = askQuestionView;
        this.f24782b = i2Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        AskQuestionView askQuestionView = this.f24781a;
        cg.a<tf.d> editTextChangedListener = askQuestionView.getEditTextChangedListener();
        if (editTextChangedListener != null) {
            editTextChangedListener.invoke();
        }
        if (editable != null) {
            int length = new Regex(ea.a.p("E3M=", "senjnlfG")).replace(editable.toString(), "").length();
            int i10 = askQuestionView.f24754h;
            i2 i2Var = this.f24782b;
            int i11 = askQuestionView.f24754h;
            if (length > i10) {
                int selectionStart = i2Var.c.getSelectionStart();
                String obj = editable.toString();
                StringBuilder sb2 = new StringBuilder();
                int length2 = obj.length();
                int i12 = 0;
                for (int i13 = 0; i13 < length2; i13++) {
                    char charAt = obj.charAt(i13);
                    if (!t0.c0(charAt)) {
                        i12++;
                    }
                    if (i12 > i11) {
                        break;
                    }
                    sb2.append(charAt);
                }
                String sb3 = sb2.toString();
                kotlin.jvm.internal.g.d(sb3, ea.a.p("QWU4dR90THQdU0ByAG4xKCk=", "vFBaUjFb"));
                EditText editText = i2Var.c;
                editText.setText(sb3);
                editText.setSelection(Math.min(selectionStart, sb3.length()));
                i2Var.f988f.setText(i11 + PackagingURIHelper.FORWARD_SLASH_STRING + i11);
                return;
            }
            boolean z10 = true;
            if (length > 0) {
                i2Var.f988f.setVisibility(0);
                if (!askQuestionView.f24751e) {
                    askQuestionView.b(true);
                }
                if (!askQuestionView.f24750d && askQuestionView.f24752f) {
                    i2Var.f986d.setEnabled(true);
                }
            } else {
                i2Var.f988f.setVisibility(4);
                if (!askQuestionView.f24751e && !askQuestionView.f24753g) {
                    askQuestionView.b(false);
                }
                if (!askQuestionView.f24750d) {
                    i2Var.f986d.setEnabled(false);
                }
            }
            i2Var.f988f.setText(Math.min(length, i11) + PackagingURIHelper.FORWARD_SLASH_STRING + i11);
            if (editable.length() <= 0) {
                z10 = false;
            }
            if (z10) {
                i2 i2Var2 = askQuestionView.f24748a;
                if (i2Var2 != null) {
                    androidx.constraintlayout.widget.a aVar = new androidx.constraintlayout.widget.a();
                    ConstraintLayout constraintLayout = i2Var2.f985b;
                    aVar.f(constraintLayout);
                    aVar.h(R.id.ask_iv_send, 3, R.id.ask_edit_content, 4);
                    aVar.h(R.id.ask_edit_content, 7, 0, 7);
                    aVar.b(constraintLayout);
                    constraintLayout.setBackgroundResource(R.drawable.bg_ai_ask_question_12);
                    return;
                }
                return;
            }
            i2 i2Var3 = askQuestionView.f24748a;
            if (i2Var3 != null) {
                androidx.constraintlayout.widget.a aVar2 = new androidx.constraintlayout.widget.a();
                ConstraintLayout constraintLayout2 = i2Var3.f985b;
                aVar2.f(constraintLayout2);
                aVar2.h(R.id.ask_iv_send, 3, 0, 3);
                aVar2.h(R.id.ask_edit_content, 7, R.id.ask_iv_send, 6);
                aVar2.b(constraintLayout2);
                constraintLayout2.setBackgroundResource(R.drawable.bg_ai_ask_question_30);
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        kotlin.jvm.internal.g.e(charSequence, "charSequence");
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        kotlin.jvm.internal.g.e(charSequence, "charSequence");
    }
}
