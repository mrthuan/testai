package c5;

import android.app.Activity;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import be.c;
import c7.p;
import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped;
import ee.b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.w;
import y6.a;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class f implements d5.a, p.a, b.InterfaceC0211b, dn.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Object f5573a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f5574b;
    public final /* synthetic */ Object c;

    public /* synthetic */ f(Object obj, Object obj2, Object obj3) {
        this.f5573a = obj;
        this.f5574b = obj2;
        this.c = obj3;
    }

    @Override // ee.b.InterfaceC0211b
    public final void a() {
        ud.h this$0 = (ud.h) this.f5573a;
        Activity context = (Activity) this.f5574b;
        kotlin.jvm.internal.g.e(this$0, "this$0");
        kotlin.jvm.internal.g.e(context, "$context");
        this$0.n(context, (c.a) this.c);
    }

    @Override // c7.p.a
    public final Object apply(Object obj) {
        p pVar = (p) this.f5573a;
        Map map = (Map) this.f5574b;
        a.C0418a c0418a = (a.C0418a) this.c;
        Cursor cursor = (Cursor) obj;
        s6.b bVar = p.f5653f;
        pVar.getClass();
        while (cursor.moveToNext()) {
            String string = cursor.getString(0);
            int i10 = cursor.getInt(1);
            LogEventDropped.Reason reason = LogEventDropped.Reason.REASON_UNKNOWN;
            if (i10 != reason.getNumber()) {
                LogEventDropped.Reason reason2 = LogEventDropped.Reason.MESSAGE_TOO_OLD;
                if (i10 != reason2.getNumber()) {
                    reason2 = LogEventDropped.Reason.CACHE_FULL;
                    if (i10 != reason2.getNumber()) {
                        reason2 = LogEventDropped.Reason.PAYLOAD_TOO_BIG;
                        if (i10 != reason2.getNumber()) {
                            reason2 = LogEventDropped.Reason.MAX_RETRIES_REACHED;
                            if (i10 != reason2.getNumber()) {
                                reason2 = LogEventDropped.Reason.INVALID_PAYLOD;
                                if (i10 != reason2.getNumber()) {
                                    reason2 = LogEventDropped.Reason.SERVER_ERROR;
                                    if (i10 != reason2.getNumber()) {
                                        z6.a.a("SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN", Integer.valueOf(i10));
                                    }
                                }
                            }
                        }
                    }
                }
                reason = reason2;
            }
            long j10 = cursor.getLong(2);
            if (!map.containsKey(string)) {
                map.put(string, new ArrayList());
            }
            ((List) map.get(string)).add(new LogEventDropped(j10, reason));
        }
        for (Map.Entry entry : map.entrySet()) {
            int i11 = y6.c.c;
            new ArrayList();
            c0418a.f32081b.add(new y6.c((String) entry.getKey(), Collections.unmodifiableList((List) entry.getValue())));
        }
        long a10 = pVar.f5655b.a();
        SQLiteDatabase f10 = pVar.f();
        f10.beginTransaction();
        try {
            Cursor rawQuery = f10.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]);
            rawQuery.moveToNext();
            y6.e eVar = new y6.e(rawQuery.getLong(0), a10);
            rawQuery.close();
            f10.setTransactionSuccessful();
            f10.endTransaction();
            c0418a.f32080a = eVar;
            c0418a.c = new y6.b(new y6.d(pVar.f().compileStatement("PRAGMA page_size").simpleQueryForLong() * pVar.f().compileStatement("PRAGMA page_count").simpleQueryForLong(), c7.e.f5635a.f5629b));
            c0418a.f32082d = pVar.f5657e.get();
            return new y6.a(c0418a.f32080a, Collections.unmodifiableList(c0418a.f32081b), c0418a.c, c0418a.f32082d);
        } catch (Throwable th2) {
            f10.endTransaction();
            throw th2;
        }
    }

    @Override // d5.a
    public final void b(boolean z10) {
        i this$0 = (i) this.f5573a;
        Activity activity = (Activity) this.f5574b;
        w scope = (w) this.c;
        kotlin.jvm.internal.g.e(this$0, "this$0");
        kotlin.jvm.internal.g.e(activity, "$activity");
        kotlin.jvm.internal.g.e(scope, "$scope");
        if (z10) {
            this$0.m(activity, scope);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00af, code lost:
        if (r10 != null) goto L21;
     */
    @Override // dn.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(bn.a r9, android.graphics.Bitmap r10, boolean r11) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.f5573a
            pdf.pdfreader.viewer.editor.free.feature.pdf2image.adapter.a$a r0 = (pdf.pdfreader.viewer.editor.free.feature.pdf2image.adapter.a.C0344a) r0
            java.lang.Object r1 = r8.f5574b
            pdf.pdfreader.viewer.editor.free.feature.pdf2image.adapter.a r1 = (pdf.pdfreader.viewer.editor.free.feature.pdf2image.adapter.a) r1
            java.lang.Object r2 = r8.c
            bn.a r2 = (bn.a) r2
            java.lang.String r3 = "bigImage_"
            java.lang.String r4 = "a2hebB1lcg=="
            java.lang.String r5 = "UPTteBWO"
            java.lang.String r4 = ea.a.p(r4, r5)
            kotlin.jvm.internal.g.e(r0, r4)
            com.github.chrisbanes.photoview.PhotoView r4 = r0.f25457b
            java.lang.String r5 = "O2hYc10w"
            java.lang.String r6 = "4ibOjOVr"
            java.lang.String r5 = ea.a.p(r5, r6)
            kotlin.jvm.internal.g.e(r1, r5)
            java.lang.String r5 = "aGl0"
            java.lang.String r6 = "MRLLq7hV"
            java.lang.String r5 = ea.a.p(r5, r6)
            kotlin.jvm.internal.g.e(r2, r5)
            android.content.Context r5 = r4.getContext()     // Catch: java.lang.Exception -> Ld6
            boolean r5 = r5 instanceof android.app.Activity     // Catch: java.lang.Exception -> Ld6
            if (r5 == 0) goto L52
            android.content.Context r5 = r4.getContext()     // Catch: java.lang.Exception -> Ld6
            java.lang.String r6 = "IXVdbFljVm40bz4gF2VIY1RzGiAxb0VuBm5AbgxsKiA7eUFlWWFZZChvI2RbYRhwG0ENdCx2DHR5"
            java.lang.String r7 = "zZzpimyF"
            java.lang.String r6 = ea.a.p(r6, r7)     // Catch: java.lang.Exception -> Ld6
            kotlin.jvm.internal.g.c(r5, r6)     // Catch: java.lang.Exception -> Ld6
            android.app.Activity r5 = (android.app.Activity) r5     // Catch: java.lang.Exception -> Ld6
            boolean r5 = pdf.pdfreader.viewer.editor.free.utils.extension.a.b(r5)     // Catch: java.lang.Exception -> Ld6
            if (r5 == 0) goto L52
            goto Lda
        L52:
            int r5 = r9.f5491e     // Catch: java.lang.Exception -> Ld6
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Ld6
            r6.<init>(r3)     // Catch: java.lang.Exception -> Ld6
            r6.append(r5)     // Catch: java.lang.Exception -> Ld6
            java.lang.String r3 = r6.toString()     // Catch: java.lang.Exception -> Ld6
            java.lang.Object r5 = r4.getTag()     // Catch: java.lang.Exception -> Ld6
            boolean r3 = kotlin.jvm.internal.g.a(r3, r5)     // Catch: java.lang.Exception -> Ld6
            if (r3 == 0) goto Lda
            if (r10 == 0) goto L8b
            int r3 = r10.getWidth()     // Catch: java.lang.Exception -> Ld6
            int r5 = r10.getHeight()     // Catch: java.lang.Exception -> Ld6
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Ld6
            r6.<init>()     // Catch: java.lang.Exception -> Ld6
            r6.append(r3)     // Catch: java.lang.Exception -> Ld6
            java.lang.String r3 = ":"
            r6.append(r3)     // Catch: java.lang.Exception -> Ld6
            r6.append(r5)     // Catch: java.lang.Exception -> Ld6
            java.lang.String r3 = r6.toString()     // Catch: java.lang.Exception -> Ld6
            r9.a(r3)     // Catch: java.lang.Exception -> Ld6
        L8b:
            if (r11 == 0) goto L95
            java.lang.ref.WeakReference r11 = new java.lang.ref.WeakReference     // Catch: java.lang.Exception -> Ld6
            r11.<init>(r10)     // Catch: java.lang.Exception -> Ld6
            r9.c = r11     // Catch: java.lang.Exception -> Ld6
            goto L9c
        L95:
            java.lang.ref.WeakReference r11 = new java.lang.ref.WeakReference     // Catch: java.lang.Exception -> Ld6
            r11.<init>(r10)     // Catch: java.lang.Exception -> Ld6
            r9.f5489b = r11     // Catch: java.lang.Exception -> Ld6
        L9c:
            android.content.Context r9 = r4.getContext()     // Catch: java.lang.Exception -> Ld6
            com.bumptech.glide.f r9 = com.bumptech.glide.b.f(r9)     // Catch: java.lang.Exception -> Ld6
            boolean r10 = r1.f25456h     // Catch: java.lang.Exception -> Ld6
            if (r10 == 0) goto Lad
            java.lang.ref.WeakReference<android.graphics.Bitmap> r10 = r2.c     // Catch: java.lang.Exception -> Ld6
            if (r10 == 0) goto Lb8
            goto Lb1
        Lad:
            java.lang.ref.WeakReference<android.graphics.Bitmap> r10 = r2.f5489b     // Catch: java.lang.Exception -> Ld6
            if (r10 == 0) goto Lb8
        Lb1:
            java.lang.Object r10 = r10.get()     // Catch: java.lang.Exception -> Ld6
            android.graphics.Bitmap r10 = (android.graphics.Bitmap) r10     // Catch: java.lang.Exception -> Ld6
            goto Lb9
        Lb8:
            r10 = 0
        Lb9:
            com.bumptech.glide.e r9 = r9.l(r10)     // Catch: java.lang.Exception -> Ld6
            r10 = -2147483648(0xffffffff80000000, float:-0.0)
            l4.a r9 = r9.n(r10, r10)     // Catch: java.lang.Exception -> Ld6
            com.bumptech.glide.e r9 = (com.bumptech.glide.e) r9     // Catch: java.lang.Exception -> Ld6
            l4.a r9 = r9.i()     // Catch: java.lang.Exception -> Ld6
            com.bumptech.glide.e r9 = (com.bumptech.glide.e) r9     // Catch: java.lang.Exception -> Ld6
            r9.E(r4)     // Catch: java.lang.Exception -> Ld6
            android.widget.FrameLayout r9 = r0.c     // Catch: java.lang.Exception -> Ld6
            r10 = 8
            r9.setVisibility(r10)     // Catch: java.lang.Exception -> Ld6
            goto Lda
        Ld6:
            r9 = move-exception
            r9.printStackTrace()
        Lda:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c5.f.h(bn.a, android.graphics.Bitmap, boolean):void");
    }
}
