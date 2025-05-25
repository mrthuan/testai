package pdf.pdfreader.viewer.editor.free;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.c;
import java.util.HashSet;
import pdf.pdfreader.viewer.editor.free.ui.act.SettingsActivity;
import pdf.pdfreader.viewer.editor.free.utils.g0;
import pdf.pdfreader.viewer.editor.free.utils.i;
import pdf.pdfreader.viewer.editor.free.utils.n0;

/* loaded from: classes3.dex */
public class ReaderMainLaunchActivity extends c {
    @Override // androidx.fragment.app.u, androidx.activity.ComponentActivity, k0.j, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        HashSet hashSet = g0.f28699a;
        String str = n0.f28727a;
        i.a();
        Intent intent = new Intent(this, SettingsActivity.class);
        Intent intent2 = getIntent();
        if (intent2 != null) {
            String action = intent2.getAction();
            String type = intent2.getType();
            if (action != null && type != null) {
                intent.setAction(action);
                intent.setType(type);
            }
        }
        intent.putExtra(ea.a.p("X3MDZQl0WHJ0", "Of6Qz9zE"), true);
        startActivity(intent);
        finish();
    }
}
