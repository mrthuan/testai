package com.gyf.immersionbar;

import android.app.Fragment;
import android.content.res.Configuration;
import android.os.Bundle;

/* compiled from: RequestBarManagerFragment.java */
/* loaded from: classes2.dex */
public final class m extends Fragment {

    /* renamed from: a  reason: collision with root package name */
    public i f13815a;

    @Override // android.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        i iVar = this.f13815a;
        if (iVar != null) {
            getResources().getConfiguration();
            iVar.a();
        }
    }

    @Override // android.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        i iVar = this.f13815a;
        if (iVar != null) {
            iVar.b();
        }
    }

    @Override // android.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        i iVar = this.f13815a;
        if (iVar != null) {
            iVar.c();
            this.f13815a = null;
        }
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        i iVar = this.f13815a;
        if (iVar != null) {
            iVar.d();
        }
    }
}
