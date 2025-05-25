package pdf.pdfreader.viewer.editor.free.base;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import i2.a;
import kotlin.jvm.internal.g;
import pdf.pdfreader.viewer.editor.free.base.a;

/* compiled from: BaseVMFragment.kt */
/* loaded from: classes3.dex */
public abstract class BaseVMFragment<VB extends i2.a> extends Fragment {
    public VB Y;
    public boolean Z;

    /* renamed from: a0  reason: collision with root package name */
    public boolean f24019a0 = true;

    /* renamed from: b0  reason: collision with root package name */
    public a.b f24020b0;

    public BaseVMFragment() {
        kotlin.a.a(new cg.a<a.C0330a>() { // from class: pdf.pdfreader.viewer.editor.free.base.BaseVMFragment$mInteraction$2
            @Override // cg.a
            public final a.C0330a invoke() {
                return new a.C0330a();
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    public final void L(Context context) {
        g.e(context, "context");
        super.L(context);
        if (context instanceof a.b) {
            this.f24020b0 = (a.b) context;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View N(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        g.e(inflater, "inflater");
        VB p02 = p0(inflater, viewGroup);
        this.Y = p02;
        this.Z = true;
        return p02.b();
    }

    @Override // androidx.fragment.app.Fragment
    public void P() {
        this.F = true;
        this.Z = false;
        this.Y = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void T() {
        this.F = true;
        this.f24019a0 = true;
    }

    @Override // androidx.fragment.app.Fragment
    public void W() {
        this.F = true;
        this.f24019a0 = false;
    }

    @Override // androidx.fragment.app.Fragment
    public void b0(View view, Bundle bundle) {
        g.e(view, "view");
        q0(bundle);
        r0();
        s0();
    }

    public abstract VB p0(LayoutInflater layoutInflater, ViewGroup viewGroup);

    public abstract void q0(Bundle bundle);

    public abstract void r0();

    public abstract void s0();
}
