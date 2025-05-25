package ph;

import android.text.Editable;
import android.text.TextWatcher;
import lib.zj.office.officereader.FindToolBar;
import lib.zj.office.officereader.beans.AImageFindButton;

/* compiled from: FindToolBar.java */
/* loaded from: classes3.dex */
public final class a implements TextWatcher {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ FindToolBar f28937a;

    public a(FindToolBar findToolBar) {
        this.f28937a = findToolBar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        FindToolBar findToolBar = this.f28937a;
        boolean z10 = false;
        findToolBar.f(788529153, false);
        findToolBar.f(788529154, false);
        AImageFindButton aImageFindButton = findToolBar.f20876h;
        if (editable.length() > 0) {
            z10 = true;
        }
        aImageFindButton.setFindBtnState(z10);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
