package ee;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.b;
import de.e;
import pdf.pdfreader.viewer.editor.free.R;

/* compiled from: AppUpdateDialog.java */
/* loaded from: classes.dex */
public final class a {

    /* compiled from: AppUpdateDialog.java */
    /* renamed from: ee.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class DialogInterface$OnClickListenerC0210a implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f16560a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ int f16561b;
        public final /* synthetic */ String c;

        public DialogInterface$OnClickListenerC0210a(Context context, int i10, String str) {
            this.f16560a = context;
            this.f16561b = i10;
            this.c = str;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            Context context = this.f16560a;
            e.i(context).edit().putInt("update_version", this.f16561b).apply();
            String str = this.c;
            try {
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
                intent.setFlags(268435456);
                intent.setPackage("com.android.vending");
                context.startActivity(intent);
            } catch (Exception e10) {
                e10.printStackTrace();
                Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(str));
                intent2.setFlags(268435456);
                context.startActivity(intent2);
            }
            e.m(context, 0);
        }
    }

    /* compiled from: AppUpdateDialog.java */
    /* loaded from: classes.dex */
    public class b implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f16562a;

        public b(Context context) {
            this.f16562a = context;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            e.m(this.f16562a, 1);
            dialogInterface.dismiss();
        }
    }

    public static void a(Context context, String str, String str2, String str3, int i10, boolean z10) {
        int i11;
        if (z10) {
            i11 = 2132017154;
        } else {
            i11 = 2132017155;
        }
        try {
            b.a aVar = new b.a(context, i11);
            AlertController.b bVar = aVar.f1918a;
            if (TextUtils.isEmpty(str2)) {
                bVar.f1899d = bVar.f1897a.getText(R.string.arg_res_0x7f130029);
            } else {
                bVar.f1899d = str2;
            }
            bVar.f1901f = str3;
            Context context2 = bVar.f1897a;
            DialogInterface$OnClickListenerC0210a dialogInterface$OnClickListenerC0210a = new DialogInterface$OnClickListenerC0210a(context, i10, str);
            bVar.f1902g = context2.getText(R.string.arg_res_0x7f13002a);
            bVar.f1903h = dialogInterface$OnClickListenerC0210a;
            b bVar2 = new b(context);
            bVar.f1904i = context2.getText(R.string.arg_res_0x7f130026);
            bVar.f1905j = bVar2;
            androidx.appcompat.app.b a10 = aVar.a();
            a10.setCanceledOnTouchOutside(false);
            a10.show();
        } catch (Exception e10) {
            fe.a.a().c(e10);
        }
    }
}
