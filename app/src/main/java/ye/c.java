package ye;

import android.content.Context;
import android.os.Trace;
import androidx.activity.k;
import androidx.activity.s;
import io.flutter.embedding.engine.FlutterJNI;
import java.io.File;
import java.util.concurrent.Callable;
import ye.d;

/* compiled from: FlutterLoader.java */
/* loaded from: classes.dex */
public final class c implements Callable<d.a> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Context f32129a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ d f32130b;

    public c(d dVar, Context context) {
        this.f32130b = dVar;
        this.f32129a = context;
    }

    @Override // java.util.concurrent.Callable
    public final d.a call() {
        Context context = this.f32129a;
        d dVar = this.f32130b;
        Trace.beginSection(s.w("FlutterLoader initTask"));
        try {
            dVar.getClass();
            FlutterJNI flutterJNI = dVar.f32134e;
            flutterJNI.loadLibrary();
            flutterJNI.updateRefreshRate();
            dVar.f32135f.execute(new k(this, 13));
            File filesDir = context.getFilesDir();
            if (filesDir == null) {
                filesDir = new File(p001if.a.a(context), "files");
            }
            String path = filesDir.getPath();
            File codeCacheDir = context.getCodeCacheDir();
            if (codeCacheDir == null) {
                codeCacheDir = context.getCacheDir();
            }
            if (codeCacheDir == null) {
                codeCacheDir = new File(p001if.a.a(context), "cache");
            }
            String path2 = codeCacheDir.getPath();
            File dir = context.getDir("flutter", 0);
            if (dir == null) {
                dir = new File(p001if.a.a(context), "app_flutter");
            }
            dir.getPath();
            return new d.a(path, path2);
        } finally {
            Trace.endSection();
        }
    }
}
