package pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
import androidx.core.widget.NestedScrollView;
import com.google.android.gms.ads.AdInspectorError;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzco;
import com.google.android.gms.ads.internal.client.zzej;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.inmobi.commons.core.configs.TelemetryConfig;
import java.util.Map;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.utils.AdUtils;
import qb.j1;

/* compiled from: DebugAdConfigFragment.kt */
/* loaded from: classes3.dex */
public final class n extends b<am.n0> {

    /* renamed from: d0  reason: collision with root package name */
    public static final /* synthetic */ int f27916d0 = 0;

    @Override // pdf.pdfreader.viewer.editor.free.base.BaseVMFragment
    public final i2.a p0(LayoutInflater inflater, ViewGroup viewGroup) {
        kotlin.jvm.internal.g.e(inflater, "inflater");
        View inflate = inflater.inflate(R.layout.fragment_debug_ad_config, viewGroup, false);
        int i10 = R.id.ad_load_expired_time_et;
        EditText editText = (EditText) com.google.android.play.core.assetpacks.c.u(inflate, R.id.ad_load_expired_time_et);
        if (editText != null) {
            i10 = R.id.ad_load_expired_time_ok_btn;
            Button button = (Button) com.google.android.play.core.assetpacks.c.u(inflate, R.id.ad_load_expired_time_ok_btn);
            if (button != null) {
                i10 = R.id.ad_request_expired_time_et;
                EditText editText2 = (EditText) com.google.android.play.core.assetpacks.c.u(inflate, R.id.ad_request_expired_time_et);
                if (editText2 != null) {
                    i10 = R.id.ad_request_expired_time_ok_btn;
                    Button button2 = (Button) com.google.android.play.core.assetpacks.c.u(inflate, R.id.ad_request_expired_time_ok_btn);
                    if (button2 != null) {
                        i10 = R.id.admob_test_btn;
                        Button button3 = (Button) com.google.android.play.core.assetpacks.c.u(inflate, R.id.admob_test_btn);
                        if (button3 != null) {
                            i10 = R.id.change_ad_config_btn;
                            Button button4 = (Button) com.google.android.play.core.assetpacks.c.u(inflate, R.id.change_ad_config_btn);
                            if (button4 != null) {
                                i10 = R.id.convertBannerSwitch;
                                CheckBox checkBox = (CheckBox) com.google.android.play.core.assetpacks.c.u(inflate, R.id.convertBannerSwitch);
                                if (checkBox != null) {
                                    i10 = R.id.convert_full_switch;
                                    CheckBox checkBox2 = (CheckBox) com.google.android.play.core.assetpacks.c.u(inflate, R.id.convert_full_switch);
                                    if (checkBox2 != null) {
                                        i10 = R.id.full_interval_time_et;
                                        EditText editText3 = (EditText) com.google.android.play.core.assetpacks.c.u(inflate, R.id.full_interval_time_et);
                                        if (editText3 != null) {
                                            i10 = R.id.full_interval_time_ok_btn;
                                            Button button5 = (Button) com.google.android.play.core.assetpacks.c.u(inflate, R.id.full_interval_time_ok_btn);
                                            if (button5 != null) {
                                                i10 = R.id.home_banner_switch;
                                                CheckBox checkBox3 = (CheckBox) com.google.android.play.core.assetpacks.c.u(inflate, R.id.home_banner_switch);
                                                if (checkBox3 != null) {
                                                    i10 = R.id.home_banner_white_switch;
                                                    CheckBox checkBox4 = (CheckBox) com.google.android.play.core.assetpacks.c.u(inflate, R.id.home_banner_white_switch);
                                                    if (checkBox4 != null) {
                                                        i10 = R.id.home_bottom_banner_refresh_interval_et;
                                                        EditText editText4 = (EditText) com.google.android.play.core.assetpacks.c.u(inflate, R.id.home_bottom_banner_refresh_interval_et);
                                                        if (editText4 != null) {
                                                            i10 = R.id.home_bottom_banner_refresh_interval_ok_btn;
                                                            Button button6 = (Button) com.google.android.play.core.assetpacks.c.u(inflate, R.id.home_bottom_banner_refresh_interval_ok_btn);
                                                            if (button6 != null) {
                                                                i10 = R.id.home_list_banner_switch;
                                                                CheckBox checkBox5 = (CheckBox) com.google.android.play.core.assetpacks.c.u(inflate, R.id.home_list_banner_switch);
                                                                if (checkBox5 != null) {
                                                                    i10 = R.id.home_scan_min_duration_et;
                                                                    EditText editText5 = (EditText) com.google.android.play.core.assetpacks.c.u(inflate, R.id.home_scan_min_duration_et);
                                                                    if (editText5 != null) {
                                                                        i10 = R.id.home_scan_min_ok_btn;
                                                                        Button button7 = (Button) com.google.android.play.core.assetpacks.c.u(inflate, R.id.home_scan_min_ok_btn);
                                                                        if (button7 != null) {
                                                                            i10 = R.id.home_scanner_banner_switch;
                                                                            CheckBox checkBox6 = (CheckBox) com.google.android.play.core.assetpacks.c.u(inflate, R.id.home_scanner_banner_switch);
                                                                            if (checkBox6 != null) {
                                                                                i10 = R.id.home_scanner_banner_white_switch;
                                                                                CheckBox checkBox7 = (CheckBox) com.google.android.play.core.assetpacks.c.u(inflate, R.id.home_scanner_banner_white_switch);
                                                                                if (checkBox7 != null) {
                                                                                    i10 = R.id.item_click_full_switch;
                                                                                    CheckBox checkBox8 = (CheckBox) com.google.android.play.core.assetpacks.c.u(inflate, R.id.item_click_full_switch);
                                                                                    if (checkBox8 != null) {
                                                                                        i10 = R.id.item_click_loading_duration_et;
                                                                                        EditText editText6 = (EditText) com.google.android.play.core.assetpacks.c.u(inflate, R.id.item_click_loading_duration_et);
                                                                                        if (editText6 != null) {
                                                                                            i10 = R.id.item_click_loading_ok_btn;
                                                                                            Button button8 = (Button) com.google.android.play.core.assetpacks.c.u(inflate, R.id.item_click_loading_ok_btn);
                                                                                            if (button8 != null) {
                                                                                                i10 = R.id.item_click_loading_switch;
                                                                                                CheckBox checkBox9 = (CheckBox) com.google.android.play.core.assetpacks.c.u(inflate, R.id.item_click_loading_switch);
                                                                                                if (checkBox9 != null) {
                                                                                                    i10 = R.id.languageChooseNativeConfigSwitch;
                                                                                                    CheckBox checkBox10 = (CheckBox) com.google.android.play.core.assetpacks.c.u(inflate, R.id.languageChooseNativeConfigSwitch);
                                                                                                    if (checkBox10 != null) {
                                                                                                        i10 = R.id.language_choose_switch;
                                                                                                        CheckBox checkBox11 = (CheckBox) com.google.android.play.core.assetpacks.c.u(inflate, R.id.language_choose_switch);
                                                                                                        if (checkBox11 != null) {
                                                                                                            i10 = R.id.list_banner_refresh_interval_et;
                                                                                                            EditText editText7 = (EditText) com.google.android.play.core.assetpacks.c.u(inflate, R.id.list_banner_refresh_interval_et);
                                                                                                            if (editText7 != null) {
                                                                                                                i10 = R.id.list_banner_refresh_interval_ok_btn;
                                                                                                                Button button9 = (Button) com.google.android.play.core.assetpacks.c.u(inflate, R.id.list_banner_refresh_interval_ok_btn);
                                                                                                                if (button9 != null) {
                                                                                                                    i10 = R.id.load_ad_btn;
                                                                                                                    Button button10 = (Button) com.google.android.play.core.assetpacks.c.u(inflate, R.id.load_ad_btn);
                                                                                                                    if (button10 != null) {
                                                                                                                        i10 = R.id.openAd_expired_time_et;
                                                                                                                        EditText editText8 = (EditText) com.google.android.play.core.assetpacks.c.u(inflate, R.id.openAd_expired_time_et);
                                                                                                                        if (editText8 != null) {
                                                                                                                            i10 = R.id.openAd_expired_time_ok_btn;
                                                                                                                            Button button11 = (Button) com.google.android.play.core.assetpacks.c.u(inflate, R.id.openAd_expired_time_ok_btn);
                                                                                                                            if (button11 != null) {
                                                                                                                                i10 = R.id.organic_full_interval_time_et;
                                                                                                                                EditText editText9 = (EditText) com.google.android.play.core.assetpacks.c.u(inflate, R.id.organic_full_interval_time_et);
                                                                                                                                if (editText9 != null) {
                                                                                                                                    i10 = R.id.organic_full_interval_time_ok_btn;
                                                                                                                                    Button button12 = (Button) com.google.android.play.core.assetpacks.c.u(inflate, R.id.organic_full_interval_time_ok_btn);
                                                                                                                                    if (button12 != null) {
                                                                                                                                        i10 = R.id.preInstall_ab;
                                                                                                                                        RadioGroup radioGroup = (RadioGroup) com.google.android.play.core.assetpacks.c.u(inflate, R.id.preInstall_ab);
                                                                                                                                        if (radioGroup != null) {
                                                                                                                                            i10 = R.id.pre_install_native_open_ad_switch;
                                                                                                                                            CheckBox checkBox12 = (CheckBox) com.google.android.play.core.assetpacks.c.u(inflate, R.id.pre_install_native_open_ad_switch);
                                                                                                                                            if (checkBox12 != null) {
                                                                                                                                                i10 = R.id.preInstall_planA;
                                                                                                                                                if (((RadioButton) com.google.android.play.core.assetpacks.c.u(inflate, R.id.preInstall_planA)) != null) {
                                                                                                                                                    i10 = R.id.preInstall_planB;
                                                                                                                                                    if (((RadioButton) com.google.android.play.core.assetpacks.c.u(inflate, R.id.preInstall_planB)) != null) {
                                                                                                                                                        i10 = R.id.preInstall_planC;
                                                                                                                                                        if (((RadioButton) com.google.android.play.core.assetpacks.c.u(inflate, R.id.preInstall_planC)) != null) {
                                                                                                                                                            i10 = R.id.preInstall_planDef;
                                                                                                                                                            if (((RadioButton) com.google.android.play.core.assetpacks.c.u(inflate, R.id.preInstall_planDef)) != null) {
                                                                                                                                                                i10 = R.id.preview_banner_switch;
                                                                                                                                                                CheckBox checkBox13 = (CheckBox) com.google.android.play.core.assetpacks.c.u(inflate, R.id.preview_banner_switch);
                                                                                                                                                                if (checkBox13 != null) {
                                                                                                                                                                    i10 = R.id.preview_bottom_banner_refresh_interval_et;
                                                                                                                                                                    EditText editText10 = (EditText) com.google.android.play.core.assetpacks.c.u(inflate, R.id.preview_bottom_banner_refresh_interval_et);
                                                                                                                                                                    if (editText10 != null) {
                                                                                                                                                                        i10 = R.id.preview_bottom_banner_refresh_interval_ok_btn;
                                                                                                                                                                        Button button13 = (Button) com.google.android.play.core.assetpacks.c.u(inflate, R.id.preview_bottom_banner_refresh_interval_ok_btn);
                                                                                                                                                                        if (button13 != null) {
                                                                                                                                                                            i10 = R.id.preview_full_switch;
                                                                                                                                                                            CheckBox checkBox14 = (CheckBox) com.google.android.play.core.assetpacks.c.u(inflate, R.id.preview_full_switch);
                                                                                                                                                                            if (checkBox14 != null) {
                                                                                                                                                                                i10 = R.id.preview_loading_duration_et;
                                                                                                                                                                                EditText editText11 = (EditText) com.google.android.play.core.assetpacks.c.u(inflate, R.id.preview_loading_duration_et);
                                                                                                                                                                                if (editText11 != null) {
                                                                                                                                                                                    i10 = R.id.preview_loading_ok_btn;
                                                                                                                                                                                    Button button14 = (Button) com.google.android.play.core.assetpacks.c.u(inflate, R.id.preview_loading_ok_btn);
                                                                                                                                                                                    if (button14 != null) {
                                                                                                                                                                                        i10 = R.id.preview_loading_switch;
                                                                                                                                                                                        CheckBox checkBox15 = (CheckBox) com.google.android.play.core.assetpacks.c.u(inflate, R.id.preview_loading_switch);
                                                                                                                                                                                        if (checkBox15 != null) {
                                                                                                                                                                                            i10 = R.id.reset_open_preview_btn;
                                                                                                                                                                                            Button button15 = (Button) com.google.android.play.core.assetpacks.c.u(inflate, R.id.reset_open_preview_btn);
                                                                                                                                                                                            if (button15 != null) {
                                                                                                                                                                                                i10 = R.id.scan_banner_refresh_interval_et;
                                                                                                                                                                                                EditText editText12 = (EditText) com.google.android.play.core.assetpacks.c.u(inflate, R.id.scan_banner_refresh_interval_et);
                                                                                                                                                                                                if (editText12 != null) {
                                                                                                                                                                                                    i10 = R.id.scan_banner_refresh_interval_ok_btn;
                                                                                                                                                                                                    Button button16 = (Button) com.google.android.play.core.assetpacks.c.u(inflate, R.id.scan_banner_refresh_interval_ok_btn);
                                                                                                                                                                                                    if (button16 != null) {
                                                                                                                                                                                                        i10 = R.id.scanner_show_banner_switch;
                                                                                                                                                                                                        CheckBox checkBox16 = (CheckBox) com.google.android.play.core.assetpacks.c.u(inflate, R.id.scanner_show_banner_switch);
                                                                                                                                                                                                        if (checkBox16 != null) {
                                                                                                                                                                                                            i10 = R.id.scanner_show_switch;
                                                                                                                                                                                                            CheckBox checkBox17 = (CheckBox) com.google.android.play.core.assetpacks.c.u(inflate, R.id.scanner_show_switch);
                                                                                                                                                                                                            if (checkBox17 != null) {
                                                                                                                                                                                                                i10 = R.id.splash_full_ab;
                                                                                                                                                                                                                RadioGroup radioGroup2 = (RadioGroup) com.google.android.play.core.assetpacks.c.u(inflate, R.id.splash_full_ab);
                                                                                                                                                                                                                if (radioGroup2 != null) {
                                                                                                                                                                                                                    i10 = R.id.splash_full_planA;
                                                                                                                                                                                                                    if (((RadioButton) com.google.android.play.core.assetpacks.c.u(inflate, R.id.splash_full_planA)) != null) {
                                                                                                                                                                                                                        i10 = R.id.splash_full_planB;
                                                                                                                                                                                                                        if (((RadioButton) com.google.android.play.core.assetpacks.c.u(inflate, R.id.splash_full_planB)) != null) {
                                                                                                                                                                                                                            i10 = R.id.splash_light_switch;
                                                                                                                                                                                                                            CheckBox checkBox18 = (CheckBox) com.google.android.play.core.assetpacks.c.u(inflate, R.id.splash_light_switch);
                                                                                                                                                                                                                            if (checkBox18 != null) {
                                                                                                                                                                                                                                i10 = R.id.third_openAd_switch;
                                                                                                                                                                                                                                CheckBox checkBox19 = (CheckBox) com.google.android.play.core.assetpacks.c.u(inflate, R.id.third_openAd_switch);
                                                                                                                                                                                                                                if (checkBox19 != null) {
                                                                                                                                                                                                                                    i10 = R.id.user_guide_full_switch;
                                                                                                                                                                                                                                    CheckBox checkBox20 = (CheckBox) com.google.android.play.core.assetpacks.c.u(inflate, R.id.user_guide_full_switch);
                                                                                                                                                                                                                                    if (checkBox20 != null) {
                                                                                                                                                                                                                                        i10 = R.id.user_guide_native_switch;
                                                                                                                                                                                                                                        CheckBox checkBox21 = (CheckBox) com.google.android.play.core.assetpacks.c.u(inflate, R.id.user_guide_native_switch);
                                                                                                                                                                                                                                        if (checkBox21 != null) {
                                                                                                                                                                                                                                            am.n0 n0Var = new am.n0((NestedScrollView) inflate, editText, button, editText2, button2, button3, button4, checkBox, checkBox2, editText3, button5, checkBox3, checkBox4, editText4, button6, checkBox5, editText5, button7, checkBox6, checkBox7, checkBox8, editText6, button8, checkBox9, checkBox10, checkBox11, editText7, button9, button10, editText8, button11, editText9, button12, radioGroup, checkBox12, checkBox13, editText10, button13, checkBox14, editText11, button14, checkBox15, button15, editText12, button16, checkBox16, checkBox17, radioGroup2, checkBox18, checkBox19, checkBox20, checkBox21);
                                                                                                                                                                                                                                            ea.a.p("Am5fbBt0PSghbgBsVXQychQgMW8ndFdpGmUDLHFmI2wYZSk=", "gKk9zX7z");
                                                                                                                                                                                                                                            return n0Var;
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
        throw new NullPointerException(ea.a.p("AmlCcxBuUCAoZTt1HHINZBV2B2UyIBJpLmhNSSg6IA==", "ecFoZmlZ").concat(inflate.getResources().getResourceName(i10)));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // pdf.pdfreader.viewer.editor.free.base.BaseVMFragment
    public final void r0() {
        final Context g02 = g0();
        ea.a.p("A2U2dQ1yF0MnbhJlTHR_KQ==", "H1qGdrJJ");
        VB vb2 = this.Y;
        kotlin.jvm.internal.g.b(vb2);
        ((am.n0) vb2).Q.setOnClickListener(new c(g02, 0));
        VB vb3 = this.Y;
        kotlin.jvm.internal.g.b(vb3);
        ((am.n0) vb3).f1145f.setOnClickListener(new View.OnClickListener(this) { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.f

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ n f27888b;

            {
                this.f27888b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        int i10 = n.f27916d0;
                        String p10 = ea.a.p("GWgZc00w", "9ImpisJN");
                        n nVar = this.f27888b;
                        kotlin.jvm.internal.g.e(nVar, p10);
                        String p11 = ea.a.p("F2MkbgdlGnQ=", "J9n2aKwV");
                        Context context = g02;
                        kotlin.jvm.internal.g.e(context, p11);
                        try {
                            VB vb4 = nVar.Y;
                            kotlin.jvm.internal.g.b(vb4);
                            pdf.pdfreader.viewer.editor.free.utils.c.f28559b.edit().putFloat(ea.a.p("V2UpdRRfA2Q-b1VkLHgmaTZlVlQvbWU=", "b4J0TFM0"), Float.parseFloat(((am.n0) vb4).f1142b.getText().toString())).apply();
                            Toast.makeText(context, ea.a.p("17_l5ue5hIji5b6f", "sTSBUGzw"), 0).show();
                            return;
                        } catch (Exception unused) {
                            pdf.pdfreader.viewer.editor.free.utils.c.f28559b.edit().putFloat(ea.a.p("V2UpdRRfA2Q-b1VkLHgmaTZlVlQvbWU=", "b4J0TFM0"), 30.0f).apply();
                            return;
                        }
                    case 1:
                        n nVar2 = this.f27888b;
                        Context context2 = g02;
                        int i11 = n.f27916d0;
                        kotlin.jvm.internal.g.e(nVar2, ea.a.p("TWgQc04w", "Tl9yjTxr"));
                        kotlin.jvm.internal.g.e(context2, ea.a.p("F2MkbgdlGnQ=", "1tAetsWS"));
                        t5.g gVar = new t5.g(16);
                        zzej b10 = zzej.b();
                        synchronized (b10.f10172e) {
                            if (b10.f10173f == null) {
                                b10.f10173f = (zzco) new k7.k(zzay.f10107f.f10109b, context2).d(context2, false);
                            }
                            b10.f10174g = gVar;
                            try {
                                b10.f10173f.zzm(new k7.p());
                            } catch (RemoteException unused2) {
                                zzm.c("Unable to open the ad inspector.");
                                gVar.a(new AdInspectorError(0, "Ad inspector had an internal error.", "com.google.android.gms.ads"));
                            }
                        }
                        return;
                    default:
                        int i12 = n.f27916d0;
                        String p12 = ea.a.p("I2g8cxMw", "bMWU7sir");
                        n nVar3 = this.f27888b;
                        kotlin.jvm.internal.g.e(nVar3, p12);
                        String p13 = ea.a.p("F2MkbgdlGnQ=", "VsvBSEJU");
                        Context context3 = g02;
                        kotlin.jvm.internal.g.e(context3, p13);
                        try {
                            VB vb5 = nVar3.Y;
                            kotlin.jvm.internal.g.b(vb5);
                            pdf.pdfreader.viewer.editor.free.utils.c.f28559b.edit().putLong(ea.a.p("V2UpdRRfCm8fZWtzCmE4XylpXF8xYSp0LHRQbWU=", "s9TWr5qo"), Long.parseLong(((am.n0) vb5).f1156q.getText().toString())).apply();
                            bl.a.J(context3).f5469h = false;
                            bl.a.J(context3).K(context3);
                            Toast.makeText(context3, ea.a.p("q7-f5u250YjK5cCf", "c8bbKPRW"), 0).show();
                            return;
                        } catch (Exception unused3) {
                            androidx.appcompat.view.menu.d.h("V2UpdRRfCm8fZWtzCmE4XylpXF8xYSp0LHRQbWU=", "s9TWr5qo", pdf.pdfreader.viewer.editor.free.utils.c.f28559b.edit(), TelemetryConfig.DEFAULT_LOG_RETRY_INTERVAL);
                            return;
                        }
                }
            }
        });
        AdUtils.f28513a.getClass();
        VB vb4 = this.Y;
        kotlin.jvm.internal.g.b(vb4);
        ((am.n0) vb4).f1146g.setOnClickListener(new pdf.pdfreader.viewer.editor.free.feature.scan.adapter.adjust.a(3, (String[]) ((Map) AdUtils.c.getValue()).keySet().toArray(new String[0]), this));
        VB vb5 = this.Y;
        kotlin.jvm.internal.g.b(vb5);
        ((am.n0) vb5).C.setOnClickListener(new k9.c(this, 29));
        pdf.pdfreader.viewer.editor.free.utils.c cVar = pdf.pdfreader.viewer.editor.free.utils.c.f28558a;
        String p10 = ea.a.p("V2UpdRRQEGU7bkd0CGw6SCttV1MlYS1BIVRXcwRDPW5VaWc=", "C2pRhCaV");
        String p11 = ea.a.p("d2Vm", "31kVTWSw");
        SharedPreferences sharedPreferences = pdf.pdfreader.viewer.editor.free.utils.c.f28559b;
        String string = sharedPreferences.getString(p10, p11);
        if (string == null) {
            string = ea.a.p("C2Vm", "jmpgeAY6");
        }
        switch (string.hashCode()) {
            case 65:
                if (string.equals(ea.a.p("QQ==", "pEj4QjYW"))) {
                    VB vb6 = this.Y;
                    kotlin.jvm.internal.g.b(vb6);
                    ((am.n0) vb6).H.check(R.id.preInstall_planA);
                    break;
                }
                VB vb7 = this.Y;
                kotlin.jvm.internal.g.b(vb7);
                ((am.n0) vb7).H.check(R.id.preInstall_planDef);
                break;
            case 66:
                if (string.equals(ea.a.p("Qg==", "neHpNieT"))) {
                    VB vb8 = this.Y;
                    kotlin.jvm.internal.g.b(vb8);
                    ((am.n0) vb8).H.check(R.id.preInstall_planB);
                    break;
                }
                VB vb72 = this.Y;
                kotlin.jvm.internal.g.b(vb72);
                ((am.n0) vb72).H.check(R.id.preInstall_planDef);
                break;
            case 67:
                if (string.equals(ea.a.p("Qw==", "cjUvjAM6"))) {
                    VB vb9 = this.Y;
                    kotlin.jvm.internal.g.b(vb9);
                    ((am.n0) vb9).H.check(R.id.preInstall_planC);
                    break;
                }
                VB vb722 = this.Y;
                kotlin.jvm.internal.g.b(vb722);
                ((am.n0) vb722).H.check(R.id.preInstall_planDef);
                break;
            default:
                VB vb7222 = this.Y;
                kotlin.jvm.internal.g.b(vb7222);
                ((am.n0) vb7222).H.check(R.id.preInstall_planDef);
                break;
        }
        VB vb10 = this.Y;
        kotlin.jvm.internal.g.b(vb10);
        ((am.n0) vb10).H.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.i
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup, int i10) {
                String p12;
                int i11 = n.f27916d0;
                String p13 = ea.a.p("a2Nebg1lT3Q=", "rzOEPPdF");
                Context context = g02;
                kotlin.jvm.internal.g.e(context, p13);
                switch (i10) {
                    case R.id.preInstall_planA /* 2131363616 */:
                        p12 = ea.a.p("QQ==", "TSpreEB3");
                        break;
                    case R.id.preInstall_planB /* 2131363617 */:
                        p12 = ea.a.p("Qg==", "a7itR8gm");
                        break;
                    case R.id.preInstall_planC /* 2131363618 */:
                        p12 = ea.a.p("Qw==", "ddI9Beqo");
                        break;
                    default:
                        p12 = ea.a.p("C2Vm", "UPUrOUk6");
                        break;
                }
                SharedPreferences sharedPreferences2 = pdf.pdfreader.viewer.editor.free.utils.c.f28559b;
                sharedPreferences2.edit().putString(ea.a.p("K2VTdR5QRWUTbjl0FGwESFptC1MmYQtBVlQhczVDCG4paWc=", "FwjM4DAg"), p12).apply();
                String str = bp.a.f5496a;
                sharedPreferences2.edit().putString(ea.a.p("K2VTdR5QRWUTbjl0FGwESFptC1MmYQtBVlQhczVDCG4paWc=", "FwjM4DAg"), p12).apply();
                bp.a.f5496a = p12;
                Toast.makeText(context, ea.a.p("2671586uhIji5b6f", "oawtFNnx"), 0).show();
            }
        });
        String string2 = sharedPreferences.getString(ea.a.p("QHAnYQBoPWYHbFhfCGQJYSZfAzQ4", "SjhCIBsX"), ea.a.p("QQ==", "svWLsuHD"));
        if (string2 == null) {
            string2 = ea.a.p("QQ==", "F3Yq12yg");
        }
        if (kotlin.jvm.internal.g.a(ea.a.p("QQ==", "oxAEbz73"), string2)) {
            VB vb11 = this.Y;
            kotlin.jvm.internal.g.b(vb11);
            ((am.n0) vb11).V.check(R.id.splash_full_planA);
        } else {
            VB vb12 = this.Y;
            kotlin.jvm.internal.g.b(vb12);
            ((am.n0) vb12).V.check(R.id.splash_full_planB);
        }
        VB vb13 = this.Y;
        kotlin.jvm.internal.g.b(vb13);
        ((am.n0) vb13).V.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.j
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup, int i10) {
                int i11 = n.f27916d0;
                String p12 = ea.a.p("b2MLbhllCXQ=", "beKdmq3U");
                Context context = g02;
                kotlin.jvm.internal.g.e(context, p12);
                if (i10 == R.id.splash_full_planA) {
                    pdf.pdfreader.viewer.editor.free.utils.c.f(ea.a.p("QQ==", "KnSoAEJI"));
                } else {
                    pdf.pdfreader.viewer.editor.free.utils.c.f(ea.a.p("Qg==", "YimyrvmO"));
                }
                Toast.makeText(context, ea.a.p("p66P58Su0YjK5cCf", "vkhTucD2"), 0).show();
            }
        });
        long j10 = sharedPreferences.getLong(ea.a.p("FWUwdRFfA28pZA9uU18haV13DWQsbFd5cw==", "lkqRvoo1"), 1500L);
        VB vb14 = this.Y;
        kotlin.jvm.internal.g.b(vb14);
        ((am.n0) vb14).f1161v.setText(String.valueOf(j10));
        VB vb15 = this.Y;
        kotlin.jvm.internal.g.b(vb15);
        ((am.n0) vb15).f1162w.setOnClickListener(new View.OnClickListener(this) { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.h

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ n f27896b;

            {
                this.f27896b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i10 = r3;
                Context context = g02;
                n nVar = this.f27896b;
                switch (i10) {
                    case 0:
                        int i11 = n.f27916d0;
                        kotlin.jvm.internal.g.e(nVar, ea.a.p("R2gic1cw", "5cqtkas3"));
                        kotlin.jvm.internal.g.e(context, ea.a.p("F2MkbgdlGnQ=", "vtQBHK0Y"));
                        try {
                            VB vb16 = nVar.Y;
                            kotlin.jvm.internal.g.b(vb16);
                            pdf.pdfreader.viewer.editor.free.utils.c.f28559b.edit().putLong(ea.a.p("PmUgdRBfR3Itdg9lQ181YVZuN3IWclNmBmUCaA5pLHQ_cjRhbA==", "3HZBw7kf"), Long.parseLong(((am.n0) vb16).K.getText().toString())).apply();
                            Toast.makeText(context, ea.a.p("17_l5ue5hIji5b6f", "XQvcIZC0"), 0).show();
                            return;
                        } catch (Exception unused) {
                            androidx.appcompat.view.menu.d.h("PmUgdRBfR3Itdg9lQ181YVZuN3IWclNmBmUCaA5pLHQ_cjRhbA==", "3HZBw7kf", pdf.pdfreader.viewer.editor.free.utils.c.f28559b.edit(), 60000L);
                            return;
                        }
                    default:
                        int i12 = n.f27916d0;
                        kotlin.jvm.internal.g.e(nVar, ea.a.p("O2hYc10w", "1TbwiiuP"));
                        kotlin.jvm.internal.g.e(context, ea.a.p("F2MkbgdlGnQ=", "Mbzc0KOG"));
                        try {
                            VB vb17 = nVar.Y;
                            kotlin.jvm.internal.g.b(vb17);
                            pdf.pdfreader.viewer.editor.free.utils.c.f28559b.edit().putLong(ea.a.p("EWUTdSVfXm8pZA9uU18haV13DWQsbFd5cw==", "rwuqB2Qx"), Long.parseLong(((am.n0) vb17).f1161v.getText().toString())).apply();
                            Toast.makeText(context, ea.a.p("17_l5ue5hIji5b6f", "2rfq64ak"), 0).show();
                            return;
                        } catch (Exception unused2) {
                            androidx.appcompat.view.menu.d.h("EWUTdSVfXm8pZA9uU18haV13DWQsbFd5cw==", "rwuqB2Qx", pdf.pdfreader.viewer.editor.free.utils.c.f28559b.edit(), 1500L);
                            return;
                        }
                }
            }
        });
        float f10 = sharedPreferences.getFloat(ea.a.p("K2VTdR5fW287ZCNuEl8MdUdhGmkqbg==", "zyWbf2bh"), 800.0f);
        VB vb16 = this.Y;
        kotlin.jvm.internal.g.b(vb16);
        ((am.n0) vb16).N.setText(String.valueOf(f10));
        VB vb17 = this.Y;
        kotlin.jvm.internal.g.b(vb17);
        ((am.n0) vb17).O.setOnClickListener(new View.OnClickListener(this) { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.e

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ n f27885b;

            {
                this.f27885b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i10 = r3;
                Context context = g02;
                n nVar = this.f27885b;
                switch (i10) {
                    case 0:
                        int i11 = n.f27916d0;
                        kotlin.jvm.internal.g.e(nVar, ea.a.p("NWgsc0gw", "udAElT9x"));
                        kotlin.jvm.internal.g.e(context, ea.a.p("dGM-bhxlD3Q=", "cPPQhwV7"));
                        try {
                            VB vb18 = nVar.Y;
                            kotlin.jvm.internal.g.b(vb18);
                            pdf.pdfreader.viewer.editor.free.utils.c.f28559b.edit().putFloat(ea.a.p("FGUAdSVfCHUkbDlhUHMIZE1yM3Qgb1hfG3IWYT9pYw==", "CUpbBnqu"), Float.parseFloat(((am.n0) vb18).F.getText().toString())).apply();
                            Toast.makeText(context, ea.a.p("q7-f5u250YjK5cCf", "pol4isZG"), 0).show();
                            return;
                        } catch (Exception unused) {
                            pdf.pdfreader.viewer.editor.free.utils.c.d(60.0f);
                            return;
                        }
                    case 1:
                        int i12 = n.f27916d0;
                        kotlin.jvm.internal.g.e(nVar, ea.a.p("O2hYc10w", "CWY4fA4Q"));
                        kotlin.jvm.internal.g.e(context, ea.a.p("a2Nebg1lT3Q=", "NEgbGxC6"));
                        try {
                            VB vb19 = nVar.Y;
                            kotlin.jvm.internal.g.b(vb19);
                            pdf.pdfreader.viewer.editor.free.utils.c.f28559b.edit().putLong(ea.a.p("V2UpdRRfDmkBdGtiCG44ZTZfQGUgciZzCV8obgVlH3ZSbBQxRzk=", "aAqm8mwy"), Long.parseLong(((am.n0) vb19).A.getText().toString())).apply();
                            Toast.makeText(context, ea.a.p("q7-f5u250YjK5cCf", "ADjvgcgL"), 0).show();
                            return;
                        } catch (Exception unused2) {
                            androidx.appcompat.view.menu.d.h("V2UpdRRfDmkBdGtiCG44ZTZfQGUgciZzCV8obgVlH3ZSbBQxRzk=", "aAqm8mwy", pdf.pdfreader.viewer.editor.free.utils.c.f28559b.edit(), 60000L);
                            return;
                        }
                    default:
                        int i13 = n.f27916d0;
                        kotlin.jvm.internal.g.e(nVar, ea.a.p("R2gic1cw", "KSSwMK2y"));
                        kotlin.jvm.internal.g.e(context, ea.a.p("F2MkbgdlGnQ=", "1PKeSnPx"));
                        try {
                            VB vb20 = nVar.Y;
                            kotlin.jvm.internal.g.b(vb20);
                            pdf.pdfreader.viewer.editor.free.utils.c.f28559b.edit().putFloat(ea.a.p("K2VTdR5fW287ZCNuEl8MdUdhGmkqbg==", "yM16VTmr"), Float.parseFloat(((am.n0) vb20).N.getText().toString())).apply();
                            Toast.makeText(context, ea.a.p("vr_W5tC5qYjY5eyf", "yeZxDOZ7"), 0).show();
                            return;
                        } catch (Exception unused3) {
                            pdf.pdfreader.viewer.editor.free.utils.c.f28559b.edit().putFloat(ea.a.p("K2VTdR5fW287ZCNuEl8MdUdhGmkqbg==", "yM16VTmr"), 800.0f).apply();
                            return;
                        }
                }
            }
        });
        long j11 = sharedPreferences.getLong(ea.a.p("V2UpdRRfCm8fZWtzCmE4XylpXF8xYSp0N3QHbWU=", "hn43s60X"), TelemetryConfig.DEFAULT_LOG_RETRY_INTERVAL);
        VB vb18 = this.Y;
        kotlin.jvm.internal.g.b(vb18);
        ((am.n0) vb18).f1156q.setText(String.valueOf(j11));
        VB vb19 = this.Y;
        kotlin.jvm.internal.g.b(vb19);
        ((am.n0) vb19).f1157r.setOnClickListener(new View.OnClickListener(this) { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.f

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ n f27888b;

            {
                this.f27888b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        int i10 = n.f27916d0;
                        String p102 = ea.a.p("GWgZc00w", "9ImpisJN");
                        n nVar = this.f27888b;
                        kotlin.jvm.internal.g.e(nVar, p102);
                        String p112 = ea.a.p("F2MkbgdlGnQ=", "J9n2aKwV");
                        Context context = g02;
                        kotlin.jvm.internal.g.e(context, p112);
                        try {
                            VB vb42 = nVar.Y;
                            kotlin.jvm.internal.g.b(vb42);
                            pdf.pdfreader.viewer.editor.free.utils.c.f28559b.edit().putFloat(ea.a.p("V2UpdRRfA2Q-b1VkLHgmaTZlVlQvbWU=", "b4J0TFM0"), Float.parseFloat(((am.n0) vb42).f1142b.getText().toString())).apply();
                            Toast.makeText(context, ea.a.p("17_l5ue5hIji5b6f", "sTSBUGzw"), 0).show();
                            return;
                        } catch (Exception unused) {
                            pdf.pdfreader.viewer.editor.free.utils.c.f28559b.edit().putFloat(ea.a.p("V2UpdRRfA2Q-b1VkLHgmaTZlVlQvbWU=", "b4J0TFM0"), 30.0f).apply();
                            return;
                        }
                    case 1:
                        n nVar2 = this.f27888b;
                        Context context2 = g02;
                        int i11 = n.f27916d0;
                        kotlin.jvm.internal.g.e(nVar2, ea.a.p("TWgQc04w", "Tl9yjTxr"));
                        kotlin.jvm.internal.g.e(context2, ea.a.p("F2MkbgdlGnQ=", "1tAetsWS"));
                        t5.g gVar = new t5.g(16);
                        zzej b10 = zzej.b();
                        synchronized (b10.f10172e) {
                            if (b10.f10173f == null) {
                                b10.f10173f = (zzco) new k7.k(zzay.f10107f.f10109b, context2).d(context2, false);
                            }
                            b10.f10174g = gVar;
                            try {
                                b10.f10173f.zzm(new k7.p());
                            } catch (RemoteException unused2) {
                                zzm.c("Unable to open the ad inspector.");
                                gVar.a(new AdInspectorError(0, "Ad inspector had an internal error.", "com.google.android.gms.ads"));
                            }
                        }
                        return;
                    default:
                        int i12 = n.f27916d0;
                        String p12 = ea.a.p("I2g8cxMw", "bMWU7sir");
                        n nVar3 = this.f27888b;
                        kotlin.jvm.internal.g.e(nVar3, p12);
                        String p13 = ea.a.p("F2MkbgdlGnQ=", "VsvBSEJU");
                        Context context3 = g02;
                        kotlin.jvm.internal.g.e(context3, p13);
                        try {
                            VB vb52 = nVar3.Y;
                            kotlin.jvm.internal.g.b(vb52);
                            pdf.pdfreader.viewer.editor.free.utils.c.f28559b.edit().putLong(ea.a.p("V2UpdRRfCm8fZWtzCmE4XylpXF8xYSp0LHRQbWU=", "s9TWr5qo"), Long.parseLong(((am.n0) vb52).f1156q.getText().toString())).apply();
                            bl.a.J(context3).f5469h = false;
                            bl.a.J(context3).K(context3);
                            Toast.makeText(context3, ea.a.p("q7-f5u250YjK5cCf", "c8bbKPRW"), 0).show();
                            return;
                        } catch (Exception unused3) {
                            androidx.appcompat.view.menu.d.h("V2UpdRRfCm8fZWtzCmE4XylpXF8xYSp0LHRQbWU=", "s9TWr5qo", pdf.pdfreader.viewer.editor.free.utils.c.f28559b.edit(), TelemetryConfig.DEFAULT_LOG_RETRY_INTERVAL);
                            return;
                        }
                }
            }
        });
        float f11 = sharedPreferences.getFloat(ea.a.p("V2UpdRRfBHUebGthDXMJZDFyU3Qvb24=", "DX5WUcWW"), 30.0f);
        VB vb20 = this.Y;
        kotlin.jvm.internal.g.b(vb20);
        ((am.n0) vb20).f1149j.setText(String.valueOf(f11));
        VB vb21 = this.Y;
        kotlin.jvm.internal.g.b(vb21);
        ((am.n0) vb21).f1150k.setOnClickListener(new View.OnClickListener(this) { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.g

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ n f27892b;

            {
                this.f27892b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i10 = r3;
                Context context = g02;
                n nVar = this.f27892b;
                switch (i10) {
                    case 0:
                        int i11 = n.f27916d0;
                        kotlin.jvm.internal.g.e(nVar, ea.a.p("O2hYc10w", "cs4ehdyV"));
                        kotlin.jvm.internal.g.e(context, ea.a.p("bWMVbg1lQHQ=", "qvIzy8LM"));
                        try {
                            VB vb22 = nVar.Y;
                            kotlin.jvm.internal.g.b(vb22);
                            pdf.pdfreader.viewer.editor.free.utils.c.f28559b.edit().putFloat(ea.a.p("DWUmdVZfCGQaZRd1UXMjRUBwO3IsZGJpGWU=", "qriD1iZm"), Float.parseFloat(((am.n0) vb22).f1143d.getText().toString())).apply();
                            Toast.makeText(context, ea.a.p("17_l5ue5hIji5b6f", "Bvo2QSnY"), 0).show();
                            return;
                        } catch (Exception unused) {
                            pdf.pdfreader.viewer.editor.free.utils.c.f28559b.edit().putFloat(ea.a.p("DWUmdVZfCGQaZRd1UXMjRUBwO3IsZGJpGWU=", "qriD1iZm"), 30.0f).apply();
                            return;
                        }
                    default:
                        int i12 = n.f27916d0;
                        kotlin.jvm.internal.g.e(nVar, ea.a.p("R2gic1cw", "Q5K0i5zY"));
                        kotlin.jvm.internal.g.e(context, ea.a.p("F2MkbgdlGnQ=", "GdDC0b0W"));
                        try {
                            VB vb23 = nVar.Y;
                            kotlin.jvm.internal.g.b(vb23);
                            pdf.pdfreader.viewer.editor.free.utils.c.d(Float.parseFloat(((am.n0) vb23).f1149j.getText().toString()));
                            Toast.makeText(context, ea.a.p("17_l5ue5hIji5b6f", "JX5QHeL7"), 0).show();
                            return;
                        } catch (Exception unused2) {
                            pdf.pdfreader.viewer.editor.free.utils.c.d(30.0f);
                            return;
                        }
                }
            }
        });
        float f12 = sharedPreferences.getFloat(ea.a.p("V2UpdRRfBHUebGthDXMJZDFyU3Qvby1fDnItYSNpYw==", "aJMvhqxQ"), 60.0f);
        VB vb22 = this.Y;
        kotlin.jvm.internal.g.b(vb22);
        ((am.n0) vb22).F.setText(String.valueOf(f12));
        VB vb23 = this.Y;
        kotlin.jvm.internal.g.b(vb23);
        ((am.n0) vb23).G.setOnClickListener(new View.OnClickListener(this) { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.e

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ n f27885b;

            {
                this.f27885b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i10 = r3;
                Context context = g02;
                n nVar = this.f27885b;
                switch (i10) {
                    case 0:
                        int i11 = n.f27916d0;
                        kotlin.jvm.internal.g.e(nVar, ea.a.p("NWgsc0gw", "udAElT9x"));
                        kotlin.jvm.internal.g.e(context, ea.a.p("dGM-bhxlD3Q=", "cPPQhwV7"));
                        try {
                            VB vb182 = nVar.Y;
                            kotlin.jvm.internal.g.b(vb182);
                            pdf.pdfreader.viewer.editor.free.utils.c.f28559b.edit().putFloat(ea.a.p("FGUAdSVfCHUkbDlhUHMIZE1yM3Qgb1hfG3IWYT9pYw==", "CUpbBnqu"), Float.parseFloat(((am.n0) vb182).F.getText().toString())).apply();
                            Toast.makeText(context, ea.a.p("q7-f5u250YjK5cCf", "pol4isZG"), 0).show();
                            return;
                        } catch (Exception unused) {
                            pdf.pdfreader.viewer.editor.free.utils.c.d(60.0f);
                            return;
                        }
                    case 1:
                        int i12 = n.f27916d0;
                        kotlin.jvm.internal.g.e(nVar, ea.a.p("O2hYc10w", "CWY4fA4Q"));
                        kotlin.jvm.internal.g.e(context, ea.a.p("a2Nebg1lT3Q=", "NEgbGxC6"));
                        try {
                            VB vb192 = nVar.Y;
                            kotlin.jvm.internal.g.b(vb192);
                            pdf.pdfreader.viewer.editor.free.utils.c.f28559b.edit().putLong(ea.a.p("V2UpdRRfDmkBdGtiCG44ZTZfQGUgciZzCV8obgVlH3ZSbBQxRzk=", "aAqm8mwy"), Long.parseLong(((am.n0) vb192).A.getText().toString())).apply();
                            Toast.makeText(context, ea.a.p("q7-f5u250YjK5cCf", "ADjvgcgL"), 0).show();
                            return;
                        } catch (Exception unused2) {
                            androidx.appcompat.view.menu.d.h("V2UpdRRfDmkBdGtiCG44ZTZfQGUgciZzCV8obgVlH3ZSbBQxRzk=", "aAqm8mwy", pdf.pdfreader.viewer.editor.free.utils.c.f28559b.edit(), 60000L);
                            return;
                        }
                    default:
                        int i13 = n.f27916d0;
                        kotlin.jvm.internal.g.e(nVar, ea.a.p("R2gic1cw", "KSSwMK2y"));
                        kotlin.jvm.internal.g.e(context, ea.a.p("F2MkbgdlGnQ=", "1PKeSnPx"));
                        try {
                            VB vb202 = nVar.Y;
                            kotlin.jvm.internal.g.b(vb202);
                            pdf.pdfreader.viewer.editor.free.utils.c.f28559b.edit().putFloat(ea.a.p("K2VTdR5fW287ZCNuEl8MdUdhGmkqbg==", "yM16VTmr"), Float.parseFloat(((am.n0) vb202).N.getText().toString())).apply();
                            Toast.makeText(context, ea.a.p("vr_W5tC5qYjY5eyf", "yeZxDOZ7"), 0).show();
                            return;
                        } catch (Exception unused3) {
                            pdf.pdfreader.viewer.editor.free.utils.c.f28559b.edit().putFloat(ea.a.p("K2VTdR5fW287ZCNuEl8MdUdhGmkqbg==", "yM16VTmr"), 800.0f).apply();
                            return;
                        }
                }
            }
        });
        float f13 = sharedPreferences.getFloat(ea.a.p("UmUYdTdfA2QEbwdkcXgnaUplNlQgbWU=", "vc6zPbqn"), 30.0f);
        VB vb24 = this.Y;
        kotlin.jvm.internal.g.b(vb24);
        ((am.n0) vb24).f1142b.setText(String.valueOf(f13));
        VB vb25 = this.Y;
        kotlin.jvm.internal.g.b(vb25);
        ((am.n0) vb25).c.setOnClickListener(new View.OnClickListener(this) { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.f

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ n f27888b;

            {
                this.f27888b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        int i10 = n.f27916d0;
                        String p102 = ea.a.p("GWgZc00w", "9ImpisJN");
                        n nVar = this.f27888b;
                        kotlin.jvm.internal.g.e(nVar, p102);
                        String p112 = ea.a.p("F2MkbgdlGnQ=", "J9n2aKwV");
                        Context context = g02;
                        kotlin.jvm.internal.g.e(context, p112);
                        try {
                            VB vb42 = nVar.Y;
                            kotlin.jvm.internal.g.b(vb42);
                            pdf.pdfreader.viewer.editor.free.utils.c.f28559b.edit().putFloat(ea.a.p("V2UpdRRfA2Q-b1VkLHgmaTZlVlQvbWU=", "b4J0TFM0"), Float.parseFloat(((am.n0) vb42).f1142b.getText().toString())).apply();
                            Toast.makeText(context, ea.a.p("17_l5ue5hIji5b6f", "sTSBUGzw"), 0).show();
                            return;
                        } catch (Exception unused) {
                            pdf.pdfreader.viewer.editor.free.utils.c.f28559b.edit().putFloat(ea.a.p("V2UpdRRfA2Q-b1VkLHgmaTZlVlQvbWU=", "b4J0TFM0"), 30.0f).apply();
                            return;
                        }
                    case 1:
                        n nVar2 = this.f27888b;
                        Context context2 = g02;
                        int i11 = n.f27916d0;
                        kotlin.jvm.internal.g.e(nVar2, ea.a.p("TWgQc04w", "Tl9yjTxr"));
                        kotlin.jvm.internal.g.e(context2, ea.a.p("F2MkbgdlGnQ=", "1tAetsWS"));
                        t5.g gVar = new t5.g(16);
                        zzej b10 = zzej.b();
                        synchronized (b10.f10172e) {
                            if (b10.f10173f == null) {
                                b10.f10173f = (zzco) new k7.k(zzay.f10107f.f10109b, context2).d(context2, false);
                            }
                            b10.f10174g = gVar;
                            try {
                                b10.f10173f.zzm(new k7.p());
                            } catch (RemoteException unused2) {
                                zzm.c("Unable to open the ad inspector.");
                                gVar.a(new AdInspectorError(0, "Ad inspector had an internal error.", "com.google.android.gms.ads"));
                            }
                        }
                        return;
                    default:
                        int i12 = n.f27916d0;
                        String p12 = ea.a.p("I2g8cxMw", "bMWU7sir");
                        n nVar3 = this.f27888b;
                        kotlin.jvm.internal.g.e(nVar3, p12);
                        String p13 = ea.a.p("F2MkbgdlGnQ=", "VsvBSEJU");
                        Context context3 = g02;
                        kotlin.jvm.internal.g.e(context3, p13);
                        try {
                            VB vb52 = nVar3.Y;
                            kotlin.jvm.internal.g.b(vb52);
                            pdf.pdfreader.viewer.editor.free.utils.c.f28559b.edit().putLong(ea.a.p("V2UpdRRfCm8fZWtzCmE4XylpXF8xYSp0LHRQbWU=", "s9TWr5qo"), Long.parseLong(((am.n0) vb52).f1156q.getText().toString())).apply();
                            bl.a.J(context3).f5469h = false;
                            bl.a.J(context3).K(context3);
                            Toast.makeText(context3, ea.a.p("q7-f5u250YjK5cCf", "c8bbKPRW"), 0).show();
                            return;
                        } catch (Exception unused3) {
                            androidx.appcompat.view.menu.d.h("V2UpdRRfCm8fZWtzCmE4XylpXF8xYSp0LHRQbWU=", "s9TWr5qo", pdf.pdfreader.viewer.editor.free.utils.c.f28559b.edit(), TelemetryConfig.DEFAULT_LOG_RETRY_INTERVAL);
                            return;
                        }
                }
            }
        });
        float f14 = sharedPreferences.getFloat(ea.a.p("K2VTdR5fVmQIZTt1EHMcRU1wB3IgZDFpImU=", "itOfOBXd"), 30.0f);
        VB vb26 = this.Y;
        kotlin.jvm.internal.g.b(vb26);
        ((am.n0) vb26).f1143d.setText(String.valueOf(f14));
        VB vb27 = this.Y;
        kotlin.jvm.internal.g.b(vb27);
        ((am.n0) vb27).f1144e.setOnClickListener(new View.OnClickListener(this) { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.g

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ n f27892b;

            {
                this.f27892b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i10 = r3;
                Context context = g02;
                n nVar = this.f27892b;
                switch (i10) {
                    case 0:
                        int i11 = n.f27916d0;
                        kotlin.jvm.internal.g.e(nVar, ea.a.p("O2hYc10w", "cs4ehdyV"));
                        kotlin.jvm.internal.g.e(context, ea.a.p("bWMVbg1lQHQ=", "qvIzy8LM"));
                        try {
                            VB vb222 = nVar.Y;
                            kotlin.jvm.internal.g.b(vb222);
                            pdf.pdfreader.viewer.editor.free.utils.c.f28559b.edit().putFloat(ea.a.p("DWUmdVZfCGQaZRd1UXMjRUBwO3IsZGJpGWU=", "qriD1iZm"), Float.parseFloat(((am.n0) vb222).f1143d.getText().toString())).apply();
                            Toast.makeText(context, ea.a.p("17_l5ue5hIji5b6f", "Bvo2QSnY"), 0).show();
                            return;
                        } catch (Exception unused) {
                            pdf.pdfreader.viewer.editor.free.utils.c.f28559b.edit().putFloat(ea.a.p("DWUmdVZfCGQaZRd1UXMjRUBwO3IsZGJpGWU=", "qriD1iZm"), 30.0f).apply();
                            return;
                        }
                    default:
                        int i12 = n.f27916d0;
                        kotlin.jvm.internal.g.e(nVar, ea.a.p("R2gic1cw", "Q5K0i5zY"));
                        kotlin.jvm.internal.g.e(context, ea.a.p("F2MkbgdlGnQ=", "GdDC0b0W"));
                        try {
                            VB vb232 = nVar.Y;
                            kotlin.jvm.internal.g.b(vb232);
                            pdf.pdfreader.viewer.editor.free.utils.c.d(Float.parseFloat(((am.n0) vb232).f1149j.getText().toString()));
                            Toast.makeText(context, ea.a.p("17_l5ue5hIji5b6f", "JX5QHeL7"), 0).show();
                            return;
                        } catch (Exception unused2) {
                            pdf.pdfreader.viewer.editor.free.utils.c.d(30.0f);
                            return;
                        }
                }
            }
        });
        int i10 = sharedPreferences.getInt(ea.a.p("XHAubixhBl8eb1VkNmUucC1yV2QZdCptUV9SOA==", "4aTBbegF"), 240);
        VB vb28 = this.Y;
        kotlin.jvm.internal.g.b(vb28);
        ((am.n0) vb28).D.setText(String.valueOf(i10));
        VB vb29 = this.Y;
        kotlin.jvm.internal.g.b(vb29);
        ((am.n0) vb29).E.setOnClickListener(new pdf.pdfreader.viewer.editor.free.feature.ocr.ui.adapter.vh.b(2, this, g02));
        long j12 = sharedPreferences.getLong(ea.a.p("V2UpdRRfEWMTbmtiCG44ZTZfQGUgciZzI19abgdlR3ZSbBQxRzk=", "K3s5FUO2"), 60000L);
        VB vb30 = this.Y;
        kotlin.jvm.internal.g.b(vb30);
        ((am.n0) vb30).R.setText(String.valueOf(j12));
        VB vb31 = this.Y;
        kotlin.jvm.internal.g.b(vb31);
        ((am.n0) vb31).S.setOnClickListener(new j1(7, this, g02));
        long j13 = sharedPreferences.getLong(ea.a.p("NGUXdV9fNm88dAlta2I2blZlIF87ZVByEXMZXzhuNmUidhRsZzFgOQ==", "AiPu8Tm9"), 60000L);
        VB vb32 = this.Y;
        kotlin.jvm.internal.g.b(vb32);
        ((am.n0) vb32).f1153n.setText(String.valueOf(j13));
        VB vb33 = this.Y;
        kotlin.jvm.internal.g.b(vb33);
        ((am.n0) vb33).f1154o.setOnClickListener(new vm.g(3, this, g02));
        long j14 = sharedPreferences.getLong(ea.a.p("HWUWdQVfCXItdg9lQ181YVZuN3IWclNmBmUCaA5pLHQccgJhbA==", "upytby19"), 60000L);
        VB vb34 = this.Y;
        kotlin.jvm.internal.g.b(vb34);
        ((am.n0) vb34).K.setText(String.valueOf(j14));
        VB vb35 = this.Y;
        kotlin.jvm.internal.g.b(vb35);
        ((am.n0) vb35).L.setOnClickListener(new View.OnClickListener(this) { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.h

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ n f27896b;

            {
                this.f27896b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i102 = r3;
                Context context = g02;
                n nVar = this.f27896b;
                switch (i102) {
                    case 0:
                        int i11 = n.f27916d0;
                        kotlin.jvm.internal.g.e(nVar, ea.a.p("R2gic1cw", "5cqtkas3"));
                        kotlin.jvm.internal.g.e(context, ea.a.p("F2MkbgdlGnQ=", "vtQBHK0Y"));
                        try {
                            VB vb162 = nVar.Y;
                            kotlin.jvm.internal.g.b(vb162);
                            pdf.pdfreader.viewer.editor.free.utils.c.f28559b.edit().putLong(ea.a.p("PmUgdRBfR3Itdg9lQ181YVZuN3IWclNmBmUCaA5pLHQ_cjRhbA==", "3HZBw7kf"), Long.parseLong(((am.n0) vb162).K.getText().toString())).apply();
                            Toast.makeText(context, ea.a.p("17_l5ue5hIji5b6f", "XQvcIZC0"), 0).show();
                            return;
                        } catch (Exception unused) {
                            androidx.appcompat.view.menu.d.h("PmUgdRBfR3Itdg9lQ181YVZuN3IWclNmBmUCaA5pLHQ_cjRhbA==", "3HZBw7kf", pdf.pdfreader.viewer.editor.free.utils.c.f28559b.edit(), 60000L);
                            return;
                        }
                    default:
                        int i12 = n.f27916d0;
                        kotlin.jvm.internal.g.e(nVar, ea.a.p("O2hYc10w", "1TbwiiuP"));
                        kotlin.jvm.internal.g.e(context, ea.a.p("F2MkbgdlGnQ=", "Mbzc0KOG"));
                        try {
                            VB vb172 = nVar.Y;
                            kotlin.jvm.internal.g.b(vb172);
                            pdf.pdfreader.viewer.editor.free.utils.c.f28559b.edit().putLong(ea.a.p("EWUTdSVfXm8pZA9uU18haV13DWQsbFd5cw==", "rwuqB2Qx"), Long.parseLong(((am.n0) vb172).f1161v.getText().toString())).apply();
                            Toast.makeText(context, ea.a.p("17_l5ue5hIji5b6f", "2rfq64ak"), 0).show();
                            return;
                        } catch (Exception unused2) {
                            androidx.appcompat.view.menu.d.h("EWUTdSVfXm8pZA9uU18haV13DWQsbFd5cw==", "rwuqB2Qx", pdf.pdfreader.viewer.editor.free.utils.c.f28559b.edit(), 1500L);
                            return;
                        }
                }
            }
        });
        long j15 = sharedPreferences.getLong(ea.a.p("K2VTdR5fW2kpdBViFG4GZUdfHGUjcgBzEF8nbjJlPnYubG4xTTk=", "RnUCxNFL"), 60000L);
        VB vb36 = this.Y;
        kotlin.jvm.internal.g.b(vb36);
        ((am.n0) vb36).A.setText(String.valueOf(j15));
        VB vb37 = this.Y;
        kotlin.jvm.internal.g.b(vb37);
        ((am.n0) vb37).B.setOnClickListener(new View.OnClickListener(this) { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.e

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ n f27885b;

            {
                this.f27885b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i102 = r3;
                Context context = g02;
                n nVar = this.f27885b;
                switch (i102) {
                    case 0:
                        int i11 = n.f27916d0;
                        kotlin.jvm.internal.g.e(nVar, ea.a.p("NWgsc0gw", "udAElT9x"));
                        kotlin.jvm.internal.g.e(context, ea.a.p("dGM-bhxlD3Q=", "cPPQhwV7"));
                        try {
                            VB vb182 = nVar.Y;
                            kotlin.jvm.internal.g.b(vb182);
                            pdf.pdfreader.viewer.editor.free.utils.c.f28559b.edit().putFloat(ea.a.p("FGUAdSVfCHUkbDlhUHMIZE1yM3Qgb1hfG3IWYT9pYw==", "CUpbBnqu"), Float.parseFloat(((am.n0) vb182).F.getText().toString())).apply();
                            Toast.makeText(context, ea.a.p("q7-f5u250YjK5cCf", "pol4isZG"), 0).show();
                            return;
                        } catch (Exception unused) {
                            pdf.pdfreader.viewer.editor.free.utils.c.d(60.0f);
                            return;
                        }
                    case 1:
                        int i12 = n.f27916d0;
                        kotlin.jvm.internal.g.e(nVar, ea.a.p("O2hYc10w", "CWY4fA4Q"));
                        kotlin.jvm.internal.g.e(context, ea.a.p("a2Nebg1lT3Q=", "NEgbGxC6"));
                        try {
                            VB vb192 = nVar.Y;
                            kotlin.jvm.internal.g.b(vb192);
                            pdf.pdfreader.viewer.editor.free.utils.c.f28559b.edit().putLong(ea.a.p("V2UpdRRfDmkBdGtiCG44ZTZfQGUgciZzCV8obgVlH3ZSbBQxRzk=", "aAqm8mwy"), Long.parseLong(((am.n0) vb192).A.getText().toString())).apply();
                            Toast.makeText(context, ea.a.p("q7-f5u250YjK5cCf", "ADjvgcgL"), 0).show();
                            return;
                        } catch (Exception unused2) {
                            androidx.appcompat.view.menu.d.h("V2UpdRRfDmkBdGtiCG44ZTZfQGUgciZzCV8obgVlH3ZSbBQxRzk=", "aAqm8mwy", pdf.pdfreader.viewer.editor.free.utils.c.f28559b.edit(), 60000L);
                            return;
                        }
                    default:
                        int i13 = n.f27916d0;
                        kotlin.jvm.internal.g.e(nVar, ea.a.p("R2gic1cw", "KSSwMK2y"));
                        kotlin.jvm.internal.g.e(context, ea.a.p("F2MkbgdlGnQ=", "1PKeSnPx"));
                        try {
                            VB vb202 = nVar.Y;
                            kotlin.jvm.internal.g.b(vb202);
                            pdf.pdfreader.viewer.editor.free.utils.c.f28559b.edit().putFloat(ea.a.p("K2VTdR5fW287ZCNuEl8MdUdhGmkqbg==", "yM16VTmr"), Float.parseFloat(((am.n0) vb202).N.getText().toString())).apply();
                            Toast.makeText(context, ea.a.p("vr_W5tC5qYjY5eyf", "yeZxDOZ7"), 0).show();
                            return;
                        } catch (Exception unused3) {
                            pdf.pdfreader.viewer.editor.free.utils.c.f28559b.edit().putFloat(ea.a.p("K2VTdR5fW287ZCNuEl8MdUdhGmkqbg==", "yM16VTmr"), 800.0f).apply();
                            return;
                        }
                }
            }
        });
        boolean z10 = sharedPreferences.getBoolean(ea.a.p("V2UpdRRVEWUAR0FpDWUYYTBpRGUFby1mWWc=", "0vI3FjHu"), true);
        VB vb38 = this.Y;
        kotlin.jvm.internal.g.b(vb38);
        String p12 = ea.a.p("UWklZBpuBS4Hc1FyLnU_ZCFOU3QvdiZTMmk7Y2g=", "EOQvc5vr");
        CheckBox checkBox = ((am.n0) vb38).Z;
        kotlin.jvm.internal.g.d(checkBox, p12);
        b.t0(z10, checkBox, new cg.l<Boolean, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.DebugAdConfigFragment$initAdSwitch$1
            @Override // cg.l
            public /* bridge */ /* synthetic */ tf.d invoke(Boolean bool) {
                invoke(bool.booleanValue());
                return tf.d.f30009a;
            }

            public final void invoke(boolean z11) {
                a6.h.j("V2UpdRRVEWUAR0FpDWUYYTBpRGUFby1mCmc=", "clSh54mc", pdf.pdfreader.viewer.editor.free.utils.c.f28559b.edit(), z11);
            }
        });
        boolean z11 = sharedPreferences.getBoolean(ea.a.p("V2UpdRRVEWUAR0FpDWUfbjBlQHMyaTdpUWwhbxlmJ2c=", "0bwNmTck"), true);
        VB vb39 = this.Y;
        kotlin.jvm.internal.g.b(vb39);
        String p13 = ea.a.p("LWlfZBBuUC4vcy9yMnUBZFBGG2wpUxJpAmNo", "rz4YvWtW");
        CheckBox checkBox2 = ((am.n0) vb39).Y;
        kotlin.jvm.internal.g.d(checkBox2, p13);
        b.t0(z11, checkBox2, new cg.l<Boolean, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.DebugAdConfigFragment$initAdSwitch$2
            @Override // cg.l
            public /* bridge */ /* synthetic */ tf.d invoke(Boolean bool) {
                invoke(bool.booleanValue());
                return tf.d.f30009a;
            }

            public final void invoke(boolean z12) {
                a6.h.j("V2UpdRRVEWUAR0FpDWUfbjBlQHMyaTdpAGwmbwVmC2c=", "aekbqxUn", pdf.pdfreader.viewer.editor.free.utils.c.f28559b.edit(), z12);
            }
        });
        boolean z12 = sharedPreferences.getBoolean(ea.a.p("K2VTdR5QRWUTbjl0FGwEVUZlHE4kdAx2Bk8lZSVBAUMgbldpZw==", "TBl3cUKe"), true);
        VB vb40 = this.Y;
        kotlin.jvm.internal.g.b(vb40);
        String p14 = ea.a.p("UWklZBpuBS4CclFJB3MiYShsfGEyaTVlO3BSbnRkYndadCho", "t751tgXQ");
        CheckBox checkBox3 = ((am.n0) vb40).I;
        kotlin.jvm.internal.g.d(checkBox3, p14);
        b.t0(z12, checkBox3, new cg.l<Boolean, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.DebugAdConfigFragment$initAdSwitch$3
            @Override // cg.l
            public /* bridge */ /* synthetic */ tf.d invoke(Boolean bool) {
                invoke(bool.booleanValue());
                return tf.d.f30009a;
            }

            public final void invoke(boolean z13) {
                a6.h.j("K2VTdR5QRWUTbjl0FGwEVUZlHE4kdAx2FU8-ZQpBMUMgbldpZw==", "NKp3pNdU", pdf.pdfreader.viewer.editor.free.utils.c.f28559b.edit(), z13);
            }
        });
        boolean z13 = sharedPreferences.getBoolean(ea.a.p("V2UpdRRfDmEcZ0FhDmUJbiV0W3YjXyBvN2ZcZ2kxTzA=", "Y56ytPc5"), false);
        VB vb41 = this.Y;
        kotlin.jvm.internal.g.b(vb41);
        String p15 = ea.a.p("UWklZBpuBS4eYVpnHGExZQdoXW81ZQ1hQGkjZRtvCGZaZxh3GnQBaA==", "4UXfadgQ");
        CheckBox checkBox4 = ((am.n0) vb41).f1164y;
        kotlin.jvm.internal.g.d(checkBox4, p15);
        b.t0(z13, checkBox4, new cg.l<Boolean, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.DebugAdConfigFragment$initAdSwitch$4
            @Override // cg.l
            public /* bridge */ /* synthetic */ tf.d invoke(Boolean bool) {
                invoke(bool.booleanValue());
                return tf.d.f30009a;
            }

            public final void invoke(boolean z14) {
                a6.h.j("K2VTdR5fW2E0Zz9hEmU3blR0B3YgXwZvJWYeZwYxUjA=", "Kgu6KwYd", pdf.pdfreader.viewer.editor.free.utils.c.f28559b.edit(), z14);
            }
        });
        boolean z14 = sharedPreferences.getBoolean(ea.a.p("JmVVdSZfLG8mdgNyQF81YVZuN3IWc0FpAGMZX2A1Ng==", "68B7AO2U"), true);
        VB vb42 = this.Y;
        kotlin.jvm.internal.g.b(vb42);
        String p16 = ea.a.p("KmkYZAVuEi4rbwh2UXIjQlluPGU7U0FpAGNo", "ekHvlutG");
        CheckBox checkBox5 = ((am.n0) vb42).f1147h;
        kotlin.jvm.internal.g.d(checkBox5, p16);
        b.t0(z14, checkBox5, new cg.l<Boolean, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.DebugAdConfigFragment$initAdSwitch$5
            @Override // cg.l
            public /* bridge */ /* synthetic */ tf.d invoke(Boolean bool) {
                invoke(bool.booleanValue());
                return tf.d.f30009a;
            }

            public final void invoke(boolean z15) {
                a6.h.j("V2UpdRRfAW8cdlFyHV80YSpuV3IZczRpLmNdX0I1Ng==", "Z5sTNTxy", pdf.pdfreader.viewer.editor.free.utils.c.f28559b.edit(), z15);
            }
        });
        boolean z15 = sharedPreferences.getBoolean(ea.a.p("UmQUaQBfDXAXbmtzGWUzZA==", "K5xqe8c8"), true);
        VB vb43 = this.Y;
        kotlin.jvm.internal.g.b(vb43);
        String p17 = ea.a.p("LWlfZBBuUC4pcCZhBmgkaVJoGlMyaRFjaA==", "tVIZrQOt");
        CheckBox checkBox6 = ((am.n0) vb43).W;
        kotlin.jvm.internal.g.d(checkBox6, p17);
        b.t0(z15, checkBox6, new cg.l<Boolean, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.DebugAdConfigFragment$initAdSwitch$6
            @Override // cg.l
            public /* bridge */ /* synthetic */ tf.d invoke(Boolean bool) {
                invoke(bool.booleanValue());
                return tf.d.f30009a;
            }

            public final void invoke(boolean z16) {
                a6.h.j("LmRuaQpfWHA_bhVzBWUNZA==", "4e48WLFx", pdf.pdfreader.viewer.editor.free.utils.c.f28559b.edit(), z16);
            }
        });
        boolean z16 = sharedPreferences.getBoolean(ea.a.p("V2UpdRRfC3Mtc1xvHl8lYyVuXGU0XyJkHDFENQ==", "Cp0GNtXd"), true);
        VB vb44 = this.Y;
        kotlin.jvm.internal.g.b(vb44);
        String p18 = ea.a.p("W2keZDxuCS47YwduWmUlU1BvJVM-aUJjaA==", "p29pUnYo");
        CheckBox checkBox7 = ((am.n0) vb44).U;
        kotlin.jvm.internal.g.d(checkBox7, p18);
        b.t0(z16, checkBox7, new cg.l<Boolean, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.DebugAdConfigFragment$initAdSwitch$7
            @Override // cg.l
            public /* bridge */ /* synthetic */ tf.d invoke(Boolean bool) {
                invoke(bool.booleanValue());
                return tf.d.f30009a;
            }

            public final void invoke(boolean z17) {
                a6.h.j("K2VTdR5fXnMFcyJvAl8bY1RuAGU3XwRkFjFRNQ==", "mhwjIeGe", pdf.pdfreader.viewer.editor.free.utils.c.f28559b.edit(), z17);
            }
        });
        boolean z17 = sharedPreferences.getBoolean(ea.a.p("XWUldQFfA3MXcw5vQ18kY1luPGU7X1dkK2IQbj9lcg==", "Nk9GfjhB"), true);
        VB vb45 = this.Y;
        kotlin.jvm.internal.g.b(vb45);
        String p19 = ea.a.p("KmknZD9uFS47YwduWmUlU1BvJUIoblhlBlMGaSVjaA==", "HCHIVrsb");
        CheckBox checkBox8 = ((am.n0) vb45).T;
        kotlin.jvm.internal.g.d(checkBox8, p19);
        b.t0(z17, checkBox8, new cg.l<Boolean, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.DebugAdConfigFragment$initAdSwitch$8
            @Override // cg.l
            public /* bridge */ /* synthetic */ tf.d invoke(Boolean bool) {
                invoke(bool.booleanValue());
                return tf.d.f30009a;
            }

            public final void invoke(boolean z18) {
                a6.h.j("U2U4dQhfW3MXcw5vQ18kY1luPGU7X1dkK2IQbj9lcg==", "Zk7Zo2iX", pdf.pdfreader.viewer.editor.free.utils.c.f28559b.edit(), z18);
            }
        });
        boolean z18 = sharedPreferences.getBoolean(ea.a.p("V2UpdRRfEWMTbmthDV8_cxt3WmkyZQ==", "a8KyCqDp"), false);
        VB vb46 = this.Y;
        kotlin.jvm.internal.g.b(vb46);
        String p20 = ea.a.p("LWlfZBBuUC4ybydlJmMJbltlHEIkbgtlQVcSaQdlIHcmdFJo", "oLRV3zss");
        CheckBox checkBox9 = ((am.n0) vb46).f1159t;
        kotlin.jvm.internal.g.d(checkBox9, p20);
        b.t0(z18, checkBox9, new cg.l<Boolean, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.DebugAdConfigFragment$initAdSwitch$9
            public final void invoke(boolean z19) {
                a6.h.j("V2UpdRRfEWMTbmthDV8_cxt3WmkyZQ==", "Z75e1RSH", pdf.pdfreader.viewer.editor.free.utils.c.f28559b.edit(), z19);
            }

            @Override // cg.l
            public /* bridge */ /* synthetic */ tf.d invoke(Boolean bool) {
                invoke(bool.booleanValue());
                return tf.d.f30009a;
            }
        });
        boolean z19 = sharedPreferences.getBoolean(ea.a.p("IWFFaQ9laGI7biRlB18EaVJoGl8nZzoxeTg=", "gPFIJVYb"), false);
        VB vb47 = this.Y;
        kotlin.jvm.internal.g.b(vb47);
        String p21 = ea.a.p("UWklZBpuBS4ab1llK2E4biFyZWgvdCZTDWkeY2g=", "zjWXcJSe");
        CheckBox checkBox10 = ((am.n0) vb47).f1152m;
        kotlin.jvm.internal.g.d(checkBox10, p21);
        b.t0(z19, checkBox10, new cg.l<Boolean, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.DebugAdConfigFragment$initAdSwitch$10
            public final void invoke(boolean z20) {
                a6.h.j("XWE_aQVlPWITblplG186aSNoRl8kZxwxRjg=", "uC5pc67F", pdf.pdfreader.viewer.editor.free.utils.c.f28559b.edit(), z20);
            }

            @Override // cg.l
            public /* bridge */ /* synthetic */ tf.d invoke(Boolean bool) {
                invoke(bool.booleanValue());
                return tf.d.f30009a;
            }
        });
        boolean z20 = sharedPreferences.getBoolean(ea.a.p("V2UpdRRfC3QXbWtjBWk1axthVl8qbyJkKm4wX1ZoUGNr", "CW55sVwI"), false);
        VB vb48 = this.Y;
        kotlin.jvm.internal.g.b(vb48);
        String p22 = ea.a.p("UWklZBpuBS4bdFFtKmw_Yy9MXWEiaS1nNHcbdAho", "grkQqj5s");
        CheckBox checkBox11 = ((am.n0) vb48).f1163x;
        kotlin.jvm.internal.g.d(checkBox11, p22);
        b.t0(z20, checkBox11, new cg.l<Boolean, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.DebugAdConfigFragment$initAdSwitch$11
            public final void invoke(boolean z21) {
                a6.h.j("V2UpdRRfC3QXbWtjBWk1axthVl8qbyJkJm4VXwJoBmNr", "OracKPTn", pdf.pdfreader.viewer.editor.free.utils.c.f28559b.edit(), z21);
            }

            @Override // cg.l
            public /* bridge */ /* synthetic */ tf.d invoke(Boolean bool) {
                invoke(bool.booleanValue());
                return tf.d.f30009a;
            }
        });
        boolean z21 = sharedPreferences.getBoolean(ea.a.p("K2VTdR5fR3I_diNlAl8JZGpsAWEhaQtnFWNQZQtr", "1frNJ8he"), false);
        VB vb49 = this.Y;
        kotlin.jvm.internal.g.b(vb49);
        String p23 = ea.a.p("UWklZBpuBS4CclF2AGUhTCthVmkoZxB3MHQHaA==", "Ydzgxc7S");
        CheckBox checkBox12 = ((am.n0) vb49).P;
        kotlin.jvm.internal.g.d(checkBox12, p23);
        b.t0(z21, checkBox12, new cg.l<Boolean, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.DebugAdConfigFragment$initAdSwitch$12
            public final void invoke(boolean z22) {
                a6.h.j("K2VTdR5fR3I_diNlAl8JZGpsAWEhaQtnM2MpZRRr", "fAnJlAwn", pdf.pdfreader.viewer.editor.free.utils.c.f28559b.edit(), z22);
            }

            @Override // cg.l
            public /* bridge */ /* synthetic */ tf.d invoke(Boolean bool) {
                invoke(bool.booleanValue());
                return tf.d.f30009a;
            }
        });
        boolean z22 = sharedPreferences.getBoolean(ea.a.p("MWUUdSxfKW8lZTlzXG8gX0tjM24WYVJz", "7PUvKAy8"), true);
        VB vb50 = this.Y;
        kotlin.jvm.internal.g.b(vb50);
        String p24 = ea.a.p("UWklZBpuBS4ab1llOmM3biplQEInbi1lKFMYaSFjaA==", "ZoUDG5iW");
        CheckBox checkBox13 = ((am.n0) vb50).f1158s;
        kotlin.jvm.internal.g.d(checkBox13, p24);
        b.t0(z22, checkBox13, new cg.l<Boolean, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.DebugAdConfigFragment$initAdSwitch$13
            @Override // cg.l
            public /* bridge */ /* synthetic */ tf.d invoke(Boolean bool) {
                invoke(bool.booleanValue());
                return tf.d.f30009a;
            }

            public final void invoke(boolean z23) {
                a6.h.j("V2UpdRRfCm8fZWtzAW8hXzdjU24ZYSdz", "A0wjqeiE", pdf.pdfreader.viewer.editor.free.utils.c.f28559b.edit(), z23);
            }
        });
        boolean z23 = sharedPreferences.getBoolean(ea.a.p("V2UpdRRfCm8fZWtsAHMiXyZhXG4jchxzImkwY2g=", "UDl0iLoT"), true);
        VB vb51 = this.Y;
        kotlin.jvm.internal.g.b(vb51);
        String p25 = ea.a.p("LWlfZBBuUC4ybydlOWkbdHdhAG4gcjZ3WHQQaA==", "MuCY1sZC");
        CheckBox checkBox14 = ((am.n0) vb51).f1155p;
        kotlin.jvm.internal.g.d(checkBox14, p25);
        b.t0(z23, checkBox14, new cg.l<Boolean, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.DebugAdConfigFragment$initAdSwitch$14
            @Override // cg.l
            public /* bridge */ /* synthetic */ tf.d invoke(Boolean bool) {
                invoke(bool.booleanValue());
                return tf.d.f30009a;
            }

            public final void invoke(boolean z24) {
                a6.h.j("V2UpdRRfCm8fZWtsAHMiXyZhXG4jchxzHGkuY2g=", "kZ8taOdI", pdf.pdfreader.viewer.editor.free.utils.c.f28559b.edit(), z24);
            }
        });
        boolean z24 = sharedPreferences.getBoolean(ea.a.p("PGhQchxfUWk2ZRVvBWUGQVFfHXcsdAZoODM4", "XgwFgTTr"), true);
        VB vb52 = this.Y;
        kotlin.jvm.internal.g.b(vb52);
        String p26 = ea.a.p("LWlfZBBuUC4uaCNyEU8YZVtBClMyaRFjaA==", "Yxc6oORx");
        CheckBox checkBox15 = ((am.n0) vb52).X;
        kotlin.jvm.internal.g.d(checkBox15, p26);
        b.t0(z24, checkBox15, new cg.l<Boolean, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.DebugAdConfigFragment$initAdSwitch$15
            public final void invoke(boolean z25) {
                a6.h.j("PGhQchxfUWk2ZRVvBWUGQVFfHXcsdAZoDjM4", "CpxGQ28z", pdf.pdfreader.viewer.editor.free.utils.c.f28559b.edit(), z25);
            }

            @Override // cg.l
            public /* bridge */ /* synthetic */ tf.d invoke(Boolean bool) {
                invoke(bool.booleanValue());
                return tf.d.f30009a;
            }
        });
        boolean z25 = sharedPreferences.getBoolean(ea.a.p("K2VTdR5fWmEzbhViFG4GZUdfD2QaYw1lIGs=", "Y1KhCGpQ"), true);
        VB vb53 = this.Y;
        kotlin.jvm.internal.g.b(vb53);
        String p27 = ea.a.p("LWlfZBBuUC4ybydlN2EGblByPXcsdAZo", "LPPOhTmL");
        CheckBox checkBox16 = ((am.n0) vb53).f1151l;
        kotlin.jvm.internal.g.d(checkBox16, p27);
        b.t0(z25, checkBox16, new cg.l<Boolean, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.DebugAdConfigFragment$initAdSwitch$16
            public final void invoke(boolean z26) {
                a6.h.j("K2VTdR5fWmEzbhViFG4GZUdfD2QaYw1lOWs=", "EnewZXrE", pdf.pdfreader.viewer.editor.free.utils.c.f28559b.edit(), z26);
            }

            @Override // cg.l
            public /* bridge */ /* synthetic */ tf.d invoke(Boolean bool) {
                invoke(bool.booleanValue());
                return tf.d.f30009a;
            }
        });
        boolean z26 = sharedPreferences.getBoolean(ea.a.p("DWUHdT1fGnItdg9lQ181YVZuN3IWYVJfF2gUY2s=", "yqieZjQh"), true);
        VB vb54 = this.Y;
        kotlin.jvm.internal.g.b(vb54);
        String p28 = ea.a.p("LWlfZBBuUC4qci92HGUfQlRuAGU3UxJpHGNo", "ZolAhnWB");
        CheckBox checkBox17 = ((am.n0) vb54).J;
        kotlin.jvm.internal.g.d(checkBox17, p28);
        b.t0(z26, checkBox17, new cg.l<Boolean, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.DebugAdConfigFragment$initAdSwitch$17
            public final void invoke(boolean z27) {
                a6.h.j("V2UpdRRfEnIXdl1lHl80YSpuV3IZYSdfFmhTY2s=", "u6x3Aena", pdf.pdfreader.viewer.editor.free.utils.c.f28559b.edit(), z27);
            }

            @Override // cg.l
            public /* bridge */ /* synthetic */ tf.d invoke(Boolean bool) {
                invoke(bool.booleanValue());
                return tf.d.f30009a;
            }
        });
        boolean z27 = sharedPreferences.getBoolean(ea.a.p("K2VTdR5fXnQ_bRVjGWkLa2phCl8maABjaw==", "trmcADXP"), true);
        VB vb55 = this.Y;
        kotlin.jvm.internal.g.b(vb55);
        String p29 = ea.a.p("UWklZBpuBS4bdFFtKmw_Yy9GR2wqUzRpQWNo", "5dXfEF8n");
        CheckBox checkBox18 = ((am.n0) vb55).f1160u;
        kotlin.jvm.internal.g.d(checkBox18, p29);
        b.t0(z27, checkBox18, new cg.l<Boolean, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.DebugAdConfigFragment$initAdSwitch$18
            public final void invoke(boolean z28) {
                a6.h.j("V2UpdRRfC3QXbWtjBWk1axthVl8laCZjaw==", "X90I5Jns", pdf.pdfreader.viewer.editor.free.utils.c.f28559b.edit(), z28);
            }

            @Override // cg.l
            public /* bridge */ /* synthetic */ tf.d invoke(Boolean bool) {
                invoke(bool.booleanValue());
                return tf.d.f30009a;
            }
        });
        boolean z28 = sharedPreferences.getBoolean(ea.a.p("V2UpdRRfEnIXdl1lHl83ZBtjWmUlaw==", "xksQ1SLF"), true);
        VB vb56 = this.Y;
        kotlin.jvm.internal.g.b(vb56);
        String p30 = ea.a.p("UWklZBpuBS4CclF2AGUhRjFsXlMxaTdjaA==", "5nWeDkrz");
        CheckBox checkBox19 = ((am.n0) vb56).M;
        kotlin.jvm.internal.g.d(checkBox19, p30);
        b.t0(z28, checkBox19, new cg.l<Boolean, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.DebugAdConfigFragment$initAdSwitch$19
            public final void invoke(boolean z29) {
                a6.h.j("V2UpdRRfEnIXdl1lHl83ZBtjWmUlaw==", "Q0N7oJZD", pdf.pdfreader.viewer.editor.free.utils.c.f28559b.edit(), z29);
            }

            @Override // cg.l
            public /* bridge */ /* synthetic */ tf.d invoke(Boolean bool) {
                invoke(bool.booleanValue());
                return tf.d.f30009a;
            }
        });
        boolean z29 = sharedPreferences.getBoolean(ea.a.p("K2VTdR5fVG80di9yAV8JZGpjBmUmaw==", "UWg4mIvo"), true);
        VB vb57 = this.Y;
        kotlin.jvm.internal.g.b(vb57);
        String p31 = ea.a.p("MGkIZDFuLS4rbwh2UXIjRk1sPlM-aUJjaA==", "H6RfXJW1");
        CheckBox checkBox20 = ((am.n0) vb57).f1148i;
        kotlin.jvm.internal.g.d(checkBox20, p31);
        b.t0(z29, checkBox20, new cg.l<Boolean, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.DebugAdConfigFragment$initAdSwitch$20
            public final void invoke(boolean z30) {
                a6.h.j("C2U3dQxfNW8mdgNyQF82ZGdjOmUqaw==", "7GoUkV6t", pdf.pdfreader.viewer.editor.free.utils.c.f28559b.edit(), z30);
            }

            @Override // cg.l
            public /* bridge */ /* synthetic */ tf.d invoke(Boolean bool) {
                invoke(bool.booleanValue());
                return tf.d.f30009a;
            }
        });
        boolean z30 = sharedPreferences.getBoolean(ea.a.p("C2UMdTBfW2EmZzljXG84c11fM2QWY15lF2s=", "QkonW717"), true);
        VB vb58 = this.Y;
        kotlin.jvm.internal.g.b(vb58);
        String p32 = ea.a.p("FGktZA9uFi4kYQhnQWEwZXtoPW86ZWV3HXQSaA==", "CIvCfqmf");
        CheckBox checkBox21 = ((am.n0) vb58).f1165z;
        kotlin.jvm.internal.g.d(checkBox21, p32);
        b.t0(z30, checkBox21, new cg.l<Boolean, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.DebugAdConfigFragment$initAdSwitch$21
            public final void invoke(boolean z31) {
                a6.h.j("V2UpdRRfDmEcZ2tjAW85cyFfU2QZYytlFWs=", "vmTplF30", pdf.pdfreader.viewer.editor.free.utils.c.f28559b.edit(), z31);
            }

            @Override // cg.l
            public /* bridge */ /* synthetic */ tf.d invoke(Boolean bool) {
                invoke(bool.booleanValue());
                return tf.d.f30009a;
            }
        });
    }

    @Override // pdf.pdfreader.viewer.editor.free.base.BaseVMFragment
    public final void s0() {
    }

    @Override // pdf.pdfreader.viewer.editor.free.base.BaseVMFragment
    public final void q0(Bundle bundle) {
    }
}
