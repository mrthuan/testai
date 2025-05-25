package androidx.appcompat.app;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.app.AlertController;

/* compiled from: AlertController.java */
/* loaded from: classes.dex */
public final class a implements AdapterView.OnItemClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AlertController f1915a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AlertController.b f1916b;

    public a(AlertController.b bVar, AlertController alertController) {
        this.f1916b = bVar;
        this.f1915a = alertController;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
        AlertController.b bVar = this.f1916b;
        DialogInterface.OnClickListener onClickListener = bVar.f1910o;
        AlertController alertController = this.f1915a;
        onClickListener.onClick(alertController.f1870b, i10);
        if (!bVar.f1911p) {
            alertController.f1870b.dismiss();
        }
    }
}
