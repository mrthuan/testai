package sb;

import android.content.Context;
import androidx.activity.s;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Result;
import kotlinx.coroutines.h;
import okhttp3.x;
import okhttp3.z;
import org.json.JSONObject;

/* compiled from: NetworkClient.kt */
/* loaded from: classes2.dex */
public final class e implements okhttp3.f {

    /* renamed from: a  reason: collision with root package name */
    public final AtomicReference<Boolean> f29785a = new AtomicReference<>(Boolean.FALSE);

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.g<b> f29786b;
    public final /* synthetic */ Context c;

    public e(h hVar, Context context) {
        this.f29786b = hVar;
        this.c = context;
    }

    @Override // okhttp3.f
    public final void a(okhttp3.internal.connection.e eVar, x xVar) {
        String str;
        String a10;
        z zVar = xVar.f23447g;
        if (zVar != null) {
            str = zVar.h();
        } else {
            str = null;
        }
        AtomicReference<okhttp3.e> atomicReference = d.f29778a;
        kotlinx.coroutines.g<b> gVar = this.f29786b;
        if (gVar.a() && !this.f29785a.getAndSet(Boolean.TRUE).booleanValue()) {
            if (str != null) {
                try {
                    a10 = b5.a.a(this.c, str);
                } catch (Exception e10) {
                    AtomicReference<okhttp3.e> atomicReference2 = d.f29778a;
                    e10.toString();
                    gVar.resumeWith(Result.m13constructorimpl(new b(-1, "")));
                    return;
                }
            } else {
                a10 = null;
            }
            if (a10 != null && xVar.f23444d == 200) {
                JSONObject jSONObject = new JSONObject(a10);
                int i10 = jSONObject.getInt("code");
                String string = jSONObject.getString("data");
                kotlin.jvm.internal.g.d(string, "responseJsonObject.getString(\"data\")");
                gVar.resumeWith(Result.m13constructorimpl(new b(i10, string)));
                return;
            }
            gVar.resumeWith(Result.m13constructorimpl(null));
        }
    }

    @Override // okhttp3.f
    public final void b(okhttp3.internal.connection.e call, IOException iOException) {
        kotlin.jvm.internal.g.e(call, "call");
        iOException.printStackTrace();
        AtomicReference<okhttp3.e> atomicReference = d.f29778a;
        iOException.toString();
        kotlinx.coroutines.g<b> gVar = this.f29786b;
        if (gVar.a() && !this.f29785a.getAndSet(Boolean.TRUE).booleanValue()) {
            gVar.resumeWith(Result.m13constructorimpl(s.v(iOException)));
        }
    }
}
