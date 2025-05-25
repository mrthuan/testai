package pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import androidx.core.widget.NestedScrollView;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.ui.dialog.m2;
import pdf.pdfreader.viewer.editor.free.ui.dialog.s2;

/* compiled from: DebugNotificationFragment.kt */
/* loaded from: classes3.dex */
public final class DebugNotificationFragment extends b<am.q0> {

    /* renamed from: d0  reason: collision with root package name */
    public static final /* synthetic */ int f27859d0 = 0;

    @Override // pdf.pdfreader.viewer.editor.free.base.BaseVMFragment
    public final i2.a p0(LayoutInflater inflater, ViewGroup viewGroup) {
        kotlin.jvm.internal.g.e(inflater, "inflater");
        View inflate = inflater.inflate(R.layout.fragment_debug_notification, viewGroup, false);
        int i10 = R.id.language_recall_btn;
        Button button = (Button) com.google.android.play.core.assetpacks.c.u(inflate, R.id.language_recall_btn);
        if (button != null) {
            i10 = R.id.new_file_btn;
            Button button2 = (Button) com.google.android.play.core.assetpacks.c.u(inflate, R.id.new_file_btn);
            if (button2 != null) {
                i10 = R.id.new_file_silent_switch;
                CheckBox checkBox = (CheckBox) com.google.android.play.core.assetpacks.c.u(inflate, R.id.new_file_silent_switch);
                if (checkBox != null) {
                    i10 = R.id.new_file_switch;
                    CheckBox checkBox2 = (CheckBox) com.google.android.play.core.assetpacks.c.u(inflate, R.id.new_file_switch);
                    if (checkBox2 != null) {
                        i10 = R.id.not_finished_btn;
                        Button button3 = (Button) com.google.android.play.core.assetpacks.c.u(inflate, R.id.not_finished_btn);
                        if (button3 != null) {
                            i10 = R.id.not_finished_hour_et;
                            EditText editText = (EditText) com.google.android.play.core.assetpacks.c.u(inflate, R.id.not_finished_hour_et);
                            if (editText != null) {
                                i10 = R.id.not_finished_min_et;
                                EditText editText2 = (EditText) com.google.android.play.core.assetpacks.c.u(inflate, R.id.not_finished_min_et);
                                if (editText2 != null) {
                                    i10 = R.id.not_finished_ok_btn;
                                    Button button4 = (Button) com.google.android.play.core.assetpacks.c.u(inflate, R.id.not_finished_ok_btn);
                                    if (button4 != null) {
                                        i10 = R.id.not_finished_silent_switch;
                                        CheckBox checkBox3 = (CheckBox) com.google.android.play.core.assetpacks.c.u(inflate, R.id.not_finished_silent_switch);
                                        if (checkBox3 != null) {
                                            i10 = R.id.not_finished_switch;
                                            CheckBox checkBox4 = (CheckBox) com.google.android.play.core.assetpacks.c.u(inflate, R.id.not_finished_switch);
                                            if (checkBox4 != null) {
                                                i10 = R.id.not_view_btn;
                                                Button button5 = (Button) com.google.android.play.core.assetpacks.c.u(inflate, R.id.not_view_btn);
                                                if (button5 != null) {
                                                    i10 = R.id.not_view_hour_et;
                                                    EditText editText3 = (EditText) com.google.android.play.core.assetpacks.c.u(inflate, R.id.not_view_hour_et);
                                                    if (editText3 != null) {
                                                        i10 = R.id.not_view_min_et;
                                                        EditText editText4 = (EditText) com.google.android.play.core.assetpacks.c.u(inflate, R.id.not_view_min_et);
                                                        if (editText4 != null) {
                                                            i10 = R.id.not_view_ok_btn;
                                                            Button button6 = (Button) com.google.android.play.core.assetpacks.c.u(inflate, R.id.not_view_ok_btn);
                                                            if (button6 != null) {
                                                                i10 = R.id.not_view_silent_switch;
                                                                CheckBox checkBox5 = (CheckBox) com.google.android.play.core.assetpacks.c.u(inflate, R.id.not_view_silent_switch);
                                                                if (checkBox5 != null) {
                                                                    i10 = R.id.not_view_switch;
                                                                    CheckBox checkBox6 = (CheckBox) com.google.android.play.core.assetpacks.c.u(inflate, R.id.not_view_switch);
                                                                    if (checkBox6 != null) {
                                                                        i10 = R.id.open_app_permanent_btn;
                                                                        Button button7 = (Button) com.google.android.play.core.assetpacks.c.u(inflate, R.id.open_app_permanent_btn);
                                                                        if (button7 != null) {
                                                                            i10 = R.id.open_app_permanent_switch;
                                                                            CheckBox checkBox7 = (CheckBox) com.google.android.play.core.assetpacks.c.u(inflate, R.id.open_app_permanent_switch);
                                                                            if (checkBox7 != null) {
                                                                                i10 = R.id.upgrade_btn;
                                                                                Button button8 = (Button) com.google.android.play.core.assetpacks.c.u(inflate, R.id.upgrade_btn);
                                                                                if (button8 != null) {
                                                                                    am.q0 q0Var = new am.q0((NestedScrollView) inflate, button, button2, checkBox, checkBox2, button3, editText, editText2, button4, checkBox3, checkBox4, button5, editText3, editText4, button6, checkBox5, checkBox6, button7, checkBox7, button8);
                                                                                    ea.a.p("Wm4tbBJ0BygbblJsCHQzcmggUW8odCJpXGUcLERmAGxAZSk=", "2ndaOo72");
                                                                                    return q0Var;
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException(ea.a.p("AmlCcxBuUCAoZTt1HHINZBV2B2UyIBJpImhVSQk6IA==", "K1ecVuMh").concat(inflate.getResources().getResourceName(i10)));
    }

    @Override // pdf.pdfreader.viewer.editor.free.base.BaseVMFragment
    public final void r0() {
        Context g02 = g0();
        ea.a.p("PWVAdRByUkM1bj5lDXRAKQ==", "nk4nmEFh");
        VB vb2 = this.Y;
        kotlin.jvm.internal.g.b(vb2);
        ((am.q0) vb2).f1328b.setOnClickListener(new oo.e(1));
        VB vb3 = this.Y;
        kotlin.jvm.internal.g.b(vb3);
        ((am.q0) vb3).f1345t.setOnClickListener(new s2(1));
        pdf.pdfreader.viewer.editor.free.utils.c cVar = pdf.pdfreader.viewer.editor.free.utils.c.f28558a;
        String p10 = ea.a.p("V2UpdRRfDXAXbmtuDHc6eRthVmQZZipsIl8cb0dpH2lQYT9pHG4=", "Gr3yD9PS");
        SharedPreferences sharedPreferences = pdf.pdfreader.viewer.editor.free.utils.c.f28559b;
        boolean z10 = sharedPreferences.getBoolean(p10, true);
        VB vb4 = this.Y;
        kotlin.jvm.internal.g.b(vb4);
        String p11 = ea.a.p("LWlfZBBuUC40ZT1GHGwNU0JpGmNo", "AsKXAzck");
        CheckBox checkBox = ((am.q0) vb4).f1330e;
        kotlin.jvm.internal.g.d(checkBox, p11);
        b.t0(z10, checkBox, new cg.l<Boolean, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.DebugNotificationFragment$initView$3
            @Override // cg.l
            public /* bridge */ /* synthetic */ tf.d invoke(Boolean bool) {
                invoke(bool.booleanValue());
                return tf.d.f30009a;
            }

            public final void invoke(boolean z11) {
                a6.h.j("V2UpdRRfDXAXbmtuDHc6eRthVmQZZipsAF8kb0FpFmlQYT9pHG4=", "eJ5pEQXk", pdf.pdfreader.viewer.editor.free.utils.c.f28559b.edit(), z11);
            }
        });
        boolean z11 = sharedPreferences.getBoolean(ea.a.p("K2VTdR5fWWUtbDNfFGQMX1NpAmUabgp0JGZRYyB0P28hX0JpFWVZdA==", "WnC4M8AV"), true);
        VB vb5 = this.Y;
        kotlin.jvm.internal.g.b(vb5);
        String p12 = ea.a.p("LWlfZBBuUC40ZT1GHGwNU1xsC24xUxJpRWNo", "wCiV1VvQ");
        CheckBox checkBox2 = ((am.q0) vb5).f1329d;
        kotlin.jvm.internal.g.d(checkBox2, p12);
        b.t0(z11, checkBox2, new cg.l<Boolean, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.DebugNotificationFragment$initView$4
            @Override // cg.l
            public /* bridge */ /* synthetic */ tf.d invoke(Boolean bool) {
                invoke(bool.booleanValue());
                return tf.d.f30009a;
            }

            public final void invoke(boolean z12) {
                a6.h.j("K2VTdR5fWWUtbDNfFGQMX1NpAmUabgp0KGY9Yw10HW8hX0JpFWVZdA==", "lONZATlt", pdf.pdfreader.viewer.editor.free.utils.c.f28559b.edit(), z12);
            }
        });
        VB vb6 = this.Y;
        kotlin.jvm.internal.g.b(vb6);
        ((am.q0) vb6).c.setOnClickListener(new pdf.pdfreader.viewer.editor.free.feature.billing.ui.o(5));
        boolean z12 = sharedPreferences.getBoolean(ea.a.p("K2VTdR5fWHA_bhVuGnQ3ZlxuB3MtZQFfBGUJZFFya24gdFhmEGNWdDNvbg==", "LN16vh44"), true);
        VB vb7 = this.Y;
        kotlin.jvm.internal.g.b(vb7);
        String p13 = ea.a.p("LWlfZBBuUC40bz5GHG4Bc11lClMyaRFjaA==", "LGsZIcFF");
        CheckBox checkBox3 = ((am.q0) vb7).f1336k;
        kotlin.jvm.internal.g.d(checkBox3, p13);
        b.t0(z12, checkBox3, new cg.l<Boolean, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.DebugNotificationFragment$initView$6
            @Override // cg.l
            public /* bridge */ /* synthetic */ tf.d invoke(Boolean bool) {
                invoke(bool.booleanValue());
                return tf.d.f30009a;
            }

            public final void invoke(boolean z13) {
                a6.h.j("PWU6dV5fNXAtbjluW3QIZlFuO3MhZVJfBmUQZDRyHW42dDFmUGM7dCFvbg==", "k6YX9ZJf", pdf.pdfreader.viewer.editor.free.utils.c.f28559b.edit(), z13);
            }
        });
        boolean z13 = sharedPreferences.getBoolean(ea.a.p("HGUJdQNfDW88XwBpWmkkaF1kDXIsYVJlBl8fbyVpJGkbYR9pC248cyFsA250", "HHxkdcr7"), true);
        VB vb8 = this.Y;
        kotlin.jvm.internal.g.b(vb8);
        String p14 = ea.a.p("LWlfZBBuUC40bz5GHG4Bc11lClMsbABuOVMcaTpjaA==", "4mP6MkNP");
        CheckBox checkBox4 = ((am.q0) vb8).f1335j;
        kotlin.jvm.internal.g.d(checkBox4, p14);
        b.t0(z13, checkBox4, new cg.l<Boolean, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.DebugNotificationFragment$initView$7
            @Override // cg.l
            public /* bridge */ /* synthetic */ tf.d invoke(Boolean bool) {
                invoke(bool.booleanValue());
                return tf.d.f30009a;
            }

            public final void invoke(boolean z14) {
                a6.h.j("K2VTdR5fWW8uXyxpG2kbaFBkMXIgYQFlCl8XbwFpDWksYUVpFm5oczNsL250", "Xbs1xyuk", pdf.pdfreader.viewer.editor.free.utils.c.f28559b.edit(), z14);
            }
        });
        int i10 = sharedPreferences.getInt(ea.a.p("DGVVdR9fA288XwBpWmkkaF1kDXIsYVJlBl8fbyVpJGkLYUNpF24yaCd1cg==", "4Mh7xmKc"), 19);
        int i11 = sharedPreferences.getInt(ea.a.p("V2UpdRRfDG8GX1JpB2klaCFkbXIjYSdlE18Xby5pEWlQYT9pHG49bRtuQXRl", "ayZwCf6N"), 0);
        VB vb9 = this.Y;
        kotlin.jvm.internal.g.b(vb9);
        ((am.q0) vb9).f1332g.setText(String.valueOf(i10));
        VB vb10 = this.Y;
        kotlin.jvm.internal.g.b(vb10);
        ((am.q0) vb10).f1333h.setText(String.valueOf(i11));
        VB vb11 = this.Y;
        kotlin.jvm.internal.g.b(vb11);
        ((am.q0) vb11).f1334i.setOnClickListener(new pdf.pdfreader.viewer.editor.free.feature.scan.adapter.e(2, this, g02));
        VB vb12 = this.Y;
        kotlin.jvm.internal.g.b(vb12);
        ((am.q0) vb12).f1331f.setOnClickListener(new pdf.pdfreader.viewer.editor.free.feature.billing.ui.h(4));
        boolean z14 = sharedPreferences.getBoolean(ea.a.p("V2UpdRRfDXAXbmtuBnQJdi1lRV8oZTRsDV8XaQFlMW5cdCJmGmMDdBtvbg==", "tqmnqxsS"), true);
        VB vb13 = this.Y;
        kotlin.jvm.internal.g.b(vb13);
        String p15 = ea.a.p("OGk2ZDBuXi4mbxJWXWUgU09pJmNo", "V6ZXY9lt");
        CheckBox checkBox5 = ((am.q0) vb13).f1342q;
        kotlin.jvm.internal.g.d(checkBox5, p15);
        b.t0(z14, checkBox5, new cg.l<Boolean, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.DebugNotificationFragment$initView$10
            @Override // cg.l
            public /* bridge */ /* synthetic */ tf.d invoke(Boolean bool) {
                invoke(bool.booleanValue());
                return tf.d.f30009a;
            }

            public final void invoke(boolean z15) {
                a6.h.j("K2VTdR5fWHA_bhVuGnQ3dlxlGV8rZRJsO19SaRRlBW4gdFhmEGNWdDNvbg==", "YwKIB4xZ", pdf.pdfreader.viewer.editor.free.utils.c.f28559b.edit(), z15);
            }
        });
        boolean z15 = sharedPreferences.getBoolean(ea.a.p("V2UpdRRfDG8GX0JpDHcJbiF3XnkZZipsPV8ibxlpXmlQYT9pHG49cxtsUW50", "XLm8Iou5"), true);
        VB vb14 = this.Y;
        kotlin.jvm.internal.g.b(vb14);
        String p16 = ea.a.p("UWklZBpuBS4cb0BWAGUhUy1sV24yUzRpOWNo", "Ms5jlRO8");
        CheckBox checkBox6 = ((am.q0) vb14).f1341p;
        kotlin.jvm.internal.g.d(checkBox6, p16);
        b.t0(z15, checkBox6, new cg.l<Boolean, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.DebugNotificationFragment$initView$11
            @Override // cg.l
            public /* bridge */ /* synthetic */ tf.d invoke(Boolean bool) {
                invoke(bool.booleanValue());
                return tf.d.f30009a;
            }

            public final void invoke(boolean z16) {
                a6.h.j("HWUMdSpfIG88XxBpUXcIbl13PnkWZl9sEV8fbyVpJGkaYRppIm4RcyFsA250", "qcynMNyO", pdf.pdfreader.viewer.editor.free.utils.c.f28559b.edit(), z16);
            }
        });
        int i12 = sharedPreferences.getInt(ea.a.p("K2VTdR5fWW8uXzxpEHc3blB3AnkaZgxsCl8BbxxpPGksYUVpFm5oaDV1cg==", "O8ycoohZ"), 19);
        int i13 = sharedPreferences.getInt(ea.a.p("V2UpdRRfDG8GX0JpDHcJbiF3XnkZZipsBF8NbzVpNWlQYT9pHG49bRtuQXRl", "acASuctl"), 0);
        VB vb15 = this.Y;
        kotlin.jvm.internal.g.b(vb15);
        ((am.q0) vb15).f1338m.setText(String.valueOf(i12));
        VB vb16 = this.Y;
        kotlin.jvm.internal.g.b(vb16);
        ((am.q0) vb16).f1339n.setText(String.valueOf(i13));
        VB vb17 = this.Y;
        kotlin.jvm.internal.g.b(vb17);
        ((am.q0) vb17).f1340o.setOnClickListener(new pdf.pdfreader.viewer.editor.free.feature.ocr.ui.adapter.vh.b(3, this, g02));
        VB vb18 = this.Y;
        kotlin.jvm.internal.g.b(vb18);
        ((am.q0) vb18).f1337l.setOnClickListener(new m2(2));
        boolean z16 = sharedPreferences.getBoolean(ea.a.p("K2VTdR5fWHA_bhVhBXA3cFByA2ErZQt0FG4AdAdmP2MudFhvbg==", "Cm3ZKonV"), true);
        VB vb19 = this.Y;
        kotlin.jvm.internal.g.b(vb19);
        String p17 = ea.a.p("UWklZBpuBS4dcFFuKHAmUCFyX2EoZS10MncidCJo", "aKAnxSXK");
        CheckBox checkBox7 = ((am.q0) vb19).f1344s;
        kotlin.jvm.internal.g.d(checkBox7, p17);
        b.t0(z16, checkBox7, new cg.l<Boolean, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.DebugNotificationFragment$initView$14
            @Override // cg.l
            public /* bridge */ /* synthetic */ tf.d invoke(Boolean bool) {
                invoke(bool.booleanValue());
                return tf.d.f30009a;
            }

            public final void invoke(boolean z17) {
                a6.h.j("V2UpdRRfDXAXbmthGXAJcCFyX2EoZS10KW5YdAVmUWNSdCJvbg==", "v7l8Vm0W", pdf.pdfreader.viewer.editor.free.utils.c.f28559b.edit(), z17);
            }
        });
        VB vb20 = this.Y;
        kotlin.jvm.internal.g.b(vb20);
        ((am.q0) vb20).f1343r.setOnClickListener(new oo.e(2));
    }

    @Override // pdf.pdfreader.viewer.editor.free.base.BaseVMFragment
    public final void s0() {
    }

    @Override // pdf.pdfreader.viewer.editor.free.base.BaseVMFragment
    public final void q0(Bundle bundle) {
    }
}
