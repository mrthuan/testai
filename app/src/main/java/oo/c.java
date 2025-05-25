package oo;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import pdf.pdfreader.viewer.editor.free.R;
import qb.j0;

/* compiled from: BaseBottomAlertDialog.kt */
/* loaded from: classes3.dex */
public abstract class c extends g {
    public static final /* synthetic */ int B = 0;
    public TextView A;

    /* renamed from: y  reason: collision with root package name */
    public TextView f23519y;

    /* renamed from: z  reason: collision with root package name */
    public TextView f23520z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Context context) {
        super(context, (Object) null);
        kotlin.jvm.internal.g.e(context, ea.a.p("B28qdC14dA==", "FldDHen2"));
    }

    public abstract int H();

    public final TextView I() {
        TextView textView = this.f23520z;
        if (textView != null) {
            return textView;
        }
        kotlin.jvm.internal.g.i(ea.a.p("IGtldg==", "2Tgn1vl1"));
        throw null;
    }

    public final TextView J() {
        TextView textView = this.f23519y;
        if (textView != null) {
            return textView;
        }
        kotlin.jvm.internal.g.i(ea.a.p("R2k_bBZUdg==", "KpwJMaa9"));
        throw null;
    }

    @Override // oo.g
    public final int w() {
        return R.layout.base_alert_dialog;
    }

    @Override // oo.g
    public void z() {
        View findViewById = x().findViewById(R.id.titleTv);
        kotlin.jvm.internal.g.d(findViewById, ea.a.p("QW8kdCVpB3dcZl1uDVY_ZTNCS0kiKBEuOWQcdAp0WWVndik=", "P2c5W6dP"));
        this.f23519y = (TextView) findViewById;
        View findViewById2 = x().findViewById(R.id.cancelTv);
        ((TextView) findViewById2).setOnClickListener(new j0(this, 24));
        kotlin.jvm.internal.g.d(findViewById2, ea.a.p("Om81dA5pU3dmZg9uUFY-ZU9CK0ktPGJlloDXKVsgYiBoIHogeCAWIGh9bCAUIHcgGCByfQ==", "bYHZX6Po"));
        this.A = (TextView) findViewById2;
        View findViewById3 = x().findViewById(R.id.okTv);
        ((TextView) findViewById3).setOnClickListener(new f5.d(this, 23));
        kotlin.jvm.internal.g.d(findViewById3, ea.a.p("PW9edC9pUnd0ZiNuEVYBZUJCF0khPDFlmIDWKWMgSSBvIBEgWSAXIHp9QCBVIEggFSBOfQ==", "frGuzpii"));
        this.f23520z = (TextView) findViewById3;
        View findViewById4 = x().findViewById(R.id.alertIconImg);
        ((ImageView) findViewById4).setVisibility(0);
        kotlin.jvm.internal.g.d(findViewById4, ea.a.p("QW8kdCVpB3dcZl1uDVY_ZTNCS0kiPAptpIDpRTogUSATIGsgUyBCIFJ9PiBJIHYgZCASfQ==", "FO0qIWPg"));
        ImageView imageView = (ImageView) findViewById4;
        x().findViewById(R.id.bottomCenterSpace).setVisibility(0);
        TextView textView = this.A;
        if (textView != null) {
            textView.setVisibility(0);
            ((ViewGroup) x().findViewById(R.id.contentLayout)).addView(View.inflate(getContext(), H(), null));
            return;
        }
        kotlin.jvm.internal.g.i(ea.a.p("LGFfYxxsY3Y=", "ZyZQjzNz"));
        throw null;
    }
}
