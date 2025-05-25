package me;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.StarCheckView;
import eo.d;
import l.p;
import me.d;
import pdf.pdfreader.viewer.editor.free.R;

/* compiled from: RateDialog.java */
/* loaded from: classes.dex */
public final class f extends d {

    /* renamed from: n  reason: collision with root package name */
    public View f22014n;

    @Override // me.d
    public final void c(Context context, ne.a aVar, oe.a aVar2) {
        int i10 = this.f22008m;
        int i11 = R.drawable.lib_rate_emoji_star_0;
        if (i10 != 0) {
            int i12 = R.string.arg_res_0x7f1301cf;
            int i13 = R.string.arg_res_0x7f1301d2;
            int i14 = R.string.arg_res_0x7f1301ca;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        i12 = R.string.arg_res_0x7f1301d6;
                        i13 = R.string.arg_res_0x7f1301d0;
                        if (i10 != 4) {
                            if (i10 != 5) {
                                i12 = R.string.arg_res_0x7f1301d5;
                            } else {
                                this.f22007l.c(4);
                                i11 = R.drawable.lib_rate_emoji_star_5;
                                i14 = R.string.arg_res_0x7f1301c9;
                            }
                        } else {
                            this.f22007l.c(3);
                            i11 = R.drawable.lib_rate_emoji_star_4;
                        }
                    } else {
                        this.f22007l.c(2);
                        i11 = R.drawable.lib_rate_emoji_star_3;
                    }
                } else {
                    this.f22007l.c(1);
                    i11 = R.drawable.lib_rate_emoji_star_2;
                }
            } else {
                this.f22007l.c(0);
                i11 = R.drawable.lib_rate_emoji_star_1;
            }
            this.f22014n.setVisibility(4);
            a(i11);
            this.f22001f.setText(i13);
            this.f22002g.setText(i12);
            this.f22004i.setText(i14);
            this.f22004i.setEnabled(true);
            this.f22004i.setAlpha(1.0f);
            this.f22005j.setAlpha(1.0f);
            if (aVar.f22442e && this.f22008m == 5) {
                g.a(context, aVar);
                if (aVar2 != null) {
                    aVar2.e(this.f22008m);
                    aVar2.c();
                }
                p pVar = this.f22006k;
                if (pVar != null && pVar.isShowing()) {
                    this.f22006k.dismiss();
                    return;
                }
                return;
            }
            return;
        }
        this.f22014n.setVisibility(0);
        a(R.drawable.lib_rate_emoji_star_0);
        this.f22001f.setText(R.string.arg_res_0x7f1301cc);
        this.f22002g.setText(aVar.f22441d);
        this.f22004i.setEnabled(false);
        this.f22004i.setAlpha(0.5f);
        this.f22005j.setAlpha(0.5f);
        if (aVar.f22439a && !aVar.f22440b) {
            this.f21997a.setInitStarDrawable(R.drawable.lib_rate_star_yellow);
        } else {
            this.f22000e.setInitStarDrawable(R.drawable.lib_rate_star_yellow);
        }
    }

    public final p d(Context context, ne.a aVar, pe.a aVar2, d.a aVar3) {
        View inflate;
        p pVar = new p(context, 0);
        if (aVar.f22439a && !aVar.f22440b) {
            inflate = LayoutInflater.from(context).inflate(R.layout.lib_rate_dialog_rtl, (ViewGroup) null);
        } else {
            inflate = LayoutInflater.from(context).inflate(R.layout.lib_rate_dialog, (ViewGroup) null);
            if (aVar.f22439a) {
                ((ImageView) inflate.findViewById(R.id.rate_hand)).setScaleX(-1.0f);
            }
        }
        RelativeLayout relativeLayout = (RelativeLayout) inflate.findViewById(R.id.main_layout);
        this.f22003h = (ImageView) inflate.findViewById(R.id.rate_emoji);
        TextView textView = (TextView) inflate.findViewById(R.id.rate_tip);
        this.f22005j = (LinearLayout) inflate.findViewById(R.id.lib_rate_button_bg);
        this.f22004i = (TextView) inflate.findViewById(R.id.lib_rate_button);
        this.f22001f = (TextView) inflate.findViewById(R.id.rate_result_title);
        this.f22002g = (TextView) inflate.findViewById(R.id.rate_result_tip);
        this.f22014n = inflate.findViewById(R.id.rate_hand_layout);
        if (aVar.c) {
            relativeLayout.setBackgroundResource(R.drawable.lib_rate_dialog_bg_dark);
            this.f22001f.setTextColor(androidx.core.content.a.getColor(context, R.color.lib_rate_dialog_message_text_color_dark));
            this.f22002g.setTextColor(androidx.core.content.a.getColor(context, R.color.lib_rate_dialog_message_text_color_dark));
        }
        this.f22003h.setImageResource(R.drawable.lib_rate_emoji_star_0);
        this.f22002g.setText(aVar.f22441d);
        this.f22004i.setEnabled(false);
        this.f22004i.setAlpha(0.5f);
        this.f22005j.setAlpha(0.5f);
        this.f21997a = (StarCheckView) inflate.findViewById(R.id.rate_star_1);
        this.f21998b = (StarCheckView) inflate.findViewById(R.id.rate_star_2);
        this.c = (StarCheckView) inflate.findViewById(R.id.rate_star_3);
        this.f21999d = (StarCheckView) inflate.findViewById(R.id.rate_star_4);
        StarCheckView starCheckView = (StarCheckView) inflate.findViewById(R.id.rate_star_5);
        this.f22000e = starCheckView;
        if (aVar.f22439a && !aVar.f22440b) {
            this.f21997a.setInitStarDrawable(R.drawable.lib_rate_star_yellow);
        } else {
            starCheckView.setInitStarDrawable(R.drawable.lib_rate_star_yellow);
        }
        d.b bVar = new d.b(aVar, aVar3);
        this.f21997a.setOnClickListener(bVar);
        this.f21998b.setOnClickListener(bVar);
        this.c.setOnClickListener(bVar);
        this.f21999d.setOnClickListener(bVar);
        this.f22000e.setOnClickListener(bVar);
        pVar.p().x(1);
        pVar.getWindow().requestFeature(1);
        pVar.setContentView(inflate);
        pVar.show();
        pVar.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        pVar.getWindow().setLayout(-1, -1);
        inflate.postDelayed(new e(aVar2), 1200L);
        return pVar;
    }
}
