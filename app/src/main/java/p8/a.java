package p8;

import android.content.Context;
import android.widget.CompoundButton;
import com.google.android.material.chip.Chip;
import com.tom_roush.fontbox.ttf.OS2WindowsMetricsTable;
import k0.u;
import kotlin.jvm.internal.g;
import pdf.pdfreader.viewer.editor.free.ReaderPdfApplication;
import pdf.pdfreader.viewer.editor.free.ui.frag.SettingFragment;
import w8.f;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class a implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f23798a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f23799b;

    public /* synthetic */ a(Object obj, int i10) {
        this.f23798a = i10;
        this.f23799b = obj;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
        String str;
        String str2;
        int i10 = this.f23798a;
        Object obj = this.f23799b;
        switch (i10) {
            case 0:
                Chip chip = (Chip) obj;
                f.a<Chip> aVar = chip.f12308j;
                if (aVar != null) {
                    w8.b bVar = ((w8.a) aVar).f30990a;
                    if (!z10 ? bVar.e(chip, bVar.f30994e) : bVar.a(chip)) {
                        bVar.d();
                    }
                }
                CompoundButton.OnCheckedChangeListener onCheckedChangeListener = chip.f12307i;
                if (onCheckedChangeListener != null) {
                    onCheckedChangeListener.onCheckedChanged(compoundButton, z10);
                    return;
                }
                return;
            default:
                SettingFragment settingFragment = (SettingFragment) obj;
                SettingFragment.a aVar2 = SettingFragment.f27957u0;
                g.e(settingFragment, ea.a.p("R2gic1cw", "8i3xasil"));
                no.f b10 = no.f.b(settingFragment.g0());
                if (b10.f22629b != z10) {
                    b10.f22629b = z10;
                    b10.i(ReaderPdfApplication.m());
                    if (!b10.f22629b) {
                        Context context = ReaderPdfApplication.m();
                        g.e(context, "context");
                        u uVar = new u(context);
                        ea.a.p("KXJebVFjWG4uZTJ0KQ==", "VbwNeZsk");
                        try {
                            uVar.b(OS2WindowsMetricsTable.WEIGHT_CLASS_BLACK);
                            uVar.b(901);
                        } catch (Exception e10) {
                            e10.printStackTrace();
                        }
                    }
                }
                Context r4 = settingFragment.r();
                String p10 = ea.a.p("PGVFdBBuZw==", "RtsokmeU");
                String p11 = ea.a.p("BWUhdDFuEF8mbxJpa2M7aVtr", "3NvUXwZH");
                if (z10) {
                    str = "XHAubg==";
                    str2 = "E75hCHo3";
                } else {
                    str = "UGwkc2U=";
                    str2 = "u0uoqBDx";
                }
                tn.a.d(r4, p10, p11, ea.a.p(str, str2), false);
                if (!z10) {
                    Context context2 = compoundButton.getContext();
                    g.d(context2, ea.a.p("RWkud11jDW4GZUx0", "OVr0puIu"));
                    try {
                        u uVar2 = new u(context2);
                        ea.a.p("VXIkbVtjDW4GZUx0KQ==", "yBXMHZtS");
                        uVar2.f19530b.cancelAll();
                        return;
                    } catch (Exception e11) {
                        e11.printStackTrace();
                        return;
                    }
                }
                return;
        }
    }
}
