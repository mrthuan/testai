package pdf.pdfreader.viewer.editor.free.ui.dialog;

import android.content.Context;
import pdf.pdfreader.viewer.editor.free.R;

/* compiled from: OpenLinkDialog.kt */
/* loaded from: classes3.dex */
public final class b0 extends oo.g {
    public static final /* synthetic */ int B = 0;
    public final String A;

    /* renamed from: y  reason: collision with root package name */
    public final String f27501y;

    /* renamed from: z  reason: collision with root package name */
    public final cg.a<tf.d> f27502z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(Context context, String str, cg.a<tf.d> aVar) {
        super(context, (Object) null);
        kotlin.jvm.internal.g.e(context, ea.a.p("LG9fdBx4dA==", "3QGFUZsr"));
        kotlin.jvm.internal.g.e(str, ea.a.p("PHJs", "KjI921Ti"));
        ea.a.p("FXANbjRhGGwJYxJpW24=", "21zhrq2Y");
        this.f27501y = str;
        this.f27502z = aVar;
        String string = context.getResources().getString(R.string.arg_res_0x7f130333);
        kotlin.jvm.internal.g.d(string, ea.a.p("D287dAF4TS46ZRVvQXI0ZUsuNWU9U0JyloDXZDRycF8aaSZpEF9VaSZrOWRRczRfX3AmKQ==", "qHlUd9MB"));
        this.A = string;
    }

    @Override // oo.g
    public final int w() {
        return R.layout.dialog_open_link;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0036 A[Catch: Exception -> 0x0055, TryCatch #0 {Exception -> 0x0055, blocks: (B:5:0x0016, B:7:0x0028, B:15:0x003e, B:14:0x0036), top: B:28:0x0016 }] */
    @Override // oo.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void z() {
        /*
            r9 = this;
            java.lang.String r0 = "ImFYbA1vOg=="
            java.lang.String r1 = "yVYjtVXO"
            java.lang.String r0 = ea.a.p(r0, r1)
            java.lang.String r1 = r9.f27501y
            r2 = 0
            boolean r0 = kotlin.text.j.M(r1, r0, r2)
            java.lang.String r3 = ""
            r4 = 1
            if (r0 == 0) goto L16
            goto L55
        L16:
            android.net.Uri r0 = android.net.Uri.parse(r1)     // Catch: java.lang.Exception -> L55
            java.lang.String r5 = r0.getScheme()     // Catch: java.lang.Exception -> L55
            java.lang.String r6 = r0.getHost()     // Catch: java.lang.Exception -> L55
            java.lang.String r0 = r0.getPath()     // Catch: java.lang.Exception -> L55
            if (r0 == 0) goto L31
            int r0 = r0.length()     // Catch: java.lang.Exception -> L55
            if (r0 != 0) goto L2f
            goto L31
        L2f:
            r0 = r2
            goto L32
        L31:
            r0 = r4
        L32:
            if (r0 == 0) goto L36
            r0 = r3
            goto L3e
        L36:
            java.lang.String r0 = "Sy4u"
            java.lang.String r7 = "mXebQDF7"
            java.lang.String r0 = ea.a.p(r0, r7)     // Catch: java.lang.Exception -> L55
        L3e:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L55
            r7.<init>()     // Catch: java.lang.Exception -> L55
            r7.append(r5)     // Catch: java.lang.Exception -> L55
            java.lang.String r5 = "://"
            r7.append(r5)     // Catch: java.lang.Exception -> L55
            r7.append(r6)     // Catch: java.lang.Exception -> L55
            r7.append(r0)     // Catch: java.lang.Exception -> L55
            java.lang.String r1 = r7.toString()     // Catch: java.lang.Exception -> L55
        L55:
            java.lang.Object[] r0 = new java.lang.Object[r4]
            r0[r2] = r1
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r4)
            java.lang.String r1 = r9.A
            java.lang.String r0 = java.lang.String.format(r1, r0)
            java.lang.String r1 = "KW9DbRh0H3QyaTksVSoJclJzKQ=="
            java.lang.String r4 = "Rkoie3kM"
            java.lang.String r1 = ea.a.p(r1, r4)
            kotlin.jvm.internal.g.d(r0, r1)
            java.lang.String r1 = "dHU-"
            java.lang.String r4 = "IUHHDC6m"
            java.lang.String r1 = ea.a.p(r1, r4)
            r4 = 6
            int r1 = kotlin.text.k.V(r0, r1, r2, r2, r4)
            java.lang.String r5 = "Dy8-Pg=="
            java.lang.String r6 = "aWmFUKud"
            java.lang.String r6 = ea.a.p(r5, r6)
            int r2 = kotlin.text.k.V(r0, r6, r2, r2, r4)
            int r2 = r2 + (-3)
            r4 = 2131362399(0x7f0a025f, float:1.8344577E38)
            android.view.View r4 = r9.findViewById(r4)
            android.widget.TextView r4 = (android.widget.TextView) r4
            if (r4 != 0) goto L95
            goto Ld0
        L95:
            android.text.SpannableString r6 = new android.text.SpannableString
            java.lang.String r7 = "SHU-"
            java.lang.String r8 = "ett9fWcr"
            java.lang.String r7 = ea.a.p(r7, r8)
            java.lang.String r0 = kotlin.text.j.K(r0, r7, r3)
            java.lang.String r7 = "0FJmTHGz"
            java.lang.String r5 = ea.a.p(r5, r7)
            java.lang.String r0 = kotlin.text.j.K(r0, r5, r3)
            r6.<init>(r0)
            android.text.style.UnderlineSpan r0 = new android.text.style.UnderlineSpan
            r0.<init>()
            r3 = 33
            r6.setSpan(r0, r1, r2, r3)
            android.text.style.ForegroundColorSpan r0 = new android.text.style.ForegroundColorSpan
            android.content.Context r5 = r9.getContext()
            r7 = 2131099736(0x7f060058, float:1.7811834E38)
            int r5 = androidx.core.content.a.getColor(r5, r7)
            r0.<init>(r5)
            r6.setSpan(r0, r1, r2, r3)
            r4.setText(r6)
        Ld0:
            r0 = 2131363442(0x7f0a0672, float:1.8346693E38)
            android.view.View r0 = r9.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            if (r0 == 0) goto Le5
            k9.c r1 = new k9.c
            r2 = 25
            r1.<init>(r9, r2)
            r0.setOnClickListener(r1)
        Le5:
            r0 = 2131363445(0x7f0a0675, float:1.83467E38)
            android.view.View r0 = r9.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            if (r0 == 0) goto Lfa
            u4.g r1 = new u4.g
            r2 = 19
            r1.<init>(r9, r2)
            r0.setOnClickListener(r1)
        Lfa:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.ui.dialog.b0.z():void");
    }
}
