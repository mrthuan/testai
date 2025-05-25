package ej;

import android.app.Activity;
import android.view.View;
import android.webkit.WebView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import java.util.Vector;
import lib.zj.office.fc.codec.CharEncoding;
import lib.zj.office.system.beans.ADialogFrame;
import lib.zj.office.system.f;
import lib.zj.office.system.g;
import pdf.pdfreader.viewer.editor.free.R;

/* compiled from: TXTEncodingDialog.java */
/* loaded from: classes3.dex */
public final class b extends pi.a {

    /* renamed from: j  reason: collision with root package name */
    public static final String[] f16637j = {"GBK", "GB2312", "BIG5", "Unicode", "UTF-8", CharEncoding.UTF_16, CharEncoding.UTF_16LE, CharEncoding.UTF_16BE, "UTF-7", "UTF-32", "UTF-32LE", "UTF-32BE", CharEncoding.US_ASCII, CharEncoding.ISO_8859_1, "ISO-8859-2", "ISO-8859-3", "ISO-8859-4", "ISO-8859-5", "ISO-8859-6", "ISO-8859-7", "ISO-8859-8", "ISO-8859-9", "ISO-8859-10", "ISO-8859-11", "ISO-8859-13", "ISO-8859-14", "ISO-8859-15", "ISO-8859-16", "ISO-2022-JP", "ISO-2022-KR", "ISO-2022-CN", "ISO-2022-CN-EXT", "UCS-2", "UCS-4", "Windows-1250", "Windows-1251", "Windows-1252", "Windows-1253", " Windows-1254", "Windows-1255", "Windows-1256", "Windows-1257", "Windows-1258", "KOI8-R", "Shift_JIS", "CP864", "EUC-JP", "EUC-KR", "BOCU-1", "CESU-8", "SCSU", "HZ-GB-2312", "TIS-620", "macintosh", "x-UTF-16LE-BOM", "x-iscii-as", "x-iscii-be", "x-iscii-de", "x-iscii-gu", "x-iscii-ka", "x-iscii-ma", "x-iscii-or", "x-iscii-pa", "x-iscii-ta", "x-iscii-te", "x-mac-cyrillic"};

    /* renamed from: f  reason: collision with root package name */
    public Spinner f16638f;

    /* renamed from: g  reason: collision with root package name */
    public WebView f16639g;

    /* renamed from: h  reason: collision with root package name */
    public char[] f16640h;

    /* renamed from: i  reason: collision with root package name */
    public ScrollView f16641i;

    public b(f fVar, Activity activity, g gVar, Vector vector) {
        super(fVar, activity, gVar, vector, 1, activity.getString(R.string.arg_res_0x7f1300f1));
        this.f16640h = new char[1024];
        ArrayAdapter arrayAdapter = new ArrayAdapter(activity, 17367048, f16637j);
        arrayAdapter.setDropDownViewResource(17367049);
        Spinner spinner = new Spinner(activity);
        this.f16638f = spinner;
        spinner.setAdapter((SpinnerAdapter) arrayAdapter);
        this.f16638f.setOnItemSelectedListener(new a(this));
        this.f28940d.addView(this.f16638f);
        WebView webView = new WebView(activity);
        this.f16639g = webView;
        webView.setPadding(5, 2, 5, 2);
        ScrollView scrollView = new ScrollView(activity);
        this.f16641i = scrollView;
        scrollView.setFillViewport(true);
        this.f16641i.addView(this.f16639g);
        this.f28940d.addView(this.f16641i);
        Button button = new Button(activity);
        this.f28941e = button;
        button.setText(activity.getString(R.string.arg_res_0x7f130023));
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
        this.f16638f = null;
        this.f16639g = null;
        this.f16640h = null;
        this.f16641i = null;
    }

    @Override // pi.a
    public final void b() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams((getContext().getResources().getDisplayMetrics().widthPixels - 50) - 10, (((getContext().getResources().getDisplayMetrics().heightPixels - (getWindow().getDecorView().getHeight() - this.f28940d.getHeight())) - 50) - this.f16638f.getBottom()) - this.f28941e.getHeight());
        layoutParams.leftMargin = 5;
        layoutParams.rightMargin = 5;
        layoutParams.bottomMargin = 5;
        this.f16641i.setLayoutParams(layoutParams);
    }

    @Override // pi.a
    public final void c() {
        b();
    }

    @Override // pi.a, android.app.Dialog
    public final void onBackPressed() {
        Vector<Object> vector = new Vector<>();
        vector.add("BP");
        this.c.doAction(this.f28938a, vector);
        super.onBackPressed();
    }

    @Override // pi.a, android.view.View.OnClickListener
    public final void onClick(View view) {
        Vector<Object> vector = new Vector<>();
        vector.add(this.f16638f.getSelectedItem().toString());
        this.c.doAction(this.f28938a, vector);
        dismiss();
    }
}
