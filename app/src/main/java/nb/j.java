package nb;

import android.content.Context;
import java.util.HashMap;

/* compiled from: ConfigStorageClient.java */
/* loaded from: classes2.dex */
public final class j {
    public static final HashMap c = new HashMap();

    /* renamed from: a  reason: collision with root package name */
    public final Context f22433a;

    /* renamed from: b  reason: collision with root package name */
    public final String f22434b;

    public j(Context context, String str) {
        this.f22433a = context;
        this.f22434b = str;
    }

    public final synchronized void a() {
        this.f22433a.deleteFile(this.f22434b);
    }
}
