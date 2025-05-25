package pdf.pdfreader.viewer.editor.free.ui.dialog;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import pdf.pdfreader.viewer.editor.free.R;

/* compiled from: CenterProgressDialog.java */
/* loaded from: classes3.dex */
public final class d extends Dialog {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f27520a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f27521b;
    public final Context c;

    /* renamed from: d  reason: collision with root package name */
    public TextView f27522d;

    /* renamed from: e  reason: collision with root package name */
    public ImageView f27523e;

    /* compiled from: CenterProgressDialog.java */
    /* loaded from: classes3.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            d.this.dismiss();
        }
    }

    public d(Context context, boolean z10) {
        super(context, R.style.Centerdialog);
        this.c = context;
        this.f27520a = false;
        this.f27521b = z10;
    }

    public final void a(int i10) {
        if (this.f27522d != null && getContext() != null) {
            this.f27522d.setText(getContext().getString(i10));
        }
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.dia_center_progress);
        setCancelable(this.f27520a);
        setCanceledOnTouchOutside(this.f27521b);
        Window window = getWindow();
        window.setGravity(17);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -2;
        window.setAttributes(attributes);
        this.f27522d = (TextView) findViewById(R.id.tv_txt);
        ImageView imageView = (ImageView) findViewById(R.id.iv_progress_close);
        this.f27523e = imageView;
        imageView.setOnClickListener(new a());
    }
}
