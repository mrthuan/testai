package com.google.android.play.core.assetpacks;

import android.app.Activity;
import androidx.appcompat.libconvert.helper.NativeSoLoaderHelper;
import com.google.android.gms.tasks.Task;
import java.util.List;

/* compiled from: com.google.android.play:asset-delivery@@2.2.2 */
/* loaded from: classes2.dex */
public interface b {
    Task<d> a(List<String> list);

    Task<d> b(List<String> list);

    d8.o c(Activity activity);

    h0 d(String str);

    void e(NativeSoLoaderHelper.Companion.a aVar);

    d8.o f(String str);
}
