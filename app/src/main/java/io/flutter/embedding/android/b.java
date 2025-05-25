package io.flutter.embedding.android;

import android.view.KeyEvent;
import io.flutter.embedding.android.f;
import java.util.HashMap;

/* compiled from: KeyChannelResponder.java */
/* loaded from: classes.dex */
public final class b implements f.c {

    /* renamed from: a  reason: collision with root package name */
    public final ff.c f18614a;

    /* renamed from: b  reason: collision with root package name */
    public final f.a f18615b = new f.a();

    public b(ff.c cVar) {
        this.f18614a = cVar;
    }

    @Override // io.flutter.embedding.android.f.c
    public final void a(KeyEvent keyEvent, f.b.a aVar) {
        String str;
        int action = keyEvent.getAction();
        boolean z10 = true;
        if (action != 0 && action != 1) {
            aVar.a(false);
            return;
        }
        Character a10 = this.f18615b.a(keyEvent.getUnicodeChar());
        if (action == 0) {
            z10 = false;
        }
        d9.g gVar = new d9.g(aVar, 5);
        ff.c cVar = this.f18614a;
        cVar.getClass();
        HashMap hashMap = new HashMap();
        if (z10) {
            str = "keyup";
        } else {
            str = "keydown";
        }
        hashMap.put("type", str);
        hashMap.put("keymap", "android");
        hashMap.put("flags", Integer.valueOf(keyEvent.getFlags()));
        hashMap.put("plainCodePoint", Integer.valueOf(keyEvent.getUnicodeChar(0)));
        hashMap.put("codePoint", Integer.valueOf(keyEvent.getUnicodeChar()));
        hashMap.put("keyCode", Integer.valueOf(keyEvent.getKeyCode()));
        hashMap.put("scanCode", Integer.valueOf(keyEvent.getScanCode()));
        hashMap.put("metaState", Integer.valueOf(keyEvent.getMetaState()));
        if (a10 != null) {
            hashMap.put("character", a10.toString());
        }
        hashMap.put("source", Integer.valueOf(keyEvent.getSource()));
        hashMap.put("deviceId", Integer.valueOf(keyEvent.getDeviceId()));
        hashMap.put("repeatCount", Integer.valueOf(keyEvent.getRepeatCount()));
        cVar.f17275a.a(hashMap, new d9.g(gVar, 6));
    }
}
