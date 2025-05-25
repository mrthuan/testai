package androidx.appcompat.widget;

import android.view.View;
import android.widget.AdapterView;

/* compiled from: ListPopupWindow.java */
/* loaded from: classes.dex */
public final class e0 implements AdapterView.OnItemSelectedListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ListPopupWindow f2573a;

    public e0(ListPopupWindow listPopupWindow) {
        this.f2573a = listPopupWindow;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView<?> adapterView, View view, int i10, long j10) {
        b0 b0Var;
        if (i10 != -1 && (b0Var = this.f2573a.c) != null) {
            b0Var.setListSelectionHidden(false);
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView<?> adapterView) {
    }
}
