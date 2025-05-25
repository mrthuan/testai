package pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment;

import android.widget.RadioGroup;
import pdf.pdfreader.viewer.editor.free.R;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class p implements RadioGroup.OnCheckedChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f27918a;

    public /* synthetic */ p(int i10) {
        this.f27918a = i10;
    }

    @Override // android.widget.RadioGroup.OnCheckedChangeListener
    public final void onCheckedChanged(RadioGroup radioGroup, int i10) {
        String p10;
        int i11;
        switch (this.f27918a) {
            case 0:
                int i12 = DebugAppConfigFragment.f27856d0;
                switch (i10) {
                    case R.id.rb2 /* 2131363712 */:
                        i11 = 1;
                        break;
                    case R.id.rb3 /* 2131363713 */:
                        i11 = 2;
                        break;
                    case R.id.rb4 /* 2131363714 */:
                        i11 = 3;
                        break;
                    case R.id.rb5 /* 2131363715 */:
                        i11 = 4;
                        break;
                    default:
                        i11 = 0;
                        break;
                }
                pdf.pdfreader.viewer.editor.free.utils.c.f28558a.getClass();
                pdf.pdfreader.viewer.editor.free.utils.c.f28560d = i11;
                return;
            default:
                int i13 = DebugIAPConfigFragment.f27857e0;
                if (i10 != R.id.billingTestL1Plan) {
                    if (i10 != R.id.billingTestLPlan) {
                        p10 = ea.a.p("XW8=", "oeSs8lbE");
                    } else {
                        p10 = ea.a.p("XG4naR1l", "v3nMmSe8");
                    }
                } else {
                    p10 = ea.a.p("fzE=", "gwr5FlZR");
                }
                pdf.pdfreader.viewer.editor.free.utils.c.f28559b.edit().putString(ea.a.p("BmUIdSFCM2wkaQhnYGUkdHRDPW4vaWc=", "79bjFZGr"), p10).apply();
                return;
        }
    }
}
