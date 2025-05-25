package a1;

import a1.i;
import android.os.Build;
import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;

/* compiled from: InputConnectionCompat.java */
/* loaded from: classes.dex */
public final class f extends InputConnectionWrapper {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ h f19a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(InputConnection inputConnection, e eVar) {
        super(inputConnection, false);
        this.f19a = eVar;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i10, Bundle bundle) {
        i iVar;
        if (inputContentInfo == null || Build.VERSION.SDK_INT < 25) {
            iVar = null;
        } else {
            iVar = new i(new i.a(inputContentInfo));
        }
        if (((e) this.f19a).a(iVar, i10, bundle)) {
            return true;
        }
        return super.commitContent(inputContentInfo, i10, bundle);
    }
}
