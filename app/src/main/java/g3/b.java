package g3;

import android.content.Context;
import android.content.Intent;
import android.graphics.Path;
import android.os.Bundle;
import android.os.ResultReceiver;
import androidx.room.RoomDatabase;
import com.android.billingclient.api.ProxyBillingActivityV2;
import com.google.android.gms.ads.nonagon.signalgeneration.zzay;
import com.google.android.gms.internal.ads.zzdff;
import com.google.android.gms.internal.ads.zzgcf;
import com.google.android.gms.internal.play_billing.zzb;
import com.google.android.play.core.assetpacks.d0;
import com.google.android.play.core.assetpacks.h2;
import java.util.ArrayList;
import java.util.List;
import p3.g;
import pdf.pdfreader.viewer.editor.free.ReaderPdfApplication;
import pdf.pdfreader.viewer.editor.free.ui.widget.sign.db.SignPathActionInfo;
import pdf.pdfreader.viewer.editor.free.ui.widget.sign.db.SignPathDataBase;

/* compiled from: CompoundTrimPathContent.java */
/* loaded from: classes.dex */
public final class b implements androidx.activity.result.b, o5.a, zzgcf, q9.l {

    /* renamed from: b  reason: collision with root package name */
    public static b f17513b;

    /* renamed from: a  reason: collision with root package name */
    public final Object f17514a;

    @Override // q9.m
    public final /* bridge */ /* synthetic */ Object a() {
        return new h2((d0) ((q9.m) this.f17514a).a());
    }

    public final void b(Path path) {
        List list = (List) this.f17514a;
        int size = list.size();
        while (true) {
            size--;
            if (size >= 0) {
                s sVar = (s) list.get(size);
                g.a aVar = p3.g.f23679a;
                if (sVar != null && !sVar.f17616a) {
                    p3.g.a(path, sVar.f17618d.k() / 100.0f, sVar.f17619e.k() / 100.0f, sVar.f17620f.k() / 360.0f);
                }
            } else {
                return;
            }
        }
    }

    @Override // androidx.activity.result.b
    public final void c(Object obj) {
        Bundle extras;
        ProxyBillingActivityV2 proxyBillingActivityV2 = (ProxyBillingActivityV2) this.f17514a;
        androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
        proxyBillingActivityV2.getClass();
        Intent intent = aVar.f1829b;
        int i10 = zzb.zze(intent, "ProxyBillingActivityV2").f6231a;
        ResultReceiver resultReceiver = proxyBillingActivityV2.f6174d;
        if (resultReceiver != null) {
            if (intent == null) {
                extras = null;
            } else {
                extras = intent.getExtras();
            }
            resultReceiver.send(i10, extras);
        }
        int i11 = aVar.f1828a;
        if (i11 != -1 || i10 != 0) {
            zzb.zzk("ProxyBillingActivityV2", String.format("External offer dialog finished with resultCode: %s and billing's responseCode: %s", Integer.valueOf(i11), Integer.valueOf(i10)));
        }
        proxyBillingActivityV2.finish();
    }

    public final void d(SignPathActionInfo signPathActionInfo) {
        pdf.pdfreader.viewer.editor.free.ui.widget.sign.db.d dVar = (pdf.pdfreader.viewer.editor.free.ui.widget.sign.db.d) ((SignPathDataBase) this.f17514a).k();
        RoomDatabase roomDatabase = dVar.f28510a;
        roomDatabase.b();
        roomDatabase.c();
        try {
            dVar.f28511b.e(signPathActionInfo);
            roomDatabase.j();
        } finally {
            roomDatabase.g();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgcf
    public final void zza(Throwable th2) {
        ((zzdff) this.f17514a).zzb(th2.getMessage());
    }

    @Override // com.google.android.gms.internal.ads.zzgcf
    public final /* synthetic */ void zzb(Object obj) {
        ((zzdff) this.f17514a).zza((zzay) obj);
    }

    public b(int i10) {
        if (i10 != 7) {
            this.f17514a = new ArrayList();
            return;
        }
        Context m10 = ReaderPdfApplication.m();
        if (SignPathDataBase.f28504j == null) {
            SignPathDataBase.f28504j = (SignPathDataBase) androidx.room.b.a(m10.getApplicationContext(), SignPathDataBase.class, SignPathDataBase.f28505k).b();
        }
        this.f17514a = SignPathDataBase.f28504j;
    }

    @Override // o5.a
    public final void a(int i10, String str, String str2) {
        for (o5.a aVar : (o5.a[]) this.f17514a) {
            aVar.a(i10, str, str2);
        }
    }
}
