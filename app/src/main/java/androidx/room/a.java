package androidx.room;

import a2.c;
import android.content.Context;
import androidx.room.RoomDatabase;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: DatabaseConfiguration.java */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final c.InterfaceC0000c f4644a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f4645b;
    public final String c;

    /* renamed from: d  reason: collision with root package name */
    public final RoomDatabase.c f4646d;

    /* renamed from: e  reason: collision with root package name */
    public final List<RoomDatabase.b> f4647e;

    /* renamed from: f  reason: collision with root package name */
    public final Executor f4648f;

    /* renamed from: g  reason: collision with root package name */
    public final Executor f4649g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f4650h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f4651i;

    public a(Context context, String str, c.InterfaceC0000c interfaceC0000c, RoomDatabase.c cVar, ArrayList arrayList, boolean z10, RoomDatabase.JournalMode journalMode, Executor executor, Executor executor2, boolean z11, boolean z12) {
        this.f4644a = interfaceC0000c;
        this.f4645b = context;
        this.c = str;
        this.f4646d = cVar;
        this.f4647e = arrayList;
        this.f4648f = executor;
        this.f4649g = executor2;
        this.f4650h = z11;
        this.f4651i = z12;
    }

    public final boolean a(int i10, int i11) {
        boolean z10;
        if (i10 > i11) {
            z10 = true;
        } else {
            z10 = false;
        }
        if ((!z10 || !this.f4651i) && this.f4650h) {
            return true;
        }
        return false;
    }
}
