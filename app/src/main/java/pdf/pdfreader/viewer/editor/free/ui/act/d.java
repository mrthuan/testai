package pdf.pdfreader.viewer.editor.free.ui.act;

import android.text.Editable;
import android.text.TextWatcher;

/* compiled from: FeedbackActivity.kt */
/* loaded from: classes3.dex */
public final class d implements TextWatcher {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ e f26898a;

    public d(e eVar) {
        this.f26898a = eVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.f26898a.A1(editable);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
