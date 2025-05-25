package pdf.pdfreader.viewer.editor.free.ui.act;

import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import java.util.WeakHashMap;
import pdf.pdfreader.viewer.editor.free.R;
import x0.f0;

/* loaded from: classes3.dex */
public class SettingStoragePermissionGuideActivity extends jl.a {

    /* renamed from: t  reason: collision with root package name */
    public View f26876t;

    /* loaded from: classes3.dex */
    public class a implements x0.u {
        public a() {
        }

        @Override // x0.u
        public final x0.s0 m(View view, x0.s0 s0Var) {
            View view2;
            o0.b a10 = s0Var.a(1);
            if (a10.f22640b > 0 && (view2 = SettingStoragePermissionGuideActivity.this.f26876t) != null) {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.height = a10.f22640b;
                    view2.setLayoutParams(layoutParams);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
            }
            return s0Var;
        }
    }

    /* loaded from: classes3.dex */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            tn.a.b(view.getContext(), ea.a.p("Q2U5bRpzEWkdbmsxMQ==", "Ch2wqng0"), ea.a.p("P2VDbRBzRGk1bnhfGms3Y1lpDWs=", "MulDwT4s"));
            SettingStoragePermissionGuideActivity.this.finish();
        }
    }

    @Override // jl.a
    public final void C1() {
        this.f26876t = findViewById(R.id.status_bar_space);
        ((TextView) findViewById(R.id.tv_storage_guide_title)).setText(Html.fromHtml(getString(R.string.arg_res_0x7f130331)));
        findViewById(R.id.tv_ok).setOnClickListener(new b());
    }

    @Override // jl.a
    public final int E1() {
        if (pdf.pdfreader.viewer.editor.free.utils.a0.i(this)) {
            return R.layout.activity_storage_permission_guide_rtl;
        }
        return R.layout.activity_storage_permission_guide;
    }

    @Override // jl.a, androidx.fragment.app.u, androidx.activity.ComponentActivity, k0.j, android.app.Activity
    public final void onCreate(Bundle bundle) {
        if (Build.VERSION.SDK_INT != 26) {
            setRequestedOrientation(1);
        }
        super.onCreate(bundle);
        wn.e.a(this);
        Window window = getWindow();
        if (window != null && window.getDecorView() != null) {
            View decorView = window.getDecorView();
            a aVar = new a();
            WeakHashMap<View, x0.n0> weakHashMap = x0.f0.f31435a;
            f0.i.u(decorView, aVar);
        }
    }

    @Override // jl.a, androidx.fragment.app.u, android.app.Activity
    public final void onPause() {
        super.onPause();
        overridePendingTransition(0, 0);
    }

    @Override // jl.a
    public final void K1() {
    }
}
