package lib.zj.pdfeditor;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.app.AlertController;
import java.text.NumberFormat;
import pdf.pdfreader.viewer.editor.free.R;

/* compiled from: HorizontalProgressDialog.java */
/* loaded from: classes3.dex */
public final class e extends androidx.appcompat.app.b {

    /* renamed from: g  reason: collision with root package name */
    public ProgressBar f21474g;

    /* renamed from: h  reason: collision with root package name */
    public int f21475h;

    /* renamed from: i  reason: collision with root package name */
    public TextView f21476i;

    /* renamed from: j  reason: collision with root package name */
    public String f21477j;

    /* renamed from: k  reason: collision with root package name */
    public TextView f21478k;

    /* renamed from: l  reason: collision with root package name */
    public NumberFormat f21479l;

    /* renamed from: m  reason: collision with root package name */
    public int f21480m;

    /* renamed from: n  reason: collision with root package name */
    public int f21481n;

    /* renamed from: o  reason: collision with root package name */
    public int f21482o;

    /* renamed from: p  reason: collision with root package name */
    public int f21483p;

    /* renamed from: q  reason: collision with root package name */
    public int f21484q;

    /* renamed from: r  reason: collision with root package name */
    public Drawable f21485r;

    /* renamed from: s  reason: collision with root package name */
    public Drawable f21486s;

    /* renamed from: t  reason: collision with root package name */
    public CharSequence f21487t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f21488u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f21489v;

    /* renamed from: w  reason: collision with root package name */
    public a f21490w;

    /* renamed from: x  reason: collision with root package name */
    public int f21491x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f21492y;

    /* compiled from: HorizontalProgressDialog.java */
    /* loaded from: classes3.dex */
    public class a extends Handler {
        public a() {
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            super.handleMessage(message);
            e eVar = e.this;
            int progress = eVar.f21474g.getProgress();
            int max = eVar.f21474g.getMax();
            String str = eVar.f21477j;
            if (str != null) {
                if (eVar.f21492y) {
                    eVar.f21476i.setText(String.format(str, Integer.valueOf(eVar.f21491x), Integer.valueOf(max)));
                } else {
                    eVar.f21476i.setText(String.format(str, Integer.valueOf(progress), Integer.valueOf(max)));
                }
            } else {
                eVar.f21476i.setText("");
            }
            if (eVar.f21479l != null) {
                SpannableString spannableString = new SpannableString(eVar.f21479l.format(progress / max));
                spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
                eVar.f21478k.setText(spannableString);
                return;
            }
            eVar.f21478k.setText("");
        }
    }

    public e(Context context) {
        super(context, 0);
        this.f21475h = 0;
        this.f21477j = "%1d/%2d";
        NumberFormat percentInstance = NumberFormat.getPercentInstance();
        this.f21479l = percentInstance;
        percentInstance.setMaximumFractionDigits(0);
    }

    @Override // androidx.appcompat.app.b, l.p, androidx.activity.l, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        LayoutInflater from = LayoutInflater.from(getContext());
        int i10 = this.f21475h;
        AlertController alertController = this.f1917f;
        if (i10 == 1) {
            this.f21490w = new a();
            View inflate = from.inflate(R.layout.alert_dialog_progress_custom, (ViewGroup) null);
            this.f21474g = (ProgressBar) inflate.findViewById(R.id.progress);
            this.f21476i = (TextView) inflate.findViewById(R.id.progress_number);
            this.f21478k = (TextView) inflate.findViewById(R.id.progress_percent);
            alertController.f1875h = inflate;
            alertController.f1876i = 0;
            alertController.f1877j = false;
        }
        int i11 = this.f21480m;
        if (i11 > 0) {
            ProgressBar progressBar = this.f21474g;
            if (progressBar != null) {
                progressBar.setMax(i11);
                s();
            } else {
                this.f21480m = i11;
            }
        }
        int i12 = this.f21481n;
        if (i12 > 0) {
            t(i12, -1);
        }
        int i13 = this.f21482o;
        if (i13 > 0) {
            ProgressBar progressBar2 = this.f21474g;
            if (progressBar2 != null) {
                progressBar2.setSecondaryProgress(i13);
                s();
            } else {
                this.f21482o = i13;
            }
        }
        int i14 = this.f21483p;
        if (i14 > 0) {
            ProgressBar progressBar3 = this.f21474g;
            if (progressBar3 != null) {
                progressBar3.incrementProgressBy(i14);
                s();
            } else {
                this.f21483p = i14 + i14;
            }
        }
        int i15 = this.f21484q;
        if (i15 > 0) {
            ProgressBar progressBar4 = this.f21474g;
            if (progressBar4 != null) {
                progressBar4.incrementSecondaryProgressBy(i15);
                s();
            } else {
                this.f21484q = i15 + i15;
            }
        }
        Drawable drawable = this.f21485r;
        if (drawable != null) {
            ProgressBar progressBar5 = this.f21474g;
            if (progressBar5 != null) {
                progressBar5.setProgressDrawable(drawable);
            } else {
                this.f21485r = drawable;
            }
        }
        Drawable drawable2 = this.f21486s;
        if (drawable2 != null) {
            ProgressBar progressBar6 = this.f21474g;
            if (progressBar6 != null) {
                progressBar6.setIndeterminateDrawable(drawable2);
            } else {
                this.f21486s = drawable2;
            }
        }
        CharSequence charSequence = this.f21487t;
        if (charSequence != null) {
            if (this.f21474g != null) {
                if (this.f21475h == 1) {
                    alertController.f1873f = charSequence;
                    TextView textView = alertController.B;
                    if (textView != null) {
                        textView.setText(charSequence);
                    }
                } else {
                    throw null;
                }
            } else {
                this.f21487t = charSequence;
            }
        }
        boolean z10 = this.f21488u;
        ProgressBar progressBar7 = this.f21474g;
        if (progressBar7 != null) {
            progressBar7.setIndeterminate(z10);
        } else {
            this.f21488u = z10;
        }
        s();
        super.onCreate(bundle);
    }

    @Override // androidx.activity.l, android.app.Dialog
    public final void onStart() {
        super.onStart();
        this.f21489v = true;
    }

    @Override // l.p, androidx.activity.l, android.app.Dialog
    public final void onStop() {
        super.onStop();
        this.f21489v = false;
    }

    public final void s() {
        a aVar;
        if (this.f21475h == 1 && (aVar = this.f21490w) != null && !aVar.hasMessages(0)) {
            this.f21490w.sendEmptyMessage(0);
        }
    }

    public final void t(int i10, int i11) {
        if (this.f21489v) {
            this.f21491x = i11;
            this.f21474g.setProgress(i10);
            s();
            return;
        }
        this.f21481n = i10;
    }
}
