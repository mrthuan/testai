package ob;

import android.os.Trace;
import com.google.firebase.components.ComponentRegistrar;
import ga.e;
import ga.f;
import ga.r;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ComponentMonitor.java */
/* loaded from: classes2.dex */
public final class b implements f {
    @Override // ga.f
    public final List<ga.b<?>> a(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (final ga.b<?> bVar : componentRegistrar.getComponents()) {
            final String str = bVar.f17703a;
            if (str != null) {
                bVar = new ga.b<>(str, bVar.f17704b, bVar.c, bVar.f17705d, bVar.f17706e, new e() { // from class: ob.a
                    @Override // ga.e
                    public final Object a(r rVar) {
                        String str2 = str;
                        ga.b bVar2 = bVar;
                        try {
                            Trace.beginSection(str2);
                            return bVar2.f17707f.a(rVar);
                        } finally {
                            Trace.endSection();
                        }
                    }
                }, bVar.f17708g);
            }
            arrayList.add(bVar);
        }
        return arrayList;
    }
}
