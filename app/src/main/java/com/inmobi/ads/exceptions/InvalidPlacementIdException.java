package com.inmobi.ads.exceptions;

import androidx.annotation.Keep;

@Keep
/* loaded from: classes2.dex */
public final class InvalidPlacementIdException extends IllegalArgumentException {
    public InvalidPlacementIdException() {
        super("AdPlacement id value is not supplied in XML layout. Banner creation failed.");
    }
}
