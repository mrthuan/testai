package pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment;

import android.widget.CheckBox;
import android.widget.CompoundButton;
import i2.a;
import pdf.pdfreader.viewer.editor.free.base.BaseVMFragment;

/* compiled from: BaseDebugFragment.kt */
/* loaded from: classes3.dex */
public abstract class b<VB extends i2.a> extends BaseVMFragment<VB> {

    /* renamed from: c0  reason: collision with root package name */
    public static final /* synthetic */ int f27868c0 = 0;

    public static void t0(boolean z10, CheckBox checkBox, final cg.l callback) {
        kotlin.jvm.internal.g.e(callback, "callback");
        checkBox.setChecked(z10);
        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.a
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
                int i10 = b.f27868c0;
                String p10 = ea.a.p("a2NWbCJiG2Nr", "lLO7Nz3c");
                cg.l lVar = cg.l.this;
                kotlin.jvm.internal.g.e(lVar, p10);
                lVar.invoke(Boolean.valueOf(z11));
            }
        });
    }
}
