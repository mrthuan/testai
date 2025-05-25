package androidx.room;

import a2.c;

/* compiled from: RoomOpenHelper.java */
/* loaded from: classes.dex */
public final class c extends c.a {

    /* renamed from: b  reason: collision with root package name */
    public androidx.room.a f4652b;
    public final a c;

    /* renamed from: d  reason: collision with root package name */
    public final String f4653d;

    /* renamed from: e  reason: collision with root package name */
    public final String f4654e;

    /* compiled from: RoomOpenHelper.java */
    /* loaded from: classes.dex */
    public static abstract class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f4655a;

        public a(int i10) {
            this.f4655a = i10;
        }

        public abstract void a(b2.a aVar);

        public abstract void b(b2.a aVar);

        public abstract void c();

        public abstract void d(b2.a aVar);

        public abstract void e();

        public abstract void f(b2.a aVar);

        public abstract b g(b2.a aVar);
    }

    /* compiled from: RoomOpenHelper.java */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f4656a;

        /* renamed from: b  reason: collision with root package name */
        public final String f4657b;

        public b(boolean z10, String str) {
            this.f4656a = z10;
            this.f4657b = str;
        }
    }

    public c(androidx.room.a aVar, a aVar2, String str, String str2) {
        super(aVar2.f4655a);
        this.f4652b = aVar;
        this.c = aVar2;
        this.f4653d = str;
        this.f4654e = str2;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0076 A[EDGE_INSN: B:61:0x0076->B:37:0x0076 ?: BREAK  , SYNTHETIC] */
    @Override // a2.c.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(b2.a r12, int r13, int r14) {
        /*
            r11 = this;
            androidx.room.a r0 = r11.f4652b
            androidx.room.c$a r1 = r11.c
            r2 = 0
            if (r0 == 0) goto Lb8
            androidx.room.RoomDatabase$c r0 = r0.f4646d
            r0.getClass()
            r3 = 1
            if (r13 != r14) goto L15
            java.util.List r0 = java.util.Collections.emptyList()
            goto L79
        L15:
            if (r14 <= r13) goto L19
            r4 = r3
            goto L1a
        L19:
            r4 = r2
        L1a:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r6 = r13
        L20:
            if (r4 == 0) goto L25
            if (r6 >= r14) goto L78
            goto L27
        L25:
            if (r6 <= r14) goto L78
        L27:
            java.util.HashMap<java.lang.Integer, java.util.TreeMap<java.lang.Integer, x1.a>> r7 = r0.f4643a
            java.lang.Integer r8 = java.lang.Integer.valueOf(r6)
            java.lang.Object r7 = r7.get(r8)
            java.util.TreeMap r7 = (java.util.TreeMap) r7
            if (r7 != 0) goto L36
            goto L76
        L36:
            if (r4 == 0) goto L3d
            java.util.NavigableSet r8 = r7.descendingKeySet()
            goto L41
        L3d:
            java.util.Set r8 = r7.keySet()
        L41:
            java.util.Iterator r8 = r8.iterator()
        L45:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L73
            java.lang.Object r9 = r8.next()
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            if (r4 == 0) goto L5c
            if (r9 > r14) goto L62
            if (r9 <= r6) goto L62
            goto L60
        L5c:
            if (r9 < r14) goto L62
            if (r9 >= r6) goto L62
        L60:
            r10 = r3
            goto L63
        L62:
            r10 = r2
        L63:
            if (r10 == 0) goto L45
            java.lang.Integer r6 = java.lang.Integer.valueOf(r9)
            java.lang.Object r6 = r7.get(r6)
            r5.add(r6)
            r7 = r3
            r6 = r9
            goto L74
        L73:
            r7 = r2
        L74:
            if (r7 != 0) goto L20
        L76:
            r0 = 0
            goto L79
        L78:
            r0 = r5
        L79:
            if (r0 == 0) goto Lb8
            r1.f(r12)
            java.util.Iterator r0 = r0.iterator()
        L82:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L92
            java.lang.Object r2 = r0.next()
            x1.a r2 = (x1.a) r2
            r2.a(r12)
            goto L82
        L92:
            androidx.room.c$b r0 = r1.g(r12)
            boolean r2 = r0.f4656a
            if (r2 == 0) goto La2
            r1.e()
            r11.c(r12)
            r2 = r3
            goto Lb8
        La2:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r14 = "Migration didn't properly handle: "
            r13.<init>(r14)
            java.lang.String r14 = r0.f4657b
            r13.append(r14)
            java.lang.String r13 = r13.toString()
            r12.<init>(r13)
            throw r12
        Lb8:
            if (r2 != 0) goto Ldb
            androidx.room.a r0 = r11.f4652b
            if (r0 == 0) goto Lcb
            boolean r0 = r0.a(r13, r14)
            if (r0 != 0) goto Lcb
            r1.b(r12)
            r1.a(r12)
            goto Ldb
        Lcb:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "A migration from "
            java.lang.String r1 = " to "
            java.lang.String r2 = " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods."
            java.lang.String r13 = androidx.activity.f.k(r0, r13, r1, r14, r2)
            r12.<init>(r13)
            throw r12
        Ldb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.c.b(b2.a, int, int):void");
    }

    public final void c(b2.a aVar) {
        aVar.c("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        aVar.c("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '" + this.f4653d + "')");
    }
}
