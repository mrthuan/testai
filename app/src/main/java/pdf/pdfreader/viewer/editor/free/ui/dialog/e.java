package pdf.pdfreader.viewer.editor.free.ui.dialog;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.ReaderMainLaunchActivity;
import pdf.pdfreader.viewer.editor.free.ui.act.SettingsActivity;
import pdf.pdfreader.viewer.editor.free.ui.feature.debug.ReaderDebugActivity;
import pdf.pdfreader.viewer.editor.free.ui.frag.SettingFragment;
import pdf.pdfreader.viewer.editor.free.utils.ReaderWrapContentLinearLayoutManager;
import xk.d;

/* compiled from: ChangeLanguageDialog.java */
/* loaded from: classes3.dex */
public final class e extends oo.g implements View.OnClickListener {
    public String A;
    public final b B;
    public xk.d C;

    /* renamed from: y  reason: collision with root package name */
    public final ArrayList f27532y;

    /* renamed from: z  reason: collision with root package name */
    public String f27533z;

    /* compiled from: ChangeLanguageDialog.java */
    /* loaded from: classes3.dex */
    public class a implements d.a {
        public a() {
        }
    }

    /* compiled from: ChangeLanguageDialog.java */
    /* loaded from: classes3.dex */
    public interface b {
    }

    public e(Context context, pdf.pdfreader.viewer.editor.free.ui.frag.u uVar) {
        super(context);
        this.f27532y = new ArrayList();
        this.B = uVar;
    }

    @Override // oo.g
    public final boolean A() {
        return true;
    }

    @Override // oo.g
    public final boolean B() {
        return true;
    }

    @Override // oo.g
    public final float E() {
        return 0.8f;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        SettingsActivity settingsActivity;
        if (view.getId() == R.id.tv_ok) {
            dismiss();
            b bVar = this.B;
            if (bVar != null && !TextUtils.isEmpty(this.A) && !this.A.equals(this.f27533z)) {
                if (pdf.pdfreader.viewer.editor.free.utils.a0.f28535g) {
                    pdf.pdfreader.viewer.editor.free.utils.a0.f28535g = false;
                    this.f27532y.clear();
                    y();
                }
                no.f b10 = no.f.b(view.getContext());
                Context context = view.getContext();
                b10.getClass();
                pdf.pdfreader.viewer.editor.free.utils.d1.b(context).c(ea.a.p("D3MtcgdzAG8_XwphWmciYV9lDXQgcGkxRzM=", "NczHXhh9"), false);
                String str = this.A;
                pdf.pdfreader.viewer.editor.free.ui.frag.u uVar = (pdf.pdfreader.viewer.editor.free.ui.frag.u) bVar;
                String p10 = ea.a.p("A2ghc1ww", "9vwHxLUG");
                SettingFragment settingFragment = uVar.f28073a;
                kotlin.jvm.internal.g.e(settingFragment, p10);
                String p11 = ea.a.p("a2l0", "jX3G1fgl");
                Context context2 = uVar.f28074b;
                kotlin.jvm.internal.g.e(context2, p11);
                if (settingFragment.f27967m0 && !ReaderDebugActivity.f27826e) {
                    settingFragment.f27967m0 = false;
                    View r02 = settingFragment.r0(R.id.nav_language_tip_group);
                    if (r02 != null) {
                        r02.setVisibility(8);
                    }
                }
                pdf.pdfreader.viewer.editor.free.utils.q0.h(context2).edit().putString(ea.a.p("WGUyXx9hDGcHYVNl", "vXFCafzO"), str).apply();
                pdf.pdfreader.viewer.editor.free.utils.a0.a(context2, false);
                p1.a.a(context2).c(new Intent(ea.a.p("Q2QtLgNkBHIXYVBlGy4gaSF3V3JoZSdpPG8VLl9yJmUdQQhUOk8sXz5Pd0ElXxRSC0F2QwdTF18LSCZOfkUcTHJODFUyR0U=", "Hg9C5mym")));
                Intent intent = new Intent(context2, ReaderMainLaunchActivity.class);
                try {
                    androidx.fragment.app.u i10 = settingFragment.i();
                    if (i10 != null) {
                        i10.startActivity(intent);
                    }
                    androidx.fragment.app.u i11 = settingFragment.i();
                    if (i11 instanceof SettingsActivity) {
                        settingsActivity = (SettingsActivity) i11;
                    } else {
                        settingsActivity = null;
                    }
                    if (settingsActivity != null) {
                        settingsActivity.f26882u = true;
                    }
                    androidx.fragment.app.u i12 = settingFragment.i();
                    if (i12 != null) {
                        i12.finish();
                    }
                } catch (Throwable th2) {
                    th2.printStackTrace();
                }
                tn.a.b(getContext(), ea.a.p("PGVFdBBuZw==", "AwedJWFn"), ea.a.p("QGU_dBpuBV8eYVpnHGExZRtjWmEoZ2U=", "adJfTEzc"));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0075  */
    @Override // oo.g, android.app.Dialog
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void show() {
        /*
            Method dump skipped, instructions count: 234
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.ui.dialog.e.show():void");
    }

    @Override // oo.g
    public final int w() {
        return R.layout.dialog_change_language;
    }

    @Override // oo.g
    public final void y() {
        String[] strArr;
        HashMap<String, String> hashMap = pdf.pdfreader.viewer.editor.free.utils.a0.f28533e;
        ArrayList arrayList = this.f27532y;
        arrayList.add(new no.c(ea.a.p("V2UtYQZsdA==", "lBTc0kXG"), getContext().getString(R.string.arg_res_0x7f1304c2)));
        for (String str : pdf.pdfreader.viewer.editor.free.utils.a0.f28530a) {
            arrayList.add(new no.c(str, hashMap.get(str)));
        }
    }

    @Override // oo.g
    public final void z() {
        RecyclerView recyclerView = (RecyclerView) x().findViewById(R.id.recyclerView);
        getContext();
        recyclerView.setLayoutManager(new ReaderWrapContentLinearLayoutManager());
        xk.d dVar = new xk.d(this.f27532y);
        this.C = dVar;
        recyclerView.setAdapter(dVar);
        this.C.f31868f = new a();
        ((TextView) x().findViewById(R.id.tv_ok)).setOnClickListener(this);
    }
}
