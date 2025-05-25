package j7;

import android.net.Uri;
import android.os.AsyncTask;
import android.webkit.WebView;
import androidx.activity.f;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzauo;
import com.google.android.gms.internal.ads.zzaup;
import com.google.android.gms.internal.ads.zzbde;
import java.util.TreeMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes.dex */
public final class d extends AsyncTask {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ zzt f19049a;

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        zzt zztVar = this.f19049a;
        try {
            zztVar.f10550h = (zzauo) zztVar.c.get(1000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException unused) {
            zzm.g(5);
        } catch (TimeoutException unused2) {
            zzm.g(5);
        }
        zztVar.getClass();
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("https://").appendEncodedPath((String) zzbde.zzd.zze());
        e eVar = zztVar.f10547e;
        builder.appendQueryParameter("query", eVar.f19052d);
        builder.appendQueryParameter("pubId", eVar.f19051b);
        builder.appendQueryParameter("mappver", eVar.f19054f);
        TreeMap treeMap = eVar.c;
        for (String str : treeMap.keySet()) {
            builder.appendQueryParameter(str, (String) treeMap.get(str));
        }
        Uri build = builder.build();
        zzauo zzauoVar = zztVar.f10550h;
        if (zzauoVar != null) {
            try {
                build = zzauoVar.zzb(build, zztVar.f10546d);
            } catch (zzaup unused3) {
                zzm.g(5);
            }
        }
        return f.m(zztVar.zzq(), "#", build.getEncodedQuery());
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        String str = (String) obj;
        WebView webView = this.f19049a.f10548f;
        if (webView != null && str != null) {
            webView.loadUrl(str);
        }
    }
}
