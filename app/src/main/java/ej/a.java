package ej;

import android.view.View;
import android.widget.AdapterView;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* compiled from: TXTEncodingDialog.java */
/* loaded from: classes3.dex */
public final class a implements AdapterView.OnItemSelectedListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ b f16636a;

    public a(b bVar) {
        this.f16636a = bVar;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView<?> adapterView, View view, int i10, long j10) {
        b bVar = this.f16636a;
        String obj = bVar.f16638f.getSelectedItem().toString();
        if (obj != null) {
            bVar.getClass();
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(new File(bVar.f28939b.get(0).toString())), obj));
                int read = bufferedReader.read(bVar.f16640h);
                if (read > 0) {
                    bVar.f16639g.loadDataWithBaseURL(null, ("<a>" + new String(bVar.f16640h, 0, read) + "</a>").replaceAll("\\r\\n", "<br />"), "text/html", "UTF-8", null);
                }
                bufferedReader.close();
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView<?> adapterView) {
    }
}
