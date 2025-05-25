package pdf.pdfreader.viewer.editor.free.utils;

import android.content.DialogInterface;
import android.os.Looper;
import android.text.Html;
import android.text.Spanned;
import android.widget.Toast;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.b;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

/* compiled from: LogViewer.java */
/* loaded from: classes3.dex */
public final class c0 extends Thread {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Throwable f28561a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Thread f28562b;
    public final /* synthetic */ LogViewer c;

    /* compiled from: LogViewer.java */
    /* loaded from: classes3.dex */
    public class a implements DialogInterface.OnClickListener {
        public a() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            int i11 = LogViewer.f28525b;
            c0 c0Var = c0.this;
            Thread thread = c0Var.f28562b;
            Throwable th2 = c0Var.f28561a;
            throw null;
        }
    }

    public c0(LogViewer logViewer, Throwable th2, Thread thread) {
        this.c = logViewer;
        this.f28561a = th2;
        this.f28562b = thread;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        this.f28561a.printStackTrace(new PrintStream(byteArrayOutputStream));
        String[] split = byteArrayOutputStream.toString().split("\t");
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < split.length; i10++) {
            String str = split[i10];
            if (!str.contains(ea.a.p("Lm5VchZpUy4=", "Ctk8KVw4")) && !str.contains(ea.a.p("XWEVYS4=", "E67cQq3y")) && str.contains(ea.a.p("UnQ=", "4Qc0h3uZ")) && i10 > 0) {
                str = String.format(ea.a.p("D2I5PlM8BG8cdBRjBmw5cnknEWYgMHMwZCd2JUY8fWZcbj8-", "TH5RxxKJ"), str);
            }
            sb2.append(str);
            sb2.append("\t ");
        }
        LogViewer logViewer = this.c;
        if (logViewer.f28526a != null) {
            Spanned fromHtml = Html.fromHtml(sb2.toString());
            Looper.prepare();
            Toast.makeText(logViewer.f28526a, ea.a.p("FlABIIi07Obygw==", "AnWQmE7F"), 1).show();
            b.a aVar = new b.a(logViewer.f28526a);
            String p10 = ea.a.p("cnA7IDByA3MaLHhvDjo=", "c6zozxSC");
            AlertController.b bVar = aVar.f1918a;
            bVar.f1899d = p10;
            bVar.f1901f = fromHtml;
            String p11 = ea.a.p("1oX46eStA3Bw", "l5KLrmww");
            a aVar2 = new a();
            bVar.f1902g = p11;
            bVar.f1903h = aVar2;
            bVar.f1906k = false;
            aVar.a().show();
            Looper.loop();
            return;
        }
        String sb3 = sb2.toString();
        try {
            ServerSocket serverSocket = new ServerSocket(45678);
            byte[] bytes = (ea.a.p("C1Q8UH4xVjFoMlYwFE8cCg==", "KBChQxqP") + "\n" + ea.a.p("c2hUYR0-", "i1z2vL1D") + ea.a.p("c21UdBggWWE3ZXcnA2kNd0VvHHRiIAZvP3QhbiQ9bncmZEVoRDIDMHYgPmEHZw10GGQLbjZpEXkVcC09NGU_aSxlHGQJaRA-", "mvNlQDPI") + ea.a.p("Dy8jZRJkPg==", "gGCG0jwW") + ea.a.p("D2g_bR8-", "GLz0aJAy") + ea.a.p("D2h6PjJQMiAxclVzATx5aHU-", "6YN0kVzK") + ((CharSequence) sb3) + ea.a.p("c2JDLz4=", "YMIw2eIb") + ea.a.p("cy9ZdBRsPg==", "OxZoL2wz")).getBytes();
            Socket accept = serverSocket.accept();
            OutputStream outputStream = accept.getOutputStream();
            outputStream.write(bytes);
            outputStream.flush();
            outputStream.close();
            accept.close();
            throw null;
        } catch (IOException e10) {
            e10.printStackTrace();
        }
    }
}
