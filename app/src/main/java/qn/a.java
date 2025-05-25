package qn;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.fragment.app.g0;
import androidx.fragment.app.m;
import androidx.fragment.app.u;
import f5.d;
import f5.e;
import k9.c;
import kotlin.jvm.internal.g;
import pdf.pdfreader.viewer.editor.free.R;

/* compiled from: ChoosePhotoDialog.kt */
/* loaded from: classes3.dex */
public final class a extends m {

    /* renamed from: q0  reason: collision with root package name */
    public static final /* synthetic */ int f29388q0 = 0;

    /* renamed from: o0  reason: collision with root package name */
    public float f29389o0 = 0.95f;

    /* renamed from: p0  reason: collision with root package name */
    public InterfaceC0367a f29390p0;

    /* compiled from: ChoosePhotoDialog.kt */
    /* renamed from: qn.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public interface InterfaceC0367a {
        void a();

        void b();
    }

    @Override // androidx.fragment.app.Fragment
    public final View N(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        g.e(inflater, "inflater");
        View inflate = inflater.inflate(R.layout.feedback_layout_dialog_choose_photo, viewGroup);
        try {
            Dialog dialog = this.f3859j0;
            if (dialog != null) {
                dialog.requestWindowFeature(1);
            }
            inflate.findViewById(R.id.tv_capture).setOnClickListener(new d(this, 17));
            inflate.findViewById(R.id.tv_gallery).setOnClickListener(new e(this, 15));
            inflate.findViewById(R.id.tv_cancel).setOnClickListener(new c(this, 17));
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        return inflate;
    }

    @Override // androidx.fragment.app.m, androidx.fragment.app.Fragment
    public final void Y() {
        u i10;
        Window window;
        super.Y();
        try {
            if (i() != null) {
                Dialog dialog = this.f3859j0;
                WindowManager.LayoutParams layoutParams = null;
                if (dialog != null) {
                    window = dialog.getWindow();
                } else {
                    window = null;
                }
                if (window != null) {
                    layoutParams = window.getAttributes();
                }
                if (layoutParams != null) {
                    layoutParams.gravity = 80;
                }
                if (layoutParams != null) {
                    layoutParams.width = (int) (i10.getResources().getDisplayMetrics().widthPixels * this.f29389o0);
                }
                if (layoutParams != null) {
                    layoutParams.height = -2;
                }
                if (window != null) {
                    window.setAttributes(layoutParams);
                }
                if (window != null) {
                    window.setBackgroundDrawableResource(17170445);
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public final void s0(g0 g0Var) {
        try {
            String simpleName = a.class.getSimpleName();
            this.f3861l0 = false;
            this.f3862m0 = true;
            androidx.fragment.app.a aVar = new androidx.fragment.app.a(g0Var);
            aVar.f3911o = true;
            aVar.c(0, this, simpleName, 1);
            aVar.h(false);
        } catch (Exception e10) {
            e10.printStackTrace();
            try {
                androidx.fragment.app.a aVar2 = new androidx.fragment.app.a(g0Var);
                ea.a.p("LHIpZytlJXQFYQhhU2UlLlplNWknVERhGnMQYyVpLW5iKQ==", "CdJHFKOZ");
                aVar2.c(0, this, a.class.getSimpleName(), 1);
                aVar2.g();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }
}
