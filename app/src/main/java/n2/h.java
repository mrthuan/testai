package n2;

import m2.d;
import org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface;

/* compiled from: WebMessageListenerAdapter.java */
/* loaded from: classes.dex */
public final class h implements WebMessageListenerBoundaryInterface {

    /* renamed from: a  reason: collision with root package name */
    public final d.a f22324a;

    public h(d.a aVar) {
        this.f22324a = aVar;
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public final String[] getSupportedFeatures() {
        return new String[]{"WEB_MESSAGE_LISTENER", "WEB_MESSAGE_ARRAY_BUFFER"};
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    @Override // org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onPostMessage(android.webkit.WebView r7, java.lang.reflect.InvocationHandler r8, android.net.Uri r9, boolean r10, java.lang.reflect.InvocationHandler r11) {
        /*
            r6 = this;
            java.lang.Class<org.chromium.support_lib_boundary.WebMessageBoundaryInterface> r0 = org.chromium.support_lib_boundary.WebMessageBoundaryInterface.class
            java.lang.Object r8 = mk.a.a(r0, r8)
            org.chromium.support_lib_boundary.WebMessageBoundaryInterface r8 = (org.chromium.support_lib_boundary.WebMessageBoundaryInterface) r8
            java.lang.reflect.InvocationHandler[] r0 = r8.getPorts()
            int r1 = r0.length
            r.d[] r1 = new r.d[r1]
            r2 = 0
        L10:
            int r3 = r0.length
            if (r2 >= r3) goto L1f
            n2.i r3 = new n2.i
            r4 = r0[r2]
            r3.<init>(r4)
            r1[r2] = r3
            int r2 = r2 + 1
            goto L10
        L1f:
            n2.a$d r0 = n2.j.f22326a
            boolean r0 = r0.d()
            if (r0 == 0) goto L52
            java.lang.Class<org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface> r0 = org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface.class
            java.lang.reflect.InvocationHandler r8 = r8.getMessagePayload()
            java.lang.Object r8 = mk.a.a(r0, r8)
            org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface r8 = (org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface) r8
            int r0 = r8.getType()
            if (r0 == 0) goto L48
            r1 = 1
            if (r0 == r1) goto L3e
            r8 = 0
            goto L5c
        L3e:
            m2.c r0 = new m2.c
            byte[] r8 = r8.getAsArrayBuffer()
            r0.<init>(r8)
            goto L5b
        L48:
            m2.c r0 = new m2.c
            java.lang.String r8 = r8.getAsString()
            r0.<init>(r8)
            goto L5b
        L52:
            m2.c r0 = new m2.c
            java.lang.String r8 = r8.getData()
            r0.<init>(r8)
        L5b:
            r8 = r0
        L5c:
            r2 = r8
            if (r2 == 0) goto L7b
            java.lang.Class<org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface> r8 = org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface.class
            java.lang.Object r8 = mk.a.a(r8, r11)
            org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface r8 = (org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface) r8
            n2.e r11 = new n2.e
            r11.<init>(r8)
            java.lang.Object r8 = r8.getOrCreatePeer(r11)
            r5 = r8
            n2.f r5 = (n2.f) r5
            m2.d$a r0 = r6.f22324a
            r1 = r7
            r3 = r9
            r4 = r10
            r0.onPostMessage(r1, r2, r3, r4, r5)
        L7b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: n2.h.onPostMessage(android.webkit.WebView, java.lang.reflect.InvocationHandler, android.net.Uri, boolean, java.lang.reflect.InvocationHandler):void");
    }
}
