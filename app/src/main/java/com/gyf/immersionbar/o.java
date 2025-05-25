package com.gyf.immersionbar;

import android.content.res.Configuration;
import android.os.Bundle;
import androidx.fragment.app.Fragment;

/* compiled from: SupportRequestBarManagerFragment.java */
/* loaded from: classes2.dex */
public final class o extends Fragment {
    public i Y;

    @Override // androidx.fragment.app.Fragment
    public final void H(Bundle bundle) {
        this.F = true;
        i iVar = this.Y;
        if (iVar != null) {
            v().getConfiguration();
            iVar.a();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void P() {
        this.F = true;
        i iVar = this.Y;
        if (iVar != null) {
            iVar.c();
            this.Y = null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void W() {
        this.F = true;
        i iVar = this.Y;
        if (iVar != null) {
            iVar.d();
        }
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.F = true;
        i iVar = this.Y;
        if (iVar != null) {
            iVar.b();
        }
    }
}
