package d9;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.ImageButton;
import com.google.android.material.search.SearchView;

/* compiled from: SearchView.java */
/* loaded from: classes2.dex */
public final class h implements TextWatcher {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SearchView f16161a;

    public h(SearchView searchView) {
        this.f16161a = searchView;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13;
        ImageButton imageButton = this.f16161a.f12812k;
        if (charSequence.length() > 0) {
            i13 = 0;
        } else {
            i13 = 8;
        }
        imageButton.setVisibility(i13);
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
