package com.google.android.gms.common.sqlite;

import android.database.CrossProcessCursor;
import android.database.Cursor;
import android.database.CursorWindow;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
@KeepForSdk
/* loaded from: classes.dex */
public class CursorWrapper extends android.database.CursorWrapper implements CrossProcessCursor {
    @Override // android.database.CrossProcessCursor
    @KeepForSdk
    public final void fillWindow(int i10, CursorWindow cursorWindow) {
        throw null;
    }

    @Override // android.database.CrossProcessCursor
    @ResultIgnorabilityUnspecified
    @KeepForSdk
    public final CursorWindow getWindow() {
        throw null;
    }

    @Override // android.database.CursorWrapper
    public final /* synthetic */ Cursor getWrappedCursor() {
        return null;
    }

    @Override // android.database.CrossProcessCursor
    @ResultIgnorabilityUnspecified
    public final boolean onMove(int i10, int i11) {
        throw null;
    }
}
