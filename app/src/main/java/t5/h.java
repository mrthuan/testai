package t5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class h implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f29938a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f29939b;

    public /* synthetic */ h(Object obj, int i10) {
        this.f29938a = i10;
        this.f29939b = obj;
    }

    private final nb.e a() {
        FileInputStream fileInputStream;
        nb.e eVar;
        nb.j jVar = (nb.j) this.f29939b;
        synchronized (jVar) {
            FileInputStream fileInputStream2 = null;
            eVar = null;
            try {
                fileInputStream = jVar.f22433a.openFileInput(jVar.f22434b);
                try {
                    int available = fileInputStream.available();
                    byte[] bArr = new byte[available];
                    fileInputStream.read(bArr, 0, available);
                    eVar = nb.e.a(new JSONObject(new String(bArr, "UTF-8")));
                    fileInputStream.close();
                } catch (FileNotFoundException | JSONException unused) {
                    if (fileInputStream != null) {
                        fileInputStream.close();
                    }
                    return eVar;
                } catch (Throwable th2) {
                    th = th2;
                    fileInputStream2 = fileInputStream;
                    if (fileInputStream2 != null) {
                        fileInputStream2.close();
                    }
                    throw th;
                }
            } catch (FileNotFoundException | JSONException unused2) {
                fileInputStream = null;
            } catch (Throwable th3) {
                th = th3;
            }
        }
        return eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x00ce A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0206 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01a3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0186  */
    @Override // java.util.concurrent.Callable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object call() {
        /*
            Method dump skipped, instructions count: 550
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t5.h.call():java.lang.Object");
    }
}
