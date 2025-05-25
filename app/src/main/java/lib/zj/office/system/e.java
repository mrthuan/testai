package lib.zj.office.system;

import android.os.Handler;
import android.os.Message;

/* compiled from: FileReaderThread.java */
/* loaded from: classes3.dex */
public final class e extends Thread {

    /* renamed from: a  reason: collision with root package name */
    public boolean f21029a = false;

    /* renamed from: b  reason: collision with root package name */
    public boolean f21030b = false;
    public boolean c = false;

    /* renamed from: d  reason: collision with root package name */
    public int f21031d = 0;

    /* renamed from: e  reason: collision with root package name */
    public String f21032e;

    /* renamed from: f  reason: collision with root package name */
    public String f21033f;

    /* renamed from: g  reason: collision with root package name */
    public Handler f21034g;

    /* renamed from: h  reason: collision with root package name */
    public f f21035h;

    public e(f fVar, Handler handler, String str, String str2) {
        this.f21035h = fVar;
        this.f21034g = handler;
        this.f21033f = str;
        this.f21032e = str2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:142:0x0254, code lost:
        if (r0 != null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x026b, code lost:
        if (r0 == null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x026d, code lost:
        r0.handleMessage(r1);
        r9.f21034g = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0272, code lost:
        r9.f21035h = null;
        r9.f21032e = null;
        r9.f21033f = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0278, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01ad, code lost:
        if (r0 != null) goto L29;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01a7  */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v23, types: [lib.zj.office.system.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v47 */
    /* JADX WARN: Type inference failed for: r0v48 */
    /* JADX WARN: Type inference failed for: r0v49 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v50 */
    /* JADX WARN: Type inference failed for: r0v51 */
    /* JADX WARN: Type inference failed for: r0v52 */
    /* JADX WARN: Type inference failed for: r0v53 */
    /* JADX WARN: Type inference failed for: r0v54 */
    /* JADX WARN: Type inference failed for: r0v55 */
    /* JADX WARN: Type inference failed for: r0v56 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a() {
        /*
            Method dump skipped, instructions count: 674
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: lib.zj.office.system.e.a():void");
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Message message = new Message();
        message.what = 2;
        this.f21034g.handleMessage(message);
        this.f21029a = false;
        this.f21030b = false;
        this.c = false;
        this.f21031d = 0;
        a();
    }
}
