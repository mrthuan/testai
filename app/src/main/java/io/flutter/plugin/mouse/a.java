package io.flutter.plugin.mouse;

import android.annotation.TargetApi;
import android.view.PointerIcon;
import com.adjust.sdk.network.ErrorCodes;
import com.inmobi.media.C1646h;
import ff.e;
import java.util.HashMap;

/* compiled from: MouseCursorPlugin.java */
@TargetApi(24)
/* loaded from: classes.dex */
public final class a {

    /* renamed from: b  reason: collision with root package name */
    public static HashMap<String, Integer> f18781b;

    /* renamed from: a  reason: collision with root package name */
    public final b f18782a;

    /* compiled from: MouseCursorPlugin.java */
    /* renamed from: io.flutter.plugin.mouse.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0252a implements e.b {
        public C0252a() {
        }

        public final void a(String str) {
            Object orDefault;
            final a aVar = a.this;
            b bVar = aVar.f18782a;
            if (a.f18781b == null) {
                a.f18781b = new HashMap<String, Integer>() { // from class: io.flutter.plugin.mouse.MouseCursorPlugin$2
                    private static final long serialVersionUID = 1;

                    {
                        put("alias", 1010);
                        put("allScroll", 1013);
                        put("basic", 1000);
                        put("cell", Integer.valueOf((int) ErrorCodes.SSL_HANDSHAKE_EXCEPTION));
                        put(C1646h.CLICK_BEACON, 1002);
                        put("contextMenu", 1001);
                        put("copy", 1011);
                        put("forbidden", 1012);
                        put("grab", 1020);
                        put("grabbing", 1021);
                        put("help", Integer.valueOf((int) ErrorCodes.MALFORMED_URL_EXCEPTION));
                        put("move", 1013);
                        put("none", 0);
                        put("noDrop", 1012);
                        put("precise", Integer.valueOf((int) ErrorCodes.IO_EXCEPTION));
                        put("text", 1008);
                        put("resizeColumn", 1014);
                        put("resizeDown", 1015);
                        put("resizeUpLeft", 1016);
                        put("resizeDownRight", 1017);
                        put("resizeLeft", 1014);
                        put("resizeLeftRight", 1014);
                        put("resizeRight", 1014);
                        put("resizeRow", 1015);
                        put("resizeUp", 1015);
                        put("resizeUpDown", 1015);
                        put("resizeUpLeft", 1017);
                        put("resizeUpRight", 1016);
                        put("resizeUpLeftDownRight", 1017);
                        put("resizeUpRightDownLeft", 1016);
                        put("verticalText", 1009);
                        put("wait", Integer.valueOf((int) ErrorCodes.PROTOCOL_EXCEPTION));
                        put("zoomIn", 1018);
                        put("zoomOut", 1019);
                    }
                };
            }
            orDefault = a.f18781b.getOrDefault(str, 1000);
            bVar.setPointerIcon(aVar.f18782a.c(((Integer) orDefault).intValue()));
        }
    }

    /* compiled from: MouseCursorPlugin.java */
    /* loaded from: classes.dex */
    public interface b {
        PointerIcon c(int i10);

        void setPointerIcon(PointerIcon pointerIcon);
    }

    public a(b bVar, e eVar) {
        this.f18782a = bVar;
        eVar.f17279a = new C0252a();
    }
}
