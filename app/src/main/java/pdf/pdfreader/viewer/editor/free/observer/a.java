package pdf.pdfreader.viewer.editor.free.observer;

import android.os.FileObserver;
import android.os.SystemClock;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import kotlin.jvm.internal.g;
import lib.zj.office.fc.openxml4j.opc.PackagingURIHelper;
import pdf.pdfreader.viewer.editor.free.observer.StorageFileObserver;
import pdf.pdfreader.viewer.editor.free.observer.a;
import tf.c;
import zn.b;

/* compiled from: RecursiveFileObserver.kt */
/* loaded from: classes3.dex */
public final class a extends FileObserver {

    /* renamed from: a  reason: collision with root package name */
    public final b f25910a;

    /* renamed from: b  reason: collision with root package name */
    public final String f25911b;
    public final int c;

    /* renamed from: d  reason: collision with root package name */
    public final c f25912d;

    /* compiled from: RecursiveFileObserver.kt */
    /* renamed from: pdf.pdfreader.viewer.editor.free.observer.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public final class FileObserverC0348a extends FileObserver {

        /* renamed from: a  reason: collision with root package name */
        public final String f25913a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ a f25914b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FileObserverC0348a(a aVar, String str, int i10) {
            super(str, i10);
            ea.a.p("Q2E_aA==", "zVs1oc0b");
            this.f25914b = aVar;
            this.f25913a = str;
        }

        @Override // android.os.FileObserver
        public final void onEvent(int i10, String str) {
            if (str == null) {
                return;
            }
            this.f25914b.onEvent(i10, this.f25913a + PackagingURIHelper.FORWARD_SLASH_STRING + str);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(String str, StorageFileObserver.a aVar) {
        super(str, 4095);
        ea.a.p("Q2E_aA==", "hq4OaUgB");
        ea.a.p("VWknZTZ2B250", "c090vJye");
        ea.a.p("Q2E_aA==", "lcJIO4o5");
        this.f25912d = kotlin.a.a(new cg.a<List<FileObserverC0348a>>() { // from class: pdf.pdfreader.viewer.editor.free.observer.RecursiveFileObserver$observers$2
            @Override // cg.a
            public final List<a.FileObserverC0348a> invoke() {
                return new ArrayList();
            }
        });
        this.f25911b = str;
        this.c = 4095;
        this.f25910a = aVar;
    }

    @Override // android.os.FileObserver
    public final void onEvent(int i10, String str) {
        b bVar;
        if (str != null && (bVar = this.f25910a) != null) {
            bVar.a(i10, str);
        }
    }

    @Override // android.os.FileObserver
    public final void startWatching() {
        SystemClock.elapsedRealtime();
        try {
            Stack stack = new Stack();
            stack.push(this.f25911b);
            while (!stack.empty()) {
                c cVar = this.f25912d;
                if (((List) cVar.getValue()).size() < 8000) {
                    String str = (String) stack.pop();
                    if (str != null) {
                        File file = new File(str);
                        if (file.exists() && file.isDirectory() && !g.a(file.getName(), ea.a.p("Lg==", "un7DAkvi")) && !g.a(file.getName(), ea.a.p("HS4=", "Zc1pU5wM"))) {
                            FileObserverC0348a fileObserverC0348a = new FileObserverC0348a(this, str, this.c);
                            fileObserverC0348a.startWatching();
                            ((List) cVar.getValue()).add(fileObserverC0348a);
                            File[] listFiles = file.listFiles(new zn.c());
                            if (listFiles != null) {
                                for (File file2 : listFiles) {
                                    if (file2.isDirectory() && !g.a(file2.getName(), ea.a.p("Lg==", "izR13BKd")) && !g.a(file2.getName(), ea.a.p("YS4=", "mZBl6is4"))) {
                                        stack.push(file2.getAbsolutePath());
                                    }
                                }
                            }
                        }
                    }
                } else {
                    return;
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    @Override // android.os.FileObserver
    public final void stopWatching() {
        SystemClock.elapsedRealtime();
        c cVar = this.f25912d;
        for (FileObserverC0348a fileObserverC0348a : (List) cVar.getValue()) {
            fileObserverC0348a.stopWatching();
        }
        ((List) cVar.getValue()).clear();
    }
}
