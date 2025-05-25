package jb;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* compiled from: SharedPreferencesQueue.java */
/* loaded from: classes2.dex */
public final class x {

    /* renamed from: a  reason: collision with root package name */
    public final SharedPreferences f19162a;

    /* renamed from: e  reason: collision with root package name */
    public final Executor f19165e;

    /* renamed from: d  reason: collision with root package name */
    public final ArrayDeque<String> f19164d = new ArrayDeque<>();

    /* renamed from: b  reason: collision with root package name */
    public final String f19163b = "topic_operation_queue";
    public final String c = ",";

    public x(SharedPreferences sharedPreferences, Executor executor) {
        this.f19162a = sharedPreferences;
        this.f19165e = executor;
    }

    public static x a(SharedPreferences sharedPreferences, Executor executor) {
        x xVar = new x(sharedPreferences, executor);
        synchronized (xVar.f19164d) {
            xVar.f19164d.clear();
            String string = xVar.f19162a.getString(xVar.f19163b, "");
            if (!TextUtils.isEmpty(string) && string.contains(xVar.c)) {
                String[] split = string.split(xVar.c, -1);
                int length = split.length;
                for (String str : split) {
                    if (!TextUtils.isEmpty(str)) {
                        xVar.f19164d.add(str);
                    }
                }
            }
        }
        return xVar;
    }

    public final String b() {
        String peek;
        synchronized (this.f19164d) {
            peek = this.f19164d.peek();
        }
        return peek;
    }

    public final boolean c(String str) {
        boolean remove;
        synchronized (this.f19164d) {
            remove = this.f19164d.remove(str);
            if (remove) {
                this.f19165e.execute(new androidx.activity.i(this, 4));
            }
        }
        return remove;
    }
}
