package io.flutter.plugin.editing;

import android.text.Editable;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;

/* compiled from: ListenableEditingState.java */
/* loaded from: classes.dex */
public final class e extends BaseInputConnection {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Editable f18760a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(View view, Editable editable) {
        super(view, true);
        this.f18760a = editable;
    }

    @Override // android.view.inputmethod.BaseInputConnection
    public final Editable getEditable() {
        return this.f18760a;
    }
}
