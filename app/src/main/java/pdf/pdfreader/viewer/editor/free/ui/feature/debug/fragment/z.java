package pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment;

import android.widget.RadioGroup;
import pdf.pdfreader.viewer.editor.free.R;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class z implements RadioGroup.OnCheckedChangeListener {
    @Override // android.widget.RadioGroup.OnCheckedChangeListener
    public final void onCheckedChanged(RadioGroup radioGroup, int i10) {
        String p10;
        int i11 = DebugAppConfigFragment.f27856d0;
        switch (i10) {
            case R.id.languageRecallTextA /* 2131363014 */:
                p10 = ea.a.p("QQ==", "GQQqukpF");
                break;
            case R.id.languageRecallTextB /* 2131363015 */:
                p10 = ea.a.p("Qg==", "3XP4nTp6");
                break;
            case R.id.languageRecallTextC /* 2131363016 */:
                p10 = ea.a.p("Qw==", "CplIZMKS");
                break;
            case R.id.languageRecallTextChange /* 2131363017 */:
            default:
                p10 = ea.a.p("RQ==", "RojLxqS0");
                break;
            case R.id.languageRecallTextD /* 2131363018 */:
                p10 = ea.a.p("RA==", "eH022Y3O");
                break;
        }
        pdf.pdfreader.viewer.editor.free.utils.c.f28559b.edit().putString(ea.a.p("V2UpdRRfDmEcZ0FhDmUJciFjU2wqXzdlDHQVYyVuFWlUX3o2Mg==", "tJJss0cX"), p10).apply();
    }
}
