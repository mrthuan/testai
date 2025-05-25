package pdf.pdfreader.viewer.editor.free.ui.act;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import pdf.pdfreader.viewer.editor.free.R;

/* loaded from: classes3.dex */
public class SettingOpenWithGuideABActivity extends jl.a {

    /* renamed from: t  reason: collision with root package name */
    public boolean f26872t = false;

    /* loaded from: classes3.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            tn.a.d(view.getContext(), ea.a.p("CXULZGU=", "zVnb76zJ"), ea.a.p("DXVfZC5zDXMXbw1fV2w-Y2s=", "Lij6Ktqe"), ea.a.p("DmVSYSBsdA==", "I9j4UkfO"), false);
            SettingOpenWithGuideABActivity.this.finish();
        }
    }

    @Override // jl.a
    public final void C1() {
        TextView textView = (TextView) findViewById(R.id.tv_open_with_guide_ab_title);
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.ll_open_with_guide_ab_middle);
        ImageView imageView = (ImageView) findViewById(R.id.iv_open_with_guide_ab_middle);
        ImageView imageView2 = (ImageView) findViewById(R.id.iv_open_with_guide_ab_bottom);
        TextView textView2 = (TextView) findViewById(R.id.tv_open_with_guide_ab_index1);
        TextView textView3 = (TextView) findViewById(R.id.tv_open_with_guide_ab_index2);
        View findViewById = findViewById(R.id.line_open_with_guide_ab_middle);
        if (this.f26872t) {
            String string = getString(R.string.arg_res_0x7f13033a);
            String string2 = getString(R.string.arg_res_0x7f130058);
            String string3 = getString(R.string.arg_res_0x7f13032b, string, string2);
            SpannableString spannableString = new SpannableString(string3);
            ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(androidx.core.content.a.getColor(this, R.color.colorAccent));
            ForegroundColorSpan foregroundColorSpan2 = new ForegroundColorSpan(androidx.core.content.a.getColor(this, R.color.colorAccent));
            int indexOf = string3.indexOf(string);
            spannableString.setSpan(foregroundColorSpan, indexOf, string.length() + indexOf, 17);
            spannableString.setSpan(new StyleSpan(1), indexOf, string.length() + indexOf, 17);
            int indexOf2 = string3.indexOf(string2);
            spannableString.setSpan(foregroundColorSpan2, indexOf2, string2.length() + indexOf2, 17);
            spannableString.setSpan(new StyleSpan(1), indexOf2, string2.length() + indexOf2, 17);
            textView.setText(spannableString);
            int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.dp_74);
            ViewGroup.LayoutParams layoutParams = relativeLayout.getLayoutParams();
            layoutParams.height = dimensionPixelOffset;
            relativeLayout.setLayoutParams(layoutParams);
            imageView.setVisibility(0);
            imageView2.setVisibility(8);
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) findViewById.getLayoutParams();
            layoutParams2.height = dimensionPixelOffset;
            layoutParams2.width = dimensionPixelOffset;
            layoutParams2.setMarginStart((-dimensionPixelOffset) / 2);
            findViewById.setLayoutParams(layoutParams2);
            String string4 = getString(R.string.arg_res_0x7f13033a);
            String string5 = getString(R.string.arg_res_0x7f13032a, string4);
            SpannableString spannableString2 = new SpannableString(string5);
            int indexOf3 = string5.indexOf(string4);
            spannableString2.setSpan(foregroundColorSpan, indexOf3, string4.length() + indexOf3, 17);
            spannableString2.setSpan(new StyleSpan(1), indexOf3, string4.length() + indexOf3, 17);
            textView2.setText(spannableString2);
            String string6 = getString(R.string.arg_res_0x7f130058);
            String string7 = getString(R.string.arg_res_0x7f13032d, string6);
            SpannableString spannableString3 = new SpannableString(string7);
            int indexOf4 = string7.indexOf(string6);
            spannableString3.setSpan(foregroundColorSpan, indexOf4, string6.length() + indexOf4, 17);
            spannableString3.setSpan(new StyleSpan(1), indexOf4, string6.length() + indexOf4, 17);
            textView3.setText(spannableString3);
        } else {
            textView.setText(Html.fromHtml(getString(R.string.arg_res_0x7f13032e).replace(ea.a.p("anM=", "tPr1rBOW"), String.format(ea.a.p("c2Zebg0gVG82bzg9VyMsRAcwXEFnPlliaCUiPBtiTjxgZl5uDT4=", "depQVQ4p"), getString(R.string.arg_res_0x7f13033a)))));
            int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(R.dimen.dp_32);
            ViewGroup.LayoutParams layoutParams3 = relativeLayout.getLayoutParams();
            layoutParams3.height = dimensionPixelOffset2;
            relativeLayout.setLayoutParams(layoutParams3);
            imageView.setVisibility(8);
            imageView2.setVisibility(0);
            RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) findViewById.getLayoutParams();
            layoutParams4.height = dimensionPixelOffset2;
            layoutParams4.width = dimensionPixelOffset2;
            layoutParams4.setMarginStart((-dimensionPixelOffset2) / 2);
            findViewById.setLayoutParams(layoutParams4);
            textView2.setText(Html.fromHtml(getString(R.string.arg_res_0x7f13032c)));
            ForegroundColorSpan foregroundColorSpan3 = new ForegroundColorSpan(androidx.core.content.a.getColor(this, R.color.colorAccent));
            String string8 = getString(R.string.arg_res_0x7f13033a);
            String string9 = getString(R.string.arg_res_0x7f13032d, string8);
            SpannableString spannableString4 = new SpannableString(string9);
            int indexOf5 = string9.indexOf(string8);
            spannableString4.setSpan(foregroundColorSpan3, indexOf5, string8.length() + indexOf5, 17);
            spannableString4.setSpan(new StyleSpan(1), indexOf5, string8.length() + indexOf5, 17);
            textView3.setText(spannableString4);
        }
        findViewById(R.id.tv_ok).setOnClickListener(new a());
    }

    @Override // jl.a
    public final int E1() {
        return R.layout.activity_open_with_guide_ab;
    }

    @Override // jl.a
    public final int F1() {
        return androidx.core.content.a.getColor(this, R.color.black_70);
    }

    @Override // jl.a
    public final int G1() {
        return androidx.core.content.a.getColor(this, R.color.black_70);
    }

    @Override // jl.a, androidx.fragment.app.u, androidx.activity.ComponentActivity, k0.j, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Intent intent = getIntent();
        if (intent != null) {
            this.f26872t = TextUtils.equals(intent.getStringExtra(ea.a.p("MWUQX1hiZ3M8cg==", "UKZi98Es")), ea.a.p("Qg==", "pCC3dR6r"));
        }
        if (Build.VERSION.SDK_INT != 26) {
            setRequestedOrientation(1);
        }
        super.onCreate(bundle);
        wn.e.a(this);
        tn.a.d(this, ea.a.p("VHUiZGU=", "aiWw4g5l"), ea.a.p("I3UoZC1zOHMXcw5vdw==", "22DAHAzn"), ea.a.p("K2VXYQxsdA==", "61hWiihJ"), false);
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
