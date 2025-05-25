package sh;

import android.app.Activity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import java.util.Vector;
import lib.zj.office.system.beans.ADialogFrame;
import lib.zj.office.system.f;
import pdf.pdfreader.viewer.editor.free.R;

/* compiled from: NotesDialog.java */
/* loaded from: classes3.dex */
public final class b extends pi.a {

    /* renamed from: f  reason: collision with root package name */
    public ScrollView f29809f;

    /* renamed from: g  reason: collision with root package name */
    public EditText f29810g;

    public b(f fVar, Activity activity, Vector vector) {
        super(fVar, activity, null, vector, 8, activity.getResources().getString(R.string.arg_res_0x7f130347));
        EditText editText = new EditText(activity);
        this.f29810g = editText;
        editText.setBackgroundColor(-1);
        this.f29810g.setTextSize(18.0f);
        this.f29810g.setPadding(5, 2, 5, 2);
        this.f29810g.setGravity(48);
        if (this.f28939b != null) {
            this.f28940d.post(new a(this));
        }
        ScrollView scrollView = new ScrollView(activity);
        this.f29809f = scrollView;
        scrollView.setFillViewport(true);
        this.f29809f.setHorizontalFadingEdgeEnabled(false);
        this.f29809f.setFadingEdgeLength(0);
        this.f29809f.addView(this.f29810g);
        this.f28940d.addView(this.f29809f);
        Button button = new Button(activity);
        this.f28941e = button;
        button.setText(R.string.arg_res_0x7f1304b2);
        this.f28941e.setOnClickListener(this);
        this.f28940d.addView(this.f28941e);
    }

    @Override // pi.a
    public final void a() {
        Vector<Object> vector = this.f28939b;
        if (vector != null) {
            vector.clear();
            this.f28939b = null;
        }
        this.c = null;
        ADialogFrame aDialogFrame = this.f28940d;
        if (aDialogFrame != null) {
            aDialogFrame.f20976a = null;
            this.f28940d = null;
        }
        this.f28941e = null;
    }

    @Override // pi.a
    public final void b() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams((getContext().getResources().getDisplayMetrics().widthPixels - 50) - 10, ((getContext().getResources().getDisplayMetrics().heightPixels - (getWindow().getDecorView().getHeight() - this.f28940d.getHeight())) - 50) - this.f28941e.getHeight());
        layoutParams.leftMargin = 5;
        layoutParams.rightMargin = 5;
        layoutParams.bottomMargin = 5;
        this.f29809f.setLayoutParams(layoutParams);
    }

    @Override // pi.a
    public final void c() {
        b();
    }
}
